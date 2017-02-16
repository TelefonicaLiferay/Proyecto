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
import com.liferay.portal.kernel.util.Time;
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

import servicioempleodigital.exception.NoSuchCandidatoException;

import servicioempleodigital.model.Candidato;

import servicioempleodigital.service.CandidatoLocalServiceUtil;

import servicioempleodigital.service.persistence.CandidatoPersistence;
import servicioempleodigital.service.persistence.CandidatoUtil;

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
public class CandidatoPersistenceTest {
	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule = new AggregateTestRule(new LiferayIntegrationTestRule(),
			PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(Propagation.REQUIRED));

	@Before
	public void setUp() {
		_persistence = CandidatoUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Candidato> iterator = _candidatos.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Candidato candidato = _persistence.create(pk);

		Assert.assertNotNull(candidato);

		Assert.assertEquals(candidato.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Candidato newCandidato = addCandidato();

		_persistence.remove(newCandidato);

		Candidato existingCandidato = _persistence.fetchByPrimaryKey(newCandidato.getPrimaryKey());

		Assert.assertNull(existingCandidato);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addCandidato();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Candidato newCandidato = _persistence.create(pk);

		newCandidato.setNif(RandomTestUtil.randomString());

		newCandidato.setNombre(RandomTestUtil.randomString());

		newCandidato.setApellidos(RandomTestUtil.randomString());

		newCandidato.setFechaDeNacimiento(RandomTestUtil.nextDate());

		newCandidato.setEmail(RandomTestUtil.randomString());

		newCandidato.setTelefono(RandomTestUtil.randomString());

		newCandidato.setPassword(RandomTestUtil.randomString());

		newCandidato.setProvincia(RandomTestUtil.nextInt());

		newCandidato.setCiudad(RandomTestUtil.randomString());

		_candidatos.add(_persistence.update(newCandidato));

		Candidato existingCandidato = _persistence.findByPrimaryKey(newCandidato.getPrimaryKey());

		Assert.assertEquals(existingCandidato.getIdCandidato(),
			newCandidato.getIdCandidato());
		Assert.assertEquals(existingCandidato.getNif(), newCandidato.getNif());
		Assert.assertEquals(existingCandidato.getNombre(),
			newCandidato.getNombre());
		Assert.assertEquals(existingCandidato.getApellidos(),
			newCandidato.getApellidos());
		Assert.assertEquals(Time.getShortTimestamp(
				existingCandidato.getFechaDeNacimiento()),
			Time.getShortTimestamp(newCandidato.getFechaDeNacimiento()));
		Assert.assertEquals(existingCandidato.getEmail(),
			newCandidato.getEmail());
		Assert.assertEquals(existingCandidato.getTelefono(),
			newCandidato.getTelefono());
		Assert.assertEquals(existingCandidato.getPassword(),
			newCandidato.getPassword());
		Assert.assertEquals(existingCandidato.getProvincia(),
			newCandidato.getProvincia());
		Assert.assertEquals(existingCandidato.getCiudad(),
			newCandidato.getCiudad());
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Candidato newCandidato = addCandidato();

		Candidato existingCandidato = _persistence.findByPrimaryKey(newCandidato.getPrimaryKey());

		Assert.assertEquals(existingCandidato, newCandidato);
	}

	@Test(expected = NoSuchCandidatoException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			getOrderByComparator());
	}

	protected OrderByComparator<Candidato> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create("FOO_Candidato",
			"idCandidato", true, "nif", true, "nombre", true, "apellidos",
			true, "fechaDeNacimiento", true, "email", true, "telefono", true,
			"password", true, "provincia", true, "ciudad", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Candidato newCandidato = addCandidato();

		Candidato existingCandidato = _persistence.fetchByPrimaryKey(newCandidato.getPrimaryKey());

		Assert.assertEquals(existingCandidato, newCandidato);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Candidato missingCandidato = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingCandidato);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {
		Candidato newCandidato1 = addCandidato();
		Candidato newCandidato2 = addCandidato();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newCandidato1.getPrimaryKey());
		primaryKeys.add(newCandidato2.getPrimaryKey());

		Map<Serializable, Candidato> candidatos = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, candidatos.size());
		Assert.assertEquals(newCandidato1,
			candidatos.get(newCandidato1.getPrimaryKey()));
		Assert.assertEquals(newCandidato2,
			candidatos.get(newCandidato2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {
		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Candidato> candidatos = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(candidatos.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {
		Candidato newCandidato = addCandidato();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newCandidato.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Candidato> candidatos = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, candidatos.size());
		Assert.assertEquals(newCandidato,
			candidatos.get(newCandidato.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys()
		throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Candidato> candidatos = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(candidatos.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey()
		throws Exception {
		Candidato newCandidato = addCandidato();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newCandidato.getPrimaryKey());

		Map<Serializable, Candidato> candidatos = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, candidatos.size());
		Assert.assertEquals(newCandidato,
			candidatos.get(newCandidato.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery = CandidatoLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<Candidato>() {
				@Override
				public void performAction(Candidato candidato) {
					Assert.assertNotNull(candidato);

					count.increment();
				}
			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting()
		throws Exception {
		Candidato newCandidato = addCandidato();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Candidato.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("idCandidato",
				newCandidato.getIdCandidato()));

		List<Candidato> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Candidato existingCandidato = result.get(0);

		Assert.assertEquals(existingCandidato, newCandidato);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Candidato.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("idCandidato",
				RandomTestUtil.nextLong()));

		List<Candidato> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting()
		throws Exception {
		Candidato newCandidato = addCandidato();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Candidato.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("idCandidato"));

		Object newIdCandidato = newCandidato.getIdCandidato();

		dynamicQuery.add(RestrictionsFactoryUtil.in("idCandidato",
				new Object[] { newIdCandidato }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingIdCandidato = result.get(0);

		Assert.assertEquals(existingIdCandidato, newIdCandidato);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Candidato.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("idCandidato"));

		dynamicQuery.add(RestrictionsFactoryUtil.in("idCandidato",
				new Object[] { RandomTestUtil.nextLong() }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected Candidato addCandidato() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Candidato candidato = _persistence.create(pk);

		candidato.setNif(RandomTestUtil.randomString());

		candidato.setNombre(RandomTestUtil.randomString());

		candidato.setApellidos(RandomTestUtil.randomString());

		candidato.setFechaDeNacimiento(RandomTestUtil.nextDate());

		candidato.setEmail(RandomTestUtil.randomString());

		candidato.setTelefono(RandomTestUtil.randomString());

		candidato.setPassword(RandomTestUtil.randomString());

		candidato.setProvincia(RandomTestUtil.nextInt());

		candidato.setCiudad(RandomTestUtil.randomString());

		_candidatos.add(_persistence.update(candidato));

		return candidato;
	}

	private List<Candidato> _candidatos = new ArrayList<Candidato>();
	private CandidatoPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;
}