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
 * Provides a wrapper for {@link OfertaLocalService}.
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see OfertaLocalService
 * @generated
 */
@ProviderType
public class OfertaLocalServiceWrapper implements OfertaLocalService,
	ServiceWrapper<OfertaLocalService> {
	public OfertaLocalServiceWrapper(OfertaLocalService ofertaLocalService) {
		_ofertaLocalService = ofertaLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _ofertaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _ofertaLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _ofertaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ofertaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ofertaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of ofertas.
	*
	* @return the number of ofertas
	*/
	@Override
	public int getOfertasCount() {
		return _ofertaLocalService.getOfertasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _ofertaLocalService.getOSGiServiceIdentifier();
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
		return _ofertaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link servicioempleodigital.model.impl.OfertaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _ofertaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link servicioempleodigital.model.impl.OfertaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _ofertaLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the ofertas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link servicioempleodigital.model.impl.OfertaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ofertas
	* @param end the upper bound of the range of ofertas (not inclusive)
	* @return the range of ofertas
	*/
	@Override
	public java.util.List<servicioempleodigital.model.Oferta> getOfertas(
		int start, int end) {
		return _ofertaLocalService.getOfertas(start, end);
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
		return _ofertaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _ofertaLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the oferta to the database. Also notifies the appropriate model listeners.
	*
	* @param oferta the oferta
	* @return the oferta that was added
	*/
	@Override
	public servicioempleodigital.model.Oferta addOferta(
		servicioempleodigital.model.Oferta oferta) {
		return _ofertaLocalService.addOferta(oferta);
	}

	/**
	* Creates a new oferta with the primary key. Does not add the oferta to the database.
	*
	* @param idOferta the primary key for the new oferta
	* @return the new oferta
	*/
	@Override
	public servicioempleodigital.model.Oferta createOferta(long idOferta) {
		return _ofertaLocalService.createOferta(idOferta);
	}

	/**
	* Deletes the oferta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idOferta the primary key of the oferta
	* @return the oferta that was removed
	* @throws PortalException if a oferta with the primary key could not be found
	*/
	@Override
	public servicioempleodigital.model.Oferta deleteOferta(long idOferta)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ofertaLocalService.deleteOferta(idOferta);
	}

	/**
	* Deletes the oferta from the database. Also notifies the appropriate model listeners.
	*
	* @param oferta the oferta
	* @return the oferta that was removed
	*/
	@Override
	public servicioempleodigital.model.Oferta deleteOferta(
		servicioempleodigital.model.Oferta oferta) {
		return _ofertaLocalService.deleteOferta(oferta);
	}

	@Override
	public servicioempleodigital.model.Oferta fetchOferta(long idOferta) {
		return _ofertaLocalService.fetchOferta(idOferta);
	}

	/**
	* Returns the oferta with the primary key.
	*
	* @param idOferta the primary key of the oferta
	* @return the oferta
	* @throws PortalException if a oferta with the primary key could not be found
	*/
	@Override
	public servicioempleodigital.model.Oferta getOferta(long idOferta)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _ofertaLocalService.getOferta(idOferta);
	}

	/**
	* Updates the oferta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param oferta the oferta
	* @return the oferta that was updated
	*/
	@Override
	public servicioempleodigital.model.Oferta updateOferta(
		servicioempleodigital.model.Oferta oferta) {
		return _ofertaLocalService.updateOferta(oferta);
	}

	@Override
	public OfertaLocalService getWrappedService() {
		return _ofertaLocalService;
	}

	@Override
	public void setWrappedService(OfertaLocalService ofertaLocalService) {
		_ofertaLocalService = ofertaLocalService;
	}

	private OfertaLocalService _ofertaLocalService;
}