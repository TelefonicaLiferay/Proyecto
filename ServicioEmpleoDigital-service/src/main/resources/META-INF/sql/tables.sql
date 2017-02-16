create table FOO_Candidato (
	idCandidato LONG not null primary key IDENTITY,
	nif VARCHAR(75) null,
	nombre VARCHAR(75) null,
	apellidos VARCHAR(75) null,
	fechaDeNacimiento DATE null,
	email VARCHAR(75) null,
	telefono VARCHAR(75) null,
	password_ VARCHAR(75) null,
	provincia INTEGER,
	ciudad VARCHAR(75) null
);

create table FOO_Empresa (
	idEmpresa LONG not null primary key IDENTITY,
	cif VARCHAR(75) null,
	razonSocial VARCHAR(75) null,
	telefono VARCHAR(75) null,
	email VARCHAR(75) null,
	web VARCHAR(75) null,
	password_ VARCHAR(75) null,
	provincia INTEGER,
	ciudad VARCHAR(75) null,
	trabajadores INTEGER
);

create table FOO_Foo (
	uuid_ VARCHAR(75) null,
	fooId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	field1 VARCHAR(75) null,
	field2 BOOLEAN,
	field3 INTEGER,
	field4 DATE null,
	field5 VARCHAR(75) null
);

create table FOO_Oferta (
	idOferta LONG not null primary key IDENTITY,
	titulo VARCHAR(75) null,
	descripcion VARCHAR(75) null,
	provincia INTEGER,
	ciudad VARCHAR(75) null,
	salario VARCHAR(75) null,
	fechaInicio DATE null,
	fechaModificacion DATE null,
	fechaFin DATE null,
	plazas INTEGER,
	candidatos INTEGER,
	requisitosMinimos VARCHAR(75) null,
	requisitosOpcionales VARCHAR(75) null,
	activa BOOLEAN,
	idEmpresa LONG
);

create table FOO_Pregunta (
	idPregunta LONG not null primary key IDENTITY,
	enunciado VARCHAR(75) null,
	tipo INTEGER,
	idOferta LONG
);

create table FOO_Respondida (
	idRespuesta LONG not null,
	idCandidato LONG not null,
	respuesta VARCHAR(75) null,
	respondida BOOLEAN,
	primary key (idRespuesta, idCandidato)
);

create table FOO_Respuesta (
	idRespuesta LONG not null primary key IDENTITY,
	respuesta VARCHAR(75) null,
	valor DOUBLE,
	idPregunta LONG
);

create table FOO_Resultado (
	puntuacion DOUBLE,
	idCandidato LONG not null,
	idOferta LONG not null,
	primary key (idCandidato, idOferta)
);