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

import servicioempleodigital.model.Pregunta;

import java.util.List;

/**
 * The persistence utility for the pregunta service. This utility wraps {@link servicioempleodigital.service.persistence.impl.PreguntaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see PreguntaPersistence
 * @see servicioempleodigital.service.persistence.impl.PreguntaPersistenceImpl
 * @generated
 */
@ProviderType
public class PreguntaUtil {
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
	public static void clearCache(Pregunta pregunta) {
		getPersistence().clearCache(pregunta);
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
	public static List<Pregunta> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Pregunta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Pregunta> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Pregunta> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Pregunta update(Pregunta pregunta) {
		return getPersistence().update(pregunta);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Pregunta update(Pregunta pregunta,
		ServiceContext serviceContext) {
		return getPersistence().update(pregunta, serviceContext);
	}

	/**
	* Caches the pregunta in the entity cache if it is enabled.
	*
	* @param pregunta the pregunta
	*/
	public static void cacheResult(Pregunta pregunta) {
		getPersistence().cacheResult(pregunta);
	}

	/**
	* Caches the preguntas in the entity cache if it is enabled.
	*
	* @param preguntas the preguntas
	*/
	public static void cacheResult(List<Pregunta> preguntas) {
		getPersistence().cacheResult(preguntas);
	}

	/**
	* Creates a new pregunta with the primary key. Does not add the pregunta to the database.
	*
	* @param idPregunta the primary key for the new pregunta
	* @return the new pregunta
	*/
	public static Pregunta create(long idPregunta) {
		return getPersistence().create(idPregunta);
	}

	/**
	* Removes the pregunta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idPregunta the primary key of the pregunta
	* @return the pregunta that was removed
	* @throws NoSuchPreguntaException if a pregunta with the primary key could not be found
	*/
	public static Pregunta remove(long idPregunta)
		throws servicioempleodigital.exception.NoSuchPreguntaException {
		return getPersistence().remove(idPregunta);
	}

	public static Pregunta updateImpl(Pregunta pregunta) {
		return getPersistence().updateImpl(pregunta);
	}

	/**
	* Returns the pregunta with the primary key or throws a {@link NoSuchPreguntaException} if it could not be found.
	*
	* @param idPregunta the primary key of the pregunta
	* @return the pregunta
	* @throws NoSuchPreguntaException if a pregunta with the primary key could not be found
	*/
	public static Pregunta findByPrimaryKey(long idPregunta)
		throws servicioempleodigital.exception.NoSuchPreguntaException {
		return getPersistence().findByPrimaryKey(idPregunta);
	}

	/**
	* Returns the pregunta with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param idPregunta the primary key of the pregunta
	* @return the pregunta, or <code>null</code> if a pregunta with the primary key could not be found
	*/
	public static Pregunta fetchByPrimaryKey(long idPregunta) {
		return getPersistence().fetchByPrimaryKey(idPregunta);
	}

	public static java.util.Map<java.io.Serializable, Pregunta> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the preguntas.
	*
	* @return the preguntas
	*/
	public static List<Pregunta> findAll() {
		return getPersistence().findAll();
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
	public static List<Pregunta> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<Pregunta> findAll(int start, int end,
		OrderByComparator<Pregunta> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<Pregunta> findAll(int start, int end,
		OrderByComparator<Pregunta> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the preguntas from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of preguntas.
	*
	* @return the number of preguntas
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static PreguntaPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<PreguntaPersistence, PreguntaPersistence> _serviceTracker =
		ServiceTrackerFactory.open(PreguntaPersistence.class);
}