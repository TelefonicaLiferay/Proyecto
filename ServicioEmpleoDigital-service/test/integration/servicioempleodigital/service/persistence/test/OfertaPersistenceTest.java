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

import servicioempleodigital.exception.NoSuchOfertaException;

import servicioempleodigital.model.Oferta;

import servicioempleodigital.service.OfertaLocalServiceUtil;

import servicioempleodigital.service.persistence.OfertaPersistence;
import servicioempleodigital.service.persistence.OfertaUtil;

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
public class OfertaPersistenceTest {
	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule = new AggregateTestRule(new LiferayIntegrationTestRule(),
			PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(Propagation.REQUIRED));

	@Before
	public void setUp() {
		_persistence = OfertaUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Oferta> iterator = _ofertas.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Oferta oferta = _persistence.create(pk);

		Assert.assertNotNull(oferta);

		Assert.assertEquals(oferta.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Oferta newOferta = addOferta();

		_persistence.remove(newOferta);

		Oferta existingOferta = _persistence.fetchByPrimaryKey(newOferta.getPrimaryKey());

		Assert.assertNull(existingOferta);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addOferta();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Oferta newOferta = _persistence.create(pk);

		newOferta.setTitulo(RandomTestUtil.randomString());

		newOferta.setDescripcion(RandomTestUtil.randomString());

		newOferta.setProvincia(RandomTestUtil.nextInt());

		newOferta.setCiudad(RandomTestUtil.randomString());

		newOferta.setSalario(RandomTestUtil.randomString());

		newOferta.setFechaInicio(RandomTestUtil.nextDate());

		newOferta.setFechaModificacion(RandomTestUtil.nextDate());

		newOferta.setFechaFin(RandomTestUtil.nextDate());

		newOferta.setPlazas(RandomTestUtil.nextInt());

		newOferta.setCandidatos(RandomTestUtil.nextInt());

		newOferta.setRequisitosMinimos(RandomTestUtil.randomString());

		newOferta.setRequisitosOpcionales(RandomTestUtil.randomString());

		newOferta.setActiva(RandomTestUtil.randomBoolean());

		newOferta.setIdEmpresa(RandomTestUtil.nextLong());

		_ofertas.add(_persistence.update(newOferta));

		Oferta existingOferta = _persistence.findByPrimaryKey(newOferta.getPrimaryKey());

		Assert.assertEquals(existingOferta.getIdOferta(),
			newOferta.getIdOferta());
		Assert.assertEquals(existingOferta.getTitulo(), newOferta.getTitulo());
		Assert.assertEquals(existingOferta.getDescripcion(),
			newOferta.getDescripcion());
		Assert.assertEquals(existingOferta.getProvincia(),
			newOferta.getProvincia());
		Assert.assertEquals(existingOferta.getCiudad(), newOferta.getCiudad());
		Assert.assertEquals(existingOferta.getSalario(), newOferta.getSalario());
		Assert.assertEquals(Time.getShortTimestamp(
				existingOferta.getFechaInicio()),
			Time.getShortTimestamp(newOferta.getFechaInicio()));
		Assert.assertEquals(Time.getShortTimestamp(
				existingOferta.getFechaModificacion()),
			Time.getShortTimestamp(newOferta.getFechaModificacion()));
		Assert.assertEquals(Time.getShortTimestamp(existingOferta.getFechaFin()),
			Time.getShortTimestamp(newOferta.getFechaFin()));
		Assert.assertEquals(existingOferta.getPlazas(), newOferta.getPlazas());
		Assert.assertEquals(existingOferta.getCandidatos(),
			newOferta.getCandidatos());
		Assert.assertEquals(existingOferta.getRequisitosMinimos(),
			newOferta.getRequisitosMinimos());
		Assert.assertEquals(existingOferta.getRequisitosOpcionales(),
			newOferta.getRequisitosOpcionales());
		Assert.assertEquals(existingOferta.getActiva(), newOferta.getActiva());
		Assert.assertEquals(existingOferta.getIdEmpresa(),
			newOferta.getIdEmpresa());
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Oferta newOferta = addOferta();

		Oferta existingOferta = _persistence.findByPrimaryKey(newOferta.getPrimaryKey());

		Assert.assertEquals(existingOferta, newOferta);
	}

	@Test(expected = NoSuchOfertaException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			getOrderByComparator());
	}

	protected OrderByComparator<Oferta> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create("FOO_Oferta", "idOferta",
			true, "titulo", true, "descripcion", true, "provincia", true,
			"ciudad", true, "salario", true, "fechaInicio", true,
			"fechaModificacion", true, "fechaFin", true, "plazas", true,
			"candidatos", true, "requisitosMinimos", true,
			"requisitosOpcionales", true, "activa", true, "idEmpresa", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Oferta newOferta = addOferta();

		Oferta existingOferta = _persistence.fetchByPrimaryKey(newOferta.getPrimaryKey());

		Assert.assertEquals(existingOferta, newOferta);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Oferta missingOferta = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingOferta);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {
		Oferta newOferta1 = addOferta();
		Oferta newOferta2 = addOferta();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newOferta1.getPrimaryKey());
		primaryKeys.add(newOferta2.getPrimaryKey());

		Map<Serializable, Oferta> ofertas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, ofertas.size());
		Assert.assertEquals(newOferta1, ofertas.get(newOferta1.getPrimaryKey()));
		Assert.assertEquals(newOferta2, ofertas.get(newOferta2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {
		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Oferta> ofertas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(ofertas.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {
		Oferta newOferta = addOferta();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newOferta.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Oferta> ofertas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, ofertas.size());
		Assert.assertEquals(newOferta, ofertas.get(newOferta.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys()
		throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Oferta> ofertas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(ofertas.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey()
		throws Exception {
		Oferta newOferta = addOferta();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newOferta.getPrimaryKey());

		Map<Serializable, Oferta> ofertas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, ofertas.size());
		Assert.assertEquals(newOferta, ofertas.get(newOferta.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery = OfertaLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<Oferta>() {
				@Override
				public void performAction(Oferta oferta) {
					Assert.assertNotNull(oferta);

					count.increment();
				}
			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting()
		throws Exception {
		Oferta newOferta = addOferta();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Oferta.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("idOferta",
				newOferta.getIdOferta()));

		List<Oferta> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Oferta existingOferta = result.get(0);

		Assert.assertEquals(existingOferta, newOferta);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Oferta.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("idOferta",
				RandomTestUtil.nextLong()));

		List<Oferta> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting()
		throws Exception {
		Oferta newOferta = addOferta();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Oferta.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("idOferta"));

		Object newIdOferta = newOferta.getIdOferta();

		dynamicQuery.add(RestrictionsFactoryUtil.in("idOferta",
				new Object[] { newIdOferta }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingIdOferta = result.get(0);

		Assert.assertEquals(existingIdOferta, newIdOferta);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Oferta.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("idOferta"));

		dynamicQuery.add(RestrictionsFactoryUtil.in("idOferta",
				new Object[] { RandomTestUtil.nextLong() }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected Oferta addOferta() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Oferta oferta = _persistence.create(pk);

		oferta.setTitulo(RandomTestUtil.randomString());

		oferta.setDescripcion(RandomTestUtil.randomString());

		oferta.setProvincia(RandomTestUtil.nextInt());

		oferta.setCiudad(RandomTestUtil.randomString());

		oferta.setSalario(RandomTestUtil.randomString());

		oferta.setFechaInicio(RandomTestUtil.nextDate());

		oferta.setFechaModificacion(RandomTestUtil.nextDate());

		oferta.setFechaFin(RandomTestUtil.nextDate());

		oferta.setPlazas(RandomTestUtil.nextInt());

		oferta.setCandidatos(RandomTestUtil.nextInt());

		oferta.setRequisitosMinimos(RandomTestUtil.randomString());

		oferta.setRequisitosOpcionales(RandomTestUtil.randomString());

		oferta.setActiva(RandomTestUtil.randomBoolean());

		oferta.setIdEmpresa(RandomTestUtil.nextLong());

		_ofertas.add(_persistence.update(oferta));

		return oferta;
	}

	private List<Oferta> _ofertas = new ArrayList<Oferta>();
	private OfertaPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;
}