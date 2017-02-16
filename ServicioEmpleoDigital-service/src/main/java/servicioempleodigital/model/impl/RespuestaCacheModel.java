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
import com.liferay.portal.kernel.util.StringPool;

import servicioempleodigital.model.Respuesta;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Respuesta in entity cache.
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see Respuesta
 * @generated
 */
@ProviderType
public class RespuestaCacheModel implements CacheModel<Respuesta>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RespuestaCacheModel)) {
			return false;
		}

		RespuestaCacheModel respuestaCacheModel = (RespuestaCacheModel)obj;

		if (idRespuesta == respuestaCacheModel.idRespuesta) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, idRespuesta);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{idRespuesta=");
		sb.append(idRespuesta);
		sb.append(", respuesta=");
		sb.append(respuesta);
		sb.append(", valor=");
		sb.append(valor);
		sb.append(", idPregunta=");
		sb.append(idPregunta);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Respuesta toEntityModel() {
		RespuestaImpl respuestaImpl = new RespuestaImpl();

		respuestaImpl.setIdRespuesta(idRespuesta);

		if (respuesta == null) {
			respuestaImpl.setRespuesta(StringPool.BLANK);
		}
		else {
			respuestaImpl.setRespuesta(respuesta);
		}

		respuestaImpl.setValor(valor);
		respuestaImpl.setIdPregunta(idPregunta);

		respuestaImpl.resetOriginalValues();

		return respuestaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		idRespuesta = objectInput.readLong();
		respuesta = objectInput.readUTF();

		valor = objectInput.readDouble();

		idPregunta = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(idRespuesta);

		if (respuesta == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(respuesta);
		}

		objectOutput.writeDouble(valor);

		objectOutput.writeLong(idPregunta);
	}

	public long idRespuesta;
	public String respuesta;
	public double valor;
	public long idPregunta;
}