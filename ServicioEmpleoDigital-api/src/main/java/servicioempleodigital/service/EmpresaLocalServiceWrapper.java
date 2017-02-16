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
 * Provides a wrapper for {@link EmpresaLocalService}.
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see EmpresaLocalService
 * @generated
 */
@ProviderType
public class EmpresaLocalServiceWrapper implements EmpresaLocalService,
	ServiceWrapper<EmpresaLocalService> {
	public EmpresaLocalServiceWrapper(EmpresaLocalService empresaLocalService) {
		_empresaLocalService = empresaLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _empresaLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _empresaLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _empresaLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _empresaLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _empresaLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of empresas.
	*
	* @return the number of empresas
	*/
	@Override
	public int getEmpresasCount() {
		return _empresaLocalService.getEmpresasCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _empresaLocalService.getOSGiServiceIdentifier();
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
		return _empresaLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link servicioempleodigital.model.impl.EmpresaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _empresaLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link servicioempleodigital.model.impl.EmpresaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _empresaLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the empresas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link servicioempleodigital.model.impl.EmpresaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of empresas
	* @param end the upper bound of the range of empresas (not inclusive)
	* @return the range of empresas
	*/
	@Override
	public java.util.List<servicioempleodigital.model.Empresa> getEmpresas(
		int start, int end) {
		return _empresaLocalService.getEmpresas(start, end);
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
		return _empresaLocalService.dynamicQueryCount(dynamicQuery);
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
		return _empresaLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	/**
	* Adds the empresa to the database. Also notifies the appropriate model listeners.
	*
	* @param empresa the empresa
	* @return the empresa that was added
	*/
	@Override
	public servicioempleodigital.model.Empresa addEmpresa(
		servicioempleodigital.model.Empresa empresa) {
		return _empresaLocalService.addEmpresa(empresa);
	}

	/**
	* Creates a new empresa with the primary key. Does not add the empresa to the database.
	*
	* @param idEmpresa the primary key for the new empresa
	* @return the new empresa
	*/
	@Override
	public servicioempleodigital.model.Empresa createEmpresa(long idEmpresa) {
		return _empresaLocalService.createEmpresa(idEmpresa);
	}

	/**
	* Deletes the empresa with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idEmpresa the primary key of the empresa
	* @return the empresa that was removed
	* @throws PortalException if a empresa with the primary key could not be found
	*/
	@Override
	public servicioempleodigital.model.Empresa deleteEmpresa(long idEmpresa)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _empresaLocalService.deleteEmpresa(idEmpresa);
	}

	/**
	* Deletes the empresa from the database. Also notifies the appropriate model listeners.
	*
	* @param empresa the empresa
	* @return the empresa that was removed
	*/
	@Override
	public servicioempleodigital.model.Empresa deleteEmpresa(
		servicioempleodigital.model.Empresa empresa) {
		return _empresaLocalService.deleteEmpresa(empresa);
	}

	@Override
	public servicioempleodigital.model.Empresa fetchEmpresa(long idEmpresa) {
		return _empresaLocalService.fetchEmpresa(idEmpresa);
	}

	/**
	* Returns the empresa with the primary key.
	*
	* @param idEmpresa the primary key of the empresa
	* @return the empresa
	* @throws PortalException if a empresa with the primary key could not be found
	*/
	@Override
	public servicioempleodigital.model.Empresa getEmpresa(long idEmpresa)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _empresaLocalService.getEmpresa(idEmpresa);
	}

	/**
	* Updates the empresa in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param empresa the empresa
	* @return the empresa that was updated
	*/
	@Override
	public servicioempleodigital.model.Empresa updateEmpresa(
		servicioempleodigital.model.Empresa empresa) {
		return _empresaLocalService.updateEmpresa(empresa);
	}

	@Override
	public EmpresaLocalService getWrappedService() {
		return _empresaLocalService;
	}

	@Override
	public void setWrappedService(EmpresaLocalService empresaLocalService) {
		_empresaLocalService = empresaLocalService;
	}

	private EmpresaLocalService _empresaLocalService;
}