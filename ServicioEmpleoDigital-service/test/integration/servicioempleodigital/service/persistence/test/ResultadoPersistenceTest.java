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
import com.liferay.portal.kernel.test.AssertUtils;
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

import servicioempleodigital.exception.NoSuchResultadoException;

import servicioempleodigital.model.Resultado;

import servicioempleodigital.service.ResultadoLocalServiceUtil;

import servicioempleodigital.service.persistence.ResultadoPK;
import servicioempleodigital.service.persistence.ResultadoPersistence;
import servicioempleodigital.service.persistence.ResultadoUtil;

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
public class ResultadoPersistenceTest {
	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule = new AggregateTestRule(new LiferayIntegrationTestRule(),
			PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(Propagation.REQUIRED));

	@Before
	public void setUp() {
		_persistence = ResultadoUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Resultado> iterator = _resultados.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		ResultadoPK pk = new ResultadoPK(RandomTestUtil.nextLong(),
				RandomTestUtil.nextLong());

		Resultado resultado = _persistence.create(pk);

		Assert.assertNotNull(resultado);

		Assert.assertEquals(resultado.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Resultado newResultado = addResultado();

		_persistence.remove(newResultado);

		Resultado existingResultado = _persistence.fetchByPrimaryKey(newResultado.getPrimaryKey());

		Assert.assertNull(existingResultado);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addResultado();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		ResultadoPK pk = new ResultadoPK(RandomTestUtil.nextLong(),
				RandomTestUtil.nextLong());

		Resultado newResultado = _persistence.create(pk);

		newResultado.setPuntuacion(RandomTestUtil.nextDouble());

		_resultados.add(_persistence.update(newResultado));

		Resultado existingResultado = _persistence.findByPrimaryKey(newResultado.getPrimaryKey());

		AssertUtils.assertEquals(existingResultado.getPuntuacion(),
			newResultado.getPuntuacion());
		Assert.assertEquals(existingResultado.getIdCandidato(),
			newResultado.getIdCandidato());
		Assert.assertEquals(existingResultado.getIdOferta(),
			newResultado.getIdOferta());
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Resultado newResultado = addResultado();

		Resultado existingResultado = _persistence.findByPrimaryKey(newResultado.getPrimaryKey());

		Assert.assertEquals(existingResultado, newResultado);
	}

	@Test(expected = NoSuchResultadoException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		ResultadoPK pk = new ResultadoPK(RandomTestUtil.nextLong(),
				RandomTestUtil.nextLong());

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Resultado newResultado = addResultado();

		Resultado existingResultado = _persistence.fetchByPrimaryKey(newResultado.getPrimaryKey());

		Assert.assertEquals(existingResultado, newResultado);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		ResultadoPK pk = new ResultadoPK(RandomTestUtil.nextLong(),
				RandomTestUtil.nextLong());

		Resultado missingResultado = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingResultado);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {
		Resultado newResultado1 = addResultado();
		Resultado newResultado2 = addResultado();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newResultado1.getPrimaryKey());
		primaryKeys.add(newResultado2.getPrimaryKey());

		Map<Serializable, Resultado> resultados = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(2, resultados.size());
		Assert.assertEquals(newResultado1,
			resultados.get(newResultado1.getPrimaryKey()));
		Assert.assertEquals(newResultado2,
			resultados.get(newResultado2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {
		ResultadoPK pk1 = new ResultadoPK(RandomTestUtil.nextLong(),
				RandomTestUtil.nextLong());

		ResultadoPK pk2 = new ResultadoPK(RandomTestUtil.nextLong(),
				RandomTestUtil.nextLong());

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Resultado> resultados = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(resultados.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {
		Resultado newResultado = addResultado();

		ResultadoPK pk = new ResultadoPK(RandomTestUtil.nextLong(),
				RandomTestUtil.nextLong());

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newResultado.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Resultado> resultados = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, resultados.size());
		Assert.assertEquals(newResultado,
			resultados.get(newResultado.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys()
		throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Resultado> resultados = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertTrue(resultados.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey()
		throws Exception {
		Resultado newResultado = addResultado();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newResultado.getPrimaryKey());

		Map<Serializable, Resultado> resultados = _persistence.fetchByPrimaryKeys(primaryKeys);

		Assert.assertEquals(1, resultados.size());
		Assert.assertEquals(newResultado,
			resultados.get(newResultado.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery = ResultadoLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(new ActionableDynamicQuery.PerformActionMethod<Resultado>() {
				@Override
				public void performAction(Resultado resultado) {
					Assert.assertNotNull(resultado);

					count.increment();
				}
			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting()
		throws Exception {
		Resultado newResultado = addResultado();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Resultado.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("id.idCandidato",
				newResultado.getIdCandidato()));
		dynamicQuery.add(RestrictionsFactoryUtil.eq("id.idOferta",
				newResultado.getIdOferta()));

		List<Resultado> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Resultado existingResultado = result.get(0);

		Assert.assertEquals(existingResultado, newResultado);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Resultado.class,
				_dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("id.idCandidato",
				RandomTestUtil.nextLong()));
		dynamicQuery.add(RestrictionsFactoryUtil.eq("id.idOferta",
				RandomTestUtil.nextLong()));

		List<Resultado> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting()
		throws Exception {
		Resultado newResultado = addResultado();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Resultado.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property(
				"id.idCandidato"));

		Object newIdCandidato = newResultado.getIdCandidato();

		dynamicQuery.add(RestrictionsFactoryUtil.in("id.idCandidato",
				new Object[] { newIdCandidato }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingIdCandidato = result.get(0);

		Assert.assertEquals(existingIdCandidato, newIdCandidato);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(Resultado.class,
				_dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property(
				"id.idCandidato"));

		dynamicQuery.add(RestrictionsFactoryUtil.in("id.idCandidato",
				new Object[] { RandomTestUtil.nextLong() }));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected Resultado addResultado() throws Exception {
		ResultadoPK pk = new ResultadoPK(RandomTestUtil.nextLong(),
				RandomTestUtil.nextLong());

		Resultado resultado = _persistence.create(pk);

		resultado.setPuntuacion(RandomTestUtil.nextDouble());

		_resultados.add(_persistence.update(resultado));

		return resultado;
	}

	private List<Resultado> _resultados = new ArrayList<Resultado>();
	private ResultadoPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;
}