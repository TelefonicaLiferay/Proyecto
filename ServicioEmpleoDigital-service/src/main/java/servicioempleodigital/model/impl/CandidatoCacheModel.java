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

import servicioempleodigital.model.Candidato;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Candidato in entity cache.
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see Candidato
 * @generated
 */
@ProviderType
public class CandidatoCacheModel implements CacheModel<Candidato>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CandidatoCacheModel)) {
			return false;
		}

		CandidatoCacheModel candidatoCacheModel = (CandidatoCacheModel)obj;

		if (idCandidato == candidatoCacheModel.idCandidato) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, idCandidato);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{idCandidato=");
		sb.append(idCandidato);
		sb.append(", nif=");
		sb.append(nif);
		sb.append(", nombre=");
		sb.append(nombre);
		sb.append(", apellidos=");
		sb.append(apellidos);
		sb.append(", fechaDeNacimiento=");
		sb.append(fechaDeNacimiento);
		sb.append(", email=");
		sb.append(email);
		sb.append(", telefono=");
		sb.append(telefono);
		sb.append(", password=");
		sb.append(password);
		sb.append(", provincia=");
		sb.append(provincia);
		sb.append(", ciudad=");
		sb.append(ciudad);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Candidato toEntityModel() {
		CandidatoImpl candidatoImpl = new CandidatoImpl();

		candidatoImpl.setIdCandidato(idCandidato);

		if (nif == null) {
			candidatoImpl.setNif(StringPool.BLANK);
		}
		else {
			candidatoImpl.setNif(nif);
		}

		if (nombre == null) {
			candidatoImpl.setNombre(StringPool.BLANK);
		}
		else {
			candidatoImpl.setNombre(nombre);
		}

		if (apellidos == null) {
			candidatoImpl.setApellidos(StringPool.BLANK);
		}
		else {
			candidatoImpl.setApellidos(apellidos);
		}

		if (fechaDeNacimiento == Long.MIN_VALUE) {
			candidatoImpl.setFechaDeNacimiento(null);
		}
		else {
			candidatoImpl.setFechaDeNacimiento(new Date(fechaDeNacimiento));
		}

		if (email == null) {
			candidatoImpl.setEmail(StringPool.BLANK);
		}
		else {
			candidatoImpl.setEmail(email);
		}

		if (telefono == null) {
			candidatoImpl.setTelefono(StringPool.BLANK);
		}
		else {
			candidatoImpl.setTelefono(telefono);
		}

		if (password == null) {
			candidatoImpl.setPassword(StringPool.BLANK);
		}
		else {
			candidatoImpl.setPassword(password);
		}

		candidatoImpl.setProvincia(provincia);

		if (ciudad == null) {
			candidatoImpl.setCiudad(StringPool.BLANK);
		}
		else {
			candidatoImpl.setCiudad(ciudad);
		}

		candidatoImpl.resetOriginalValues();

		return candidatoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		idCandidato = objectInput.readLong();
		nif = objectInput.readUTF();
		nombre = objectInput.readUTF();
		apellidos = objectInput.readUTF();
		fechaDeNacimiento = objectInput.readLong();
		email = objectInput.readUTF();
		telefono = objectInput.readUTF();
		password = objectInput.readUTF();

		provincia = objectInput.readInt();
		ciudad = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(idCandidato);

		if (nif == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nif);
		}

		if (nombre == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nombre);
		}

		if (apellidos == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(apellidos);
		}

		objectOutput.writeLong(fechaDeNacimiento);

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (telefono == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(telefono);
		}

		if (password == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(password);
		}

		objectOutput.writeInt(provincia);

		if (ciudad == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(ciudad);
		}
	}

	public long idCandidato;
	public String nif;
	public String nombre;
	public String apellidos;
	public long fechaDeNacimiento;
	public String email;
	public String telefono;
	public String password;
	public int provincia;
	public String ciudad;
}