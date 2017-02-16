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
public class ResultadoPK implements Comparable<ResultadoPK>, Serializable {
	public long idCandidato;
	public long idOferta;

	public ResultadoPK() {
	}

	public ResultadoPK(long idCandidato, long idOferta) {
		this.idCandidato = idCandidato;
		this.idOferta = idOferta;
	}

	public long getIdCandidato() {
		return idCandidato;
	}

	public void setIdCandidato(long idCandidato) {
		this.idCandidato = idCandidato;
	}

	public long getIdOferta() {
		return idOferta;
	}

	public void setIdOferta(long idOferta) {
		this.idOferta = idOferta;
	}

	@Override
	public int compareTo(ResultadoPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

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

		if (idOferta < pk.idOferta) {
			value = -1;
		}
		else if (idOferta > pk.idOferta) {
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

		if (!(obj instanceof ResultadoPK)) {
			return false;
		}

		ResultadoPK pk = (ResultadoPK)obj;

		if ((idCandidato == pk.idCandidato) && (idOferta == pk.idOferta)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		hashCode = HashUtil.hash(hashCode, idCandidato);
		hashCode = HashUtil.hash(hashCode, idOferta);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(10);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("idCandidato");
		sb.append(StringPool.EQUAL);
		sb.append(idCandidato);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("idOferta");
		sb.append(StringPool.EQUAL);
		sb.append(idOferta);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}