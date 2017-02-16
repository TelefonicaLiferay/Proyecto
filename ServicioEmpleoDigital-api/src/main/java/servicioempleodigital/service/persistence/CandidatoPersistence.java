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

import servicioempleodigital.exception.NoSuchCandidatoException;

import servicioempleodigital.model.Candidato;

/**
 * The persistence interface for the candidato service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see servicioempleodigital.service.persistence.impl.CandidatoPersistenceImpl
 * @see CandidatoUtil
 * @generated
 */
@ProviderType
public interface CandidatoPersistence extends BasePersistence<Candidato> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CandidatoUtil} to access the candidato persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the candidato in the entity cache if it is enabled.
	*
	* @param candidato the candidato
	*/
	public void cacheResult(Candidato candidato);

	/**
	* Caches the candidatos in the entity cache if it is enabled.
	*
	* @param candidatos the candidatos
	*/
	public void cacheResult(java.util.List<Candidato> candidatos);

	/**
	* Creates a new candidato with the primary key. Does not add the candidato to the database.
	*
	* @param idCandidato the primary key for the new candidato
	* @return the new candidato
	*/
	public Candidato create(long idCandidato);

	/**
	* Removes the candidato with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idCandidato the primary key of the candidato
	* @return the candidato that was removed
	* @throws NoSuchCandidatoException if a candidato with the primary key could not be found
	*/
	public Candidato remove(long idCandidato) throws NoSuchCandidatoException;

	public Candidato updateImpl(Candidato candidato);

	/**
	* Returns the candidato with the primary key or throws a {@link NoSuchCandidatoException} if it could not be found.
	*
	* @param idCandidato the primary key of the candidato
	* @return the candidato
	* @throws NoSuchCandidatoException if a candidato with the primary key could not be found
	*/
	public Candidato findByPrimaryKey(long idCandidato)
		throws NoSuchCandidatoException;

	/**
	* Returns the candidato with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param idCandidato the primary key of the candidato
	* @return the candidato, or <code>null</code> if a candidato with the primary key could not be found
	*/
	public Candidato fetchByPrimaryKey(long idCandidato);

	@Override
	public java.util.Map<java.io.Serializable, Candidato> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the candidatos.
	*
	* @return the candidatos
	*/
	public java.util.List<Candidato> findAll();

	/**
	* Returns a range of all the candidatos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CandidatoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of candidatos
	* @param end the upper bound of the range of candidatos (not inclusive)
	* @return the range of candidatos
	*/
	public java.util.List<Candidato> findAll(int start, int end);

	/**
	* Returns an ordered range of all the candidatos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CandidatoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of candidatos
	* @param end the upper bound of the range of candidatos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of candidatos
	*/
	public java.util.List<Candidato> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Candidato> orderByComparator);

	/**
	* Returns an ordered range of all the candidatos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link CandidatoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of candidatos
	* @param end the upper bound of the range of candidatos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of candidatos
	*/
	public java.util.List<Candidato> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Candidato> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the candidatos from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of candidatos.
	*
	* @return the number of candidatos
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}