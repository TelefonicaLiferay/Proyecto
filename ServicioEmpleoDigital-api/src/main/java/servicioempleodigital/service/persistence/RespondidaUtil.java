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

import servicioempleodigital.model.Respondida;

import java.util.List;

/**
 * The persistence utility for the respondida service. This utility wraps {@link servicioempleodigital.service.persistence.impl.RespondidaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see RespondidaPersistence
 * @see servicioempleodigital.service.persistence.impl.RespondidaPersistenceImpl
 * @generated
 */
@ProviderType
public class RespondidaUtil {
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
	public static void clearCache(Respondida respondida) {
		getPersistence().clearCache(respondida);
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
	public static List<Respondida> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Respondida> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Respondida> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Respondida> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Respondida update(Respondida respondida) {
		return getPersistence().update(respondida);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Respondida update(Respondida respondida,
		ServiceContext serviceContext) {
		return getPersistence().update(respondida, serviceContext);
	}

	/**
	* Caches the respondida in the entity cache if it is enabled.
	*
	* @param respondida the respondida
	*/
	public static void cacheResult(Respondida respondida) {
		getPersistence().cacheResult(respondida);
	}

	/**
	* Caches the respondidas in the entity cache if it is enabled.
	*
	* @param respondidas the respondidas
	*/
	public static void cacheResult(List<Respondida> respondidas) {
		getPersistence().cacheResult(respondidas);
	}

	/**
	* Creates a new respondida with the primary key. Does not add the respondida to the database.
	*
	* @param respondidaPK the primary key for the new respondida
	* @return the new respondida
	*/
	public static Respondida create(
		servicioempleodigital.service.persistence.RespondidaPK respondidaPK) {
		return getPersistence().create(respondidaPK);
	}

	/**
	* Removes the respondida with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param respondidaPK the primary key of the respondida
	* @return the respondida that was removed
	* @throws NoSuchRespondidaException if a respondida with the primary key could not be found
	*/
	public static Respondida remove(
		servicioempleodigital.service.persistence.RespondidaPK respondidaPK)
		throws servicioempleodigital.exception.NoSuchRespondidaException {
		return getPersistence().remove(respondidaPK);
	}

	public static Respondida updateImpl(Respondida respondida) {
		return getPersistence().updateImpl(respondida);
	}

	/**
	* Returns the respondida with the primary key or throws a {@link NoSuchRespondidaException} if it could not be found.
	*
	* @param respondidaPK the primary key of the respondida
	* @return the respondida
	* @throws NoSuchRespondidaException if a respondida with the primary key could not be found
	*/
	public static Respondida findByPrimaryKey(
		servicioempleodigital.service.persistence.RespondidaPK respondidaPK)
		throws servicioempleodigital.exception.NoSuchRespondidaException {
		return getPersistence().findByPrimaryKey(respondidaPK);
	}

	/**
	* Returns the respondida with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param respondidaPK the primary key of the respondida
	* @return the respondida, or <code>null</code> if a respondida with the primary key could not be found
	*/
	public static Respondida fetchByPrimaryKey(
		servicioempleodigital.service.persistence.RespondidaPK respondidaPK) {
		return getPersistence().fetchByPrimaryKey(respondidaPK);
	}

	public static java.util.Map<java.io.Serializable, Respondida> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the respondidas.
	*
	* @return the respondidas
	*/
	public static List<Respondida> findAll() {
		return getPersistence().findAll();
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
	public static List<Respondida> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<Respondida> findAll(int start, int end,
		OrderByComparator<Respondida> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<Respondida> findAll(int start, int end,
		OrderByComparator<Respondida> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the respondidas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of respondidas.
	*
	* @return the number of respondidas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RespondidaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RespondidaPersistence, RespondidaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(RespondidaPersistence.class);
}