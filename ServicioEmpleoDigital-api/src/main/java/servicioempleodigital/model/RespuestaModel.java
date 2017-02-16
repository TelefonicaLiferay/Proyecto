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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

/**
 * The base model interface for the Respuesta service. Represents a row in the &quot;FOO_Respuesta&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link servicioempleodigital.model.impl.RespuestaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link servicioempleodigital.model.impl.RespuestaImpl}.
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see Respuesta
 * @see servicioempleodigital.model.impl.RespuestaImpl
 * @see servicioempleodigital.model.impl.RespuestaModelImpl
 * @generated
 */
@ProviderType
public interface RespuestaModel extends BaseModel<Respuesta> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a respuesta model instance should use the {@link Respuesta} interface instead.
	 */

	/**
	 * Returns the primary key of this respuesta.
	 *
	 * @return the primary key of this respuesta
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this respuesta.
	 *
	 * @param primaryKey the primary key of this respuesta
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the id respuesta of this respuesta.
	 *
	 * @return the id respuesta of this respuesta
	 */
	public long getIdRespuesta();

	/**
	 * Sets the id respuesta of this respuesta.
	 *
	 * @param idRespuesta the id respuesta of this respuesta
	 */
	public void setIdRespuesta(long idRespuesta);

	/**
	 * Returns the respuesta of this respuesta.
	 *
	 * @return the respuesta of this respuesta
	 */
	@AutoEscape
	public String getRespuesta();

	/**
	 * Sets the respuesta of this respuesta.
	 *
	 * @param respuesta the respuesta of this respuesta
	 */
	public void setRespuesta(String respuesta);

	/**
	 * Returns the valor of this respuesta.
	 *
	 * @return the valor of this respuesta
	 */
	public double getValor();

	/**
	 * Sets the valor of this respuesta.
	 *
	 * @param valor the valor of this respuesta
	 */
	public void setValor(double valor);

	/**
	 * Returns the id pregunta of this respuesta.
	 *
	 * @return the id pregunta of this respuesta
	 */
	public long getIdPregunta();

	/**
	 * Sets the id pregunta of this respuesta.
	 *
	 * @param idPregunta the id pregunta of this respuesta
	 */
	public void setIdPregunta(long idPregunta);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(servicioempleodigital.model.Respuesta respuesta);

	@Override
	public int hashCode();

	@Override
	public CacheModel<servicioempleodigital.model.Respuesta> toCacheModel();

	@Override
	public servicioempleodigital.model.Respuesta toEscapedModel();

	@Override
	public servicioempleodigital.model.Respuesta toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}