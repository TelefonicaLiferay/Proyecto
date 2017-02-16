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

package servicioempleodigital.model;

import aQute.bnd.annotation.ProviderType;

import servicioempleodigital.service.persistence.RespondidaPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link servicioempleodigital.service.http.RespondidaServiceSoap}.
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see servicioempleodigital.service.http.RespondidaServiceSoap
 * @generated
 */
@ProviderType
public class RespondidaSoap implements Serializable {
	public static RespondidaSoap toSoapModel(Respondida model) {
		RespondidaSoap soapModel = new RespondidaSoap();

		soapModel.setIdRespuesta(model.getIdRespuesta());
		soapModel.setIdCandidato(model.getIdCandidato());
		soapModel.setRespuesta(model.getRespuesta());
		soapModel.setRespondida(model.getRespondida());

		return soapModel;
	}

	public static RespondidaSoap[] toSoapModels(Respondida[] models) {
		RespondidaSoap[] soapModels = new RespondidaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RespondidaSoap[][] toSoapModels(Respondida[][] models) {
		RespondidaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RespondidaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RespondidaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RespondidaSoap[] toSoapModels(List<Respondida> models) {
		List<RespondidaSoap> soapModels = new ArrayList<RespondidaSoap>(models.size());

		for (Respondida model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RespondidaSoap[soapModels.size()]);
	}

	public RespondidaSoap() {
	}

	public RespondidaPK getPrimaryKey() {
		return new RespondidaPK(_idRespuesta, _idCandidato);
	}

	public void setPrimaryKey(RespondidaPK pk) {
		setIdRespuesta(pk.idRespuesta);
		setIdCandidato(pk.idCandidato);
	}

	public long getIdRespuesta() {
		return _idRespuesta;
	}

	public void setIdRespuesta(long idRespuesta) {
		_idRespuesta = idRespuesta;
	}

	public long getIdCandidato() {
		return _idCandidato;
	}

	public void setIdCandidato(long idCandidato) {
		_idCandidato = idCandidato;
	}

	public String getRespuesta() {
		return _respuesta;
	}

	public void setRespuesta(String respuesta) {
		_respuesta = respuesta;
	}

	public boolean getRespondida() {
		return _respondida;
	}

	public boolean isRespondida() {
		return _respondida;
	}

	public void setRespondida(boolean respondida) {
		_respondida = respondida;
	}

	private long _idRespuesta;
	private long _idCandidato;
	private String _respuesta;
	private boolean _respondida;
}