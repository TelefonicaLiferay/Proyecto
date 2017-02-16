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
 * This class is a wrapper for {@link Respuesta}.
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see Respuesta
 * @generated
 */
@ProviderType
public class RespuestaWrapper implements Respuesta, ModelWrapper<Respuesta> {
	public RespuestaWrapper(Respuesta respuesta) {
		_respuesta = respuesta;
	}

	@Override
	public Class<?> getModelClass() {
		return Respuesta.class;
	}

	@Override
	public String getModelClassName() {
		return Respuesta.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("idRespuesta", getIdRespuesta());
		attributes.put("respuesta", getRespuesta());
		attributes.put("valor", getValor());
		attributes.put("idPregunta", getIdPregunta());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long idRespuesta = (Long)attributes.get("idRespuesta");

		if (idRespuesta != null) {
			setIdRespuesta(idRespuesta);
		}

		String respuesta = (String)attributes.get("respuesta");

		if (respuesta != null) {
			setRespuesta(respuesta);
		}

		Double valor = (Double)attributes.get("valor");

		if (valor != null) {
			setValor(valor);
		}

		Long idPregunta = (Long)attributes.get("idPregunta");

		if (idPregunta != null) {
			setIdPregunta(idPregunta);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _respuesta.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _respuesta.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _respuesta.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _respuesta.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<servicioempleodigital.model.Respuesta> toCacheModel() {
		return _respuesta.toCacheModel();
	}

	/**
	* Returns the valor of this respuesta.
	*
	* @return the valor of this respuesta
	*/
	@Override
	public double getValor() {
		return _respuesta.getValor();
	}

	@Override
	public int compareTo(servicioempleodigital.model.Respuesta respuesta) {
		return _respuesta.compareTo(respuesta);
	}

	@Override
	public int hashCode() {
		return _respuesta.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _respuesta.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new RespuestaWrapper((Respuesta)_respuesta.clone());
	}

	/**
	* Returns the respuesta of this respuesta.
	*
	* @return the respuesta of this respuesta
	*/
	@Override
	public java.lang.String getRespuesta() {
		return _respuesta.getRespuesta();
	}

	@Override
	public java.lang.String toString() {
		return _respuesta.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _respuesta.toXmlString();
	}

	/**
	* Returns the id pregunta of this respuesta.
	*
	* @return the id pregunta of this respuesta
	*/
	@Override
	public long getIdPregunta() {
		return _respuesta.getIdPregunta();
	}

	/**
	* Returns the id respuesta of this respuesta.
	*
	* @return the id respuesta of this respuesta
	*/
	@Override
	public long getIdRespuesta() {
		return _respuesta.getIdRespuesta();
	}

	/**
	* Returns the primary key of this respuesta.
	*
	* @return the primary key of this respuesta
	*/
	@Override
	public long getPrimaryKey() {
		return _respuesta.getPrimaryKey();
	}

	@Override
	public servicioempleodigital.model.Respuesta toEscapedModel() {
		return new RespuestaWrapper(_respuesta.toEscapedModel());
	}

	@Override
	public servicioempleodigital.model.Respuesta toUnescapedModel() {
		return new RespuestaWrapper(_respuesta.toUnescapedModel());
	}

	@Override
	public void persist() {
		_respuesta.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_respuesta.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_respuesta.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_respuesta.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_respuesta.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the id pregunta of this respuesta.
	*
	* @param idPregunta the id pregunta of this respuesta
	*/
	@Override
	public void setIdPregunta(long idPregunta) {
		_respuesta.setIdPregunta(idPregunta);
	}

	/**
	* Sets the id respuesta of this respuesta.
	*
	* @param idRespuesta the id respuesta of this respuesta
	*/
	@Override
	public void setIdRespuesta(long idRespuesta) {
		_respuesta.setIdRespuesta(idRespuesta);
	}

	@Override
	public void setNew(boolean n) {
		_respuesta.setNew(n);
	}

	/**
	* Sets the primary key of this respuesta.
	*
	* @param primaryKey the primary key of this respuesta
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_respuesta.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_respuesta.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the respuesta of this respuesta.
	*
	* @param respuesta the respuesta of this respuesta
	*/
	@Override
	public void setRespuesta(java.lang.String respuesta) {
		_respuesta.setRespuesta(respuesta);
	}

	/**
	* Sets the valor of this respuesta.
	*
	* @param valor the valor of this respuesta
	*/
	@Override
	public void setValor(double valor) {
		_respuesta.setValor(valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof RespuestaWrapper)) {
			return false;
		}

		RespuestaWrapper respuestaWrapper = (RespuestaWrapper)obj;

		if (Objects.equals(_respuesta, respuestaWrapper._respuesta)) {
			return true;
		}

		return false;
	}

	@Override
	public Respuesta getWrappedModel() {
		return _respuesta;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _respuesta.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _respuesta.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_respuesta.resetOriginalValues();
	}

	private final Respuesta _respuesta;
}