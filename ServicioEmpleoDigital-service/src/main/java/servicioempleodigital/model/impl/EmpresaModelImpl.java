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

package servicioempleodigital.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import servicioempleodigital.model.Empresa;
import servicioempleodigital.model.EmpresaModel;
import servicioempleodigital.model.EmpresaSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Empresa service. Represents a row in the &quot;FOO_Empresa&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link EmpresaModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmpresaImpl}.
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see EmpresaImpl
 * @see Empresa
 * @see EmpresaModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class EmpresaModelImpl extends BaseModelImpl<Empresa>
	implements EmpresaModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a empresa model instance should use the {@link Empresa} interface instead.
	 */
	public static final String TABLE_NAME = "FOO_Empresa";
	public static final Object[][] TABLE_COLUMNS = {
			{ "idEmpresa", Types.BIGINT },
			{ "cif", Types.VARCHAR },
			{ "razonSocial", Types.VARCHAR },
			{ "telefono", Types.VARCHAR },
			{ "email", Types.VARCHAR },
			{ "web", Types.VARCHAR },
			{ "password_", Types.VARCHAR },
			{ "provincia", Types.INTEGER },
			{ "ciudad", Types.VARCHAR },
			{ "trabajadores", Types.INTEGER }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("idEmpresa", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("cif", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("razonSocial", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("telefono", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("email", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("web", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("password_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("provincia", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("ciudad", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("trabajadores", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE = "create table FOO_Empresa (idEmpresa LONG not null primary key IDENTITY,cif VARCHAR(75) null,razonSocial VARCHAR(75) null,telefono VARCHAR(75) null,email VARCHAR(75) null,web VARCHAR(75) null,password_ VARCHAR(75) null,provincia INTEGER,ciudad VARCHAR(75) null,trabajadores INTEGER)";
	public static final String TABLE_SQL_DROP = "drop table FOO_Empresa";
	public static final String ORDER_BY_JPQL = " ORDER BY empresa.idEmpresa ASC";
	public static final String ORDER_BY_SQL = " ORDER BY FOO_Empresa.idEmpresa ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(servicioempleodigital.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.servicioempleodigital.model.Empresa"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(servicioempleodigital.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.servicioempleodigital.model.Empresa"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Empresa toModel(EmpresaSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Empresa model = new EmpresaImpl();

		model.setIdEmpresa(soapModel.getIdEmpresa());
		model.setCif(soapModel.getCif());
		model.setRazonSocial(soapModel.getRazonSocial());
		model.setTelefono(soapModel.getTelefono());
		model.setEmail(soapModel.getEmail());
		model.setWeb(soapModel.getWeb());
		model.setPassword(soapModel.getPassword());
		model.setProvincia(soapModel.getProvincia());
		model.setCiudad(soapModel.getCiudad());
		model.setTrabajadores(soapModel.getTrabajadores());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Empresa> toModels(EmpresaSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Empresa> models = new ArrayList<Empresa>(soapModels.length);

		for (EmpresaSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(servicioempleodigital.service.util.ServiceProps.get(
				"lock.expiration.time.servicioempleodigital.model.Empresa"));

	public EmpresaModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _idEmpresa;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setIdEmpresa(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _idEmpresa;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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

	@JSON
	@Override
	public long getIdEmpresa() {
		return _idEmpresa;
	}

	@Override
	public void setIdEmpresa(long idEmpresa) {
		_idEmpresa = idEmpresa;
	}

	@JSON
	@Override
	public String getCif() {
		if (_cif == null) {
			return StringPool.BLANK;
		}
		else {
			return _cif;
		}
	}

	@Override
	public void setCif(String cif) {
		_cif = cif;
	}

	@JSON
	@Override
	public String getRazonSocial() {
		if (_razonSocial == null) {
			return StringPool.BLANK;
		}
		else {
			return _razonSocial;
		}
	}

	@Override
	public void setRazonSocial(String razonSocial) {
		_razonSocial = razonSocial;
	}

	@JSON
	@Override
	public String getTelefono() {
		if (_telefono == null) {
			return StringPool.BLANK;
		}
		else {
			return _telefono;
		}
	}

	@Override
	public void setTelefono(String telefono) {
		_telefono = telefono;
	}

	@JSON
	@Override
	public String getEmail() {
		if (_email == null) {
			return StringPool.BLANK;
		}
		else {
			return _email;
		}
	}

	@Override
	public void setEmail(String email) {
		_email = email;
	}

	@JSON
	@Override
	public String getWeb() {
		if (_web == null) {
			return StringPool.BLANK;
		}
		else {
			return _web;
		}
	}

	@Override
	public void setWeb(String web) {
		_web = web;
	}

	@JSON
	@Override
	public String getPassword() {
		if (_password == null) {
			return StringPool.BLANK;
		}
		else {
			return _password;
		}
	}

	@Override
	public void setPassword(String password) {
		_password = password;
	}

	@JSON
	@Override
	public int getProvincia() {
		return _provincia;
	}

	@Override
	public void setProvincia(int provincia) {
		_provincia = provincia;
	}

	@JSON
	@Override
	public String getCiudad() {
		if (_ciudad == null) {
			return StringPool.BLANK;
		}
		else {
			return _ciudad;
		}
	}

	@Override
	public void setCiudad(String ciudad) {
		_ciudad = ciudad;
	}

	@JSON
	@Override
	public int getTrabajadores() {
		return _trabajadores;
	}

	@Override
	public void setTrabajadores(int trabajadores) {
		_trabajadores = trabajadores;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Empresa.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Empresa toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Empresa)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EmpresaImpl empresaImpl = new EmpresaImpl();

		empresaImpl.setIdEmpresa(getIdEmpresa());
		empresaImpl.setCif(getCif());
		empresaImpl.setRazonSocial(getRazonSocial());
		empresaImpl.setTelefono(getTelefono());
		empresaImpl.setEmail(getEmail());
		empresaImpl.setWeb(getWeb());
		empresaImpl.setPassword(getPassword());
		empresaImpl.setProvincia(getProvincia());
		empresaImpl.setCiudad(getCiudad());
		empresaImpl.setTrabajadores(getTrabajadores());

		empresaImpl.resetOriginalValues();

		return empresaImpl;
	}

	@Override
	public int compareTo(Empresa empresa) {
		long primaryKey = empresa.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Empresa)) {
			return false;
		}

		Empresa empresa = (Empresa)obj;

		long primaryKey = empresa.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Empresa> toCacheModel() {
		EmpresaCacheModel empresaCacheModel = new EmpresaCacheModel();

		empresaCacheModel.idEmpresa = getIdEmpresa();

		empresaCacheModel.cif = getCif();

		String cif = empresaCacheModel.cif;

		if ((cif != null) && (cif.length() == 0)) {
			empresaCacheModel.cif = null;
		}

		empresaCacheModel.razonSocial = getRazonSocial();

		String razonSocial = empresaCacheModel.razonSocial;

		if ((razonSocial != null) && (razonSocial.length() == 0)) {
			empresaCacheModel.razonSocial = null;
		}

		empresaCacheModel.telefono = getTelefono();

		String telefono = empresaCacheModel.telefono;

		if ((telefono != null) && (telefono.length() == 0)) {
			empresaCacheModel.telefono = null;
		}

		empresaCacheModel.email = getEmail();

		String email = empresaCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			empresaCacheModel.email = null;
		}

		empresaCacheModel.web = getWeb();

		String web = empresaCacheModel.web;

		if ((web != null) && (web.length() == 0)) {
			empresaCacheModel.web = null;
		}

		empresaCacheModel.password = getPassword();

		String password = empresaCacheModel.password;

		if ((password != null) && (password.length() == 0)) {
			empresaCacheModel.password = null;
		}

		empresaCacheModel.provincia = getProvincia();

		empresaCacheModel.ciudad = getCiudad();

		String ciudad = empresaCacheModel.ciudad;

		if ((ciudad != null) && (ciudad.length() == 0)) {
			empresaCacheModel.ciudad = null;
		}

		empresaCacheModel.trabajadores = getTrabajadores();

		return empresaCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{idEmpresa=");
		sb.append(getIdEmpresa());
		sb.append(", cif=");
		sb.append(getCif());
		sb.append(", razonSocial=");
		sb.append(getRazonSocial());
		sb.append(", telefono=");
		sb.append(getTelefono());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", web=");
		sb.append(getWeb());
		sb.append(", password=");
		sb.append(getPassword());
		sb.append(", provincia=");
		sb.append(getProvincia());
		sb.append(", ciudad=");
		sb.append(getCiudad());
		sb.append(", trabajadores=");
		sb.append(getTrabajadores());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("servicioempleodigital.model.Empresa");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>idEmpresa</column-name><column-value><![CDATA[");
		sb.append(getIdEmpresa());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cif</column-name><column-value><![CDATA[");
		sb.append(getCif());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>razonSocial</column-name><column-value><![CDATA[");
		sb.append(getRazonSocial());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>telefono</column-name><column-value><![CDATA[");
		sb.append(getTelefono());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>web</column-name><column-value><![CDATA[");
		sb.append(getWeb());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>password</column-name><column-value><![CDATA[");
		sb.append(getPassword());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>provincia</column-name><column-value><![CDATA[");
		sb.append(getProvincia());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ciudad</column-name><column-value><![CDATA[");
		sb.append(getCiudad());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>trabajadores</column-name><column-value><![CDATA[");
		sb.append(getTrabajadores());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Empresa.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Empresa.class
		};
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
	private Empresa _escapedModel;
}