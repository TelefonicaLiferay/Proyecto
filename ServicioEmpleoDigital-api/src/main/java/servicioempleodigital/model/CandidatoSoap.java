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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link servicioempleodigital.service.http.CandidatoServiceSoap}.
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see servicioempleodigital.service.http.CandidatoServiceSoap
 * @generated
 */
@ProviderType
public class CandidatoSoap implements Serializable {
	public static CandidatoSoap toSoapModel(Candidato model) {
		CandidatoSoap soapModel = new CandidatoSoap();

		soapModel.setIdCandidato(model.getIdCandidato());
		soapModel.setNif(model.getNif());
		soapModel.setNombre(model.getNombre());
		soapModel.setApellidos(model.getApellidos());
		soapModel.setFechaDeNacimiento(model.getFechaDeNacimiento());
		soapModel.setEmail(model.getEmail());
		soapModel.setTelefono(model.getTelefono());
		soapModel.setPassword(model.getPassword());
		soapModel.setProvincia(model.getProvincia());
		soapModel.setCiudad(model.getCiudad());

		return soapModel;
	}

	public static CandidatoSoap[] toSoapModels(Candidato[] models) {
		CandidatoSoap[] soapModels = new CandidatoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CandidatoSoap[][] toSoapModels(Candidato[][] models) {
		CandidatoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CandidatoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CandidatoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CandidatoSoap[] toSoapModels(List<Candidato> models) {
		List<CandidatoSoap> soapModels = new ArrayList<CandidatoSoap>(models.size());

		for (Candidato model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CandidatoSoap[soapModels.size()]);
	}

	public CandidatoSoap() {
	}

	public long getPrimaryKey() {
		return _idCandidato;
	}

	public void setPrimaryKey(long pk) {
		setIdCandidato(pk);
	}

	public long getIdCandidato() {
		return _idCandidato;
	}

	public void setIdCandidato(long idCandidato) {
		_idCandidato = idCandidato;
	}

	public String getNif() {
		return _nif;
	}

	public void setNif(String nif) {
		_nif = nif;
	}

	public String getNombre() {
		return _nombre;
	}

	public void setNombre(String nombre) {
		_nombre = nombre;
	}

	public String getApellidos() {
		return _apellidos;
	}

	public void setApellidos(String apellidos) {
		_apellidos = apellidos;
	}

	public Date getFechaDeNacimiento() {
		return _fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		_fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getTelefono() {
		return _telefono;
	}

	public void setTelefono(String telefono) {
		_telefono = telefono;
	}

	public String getPassword() {
		return _password;
	}

	public void setPassword(String password) {
		_password = password;
	}

	public int getProvincia() {
		return _provincia;
	}

	public void setProvincia(int provincia) {
		_provincia = provincia;
	}

	public String getCiudad() {
		return _ciudad;
	}

	public void setCiudad(String ciudad) {
		_ciudad = ciudad;
	}

	private long _idCandidato;
	private String _nif;
	private String _nombre;
	private String _apellidos;
	private Date _fechaDeNacimiento;
	private String _email;
	private String _telefono;
	private String _password;
	private int _provincia;
	private String _ciudad;
}