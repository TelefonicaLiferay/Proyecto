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

import servicioempleodigital.model.Respondida;

import servicioempleodigital.service.persistence.RespondidaPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Respondida in entity cache.
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see Respondida
 * @generated
 */
@ProviderType
public class RespondidaCacheModel implements CacheModel<Respondida>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RespondidaCacheModel)) {
			return false;
		}

		RespondidaCacheModel respondidaCacheModel = (RespondidaCacheModel)obj;

		if (respondidaPK.equals(respondidaCacheModel.respondidaPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, respondidaPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{idRespuesta=");
		sb.append(idRespuesta);
		sb.append(", idCandidato=");
		sb.append(idCandidato);
		sb.append(", respuesta=");
		sb.append(respuesta);
		sb.append(", respondida=");
		sb.append(respondida);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Respondida toEntityModel() {
		RespondidaImpl respondidaImpl = new RespondidaImpl();

		respondidaImpl.setIdRespuesta(idRespuesta);
		respondidaImpl.setIdCandidato(idCandidato);

		if (respuesta == null) {
			respondidaImpl.setRespuesta(StringPool.BLANK);
		}
		else {
			respondidaImpl.setRespuesta(respuesta);
		}

		respondidaImpl.setRespondida(respondida);

		respondidaImpl.resetOriginalValues();

		return respondidaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		idRespuesta = objectInput.readLong();

		idCandidato = objectInput.readLong();
		respuesta = objectInput.readUTF();

		respondida = objectInput.readBoolean();

		respondidaPK = new RespondidaPK(idRespuesta, idCandidato);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(idRespuesta);

		objectOutput.writeLong(idCandidato);

		if (respuesta == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(respuesta);
		}

		objectOutput.writeBoolean(respondida);
	}

	public long idRespuesta;
	public long idCandidato;
	public String respuesta;
	public boolean respondida;
	public transient RespondidaPK respondidaPK;
}