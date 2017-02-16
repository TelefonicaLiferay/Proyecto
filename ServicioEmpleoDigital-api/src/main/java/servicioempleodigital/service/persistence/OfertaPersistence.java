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

import servicioempleodigital.exception.NoSuchOfertaException;

import servicioempleodigital.model.Oferta;

/**
 * The persistence interface for the oferta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see servicioempleodigital.service.persistence.impl.OfertaPersistenceImpl
 * @see OfertaUtil
 * @generated
 */
@ProviderType
public interface OfertaPersistence extends BasePersistence<Oferta> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OfertaUtil} to access the oferta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the oferta in the entity cache if it is enabled.
	*
	* @param oferta the oferta
	*/
	public void cacheResult(Oferta oferta);

	/**
	* Caches the ofertas in the entity cache if it is enabled.
	*
	* @param ofertas the ofertas
	*/
	public void cacheResult(java.util.List<Oferta> ofertas);

	/**
	* Creates a new oferta with the primary key. Does not add the oferta to the database.
	*
	* @param idOferta the primary key for the new oferta
	* @return the new oferta
	*/
	public Oferta create(long idOferta);

	/**
	* Removes the oferta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idOferta the primary key of the oferta
	* @return the oferta that was removed
	* @throws NoSuchOfertaException if a oferta with the primary key could not be found
	*/
	public Oferta remove(long idOferta) throws NoSuchOfertaException;

	public Oferta updateImpl(Oferta oferta);

	/**
	* Returns the oferta with the primary key or throws a {@link NoSuchOfertaException} if it could not be found.
	*
	* @param idOferta the primary key of the oferta
	* @return the oferta
	* @throws NoSuchOfertaException if a oferta with the primary key could not be found
	*/
	public Oferta findByPrimaryKey(long idOferta) throws NoSuchOfertaException;

	/**
	* Returns the oferta with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param idOferta the primary key of the oferta
	* @return the oferta, or <code>null</code> if a oferta with the primary key could not be found
	*/
	public Oferta fetchByPrimaryKey(long idOferta);

	@Override
	public java.util.Map<java.io.Serializable, Oferta> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the ofertas.
	*
	* @return the ofertas
	*/
	public java.util.List<Oferta> findAll();

	/**
	* Returns a range of all the ofertas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OfertaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ofertas
	* @param end the upper bound of the range of ofertas (not inclusive)
	* @return the range of ofertas
	*/
	public java.util.List<Oferta> findAll(int start, int end);

	/**
	* Returns an ordered range of all the ofertas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OfertaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ofertas
	* @param end the upper bound of the range of ofertas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ofertas
	*/
	public java.util.List<Oferta> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Oferta> orderByComparator);

	/**
	* Returns an ordered range of all the ofertas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OfertaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ofertas
	* @param end the upper bound of the range of ofertas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ofertas
	*/
	public java.util.List<Oferta> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Oferta> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the ofertas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of ofertas.
	*
	* @return the number of ofertas
	*/
	public int countAll();
}