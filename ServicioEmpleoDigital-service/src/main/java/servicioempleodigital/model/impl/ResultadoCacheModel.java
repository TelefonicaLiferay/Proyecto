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

package servicioempleodigital.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import servicioempleodigital.model.Resultado;

import servicioempleodigital.service.persistence.ResultadoPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Resultado in entity cache.
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see Resultado
 * @generated
 */
@ProviderType
public class ResultadoCacheModel implements CacheModel<Resultado>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ResultadoCacheModel)) {
			return false;
		}

		ResultadoCacheModel resultadoCacheModel = (ResultadoCacheModel)obj;

		if (resultadoPK.equals(resultadoCacheModel.resultadoPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, resultadoPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{puntuacion=");
		sb.append(puntuacion);
		sb.append(", idCandidato=");
		sb.append(idCandidato);
		sb.append(", idOferta=");
		sb.append(idOferta);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Resultado toEntityModel() {
		ResultadoImpl resultadoImpl = new ResultadoImpl();

		resultadoImpl.setPuntuacion(puntuacion);
		resultadoImpl.setIdCandidato(idCandidato);
		resultadoImpl.setIdOferta(idOferta);

		resultadoImpl.resetOriginalValues();

		return resultadoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		puntuacion = objectInput.readDouble();

		idCandidato = objectInput.readLong();

		idOferta = objectInput.readLong();

		resultadoPK = new ResultadoPK(idCandidato, idOferta);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeDouble(puntuacion);

		objectOutput.writeLong(idCandidato);

		objectOutput.writeLong(idOferta);
	}

	public double puntuacion;
	public long idCandidato;
	public long idOferta;
	public transient ResultadoPK resultadoPK;
}