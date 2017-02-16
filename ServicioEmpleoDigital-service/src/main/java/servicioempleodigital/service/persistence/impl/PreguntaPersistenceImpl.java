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

import servicioempleodigital.exception.NoSuchPreguntaException;

import servicioempleodigital.model.Pregunta;

import servicioempleodigital.model.impl.PreguntaImpl;
import servicioempleodigital.model.impl.PreguntaModelImpl;

import servicioempleodigital.service.persistence.PreguntaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the pregunta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see PreguntaPersistence
 * @see servicioempleodigital.service.persistence.PreguntaUtil
 * @generated
 */
@ProviderType
public class PreguntaPersistenceImpl extends BasePersistenceImpl<Pregunta>
	implements PreguntaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link PreguntaUtil} to access the pregunta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = PreguntaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PreguntaModelImpl.ENTITY_CACHE_ENABLED,
			PreguntaModelImpl.FINDER_CACHE_ENABLED, PreguntaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PreguntaModelImpl.ENTITY_CACHE_ENABLED,
			PreguntaModelImpl.FINDER_CACHE_ENABLED, PreguntaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PreguntaModelImpl.ENTITY_CACHE_ENABLED,
			PreguntaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public PreguntaPersistenceImpl() {
		setModelClass(Pregunta.class);
	}

	/**
	 * Caches the pregunta in the entity cache if it is enabled.
	 *
	 * @param pregunta the pregunta
	 */
	@Override
	public void cacheResult(Pregunta pregunta) {
		entityCache.putResult(PreguntaModelImpl.ENTITY_CACHE_ENABLED,
			PreguntaImpl.class, pregunta.getPrimaryKey(), pregunta);

		pregunta.resetOriginalValues();
	}

	/**
	 * Caches the preguntas in the entity cache if it is enabled.
	 *
	 * @param preguntas the preguntas
	 */
	@Override
	public void cacheResult(List<Pregunta> preguntas) {
		for (Pregunta pregunta : preguntas) {
			if (entityCache.getResult(PreguntaModelImpl.ENTITY_CACHE_ENABLED,
						PreguntaImpl.class, pregunta.getPrimaryKey()) == null) {
				cacheResult(pregunta);
			}
			else {
				pregunta.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all preguntas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(PreguntaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the pregunta.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Pregunta pregunta) {
		entityCache.removeResult(PreguntaModelImpl.ENTITY_CACHE_ENABLED,
			PreguntaImpl.class, pregunta.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Pregunta> preguntas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Pregunta pregunta : preguntas) {
			entityCache.removeResult(PreguntaModelImpl.ENTITY_CACHE_ENABLED,
				PreguntaImpl.class, pregunta.getPrimaryKey());
		}
	}

	/**
	 * Creates a new pregunta with the primary key. Does not add the pregunta to the database.
	 *
	 * @param idPregunta the primary key for the new pregunta
	 * @return the new pregunta
	 */
	@Override
	public Pregunta create(long idPregunta) {
		Pregunta pregunta = new PreguntaImpl();

		pregunta.setNew(true);
		pregunta.setPrimaryKey(idPregunta);

		return pregunta;
	}

	/**
	 * Removes the pregunta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idPregunta the primary key of the pregunta
	 * @return the pregunta that was removed
	 * @throws NoSuchPreguntaException if a pregunta with the primary key could not be found
	 */
	@Override
	public Pregunta remove(long idPregunta) throws NoSuchPreguntaException {
		return remove((Serializable)idPregunta);
	}

	/**
	 * Removes the pregunta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the pregunta
	 * @return the pregunta that was removed
	 * @throws NoSuchPreguntaException if a pregunta with the primary key could not be found
	 */
	@Override
	public Pregunta remove(Serializable primaryKey)
		throws NoSuchPreguntaException {
		Session session = null;

		try {
			session = openSession();

			Pregunta pregunta = (Pregunta)session.get(PreguntaImpl.class,
					primaryKey);

			if (pregunta == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchPreguntaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(pregunta);
		}
		catch (NoSuchPreguntaException nsee) {
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
	protected Pregunta removeImpl(Pregunta pregunta) {
		pregunta = toUnwrappedModel(pregunta);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(pregunta)) {
				pregunta = (Pregunta)session.get(PreguntaImpl.class,
						pregunta.getPrimaryKeyObj());
			}

			if (pregunta != null) {
				session.delete(pregunta);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (pregunta != null) {
			clearCache(pregunta);
		}

		return pregunta;
	}

	@Override
	public Pregunta updateImpl(Pregunta pregunta) {
		pregunta = toUnwrappedModel(pregunta);

		boolean isNew = pregunta.isNew();

		Session session = null;

		try {
			session = openSession();

			if (pregunta.isNew()) {
				session.save(pregunta);

				pregunta.setNew(false);
			}
			else {
				pregunta = (Pregunta)session.merge(pregunta);
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

		entityCache.putResult(PreguntaModelImpl.ENTITY_CACHE_ENABLED,
			PreguntaImpl.class, pregunta.getPrimaryKey(), pregunta, false);

		pregunta.resetOriginalValues();

		return pregunta;
	}

	protected Pregunta toUnwrappedModel(Pregunta pregunta) {
		if (pregunta instanceof PreguntaImpl) {
			return pregunta;
		}

		PreguntaImpl preguntaImpl = new PreguntaImpl();

		preguntaImpl.setNew(pregunta.isNew());
		preguntaImpl.setPrimaryKey(pregunta.getPrimaryKey());

		preguntaImpl.setIdPregunta(pregunta.getIdPregunta());
		preguntaImpl.setEnunciado(pregunta.getEnunciado());
		preguntaImpl.setTipo(pregunta.getTipo());
		preguntaImpl.setIdOferta(pregunta.getIdOferta());

		return preguntaImpl;
	}

	/**
	 * Returns the pregunta with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the pregunta
	 * @return the pregunta
	 * @throws NoSuchPreguntaException if a pregunta with the primary key could not be found
	 */
	@Override
	public Pregunta findByPrimaryKey(Serializable primaryKey)
		throws NoSuchPreguntaException {
		Pregunta pregunta = fetchByPrimaryKey(primaryKey);

		if (pregunta == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchPreguntaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return pregunta;
	}

	/**
	 * Returns the pregunta with the primary key or throws a {@link NoSuchPreguntaException} if it could not be found.
	 *
	 * @param idPregunta the primary key of the pregunta
	 * @return the pregunta
	 * @throws NoSuchPreguntaException if a pregunta with the primary key could not be found
	 */
	@Override
	public Pregunta findByPrimaryKey(long idPregunta)
		throws NoSuchPreguntaException {
		return findByPrimaryKey((Serializable)idPregunta);
	}

	/**
	 * Returns the pregunta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the pregunta
	 * @return the pregunta, or <code>null</code> if a pregunta with the primary key could not be found
	 */
	@Override
	public Pregunta fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(PreguntaModelImpl.ENTITY_CACHE_ENABLED,
				PreguntaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Pregunta pregunta = (Pregunta)serializable;

		if (pregunta == null) {
			Session session = null;

			try {
				session = openSession();

				pregunta = (Pregunta)session.get(PreguntaImpl.class, primaryKey);

				if (pregunta != null) {
					cacheResult(pregunta);
				}
				else {
					entityCache.putResult(PreguntaModelImpl.ENTITY_CACHE_ENABLED,
						PreguntaImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(PreguntaModelImpl.ENTITY_CACHE_ENABLED,
					PreguntaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return pregunta;
	}

	/**
	 * Returns the pregunta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idPregunta the primary key of the pregunta
	 * @return the pregunta, or <code>null</code> if a pregunta with the primary key could not be found
	 */
	@Override
	public Pregunta fetchByPrimaryKey(long idPregunta) {
		return fetchByPrimaryKey((Serializable)idPregunta);
	}

	@Override
	public Map<Serializable, Pregunta> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Pregunta> map = new HashMap<Serializable, Pregunta>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Pregunta pregunta = fetchByPrimaryKey(primaryKey);

			if (pregunta != null) {
				map.put(primaryKey, pregunta);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(PreguntaModelImpl.ENTITY_CACHE_ENABLED,
					PreguntaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Pregunta)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_PREGUNTA_WHERE_PKS_IN);

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

			for (Pregunta pregunta : (List<Pregunta>)q.list()) {
				map.put(pregunta.getPrimaryKeyObj(), pregunta);

				cacheResult(pregunta);

				uncachedPrimaryKeys.remove(pregunta.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(PreguntaModelImpl.ENTITY_CACHE_ENABLED,
					PreguntaImpl.class, primaryKey, nullModel);
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
	 * Returns all the preguntas.
	 *
	 * @return the preguntas
	 */
	@Override
	public List<Pregunta> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the preguntas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of preguntas
	 * @param end the upper bound of the range of preguntas (not inclusive)
	 * @return the range of preguntas
	 */
	@Override
	public List<Pregunta> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the preguntas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of preguntas
	 * @param end the upper bound of the range of preguntas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of preguntas
	 */
	@Override
	public List<Pregunta> findAll(int start, int end,
		OrderByComparator<Pregunta> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the preguntas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of preguntas
	 * @param end the upper bound of the range of preguntas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of preguntas
	 */
	@Override
	public List<Pregunta> findAll(int start, int end,
		OrderByComparator<Pregunta> orderByComparator, boolean retrieveFromCache) {
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

		List<Pregunta> list = null;

		if (retrieveFromCache) {
			list = (List<Pregunta>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_PREGUNTA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_PREGUNTA;

				if (pagination) {
					sql = sql.concat(PreguntaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Pregunta>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Pregunta>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the preguntas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Pregunta pregunta : findAll()) {
			remove(pregunta);
		}
	}

	/**
	 * Returns the number of preguntas.
	 *
	 * @return the number of preguntas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_PREGUNTA);

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
		return PreguntaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the pregunta persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(PreguntaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_PREGUNTA = "SELECT pregunta FROM Pregunta pregunta";
	private static final String _SQL_SELECT_PREGUNTA_WHERE_PKS_IN = "SELECT pregunta FROM Pregunta pregunta WHERE idPregunta IN (";
	private static final String _SQL_COUNT_PREGUNTA = "SELECT COUNT(pregunta) FROM Pregunta pregunta";
	private static final String _ORDER_BY_ENTITY_ALIAS = "pregunta.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Pregunta exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(PreguntaPersistenceImpl.class);
}