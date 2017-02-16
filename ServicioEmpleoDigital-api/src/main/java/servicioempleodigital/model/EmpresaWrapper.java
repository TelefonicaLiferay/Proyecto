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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Empresa}.
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see Empresa
 * @generated
 */
@ProviderType
public class EmpresaWrapper implements Empresa, ModelWrapper<Empresa> {
	public EmpresaWrapper(Empresa empresa) {
		_empresa = empresa;
	}

	@Override
	public Class<?> getModelClass() {
		return Empresa.class;
	}

	@Override
	public String getModelClassName() {
		return Empresa.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("idEmpresa", getIdEmpresa());
		attributes.put("cif", getCif());
		attributes.put("razonSocial", getRazonSocial());
		attributes.put("telefono", getTelefono());
		attributes.put("email", getEmail());
		attributes.put("web", getWeb());
		attributes.put("password", getPassword());
		attributes.put("provincia", getProvincia());
		attributes.put("ciudad", getCiudad());
		attributes.put("trabajadores", getTrabajadores());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long idEmpresa = (Long)attributes.get("idEmpresa");

		if (idEmpresa != null) {
			setIdEmpresa(idEmpresa);
		}

		String cif = (String)attributes.get("cif");

		if (cif != null) {
			setCif(cif);
		}

		String razonSocial = (String)attributes.get("razonSocial");

		if (razonSocial != null) {
			setRazonSocial(razonSocial);
		}

		String telefono = (String)attributes.get("telefono");

		if (telefono != null) {
			setTelefono(telefono);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String web = (String)attributes.get("web");

		if (web != null) {
			setWeb(web);
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

		Integer trabajadores = (Integer)attributes.get("trabajadores");

		if (trabajadores != null) {
			setTrabajadores(trabajadores);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _empresa.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _empresa.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _empresa.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _empresa.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<servicioempleodigital.model.Empresa> toCacheModel() {
		return _empresa.toCacheModel();
	}

	@Override
	public int compareTo(servicioempleodigital.model.Empresa empresa) {
		return _empresa.compareTo(empresa);
	}

	/**
	* Returns the provincia of this empresa.
	*
	* @return the provincia of this empresa
	*/
	@Override
	public int getProvincia() {
		return _empresa.getProvincia();
	}

	/**
	* Returns the trabajadores of this empresa.
	*
	* @return the trabajadores of this empresa
	*/
	@Override
	public int getTrabajadores() {
		return _empresa.getTrabajadores();
	}

	@Override
	public int hashCode() {
		return _empresa.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _empresa.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new EmpresaWrapper((Empresa)_empresa.clone());
	}

	/**
	* Returns the cif of this empresa.
	*
	* @return the cif of this empresa
	*/
	@Override
	public java.lang.String getCif() {
		return _empresa.getCif();
	}

	/**
	* Returns the ciudad of this empresa.
	*
	* @return the ciudad of this empresa
	*/
	@Override
	public java.lang.String getCiudad() {
		return _empresa.getCiudad();
	}

	/**
	* Returns the email of this empresa.
	*
	* @return the email of this empresa
	*/
	@Override
	public java.lang.String getEmail() {
		return _empresa.getEmail();
	}

	/**
	* Returns the password of this empresa.
	*
	* @return the password of this empresa
	*/
	@Override
	public java.lang.String getPassword() {
		return _empresa.getPassword();
	}

	/**
	* Returns the razon social of this empresa.
	*
	* @return the razon social of this empresa
	*/
	@Override
	public java.lang.String getRazonSocial() {
		return _empresa.getRazonSocial();
	}

	/**
	* Returns the telefono of this empresa.
	*
	* @return the telefono of this empresa
	*/
	@Override
	public java.lang.String getTelefono() {
		return _empresa.getTelefono();
	}

	/**
	* Returns the web of this empresa.
	*
	* @return the web of this empresa
	*/
	@Override
	public java.lang.String getWeb() {
		return _empresa.getWeb();
	}

	@Override
	public java.lang.String toString() {
		return _empresa.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _empresa.toXmlString();
	}

	/**
	* Returns the id empresa of this empresa.
	*
	* @return the id empresa of this empresa
	*/
	@Override
	public long getIdEmpresa() {
		return _empresa.getIdEmpresa();
	}

	/**
	* Returns the primary key of this empresa.
	*
	* @return the primary key of this empresa
	*/
	@Override
	public long getPrimaryKey() {
		return _empresa.getPrimaryKey();
	}

	@Override
	public servicioempleodigital.model.Empresa toEscapedModel() {
		return new EmpresaWrapper(_empresa.toEscapedModel());
	}

	@Override
	public servicioempleodigital.model.Empresa toUnescapedModel() {
		return new EmpresaWrapper(_empresa.toUnescapedModel());
	}

	@Override
	public void persist() {
		_empresa.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_empresa.setCachedModel(cachedModel);
	}

	/**
	* Sets the cif of this empresa.
	*
	* @param cif the cif of this empresa
	*/
	@Override
	public void setCif(java.lang.String cif) {
		_empresa.setCif(cif);
	}

	/**
	* Sets the ciudad of this empresa.
	*
	* @param ciudad the ciudad of this empresa
	*/
	@Override
	public void setCiudad(java.lang.String ciudad) {
		_empresa.setCiudad(ciudad);
	}

	/**
	* Sets the email of this empresa.
	*
	* @param email the email of this empresa
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_empresa.setEmail(email);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_empresa.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_empresa.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_empresa.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the id empresa of this empresa.
	*
	* @param idEmpresa the id empresa of this empresa
	*/
	@Override
	public void setIdEmpresa(long idEmpresa) {
		_empresa.setIdEmpresa(idEmpresa);
	}

	@Override
	public void setNew(boolean n) {
		_empresa.setNew(n);
	}

	/**
	* Sets the password of this empresa.
	*
	* @param password the password of this empresa
	*/
	@Override
	public void setPassword(java.lang.String password) {
		_empresa.setPassword(password);
	}

	/**
	* Sets the primary key of this empresa.
	*
	* @param primaryKey the primary key of this empresa
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_empresa.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_empresa.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the provincia of this empresa.
	*
	* @param provincia the provincia of this empresa
	*/
	@Override
	public void setProvincia(int provincia) {
		_empresa.setProvincia(provincia);
	}

	/**
	* Sets the razon social of this empresa.
	*
	* @param razonSocial the razon social of this empresa
	*/
	@Override
	public void setRazonSocial(java.lang.String razonSocial) {
		_empresa.setRazonSocial(razonSocial);
	}

	/**
	* Sets the telefono of this empresa.
	*
	* @param telefono the telefono of this empresa
	*/
	@Override
	public void setTelefono(java.lang.String telefono) {
		_empresa.setTelefono(telefono);
	}

	/**
	* Sets the trabajadores of this empresa.
	*
	* @param trabajadores the trabajadores of this empresa
	*/
	@Override
	public void setTrabajadores(int trabajadores) {
		_empresa.setTrabajadores(trabajadores);
	}

	/**
	* Sets the web of this empresa.
	*
	* @param web the web of this empresa
	*/
	@Override
	public void setWeb(java.lang.String web) {
		_empresa.setWeb(web);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmpresaWrapper)) {
			return false;
		}

		EmpresaWrapper empresaWrapper = (EmpresaWrapper)obj;

		if (Objects.equals(_empresa, empresaWrapper._empresa)) {
			return true;
		}

		return false;
	}

	@Override
	public Empresa getWrappedModel() {
		return _empresa;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _empresa.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _empresa.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_empresa.resetOriginalValues();
	}

	private final Empresa _empresa;
}