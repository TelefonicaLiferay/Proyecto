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
import com.liferay.portal.kernel.test.AssertUtils;
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

import servicioempleodigital.exception.NoSuchRespuestaException;

import servicioempleodigital.model.Respuesta;

import servicioempleodigital.service.RespuestaLocalServiceUtil;

import servicioempleodigital.service.persistence.RespuestaPersistence;
import servicioempleodigital.service.persistence.RespuestaUtil;

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
public class RespuestaPersistenceTest {
	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule = new AggregateTestRule(new LiferayIntegrationTestRule(),
			PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(Propagation.REQUIRED));

	@Before
	public void setUp() {
		_persistence = RespuestaUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Respuesta> iterator = _respuestas.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Respuesta respuesta = _persistence.create(pk);

		Assert.assertNotNull(respuesta);

		Assert.assertEquals(respuesta.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Respuesta newRespuesta = addRespuesta();

		_persistence.remove(newRespuesta);

		Respuesta existingRespuesta = _persistence.fetchByPrimaryKey(newRespuesta.getPrimaryKey());

		Assert.assertNull(existingRespuesta);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addRespuesta();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Respuesta newRespuesta = _persistence.create(pk);

		newRespuesta.setRespuesta(RandomTestUtil.randomString());

		newRespuesta.setValor(RandomTestUtil.nextDouble());

		newRespuesta.setIdPregunta(RandomTestUtil.nextLong());

		_respuestas.add(_persistence.update(newRespuesta));

		Respuesta existingRespuesta = _persistence.findByPrimaryKey(newRespuesta.getPrimaryKey());

		Assert.assertEquals(existingRespuesta.getIdRespuesta(),
			newRespuesta.getIdRespuesta());
		Assert.assertEquals(existingRespuesta.getRespuesta(),
			newRespuesta.getRespuesta());
		AssertUtils.assertEquals(existingRespuesta.getValor(),
			newRespuesta.getValor());
		Assert.assertEquals(existingRespuesta.getIdPregunta(),
			newRespuesta.getIdPregunta());
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Respuesta newRespuesta = addRespuesta();

		Respuesta existingRespuesta = _persistence.findByPrimaryKey(newRespuesta.getPrimaryKey());

		Assert.assertEquals(existingRespuesta, newRespuesta);
	}

	@Test(expected = NoSuchRespuestaException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			getOrderByComparator());
	}

	protected OrderByComparator<Respuesta> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create("FOO_Respuesta",
			"idRespuesta", true, "respuesta", true, "valor", true,
			"idPregunta", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Respuesta newRespuesta = addRespuesta();

		Respuesta existingRespuesta = _persistence.fetchByPrimaryKey(newRespuesta.getPrimaryKey());

		Assert.assertEquals(existingRespuesta, newRespuesta);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Respuesta missingRespuesta = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingRespuesta);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {
		Respuesta newRespuesta1 = addRespuesta();
		Respuesta newRespuesta2 = addRespuesta();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newRespuesta1.getPrimaryKey());
		primaryKeys.add(newRespuesta2.getPrimaryKey());

		Map<Serializable, Respuesta> respuestas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, respuestas.size());
		Assert.assertEquals(newRespuesta1,
			respuestas.get(newRespuesta1.getPrimaryKey()));
		Assert.assertEquals(newRespuesta2,
			respuestas.get(newRespuesta2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {
		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Respuesta> respuestas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(respuestas.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {
		Respuesta newRespuesta = addRespuesta();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newRespuesta.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Respuesta> respuestas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, respuestas.size());
		Assert.assertEquals(newRespuesta,
			respuestas.get(newRespuesta.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys()
		throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Respuesta> respuestas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(respuestas.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey()
		throws Exception {
		Respuesta newRespuesta = addRespuesta();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newRespuesta.getPrimaryKey());

		Map<Serializable, Respuesta> respuestas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, respuestas.size());
		Assert.assertEquals(newRespuesta,
			respuestas.get(newRespuesta.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery = RespuestaLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<Respuesta>() {
				@Override
				public void performAction(Respuesta respuesta) {
					Assert.assertNotNull(respuesta);

					count.increment();
				}
			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting()
		throws Exception {
		Respuesta newRespuesta = addRespuesta();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Respuesta.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("idRespuesta",
				newRespuesta.getIdRespuesta()));

		List<Respuesta> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Respuesta existingRespuesta = result.get(0);

		Assert.assertEquals(existingRespuesta, newRespuesta);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Respuesta.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("idRespuesta",
				RandomTestUtil.nextLong()));

		List<Respuesta> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting()
		throws Exception {
		Respuesta newRespuesta = addRespuesta();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Respuesta.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("idRespuesta"));

		Object newIdRespuesta = newRespuesta.getIdRespuesta();

		dynamicQuery.add(RestrictionsFactoryUtil.in("idRespuesta",
				new Object[] { newIdRespuesta }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingIdRespuesta = result.get(0);

		Assert.assertEquals(existingIdRespuesta, newIdRespuesta);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Respuesta.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("idRespuesta"));

		dynamicQuery.add(RestrictionsFactoryUtil.in("idRespuesta",
				new Object[] { RandomTestUtil.nextLong() }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected Respuesta addRespuesta() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Respuesta respuesta = _persistence.create(pk);

		respuesta.setRespuesta(RandomTestUtil.randomString());

		respuesta.setValor(RandomTestUtil.nextDouble());

		respuesta.setIdPregunta(RandomTestUtil.nextLong());

		_respuestas.add(_persistence.update(respuesta));

		return respuesta;
	}

	private List<Respuesta> _respuestas = new ArrayList<Respuesta>();
	private RespuestaPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;
}