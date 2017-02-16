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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Resultado service. Represents a row in the &quot;FOO_Resultado&quot; database table, with each column mapped to a property of this class.
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see ResultadoModel
 * @see servicioempleodigital.model.impl.ResultadoImpl
 * @see servicioempleodigital.model.impl.ResultadoModelImpl
 * @generated
 */
@ImplementationClassName("servicioempleodigital.model.impl.ResultadoImpl")
@ProviderType
public interface Resultado extends ResultadoModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link servicioempleodigital.model.impl.ResultadoImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Resultado, Long> ID_CANDIDATO_ACCESSOR = new Accessor<Resultado, Long>() {
			@Override
			public Long get(Resultado resultado) {
				return resultado.getIdCandidato();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Resultado> getTypeClass() {
				return Resultado.class;
			}
		};

	public static final Accessor<Resultado, Long> ID_OFERTA_ACCESSOR = new Accessor<Resultado, Long>() {
			@Override
			public Long get(Resultado resultado) {
				return resultado.getIdOferta();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Resultado> getTypeClass() {
				return Resultado.class;
			}
		};
}