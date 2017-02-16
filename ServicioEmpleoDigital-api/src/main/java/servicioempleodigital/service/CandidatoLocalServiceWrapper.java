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
 * Provides a wrapper for {@link CandidatoLocalService}.
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see CandidatoLocalService
 * @generated
 */
@ProviderType
public class CandidatoLocalServiceWrapper implements CandidatoLocalService,
	ServiceWrapper<CandidatoLocalService> {
	public CandidatoLocalServiceWrapper(
		CandidatoLocalService candidatoLocalService) {
		_candidatoLocalService = candidatoLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _candidatoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _candidatoLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _candidatoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _candidatoLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _candidatoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of candidatos.
	*
	* @return the number of candidatos
	*/
	@Override
	public int getCandidatosCount() {
		return _candidatoLocalService.getCandidatosCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _candidatoLocalService.getOSGiServiceIdentifier();
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
		return _candidatoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link servicioempleodigital.model.impl.CandidatoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _candidatoLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link servicioempleodigital.model.impl.CandidatoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _candidatoLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the candidatos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link servicioempleodigital.model.impl.CandidatoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of candidatos
	* @param end the upper bound of the range of candidatos (not inclusive)
	* @return the range of candidatos
	*/
	@Override
	public java.util.List<servicioempleodigital.model.Candidato> getCandidatos(
		int start, int end) {
		return _candidatoLocalService.getCandidatos(start, end);
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
		return _candidatoLocalService.dynamicQueryCount(dynamicQuery);
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
		return _candidatoLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the candidato to the database. Also notifies the appropriate model listeners.
	*
	* @param candidato the candidato
	* @return the candidato that was added
	*/
	@Override
	public servicioempleodigital.model.Candidato addCandidato(
		servicioempleodigital.model.Candidato candidato) {
		return _candidatoLocalService.addCandidato(candidato);
	}

	/**
	* Creates a new candidato with the primary key. Does not add the candidato to the database.
	*
	* @param idCandidato the primary key for the new candidato
	* @return the new candidato
	*/
	@Override
	public servicioempleodigital.model.Candidato createCandidato(
		long idCandidato) {
		return _candidatoLocalService.createCandidato(idCandidato);
	}

	/**
	* Deletes the candidato with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idCandidato the primary key of the candidato
	* @return the candidato that was removed
	* @throws PortalException if a candidato with the primary key could not be found
	*/
	@Override
	public servicioempleodigital.model.Candidato deleteCandidato(
		long idCandidato)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _candidatoLocalService.deleteCandidato(idCandidato);
	}

	/**
	* Deletes the candidato from the database. Also notifies the appropriate model listeners.
	*
	* @param candidato the candidato
	* @return the candidato that was removed
	*/
	@Override
	public servicioempleodigital.model.Candidato deleteCandidato(
		servicioempleodigital.model.Candidato candidato) {
		return _candidatoLocalService.deleteCandidato(candidato);
	}

	@Override
	public servicioempleodigital.model.Candidato fetchCandidato(
		long idCandidato) {
		return _candidatoLocalService.fetchCandidato(idCandidato);
	}

	/**
	* Returns the candidato with the primary key.
	*
	* @param idCandidato the primary key of the candidato
	* @return the candidato
	* @throws PortalException if a candidato with the primary key could not be found
	*/
	@Override
	public servicioempleodigital.model.Candidato getCandidato(long idCandidato)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _candidatoLocalService.getCandidato(idCandidato);
	}

	/**
	* Updates the candidato in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param candidato the candidato
	* @return the candidato that was updated
	*/
	@Override
	public servicioempleodigital.model.Candidato updateCandidato(
		servicioempleodigital.model.Candidato candidato) {
		return _candidatoLocalService.updateCandidato(candidato);
	}

	@Override
	public CandidatoLocalService getWrappedService() {
		return _candidatoLocalService;
	}

	@Override
	public void setWrappedService(CandidatoLocalService candidatoLocalService) {
		_candidatoLocalService = candidatoLocalService;
	}

	private CandidatoLocalService _candidatoLocalService;
}