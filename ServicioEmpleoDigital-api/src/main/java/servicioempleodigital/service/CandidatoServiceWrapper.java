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
 * Provides a wrapper for {@link CandidatoService}.
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see CandidatoService
 * @generated
 */
@ProviderType
public class CandidatoServiceWrapper implements CandidatoService,
	ServiceWrapper<CandidatoService> {
	public CandidatoServiceWrapper(CandidatoService candidatoService) {
		_candidatoService = candidatoService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _candidatoService.getOSGiServiceIdentifier();
	}

	@Override
	public CandidatoService getWrappedService() {
		return _candidatoService;
	}

	@Override
	public void setWrappedService(CandidatoService candidatoService) {
		_candidatoService = candidatoService;
	}

	private CandidatoService _candidatoService;
}