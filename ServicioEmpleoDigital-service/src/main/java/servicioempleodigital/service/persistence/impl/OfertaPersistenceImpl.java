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

import servicioempleodigital.exception.NoSuchOfertaException;

import servicioempleodigital.model.Oferta;

import servicioempleodigital.model.impl.OfertaImpl;
import servicioempleodigital.model.impl.OfertaModelImpl;

import servicioempleodigital.service.persistence.OfertaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the oferta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see OfertaPersistence
 * @see servicioempleodigital.service.persistence.OfertaUtil
 * @generated
 */
@ProviderType
public class OfertaPersistenceImpl extends BasePersistenceImpl<Oferta>
	implements OfertaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link OfertaUtil} to access the oferta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = OfertaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(OfertaModelImpl.ENTITY_CACHE_ENABLED,
			OfertaModelImpl.FINDER_CACHE_ENABLED, OfertaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(OfertaModelImpl.ENTITY_CACHE_ENABLED,
			OfertaModelImpl.FINDER_CACHE_ENABLED, OfertaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(OfertaModelImpl.ENTITY_CACHE_ENABLED,
			OfertaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public OfertaPersistenceImpl() {
		setModelClass(Oferta.class);
	}

	/**
	 * Caches the oferta in the entity cache if it is enabled.
	 *
	 * @param oferta the oferta
	 */
	@Override
	public void cacheResult(Oferta oferta) {
		entityCache.putResult(OfertaModelImpl.ENTITY_CACHE_ENABLED,
			OfertaImpl.class, oferta.getPrimaryKey(), oferta);

		oferta.resetOriginalValues();
	}

	/**
	 * Caches the ofertas in the entity cache if it is enabled.
	 *
	 * @param ofertas the ofertas
	 */
	@Override
	public void cacheResult(List<Oferta> ofertas) {
		for (Oferta oferta : ofertas) {
			if (entityCache.getResult(OfertaModelImpl.ENTITY_CACHE_ENABLED,
						OfertaImpl.class, oferta.getPrimaryKey()) == null) {
				cacheResult(oferta);
			}
			else {
				oferta.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all ofertas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OfertaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the oferta.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Oferta oferta) {
		entityCache.removeResult(OfertaModelImpl.ENTITY_CACHE_ENABLED,
			OfertaImpl.class, oferta.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Oferta> ofertas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Oferta oferta : ofertas) {
			entityCache.removeResult(OfertaModelImpl.ENTITY_CACHE_ENABLED,
				OfertaImpl.class, oferta.getPrimaryKey());
		}
	}

	/**
	 * Creates a new oferta with the primary key. Does not add the oferta to the database.
	 *
	 * @param idOferta the primary key for the new oferta
	 * @return the new oferta
	 */
	@Override
	public Oferta create(long idOferta) {
		Oferta oferta = new OfertaImpl();

		oferta.setNew(true);
		oferta.setPrimaryKey(idOferta);

		return oferta;
	}

	/**
	 * Removes the oferta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idOferta the primary key of the oferta
	 * @return the oferta that was removed
	 * @throws NoSuchOfertaException if a oferta with the primary key could not be found
	 */
	@Override
	public Oferta remove(long idOferta) throws NoSuchOfertaException {
		return remove((Serializable)idOferta);
	}

	/**
	 * Removes the oferta with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the oferta
	 * @return the oferta that was removed
	 * @throws NoSuchOfertaException if a oferta with the primary key could not be found
	 */
	@Override
	public Oferta remove(Serializable primaryKey) throws NoSuchOfertaException {
		Session session = null;

		try {
			session = openSession();

			Oferta oferta = (Oferta)session.get(OfertaImpl.class, primaryKey);

			if (oferta == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOfertaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(oferta);
		}
		catch (NoSuchOfertaException nsee) {
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
	protected Oferta removeImpl(Oferta oferta) {
		oferta = toUnwrappedModel(oferta);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(oferta)) {
				oferta = (Oferta)session.get(OfertaImpl.class,
						oferta.getPrimaryKeyObj());
			}

			if (oferta != null) {
				session.delete(oferta);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (oferta != null) {
			clearCache(oferta);
		}

		return oferta;
	}

	@Override
	public Oferta updateImpl(Oferta oferta) {
		oferta = toUnwrappedModel(oferta);

		boolean isNew = oferta.isNew();

		Session session = null;

		try {
			session = openSession();

			if (oferta.isNew()) {
				session.save(oferta);

				oferta.setNew(false);
			}
			else {
				oferta = (Oferta)session.merge(oferta);
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

		entityCache.putResult(OfertaModelImpl.ENTITY_CACHE_ENABLED,
			OfertaImpl.class, oferta.getPrimaryKey(), oferta, false);

		oferta.resetOriginalValues();

		return oferta;
	}

	protected Oferta toUnwrappedModel(Oferta oferta) {
		if (oferta instanceof OfertaImpl) {
			return oferta;
		}

		OfertaImpl ofertaImpl = new OfertaImpl();

		ofertaImpl.setNew(oferta.isNew());
		ofertaImpl.setPrimaryKey(oferta.getPrimaryKey());

		ofertaImpl.setIdOferta(oferta.getIdOferta());
		ofertaImpl.setTitulo(oferta.getTitulo());
		ofertaImpl.setDescripcion(oferta.getDescripcion());
		ofertaImpl.setProvincia(oferta.getProvincia());
		ofertaImpl.setCiudad(oferta.getCiudad());
		ofertaImpl.setSalario(oferta.getSalario());
		ofertaImpl.setFechaInicio(oferta.getFechaInicio());
		ofertaImpl.setFechaModificacion(oferta.getFechaModificacion());
		ofertaImpl.setFechaFin(oferta.getFechaFin());
		ofertaImpl.setPlazas(oferta.getPlazas());
		ofertaImpl.setCandidatos(oferta.getCandidatos());
		ofertaImpl.setRequisitosMinimos(oferta.getRequisitosMinimos());
		ofertaImpl.setRequisitosOpcionales(oferta.getRequisitosOpcionales());
		ofertaImpl.setActiva(oferta.isActiva());
		ofertaImpl.setIdEmpresa(oferta.getIdEmpresa());

		return ofertaImpl;
	}

	/**
	 * Returns the oferta with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the oferta
	 * @return the oferta
	 * @throws NoSuchOfertaException if a oferta with the primary key could not be found
	 */
	@Override
	public Oferta findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOfertaException {
		Oferta oferta = fetchByPrimaryKey(primaryKey);

		if (oferta == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOfertaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return oferta;
	}

	/**
	 * Returns the oferta with the primary key or throws a {@link NoSuchOfertaException} if it could not be found.
	 *
	 * @param idOferta the primary key of the oferta
	 * @return the oferta
	 * @throws NoSuchOfertaException if a oferta with the primary key could not be found
	 */
	@Override
	public Oferta findByPrimaryKey(long idOferta) throws NoSuchOfertaException {
		return findByPrimaryKey((Serializable)idOferta);
	}

	/**
	 * Returns the oferta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the oferta
	 * @return the oferta, or <code>null</code> if a oferta with the primary key could not be found
	 */
	@Override
	public Oferta fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(OfertaModelImpl.ENTITY_CACHE_ENABLED,
				OfertaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Oferta oferta = (Oferta)serializable;

		if (oferta == null) {
			Session session = null;

			try {
				session = openSession();

				oferta = (Oferta)session.get(OfertaImpl.class, primaryKey);

				if (oferta != null) {
					cacheResult(oferta);
				}
				else {
					entityCache.putResult(OfertaModelImpl.ENTITY_CACHE_ENABLED,
						OfertaImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(OfertaModelImpl.ENTITY_CACHE_ENABLED,
					OfertaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return oferta;
	}

	/**
	 * Returns the oferta with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idOferta the primary key of the oferta
	 * @return the oferta, or <code>null</code> if a oferta with the primary key could not be found
	 */
	@Override
	public Oferta fetchByPrimaryKey(long idOferta) {
		return fetchByPrimaryKey((Serializable)idOferta);
	}

	@Override
	public Map<Serializable, Oferta> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Oferta> map = new HashMap<Serializable, Oferta>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Oferta oferta = fetchByPrimaryKey(primaryKey);

			if (oferta != null) {
				map.put(primaryKey, oferta);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(OfertaModelImpl.ENTITY_CACHE_ENABLED,
					OfertaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Oferta)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_OFERTA_WHERE_PKS_IN);

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

			for (Oferta oferta : (List<Oferta>)q.list()) {
				map.put(oferta.getPrimaryKeyObj(), oferta);

				cacheResult(oferta);

				uncachedPrimaryKeys.remove(oferta.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(OfertaModelImpl.ENTITY_CACHE_ENABLED,
					OfertaImpl.class, primaryKey, nullModel);
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
	 * Returns all the ofertas.
	 *
	 * @return the ofertas
	 */
	@Override
	public List<Oferta> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ofertas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OfertaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ofertas
	 * @param end the upper bound of the range of ofertas (not inclusive)
	 * @return the range of ofertas
	 */
	@Override
	public List<Oferta> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ofertas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OfertaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ofertas
	 * @param end the upper bound of the range of ofertas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ofertas
	 */
	@Override
	public List<Oferta> findAll(int start, int end,
		OrderByComparator<Oferta> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ofertas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OfertaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ofertas
	 * @param end the upper bound of the range of ofertas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of ofertas
	 */
	@Override
	public List<Oferta> findAll(int start, int end,
		OrderByComparator<Oferta> orderByComparator, boolean retrieveFromCache) {
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

		List<Oferta> list = null;

		if (retrieveFromCache) {
			list = (List<Oferta>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_OFERTA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_OFERTA;

				if (pagination) {
					sql = sql.concat(OfertaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Oferta>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Oferta>)QueryUtil.list(q, getDialect(), start,
							end);
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
	 * Removes all the ofertas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Oferta oferta : findAll()) {
			remove(oferta);
		}
	}

	/**
	 * Returns the number of ofertas.
	 *
	 * @return the number of ofertas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_OFERTA);

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
		return OfertaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the oferta persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(OfertaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_OFERTA = "SELECT oferta FROM Oferta oferta";
	private static final String _SQL_SELECT_OFERTA_WHERE_PKS_IN = "SELECT oferta FROM Oferta oferta WHERE idOferta IN (";
	private static final String _SQL_COUNT_OFERTA = "SELECT COUNT(oferta) FROM Oferta oferta";
	private static final String _ORDER_BY_ENTITY_ALIAS = "oferta.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Oferta exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(OfertaPersistenceImpl.class);
}