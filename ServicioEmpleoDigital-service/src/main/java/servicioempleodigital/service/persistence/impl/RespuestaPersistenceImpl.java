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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import servicioempleodigital.exception.NoSuchRespuestaException;

import servicioempleodigital.model.Respuesta;

import servicioempleodigital.model.impl.RespuestaImpl;
import servicioempleodigital.model.impl.RespuestaModelImpl;

import servicioempleodigital.service.persistence.RespuestaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the respuesta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see RespuestaPersistence
 * @see servicioempleodigital.service.persistence.RespuestaUtil
 * @generated
 */
@ProviderType
public class RespuestaPersistenceImpl extends BasePersistenceImpl<Respuesta>
	implements RespuestaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RespuestaUtil} to access the respuesta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RespuestaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RespuestaModelImpl.ENTITY_CACHE_ENABLED,
			RespuestaModelImpl.FINDER_CACHE_ENABLED, RespuestaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RespuestaModelImpl.ENTITY_CACHE_ENABLED,
			RespuestaModelImpl.FINDER_CACHE_ENABLED, RespuestaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RespuestaModelImpl.ENTITY_CACHE_ENABLED,
			RespuestaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public RespuestaPersistenceImpl() {
		setModelClass(Respuesta.class);
	}

	/**
	 * Caches the respuesta in the entity cache if it is enabled.
	 *
	 * @param respuesta the respuesta
	 */
	@Override
	public void cacheResult(Respuesta respuesta) {
		entityCache.putResult(RespuestaModelImpl.ENTITY_CACHE_ENABLED,
			RespuestaImpl.class, respuesta.getPrimaryKey(), respuesta);

		respuesta.resetOriginalValues();
	}

	/**
	 * Caches the respuestas in the entity cache if it is enabled.
	 *
	 * @param respuestas the respuestas
	 */
	@Override
	public void cacheResult(List<Respuesta> respuestas) {
		for (Respuesta respuesta : respuestas) {
			if (entityCache.getResult(RespuestaModelImpl.ENTITY_CACHE_ENABLED,
						RespuestaImpl.class, respuesta.getPrimaryKey()) == null) {
				cacheResult(respuesta);
			}
			else {
				respuesta.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all respuestas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RespuestaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the respuesta.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Respuesta respuesta) {
		entityCache.removeResult(RespuestaModelImpl.ENTITY_CACHE_ENABLED,
			RespuestaImpl.class, respuesta.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Respuesta> respuestas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Respuesta respuesta : respuestas) {
			entityCache.removeResult(RespuestaModelImpl.ENTITY_CACHE_ENABLED,
				RespuestaImpl.class, respuesta.getPrimaryKey());
		}
	}

	/**
	 * Creates a new respuesta with the primary key. Does not add the respuesta to the database.
	 *
	 * @param idRespuesta the primary key for the new respuesta
	 * @return the new respuesta
	 */
	@Override
	public Respuesta create(long idRespuesta) {
		Respuesta respuesta = new RespuestaImpl();

		respuesta.setNew(true);
		respuesta.setPrimaryKey(idRespuesta);

		return respuesta;
	}

	/**
	 * Removes the respuesta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idRespuesta the primary key of the respuesta
	 * @return the respuesta that was removed
	 * @throws NoSuchRespuestaException if a respuesta with the primary key could not be found
	 */
	@Override
	public Respuesta remove(long idRespuesta) throws NoSuchRespuestaException {
		return remove((Serializable)idRespuesta);
	}

	/**
	 * Removes the respuesta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the respuesta
	 * @return the respuesta that was removed
	 * @throws NoSuchRespuestaException if a respuesta with the primary key could not be found
	 */
	@Override
	public Respuesta remove(Serializable primaryKey)
		throws NoSuchRespuestaException {
		Session session = null;

		try {
			session = openSession();

			Respuesta respuesta = (Respuesta)session.get(RespuestaImpl.class,
					primaryKey);

			if (respuesta == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRespuestaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(respuesta);
		}
		catch (NoSuchRespuestaException nsee) {
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
	protected Respuesta removeImpl(Respuesta respuesta) {
		respuesta = toUnwrappedModel(respuesta);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(respuesta)) {
				respuesta = (Respuesta)session.get(RespuestaImpl.class,
						respuesta.getPrimaryKeyObj());
			}

			if (respuesta != null) {
				session.delete(respuesta);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (respuesta != null) {
			clearCache(respuesta);
		}

		return respuesta;
	}

	@Override
	public Respuesta updateImpl(Respuesta respuesta) {
		respuesta = toUnwrappedModel(respuesta);

		boolean isNew = respuesta.isNew();

		Session session = null;

		try {
			session = openSession();

			if (respuesta.isNew()) {
				session.save(respuesta);

				respuesta.setNew(false);
			}
			else {
				respuesta = (Respuesta)session.merge(respuesta);
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

		entityCache.putResult(RespuestaModelImpl.ENTITY_CACHE_ENABLED,
			RespuestaImpl.class, respuesta.getPrimaryKey(), respuesta, false);

		respuesta.resetOriginalValues();

		return respuesta;
	}

	protected Respuesta toUnwrappedModel(Respuesta respuesta) {
		if (respuesta instanceof RespuestaImpl) {
			return respuesta;
		}

		RespuestaImpl respuestaImpl = new RespuestaImpl();

		respuestaImpl.setNew(respuesta.isNew());
		respuestaImpl.setPrimaryKey(respuesta.getPrimaryKey());

		respuestaImpl.setIdRespuesta(respuesta.getIdRespuesta());
		respuestaImpl.setRespuesta(respuesta.getRespuesta());
		respuestaImpl.setValor(respuesta.getValor());
		respuestaImpl.setIdPregunta(respuesta.getIdPregunta());

		return respuestaImpl;
	}

	/**
	 * Returns the respuesta with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the respuesta
	 * @return the respuesta
	 * @throws NoSuchRespuestaException if a respuesta with the primary key could not be found
	 */
	@Override
	public Respuesta findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRespuestaException {
		Respuesta respuesta = fetchByPrimaryKey(primaryKey);

		if (respuesta == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRespuestaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return respuesta;
	}

	/**
	 * Returns the respuesta with the primary key or throws a {@link NoSuchRespuestaException} if it could not be found.
	 *
	 * @param idRespuesta the primary key of the respuesta
	 * @return the respuesta
	 * @throws NoSuchRespuestaException if a respuesta with the primary key could not be found
	 */
	@Override
	public Respuesta findByPrimaryKey(long idRespuesta)
		throws NoSuchRespuestaException {
		return findByPrimaryKey((Serializable)idRespuesta);
	}

	/**
	 * Returns the respuesta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the respuesta
	 * @return the respuesta, or <code>null</code> if a respuesta with the primary key could not be found
	 */
	@Override
	public Respuesta fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(RespuestaModelImpl.ENTITY_CACHE_ENABLED,
				RespuestaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Respuesta respuesta = (Respuesta)serializable;

		if (respuesta == null) {
			Session session = null;

			try {
				session = openSession();

				respuesta = (Respuesta)session.get(RespuestaImpl.class,
						primaryKey);

				if (respuesta != null) {
					cacheResult(respuesta);
				}
				else {
					entityCache.putResult(RespuestaModelImpl.ENTITY_CACHE_ENABLED,
						RespuestaImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(RespuestaModelImpl.ENTITY_CACHE_ENABLED,
					RespuestaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return respuesta;
	}

	/**
	 * Returns the respuesta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idRespuesta the primary key of the respuesta
	 * @return the respuesta, or <code>null</code> if a respuesta with the primary key could not be found
	 */
	@Override
	public Respuesta fetchByPrimaryKey(long idRespuesta) {
		return fetchByPrimaryKey((Serializable)idRespuesta);
	}

	@Override
	public Map<Serializable, Respuesta> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Respuesta> map = new HashMap<Serializable, Respuesta>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Respuesta respuesta = fetchByPrimaryKey(primaryKey);

			if (respuesta != null) {
				map.put(primaryKey, respuesta);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(RespuestaModelImpl.ENTITY_CACHE_ENABLED,
					RespuestaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Respuesta)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_RESPUESTA_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append(String.valueOf(primaryKey));

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (Respuesta respuesta : (List<Respuesta>)q.list()) {
				map.put(respuesta.getPrimaryKeyObj(), respuesta);

				cacheResult(respuesta);

				uncachedPrimaryKeys.remove(respuesta.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(RespuestaModelImpl.ENTITY_CACHE_ENABLED,
					RespuestaImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the respuestas.
	 *
	 * @return the respuestas
	 */
	@Override
	public List<Respuesta> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the respuestas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RespuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of respuestas
	 * @param end the upper bound of the range of respuestas (not inclusive)
	 * @return the range of respuestas
	 */
	@Override
	public List<Respuesta> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the respuestas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RespuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of respuestas
	 * @param end the upper bound of the range of respuestas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of respuestas
	 */
	@Override
	public List<Respuesta> findAll(int start, int end,
		OrderByComparator<Respuesta> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the respuestas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RespuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of respuestas
	 * @param end the upper bound of the range of respuestas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of respuestas
	 */
	@Override
	public List<Respuesta> findAll(int start, int end,
		OrderByComparator<Respuesta> orderByComparator,
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

		List<Respuesta> list = null;

		if (retrieveFromCache) {
			list = (List<Respuesta>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_RESPUESTA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RESPUESTA;

				if (pagination) {
					sql = sql.concat(RespuestaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Respuesta>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Respuesta>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the respuestas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Respuesta respuesta : findAll()) {
			remove(respuesta);
		}
	}

	/**
	 * Returns the number of respuestas.
	 *
	 * @return the number of respuestas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_RESPUESTA);

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
		return RespuestaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the respuesta persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(RespuestaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_RESPUESTA = "SELECT respuesta FROM Respuesta respuesta";
	private static final String _SQL_SELECT_RESPUESTA_WHERE_PKS_IN = "SELECT respuesta FROM Respuesta respuesta WHERE idRespuesta IN (";
	private static final String _SQL_COUNT_RESPUESTA = "SELECT COUNT(respuesta) FROM Respuesta respuesta";
	private static final String _ORDER_BY_ENTITY_ALIAS = "respuesta.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Respuesta exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(RespuestaPersistenceImpl.class);
}