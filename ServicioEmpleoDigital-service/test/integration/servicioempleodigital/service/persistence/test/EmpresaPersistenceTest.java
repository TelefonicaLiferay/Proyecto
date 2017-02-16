/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package servicioempleodigital.service.persistence.test;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.PersistenceTestRule;
import com.liferay.portal.test.rule.TransactionalTestRule;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

import org.junit.runner.RunWith;

import servicioempleodigital.exception.NoSuchEmpresaException;

import servicioempleodigital.model.Empresa;

import servicioempleodigital.service.EmpresaLocalServiceUtil;

import servicioempleodigital.service.persistence.EmpresaPersistence;
import servicioempleodigital.service.persistence.EmpresaUtil;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @generated
 */
@RunWith(Arquillian.class)
public class EmpresaPersistenceTest {
	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule = new AggregateTestRule(new LiferayIntegrationTestRule(),
			PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(Propagation.REQUIRED));

	@Before
	public void setUp() {
		_persistence = EmpresaUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Empresa> iterator = _empresas.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Empresa empresa = _persistence.create(pk);

		Assert.assertNotNull(empresa);

		Assert.assertEquals(empresa.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Empresa newEmpresa = addEmpresa();

		_persistence.remove(newEmpresa);

		Empresa existingEmpresa = _persistence.fetchByPrimaryKey(newEmpresa.getPrimaryKey());

		Assert.assertNull(existingEmpresa);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addEmpresa();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Empresa newEmpresa = _persistence.create(pk);

		newEmpresa.setCif(RandomTestUtil.randomString());

		newEmpresa.setRazonSocial(RandomTestUtil.randomString());

		newEmpresa.setTelefono(RandomTestUtil.randomString());

		newEmpresa.setEmail(RandomTestUtil.randomString());

		newEmpresa.setWeb(RandomTestUtil.randomString());

		newEmpresa.setPassword(RandomTestUtil.randomString());

		newEmpresa.setProvincia(RandomTestUtil.nextInt());

		newEmpresa.setCiudad(RandomTestUtil.randomString());

		newEmpresa.setTrabajadores(RandomTestUtil.nextInt());

		_empresas.add(_persistence.update(newEmpresa));

		Empresa existingEmpresa = _persistence.findByPrimaryKey(newEmpresa.getPrimaryKey());

		Assert.assertEquals(existingEmpresa.getIdEmpresa(),
			newEmpresa.getIdEmpresa());
		Assert.assertEquals(existingEmpresa.getCif(), newEmpresa.getCif());
		Assert.assertEquals(existingEmpresa.getRazonSocial(),
			newEmpresa.getRazonSocial());
		Assert.assertEquals(existingEmpresa.getTelefono(),
			newEmpresa.getTelefono());
		Assert.assertEquals(existingEmpresa.getEmail(), newEmpresa.getEmail());
		Assert.assertEquals(existingEmpresa.getWeb(), newEmpresa.getWeb());
		Assert.assertEquals(existingEmpresa.getPassword(),
			newEmpresa.getPassword());
		Assert.assertEquals(existingEmpresa.getProvincia(),
			newEmpresa.getProvincia());
		Assert.assertEquals(existingEmpresa.getCiudad(), newEmpresa.getCiudad());
		Assert.assertEquals(existingEmpresa.getTrabajadores(),
			newEmpresa.getTrabajadores());
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Empresa newEmpresa = addEmpresa();

		Empresa existingEmpresa = _persistence.findByPrimaryKey(newEmpresa.getPrimaryKey());

		Assert.assertEquals(existingEmpresa, newEmpresa);
	}

	@Test(expected = NoSuchEmpresaException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			getOrderByComparator());
	}

	protected OrderByComparator<Empresa> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create("FOO_Empresa", "idEmpresa",
			true, "cif", true, "razonSocial", true, "telefono", true, "email",
			true, "web", true, "password", true, "provincia", true, "ciudad",
			true, "trabajadores", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Empresa newEmpresa = addEmpresa();

		Empresa existingEmpresa = _persistence.fetchByPrimaryKey(newEmpresa.getPrimaryKey());

		Assert.assertEquals(existingEmpresa, newEmpresa);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Empresa missingEmpresa = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingEmpresa);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {
		Empresa newEmpresa1 = addEmpresa();
		Empresa newEmpresa2 = addEmpresa();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEmpresa1.getPrimaryKey());
		primaryKeys.add(newEmpresa2.getPrimaryKey());

		Map<Serializable, Empresa> empresas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, empresas.size());
		Assert.assertEquals(newEmpresa1,
			empresas.get(newEmpresa1.getPrimaryKey()));
		Assert.assertEquals(newEmpresa2,
			empresas.get(newEmpresa2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {
		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Empresa> empresas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(empresas.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {
		Empresa newEmpresa = addEmpresa();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEmpresa.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Empresa> empresas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, empresas.size());
		Assert.assertEquals(newEmpresa, empresas.get(newEmpresa.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys()
		throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Empresa> empresas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(empresas.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey()
		throws Exception {
		Empresa newEmpresa = addEmpresa();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newEmpresa.getPrimaryKey());

		Map<Serializable, Empresa> empresas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, empresas.size());
		Assert.assertEquals(newEmpresa, empresas.get(newEmpresa.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery = EmpresaLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<Empresa>() {
				@Override
				public void performAction(Empresa empresa) {
					Assert.assertNotNull(empresa);

					count.increment();
				}
			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting()
		throws Exception {
		Empresa newEmpresa = addEmpresa();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Empresa.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("idEmpresa",
				newEmpresa.getIdEmpresa()));

		List<Empresa> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Empresa existingEmpresa = result.get(0);

		Assert.assertEquals(existingEmpresa, newEmpresa);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Empresa.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("idEmpresa",
				RandomTestUtil.nextLong()));

		List<Empresa> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting()
		throws Exception {
		Empresa newEmpresa = addEmpresa();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Empresa.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("idEmpresa"));

		Object newIdEmpresa = newEmpresa.getIdEmpresa();

		dynamicQuery.add(RestrictionsFactoryUtil.in("idEmpresa",
				new Object[] { newIdEmpresa }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingIdEmpresa = result.get(0);

		Assert.assertEquals(existingIdEmpresa, newIdEmpresa);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Empresa.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("idEmpresa"));

		dynamicQuery.add(RestrictionsFactoryUtil.in("idEmpresa",
				new Object[] { RandomTestUtil.nextLong() }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected Empresa addEmpresa() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Empresa empresa = _persistence.create(pk);

		empresa.setCif(RandomTestUtil.randomString());

		empresa.setRazonSocial(RandomTestUtil.randomString());

		empresa.setTelefono(RandomTestUtil.randomString());

		empresa.setEmail(RandomTestUtil.randomString());

		empresa.setWeb(RandomTestUtil.randomString());

		empresa.setPassword(RandomTestUtil.randomString());

		empresa.setProvincia(RandomTestUtil.nextInt());

		empresa.setCiudad(RandomTestUtil.randomString());

		empresa.setTrabajadores(RandomTestUtil.nextInt());

		_empresas.add(_persistence.update(empresa));

		return empresa;
	}

	private List<Empresa> _empresas = new ArrayList<Empresa>();
	private EmpresaPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;
}