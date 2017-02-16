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
 * This class is used by SOAP remote services, specifically {@link servicioempleodigital.service.http.OfertaServiceSoap}.
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see servicioempleodigital.service.http.OfertaServiceSoap
 * @generated
 */
@ProviderType
public class OfertaSoap implements Serializable {
	public static OfertaSoap toSoapModel(Oferta model) {
		OfertaSoap soapModel = new OfertaSoap();

		soapModel.setIdOferta(model.getIdOferta());
		soapModel.setTitulo(model.getTitulo());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setProvincia(model.getProvincia());
		soapModel.setCiudad(model.getCiudad());
		soapModel.setSalario(model.getSalario());
		soapModel.setFechaInicio(model.getFechaInicio());
		soapModel.setFechaModificacion(model.getFechaModificacion());
		soapModel.setFechaFin(model.getFechaFin());
		soapModel.setPlazas(model.getPlazas());
		soapModel.setCandidatos(model.getCandidatos());
		soapModel.setRequisitosMinimos(model.getRequisitosMinimos());
		soapModel.setRequisitosOpcionales(model.getRequisitosOpcionales());
		soapModel.setActiva(model.getActiva());
		soapModel.setIdEmpresa(model.getIdEmpresa());

		return soapModel;
	}

	public static OfertaSoap[] toSoapModels(Oferta[] models) {
		OfertaSoap[] soapModels = new OfertaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OfertaSoap[][] toSoapModels(Oferta[][] models) {
		OfertaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OfertaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OfertaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OfertaSoap[] toSoapModels(List<Oferta> models) {
		List<OfertaSoap> soapModels = new ArrayList<OfertaSoap>(models.size());

		for (Oferta model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OfertaSoap[soapModels.size()]);
	}

	public OfertaSoap() {
	}

	public long getPrimaryKey() {
		return _idOferta;
	}

	public void setPrimaryKey(long pk) {
		setIdOferta(pk);
	}

	public long getIdOferta() {
		return _idOferta;
	}

	public void setIdOferta(long idOferta) {
		_idOferta = idOferta;
	}

	public String getTitulo() {
		return _titulo;
	}

	public void setTitulo(String titulo) {
		_titulo = titulo;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
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

	public String getSalario() {
		return _salario;
	}

	public void setSalario(String salario) {
		_salario = salario;
	}

	public Date getFechaInicio() {
		return _fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		_fechaInicio = fechaInicio;
	}

	public Date getFechaModificacion() {
		return _fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		_fechaModificacion = fechaModificacion;
	}

	public Date getFechaFin() {
		return _fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		_fechaFin = fechaFin;
	}

	public int getPlazas() {
		return _plazas;
	}

	public void setPlazas(int plazas) {
		_plazas = plazas;
	}

	public int getCandidatos() {
		return _candidatos;
	}

	public void setCandidatos(int candidatos) {
		_candidatos = candidatos;
	}

	public String getRequisitosMinimos() {
		return _requisitosMinimos;
	}

	public void setRequisitosMinimos(String requisitosMinimos) {
		_requisitosMinimos = requisitosMinimos;
	}

	public String getRequisitosOpcionales() {
		return _requisitosOpcionales;
	}

	public void setRequisitosOpcionales(String requisitosOpcionales) {
		_requisitosOpcionales = requisitosOpcionales;
	}

	public boolean getActiva() {
		return _activa;
	}

	public boolean isActiva() {
		return _activa;
	}

	public void setActiva(boolean activa) {
		_activa = activa;
	}

	public long getIdEmpresa() {
		return _idEmpresa;
	}

	public void setIdEmpresa(long idEmpresa) {
		_idEmpresa = idEmpresa;
	}

	private long _idOferta;
	private String _titulo;
	private String _descripcion;
	private int _provincia;
	private String _ciudad;
	private String _salario;
	private Date _fechaInicio;
	private Date _fechaModificacion;
	private Date _fechaFin;
	private int _plazas;
	private int _candidatos;
	private String _requisitosMinimos;
	private String _requisitosOpcionales;
	private boolean _activa;
	private long _idEmpresa;
}