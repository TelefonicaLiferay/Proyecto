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

import servicioempleodigital.model.Oferta;

import java.util.List;

/**
 * The persistence utility for the oferta service. This utility wraps {@link servicioempleodigital.service.persistence.impl.OfertaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see OfertaPersistence
 * @see servicioempleodigital.service.persistence.impl.OfertaPersistenceImpl
 * @generated
 */
@ProviderType
public class OfertaUtil {
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
	public static void clearCache(Oferta oferta) {
		getPersistence().clearCache(oferta);
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
	public static List<Oferta> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Oferta> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Oferta> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<Oferta> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Oferta update(Oferta oferta) {
		return getPersistence().update(oferta);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Oferta update(Oferta oferta, ServiceContext serviceContext) {
		return getPersistence().update(oferta, serviceContext);
	}

	/**
	* Caches the oferta in the entity cache if it is enabled.
	*
	* @param oferta the oferta
	*/
	public static void cacheResult(Oferta oferta) {
		getPersistence().cacheResult(oferta);
	}

	/**
	* Caches the ofertas in the entity cache if it is enabled.
	*
	* @param ofertas the ofertas
	*/
	public static void cacheResult(List<Oferta> ofertas) {
		getPersistence().cacheResult(ofertas);
	}

	/**
	* Creates a new oferta with the primary key. Does not add the oferta to the database.
	*
	* @param idOferta the primary key for the new oferta
	* @return the new oferta
	*/
	public static Oferta create(long idOferta) {
		return getPersistence().create(idOferta);
	}

	/**
	* Removes the oferta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idOferta the primary key of the oferta
	* @return the oferta that was removed
	* @throws NoSuchOfertaException if a oferta with the primary key could not be found
	*/
	public static Oferta remove(long idOferta)
		throws servicioempleodigital.exception.NoSuchOfertaException {
		return getPersistence().remove(idOferta);
	}

	public static Oferta updateImpl(Oferta oferta) {
		return getPersistence().updateImpl(oferta);
	}

	/**
	* Returns the oferta with the primary key or throws a {@link NoSuchOfertaException} if it could not be found.
	*
	* @param idOferta the primary key of the oferta
	* @return the oferta
	* @throws NoSuchOfertaException if a oferta with the primary key could not be found
	*/
	public static Oferta findByPrimaryKey(long idOferta)
		throws servicioempleodigital.exception.NoSuchOfertaException {
		return getPersistence().findByPrimaryKey(idOferta);
	}

	/**
	* Returns the oferta with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param idOferta the primary key of the oferta
	* @return the oferta, or <code>null</code> if a oferta with the primary key could not be found
	*/
	public static Oferta fetchByPrimaryKey(long idOferta) {
		return getPersistence().fetchByPrimaryKey(idOferta);
	}

	public static java.util.Map<java.io.Serializable, Oferta> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the ofertas.
	*
	* @return the ofertas
	*/
	public static List<Oferta> findAll() {
		return getPersistence().findAll();
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
	public static List<Oferta> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<Oferta> findAll(int start, int end,
		OrderByComparator<Oferta> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<Oferta> findAll(int start, int end,
		OrderByComparator<Oferta> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the ofertas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of ofertas.
	*
	* @return the number of ofertas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OfertaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<OfertaPersistence, OfertaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(OfertaPersistence.class);
}