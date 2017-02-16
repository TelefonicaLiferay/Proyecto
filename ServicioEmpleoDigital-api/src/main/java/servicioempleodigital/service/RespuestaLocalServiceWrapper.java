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
 * Provides a wrapper for {@link RespuestaLocalService}.
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see RespuestaLocalService
 * @generated
 */
@ProviderType
public class RespuestaLocalServiceWrapper implements RespuestaLocalService,
	ServiceWrapper<RespuestaLocalService> {
	public RespuestaLocalServiceWrapper(
		RespuestaLocalService respuestaLocalService) {
		_respuestaLocalService = respuestaLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _respuestaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _respuestaLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _respuestaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _respuestaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _respuestaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of respuestas.
	*
	* @return the number of respuestas
	*/
	@Override
	public int getRespuestasCount() {
		return _respuestaLocalService.getRespuestasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _respuestaLocalService.getOSGiServiceIdentifier();
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
		return _respuestaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link servicioempleodigital.model.impl.RespuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _respuestaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link servicioempleodigital.model.impl.RespuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _respuestaLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the respuestas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link servicioempleodigital.model.impl.RespuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of respuestas
	* @param end the upper bound of the range of respuestas (not inclusive)
	* @return the range of respuestas
	*/
	@Override
	public java.util.List<servicioempleodigital.model.Respuesta> getRespuestas(
		int start, int end) {
		return _respuestaLocalService.getRespuestas(start, end);
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
		return _respuestaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _respuestaLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the respuesta to the database. Also notifies the appropriate model listeners.
	*
	* @param respuesta the respuesta
	* @return the respuesta that was added
	*/
	@Override
	public servicioempleodigital.model.Respuesta addRespuesta(
		servicioempleodigital.model.Respuesta respuesta) {
		return _respuestaLocalService.addRespuesta(respuesta);
	}

	/**
	* Creates a new respuesta with the primary key. Does not add the respuesta to the database.
	*
	* @param idRespuesta the primary key for the new respuesta
	* @return the new respuesta
	*/
	@Override
	public servicioempleodigital.model.Respuesta createRespuesta(
		long idRespuesta) {
		return _respuestaLocalService.createRespuesta(idRespuesta);
	}

	/**
	* Deletes the respuesta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idRespuesta the primary key of the respuesta
	* @return the respuesta that was removed
	* @throws PortalException if a respuesta with the primary key could not be found
	*/
	@Override
	public servicioempleodigital.model.Respuesta deleteRespuesta(
		long idRespuesta)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _respuestaLocalService.deleteRespuesta(idRespuesta);
	}

	/**
	* Deletes the respuesta from the database. Also notifies the appropriate model listeners.
	*
	* @param respuesta the respuesta
	* @return the respuesta that was removed
	*/
	@Override
	public servicioempleodigital.model.Respuesta deleteRespuesta(
		servicioempleodigital.model.Respuesta respuesta) {
		return _respuestaLocalService.deleteRespuesta(respuesta);
	}

	@Override
	public servicioempleodigital.model.Respuesta fetchRespuesta(
		long idRespuesta) {
		return _respuestaLocalService.fetchRespuesta(idRespuesta);
	}

	/**
	* Returns the respuesta with the primary key.
	*
	* @param idRespuesta the primary key of the respuesta
	* @return the respuesta
	* @throws PortalException if a respuesta with the primary key could not be found
	*/
	@Override
	public servicioempleodigital.model.Respuesta getRespuesta(long idRespuesta)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _respuestaLocalService.getRespuesta(idRespuesta);
	}

	/**
	* Updates the respuesta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param respuesta the respuesta
	* @return the respuesta that was updated
	*/
	@Override
	public servicioempleodigital.model.Respuesta updateRespuesta(
		servicioempleodigital.model.Respuesta respuesta) {
		return _respuestaLocalService.updateRespuesta(respuesta);
	}

	@Override
	public RespuestaLocalService getWrappedService() {
		return _respuestaLocalService;
	}

	@Override
	public void setWrappedService(RespuestaLocalService respuestaLocalService) {
		_respuestaLocalService = respuestaLocalService;
	}

	private RespuestaLocalService _respuestaLocalService;
}