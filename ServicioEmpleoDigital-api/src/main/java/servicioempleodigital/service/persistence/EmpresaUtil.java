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

package servicioempleodigital.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.util.tracker.ServiceTracker;

import servicioempleodigital.model.Empresa;

import java.util.List;

/**
 * The persistence utility for the empresa service. This utility wraps {@link servicioempleodigital.service.persistence.impl.EmpresaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see EmpresaPersistence
 * @see servicioempleodigital.service.persistence.impl.EmpresaPersistenceImpl
 * @generated
 */
@ProviderType
public class EmpresaUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Empresa empresa) {
		getPersistence().clearCache(empresa);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Empresa> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Empresa> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Empresa> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Empresa> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Empresa update(Empresa empresa) {
		return getPersistence().update(empresa);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Empresa update(Empresa empresa, ServiceContext serviceContext) {
		return getPersistence().update(empresa, serviceContext);
	}

	/**
	* Caches the empresa in the entity cache if it is enabled.
	*
	* @param empresa the empresa
	*/
	public static void cacheResult(Empresa empresa) {
		getPersistence().cacheResult(empresa);
	}

	/**
	* Caches the empresas in the entity cache if it is enabled.
	*
	* @param empresas the empresas
	*/
	public static void cacheResult(List<Empresa> empresas) {
		getPersistence().cacheResult(empresas);
	}

	/**
	* Creates a new empresa with the primary key. Does not add the empresa to the database.
	*
	* @param idEmpresa the primary key for the new empresa
	* @return the new empresa
	*/
	public static Empresa create(long idEmpresa) {
		return getPersistence().create(idEmpresa);
	}

	/**
	* Removes the empresa with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idEmpresa the primary key of the empresa
	* @return the empresa that was removed
	* @throws NoSuchEmpresaException if a empresa with the primary key could not be found
	*/
	public static Empresa remove(long idEmpresa)
		throws servicioempleodigital.exception.NoSuchEmpresaException {
		return getPersistence().remove(idEmpresa);
	}

	public static Empresa updateImpl(Empresa empresa) {
		return getPersistence().updateImpl(empresa);
	}

	/**
	* Returns the empresa with the primary key or throws a {@link NoSuchEmpresaException} if it could not be found.
	*
	* @param idEmpresa the primary key of the empresa
	* @return the empresa
	* @throws NoSuchEmpresaException if a empresa with the primary key could not be found
	*/
	public static Empresa findByPrimaryKey(long idEmpresa)
		throws servicioempleodigital.exception.NoSuchEmpresaException {
		return getPersistence().findByPrimaryKey(idEmpresa);
	}

	/**
	* Returns the empresa with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param idEmpresa the primary key of the empresa
	* @return the empresa, or <code>null</code> if a empresa with the primary key could not be found
	*/
	public static Empresa fetchByPrimaryKey(long idEmpresa) {
		return getPersistence().fetchByPrimaryKey(idEmpresa);
	}

	public static java.util.Map<java.io.Serializable, Empresa> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the empresas.
	*
	* @return the empresas
	*/
	public static List<Empresa> findAll() {
		return getPersistence().findAll();
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
	public static List<Empresa> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<Empresa> findAll(int start, int end,
		OrderByComparator<Empresa> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<Empresa> findAll(int start, int end,
		OrderByComparator<Empresa> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the empresas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of empresas.
	*
	* @return the number of empresas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static EmpresaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<EmpresaPersistence, EmpresaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(EmpresaPersistence.class);
}