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
 * This class is a wrapper for {@link Resultado}.
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see Resultado
 * @generated
 */
@ProviderType
public class ResultadoWrapper implements Resultado, ModelWrapper<Resultado> {
	public ResultadoWrapper(Resultado resultado) {
		_resultado = resultado;
	}

	@Override
	public Class<?> getModelClass() {
		return Resultado.class;
	}

	@Override
	public String getModelClassName() {
		return Resultado.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("puntuacion", getPuntuacion());
		attributes.put("idCandidato", getIdCandidato());
		attributes.put("idOferta", getIdOferta());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Double puntuacion = (Double)attributes.get("puntuacion");

		if (puntuacion != null) {
			setPuntuacion(puntuacion);
		}

		Long idCandidato = (Long)attributes.get("idCandidato");

		if (idCandidato != null) {
			setIdCandidato(idCandidato);
		}

		Long idOferta = (Long)attributes.get("idOferta");

		if (idOferta != null) {
			setIdOferta(idOferta);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _resultado.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _resultado.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _resultado.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _resultado.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<servicioempleodigital.model.Resultado> toCacheModel() {
		return _resultado.toCacheModel();
	}

	/**
	* Returns the puntuacion of this resultado.
	*
	* @return the puntuacion of this resultado
	*/
	@Override
	public double getPuntuacion() {
		return _resultado.getPuntuacion();
	}

	@Override
	public int compareTo(servicioempleodigital.model.Resultado resultado) {
		return _resultado.compareTo(resultado);
	}

	@Override
	public int hashCode() {
		return _resultado.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _resultado.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new ResultadoWrapper((Resultado)_resultado.clone());
	}

	@Override
	public java.lang.String toString() {
		return _resultado.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _resultado.toXmlString();
	}

	/**
	* Returns the id candidato of this resultado.
	*
	* @return the id candidato of this resultado
	*/
	@Override
	public long getIdCandidato() {
		return _resultado.getIdCandidato();
	}

	/**
	* Returns the id oferta of this resultado.
	*
	* @return the id oferta of this resultado
	*/
	@Override
	public long getIdOferta() {
		return _resultado.getIdOferta();
	}

	@Override
	public servicioempleodigital.model.Resultado toEscapedModel() {
		return new ResultadoWrapper(_resultado.toEscapedModel());
	}

	@Override
	public servicioempleodigital.model.Resultado toUnescapedModel() {
		return new ResultadoWrapper(_resultado.toUnescapedModel());
	}

	/**
	* Returns the primary key of this resultado.
	*
	* @return the primary key of this resultado
	*/
	@Override
	public servicioempleodigital.service.persistence.ResultadoPK getPrimaryKey() {
		return _resultado.getPrimaryKey();
	}

	@Override
	public void persist() {
		_resultado.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_resultado.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_resultado.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_resultado.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_resultado.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the id candidato of this resultado.
	*
	* @param idCandidato the id candidato of this resultado
	*/
	@Override
	public void setIdCandidato(long idCandidato) {
		_resultado.setIdCandidato(idCandidato);
	}

	/**
	* Sets the id oferta of this resultado.
	*
	* @param idOferta the id oferta of this resultado
	*/
	@Override
	public void setIdOferta(long idOferta) {
		_resultado.setIdOferta(idOferta);
	}

	@Override
	public void setNew(boolean n) {
		_resultado.setNew(n);
	}

	/**
	* Sets the primary key of this resultado.
	*
	* @param primaryKey the primary key of this resultado
	*/
	@Override
	public void setPrimaryKey(
		servicioempleodigital.service.persistence.ResultadoPK primaryKey) {
		_resultado.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_resultado.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the puntuacion of this resultado.
	*
	* @param puntuacion the puntuacion of this resultado
	*/
	@Override
	public void setPuntuacion(double puntuacion) {
		_resultado.setPuntuacion(puntuacion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ResultadoWrapper)) {
			return false;
		}

		ResultadoWrapper resultadoWrapper = (ResultadoWrapper)obj;

		if (Objects.equals(_resultado, resultadoWrapper._resultado)) {
			return true;
		}

		return false;
	}

	@Override
	public Resultado getWrappedModel() {
		return _resultado;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _resultado.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _resultado.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_resultado.resetOriginalValues();
	}

	private final Resultado _resultado;
}