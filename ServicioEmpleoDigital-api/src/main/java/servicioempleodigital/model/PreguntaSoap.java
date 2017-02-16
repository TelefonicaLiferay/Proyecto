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
 * This class is used by SOAP remote services, specifically {@link servicioempleodigital.service.http.PreguntaServiceSoap}.
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see servicioempleodigital.service.http.PreguntaServiceSoap
 * @generated
 */
@ProviderType
public class PreguntaSoap implements Serializable {
	public static PreguntaSoap toSoapModel(Pregunta model) {
		PreguntaSoap soapModel = new PreguntaSoap();

		soapModel.setIdPregunta(model.getIdPregunta());
		soapModel.setEnunciado(model.getEnunciado());
		soapModel.setTipo(model.getTipo());
		soapModel.setIdOferta(model.getIdOferta());

		return soapModel;
	}

	public static PreguntaSoap[] toSoapModels(Pregunta[] models) {
		PreguntaSoap[] soapModels = new PreguntaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static PreguntaSoap[][] toSoapModels(Pregunta[][] models) {
		PreguntaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new PreguntaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new PreguntaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static PreguntaSoap[] toSoapModels(List<Pregunta> models) {
		List<PreguntaSoap> soapModels = new ArrayList<PreguntaSoap>(models.size());

		for (Pregunta model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new PreguntaSoap[soapModels.size()]);
	}

	public PreguntaSoap() {
	}

	public long getPrimaryKey() {
		return _idPregunta;
	}

	public void setPrimaryKey(long pk) {
		setIdPregunta(pk);
	}

	public long getIdPregunta() {
		return _idPregunta;
	}

	public void setIdPregunta(long idPregunta) {
		_idPregunta = idPregunta;
	}

	public String getEnunciado() {
		return _enunciado;
	}

	public void setEnunciado(String enunciado) {
		_enunciado = enunciado;
	}

	public int getTipo() {
		return _tipo;
	}

	public void setTipo(int tipo) {
		_tipo = tipo;
	}

	public long getIdOferta() {
		return _idOferta;
	}

	public void setIdOferta(long idOferta) {
		_idOferta = idOferta;
	}

	private long _idPregunta;
	private String _enunciado;
	private int _tipo;
	private long _idOferta;
}