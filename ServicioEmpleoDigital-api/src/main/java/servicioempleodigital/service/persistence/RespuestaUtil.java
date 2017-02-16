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

import servicioempleodigital.model.Respuesta;

import java.util.List;

/**
 * The persistence utility for the respuesta service. This utility wraps {@link servicioempleodigital.service.persistence.impl.RespuestaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see RespuestaPersistence
 * @see servicioempleodigital.service.persistence.impl.RespuestaPersistenceImpl
 * @generated
 */
@ProviderType
public class RespuestaUtil {
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
	public static void clearCache(Respuesta respuesta) {
		getPersistence().clearCache(respuesta);
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
	public static List<Respuesta> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Respuesta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Respuesta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Respuesta> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Respuesta update(Respuesta respuesta) {
		return getPersistence().update(respuesta);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Respuesta update(Respuesta respuesta,
		ServiceContext serviceContext) {
		return getPersistence().update(respuesta, serviceContext);
	}

	/**
	* Caches the respuesta in the entity cache if it is enabled.
	*
	* @param respuesta the respuesta
	*/
	public static void cacheResult(Respuesta respuesta) {
		getPersistence().cacheResult(respuesta);
	}

	/**
	* Caches the respuestas in the entity cache if it is enabled.
	*
	* @param respuestas the respuestas
	*/
	public static void cacheResult(List<Respuesta> respuestas) {
		getPersistence().cacheResult(respuestas);
	}

	/**
	* Creates a new respuesta with the primary key. Does not add the respuesta to the database.
	*
	* @param idRespuesta the primary key for the new respuesta
	* @return the new respuesta
	*/
	public static Respuesta create(long idRespuesta) {
		return getPersistence().create(idRespuesta);
	}

	/**
	* Removes the respuesta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idRespuesta the primary key of the respuesta
	* @return the respuesta that was removed
	* @throws NoSuchRespuestaException if a respuesta with the primary key could not be found
	*/
	public static Respuesta remove(long idRespuesta)
		throws servicioempleodigital.exception.NoSuchRespuestaException {
		return getPersistence().remove(idRespuesta);
	}

	public static Respuesta updateImpl(Respuesta respuesta) {
		return getPersistence().updateImpl(respuesta);
	}

	/**
	* Returns the respuesta with the primary key or throws a {@link NoSuchRespuestaException} if it could not be found.
	*
	* @param idRespuesta the primary key of the respuesta
	* @return the respuesta
	* @throws NoSuchRespuestaException if a respuesta with the primary key could not be found
	*/
	public static Respuesta findByPrimaryKey(long idRespuesta)
		throws servicioempleodigital.exception.NoSuchRespuestaException {
		return getPersistence().findByPrimaryKey(idRespuesta);
	}

	/**
	* Returns the respuesta with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param idRespuesta the primary key of the respuesta
	* @return the respuesta, or <code>null</code> if a respuesta with the primary key could not be found
	*/
	public static Respuesta fetchByPrimaryKey(long idRespuesta) {
		return getPersistence().fetchByPrimaryKey(idRespuesta);
	}

	public static java.util.Map<java.io.Serializable, Respuesta> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the respuestas.
	*
	* @return the respuestas
	*/
	public static List<Respuesta> findAll() {
		return getPersistence().findAll();
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
	public static List<Respuesta> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<Respuesta> findAll(int start, int end,
		OrderByComparator<Respuesta> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<Respuesta> findAll(int start, int end,
		OrderByComparator<Respuesta> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the respuestas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of respuestas.
	*
	* @return the number of respuestas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RespuestaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<RespuestaPersistence, RespuestaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(RespuestaPersistence.class);
}