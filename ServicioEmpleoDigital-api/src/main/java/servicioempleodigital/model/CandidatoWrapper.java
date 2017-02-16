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
 * This class is a wrapper for {@link Candidato}.
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see Candidato
 * @generated
 */
@ProviderType
public class CandidatoWrapper implements Candidato, ModelWrapper<Candidato> {
	public CandidatoWrapper(Candidato candidato) {
		_candidato = candidato;
	}

	@Override
	public Class<?> getModelClass() {
		return Candidato.class;
	}

	@Override
	public String getModelClassName() {
		return Candidato.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("idCandidato", getIdCandidato());
		attributes.put("nif", getNif());
		attributes.put("nombre", getNombre());
		attributes.put("apellidos", getApellidos());
		attributes.put("fechaDeNacimiento", getFechaDeNacimiento());
		attributes.put("email", getEmail());
		attributes.put("telefono", getTelefono());
		attributes.put("password", getPassword());
		attributes.put("provincia", getProvincia());
		attributes.put("ciudad", getCiudad());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long idCandidato = (Long)attributes.get("idCandidato");

		if (idCandidato != null) {
			setIdCandidato(idCandidato);
		}

		String nif = (String)attributes.get("nif");

		if (nif != null) {
			setNif(nif);
		}

		String nombre = (String)attributes.get("nombre");

		if (nombre != null) {
			setNombre(nombre);
		}

		String apellidos = (String)attributes.get("apellidos");

		if (apellidos != null) {
			setApellidos(apellidos);
		}

		Date fechaDeNacimiento = (Date)attributes.get("fechaDeNacimiento");

		if (fechaDeNacimiento != null) {
			setFechaDeNacimiento(fechaDeNacimiento);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String telefono = (String)attributes.get("telefono");

		if (telefono != null) {
			setTelefono(telefono);
		}

		String password = (String)attributes.get("password");

		if (password != null) {
			setPassword(password);
		}

		Integer provincia = (Integer)attributes.get("provincia");

		if (provincia != null) {
			setProvincia(provincia);
		}

		String ciudad = (String)attributes.get("ciudad");

		if (ciudad != null) {
			setCiudad(ciudad);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _candidato.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _candidato.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _candidato.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _candidato.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<servicioempleodigital.model.Candidato> toCacheModel() {
		return _candidato.toCacheModel();
	}

	@Override
	public int compareTo(servicioempleodigital.model.Candidato candidato) {
		return _candidato.compareTo(candidato);
	}

	/**
	* Returns the provincia of this candidato.
	*
	* @return the provincia of this candidato
	*/
	@Override
	public int getProvincia() {
		return _candidato.getProvincia();
	}

	@Override
	public int hashCode() {
		return _candidato.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _candidato.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CandidatoWrapper((Candidato)_candidato.clone());
	}

	/**
	* Returns the apellidos of this candidato.
	*
	* @return the apellidos of this candidato
	*/
	@Override
	public java.lang.String getApellidos() {
		return _candidato.getApellidos();
	}

	/**
	* Returns the ciudad of this candidato.
	*
	* @return the ciudad of this candidato
	*/
	@Override
	public java.lang.String getCiudad() {
		return _candidato.getCiudad();
	}

	/**
	* Returns the email of this candidato.
	*
	* @return the email of this candidato
	*/
	@Override
	public java.lang.String getEmail() {
		return _candidato.getEmail();
	}

	/**
	* Returns the nif of this candidato.
	*
	* @return the nif of this candidato
	*/
	@Override
	public java.lang.String getNif() {
		return _candidato.getNif();
	}

	/**
	* Returns the nombre of this candidato.
	*
	* @return the nombre of this candidato
	*/
	@Override
	public java.lang.String getNombre() {
		return _candidato.getNombre();
	}

	/**
	* Returns the password of this candidato.
	*
	* @return the password of this candidato
	*/
	@Override
	public java.lang.String getPassword() {
		return _candidato.getPassword();
	}

	/**
	* Returns the telefono of this candidato.
	*
	* @return the telefono of this candidato
	*/
	@Override
	public java.lang.String getTelefono() {
		return _candidato.getTelefono();
	}

	@Override
	public java.lang.String toString() {
		return _candidato.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _candidato.toXmlString();
	}

	/**
	* Returns the fecha de nacimiento of this candidato.
	*
	* @return the fecha de nacimiento of this candidato
	*/
	@Override
	public Date getFechaDeNacimiento() {
		return _candidato.getFechaDeNacimiento();
	}

	/**
	* Returns the id candidato of this candidato.
	*
	* @return the id candidato of this candidato
	*/
	@Override
	public long getIdCandidato() {
		return _candidato.getIdCandidato();
	}

	/**
	* Returns the primary key of this candidato.
	*
	* @return the primary key of this candidato
	*/
	@Override
	public long getPrimaryKey() {
		return _candidato.getPrimaryKey();
	}

	@Override
	public servicioempleodigital.model.Candidato toEscapedModel() {
		return new CandidatoWrapper(_candidato.toEscapedModel());
	}

	@Override
	public servicioempleodigital.model.Candidato toUnescapedModel() {
		return new CandidatoWrapper(_candidato.toUnescapedModel());
	}

	@Override
	public void persist() {
		_candidato.persist();
	}

	/**
	* Sets the apellidos of this candidato.
	*
	* @param apellidos the apellidos of this candidato
	*/
	@Override
	public void setApellidos(java.lang.String apellidos) {
		_candidato.setApellidos(apellidos);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_candidato.setCachedModel(cachedModel);
	}

	/**
	* Sets the ciudad of this candidato.
	*
	* @param ciudad the ciudad of this candidato
	*/
	@Override
	public void setCiudad(java.lang.String ciudad) {
		_candidato.setCiudad(ciudad);
	}

	/**
	* Sets the email of this candidato.
	*
	* @param email the email of this candidato
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_candidato.setEmail(email);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_candidato.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_candidato.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_candidato.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the fecha de nacimiento of this candidato.
	*
	* @param fechaDeNacimiento the fecha de nacimiento of this candidato
	*/
	@Override
	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		_candidato.setFechaDeNacimiento(fechaDeNacimiento);
	}

	/**
	* Sets the id candidato of this candidato.
	*
	* @param idCandidato the id candidato of this candidato
	*/
	@Override
	public void setIdCandidato(long idCandidato) {
		_candidato.setIdCandidato(idCandidato);
	}

	@Override
	public void setNew(boolean n) {
		_candidato.setNew(n);
	}

	/**
	* Sets the nif of this candidato.
	*
	* @param nif the nif of this candidato
	*/
	@Override
	public void setNif(java.lang.String nif) {
		_candidato.setNif(nif);
	}

	/**
	* Sets the nombre of this candidato.
	*
	* @param nombre the nombre of this candidato
	*/
	@Override
	public void setNombre(java.lang.String nombre) {
		_candidato.setNombre(nombre);
	}

	/**
	* Sets the password of this candidato.
	*
	* @param password the password of this candidato
	*/
	@Override
	public void setPassword(java.lang.String password) {
		_candidato.setPassword(password);
	}

	/**
	* Sets the primary key of this candidato.
	*
	* @param primaryKey the primary key of this candidato
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_candidato.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_candidato.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the provincia of this candidato.
	*
	* @param provincia the provincia of this candidato
	*/
	@Override
	public void setProvincia(int provincia) {
		_candidato.setProvincia(provincia);
	}

	/**
	* Sets the telefono of this candidato.
	*
	* @param telefono the telefono of this candidato
	*/
	@Override
	public void setTelefono(java.lang.String telefono) {
		_candidato.setTelefono(telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CandidatoWrapper)) {
			return false;
		}

		CandidatoWrapper candidatoWrapper = (CandidatoWrapper)obj;

		if (Objects.equals(_candidato, candidatoWrapper._candidato)) {
			return true;
		}

		return false;
	}

	@Override
	public Candidato getWrappedModel() {
		return _candidato;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _candidato.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _candidato.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_candidato.resetOriginalValues();
	}

	private final Candidato _candidato;
}