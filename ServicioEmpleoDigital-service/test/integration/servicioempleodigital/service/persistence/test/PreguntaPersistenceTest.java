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

import servicioempleodigital.exception.NoSuchPreguntaException;

import servicioempleodigital.model.Pregunta;

import servicioempleodigital.service.PreguntaLocalServiceUtil;

import servicioempleodigital.service.persistence.PreguntaPersistence;
import servicioempleodigital.service.persistence.PreguntaUtil;

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
public class PreguntaPersistenceTest {
	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule = new AggregateTestRule(new LiferayIntegrationTestRule(),
			PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(Propagation.REQUIRED));

	@Before
	public void setUp() {
		_persistence = PreguntaUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Pregunta> iterator = _preguntas.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Pregunta pregunta = _persistence.create(pk);

		Assert.assertNotNull(pregunta);

		Assert.assertEquals(pregunta.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Pregunta newPregunta = addPregunta();

		_persistence.remove(newPregunta);

		Pregunta existingPregunta = _persistence.fetchByPrimaryKey(newPregunta.getPrimaryKey());

		Assert.assertNull(existingPregunta);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addPregunta();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Pregunta newPregunta = _persistence.create(pk);

		newPregunta.setEnunciado(RandomTestUtil.randomString());

		newPregunta.setTipo(RandomTestUtil.nextInt());

		newPregunta.setIdOferta(RandomTestUtil.nextLong());

		_preguntas.add(_persistence.update(newPregunta));

		Pregunta existingPregunta = _persistence.findByPrimaryKey(newPregunta.getPrimaryKey());

		Assert.assertEquals(existingPregunta.getIdPregunta(),
			newPregunta.getIdPregunta());
		Assert.assertEquals(existingPregunta.getEnunciado(),
			newPregunta.getEnunciado());
		Assert.assertEquals(existingPregunta.getTipo(), newPregunta.getTipo());
		Assert.assertEquals(existingPregunta.getIdOferta(),
			newPregunta.getIdOferta());
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Pregunta newPregunta = addPregunta();

		Pregunta existingPregunta = _persistence.findByPrimaryKey(newPregunta.getPrimaryKey());

		Assert.assertEquals(existingPregunta, newPregunta);
	}

	@Test(expected = NoSuchPreguntaException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			getOrderByComparator());
	}

	protected OrderByComparator<Pregunta> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create("FOO_Pregunta",
			"idPregunta", true, "enunciado", true, "tipo", true, "idOferta",
			true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Pregunta newPregunta = addPregunta();

		Pregunta existingPregunta = _persistence.fetchByPrimaryKey(newPregunta.getPrimaryKey());

		Assert.assertEquals(existingPregunta, newPregunta);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Pregunta missingPregunta = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingPregunta);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {
		Pregunta newPregunta1 = addPregunta();
		Pregunta newPregunta2 = addPregunta();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newPregunta1.getPrimaryKey());
		primaryKeys.add(newPregunta2.getPrimaryKey());

		Map<Serializable, Pregunta> preguntas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, preguntas.size());
		Assert.assertEquals(newPregunta1,
			preguntas.get(newPregunta1.getPrimaryKey()));
		Assert.assertEquals(newPregunta2,
			preguntas.get(newPregunta2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {
		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Pregunta> preguntas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(preguntas.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {
		Pregunta newPregunta = addPregunta();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newPregunta.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Pregunta> preguntas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, preguntas.size());
		Assert.assertEquals(newPregunta,
			preguntas.get(newPregunta.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys()
		throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Pregunta> preguntas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(preguntas.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey()
		throws Exception {
		Pregunta newPregunta = addPregunta();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newPregunta.getPrimaryKey());

		Map<Serializable, Pregunta> preguntas = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, preguntas.size());
		Assert.assertEquals(newPregunta,
			preguntas.get(newPregunta.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery = PreguntaLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<Pregunta>() {
				@Override
				public void performAction(Pregunta pregunta) {
					Assert.assertNotNull(pregunta);

					count.increment();
				}
			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting()
		throws Exception {
		Pregunta newPregunta = addPregunta();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Pregunta.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("idPregunta",
				newPregunta.getIdPregunta()));

		List<Pregunta> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Pregunta existingPregunta = result.get(0);

		Assert.assertEquals(existingPregunta, newPregunta);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Pregunta.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("idPregunta",
				RandomTestUtil.nextLong()));

		List<Pregunta> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting()
		throws Exception {
		Pregunta newPregunta = addPregunta();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Pregunta.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("idPregunta"));

		Object newIdPregunta = newPregunta.getIdPregunta();

		dynamicQuery.add(RestrictionsFactoryUtil.in("idPregunta",
				new Object[] { newIdPregunta }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingIdPregunta = result.get(0);

		Assert.assertEquals(existingIdPregunta, newIdPregunta);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Pregunta.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("idPregunta"));

		dynamicQuery.add(RestrictionsFactoryUtil.in("idPregunta",
				new Object[] { RandomTestUtil.nextLong() }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected Pregunta addPregunta() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Pregunta pregunta = _persistence.create(pk);

		pregunta.setEnunciado(RandomTestUtil.randomString());

		pregunta.setTipo(RandomTestUtil.nextInt());

		pregunta.setIdOferta(RandomTestUtil.nextLong());

		_preguntas.add(_persistence.update(pregunta));

		return pregunta;
	}

	private List<Pregunta> _preguntas = new ArrayList<Pregunta>();
	private PreguntaPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;
}