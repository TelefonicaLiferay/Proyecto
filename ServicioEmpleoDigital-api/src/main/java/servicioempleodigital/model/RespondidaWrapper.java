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
 * This class is a wrapper for {@link Respondida}.
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see Respondida
 * @generated
 */
@ProviderType
public class RespondidaWrapper implements Respondida, ModelWrapper<Respondida> {
	public RespondidaWrapper(Respondida respondida) {
		_respondida = respondida;
	}

	@Override
	public Class<?> getModelClass() {
		return Respondida.class;
	}

	@Override
	public String getModelClassName() {
		return Respondida.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("idRespuesta", getIdRespuesta());
		attributes.put("idCandidato", getIdCandidato());
		attributes.put("respuesta", getRespuesta());
		attributes.put("respondida", getRespondida());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long idRespuesta = (Long)attributes.get("idRespuesta");

		if (idRespuesta != null) {
			setIdRespuesta(idRespuesta);
		}

		Long idCandidato = (Long)attributes.get("idCandidato");

		if (idCandidato != null) {
			setIdCandidato(idCandidato);
		}

		String respuesta = (String)attributes.get("respuesta");

		if (respuesta != null) {
			setRespuesta(respuesta);
		}

		Boolean respondida = (Boolean)attributes.get("respondida");

		if (respondida != null) {
			setRespondida(respondida);
		}
	}

	/**
	* Returns the respondida of this respondida.
	*
	* @return the respondida of this respondida
	*/
	@Override
	public boolean getRespondida() {
		return _respondida.getRespondida();
	}

	@Override
	public boolean isCachedModel() {
		return _respondida.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _respondida.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _respondida.isNew();
	}

	/**
	* Returns <code>true</code> if this respondida is respondida.
	*
	* @return <code>true</code> if this respondida is respondida; <code>false</code> otherwise
	*/
	@Override
	public boolean isRespondida() {
		return _respondida.isRespondida();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _respondida.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<servicioempleodigital.model.Respondida> toCacheModel() {
		return _respondida.toCacheModel();
	}

	@Override
	public int compareTo(servicioempleodigital.model.Respondida respondida) {
		return _respondida.compareTo(respondida);
	}

	@Override
	public int hashCode() {
		return _respondida.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _respondida.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new RespondidaWrapper((Respondida)_respondida.clone());
	}

	/**
	* Returns the respuesta of this respondida.
	*
	* @return the respuesta of this respondida
	*/
	@Override
	public java.lang.String getRespuesta() {
		return _respondida.getRespuesta();
	}

	@Override
	public java.lang.String toString() {
		return _respondida.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _respondida.toXmlString();
	}

	/**
	* Returns the id candidato of this respondida.
	*
	* @return the id candidato of this respondida
	*/
	@Override
	public long getIdCandidato() {
		return _respondida.getIdCandidato();
	}

	/**
	* Returns the id respuesta of this respondida.
	*
	* @return the id respuesta of this respondida
	*/
	@Override
	public long getIdRespuesta() {
		return _respondida.getIdRespuesta();
	}

	@Override
	public servicioempleodigital.model.Respondida toEscapedModel() {
		return new RespondidaWrapper(_respondida.toEscapedModel());
	}

	@Override
	public servicioempleodigital.model.Respondida toUnescapedModel() {
		return new RespondidaWrapper(_respondida.toUnescapedModel());
	}

	/**
	* Returns the primary key of this respondida.
	*
	* @return the primary key of this respondida
	*/
	@Override
	public servicioempleodigital.service.persistence.RespondidaPK getPrimaryKey() {
		return _respondida.getPrimaryKey();
	}

	@Override
	public void persist() {
		_respondida.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_respondida.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_respondida.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_respondida.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_respondida.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the id candidato of this respondida.
	*
	* @param idCandidato the id candidato of this respondida
	*/
	@Override
	public void setIdCandidato(long idCandidato) {
		_respondida.setIdCandidato(idCandidato);
	}

	/**
	* Sets the id respuesta of this respondida.
	*
	* @param idRespuesta the id respuesta of this respondida
	*/
	@Override
	public void setIdRespuesta(long idRespuesta) {
		_respondida.setIdRespuesta(idRespuesta);
	}

	@Override
	public void setNew(boolean n) {
		_respondida.setNew(n);
	}

	/**
	* Sets the primary key of this respondida.
	*
	* @param primaryKey the primary key of this respondida
	*/
	@Override
	public void setPrimaryKey(
		servicioempleodigital.service.persistence.RespondidaPK primaryKey) {
		_respondida.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_respondida.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets whether this respondida is respondida.
	*
	* @param respondida the respondida of this respondida
	*/
	@Override
	public void setRespondida(boolean respondida) {
		_respondida.setRespondida(respondida);
	}

	/**
	* Sets the respuesta of this respondida.
	*
	* @param respuesta the respuesta of this respondida
	*/
	@Override
	public void setRespuesta(java.lang.String respuesta) {
		_respondida.setRespuesta(respuesta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RespondidaWrapper)) {
			return false;
		}

		RespondidaWrapper respondidaWrapper = (RespondidaWrapper)obj;

		if (Objects.equals(_respondida, respondidaWrapper._respondida)) {
			return true;
		}

		return false;
	}

	@Override
	public Respondida getWrappedModel() {
		return _respondida;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _respondida.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _respondida.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_respondida.resetOriginalValues();
	}

	private final Respondida _respondida;
}