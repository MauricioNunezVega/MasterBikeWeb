 --DROP TABLAS
DROP TABLE DETALLEVENTA  CASCADE CONSTRAINTS;
DROP TABLE DOCUMENTACION  CASCADE CONSTRAINTS;
DROP TABLE MANTENCION  CASCADE CONSTRAINTS;
DROP TABLE PRODUCTO  CASCADE CONSTRAINTS;
DROP TABLE PROVEEDOR  CASCADE CONSTRAINTS;
DROP TABLE ROL  CASCADE CONSTRAINTS;
DROP TABLE SEGUIMIENTOENVIOS  CASCADE CONSTRAINTS;
DROP TABLE SERVICIO  CASCADE CONSTRAINTS;
DROP TABLE SOLICITUDARRIENDO  CASCADE CONSTRAINTS;
DROP TABLE USUARIO  CASCADE CONSTRAINTS;
DROP TABLE VENTA  CASCADE CONSTRAINTS;

--DROP SECUENCIAS
DROP SEQUENCE SEQ_DETALLE_VENTA;
DROP SEQUENCE SEQ_DOCUMENTACION;
DROP SEQUENCE SEQ_MANTENCION;
DROP SEQUENCE SEQ_PRODUCTOS;
DROP SEQUENCE SEQ_PROVEEDOR;
DROP SEQUENCE SEQ_SEGUIMIENTOS;
DROP SEQUENCE SEQ_USUARIOS;
DROP SEQUENCE SEQ_SOL_ARRIENDO;
DROP SEQUENCE SEQ_VENTA;
DROP SEQUENCE SEQ_SERVICIO;
DROP SEQUENCE SEQ_PAGO;


--CREACION SECUENCIAS
CREATE SEQUENCE SEQ_DETALLE_VENTA START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE SEQ_DOCUMENTACION START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE SEQ_MANTENCION START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE SEQ_PRODUCTOS START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE SEQ_PROVEEDOR START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE SEQ_SEGUIMIENTOS START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE SEQ_USUARIOS START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE SEQ_SOL_ARRIENDO START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE SEQ_VENTA START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE SEQ_SERVICIO START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE SEQ_PAGO START WITH 1 INCREMENT BY 1;


-- CREACION TABLAS

CREATE TABLE detalleventa (
    id_detalleventa     NUMBER(10) NOT NULL,
    cantidad            NUMBER(10) NOT NULL,
    precioventa         NUMBER(10),
    id_venta       NUMBER(3) NOT NULL,
    id_producto NUMBER(3) NOT NULL
);

ALTER TABLE detalleventa ADD CONSTRAINT detalleventa_pk PRIMARY KEY ( id_detalleventa );

CREATE TABLE documentacion (
    id_documentacion     NUMBER(10) NOT NULL,
    tipodocumento       VARCHAR2(20),
    nomdocumento        VARCHAR2(20),
    documento           BLOB,
    id_producto NUMBER(3) NOT NULL
);

ALTER TABLE documentacion ADD CONSTRAINT documentacion_pk PRIMARY KEY ( id_documentacion );


CREATE TABLE mantencion (
    id_mantencion        NUMBER(10) NOT NULL,
    retirodomicilio CHAR NOT NULL,
    fec_solicitada         DATE NOT NULL,
    comentarios       VARCHAR2(200),
    garantia          CHAR(2),
    fecingreso        DATE,
    fecsalida         DATE,
    estadosolicitud    VARCHAR2(10) NOT NULL,
	id_servicio  NUMBER(10) NOT NULL,
    valortotal  NUMBER(10),
    id_usuario NUMBER(10) NOT NULL
);

ALTER TABLE mantencion ADD CONSTRAINT mantencion_pk PRIMARY KEY ( id_mantencion );

CREATE TABLE producto (
    id_producto   NUMBER(10) NOT NULL,
	nombreproducto VARCHAR2(100) NOT NULL,
    tipoproducto VARCHAR2(15) NOT NULL,
    descripcion  VARCHAR2(200),
    fabricpropia VARCHAR2(15) NOT NULL,
    valproducto  NUMBER(10) NOT NULL,
    marca        VARCHAR2(15),
    modelo       VARCHAR2(15),
    stock        NUMBER(10) NOT NULL,
    imagen       BLOB
);

ALTER TABLE producto ADD CONSTRAINT producto_pk PRIMARY KEY ( id_producto );

CREATE TABLE proveedor (
    id_proveedor  NUMBER(10) NOT NULL,
    rut_proveedor VARCHAR2(10) NOT NULL,
    nom_proveedor VARCHAR2(20) NOT NULL,
    ape_proveedor VARCHAR2(20),
    direccion_proveedor    VARCHAR2(25),
    telefono_proveedor     NUMBER(9),
    email_proveedor       VARCHAR2(20)
);

ALTER TABLE proveedor ADD CONSTRAINT proveedor_pk PRIMARY KEY ( id_proveedor );


CREATE TABLE rol (
    id_rol             NUMBER NOT NULL,
    nombre            VARCHAR2(50) NOT NULL

);

ALTER TABLE rol ADD CONSTRAINT rol_pk PRIMARY KEY ( id_rol );

CREATE TABLE seguimientoenvios (
    id_segui_envios NUMBER(10) NOT NULL,
    estadoentrega       VARCHAR2(10) NOT NULL,
    fecdespacho         DATE NOT NULL,
    fecentrega          DATE NOT NULL,
    id_venta       NUMBER(3) NOT NULL
);

CREATE UNIQUE INDEX seguimientoenvios__idx ON
    seguimientoenvios (
        id_venta
    ASC );

ALTER TABLE seguimientoenvios ADD CONSTRAINT seguimientoenvios_pk PRIMARY KEY ( id_segui_envios );

CREATE TABLE solicitudarriendo (
    id_sol_arriendo NUMBER(10) NOT NULL,
    tipobicicleta       VARCHAR2(20) NOT NULL,
    fecini_arriendo     DATE NOT NULL,
	fecfin_arriendo DATE NOT NULL,
    formapago_arri      VARCHAR2(20) NOT NULL,
    depositogarantia    NUMBER(8),
    estado          VARCHAR2(200),
    id_usuario   NUMBER(3) NOT NULL
);

ALTER TABLE solicitudarriendo ADD CONSTRAINT solicitudarriendo_pk PRIMARY KEY ( id_sol_arriendo );


CREATE TABLE USUARIO
   (ID_USUARIO NUMBER(10) NOT NULL , 
	EMAIL_USUARIO VARCHAR2(25 BYTE), 
	PASSWORD VARCHAR2(200 BYTE) NOT NULL , 
	NOMBRE VARCHAR2(25 BYTE) NOT NULL , 
	APELLIDOS VARCHAR2(100 BYTE) NOT NULL , 
	CONVENIO VARCHAR2(25 BYTE), 
	RUT_USUARIO VARCHAR2(20 BYTE) NOT NULL , 
	FECHANAC DATE NOT NULL , 
	DIRECCION_USUARIO VARCHAR2(30 BYTE) NOT NULL , 
	NUMTELEFONO NUMBER(9,0) NOT NULL , 
	ID_ROL NUMBER NOT NULL );
	
ALTER TABLE usuario ADD CONSTRAINT usuario_pk PRIMARY KEY ( id_usuario);

CREATE TABLE pago (
  id_pago NUMBER(10) NOT NULL,
  monto NUMBER(10) NOT NULL
);

ALTER TABLE pago ADD CONSTRAINT pago_pk PRIMARY KEY ( id_pago );

CREATE TABLE venta (
    id_venta                               NUMBER(10) NOT NULL,
    fechora                               DATE NOT NULL,
    totalventa                            NUMBER(10) NOT NULL,
    id_usuario                    		 NUMBER(3) NOT NULL,
    id_pago                            NUMBER(3) NOT NULL
    estadoventa VARCHAR2(25)

);

ALTER TABLE venta ADD CONSTRAINT venta_pk PRIMARY KEY ( id_venta );


CREATE TABLE servicio (
	id_servicio NUMBER(10) NOT NULL,
	descripcion_servicio VARCHAR2(200) NOT NULL,
	precioservicio NUMBER(10) NOT NULL
);

ALTER TABLE servicio ADD CONSTRAINT servicio_pk PRIMARY KEY ( id_servicio );


-- CREACION CLAVES FORANEAS


ALTER TABLE detalleventa
    ADD CONSTRAINT fk_detalleventa_producto FOREIGN KEY ( id_producto )
        REFERENCES producto ( id_producto );

ALTER TABLE detalleventa
    ADD CONSTRAINT fk_detalleventa_venta FOREIGN KEY ( id_venta )
        REFERENCES venta ( id_venta );

ALTER TABLE documentacion
    ADD CONSTRAINT fk_documentacion_producto FOREIGN KEY ( id_producto )
        REFERENCES producto ( id_producto );

ALTER TABLE mantencion
    ADD CONSTRAINT fk_mantencion_usuario FOREIGN KEY ( id_usuario )
        REFERENCES usuario ( id_usuario );

ALTER TABLE mantencion
    ADD CONSTRAINT fk_mantencion_servicio FOREIGN KEY ( id_servicio )
        REFERENCES servicio ( id_servicio );

ALTER TABLE seguimientoenvios
    ADD CONSTRAINT fk_seguimientoenvios_venta FOREIGN KEY ( id_venta )
        REFERENCES venta ( id_venta );

ALTER TABLE solicitudarriendo
    ADD CONSTRAINT fk_solicitudarriendo_usuario FOREIGN KEY ( id_usuario )
        REFERENCES usuario ( id_usuario );

ALTER TABLE usuario
    ADD CONSTRAINT fk_usuario_rol FOREIGN KEY ( id_rol )
        REFERENCES rol ( id_rol );

ALTER TABLE venta
    ADD CONSTRAINT fk_venta_usuario FOREIGN KEY ( id_usuario )
        REFERENCES usuario ( id_usuario );

ALTER TABLE venta
    ADD CONSTRAINT fk_venta_pago FOREIGN KEY ( id_pago )
                REFERENCES pago ( id_pago );
