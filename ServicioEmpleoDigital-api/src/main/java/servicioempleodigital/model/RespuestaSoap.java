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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link servicioempleodigital.service.http.RespuestaServiceSoap}.
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see servicioempleodigital.service.http.RespuestaServiceSoap
 * @generated
 */
@ProviderType
public class RespuestaSoap implements Serializable {
	public static RespuestaSoap toSoapModel(Respuesta model) {
		RespuestaSoap soapModel = new RespuestaSoap();

		soapModel.setIdRespuesta(model.getIdRespuesta());
		soapModel.setRespuesta(model.getRespuesta());
		soapModel.setValor(model.getValor());
		soapModel.setIdPregunta(model.getIdPregunta());

		return soapModel;
	}

	public static RespuestaSoap[] toSoapModels(Respuesta[] models) {
		RespuestaSoap[] soapModels = new RespuestaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RespuestaSoap[][] toSoapModels(Respuesta[][] models) {
		RespuestaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RespuestaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RespuestaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RespuestaSoap[] toSoapModels(List<Respuesta> models) {
		List<RespuestaSoap> soapModels = new ArrayList<RespuestaSoap>(models.size());

		for (Respuesta model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RespuestaSoap[soapModels.size()]);
	}

	public RespuestaSoap() {
	}

	public long getPrimaryKey() {
		return _idRespuesta;
	}

	public void setPrimaryKey(long pk) {
		setIdRespuesta(pk);
	}

	public long getIdRespuesta() {
		return _idRespuesta;
	}

	public void setIdRespuesta(long idRespuesta) {
		_idRespuesta = idRespuesta;
	}

	public String getRespuesta() {
		return _respuesta;
	}

	public void setRespuesta(String respuesta) {
		_respuesta = respuesta;
	}

	public double getValor() {
		return _valor;
	}

	public void setValor(double valor) {
		_valor = valor;
	}

	public long getIdPregunta() {
		return _idPregunta;
	}

	public void setIdPregunta(long idPregunta) {
		_idPregunta = idPregunta;
	}

	private long _idRespuesta;
	private String _respuesta;
	private double _valor;
	private long _idPregunta;
}