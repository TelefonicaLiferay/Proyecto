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

import servicioempleodigital.service.persistence.ResultadoPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link servicioempleodigital.service.http.ResultadoServiceSoap}.
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see servicioempleodigital.service.http.ResultadoServiceSoap
 * @generated
 */
@ProviderType
public class ResultadoSoap implements Serializable {
	public static ResultadoSoap toSoapModel(Resultado model) {
		ResultadoSoap soapModel = new ResultadoSoap();

		soapModel.setPuntuacion(model.getPuntuacion());
		soapModel.setIdCandidato(model.getIdCandidato());
		soapModel.setIdOferta(model.getIdOferta());

		return soapModel;
	}

	public static ResultadoSoap[] toSoapModels(Resultado[] models) {
		ResultadoSoap[] soapModels = new ResultadoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ResultadoSoap[][] toSoapModels(Resultado[][] models) {
		ResultadoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ResultadoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ResultadoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ResultadoSoap[] toSoapModels(List<Resultado> models) {
		List<ResultadoSoap> soapModels = new ArrayList<ResultadoSoap>(models.size());

		for (Resultado model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ResultadoSoap[soapModels.size()]);
	}

	public ResultadoSoap() {
	}

	public ResultadoPK getPrimaryKey() {
		return new ResultadoPK(_idCandidato, _idOferta);
	}

	public void setPrimaryKey(ResultadoPK pk) {
		setIdCandidato(pk.idCandidato);
		setIdOferta(pk.idOferta);
	}

	public double getPuntuacion() {
		return _puntuacion;
	}

	public void setPuntuacion(double puntuacion) {
		_puntuacion = puntuacion;
	}

	public long getIdCandidato() {
		return _idCandidato;
	}

	public void setIdCandidato(long idCandidato) {
		_idCandidato = idCandidato;
	}

	public long getIdOferta() {
		return _idOferta;
	}

	public void setIdOferta(long idOferta) {
		_idOferta = idOferta;
	}

	private double _puntuacion;
	private long _idCandidato;
	private long _idOferta;
}