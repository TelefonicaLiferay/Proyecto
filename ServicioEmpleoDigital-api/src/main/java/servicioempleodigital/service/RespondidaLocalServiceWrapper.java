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
 * Provides a wrapper for {@link RespondidaLocalService}.
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see RespondidaLocalService
 * @generated
 */
@ProviderType
public class RespondidaLocalServiceWrapper implements RespondidaLocalService,
	ServiceWrapper<RespondidaLocalService> {
	public RespondidaLocalServiceWrapper(
		RespondidaLocalService respondidaLocalService) {
		_respondidaLocalService = respondidaLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _respondidaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _respondidaLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _respondidaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _respondidaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _respondidaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of respondidas.
	*
	* @return the number of respondidas
	*/
	@Override
	public int getRespondidasCount() {
		return _respondidaLocalService.getRespondidasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _respondidaLocalService.getOSGiServiceIdentifier();
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
		return _respondidaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link servicioempleodigital.model.impl.RespondidaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _respondidaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link servicioempleodigital.model.impl.RespondidaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _respondidaLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the respondidas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link servicioempleodigital.model.impl.RespondidaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of respondidas
	* @param end the upper bound of the range of respondidas (not inclusive)
	* @return the range of respondidas
	*/
	@Override
	public java.util.List<servicioempleodigital.model.Respondida> getRespondidas(
		int start, int end) {
		return _respondidaLocalService.getRespondidas(start, end);
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
		return _respondidaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _respondidaLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	/**
	* Adds the respondida to the database. Also notifies the appropriate model listeners.
	*
	* @param respondida the respondida
	* @return the respondida that was added
	*/
	@Override
	public servicioempleodigital.model.Respondida addRespondida(
		servicioempleodigital.model.Respondida respondida) {
		return _respondidaLocalService.addRespondida(respondida);
	}

	/**
	* Creates a new respondida with the primary key. Does not add the respondida to the database.
	*
	* @param respondidaPK the primary key for the new respondida
	* @return the new respondida
	*/
	@Override
	public servicioempleodigital.model.Respondida createRespondida(
		servicioempleodigital.service.persistence.RespondidaPK respondidaPK) {
		return _respondidaLocalService.createRespondida(respondidaPK);
	}

	/**
	* Deletes the respondida from the database. Also notifies the appropriate model listeners.
	*
	* @param respondida the respondida
	* @return the respondida that was removed
	*/
	@Override
	public servicioempleodigital.model.Respondida deleteRespondida(
		servicioempleodigital.model.Respondida respondida) {
		return _respondidaLocalService.deleteRespondida(respondida);
	}

	/**
	* Deletes the respondida with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param respondidaPK the primary key of the respondida
	* @return the respondida that was removed
	* @throws PortalException if a respondida with the primary key could not be found
	*/
	@Override
	public servicioempleodigital.model.Respondida deleteRespondida(
		servicioempleodigital.service.persistence.RespondidaPK respondidaPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _respondidaLocalService.deleteRespondida(respondidaPK);
	}

	@Override
	public servicioempleodigital.model.Respondida fetchRespondida(
		servicioempleodigital.service.persistence.RespondidaPK respondidaPK) {
		return _respondidaLocalService.fetchRespondida(respondidaPK);
	}

	/**
	* Returns the respondida with the primary key.
	*
	* @param respondidaPK the primary key of the respondida
	* @return the respondida
	* @throws PortalException if a respondida with the primary key could not be found
	*/
	@Override
	public servicioempleodigital.model.Respondida getRespondida(
		servicioempleodigital.service.persistence.RespondidaPK respondidaPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _respondidaLocalService.getRespondida(respondidaPK);
	}

	/**
	* Updates the respondida in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param respondida the respondida
	* @return the respondida that was updated
	*/
	@Override
	public servicioempleodigital.model.Respondida updateRespondida(
		servicioempleodigital.model.Respondida respondida) {
		return _respondidaLocalService.updateRespondida(respondida);
	}

	@Override
	public RespondidaLocalService getWrappedService() {
		return _respondidaLocalService;
	}

	@Override
	public void setWrappedService(RespondidaLocalService respondidaLocalService) {
		_respondidaLocalService = respondidaLocalService;
	}

	private RespondidaLocalService _respondidaLocalService;
}