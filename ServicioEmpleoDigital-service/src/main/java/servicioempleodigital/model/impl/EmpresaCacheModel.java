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

import servicioempleodigital.model.Empresa;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Empresa in entity cache.
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see Empresa
 * @generated
 */
@ProviderType
public class EmpresaCacheModel implements CacheModel<Empresa>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof EmpresaCacheModel)) {
			return false;
		}

		EmpresaCacheModel empresaCacheModel = (EmpresaCacheModel)obj;

		if (idEmpresa == empresaCacheModel.idEmpresa) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, idEmpresa);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{idEmpresa=");
		sb.append(idEmpresa);
		sb.append(", cif=");
		sb.append(cif);
		sb.append(", razonSocial=");
		sb.append(razonSocial);
		sb.append(", telefono=");
		sb.append(telefono);
		sb.append(", email=");
		sb.append(email);
		sb.append(", web=");
		sb.append(web);
		sb.append(", password=");
		sb.append(password);
		sb.append(", provincia=");
		sb.append(provincia);
		sb.append(", ciudad=");
		sb.append(ciudad);
		sb.append(", trabajadores=");
		sb.append(trabajadores);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Empresa toEntityModel() {
		EmpresaImpl empresaImpl = new EmpresaImpl();

		empresaImpl.setIdEmpresa(idEmpresa);

		if (cif == null) {
			empresaImpl.setCif(StringPool.BLANK);
		}
		else {
			empresaImpl.setCif(cif);
		}

		if (razonSocial == null) {
			empresaImpl.setRazonSocial(StringPool.BLANK);
		}
		else {
			empresaImpl.setRazonSocial(razonSocial);
		}

		if (telefono == null) {
			empresaImpl.setTelefono(StringPool.BLANK);
		}
		else {
			empresaImpl.setTelefono(telefono);
		}

		if (email == null) {
			empresaImpl.setEmail(StringPool.BLANK);
		}
		else {
			empresaImpl.setEmail(email);
		}

		if (web == null) {
			empresaImpl.setWeb(StringPool.BLANK);
		}
		else {
			empresaImpl.setWeb(web);
		}

		if (password == null) {
			empresaImpl.setPassword(StringPool.BLANK);
		}
		else {
			empresaImpl.setPassword(password);
		}

		empresaImpl.setProvincia(provincia);

		if (ciudad == null) {
			empresaImpl.setCiudad(StringPool.BLANK);
		}
		else {
			empresaImpl.setCiudad(ciudad);
		}

		empresaImpl.setTrabajadores(trabajadores);

		empresaImpl.resetOriginalValues();

		return empresaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		idEmpresa = objectInput.readLong();
		cif = objectInput.readUTF();
		razonSocial = objectInput.readUTF();
		telefono = objectInput.readUTF();
		email = objectInput.readUTF();
		web = objectInput.readUTF();
		password = objectInput.readUTF();

		provincia = objectInput.readInt();
		ciudad = objectInput.readUTF();

		trabajadores = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(idEmpresa);

		if (cif == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(cif);
		}

		if (razonSocial == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(razonSocial);
		}

		if (telefono == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(telefono);
		}

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (web == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(web);
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

		objectOutput.writeInt(trabajadores);
	}

	public long idEmpresa;
	public String cif;
	public String razonSocial;
	public String telefono;
	public String email;
	public String web;
	public String password;
	public int provincia;
	public String ciudad;
	public int trabajadores;
}