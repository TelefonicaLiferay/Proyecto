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

import servicioempleodigital.model.Resultado;

import java.util.List;

/**
 * The persistence utility for the resultado service. This utility wraps {@link servicioempleodigital.service.persistence.impl.ResultadoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see ResultadoPersistence
 * @see servicioempleodigital.service.persistence.impl.ResultadoPersistenceImpl
 * @generated
 */
@ProviderType
public class ResultadoUtil {
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
	public static void clearCache(Resultado resultado) {
		getPersistence().clearCache(resultado);
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
	public static List<Resultado> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Resultado> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Resultado> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Resultado> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Resultado update(Resultado resultado) {
		return getPersistence().update(resultado);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Resultado update(Resultado resultado,
		ServiceContext serviceContext) {
		return getPersistence().update(resultado, serviceContext);
	}

	/**
	* Caches the resultado in the entity cache if it is enabled.
	*
	* @param resultado the resultado
	*/
	public static void cacheResult(Resultado resultado) {
		getPersistence().cacheResult(resultado);
	}

	/**
	* Caches the resultados in the entity cache if it is enabled.
	*
	* @param resultados the resultados
	*/
	public static void cacheResult(List<Resultado> resultados) {
		getPersistence().cacheResult(resultados);
	}

	/**
	* Creates a new resultado with the primary key. Does not add the resultado to the database.
	*
	* @param resultadoPK the primary key for the new resultado
	* @return the new resultado
	*/
	public static Resultado create(
		servicioempleodigital.service.persistence.ResultadoPK resultadoPK) {
		return getPersistence().create(resultadoPK);
	}

	/**
	* Removes the resultado with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param resultadoPK the primary key of the resultado
	* @return the resultado that was removed
	* @throws NoSuchResultadoException if a resultado with the primary key could not be found
	*/
	public static Resultado remove(
		servicioempleodigital.service.persistence.ResultadoPK resultadoPK)
		throws servicioempleodigital.exception.NoSuchResultadoException {
		return getPersistence().remove(resultadoPK);
	}

	public static Resultado updateImpl(Resultado resultado) {
		return getPersistence().updateImpl(resultado);
	}

	/**
	* Returns the resultado with the primary key or throws a {@link NoSuchResultadoException} if it could not be found.
	*
	* @param resultadoPK the primary key of the resultado
	* @return the resultado
	* @throws NoSuchResultadoException if a resultado with the primary key could not be found
	*/
	public static Resultado findByPrimaryKey(
		servicioempleodigital.service.persistence.ResultadoPK resultadoPK)
		throws servicioempleodigital.exception.NoSuchResultadoException {
		return getPersistence().findByPrimaryKey(resultadoPK);
	}

	/**
	* Returns the resultado with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param resultadoPK the primary key of the resultado
	* @return the resultado, or <code>null</code> if a resultado with the primary key could not be found
	*/
	public static Resultado fetchByPrimaryKey(
		servicioempleodigital.service.persistence.ResultadoPK resultadoPK) {
		return getPersistence().fetchByPrimaryKey(resultadoPK);
	}

	public static java.util.Map<java.io.Serializable, Resultado> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the resultados.
	*
	* @return the resultados
	*/
	public static List<Resultado> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the resultados.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultadoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of resultados
	* @param end the upper bound of the range of resultados (not inclusive)
	* @return the range of resultados
	*/
	public static List<Resultado> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the resultados.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultadoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of resultados
	* @param end the upper bound of the range of resultados (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of resultados
	*/
	public static List<Resultado> findAll(int start, int end,
		OrderByComparator<Resultado> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the resultados.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultadoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of resultados
	* @param end the upper bound of the range of resultados (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of resultados
	*/
	public static List<Resultado> findAll(int start, int end,
		OrderByComparator<Resultado> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the resultados from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of resultados.
	*
	* @return the number of resultados
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ResultadoPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ResultadoPersistence, ResultadoPersistence> _serviceTracker =
		ServiceTrackerFactory.open(ResultadoPersistence.class);
}