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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Oferta}.
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see Oferta
 * @generated
 */
@ProviderType
public class OfertaWrapper implements Oferta, ModelWrapper<Oferta> {
	public OfertaWrapper(Oferta oferta) {
		_oferta = oferta;
	}

	@Override
	public Class<?> getModelClass() {
		return Oferta.class;
	}

	@Override
	public String getModelClassName() {
		return Oferta.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("idOferta", getIdOferta());
		attributes.put("titulo", getTitulo());
		attributes.put("descripcion", getDescripcion());
		attributes.put("provincia", getProvincia());
		attributes.put("ciudad", getCiudad());
		attributes.put("salario", getSalario());
		attributes.put("fechaInicio", getFechaInicio());
		attributes.put("fechaModificacion", getFechaModificacion());
		attributes.put("fechaFin", getFechaFin());
		attributes.put("plazas", getPlazas());
		attributes.put("candidatos", getCandidatos());
		attributes.put("requisitosMinimos", getRequisitosMinimos());
		attributes.put("requisitosOpcionales", getRequisitosOpcionales());
		attributes.put("activa", getActiva());
		attributes.put("idEmpresa", getIdEmpresa());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long idOferta = (Long)attributes.get("idOferta");

		if (idOferta != null) {
			setIdOferta(idOferta);
		}

		String titulo = (String)attributes.get("titulo");

		if (titulo != null) {
			setTitulo(titulo);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		Integer provincia = (Integer)attributes.get("provincia");

		if (provincia != null) {
			setProvincia(provincia);
		}

		String ciudad = (String)attributes.get("ciudad");

		if (ciudad != null) {
			setCiudad(ciudad);
		}

		String salario = (String)attributes.get("salario");

		if (salario != null) {
			setSalario(salario);
		}

		Date fechaInicio = (Date)attributes.get("fechaInicio");

		if (fechaInicio != null) {
			setFechaInicio(fechaInicio);
		}

		Date fechaModificacion = (Date)attributes.get("fechaModificacion");

		if (fechaModificacion != null) {
			setFechaModificacion(fechaModificacion);
		}

		Date fechaFin = (Date)attributes.get("fechaFin");

		if (fechaFin != null) {
			setFechaFin(fechaFin);
		}

		Integer plazas = (Integer)attributes.get("plazas");

		if (plazas != null) {
			setPlazas(plazas);
		}

		Integer candidatos = (Integer)attributes.get("candidatos");

		if (candidatos != null) {
			setCandidatos(candidatos);
		}

		String requisitosMinimos = (String)attributes.get("requisitosMinimos");

		if (requisitosMinimos != null) {
			setRequisitosMinimos(requisitosMinimos);
		}

		String requisitosOpcionales = (String)attributes.get(
				"requisitosOpcionales");

		if (requisitosOpcionales != null) {
			setRequisitosOpcionales(requisitosOpcionales);
		}

		Boolean activa = (Boolean)attributes.get("activa");

		if (activa != null) {
			setActiva(activa);
		}

		Long idEmpresa = (Long)attributes.get("idEmpresa");

		if (idEmpresa != null) {
			setIdEmpresa(idEmpresa);
		}
	}

	/**
	* Returns the activa of this oferta.
	*
	* @return the activa of this oferta
	*/
	@Override
	public boolean getActiva() {
		return _oferta.getActiva();
	}

	/**
	* Returns <code>true</code> if this oferta is activa.
	*
	* @return <code>true</code> if this oferta is activa; <code>false</code> otherwise
	*/
	@Override
	public boolean isActiva() {
		return _oferta.isActiva();
	}

	@Override
	public boolean isCachedModel() {
		return _oferta.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _oferta.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _oferta.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _oferta.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<servicioempleodigital.model.Oferta> toCacheModel() {
		return _oferta.toCacheModel();
	}

	@Override
	public int compareTo(servicioempleodigital.model.Oferta oferta) {
		return _oferta.compareTo(oferta);
	}

	/**
	* Returns the candidatos of this oferta.
	*
	* @return the candidatos of this oferta
	*/
	@Override
	public int getCandidatos() {
		return _oferta.getCandidatos();
	}

	/**
	* Returns the plazas of this oferta.
	*
	* @return the plazas of this oferta
	*/
	@Override
	public int getPlazas() {
		return _oferta.getPlazas();
	}

	/**
	* Returns the provincia of this oferta.
	*
	* @return the provincia of this oferta
	*/
	@Override
	public int getProvincia() {
		return _oferta.getProvincia();
	}

	@Override
	public int hashCode() {
		return _oferta.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _oferta.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new OfertaWrapper((Oferta)_oferta.clone());
	}

	/**
	* Returns the ciudad of this oferta.
	*
	* @return the ciudad of this oferta
	*/
	@Override
	public java.lang.String getCiudad() {
		return _oferta.getCiudad();
	}

	/**
	* Returns the descripcion of this oferta.
	*
	* @return the descripcion of this oferta
	*/
	@Override
	public java.lang.String getDescripcion() {
		return _oferta.getDescripcion();
	}

	/**
	* Returns the requisitos minimos of this oferta.
	*
	* @return the requisitos minimos of this oferta
	*/
	@Override
	public java.lang.String getRequisitosMinimos() {
		return _oferta.getRequisitosMinimos();
	}

	/**
	* Returns the requisitos opcionales of this oferta.
	*
	* @return the requisitos opcionales of this oferta
	*/
	@Override
	public java.lang.String getRequisitosOpcionales() {
		return _oferta.getRequisitosOpcionales();
	}

	/**
	* Returns the salario of this oferta.
	*
	* @return the salario of this oferta
	*/
	@Override
	public java.lang.String getSalario() {
		return _oferta.getSalario();
	}

	/**
	* Returns the titulo of this oferta.
	*
	* @return the titulo of this oferta
	*/
	@Override
	public java.lang.String getTitulo() {
		return _oferta.getTitulo();
	}

	@Override
	public java.lang.String toString() {
		return _oferta.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _oferta.toXmlString();
	}

	/**
	* Returns the fecha fin of this oferta.
	*
	* @return the fecha fin of this oferta
	*/
	@Override
	public Date getFechaFin() {
		return _oferta.getFechaFin();
	}

	/**
	* Returns the fecha inicio of this oferta.
	*
	* @return the fecha inicio of this oferta
	*/
	@Override
	public Date getFechaInicio() {
		return _oferta.getFechaInicio();
	}

	/**
	* Returns the fecha modificacion of this oferta.
	*
	* @return the fecha modificacion of this oferta
	*/
	@Override
	public Date getFechaModificacion() {
		return _oferta.getFechaModificacion();
	}

	/**
	* Returns the id empresa of this oferta.
	*
	* @return the id empresa of this oferta
	*/
	@Override
	public long getIdEmpresa() {
		return _oferta.getIdEmpresa();
	}

	/**
	* Returns the id oferta of this oferta.
	*
	* @return the id oferta of this oferta
	*/
	@Override
	public long getIdOferta() {
		return _oferta.getIdOferta();
	}

	/**
	* Returns the primary key of this oferta.
	*
	* @return the primary key of this oferta
	*/
	@Override
	public long getPrimaryKey() {
		return _oferta.getPrimaryKey();
	}

	@Override
	public servicioempleodigital.model.Oferta toEscapedModel() {
		return new OfertaWrapper(_oferta.toEscapedModel());
	}

	@Override
	public servicioempleodigital.model.Oferta toUnescapedModel() {
		return new OfertaWrapper(_oferta.toUnescapedModel());
	}

	@Override
	public void persist() {
		_oferta.persist();
	}

	/**
	* Sets whether this oferta is activa.
	*
	* @param activa the activa of this oferta
	*/
	@Override
	public void setActiva(boolean activa) {
		_oferta.setActiva(activa);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_oferta.setCachedModel(cachedModel);
	}

	/**
	* Sets the candidatos of this oferta.
	*
	* @param candidatos the candidatos of this oferta
	*/
	@Override
	public void setCandidatos(int candidatos) {
		_oferta.setCandidatos(candidatos);
	}

	/**
	* Sets the ciudad of this oferta.
	*
	* @param ciudad the ciudad of this oferta
	*/
	@Override
	public void setCiudad(java.lang.String ciudad) {
		_oferta.setCiudad(ciudad);
	}

	/**
	* Sets the descripcion of this oferta.
	*
	* @param descripcion the descripcion of this oferta
	*/
	@Override
	public void setDescripcion(java.lang.String descripcion) {
		_oferta.setDescripcion(descripcion);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_oferta.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_oferta.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_oferta.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the fecha fin of this oferta.
	*
	* @param fechaFin the fecha fin of this oferta
	*/
	@Override
	public void setFechaFin(Date fechaFin) {
		_oferta.setFechaFin(fechaFin);
	}

	/**
	* Sets the fecha inicio of this oferta.
	*
	* @param fechaInicio the fecha inicio of this oferta
	*/
	@Override
	public void setFechaInicio(Date fechaInicio) {
		_oferta.setFechaInicio(fechaInicio);
	}

	/**
	* Sets the fecha modificacion of this oferta.
	*
	* @param fechaModificacion the fecha modificacion of this oferta
	*/
	@Override
	public void setFechaModificacion(Date fechaModificacion) {
		_oferta.setFechaModificacion(fechaModificacion);
	}

	/**
	* Sets the id empresa of this oferta.
	*
	* @param idEmpresa the id empresa of this oferta
	*/
	@Override
	public void setIdEmpresa(long idEmpresa) {
		_oferta.setIdEmpresa(idEmpresa);
	}

	/**
	* Sets the id oferta of this oferta.
	*
	* @param idOferta the id oferta of this oferta
	*/
	@Override
	public void setIdOferta(long idOferta) {
		_oferta.setIdOferta(idOferta);
	}

	@Override
	public void setNew(boolean n) {
		_oferta.setNew(n);
	}

	/**
	* Sets the plazas of this oferta.
	*
	* @param plazas the plazas of this oferta
	*/
	@Override
	public void setPlazas(int plazas) {
		_oferta.setPlazas(plazas);
	}

	/**
	* Sets the primary key of this oferta.
	*
	* @param primaryKey the primary key of this oferta
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_oferta.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_oferta.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the provincia of this oferta.
	*
	* @param provincia the provincia of this oferta
	*/
	@Override
	public void setProvincia(int provincia) {
		_oferta.setProvincia(provincia);
	}

	/**
	* Sets the requisitos minimos of this oferta.
	*
	* @param requisitosMinimos the requisitos minimos of this oferta
	*/
	@Override
	public void setRequisitosMinimos(java.lang.String requisitosMinimos) {
		_oferta.setRequisitosMinimos(requisitosMinimos);
	}

	/**
	* Sets the requisitos opcionales of this oferta.
	*
	* @param requisitosOpcionales the requisitos opcionales of this oferta
	*/
	@Override
	public void setRequisitosOpcionales(java.lang.String requisitosOpcionales) {
		_oferta.setRequisitosOpcionales(requisitosOpcionales);
	}

	/**
	* Sets the salario of this oferta.
	*
	* @param salario the salario of this oferta
	*/
	@Override
	public void setSalario(java.lang.String salario) {
		_oferta.setSalario(salario);
	}

	/**
	* Sets the titulo of this oferta.
	*
	* @param titulo the titulo of this oferta
	*/
	@Override
	public void setTitulo(java.lang.String titulo) {
		_oferta.setTitulo(titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OfertaWrapper)) {
			return false;
		}

		OfertaWrapper ofertaWrapper = (OfertaWrapper)obj;

		if (Objects.equals(_oferta, ofertaWrapper._oferta)) {
			return true;
		}

		return false;
	}

	@Override
	public Oferta getWrappedModel() {
		return _oferta;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _oferta.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _oferta.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_oferta.resetOriginalValues();
	}

	private final Oferta _oferta;
}