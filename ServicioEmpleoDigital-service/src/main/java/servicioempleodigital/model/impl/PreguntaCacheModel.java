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

import servicioempleodigital.model.Pregunta;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Pregunta in entity cache.
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see Pregunta
 * @generated
 */
@ProviderType
public class PreguntaCacheModel implements CacheModel<Pregunta>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PreguntaCacheModel)) {
			return false;
		}

		PreguntaCacheModel preguntaCacheModel = (PreguntaCacheModel)obj;

		if (idPregunta == preguntaCacheModel.idPregunta) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, idPregunta);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{idPregunta=");
		sb.append(idPregunta);
		sb.append(", enunciado=");
		sb.append(enunciado);
		sb.append(", tipo=");
		sb.append(tipo);
		sb.append(", idOferta=");
		sb.append(idOferta);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Pregunta toEntityModel() {
		PreguntaImpl preguntaImpl = new PreguntaImpl();

		preguntaImpl.setIdPregunta(idPregunta);

		if (enunciado == null) {
			preguntaImpl.setEnunciado(StringPool.BLANK);
		}
		else {
			preguntaImpl.setEnunciado(enunciado);
		}

		preguntaImpl.setTipo(tipo);
		preguntaImpl.setIdOferta(idOferta);

		preguntaImpl.resetOriginalValues();

		return preguntaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		idPregunta = objectInput.readLong();
		enunciado = objectInput.readUTF();

		tipo = objectInput.readInt();

		idOferta = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(idPregunta);

		if (enunciado == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(enunciado);
		}

		objectOutput.writeInt(tipo);

		objectOutput.writeLong(idOferta);
	}

	public long idPregunta;
	public String enunciado;
	public int tipo;
	public long idOferta;
}