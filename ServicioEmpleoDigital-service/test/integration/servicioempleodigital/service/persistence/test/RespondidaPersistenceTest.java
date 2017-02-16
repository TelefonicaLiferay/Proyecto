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
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.util.IntegerWrapper;
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

import servicioempleodigital.exception.NoSuchRespondidaException;

import servicioempleodigital.model.Respondida;

import servicioempleodigital.service.RespondidaLocalServiceUtil;

import servicioempleodigital.service.persistence.RespondidaPK;
import servicioempleodigital.service.persistence.RespondidaPersistence;
import servicioempleodigital.service.persistence.RespondidaUtil;

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
public class RespondidaPersistenceTest {
	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule = new AggregateTestRule(new LiferayIntegrationTestRule(),
			PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(Propagation.REQUIRED));

	@Before
	public void setUp() {
		_persistence = RespondidaUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Respondida> iterator = _respondidas.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		RespondidaPK pk = new RespondidaPK(RandomTestUtil.nextLong(),
				RandomTestUtil.nextLong());

		Respondida respondida = _persistence.create(pk);

		Assert.assertNotNull(respondida);

		Assert.assertEquals(respondida.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Respondida newRespondida = addRespondida();

		_persistence.remove(newRespondida);

		Respondida existingRespondida = _persistence.fetchByPrimaryKey(newRespondida.getPrimaryKey());

		Assert.assertNull(existingRespondida);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addRespondida();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		RespondidaPK pk = new RespondidaPK(RandomTestUtil.nextLong(),
				RandomTestUtil.nextLong());

		Respondida newRespondida = _persistence.create(pk);

		newRespondida.setRespuesta(RandomTestUtil.randomString());

		newRespondida.setRespondida(RandomTestUtil.randomBoolean());

		_respondidas.add(_persistence.update(newRespondida));

		Respondida existingRespondida = _persistence.findByPrimaryKey(newRespondida.getPrimaryKey());

		Assert.assertEquals(existingRespondida.getIdRespuesta(),
			newRespondida.getIdRespuesta());
		Assert.assertEquals(existingRespondida.getIdCandidato(),
			newRespondida.getIdCandidato());
		Assert.assertEquals(existingRespondida.getRespuesta(),
			newRespondida.getRespuesta());
		Assert.assertEquals(existingRespondida.getRespondida(),
			newRespondida.getRespondida());
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Respondida newRespondida = addRespondida();

		Respondida existingRespondida = _persistence.findByPrimaryKey(newRespondida.getPrimaryKey());

		Assert.assertEquals(existingRespondida, newRespondida);
	}

	@Test(expected = NoSuchRespondidaException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		RespondidaPK pk = new RespondidaPK(RandomTestUtil.nextLong(),
				RandomTestUtil.nextLong());

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Respondida newRespondida = addRespondida();

		Respondida existingRespondida = _persistence.fetchByPrimaryKey(newRespondida.getPrimaryKey());

		Assert.assertEquals(existingRespondida, newRespondida);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		RespondidaPK pk = new RespondidaPK(RandomTestUtil.nextLong(),
				RandomTestUtil.nextLong());

		Respondida missingRespondida = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingRespondida);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {
		Respondida newRespondida1 = addRespondida();
		Respondida newRespondida2 = addRespondida();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newRespondida1.getPrimaryKey());
		primaryKeys.add(newRespondida2.getPrimaryKey());

		Map<Serializable, Respondida> respondidas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, respondidas.size());
		Assert.assertEquals(newRespondida1,
			respondidas.get(newRespondida1.getPrimaryKey()));
		Assert.assertEquals(newRespondida2,
			respondidas.get(newRespondida2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {
		RespondidaPK pk1 = new RespondidaPK(RandomTestUtil.nextLong(),
				RandomTestUtil.nextLong());

		RespondidaPK pk2 = new RespondidaPK(RandomTestUtil.nextLong(),
				RandomTestUtil.nextLong());

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Respondida> respondidas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(respondidas.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {
		Respondida newRespondida = addRespondida();

		RespondidaPK pk = new RespondidaPK(RandomTestUtil.nextLong(),
				RandomTestUtil.nextLong());

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newRespondida.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Respondida> respondidas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, respondidas.size());
		Assert.assertEquals(newRespondida,
			respondidas.get(newRespondida.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys()
		throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Respondida> respondidas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(respondidas.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey()
		throws Exception {
		Respondida newRespondida = addRespondida();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newRespondida.getPrimaryKey());

		Map<Serializable, Respondida> respondidas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, respondidas.size());
		Assert.assertEquals(newRespondida,
			respondidas.get(newRespondida.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery = RespondidaLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<Respondida>() {
				@Override
				public void performAction(Respondida respondida) {
					Assert.assertNotNull(respondida);

					count.increment();
				}
			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting()
		throws Exception {
		Respondida newRespondida = addRespondida();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Respondida.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("id.idRespuesta",
				newRespondida.getIdRespuesta()));
		dynamicQuery.add(RestrictionsFactoryUtil.eq("id.idCandidato",
				newRespondida.getIdCandidato()));

		List<Respondida> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Respondida existingRespondida = result.get(0);

		Assert.assertEquals(existingRespondida, newRespondida);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Respondida.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("id.idRespuesta",
				RandomTestUtil.nextLong()));
		dynamicQuery.add(RestrictionsFactoryUtil.eq("id.idCandidato",
				RandomTestUtil.nextLong()));

		List<Respondida> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting()
		throws Exception {
		Respondida newRespondida = addRespondida();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Respondida.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property(
				"id.idRespuesta"));

		Object newIdRespuesta = newRespondida.getIdRespuesta();

		dynamicQuery.add(RestrictionsFactoryUtil.in("id.idRespuesta",
				new Object[] { newIdRespuesta }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingIdRespuesta = result.get(0);

		Assert.assertEquals(existingIdRespuesta, newIdRespuesta);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Respondida.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property(
				"id.idRespuesta"));

		dynamicQuery.add(RestrictionsFactoryUtil.in("id.idRespuesta",
				new Object[] { RandomTestUtil.nextLong() }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected Respondida addRespondida() throws Exception {
		RespondidaPK pk = new RespondidaPK(RandomTestUtil.nextLong(),
				RandomTestUtil.nextLong());

		Respondida respondida = _persistence.create(pk);

		respondida.setRespuesta(RandomTestUtil.randomString());

		respondida.setRespondida(RandomTestUtil.randomBoolean());

		_respondidas.add(_persistence.update(respondida));

		return respondida;
	}

	private List<Respondida> _respondidas = new ArrayList<Respondida>();
	private RespondidaPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;
}