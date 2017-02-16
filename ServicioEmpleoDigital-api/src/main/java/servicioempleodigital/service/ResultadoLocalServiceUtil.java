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

package servicioempleodigital.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Resultado. This utility wraps
 * {@link servicioempleodigital.service.impl.ResultadoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see ResultadoLocalService
 * @see servicioempleodigital.service.base.ResultadoLocalServiceBaseImpl
 * @see servicioempleodigital.service.impl.ResultadoLocalServiceImpl
 * @generated
 */
@ProviderType
public class ResultadoLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link servicioempleodigital.service.impl.ResultadoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of resultados.
	*
	* @return the number of resultados
	*/
	public static int getResultadosCount() {
		return getService().getResultadosCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link servicioempleodigital.model.impl.ResultadoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link servicioempleodigital.model.impl.ResultadoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns a range of all the resultados.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link servicioempleodigital.model.impl.ResultadoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of resultados
	* @param end the upper bound of the range of resultados (not inclusive)
	* @return the range of resultados
	*/
	public static java.util.List<servicioempleodigital.model.Resultado> getResultados(
		int start, int end) {
		return getService().getResultados(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the resultado to the database. Also notifies the appropriate model listeners.
	*
	* @param resultado the resultado
	* @return the resultado that was added
	*/
	public static servicioempleodigital.model.Resultado addResultado(
		servicioempleodigital.model.Resultado resultado) {
		return getService().addResultado(resultado);
	}

	/**
	* Creates a new resultado with the primary key. Does not add the resultado to the database.
	*
	* @param resultadoPK the primary key for the new resultado
	* @return the new resultado
	*/
	public static servicioempleodigital.model.Resultado createResultado(
		servicioempleodigital.service.persistence.ResultadoPK resultadoPK) {
		return getService().createResultado(resultadoPK);
	}

	/**
	* Deletes the resultado from the database. Also notifies the appropriate model listeners.
	*
	* @param resultado the resultado
	* @return the resultado that was removed
	*/
	public static servicioempleodigital.model.Resultado deleteResultado(
		servicioempleodigital.model.Resultado resultado) {
		return getService().deleteResultado(resultado);
	}

	/**
	* Deletes the resultado with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param resultadoPK the primary key of the resultado
	* @return the resultado that was removed
	* @throws PortalException if a resultado with the primary key could not be found
	*/
	public static servicioempleodigital.model.Resultado deleteResultado(
		servicioempleodigital.service.persistence.ResultadoPK resultadoPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteResultado(resultadoPK);
	}

	public static servicioempleodigital.model.Resultado fetchResultado(
		servicioempleodigital.service.persistence.ResultadoPK resultadoPK) {
		return getService().fetchResultado(resultadoPK);
	}

	/**
	* Returns the resultado with the primary key.
	*
	* @param resultadoPK the primary key of the resultado
	* @return the resultado
	* @throws PortalException if a resultado with the primary key could not be found
	*/
	public static servicioempleodigital.model.Resultado getResultado(
		servicioempleodigital.service.persistence.ResultadoPK resultadoPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getResultado(resultadoPK);
	}

	/**
	* Updates the resultado in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param resultado the resultado
	* @return the resultado that was updated
	*/
	public static servicioempleodigital.model.Resultado updateResultado(
		servicioempleodigital.model.Resultado resultado) {
		return getService().updateResultado(resultado);
	}

	public static ResultadoLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ResultadoLocalService, ResultadoLocalService> _serviceTracker =
		ServiceTrackerFactory.open(ResultadoLocalService.class);
}