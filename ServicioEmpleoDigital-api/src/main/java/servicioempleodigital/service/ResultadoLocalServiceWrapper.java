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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ResultadoLocalService}.
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see ResultadoLocalService
 * @generated
 */
@ProviderType
public class ResultadoLocalServiceWrapper implements ResultadoLocalService,
	ServiceWrapper<ResultadoLocalService> {
	public ResultadoLocalServiceWrapper(
		ResultadoLocalService resultadoLocalService) {
		_resultadoLocalService = resultadoLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _resultadoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _resultadoLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _resultadoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _resultadoLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _resultadoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of resultados.
	*
	* @return the number of resultados
	*/
	@Override
	public int getResultadosCount() {
		return _resultadoLocalService.getResultadosCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _resultadoLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _resultadoLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _resultadoLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _resultadoLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
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
	@Override
	public java.util.List<servicioempleodigital.model.Resultado> getResultados(
		int start, int end) {
		return _resultadoLocalService.getResultados(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _resultadoLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _resultadoLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the resultado to the database. Also notifies the appropriate model listeners.
	*
	* @param resultado the resultado
	* @return the resultado that was added
	*/
	@Override
	public servicioempleodigital.model.Resultado addResultado(
		servicioempleodigital.model.Resultado resultado) {
		return _resultadoLocalService.addResultado(resultado);
	}

	/**
	* Creates a new resultado with the primary key. Does not add the resultado to the database.
	*
	* @param resultadoPK the primary key for the new resultado
	* @return the new resultado
	*/
	@Override
	public servicioempleodigital.model.Resultado createResultado(
		servicioempleodigital.service.persistence.ResultadoPK resultadoPK) {
		return _resultadoLocalService.createResultado(resultadoPK);
	}

	/**
	* Deletes the resultado from the database. Also notifies the appropriate model listeners.
	*
	* @param resultado the resultado
	* @return the resultado that was removed
	*/
	@Override
	public servicioempleodigital.model.Resultado deleteResultado(
		servicioempleodigital.model.Resultado resultado) {
		return _resultadoLocalService.deleteResultado(resultado);
	}

	/**
	* Deletes the resultado with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param resultadoPK the primary key of the resultado
	* @return the resultado that was removed
	* @throws PortalException if a resultado with the primary key could not be found
	*/
	@Override
	public servicioempleodigital.model.Resultado deleteResultado(
		servicioempleodigital.service.persistence.ResultadoPK resultadoPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _resultadoLocalService.deleteResultado(resultadoPK);
	}

	@Override
	public servicioempleodigital.model.Resultado fetchResultado(
		servicioempleodigital.service.persistence.ResultadoPK resultadoPK) {
		return _resultadoLocalService.fetchResultado(resultadoPK);
	}

	/**
	* Returns the resultado with the primary key.
	*
	* @param resultadoPK the primary key of the resultado
	* @return the resultado
	* @throws PortalException if a resultado with the primary key could not be found
	*/
	@Override
	public servicioempleodigital.model.Resultado getResultado(
		servicioempleodigital.service.persistence.ResultadoPK resultadoPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _resultadoLocalService.getResultado(resultadoPK);
	}

	/**
	* Updates the resultado in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param resultado the resultado
	* @return the resultado that was updated
	*/
	@Override
	public servicioempleodigital.model.Resultado updateResultado(
		servicioempleodigital.model.Resultado resultado) {
		return _resultadoLocalService.updateResultado(resultado);
	}

	@Override
	public ResultadoLocalService getWrappedService() {
		return _resultadoLocalService;
	}

	@Override
	public void setWrappedService(ResultadoLocalService resultadoLocalService) {
		_resultadoLocalService = resultadoLocalService;
	}

	private ResultadoLocalService _resultadoLocalService;
}