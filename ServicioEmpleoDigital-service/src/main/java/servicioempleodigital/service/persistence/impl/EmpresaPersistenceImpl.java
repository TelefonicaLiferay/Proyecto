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
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import servicioempleodigital.exception.NoSuchEmpresaException;

import servicioempleodigital.model.Empresa;

import servicioempleodigital.model.impl.EmpresaImpl;
import servicioempleodigital.model.impl.EmpresaModelImpl;

import servicioempleodigital.service.persistence.EmpresaPersistence;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the empresa service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see EmpresaPersistence
 * @see servicioempleodigital.service.persistence.EmpresaUtil
 * @generated
 */
@ProviderType
public class EmpresaPersistenceImpl extends BasePersistenceImpl<Empresa>
	implements EmpresaPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmpresaUtil} to access the empresa persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmpresaImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmpresaModelImpl.ENTITY_CACHE_ENABLED,
			EmpresaModelImpl.FINDER_CACHE_ENABLED, EmpresaImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmpresaModelImpl.ENTITY_CACHE_ENABLED,
			EmpresaModelImpl.FINDER_CACHE_ENABLED, EmpresaImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmpresaModelImpl.ENTITY_CACHE_ENABLED,
			EmpresaModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public EmpresaPersistenceImpl() {
		setModelClass(Empresa.class);
	}

	/**
	 * Caches the empresa in the entity cache if it is enabled.
	 *
	 * @param empresa the empresa
	 */
	@Override
	public void cacheResult(Empresa empresa) {
		entityCache.putResult(EmpresaModelImpl.ENTITY_CACHE_ENABLED,
			EmpresaImpl.class, empresa.getPrimaryKey(), empresa);

		empresa.resetOriginalValues();
	}

	/**
	 * Caches the empresas in the entity cache if it is enabled.
	 *
	 * @param empresas the empresas
	 */
	@Override
	public void cacheResult(List<Empresa> empresas) {
		for (Empresa empresa : empresas) {
			if (entityCache.getResult(EmpresaModelImpl.ENTITY_CACHE_ENABLED,
						EmpresaImpl.class, empresa.getPrimaryKey()) == null) {
				cacheResult(empresa);
			}
			else {
				empresa.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all empresas.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(EmpresaImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the empresa.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Empresa empresa) {
		entityCache.removeResult(EmpresaModelImpl.ENTITY_CACHE_ENABLED,
			EmpresaImpl.class, empresa.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Empresa> empresas) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Empresa empresa : empresas) {
			entityCache.removeResult(EmpresaModelImpl.ENTITY_CACHE_ENABLED,
				EmpresaImpl.class, empresa.getPrimaryKey());
		}
	}

	/**
	 * Creates a new empresa with the primary key. Does not add the empresa to the database.
	 *
	 * @param idEmpresa the primary key for the new empresa
	 * @return the new empresa
	 */
	@Override
	public Empresa create(long idEmpresa) {
		Empresa empresa = new EmpresaImpl();

		empresa.setNew(true);
		empresa.setPrimaryKey(idEmpresa);

		return empresa;
	}

	/**
	 * Removes the empresa with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idEmpresa the primary key of the empresa
	 * @return the empresa that was removed
	 * @throws NoSuchEmpresaException if a empresa with the primary key could not be found
	 */
	@Override
	public Empresa remove(long idEmpresa) throws NoSuchEmpresaException {
		return remove((Serializable)idEmpresa);
	}

	/**
	 * Removes the empresa with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the empresa
	 * @return the empresa that was removed
	 * @throws NoSuchEmpresaException if a empresa with the primary key could not be found
	 */
	@Override
	public Empresa remove(Serializable primaryKey)
		throws NoSuchEmpresaException {
		Session session = null;

		try {
			session = openSession();

			Empresa empresa = (Empresa)session.get(EmpresaImpl.class, primaryKey);

			if (empresa == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmpresaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(empresa);
		}
		catch (NoSuchEmpresaException nsee) {
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
	protected Empresa removeImpl(Empresa empresa) {
		empresa = toUnwrappedModel(empresa);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(empresa)) {
				empresa = (Empresa)session.get(EmpresaImpl.class,
						empresa.getPrimaryKeyObj());
			}

			if (empresa != null) {
				session.delete(empresa);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (empresa != null) {
			clearCache(empresa);
		}

		return empresa;
	}

	@Override
	public Empresa updateImpl(Empresa empresa) {
		empresa = toUnwrappedModel(empresa);

		boolean isNew = empresa.isNew();

		Session session = null;

		try {
			session = openSession();

			if (empresa.isNew()) {
				session.save(empresa);

				empresa.setNew(false);
			}
			else {
				empresa = (Empresa)session.merge(empresa);
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

		entityCache.putResult(EmpresaModelImpl.ENTITY_CACHE_ENABLED,
			EmpresaImpl.class, empresa.getPrimaryKey(), empresa, false);

		empresa.resetOriginalValues();

		return empresa;
	}

	protected Empresa toUnwrappedModel(Empresa empresa) {
		if (empresa instanceof EmpresaImpl) {
			return empresa;
		}

		EmpresaImpl empresaImpl = new EmpresaImpl();

		empresaImpl.setNew(empresa.isNew());
		empresaImpl.setPrimaryKey(empresa.getPrimaryKey());

		empresaImpl.setIdEmpresa(empresa.getIdEmpresa());
		empresaImpl.setCif(empresa.getCif());
		empresaImpl.setRazonSocial(empresa.getRazonSocial());
		empresaImpl.setTelefono(empresa.getTelefono());
		empresaImpl.setEmail(empresa.getEmail());
		empresaImpl.setWeb(empresa.getWeb());
		empresaImpl.setPassword(empresa.getPassword());
		empresaImpl.setProvincia(empresa.getProvincia());
		empresaImpl.setCiudad(empresa.getCiudad());
		empresaImpl.setTrabajadores(empresa.getTrabajadores());

		return empresaImpl;
	}

	/**
	 * Returns the empresa with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the empresa
	 * @return the empresa
	 * @throws NoSuchEmpresaException if a empresa with the primary key could not be found
	 */
	@Override
	public Empresa findByPrimaryKey(Serializable primaryKey)
		throws NoSuchEmpresaException {
		Empresa empresa = fetchByPrimaryKey(primaryKey);

		if (empresa == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchEmpresaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return empresa;
	}

	/**
	 * Returns the empresa with the primary key or throws a {@link NoSuchEmpresaException} if it could not be found.
	 *
	 * @param idEmpresa the primary key of the empresa
	 * @return the empresa
	 * @throws NoSuchEmpresaException if a empresa with the primary key could not be found
	 */
	@Override
	public Empresa findByPrimaryKey(long idEmpresa)
		throws NoSuchEmpresaException {
		return findByPrimaryKey((Serializable)idEmpresa);
	}

	/**
	 * Returns the empresa with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the empresa
	 * @return the empresa, or <code>null</code> if a empresa with the primary key could not be found
	 */
	@Override
	public Empresa fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(EmpresaModelImpl.ENTITY_CACHE_ENABLED,
				EmpresaImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Empresa empresa = (Empresa)serializable;

		if (empresa == null) {
			Session session = null;

			try {
				session = openSession();

				empresa = (Empresa)session.get(EmpresaImpl.class, primaryKey);

				if (empresa != null) {
					cacheResult(empresa);
				}
				else {
					entityCache.putResult(EmpresaModelImpl.ENTITY_CACHE_ENABLED,
						EmpresaImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(EmpresaModelImpl.ENTITY_CACHE_ENABLED,
					EmpresaImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return empresa;
	}

	/**
	 * Returns the empresa with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idEmpresa the primary key of the empresa
	 * @return the empresa, or <code>null</code> if a empresa with the primary key could not be found
	 */
	@Override
	public Empresa fetchByPrimaryKey(long idEmpresa) {
		return fetchByPrimaryKey((Serializable)idEmpresa);
	}

	@Override
	public Map<Serializable, Empresa> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Empresa> map = new HashMap<Serializable, Empresa>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Empresa empresa = fetchByPrimaryKey(primaryKey);

			if (empresa != null) {
				map.put(primaryKey, empresa);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(EmpresaModelImpl.ENTITY_CACHE_ENABLED,
					EmpresaImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Empresa)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_EMPRESA_WHERE_PKS_IN);

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

			for (Empresa empresa : (List<Empresa>)q.list()) {
				map.put(empresa.getPrimaryKeyObj(), empresa);

				cacheResult(empresa);

				uncachedPrimaryKeys.remove(empresa.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(EmpresaModelImpl.ENTITY_CACHE_ENABLED,
					EmpresaImpl.class, primaryKey, nullModel);
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
	 * Returns all the empresas.
	 *
	 * @return the empresas
	 */
	@Override
	public List<Empresa> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the empresas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpresaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of empresas
	 * @param end the upper bound of the range of empresas (not inclusive)
	 * @return the range of empresas
	 */
	@Override
	public List<Empresa> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the empresas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpresaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of empresas
	 * @param end the upper bound of the range of empresas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of empresas
	 */
	@Override
	public List<Empresa> findAll(int start, int end,
		OrderByComparator<Empresa> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the empresas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpresaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of empresas
	 * @param end the upper bound of the range of empresas (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of empresas
	 */
	@Override
	public List<Empresa> findAll(int start, int end,
		OrderByComparator<Empresa> orderByComparator, boolean retrieveFromCache) {
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

		List<Empresa> list = null;

		if (retrieveFromCache) {
			list = (List<Empresa>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_EMPRESA);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMPRESA;

				if (pagination) {
					sql = sql.concat(EmpresaModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Empresa>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<Empresa>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the empresas from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Empresa empresa : findAll()) {
			remove(empresa);
		}
	}

	/**
	 * Returns the number of empresas.
	 *
	 * @return the number of empresas
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EMPRESA);

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
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return EmpresaModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the empresa persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(EmpresaImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_EMPRESA = "SELECT empresa FROM Empresa empresa";
	private static final String _SQL_SELECT_EMPRESA_WHERE_PKS_IN = "SELECT empresa FROM Empresa empresa WHERE idEmpresa IN (";
	private static final String _SQL_COUNT_EMPRESA = "SELECT COUNT(empresa) FROM Empresa empresa";
	private static final String _ORDER_BY_ENTITY_ALIAS = "empresa.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Empresa exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(EmpresaPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"password"
			});
}