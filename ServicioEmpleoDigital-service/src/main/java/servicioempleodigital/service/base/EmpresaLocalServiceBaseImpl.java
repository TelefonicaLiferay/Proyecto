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

package servicioempleodigital.service.base;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import servicioempleodigital.model.Empresa;

import servicioempleodigital.service.EmpresaLocalService;

import servicioempleodigital.service.persistence.CandidatoPersistence;
import servicioempleodigital.service.persistence.EmpresaPersistence;
import servicioempleodigital.service.persistence.OfertaPersistence;
import servicioempleodigital.service.persistence.PreguntaPersistence;
import servicioempleodigital.service.persistence.RespondidaPersistence;
import servicioempleodigital.service.persistence.RespuestaPersistence;
import servicioempleodigital.service.persistence.ResultadoPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the empresa local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link servicioempleodigital.service.impl.EmpresaLocalServiceImpl}.
 * </p>
 *
 * @author Francisco de Borja Segovia Gilsanz
 * @see servicioempleodigital.service.impl.EmpresaLocalServiceImpl
 * @see servicioempleodigital.service.EmpresaLocalServiceUtil
 * @generated
 */
@ProviderType
public abstract class EmpresaLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements EmpresaLocalService, IdentifiableOSGiService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link servicioempleodigital.service.EmpresaLocalServiceUtil} to access the empresa local service.
	 */

	/**
	 * Adds the empresa to the database. Also notifies the appropriate model listeners.
	 *
	 * @param empresa the empresa
	 * @return the empresa that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Empresa addEmpresa(Empresa empresa) {
		empresa.setNew(true);

		return empresaPersistence.update(empresa);
	}

	/**
	 * Creates a new empresa with the primary key. Does not add the empresa to the database.
	 *
	 * @param idEmpresa the primary key for the new empresa
	 * @return the new empresa
	 */
	@Override
	public Empresa createEmpresa(long idEmpresa) {
		return empresaPersistence.create(idEmpresa);
	}

	/**
	 * Deletes the empresa with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idEmpresa the primary key of the empresa
	 * @return the empresa that was removed
	 * @throws PortalException if a empresa with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Empresa deleteEmpresa(long idEmpresa) throws PortalException {
		return empresaPersistence.remove(idEmpresa);
	}

	/**
	 * Deletes the empresa from the database. Also notifies the appropriate model listeners.
	 *
	 * @param empresa the empresa
	 * @return the empresa that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Empresa deleteEmpresa(Empresa empresa) {
		return empresaPersistence.remove(empresa);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(Empresa.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return empresaPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link servicioempleodigital.model.impl.EmpresaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end) {
		return empresaPersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link servicioempleodigital.model.impl.EmpresaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator) {
		return empresaPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return empresaPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) {
		return empresaPersistence.countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public Empresa fetchEmpresa(long idEmpresa) {
		return empresaPersistence.fetchByPrimaryKey(idEmpresa);
	}

	/**
	 * Returns the empresa with the primary key.
	 *
	 * @param idEmpresa the primary key of the empresa
	 * @return the empresa
	 * @throws PortalException if a empresa with the primary key could not be found
	 */
	@Override
	public Empresa getEmpresa(long idEmpresa) throws PortalException {
		return empresaPersistence.findByPrimaryKey(idEmpresa);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery = new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(empresaLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Empresa.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("idEmpresa");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		IndexableActionableDynamicQuery indexableActionableDynamicQuery = new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(empresaLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(Empresa.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("idEmpresa");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {
		actionableDynamicQuery.setBaseLocalService(empresaLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(Empresa.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("idEmpresa");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {
		return empresaLocalService.deleteEmpresa((Empresa)persistedModel);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {
		return empresaPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the empresas.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link servicioempleodigital.model.impl.EmpresaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of empresas
	 * @param end the upper bound of the range of empresas (not inclusive)
	 * @return the range of empresas
	 */
	@Override
	public List<Empresa> getEmpresas(int start, int end) {
		return empresaPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of empresas.
	 *
	 * @return the number of empresas
	 */
	@Override
	public int getEmpresasCount() {
		return empresaPersistence.countAll();
	}

	/**
	 * Updates the empresa in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param empresa the empresa
	 * @return the empresa that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Empresa updateEmpresa(Empresa empresa) {
		return empresaPersistence.update(empresa);
	}

	/**
	 * Returns the candidato local service.
	 *
	 * @return the candidato local service
	 */
	public servicioempleodigital.service.CandidatoLocalService getCandidatoLocalService() {
		return candidatoLocalService;
	}

	/**
	 * Sets the candidato local service.
	 *
	 * @param candidatoLocalService the candidato local service
	 */
	public void setCandidatoLocalService(
		servicioempleodigital.service.CandidatoLocalService candidatoLocalService) {
		this.candidatoLocalService = candidatoLocalService;
	}

	/**
	 * Returns the candidato persistence.
	 *
	 * @return the candidato persistence
	 */
	public CandidatoPersistence getCandidatoPersistence() {
		return candidatoPersistence;
	}

	/**
	 * Sets the candidato persistence.
	 *
	 * @param candidatoPersistence the candidato persistence
	 */
	public void setCandidatoPersistence(
		CandidatoPersistence candidatoPersistence) {
		this.candidatoPersistence = candidatoPersistence;
	}

	/**
	 * Returns the empresa local service.
	 *
	 * @return the empresa local service
	 */
	public EmpresaLocalService getEmpresaLocalService() {
		return empresaLocalService;
	}

	/**
	 * Sets the empresa local service.
	 *
	 * @param empresaLocalService the empresa local service
	 */
	public void setEmpresaLocalService(EmpresaLocalService empresaLocalService) {
		this.empresaLocalService = empresaLocalService;
	}

	/**
	 * Returns the empresa persistence.
	 *
	 * @return the empresa persistence
	 */
	public EmpresaPersistence getEmpresaPersistence() {
		return empresaPersistence;
	}

	/**
	 * Sets the empresa persistence.
	 *
	 * @param empresaPersistence the empresa persistence
	 */
	public void setEmpresaPersistence(EmpresaPersistence empresaPersistence) {
		this.empresaPersistence = empresaPersistence;
	}

	/**
	 * Returns the oferta local service.
	 *
	 * @return the oferta local service
	 */
	public servicioempleodigital.service.OfertaLocalService getOfertaLocalService() {
		return ofertaLocalService;
	}

	/**
	 * Sets the oferta local service.
	 *
	 * @param ofertaLocalService the oferta local service
	 */
	public void setOfertaLocalService(
		servicioempleodigital.service.OfertaLocalService ofertaLocalService) {
		this.ofertaLocalService = ofertaLocalService;
	}

	/**
	 * Returns the oferta persistence.
	 *
	 * @return the oferta persistence
	 */
	public OfertaPersistence getOfertaPersistence() {
		return ofertaPersistence;
	}

	/**
	 * Sets the oferta persistence.
	 *
	 * @param ofertaPersistence the oferta persistence
	 */
	public void setOfertaPersistence(OfertaPersistence ofertaPersistence) {
		this.ofertaPersistence = ofertaPersistence;
	}

	/**
	 * Returns the pregunta local service.
	 *
	 * @return the pregunta local service
	 */
	public servicioempleodigital.service.PreguntaLocalService getPreguntaLocalService() {
		return preguntaLocalService;
	}

	/**
	 * Sets the pregunta local service.
	 *
	 * @param preguntaLocalService the pregunta local service
	 */
	public void setPreguntaLocalService(
		servicioempleodigital.service.PreguntaLocalService preguntaLocalService) {
		this.preguntaLocalService = preguntaLocalService;
	}

	/**
	 * Returns the pregunta persistence.
	 *
	 * @return the pregunta persistence
	 */
	public PreguntaPersistence getPreguntaPersistence() {
		return preguntaPersistence;
	}

	/**
	 * Sets the pregunta persistence.
	 *
	 * @param preguntaPersistence the pregunta persistence
	 */
	public void setPreguntaPersistence(PreguntaPersistence preguntaPersistence) {
		this.preguntaPersistence = preguntaPersistence;
	}

	/**
	 * Returns the respondida local service.
	 *
	 * @return the respondida local service
	 */
	public servicioempleodigital.service.RespondidaLocalService getRespondidaLocalService() {
		return respondidaLocalService;
	}

	/**
	 * Sets the respondida local service.
	 *
	 * @param respondidaLocalService the respondida local service
	 */
	public void setRespondidaLocalService(
		servicioempleodigital.service.RespondidaLocalService respondidaLocalService) {
		this.respondidaLocalService = respondidaLocalService;
	}

	/**
	 * Returns the respondida persistence.
	 *
	 * @return the respondida persistence
	 */
	public RespondidaPersistence getRespondidaPersistence() {
		return respondidaPersistence;
	}

	/**
	 * Sets the respondida persistence.
	 *
	 * @param respondidaPersistence the respondida persistence
	 */
	public void setRespondidaPersistence(
		RespondidaPersistence respondidaPersistence) {
		this.respondidaPersistence = respondidaPersistence;
	}

	/**
	 * Returns the respuesta local service.
	 *
	 * @return the respuesta local service
	 */
	public servicioempleodigital.service.RespuestaLocalService getRespuestaLocalService() {
		return respuestaLocalService;
	}

	/**
	 * Sets the respuesta local service.
	 *
	 * @param respuestaLocalService the respuesta local service
	 */
	public void setRespuestaLocalService(
		servicioempleodigital.service.RespuestaLocalService respuestaLocalService) {
		this.respuestaLocalService = respuestaLocalService;
	}

	/**
	 * Returns the respuesta persistence.
	 *
	 * @return the respuesta persistence
	 */
	public RespuestaPersistence getRespuestaPersistence() {
		return respuestaPersistence;
	}

	/**
	 * Sets the respuesta persistence.
	 *
	 * @param respuestaPersistence the respuesta persistence
	 */
	public void setRespuestaPersistence(
		RespuestaPersistence respuestaPersistence) {
		this.respuestaPersistence = respuestaPersistence;
	}

	/**
	 * Returns the resultado local service.
	 *
	 * @return the resultado local service
	 */
	public servicioempleodigital.service.ResultadoLocalService getResultadoLocalService() {
		return resultadoLocalService;
	}

	/**
	 * Sets the resultado local service.
	 *
	 * @param resultadoLocalService the resultado local service
	 */
	public void setResultadoLocalService(
		servicioempleodigital.service.ResultadoLocalService resultadoLocalService) {
		this.resultadoLocalService = resultadoLocalService;
	}

	/**
	 * Returns the resultado persistence.
	 *
	 * @return the resultado persistence
	 */
	public ResultadoPersistence getResultadoPersistence() {
		return resultadoPersistence;
	}

	/**
	 * Sets the resultado persistence.
	 *
	 * @param resultadoPersistence the resultado persistence
	 */
	public void setResultadoPersistence(
		ResultadoPersistence resultadoPersistence) {
		this.resultadoPersistence = resultadoPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService getClassNameLocalService() {
		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService) {
		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {
		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register("servicioempleodigital.model.Empresa",
			empresaLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"servicioempleodigital.model.Empresa");
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return EmpresaLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Empresa.class;
	}

	protected String getModelClassName() {
		return Empresa.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = empresaPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = servicioempleodigital.service.CandidatoLocalService.class)
	protected servicioempleodigital.service.CandidatoLocalService candidatoLocalService;
	@BeanReference(type = CandidatoPersistence.class)
	protected CandidatoPersistence candidatoPersistence;
	@BeanReference(type = EmpresaLocalService.class)
	protected EmpresaLocalService empresaLocalService;
	@BeanReference(type = EmpresaPersistence.class)
	protected EmpresaPersistence empresaPersistence;
	@BeanReference(type = servicioempleodigital.service.OfertaLocalService.class)
	protected servicioempleodigital.service.OfertaLocalService ofertaLocalService;
	@BeanReference(type = OfertaPersistence.class)
	protected OfertaPersistence ofertaPersistence;
	@BeanReference(type = servicioempleodigital.service.PreguntaLocalService.class)
	protected servicioempleodigital.service.PreguntaLocalService preguntaLocalService;
	@BeanReference(type = PreguntaPersistence.class)
	protected PreguntaPersistence preguntaPersistence;
	@BeanReference(type = servicioempleodigital.service.RespondidaLocalService.class)
	protected servicioempleodigital.service.RespondidaLocalService respondidaLocalService;
	@BeanReference(type = RespondidaPersistence.class)
	protected RespondidaPersistence respondidaPersistence;
	@BeanReference(type = servicioempleodigital.service.RespuestaLocalService.class)
	protected servicioempleodigital.service.RespuestaLocalService respuestaLocalService;
	@BeanReference(type = RespuestaPersistence.class)
	protected RespuestaPersistence respuestaPersistence;
	@BeanReference(type = servicioempleodigital.service.ResultadoLocalService.class)
	protected servicioempleodigital.service.ResultadoLocalService resultadoLocalService;
	@BeanReference(type = ResultadoPersistence.class)
	protected ResultadoPersistence resultadoPersistence;
	@ServiceReference(type = com.liferay.counter.kernel.service.CounterLocalService.class)
	protected com.liferay.counter.kernel.service.CounterLocalService counterLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.ClassNameLocalService.class)
	protected com.liferay.portal.kernel.service.ClassNameLocalService classNameLocalService;
	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;
	@ServiceReference(type = com.liferay.portal.kernel.service.ResourceLocalService.class)
	protected com.liferay.portal.kernel.service.ResourceLocalService resourceLocalService;
	@ServiceReference(type = com.liferay.portal.kernel.service.UserLocalService.class)
	protected com.liferay.portal.kernel.service.UserLocalService userLocalService;
	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry persistedModelLocalServiceRegistry;
}