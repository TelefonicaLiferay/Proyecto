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
 * This class is a wrapper for {@link Pregunta}.
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see Pregunta
 * @generated
 */
@ProviderType
public class PreguntaWrapper implements Pregunta, ModelWrapper<Pregunta> {
	public PreguntaWrapper(Pregunta pregunta) {
		_pregunta = pregunta;
	}

	@Override
	public Class<?> getModelClass() {
		return Pregunta.class;
	}

	@Override
	public String getModelClassName() {
		return Pregunta.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("idPregunta", getIdPregunta());
		attributes.put("enunciado", getEnunciado());
		attributes.put("tipo", getTipo());
		attributes.put("idOferta", getIdOferta());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long idPregunta = (Long)attributes.get("idPregunta");

		if (idPregunta != null) {
			setIdPregunta(idPregunta);
		}

		String enunciado = (String)attributes.get("enunciado");

		if (enunciado != null) {
			setEnunciado(enunciado);
		}

		Integer tipo = (Integer)attributes.get("tipo");

		if (tipo != null) {
			setTipo(tipo);
		}

		Long idOferta = (Long)attributes.get("idOferta");

		if (idOferta != null) {
			setIdOferta(idOferta);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _pregunta.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _pregunta.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _pregunta.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _pregunta.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<servicioempleodigital.model.Pregunta> toCacheModel() {
		return _pregunta.toCacheModel();
	}

	@Override
	public int compareTo(servicioempleodigital.model.Pregunta pregunta) {
		return _pregunta.compareTo(pregunta);
	}

	/**
	* Returns the tipo of this pregunta.
	*
	* @return the tipo of this pregunta
	*/
	@Override
	public int getTipo() {
		return _pregunta.getTipo();
	}

	@Override
	public int hashCode() {
		return _pregunta.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _pregunta.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new PreguntaWrapper((Pregunta)_pregunta.clone());
	}

	/**
	* Returns the enunciado of this pregunta.
	*
	* @return the enunciado of this pregunta
	*/
	@Override
	public java.lang.String getEnunciado() {
		return _pregunta.getEnunciado();
	}

	@Override
	public java.lang.String toString() {
		return _pregunta.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _pregunta.toXmlString();
	}

	/**
	* Returns the id oferta of this pregunta.
	*
	* @return the id oferta of this pregunta
	*/
	@Override
	public long getIdOferta() {
		return _pregunta.getIdOferta();
	}

	/**
	* Returns the id pregunta of this pregunta.
	*
	* @return the id pregunta of this pregunta
	*/
	@Override
	public long getIdPregunta() {
		return _pregunta.getIdPregunta();
	}

	/**
	* Returns the primary key of this pregunta.
	*
	* @return the primary key of this pregunta
	*/
	@Override
	public long getPrimaryKey() {
		return _pregunta.getPrimaryKey();
	}

	@Override
	public servicioempleodigital.model.Pregunta toEscapedModel() {
		return new PreguntaWrapper(_pregunta.toEscapedModel());
	}

	@Override
	public servicioempleodigital.model.Pregunta toUnescapedModel() {
		return new PreguntaWrapper(_pregunta.toUnescapedModel());
	}

	@Override
	public void persist() {
		_pregunta.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_pregunta.setCachedModel(cachedModel);
	}

	/**
	* Sets the enunciado of this pregunta.
	*
	* @param enunciado the enunciado of this pregunta
	*/
	@Override
	public void setEnunciado(java.lang.String enunciado) {
		_pregunta.setEnunciado(enunciado);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_pregunta.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_pregunta.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_pregunta.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the id oferta of this pregunta.
	*
	* @param idOferta the id oferta of this pregunta
	*/
	@Override
	public void setIdOferta(long idOferta) {
		_pregunta.setIdOferta(idOferta);
	}

	/**
	* Sets the id pregunta of this pregunta.
	*
	* @param idPregunta the id pregunta of this pregunta
	*/
	@Override
	public void setIdPregunta(long idPregunta) {
		_pregunta.setIdPregunta(idPregunta);
	}

	@Override
	public void setNew(boolean n) {
		_pregunta.setNew(n);
	}

	/**
	* Sets the primary key of this pregunta.
	*
	* @param primaryKey the primary key of this pregunta
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_pregunta.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_pregunta.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the tipo of this pregunta.
	*
	* @param tipo the tipo of this pregunta
	*/
	@Override
	public void setTipo(int tipo) {
		_pregunta.setTipo(tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PreguntaWrapper)) {
			return false;
		}

		PreguntaWrapper preguntaWrapper = (PreguntaWrapper)obj;

		if (Objects.equals(_pregunta, preguntaWrapper._pregunta)) {
			return true;
		}

		return false;
	}

	@Override
	public Pregunta getWrappedModel() {
		return _pregunta;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _pregunta.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _pregunta.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_pregunta.resetOriginalValues();
	}

	private final Pregunta _pregunta;
}