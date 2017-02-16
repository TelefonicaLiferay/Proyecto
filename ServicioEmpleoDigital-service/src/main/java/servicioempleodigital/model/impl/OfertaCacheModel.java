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

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import servicioempleodigital.model.Oferta;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Oferta in entity cache.
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see Oferta
 * @generated
 */
@ProviderType
public class OfertaCacheModel implements CacheModel<Oferta>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OfertaCacheModel)) {
			return false;
		}

		OfertaCacheModel ofertaCacheModel = (OfertaCacheModel)obj;

		if (idOferta == ofertaCacheModel.idOferta) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, idOferta);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{idOferta=");
		sb.append(idOferta);
		sb.append(", titulo=");
		sb.append(titulo);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", provincia=");
		sb.append(provincia);
		sb.append(", ciudad=");
		sb.append(ciudad);
		sb.append(", salario=");
		sb.append(salario);
		sb.append(", fechaInicio=");
		sb.append(fechaInicio);
		sb.append(", fechaModificacion=");
		sb.append(fechaModificacion);
		sb.append(", fechaFin=");
		sb.append(fechaFin);
		sb.append(", plazas=");
		sb.append(plazas);
		sb.append(", candidatos=");
		sb.append(candidatos);
		sb.append(", requisitosMinimos=");
		sb.append(requisitosMinimos);
		sb.append(", requisitosOpcionales=");
		sb.append(requisitosOpcionales);
		sb.append(", activa=");
		sb.append(activa);
		sb.append(", idEmpresa=");
		sb.append(idEmpresa);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Oferta toEntityModel() {
		OfertaImpl ofertaImpl = new OfertaImpl();

		ofertaImpl.setIdOferta(idOferta);

		if (titulo == null) {
			ofertaImpl.setTitulo(StringPool.BLANK);
		}
		else {
			ofertaImpl.setTitulo(titulo);
		}

		if (descripcion == null) {
			ofertaImpl.setDescripcion(StringPool.BLANK);
		}
		else {
			ofertaImpl.setDescripcion(descripcion);
		}

		ofertaImpl.setProvincia(provincia);

		if (ciudad == null) {
			ofertaImpl.setCiudad(StringPool.BLANK);
		}
		else {
			ofertaImpl.setCiudad(ciudad);
		}

		if (salario == null) {
			ofertaImpl.setSalario(StringPool.BLANK);
		}
		else {
			ofertaImpl.setSalario(salario);
		}

		if (fechaInicio == Long.MIN_VALUE) {
			ofertaImpl.setFechaInicio(null);
		}
		else {
			ofertaImpl.setFechaInicio(new Date(fechaInicio));
		}

		if (fechaModificacion == Long.MIN_VALUE) {
			ofertaImpl.setFechaModificacion(null);
		}
		else {
			ofertaImpl.setFechaModificacion(new Date(fechaModificacion));
		}

		if (fechaFin == Long.MIN_VALUE) {
			ofertaImpl.setFechaFin(null);
		}
		else {
			ofertaImpl.setFechaFin(new Date(fechaFin));
		}

		ofertaImpl.setPlazas(plazas);
		ofertaImpl.setCandidatos(candidatos);

		if (requisitosMinimos == null) {
			ofertaImpl.setRequisitosMinimos(StringPool.BLANK);
		}
		else {
			ofertaImpl.setRequisitosMinimos(requisitosMinimos);
		}

		if (requisitosOpcionales == null) {
			ofertaImpl.setRequisitosOpcionales(StringPool.BLANK);
		}
		else {
			ofertaImpl.setRequisitosOpcionales(requisitosOpcionales);
		}

		ofertaImpl.setActiva(activa);
		ofertaImpl.setIdEmpresa(idEmpresa);

		ofertaImpl.resetOriginalValues();

		return ofertaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		idOferta = objectInput.readLong();
		titulo = objectInput.readUTF();
		descripcion = objectInput.readUTF();

		provincia = objectInput.readInt();
		ciudad = objectInput.readUTF();
		salario = objectInput.readUTF();
		fechaInicio = objectInput.readLong();
		fechaModificacion = objectInput.readLong();
		fechaFin = objectInput.readLong();

		plazas = objectInput.readInt();

		candidatos = objectInput.readInt();
		requisitosMinimos = objectInput.readUTF();
		requisitosOpcionales = objectInput.readUTF();

		activa = objectInput.readBoolean();

		idEmpresa = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(idOferta);

		if (titulo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(titulo);
		}

		if (descripcion == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		objectOutput.writeInt(provincia);

		if (ciudad == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ciudad);
		}

		if (salario == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(salario);
		}

		objectOutput.writeLong(fechaInicio);
		objectOutput.writeLong(fechaModificacion);
		objectOutput.writeLong(fechaFin);

		objectOutput.writeInt(plazas);

		objectOutput.writeInt(candidatos);

		if (requisitosMinimos == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(requisitosMinimos);
		}

		if (requisitosOpcionales == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(requisitosOpcionales);
		}

		objectOutput.writeBoolean(activa);

		objectOutput.writeLong(idEmpresa);
	}

	public long idOferta;
	public String titulo;
	public String descripcion;
	public int provincia;
	public String ciudad;
	public String salario;
	public long fechaInicio;
	public long fechaModificacion;
	public long fechaFin;
	public int plazas;
	public int candidatos;
	public String requisitosMinimos;
	public String requisitosOpcionales;
	public boolean activa;
	public long idEmpresa;
}