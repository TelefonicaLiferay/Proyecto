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

import servicioempleodigital.model.Oferta;
import servicioempleodigital.model.OfertaModel;
import servicioempleodigital.model.OfertaSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Oferta service. Represents a row in the &quot;FOO_Oferta&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link OfertaModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OfertaImpl}.
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see OfertaImpl
 * @see Oferta
 * @see OfertaModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class OfertaModelImpl extends BaseModelImpl<Oferta>
	implements OfertaModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a oferta model instance should use the {@link Oferta} interface instead.
	 */
	public static final String TABLE_NAME = "FOO_Oferta";
	public static final Object[][] TABLE_COLUMNS = {
			{ "idOferta", Types.BIGINT },
			{ "titulo", Types.VARCHAR },
			{ "descripcion", Types.VARCHAR },
			{ "provincia", Types.INTEGER },
			{ "ciudad", Types.VARCHAR },
			{ "salario", Types.VARCHAR },
			{ "fechaInicio", Types.TIMESTAMP },
			{ "fechaModificacion", Types.TIMESTAMP },
			{ "fechaFin", Types.TIMESTAMP },
			{ "plazas", Types.INTEGER },
			{ "candidatos", Types.INTEGER },
			{ "requisitosMinimos", Types.VARCHAR },
			{ "requisitosOpcionales", Types.VARCHAR },
			{ "activa", Types.BOOLEAN },
			{ "idEmpresa", Types.BIGINT }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("idOferta", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("titulo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("descripcion", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("provincia", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("ciudad", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("salario", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("fechaInicio", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("fechaModificacion", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("fechaFin", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("plazas", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("candidatos", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("requisitosMinimos", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("requisitosOpcionales", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("activa", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("idEmpresa", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE = "create table FOO_Oferta (idOferta LONG not null primary key IDENTITY,titulo VARCHAR(75) null,descripcion VARCHAR(75) null,provincia INTEGER,ciudad VARCHAR(75) null,salario VARCHAR(75) null,fechaInicio DATE null,fechaModificacion DATE null,fechaFin DATE null,plazas INTEGER,candidatos INTEGER,requisitosMinimos VARCHAR(75) null,requisitosOpcionales VARCHAR(75) null,activa BOOLEAN,idEmpresa LONG)";
	public static final String TABLE_SQL_DROP = "drop table FOO_Oferta";
	public static final String ORDER_BY_JPQL = " ORDER BY oferta.idOferta ASC";
	public static final String ORDER_BY_SQL = " ORDER BY FOO_Oferta.idOferta ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(servicioempleodigital.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.servicioempleodigital.model.Oferta"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(servicioempleodigital.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.servicioempleodigital.model.Oferta"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Oferta toModel(OfertaSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Oferta model = new OfertaImpl();

		model.setIdOferta(soapModel.getIdOferta());
		model.setTitulo(soapModel.getTitulo());
		model.setDescripcion(soapModel.getDescripcion());
		model.setProvincia(soapModel.getProvincia());
		model.setCiudad(soapModel.getCiudad());
		model.setSalario(soapModel.getSalario());
		model.setFechaInicio(soapModel.getFechaInicio());
		model.setFechaModificacion(soapModel.getFechaModificacion());
		model.setFechaFin(soapModel.getFechaFin());
		model.setPlazas(soapModel.getPlazas());
		model.setCandidatos(soapModel.getCandidatos());
		model.setRequisitosMinimos(soapModel.getRequisitosMinimos());
		model.setRequisitosOpcionales(soapModel.getRequisitosOpcionales());
		model.setActiva(soapModel.getActiva());
		model.setIdEmpresa(soapModel.getIdEmpresa());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Oferta> toModels(OfertaSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Oferta> models = new ArrayList<Oferta>(soapModels.length);

		for (OfertaSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(servicioempleodigital.service.util.ServiceProps.get(
				"lock.expiration.time.servicioempleodigital.model.Oferta"));

	public OfertaModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _idOferta;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setIdOferta(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _idOferta;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

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

	@JSON
	@Override
	public long getIdOferta() {
		return _idOferta;
	}

	@Override
	public void setIdOferta(long idOferta) {
		_idOferta = idOferta;
	}

	@JSON
	@Override
	public String getTitulo() {
		if (_titulo == null) {
			return StringPool.BLANK;
		}
		else {
			return _titulo;
		}
	}

	@Override
	public void setTitulo(String titulo) {
		_titulo = titulo;
	}

	@JSON
	@Override
	public String getDescripcion() {
		if (_descripcion == null) {
			return StringPool.BLANK;
		}
		else {
			return _descripcion;
		}
	}

	@Override
	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
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
	public String getSalario() {
		if (_salario == null) {
			return StringPool.BLANK;
		}
		else {
			return _salario;
		}
	}

	@Override
	public void setSalario(String salario) {
		_salario = salario;
	}

	@JSON
	@Override
	public Date getFechaInicio() {
		return _fechaInicio;
	}

	@Override
	public void setFechaInicio(Date fechaInicio) {
		_fechaInicio = fechaInicio;
	}

	@JSON
	@Override
	public Date getFechaModificacion() {
		return _fechaModificacion;
	}

	@Override
	public void setFechaModificacion(Date fechaModificacion) {
		_fechaModificacion = fechaModificacion;
	}

	@JSON
	@Override
	public Date getFechaFin() {
		return _fechaFin;
	}

	@Override
	public void setFechaFin(Date fechaFin) {
		_fechaFin = fechaFin;
	}

	@JSON
	@Override
	public int getPlazas() {
		return _plazas;
	}

	@Override
	public void setPlazas(int plazas) {
		_plazas = plazas;
	}

	@JSON
	@Override
	public int getCandidatos() {
		return _candidatos;
	}

	@Override
	public void setCandidatos(int candidatos) {
		_candidatos = candidatos;
	}

	@JSON
	@Override
	public String getRequisitosMinimos() {
		if (_requisitosMinimos == null) {
			return StringPool.BLANK;
		}
		else {
			return _requisitosMinimos;
		}
	}

	@Override
	public void setRequisitosMinimos(String requisitosMinimos) {
		_requisitosMinimos = requisitosMinimos;
	}

	@JSON
	@Override
	public String getRequisitosOpcionales() {
		if (_requisitosOpcionales == null) {
			return StringPool.BLANK;
		}
		else {
			return _requisitosOpcionales;
		}
	}

	@Override
	public void setRequisitosOpcionales(String requisitosOpcionales) {
		_requisitosOpcionales = requisitosOpcionales;
	}

	@JSON
	@Override
	public boolean getActiva() {
		return _activa;
	}

	@JSON
	@Override
	public boolean isActiva() {
		return _activa;
	}

	@Override
	public void setActiva(boolean activa) {
		_activa = activa;
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

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Oferta.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Oferta toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Oferta)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		OfertaImpl ofertaImpl = new OfertaImpl();

		ofertaImpl.setIdOferta(getIdOferta());
		ofertaImpl.setTitulo(getTitulo());
		ofertaImpl.setDescripcion(getDescripcion());
		ofertaImpl.setProvincia(getProvincia());
		ofertaImpl.setCiudad(getCiudad());
		ofertaImpl.setSalario(getSalario());
		ofertaImpl.setFechaInicio(getFechaInicio());
		ofertaImpl.setFechaModificacion(getFechaModificacion());
		ofertaImpl.setFechaFin(getFechaFin());
		ofertaImpl.setPlazas(getPlazas());
		ofertaImpl.setCandidatos(getCandidatos());
		ofertaImpl.setRequisitosMinimos(getRequisitosMinimos());
		ofertaImpl.setRequisitosOpcionales(getRequisitosOpcionales());
		ofertaImpl.setActiva(getActiva());
		ofertaImpl.setIdEmpresa(getIdEmpresa());

		ofertaImpl.resetOriginalValues();

		return ofertaImpl;
	}

	@Override
	public int compareTo(Oferta oferta) {
		long primaryKey = oferta.getPrimaryKey();

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

		if (!(obj instanceof Oferta)) {
			return false;
		}

		Oferta oferta = (Oferta)obj;

		long primaryKey = oferta.getPrimaryKey();

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
	public CacheModel<Oferta> toCacheModel() {
		OfertaCacheModel ofertaCacheModel = new OfertaCacheModel();

		ofertaCacheModel.idOferta = getIdOferta();

		ofertaCacheModel.titulo = getTitulo();

		String titulo = ofertaCacheModel.titulo;

		if ((titulo != null) && (titulo.length() == 0)) {
			ofertaCacheModel.titulo = null;
		}

		ofertaCacheModel.descripcion = getDescripcion();

		String descripcion = ofertaCacheModel.descripcion;

		if ((descripcion != null) && (descripcion.length() == 0)) {
			ofertaCacheModel.descripcion = null;
		}

		ofertaCacheModel.provincia = getProvincia();

		ofertaCacheModel.ciudad = getCiudad();

		String ciudad = ofertaCacheModel.ciudad;

		if ((ciudad != null) && (ciudad.length() == 0)) {
			ofertaCacheModel.ciudad = null;
		}

		ofertaCacheModel.salario = getSalario();

		String salario = ofertaCacheModel.salario;

		if ((salario != null) && (salario.length() == 0)) {
			ofertaCacheModel.salario = null;
		}

		Date fechaInicio = getFechaInicio();

		if (fechaInicio != null) {
			ofertaCacheModel.fechaInicio = fechaInicio.getTime();
		}
		else {
			ofertaCacheModel.fechaInicio = Long.MIN_VALUE;
		}

		Date fechaModificacion = getFechaModificacion();

		if (fechaModificacion != null) {
			ofertaCacheModel.fechaModificacion = fechaModificacion.getTime();
		}
		else {
			ofertaCacheModel.fechaModificacion = Long.MIN_VALUE;
		}

		Date fechaFin = getFechaFin();

		if (fechaFin != null) {
			ofertaCacheModel.fechaFin = fechaFin.getTime();
		}
		else {
			ofertaCacheModel.fechaFin = Long.MIN_VALUE;
		}

		ofertaCacheModel.plazas = getPlazas();

		ofertaCacheModel.candidatos = getCandidatos();

		ofertaCacheModel.requisitosMinimos = getRequisitosMinimos();

		String requisitosMinimos = ofertaCacheModel.requisitosMinimos;

		if ((requisitosMinimos != null) && (requisitosMinimos.length() == 0)) {
			ofertaCacheModel.requisitosMinimos = null;
		}

		ofertaCacheModel.requisitosOpcionales = getRequisitosOpcionales();

		String requisitosOpcionales = ofertaCacheModel.requisitosOpcionales;

		if ((requisitosOpcionales != null) &&
				(requisitosOpcionales.length() == 0)) {
			ofertaCacheModel.requisitosOpcionales = null;
		}

		ofertaCacheModel.activa = getActiva();

		ofertaCacheModel.idEmpresa = getIdEmpresa();

		return ofertaCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{idOferta=");
		sb.append(getIdOferta());
		sb.append(", titulo=");
		sb.append(getTitulo());
		sb.append(", descripcion=");
		sb.append(getDescripcion());
		sb.append(", provincia=");
		sb.append(getProvincia());
		sb.append(", ciudad=");
		sb.append(getCiudad());
		sb.append(", salario=");
		sb.append(getSalario());
		sb.append(", fechaInicio=");
		sb.append(getFechaInicio());
		sb.append(", fechaModificacion=");
		sb.append(getFechaModificacion());
		sb.append(", fechaFin=");
		sb.append(getFechaFin());
		sb.append(", plazas=");
		sb.append(getPlazas());
		sb.append(", candidatos=");
		sb.append(getCandidatos());
		sb.append(", requisitosMinimos=");
		sb.append(getRequisitosMinimos());
		sb.append(", requisitosOpcionales=");
		sb.append(getRequisitosOpcionales());
		sb.append(", activa=");
		sb.append(getActiva());
		sb.append(", idEmpresa=");
		sb.append(getIdEmpresa());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("servicioempleodigital.model.Oferta");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>idOferta</column-name><column-value><![CDATA[");
		sb.append(getIdOferta());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>titulo</column-name><column-value><![CDATA[");
		sb.append(getTitulo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>descripcion</column-name><column-value><![CDATA[");
		sb.append(getDescripcion());
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
			"<column><column-name>salario</column-name><column-value><![CDATA[");
		sb.append(getSalario());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaInicio</column-name><column-value><![CDATA[");
		sb.append(getFechaInicio());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaModificacion</column-name><column-value><![CDATA[");
		sb.append(getFechaModificacion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fechaFin</column-name><column-value><![CDATA[");
		sb.append(getFechaFin());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>plazas</column-name><column-value><![CDATA[");
		sb.append(getPlazas());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>candidatos</column-name><column-value><![CDATA[");
		sb.append(getCandidatos());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requisitosMinimos</column-name><column-value><![CDATA[");
		sb.append(getRequisitosMinimos());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>requisitosOpcionales</column-name><column-value><![CDATA[");
		sb.append(getRequisitosOpcionales());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>activa</column-name><column-value><![CDATA[");
		sb.append(getActiva());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idEmpresa</column-name><column-value><![CDATA[");
		sb.append(getIdEmpresa());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Oferta.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Oferta.class
		};
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
	private Oferta _escapedModel;
}