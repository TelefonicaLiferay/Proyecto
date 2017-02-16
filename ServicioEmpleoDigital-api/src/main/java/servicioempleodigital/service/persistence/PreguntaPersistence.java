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

import servicioempleodigital.exception.NoSuchPreguntaException;

import servicioempleodigital.model.Pregunta;

/**
 * The persistence interface for the pregunta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see servicioempleodigital.service.persistence.impl.PreguntaPersistenceImpl
 * @see PreguntaUtil
 * @generated
 */
@ProviderType
public interface PreguntaPersistence extends BasePersistence<Pregunta> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PreguntaUtil} to access the pregunta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the pregunta in the entity cache if it is enabled.
	*
	* @param pregunta the pregunta
	*/
	public void cacheResult(Pregunta pregunta);

	/**
	* Caches the preguntas in the entity cache if it is enabled.
	*
	* @param preguntas the preguntas
	*/
	public void cacheResult(java.util.List<Pregunta> preguntas);

	/**
	* Creates a new pregunta with the primary key. Does not add the pregunta to the database.
	*
	* @param idPregunta the primary key for the new pregunta
	* @return the new pregunta
	*/
	public Pregunta create(long idPregunta);

	/**
	* Removes the pregunta with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param idPregunta the primary key of the pregunta
	* @return the pregunta that was removed
	* @throws NoSuchPreguntaException if a pregunta with the primary key could not be found
	*/
	public Pregunta remove(long idPregunta) throws NoSuchPreguntaException;

	public Pregunta updateImpl(Pregunta pregunta);

	/**
	* Returns the pregunta with the primary key or throws a {@link NoSuchPreguntaException} if it could not be found.
	*
	* @param idPregunta the primary key of the pregunta
	* @return the pregunta
	* @throws NoSuchPreguntaException if a pregunta with the primary key could not be found
	*/
	public Pregunta findByPrimaryKey(long idPregunta)
		throws NoSuchPreguntaException;

	/**
	* Returns the pregunta with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param idPregunta the primary key of the pregunta
	* @return the pregunta, or <code>null</code> if a pregunta with the primary key could not be found
	*/
	public Pregunta fetchByPrimaryKey(long idPregunta);

	@Override
	public java.util.Map<java.io.Serializable, Pregunta> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the preguntas.
	*
	* @return the preguntas
	*/
	public java.util.List<Pregunta> findAll();

	/**
	* Returns a range of all the preguntas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of preguntas
	* @param end the upper bound of the range of preguntas (not inclusive)
	* @return the range of preguntas
	*/
	public java.util.List<Pregunta> findAll(int start, int end);

	/**
	* Returns an ordered range of all the preguntas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of preguntas
	* @param end the upper bound of the range of preguntas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of preguntas
	*/
	public java.util.List<Pregunta> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Pregunta> orderByComparator);

	/**
	* Returns an ordered range of all the preguntas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link PreguntaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of preguntas
	* @param end the upper bound of the range of preguntas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of preguntas
	*/
	public java.util.List<Pregunta> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Pregunta> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the preguntas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of preguntas.
	*
	* @return the number of preguntas
	*/
	public int countAll();
}