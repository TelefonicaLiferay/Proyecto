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

package servicioempleodigital.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.spring.extender.service.ServiceReference;

import servicioempleodigital.exception.NoSuchResultadoException;

import servicioempleodigital.model.Resultado;

import servicioempleodigital.model.impl.ResultadoImpl;
import servicioempleodigital.model.impl.ResultadoModelImpl;

import servicioempleodigital.service.persistence.ResultadoPK;
import servicioempleodigital.service.persistence.ResultadoPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the resultado service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see ResultadoPersistence
 * @see servicioempleodigital.service.persistence.ResultadoUtil
 * @generated
 */
@ProviderType
public class ResultadoPersistenceImpl extends BasePersistenceImpl<Resultado>
	implements ResultadoPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ResultadoUtil} to access the resultado persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ResultadoImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ResultadoModelImpl.ENTITY_CACHE_ENABLED,
			ResultadoModelImpl.FINDER_CACHE_ENABLED, ResultadoImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ResultadoModelImpl.ENTITY_CACHE_ENABLED,
			ResultadoModelImpl.FINDER_CACHE_ENABLED, ResultadoImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ResultadoModelImpl.ENTITY_CACHE_ENABLED,
			ResultadoModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public ResultadoPersistenceImpl() {
		setModelClass(Resultado.class);
	}

	/**
	 * Caches the resultado in the entity cache if it is enabled.
	 *
	 * @param resultado the resultado
	 */
	@Override
	public void cacheResult(Resultado resultado) {
		entityCache.putResult(ResultadoModelImpl.ENTITY_CACHE_ENABLED,
			ResultadoImpl.class, resultado.getPrimaryKey(), resultado);

		resultado.resetOriginalValues();
	}

	/**
	 * Caches the resultados in the entity cache if it is enabled.
	 *
	 * @param resultados the resultados
	 */
	@Override
	public void cacheResult(List<Resultado> resultados) {
		for (Resultado resultado : resultados) {
			if (entityCache.getResult(ResultadoModelImpl.ENTITY_CACHE_ENABLED,
						ResultadoImpl.class, resultado.getPrimaryKey()) == null) {
				cacheResult(resultado);
			}
			else {
				resultado.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all resultados.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ResultadoImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the resultado.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Resultado resultado) {
		entityCache.removeResult(ResultadoModelImpl.ENTITY_CACHE_ENABLED,
			ResultadoImpl.class, resultado.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Resultado> resultados) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Resultado resultado : resultados) {
			entityCache.removeResult(ResultadoModelImpl.ENTITY_CACHE_ENABLED,
				ResultadoImpl.class, resultado.getPrimaryKey());
		}
	}

	/**
	 * Creates a new resultado with the primary key. Does not add the resultado to the database.
	 *
	 * @param resultadoPK the primary key for the new resultado
	 * @return the new resultado
	 */
	@Override
	public Resultado create(ResultadoPK resultadoPK) {
		Resultado resultado = new ResultadoImpl();

		resultado.setNew(true);
		resultado.setPrimaryKey(resultadoPK);

		return resultado;
	}

	/**
	 * Removes the resultado with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param resultadoPK the primary key of the resultado
	 * @return the resultado that was removed
	 * @throws NoSuchResultadoException if a resultado with the primary key could not be found
	 */
	@Override
	public Resultado remove(ResultadoPK resultadoPK)
		throws NoSuchResultadoException {
		return remove((Serializable)resultadoPK);
	}

	/**
	 * Removes the resultado with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the resultado
	 * @return the resultado that was removed
	 * @throws NoSuchResultadoException if a resultado with the primary key could not be found
	 */
	@Override
	public Resultado remove(Serializable primaryKey)
		throws NoSuchResultadoException {
		Session session = null;

		try {
			session = openSession();

			Resultado resultado = (Resultado)session.get(ResultadoImpl.class,
					primaryKey);

			if (resultado == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchResultadoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(resultado);
		}
		catch (NoSuchResultadoException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Resultado removeImpl(Resultado resultado) {
		resultado = toUnwrappedModel(resultado);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(resultado)) {
				resultado = (Resultado)session.get(ResultadoImpl.class,
						resultado.getPrimaryKeyObj());
			}

			if (resultado != null) {
				session.delete(resultado);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (resultado != null) {
			clearCache(resultado);
		}

		return resultado;
	}

	@Override
	public Resultado updateImpl(Resultado resultado) {
		resultado = toUnwrappedModel(resultado);

		boolean isNew = resultado.isNew();

		Session session = null;

		try {
			session = openSession();

			if (resultado.isNew()) {
				session.save(resultado);

				resultado.setNew(false);
			}
			else {
				resultado = (Resultado)session.merge(resultado);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		entityCache.putResult(ResultadoModelImpl.ENTITY_CACHE_ENABLED,
			ResultadoImpl.class, resultado.getPrimaryKey(), resultado, false);

		resultado.resetOriginalValues();

		return resultado;
	}

	protected Resultado toUnwrappedModel(Resultado resultado) {
		if (resultado instanceof ResultadoImpl) {
			return resultado;
		}

		ResultadoImpl resultadoImpl = new ResultadoImpl();

		resultadoImpl.setNew(resultado.isNew());
		resultadoImpl.setPrimaryKey(resultado.getPrimaryKey());

		resultadoImpl.setPuntuacion(resultado.getPuntuacion());
		resultadoImpl.setIdCandidato(resultado.getIdCandidato());
		resultadoImpl.setIdOferta(resultado.getIdOferta());

		return resultadoImpl;
	}

	/**
	 * Returns the resultado with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the resultado
	 * @return the resultado
	 * @throws NoSuchResultadoException if a resultado with the primary key could not be found
	 */
	@Override
	public Resultado findByPrimaryKey(Serializable primaryKey)
		throws NoSuchResultadoException {
		Resultado resultado = fetchByPrimaryKey(primaryKey);

		if (resultado == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchResultadoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return resultado;
	}

	/**
	 * Returns the resultado with the primary key or throws a {@link NoSuchResultadoException} if it could not be found.
	 *
	 * @param resultadoPK the primary key of the resultado
	 * @return the resultado
	 * @throws NoSuchResultadoException if a resultado with the primary key could not be found
	 */
	@Override
	public Resultado findByPrimaryKey(ResultadoPK resultadoPK)
		throws NoSuchResultadoException {
		return findByPrimaryKey((Serializable)resultadoPK);
	}

	/**
	 * Returns the resultado with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the resultado
	 * @return the resultado, or <code>null</code> if a resultado with the primary key could not be found
	 */
	@Override
	public Resultado fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ResultadoModelImpl.ENTITY_CACHE_ENABLED,
				ResultadoImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Resultado resultado = (Resultado)serializable;

		if (resultado == null) {
			Session session = null;

			try {
				session = openSession();

				resultado = (Resultado)session.get(ResultadoImpl.class,
						primaryKey);

				if (resultado != null) {
					cacheResult(resultado);
				}
				else {
					entityCache.putResult(ResultadoModelImpl.ENTITY_CACHE_ENABLED,
						ResultadoImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ResultadoModelImpl.ENTITY_CACHE_ENABLED,
					ResultadoImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return resultado;
	}

	/**
	 * Returns the resultado with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param resultadoPK the primary key of the resultado
	 * @return the resultado, or <code>null</code> if a resultado with the primary key could not be found
	 */
	@Override
	public Resultado fetchByPrimaryKey(ResultadoPK resultadoPK) {
		return fetchByPrimaryKey((Serializable)resultadoPK);
	}

	@Override
	public Map<Serializable, Resultado> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Resultado> map = new HashMap<Serializable, Resultado>();

		for (Serializable primaryKey : primaryKeys) {
			Resultado resultado = fetchByPrimaryKey(primaryKey);

			if (resultado != null) {
				map.put(primaryKey, resultado);
			}
		}

		return map;
	}

	/**
	 * Returns all the resultados.
	 *
	 * @return the resultados
	 */
	@Override
	public List<Resultado> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the resultados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultadoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of resultados
	 * @param end the upper bound of the range of resultados (not inclusive)
	 * @return the range of resultados
	 */
	@Override
	public List<Resultado> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the resultados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultadoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of resultados
	 * @param end the upper bound of the range of resultados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of resultados
	 */
	@Override
	public List<Resultado> findAll(int start, int end,
		OrderByComparator<Resultado> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the resultados.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultadoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of resultados
	 * @param end the upper bound of the range of resultados (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of resultados
	 */
	@Override
	public List<Resultado> findAll(int start, int end,
		OrderByComparator<Resultado> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Resultado> list = null;

		if (retrieveFromCache) {
			list = (List<Resultado>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_RESULTADO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RESULTADO;

				if (pagination) {
					sql = sql.concat(ResultadoModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Resultado>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Resultado>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the resultados from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Resultado resultado : findAll()) {
			remove(resultado);
		}
	}

	/**
	 * Returns the number of resultados.
	 *
	 * @return the number of resultados
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_RESULTADO);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ResultadoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the resultado persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ResultadoImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_RESULTADO = "SELECT resultado FROM Resultado resultado";
	private static final String _SQL_COUNT_RESULTADO = "SELECT COUNT(resultado) FROM Resultado resultado";
	private static final String _ORDER_BY_ENTITY_ALIAS = "resultado.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Resultado exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(ResultadoPersistenceImpl.class);
}