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

package servicioempleodigital.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Francisco de Borja Segovia Gilsanz
 * @generated
 */
@ProviderType
public class RespondidaPK implements Comparable<RespondidaPK>, Serializable {
	public long idRespuesta;
	public long idCandidato;

	public RespondidaPK() {
	}

	public RespondidaPK(long idRespuesta, long idCandidato) {
		this.idRespuesta = idRespuesta;
		this.idCandidato = idCandidato;
	}

	public long getIdRespuesta() {
		return idRespuesta;
	}

	public void setIdRespuesta(long idRespuesta) {
		this.idRespuesta = idRespuesta;
	}

	public long getIdCandidato() {
		return idCandidato;
	}

	public void setIdCandidato(long idCandidato) {
		this.idCandidato = idCandidato;
	}

	@Override
	public int compareTo(RespondidaPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (idRespuesta < pk.idRespuesta) {
			value = -1;
		}
		else if (idRespuesta > pk.idRespuesta) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		if (idCandidato < pk.idCandidato) {
			value = -1;
		}
		else if (idCandidato > pk.idCandidato) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RespondidaPK)) {
			return false;
		}

		RespondidaPK pk = (RespondidaPK)obj;

		if ((idRespuesta == pk.idRespuesta) && (idCandidato == pk.idCandidato)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		hashCode = HashUtil.hash(hashCode, idRespuesta);
		hashCode = HashUtil.hash(hashCode, idCandidato);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("idRespuesta");
		sb.append(StringPool.EQUAL);
		sb.append(idRespuesta);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("idCandidato");
		sb.append(StringPool.EQUAL);
		sb.append(idCandidato);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}