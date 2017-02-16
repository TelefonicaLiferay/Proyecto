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
 * This class is used by SOAP remote services, specifically {@link servicioempleodigital.service.http.EmpresaServiceSoap}.
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see servicioempleodigital.service.http.EmpresaServiceSoap
 * @generated
 */
@ProviderType
public class EmpresaSoap implements Serializable {
	public static EmpresaSoap toSoapModel(Empresa model) {
		EmpresaSoap soapModel = new EmpresaSoap();

		soapModel.setIdEmpresa(model.getIdEmpresa());
		soapModel.setCif(model.getCif());
		soapModel.setRazonSocial(model.getRazonSocial());
		soapModel.setTelefono(model.getTelefono());
		soapModel.setEmail(model.getEmail());
		soapModel.setWeb(model.getWeb());
		soapModel.setPassword(model.getPassword());
		soapModel.setProvincia(model.getProvincia());
		soapModel.setCiudad(model.getCiudad());
		soapModel.setTrabajadores(model.getTrabajadores());

		return soapModel;
	}

	public static EmpresaSoap[] toSoapModels(Empresa[] models) {
		EmpresaSoap[] soapModels = new EmpresaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static EmpresaSoap[][] toSoapModels(Empresa[][] models) {
		EmpresaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new EmpresaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new EmpresaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static EmpresaSoap[] toSoapModels(List<Empresa> models) {
		List<EmpresaSoap> soapModels = new ArrayList<EmpresaSoap>(models.size());

		for (Empresa model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new EmpresaSoap[soapModels.size()]);
	}

	public EmpresaSoap() {
	}

	public long getPrimaryKey() {
		return _idEmpresa;
	}

	public void setPrimaryKey(long pk) {
		setIdEmpresa(pk);
	}

	public long getIdEmpresa() {
		return _idEmpresa;
	}

	public void setIdEmpresa(long idEmpresa) {
		_idEmpresa = idEmpresa;
	}

	public String getCif() {
		return _cif;
	}

	public void setCif(String cif) {
		_cif = cif;
	}

	public String getRazonSocial() {
		return _razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		_razonSocial = razonSocial;
	}

	public String getTelefono() {
		return _telefono;
	}

	public void setTelefono(String telefono) {
		_telefono = telefono;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getWeb() {
		return _web;
	}

	public void setWeb(String web) {
		_web = web;
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

	public int getTrabajadores() {
		return _trabajadores;
	}

	public void setTrabajadores(int trabajadores) {
		_trabajadores = trabajadores;
	}

	private long _idEmpresa;
	private String _cif;
	private String _razonSocial;
	private String _telefono;
	private String _email;
	private String _web;
	private String _password;
	private int _provincia;
	private String _ciudad;
	private int _trabajadores;
}