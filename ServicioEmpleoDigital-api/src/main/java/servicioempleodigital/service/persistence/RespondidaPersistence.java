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

import servicioempleodigital.exception.NoSuchRespondidaException;

import servicioempleodigital.model.Respondida;

/**
 * The persistence interface for the respondida service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see servicioempleodigital.service.persistence.impl.RespondidaPersistenceImpl
 * @see RespondidaUtil
 * @generated
 */
@ProviderType
public interface RespondidaPersistence extends BasePersistence<Respondida> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RespondidaUtil} to access the respondida persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the respondida in the entity cache if it is enabled.
	*
	* @param respondida the respondida
	*/
	public void cacheResult(Respondida respondida);

	/**
	* Caches the respondidas in the entity cache if it is enabled.
	*
	* @param respondidas the respondidas
	*/
	public void cacheResult(java.util.List<Respondida> respondidas);

	/**
	* Creates a new respondida with the primary key. Does not add the respondida to the database.
	*
	* @param respondidaPK the primary key for the new respondida
	* @return the new respondida
	*/
	public Respondida create(
		servicioempleodigital.service.persistence.RespondidaPK respondidaPK);

	/**
	* Removes the respondida with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param respondidaPK the primary key of the respondida
	* @return the respondida that was removed
	* @throws NoSuchRespondidaException if a respondida with the primary key could not be found
	*/
	public Respondida remove(
		servicioempleodigital.service.persistence.RespondidaPK respondidaPK)
		throws NoSuchRespondidaException;

	public Respondida updateImpl(Respondida respondida);

	/**
	* Returns the respondida with the primary key or throws a {@link NoSuchRespondidaException} if it could not be found.
	*
	* @param respondidaPK the primary key of the respondida
	* @return the respondida
	* @throws NoSuchRespondidaException if a respondida with the primary key could not be found
	*/
	public Respondida findByPrimaryKey(
		servicioempleodigital.service.persistence.RespondidaPK respondidaPK)
		throws NoSuchRespondidaException;

	/**
	* Returns the respondida with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param respondidaPK the primary key of the respondida
	* @return the respondida, or <code>null</code> if a respondida with the primary key could not be found
	*/
	public Respondida fetchByPrimaryKey(
		servicioempleodigital.service.persistence.RespondidaPK respondidaPK);

	@Override
	public java.util.Map<java.io.Serializable, Respondida> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the respondidas.
	*
	* @return the respondidas
	*/
	public java.util.List<Respondida> findAll();

	/**
	* Returns a range of all the respondidas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RespondidaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of respondidas
	* @param end the upper bound of the range of respondidas (not inclusive)
	* @return the range of respondidas
	*/
	public java.util.List<Respondida> findAll(int start, int end);

	/**
	* Returns an ordered range of all the respondidas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RespondidaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of respondidas
	* @param end the upper bound of the range of respondidas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of respondidas
	*/
	public java.util.List<Respondida> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Respondida> orderByComparator);

	/**
	* Returns an ordered range of all the respondidas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RespondidaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of respondidas
	* @param end the upper bound of the range of respondidas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of respondidas
	*/
	public java.util.List<Respondida> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Respondida> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the respondidas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of respondidas.
	*
	* @return the number of respondidas
	*/
	public int countAll();
}