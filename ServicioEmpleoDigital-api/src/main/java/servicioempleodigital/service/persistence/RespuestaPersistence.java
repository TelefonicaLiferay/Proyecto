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

import servicioempleodigital.exception.NoSuchRespuestaException;

import servicioempleodigital.model.Respuesta;

/**
 * The persistence interface for the respuesta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see servicioempleodigital.service.persistence.impl.RespuestaPersistenceImpl
 * @see RespuestaUtil
 * @generated
 */
@ProviderType
public interface RespuestaPersistence extends BasePersistence<Respuesta> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RespuestaUtil} to access the respuesta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the respuesta in the entity cache if it is enabled.
	*
	* @param respuesta the respuesta
	*/
	public void cacheResult(Respuesta respuesta);

	/**
	* Caches the respuestas in the entity cache if it is enabled.
	*
	* @param respuestas the respuestas
	*/
	public void cacheResult(java.util.List<Respuesta> respuestas);

	/**
	* Creates a new respuesta with the primary key. Does not add the respuesta to the database.
	*
	* @param idRespuesta the primary key for the new respuesta
	* @return the new respuesta
	*/
	public Respuesta create(long idRespuesta);

	/**
	* Removes the respuesta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idRespuesta the primary key of the respuesta
	* @return the respuesta that was removed
	* @throws NoSuchRespuestaException if a respuesta with the primary key could not be found
	*/
	public Respuesta remove(long idRespuesta) throws NoSuchRespuestaException;

	public Respuesta updateImpl(Respuesta respuesta);

	/**
	* Returns the respuesta with the primary key or throws a {@link NoSuchRespuestaException} if it could not be found.
	*
	* @param idRespuesta the primary key of the respuesta
	* @return the respuesta
	* @throws NoSuchRespuestaException if a respuesta with the primary key could not be found
	*/
	public Respuesta findByPrimaryKey(long idRespuesta)
		throws NoSuchRespuestaException;

	/**
	* Returns the respuesta with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param idRespuesta the primary key of the respuesta
	* @return the respuesta, or <code>null</code> if a respuesta with the primary key could not be found
	*/
	public Respuesta fetchByPrimaryKey(long idRespuesta);

	@Override
	public java.util.Map<java.io.Serializable, Respuesta> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the respuestas.
	*
	* @return the respuestas
	*/
	public java.util.List<Respuesta> findAll();

	/**
	* Returns a range of all the respuestas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RespuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of respuestas
	* @param end the upper bound of the range of respuestas (not inclusive)
	* @return the range of respuestas
	*/
	public java.util.List<Respuesta> findAll(int start, int end);

	/**
	* Returns an ordered range of all the respuestas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RespuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of respuestas
	* @param end the upper bound of the range of respuestas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of respuestas
	*/
	public java.util.List<Respuesta> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Respuesta> orderByComparator);

	/**
	* Returns an ordered range of all the respuestas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link RespuestaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of respuestas
	* @param end the upper bound of the range of respuestas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of respuestas
	*/
	public java.util.List<Respuesta> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Respuesta> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the respuestas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of respuestas.
	*
	* @return the number of respuestas
	*/
	public int countAll();
}