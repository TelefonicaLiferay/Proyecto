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

import servicioempleodigital.exception.NoSuchEmpresaException;

import servicioempleodigital.model.Empresa;

/**
 * The persistence interface for the empresa service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see servicioempleodigital.service.persistence.impl.EmpresaPersistenceImpl
 * @see EmpresaUtil
 * @generated
 */
@ProviderType
public interface EmpresaPersistence extends BasePersistence<Empresa> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmpresaUtil} to access the empresa persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the empresa in the entity cache if it is enabled.
	*
	* @param empresa the empresa
	*/
	public void cacheResult(Empresa empresa);

	/**
	* Caches the empresas in the entity cache if it is enabled.
	*
	* @param empresas the empresas
	*/
	public void cacheResult(java.util.List<Empresa> empresas);

	/**
	* Creates a new empresa with the primary key. Does not add the empresa to the database.
	*
	* @param idEmpresa the primary key for the new empresa
	* @return the new empresa
	*/
	public Empresa create(long idEmpresa);

	/**
	* Removes the empresa with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idEmpresa the primary key of the empresa
	* @return the empresa that was removed
	* @throws NoSuchEmpresaException if a empresa with the primary key could not be found
	*/
	public Empresa remove(long idEmpresa) throws NoSuchEmpresaException;

	public Empresa updateImpl(Empresa empresa);

	/**
	* Returns the empresa with the primary key or throws a {@link NoSuchEmpresaException} if it could not be found.
	*
	* @param idEmpresa the primary key of the empresa
	* @return the empresa
	* @throws NoSuchEmpresaException if a empresa with the primary key could not be found
	*/
	public Empresa findByPrimaryKey(long idEmpresa)
		throws NoSuchEmpresaException;

	/**
	* Returns the empresa with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param idEmpresa the primary key of the empresa
	* @return the empresa, or <code>null</code> if a empresa with the primary key could not be found
	*/
	public Empresa fetchByPrimaryKey(long idEmpresa);

	@Override
	public java.util.Map<java.io.Serializable, Empresa> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the empresas.
	*
	* @return the empresas
	*/
	public java.util.List<Empresa> findAll();

	/**
	* Returns a range of all the empresas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpresaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of empresas
	* @param end the upper bound of the range of empresas (not inclusive)
	* @return the range of empresas
	*/
	public java.util.List<Empresa> findAll(int start, int end);

	/**
	* Returns an ordered range of all the empresas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpresaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of empresas
	* @param end the upper bound of the range of empresas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of empresas
	*/
	public java.util.List<Empresa> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Empresa> orderByComparator);

	/**
	* Returns an ordered range of all the empresas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link EmpresaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of empresas
	* @param end the upper bound of the range of empresas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of empresas
	*/
	public java.util.List<Empresa> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Empresa> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the empresas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of empresas.
	*
	* @return the number of empresas
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}