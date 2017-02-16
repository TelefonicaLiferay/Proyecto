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

import servicioempleodigital.exception.NoSuchRespondidaException;

import servicioempleodigital.model.Respondida;

import servicioempleodigital.model.impl.RespondidaImpl;
import servicioempleodigital.model.impl.RespondidaModelImpl;

import servicioempleodigital.service.persistence.RespondidaPK;
import servicioempleodigital.service.persistence.RespondidaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the respondida service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see RespondidaPersistence
 * @see servicioempleodigital.service.persistence.RespondidaUtil
 * @generated
 */
@ProviderType
public class RespondidaPersistenceImpl extends BasePersistenceImpl<Respondida>
	implements RespondidaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RespondidaUtil} to access the respondida persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RespondidaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RespondidaModelImpl.ENTITY_CACHE_ENABLED,
			RespondidaModelImpl.FINDER_CACHE_ENABLED, RespondidaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RespondidaModelImpl.ENTITY_CACHE_ENABLED,
			RespondidaModelImpl.FINDER_CACHE_ENABLED, RespondidaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RespondidaModelImpl.ENTITY_CACHE_ENABLED,
			RespondidaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public RespondidaPersistenceImpl() {
		setModelClass(Respondida.class);
	}

	/**
	 * Caches the respondida in the entity cache if it is enabled.
	 *
	 * @param respondida the respondida
	 */
	@Override
	public void cacheResult(Respondida respondida) {
		entityCache.putResult(RespondidaModelImpl.ENTITY_CACHE_ENABLED,
			RespondidaImpl.class, respondida.getPrimaryKey(), respondida);

		respondida.resetOriginalValues();
	}

	/**
	 * Caches the respondidas in the entity cache if it is enabled.
	 *
	 * @param respondidas the respondidas
	 */
	@Override
	public void cacheResult(List<Respondida> respondidas) {
		for (Respondida respondida : respondidas) {
			if (entityCache.getResult(
						RespondidaModelImpl.ENTITY_CACHE_ENABLED,
						RespondidaImpl.class, respondida.getPrimaryKey()) == null) {
				cacheResult(respondida);
			}
			else {
				respondida.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all respondidas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RespondidaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the respondida.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Respondida respondida) {
		entityCache.removeResult(RespondidaModelImpl.ENTITY_CACHE_ENABLED,
			RespondidaImpl.class, respondida.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Respondida> respondidas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Respondida respondida : respondidas) {
			entityCache.removeResult(RespondidaModelImpl.ENTITY_CACHE_ENABLED,
				RespondidaImpl.class, respondida.getPrimaryKey());
		}
	}

	/**
	 * Creates a new respondida with the primary key. Does not add the respondida to the database.
	 *
	 * @param respondidaPK the primary key for the new respondida
	 * @return the new respondida
	 */
	@Override
	public Respondida create(RespondidaPK respondidaPK) {
		Respondida respondida = new RespondidaImpl();

		respondida.setNew(true);
		respondida.setPrimaryKey(respondidaPK);

		return respondida;
	}

	/**
	 * Removes the respondida with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param respondidaPK the primary key of the respondida
	 * @return the respondida that was removed
	 * @throws NoSuchRespondidaException if a respondida with the primary key could not be found
	 */
	@Override
	public Respondida remove(RespondidaPK respondidaPK)
		throws NoSuchRespondidaException {
		return remove((Serializable)respondidaPK);
	}

	/**
	 * Removes the respondida with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the respondida
	 * @return the respondida that was removed
	 * @throws NoSuchRespondidaException if a respondida with the primary key could not be found
	 */
	@Override
	public Respondida remove(Serializable primaryKey)
		throws NoSuchRespondidaException {
		Session session = null;

		try {
			session = openSession();

			Respondida respondida = (Respondida)session.get(RespondidaImpl.class,
					primaryKey);

			if (respondida == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRespondidaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(respondida);
		}
		catch (NoSuchRespondidaException nsee) {
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
	protected Respondida removeImpl(Respondida respondida) {
		respondida = toUnwrappedModel(respondida);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(respondida)) {
				respondida = (Respondida)session.get(RespondidaImpl.class,
						respondida.getPrimaryKeyObj());
			}

			if (respondida != null) {
				session.delete(respondida);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (respondida != null) {
			clearCache(respondida);
		}

		return respondida;
	}

	@Override
	public Respondida updateImpl(Respondida respondida) {
		respondida = toUnwrappedModel(respondida);

		boolean isNew = respondida.isNew();

		Session session = null;

		try {
			session = openSession();

			if (respondida.isNew()) {
				session.save(respondida);

				respondida.setNew(false);
			}
			else {
				respondida = (Respondida)session.merge(respondida);
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

		entityCache.putResult(RespondidaModelImpl.ENTITY_CACHE_ENABLED,
			RespondidaImpl.class, respondida.getPrimaryKey(), respondida, false);

		respondida.resetOriginalValues();

		return respondida;
	}

	protected Respondida toUnwrappedModel(Respondida respondida) {
		if (respondida instanceof RespondidaImpl) {
			return respondida;
		}

		RespondidaImpl respondidaImpl = new RespondidaImpl();

		respondidaImpl.setNew(respondida.isNew());
		respondidaImpl.setPrimaryKey(respondida.getPrimaryKey());

		respondidaImpl.setIdRespuesta(respondida.getIdRespuesta());
		respondidaImpl.setIdCandidato(respondida.getIdCandidato());
		respondidaImpl.setRespuesta(respondida.getRespuesta());
		respondidaImpl.setRespondida(respondida.isRespondida());

		return respondidaImpl;
	}

	/**
	 * Returns the respondida with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the respondida
	 * @return the respondida
	 * @throws NoSuchRespondidaException if a respondida with the primary key could not be found
	 */
	@Override
	public Respondida findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRespondidaException {
		Respondida respondida = fetchByPrimaryKey(primaryKey);

		if (respondida == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRespondidaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return respondida;
	}

	/**
	 * Returns the respondida with the primary key or throws a {@link NoSuchRespondidaException} if it could not be found.
	 *
	 * @param respondidaPK the primary key of the respondida
	 * @return the respondida
	 * @throws NoSuchRespondidaException if a respondida with the primary key could not be found
	 */
	@Override
	public Respondida findByPrimaryKey(RespondidaPK respondidaPK)
		throws NoSuchRespondidaException {
		return findByPrimaryKey((Serializable)respondidaPK);
	}

	/**
	 * Returns the respondida with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the respondida
	 * @return the respondida, or <code>null</code> if a respondida with the primary key could not be found
	 */
	@Override
	public Respondida fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(RespondidaModelImpl.ENTITY_CACHE_ENABLED,
				RespondidaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Respondida respondida = (Respondida)serializable;

		if (respondida == null) {
			Session session = null;

			try {
				session = openSession();

				respondida = (Respondida)session.get(RespondidaImpl.class,
						primaryKey);

				if (respondida != null) {
					cacheResult(respondida);
				}
				else {
					entityCache.putResult(RespondidaModelImpl.ENTITY_CACHE_ENABLED,
						RespondidaImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(RespondidaModelImpl.ENTITY_CACHE_ENABLED,
					RespondidaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return respondida;
	}

	/**
	 * Returns the respondida with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param respondidaPK the primary key of the respondida
	 * @return the respondida, or <code>null</code> if a respondida with the primary key could not be found
	 */
	@Override
	public Respondida fetchByPrimaryKey(RespondidaPK respondidaPK) {
		return fetchByPrimaryKey((Serializable)respondidaPK);
	}

	@Override
	public Map<Serializable, Respondida> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Respondida> map = new HashMap<Serializable, Respondida>();

		for (Serializable primaryKey : primaryKeys) {
			Respondida respondida = fetchByPrimaryKey(primaryKey);

			if (respondida != null) {
				map.put(primaryKey, respondida);
			}
		}

		return map;
	}

	/**
	 * Returns all the respondidas.
	 *
	 * @return the respondidas
	 */
	@Override
	public List<Respondida> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the respondidas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RespondidaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of respondidas
	 * @param end the upper bound of the range of respondidas (not inclusive)
	 * @return the range of respondidas
	 */
	@Override
	public List<Respondida> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the respondidas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RespondidaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of respondidas
	 * @param end the upper bound of the range of respondidas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of respondidas
	 */
	@Override
	public List<Respondida> findAll(int start, int end,
		OrderByComparator<Respondida> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the respondidas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RespondidaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of respondidas
	 * @param end the upper bound of the range of respondidas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of respondidas
	 */
	@Override
	public List<Respondida> findAll(int start, int end,
		OrderByComparator<Respondida> orderByComparator,
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

		List<Respondida> list = null;

		if (retrieveFromCache) {
			list = (List<Respondida>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_RESPONDIDA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_RESPONDIDA;

				if (pagination) {
					sql = sql.concat(RespondidaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Respondida>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Respondida>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the respondidas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Respondida respondida : findAll()) {
			remove(respondida);
		}
	}

	/**
	 * Returns the number of respondidas.
	 *
	 * @return the number of respondidas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_RESPONDIDA);

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
		return RespondidaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the respondida persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(RespondidaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_RESPONDIDA = "SELECT respondida FROM Respondida respondida";
	private static final String _SQL_COUNT_RESPONDIDA = "SELECT COUNT(respondida) FROM Respondida respondida";
	private static final String _ORDER_BY_ENTITY_ALIAS = "respondida.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Respondida exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(RespondidaPersistenceImpl.class);
}