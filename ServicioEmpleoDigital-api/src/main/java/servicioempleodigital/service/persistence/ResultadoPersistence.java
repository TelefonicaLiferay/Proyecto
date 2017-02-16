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

package servicioempleodigital.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import servicioempleodigital.exception.NoSuchResultadoException;

import servicioempleodigital.model.Resultado;

/**
 * The persistence interface for the resultado service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see servicioempleodigital.service.persistence.impl.ResultadoPersistenceImpl
 * @see ResultadoUtil
 * @generated
 */
@ProviderType
public interface ResultadoPersistence extends BasePersistence<Resultado> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ResultadoUtil} to access the resultado persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the resultado in the entity cache if it is enabled.
	*
	* @param resultado the resultado
	*/
	public void cacheResult(Resultado resultado);

	/**
	* Caches the resultados in the entity cache if it is enabled.
	*
	* @param resultados the resultados
	*/
	public void cacheResult(java.util.List<Resultado> resultados);

	/**
	* Creates a new resultado with the primary key. Does not add the resultado to the database.
	*
	* @param resultadoPK the primary key for the new resultado
	* @return the new resultado
	*/
	public Resultado create(
		servicioempleodigital.service.persistence.ResultadoPK resultadoPK);

	/**
	* Removes the resultado with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param resultadoPK the primary key of the resultado
	* @return the resultado that was removed
	* @throws NoSuchResultadoException if a resultado with the primary key could not be found
	*/
	public Resultado remove(
		servicioempleodigital.service.persistence.ResultadoPK resultadoPK)
		throws NoSuchResultadoException;

	public Resultado updateImpl(Resultado resultado);

	/**
	* Returns the resultado with the primary key or throws a {@link NoSuchResultadoException} if it could not be found.
	*
	* @param resultadoPK the primary key of the resultado
	* @return the resultado
	* @throws NoSuchResultadoException if a resultado with the primary key could not be found
	*/
	public Resultado findByPrimaryKey(
		servicioempleodigital.service.persistence.ResultadoPK resultadoPK)
		throws NoSuchResultadoException;

	/**
	* Returns the resultado with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param resultadoPK the primary key of the resultado
	* @return the resultado, or <code>null</code> if a resultado with the primary key could not be found
	*/
	public Resultado fetchByPrimaryKey(
		servicioempleodigital.service.persistence.ResultadoPK resultadoPK);

	@Override
	public java.util.Map<java.io.Serializable, Resultado> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the resultados.
	*
	* @return the resultados
	*/
	public java.util.List<Resultado> findAll();

	/**
	* Returns a range of all the resultados.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultadoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of resultados
	* @param end the upper bound of the range of resultados (not inclusive)
	* @return the range of resultados
	*/
	public java.util.List<Resultado> findAll(int start, int end);

	/**
	* Returns an ordered range of all the resultados.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultadoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of resultados
	* @param end the upper bound of the range of resultados (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of resultados
	*/
	public java.util.List<Resultado> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Resultado> orderByComparator);

	/**
	* Returns an ordered range of all the resultados.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ResultadoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of resultados
	* @param end the upper bound of the range of resultados (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of resultados
	*/
	public java.util.List<Resultado> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Resultado> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the resultados from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of resultados.
	*
	* @return the number of resultados
	*/
	public int countAll();
}