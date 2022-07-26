create or replace package DETALLEVENTA_tapi
is

type DETALLEVENTA_tapi_rec is record (
PRECIOVENTA  DETALLEVENTA.PRECIOVENTA%type
,ID_PRODUCTO  DETALLEVENTA.ID_PRODUCTO%type
,ID_DETALLEVENTA  DETALLEVENTA.ID_DETALLEVENTA%type
,CANTIDAD  DETALLEVENTA.CANTIDAD%type
,ID_VENTA  DETALLEVENTA.ID_VENTA%type
);
type DETALLEVENTA_tapi_tab is table of DETALLEVENTA_tapi_rec;

-- insert
procedure ins (
p_PRECIOVENTA in DETALLEVENTA.PRECIOVENTA%type default null
,p_ID_PRODUCTO in DETALLEVENTA.ID_PRODUCTO%type
,p_ID_DETALLEVENTA in DETALLEVENTA.ID_DETALLEVENTA%type
,p_CANTIDAD in DETALLEVENTA.CANTIDAD%type
,p_ID_VENTA in DETALLEVENTA.ID_VENTA%type
);
-- update
procedure upd (
p_PRECIOVENTA in DETALLEVENTA.PRECIOVENTA%type default null
,p_ID_PRODUCTO in DETALLEVENTA.ID_PRODUCTO%type
,p_ID_DETALLEVENTA in DETALLEVENTA.ID_DETALLEVENTA%type
,p_CANTIDAD in DETALLEVENTA.CANTIDAD%type
,p_ID_VENTA in DETALLEVENTA.ID_VENTA%type
);
-- delete
procedure del (
p_ID_DETALLEVENTA in DETALLEVENTA.ID_DETALLEVENTA%type
);
end DETALLEVENTA_tapi;

/
create or replace package body DETALLEVENTA_tapi
is
-- insert
procedure ins (
p_PRECIOVENTA in DETALLEVENTA.PRECIOVENTA%type default null
,p_ID_PRODUCTO in DETALLEVENTA.ID_PRODUCTO%type
,p_ID_DETALLEVENTA in DETALLEVENTA.ID_DETALLEVENTA%type
,p_CANTIDAD in DETALLEVENTA.CANTIDAD%type
,p_ID_VENTA in DETALLEVENTA.ID_VENTA%type
) is
begin
insert into DETALLEVENTA(
PRECIOVENTA
,ID_PRODUCTO
,ID_DETALLEVENTA
,CANTIDAD
,ID_VENTA
) values (
p_PRECIOVENTA
,p_ID_PRODUCTO
,p_ID_DETALLEVENTA
,p_CANTIDAD
,p_ID_VENTA
);end;
-- update
procedure upd (
p_PRECIOVENTA in DETALLEVENTA.PRECIOVENTA%type default null
,p_ID_PRODUCTO in DETALLEVENTA.ID_PRODUCTO%type
,p_ID_DETALLEVENTA in DETALLEVENTA.ID_DETALLEVENTA%type
,p_CANTIDAD in DETALLEVENTA.CANTIDAD%type
,p_ID_VENTA in DETALLEVENTA.ID_VENTA%type
) is
begin
update DETALLEVENTA set
PRECIOVENTA = p_PRECIOVENTA
,ID_PRODUCTO = p_ID_PRODUCTO
,CANTIDAD = p_CANTIDAD
,ID_VENTA = p_ID_VENTA
where ID_DETALLEVENTA = p_ID_DETALLEVENTA;
end;
-- del
procedure del (
p_ID_DETALLEVENTA in DETALLEVENTA.ID_DETALLEVENTA%type
) is
begin
delete from DETALLEVENTA
where ID_DETALLEVENTA = p_ID_DETALLEVENTA;
end;
end DETALLEVENTA_tapi;
/

create or replace package DOCUMENTACION_tapi
is

type DOCUMENTACION_tapi_rec is record (
DOCUMENTO  DOCUMENTACION.DOCUMENTO%type
,ID_DOCUMENTACION  DOCUMENTACION.ID_DOCUMENTACION%type
,NOMDOCUMENTO  DOCUMENTACION.NOMDOCUMENTO%type
,ID_PRODUCTO  DOCUMENTACION.ID_PRODUCTO%type
,TIPODOCUMENTO  DOCUMENTACION.TIPODOCUMENTO%type
);
type DOCUMENTACION_tapi_tab is table of DOCUMENTACION_tapi_rec;

-- insert
procedure ins (
p_DOCUMENTO in DOCUMENTACION.DOCUMENTO%type default null
,p_ID_DOCUMENTACION in DOCUMENTACION.ID_DOCUMENTACION%type
,p_NOMDOCUMENTO in DOCUMENTACION.NOMDOCUMENTO%type default null
,p_ID_PRODUCTO in DOCUMENTACION.ID_PRODUCTO%type
,p_TIPODOCUMENTO in DOCUMENTACION.TIPODOCUMENTO%type default null
);
-- update
procedure upd (
p_DOCUMENTO in DOCUMENTACION.DOCUMENTO%type default null
,p_ID_DOCUMENTACION in DOCUMENTACION.ID_DOCUMENTACION%type
,p_NOMDOCUMENTO in DOCUMENTACION.NOMDOCUMENTO%type default null
,p_ID_PRODUCTO in DOCUMENTACION.ID_PRODUCTO%type
,p_TIPODOCUMENTO in DOCUMENTACION.TIPODOCUMENTO%type default null
);
-- delete
procedure del (
p_ID_DOCUMENTACION in DOCUMENTACION.ID_DOCUMENTACION%type
);
end DOCUMENTACION_tapi;

/
create or replace package body DOCUMENTACION_tapi
is
-- insert
procedure ins (
p_DOCUMENTO in DOCUMENTACION.DOCUMENTO%type default null
,p_ID_DOCUMENTACION in DOCUMENTACION.ID_DOCUMENTACION%type
,p_NOMDOCUMENTO in DOCUMENTACION.NOMDOCUMENTO%type default null
,p_ID_PRODUCTO in DOCUMENTACION.ID_PRODUCTO%type
,p_TIPODOCUMENTO in DOCUMENTACION.TIPODOCUMENTO%type default null
) is
begin
insert into DOCUMENTACION(
DOCUMENTO
,ID_DOCUMENTACION
,NOMDOCUMENTO
,ID_PRODUCTO
,TIPODOCUMENTO
) values (
p_DOCUMENTO
,p_ID_DOCUMENTACION
,p_NOMDOCUMENTO
,p_ID_PRODUCTO
,p_TIPODOCUMENTO
);end;
-- update
procedure upd (
p_DOCUMENTO in DOCUMENTACION.DOCUMENTO%type default null
,p_ID_DOCUMENTACION in DOCUMENTACION.ID_DOCUMENTACION%type
,p_NOMDOCUMENTO in DOCUMENTACION.NOMDOCUMENTO%type default null
,p_ID_PRODUCTO in DOCUMENTACION.ID_PRODUCTO%type
,p_TIPODOCUMENTO in DOCUMENTACION.TIPODOCUMENTO%type default null
) is
begin
update DOCUMENTACION set
DOCUMENTO = p_DOCUMENTO
,NOMDOCUMENTO = p_NOMDOCUMENTO
,ID_PRODUCTO = p_ID_PRODUCTO
,TIPODOCUMENTO = p_TIPODOCUMENTO
where ID_DOCUMENTACION = p_ID_DOCUMENTACION;
end;
-- del
procedure del (
p_ID_DOCUMENTACION in DOCUMENTACION.ID_DOCUMENTACION%type
) is
begin
delete from DOCUMENTACION
where ID_DOCUMENTACION = p_ID_DOCUMENTACION;
end;
end DOCUMENTACION_tapi;


create or replace package PAGO_tapi
is

type PAGO_tapi_rec is record (
MONTO  PAGO.MONTO%type
,ID_PAGO  PAGO.ID_PAGO%type
);
type PAGO_tapi_tab is table of PAGO_tapi_rec;

-- insert
procedure ins (
p_MONTO in PAGO.MONTO%type
,p_ID_PAGO in PAGO.ID_PAGO%type
);
-- update
procedure upd (
p_MONTO in PAGO.MONTO%type
,p_ID_PAGO in PAGO.ID_PAGO%type
);
-- delete
procedure del (
p_ID_PAGO in PAGO.ID_PAGO%type
);
end PAGO_tapi;

/
create or replace package body PAGO_tapi
is
-- insert
procedure ins (
p_MONTO in PAGO.MONTO%type
,p_ID_PAGO in PAGO.ID_PAGO%type
) is
begin
insert into PAGO(
MONTO
,ID_PAGO
) values (
p_MONTO
,p_ID_PAGO
);end;
-- update
procedure upd (
p_MONTO in PAGO.MONTO%type
,p_ID_PAGO in PAGO.ID_PAGO%type
) is
begin
update PAGO set
MONTO = p_MONTO
where ID_PAGO = p_ID_PAGO;
end;
-- del
procedure del (
p_ID_PAGO in PAGO.ID_PAGO%type
) is
begin
delete from PAGO
where ID_PAGO = p_ID_PAGO;
end;
end PAGO_tapi;

create or replace package PRODUCTO_tapi
is

type PRODUCTO_tapi_rec is record (
TIPOPRODUCTO  PRODUCTO.TIPOPRODUCTO%type
,FABRICPROPIA  PRODUCTO.FABRICPROPIA%type
,MARCA  PRODUCTO.MARCA%type
,NOMBREPRODUCTO  PRODUCTO.NOMBREPRODUCTO%type
,MODELO  PRODUCTO.MODELO%type
,ID_PRODUCTO  PRODUCTO.ID_PRODUCTO%type
,DESCRIPCION  PRODUCTO.DESCRIPCION%type
,VALPRODUCTO  PRODUCTO.VALPRODUCTO%type
,STOCK  PRODUCTO.STOCK%type
,IMAGEN  PRODUCTO.IMAGEN%type
);
type PRODUCTO_tapi_tab is table of PRODUCTO_tapi_rec;

-- insert
procedure ins (
p_TIPOPRODUCTO in PRODUCTO.TIPOPRODUCTO%type
,p_FABRICPROPIA in PRODUCTO.FABRICPROPIA%type
,p_MARCA in PRODUCTO.MARCA%type default null
,p_NOMBREPRODUCTO in PRODUCTO.NOMBREPRODUCTO%type
,p_MODELO in PRODUCTO.MODELO%type default null
,p_ID_PRODUCTO in PRODUCTO.ID_PRODUCTO%type
,p_DESCRIPCION in PRODUCTO.DESCRIPCION%type default null
,p_VALPRODUCTO in PRODUCTO.VALPRODUCTO%type
,p_STOCK in PRODUCTO.STOCK%type
,p_IMAGEN in PRODUCTO.IMAGEN%type default null
);
-- update
procedure upd (
p_TIPOPRODUCTO in PRODUCTO.TIPOPRODUCTO%type
,p_FABRICPROPIA in PRODUCTO.FABRICPROPIA%type
,p_MARCA in PRODUCTO.MARCA%type default null
,p_NOMBREPRODUCTO in PRODUCTO.NOMBREPRODUCTO%type
,p_MODELO in PRODUCTO.MODELO%type default null
,p_ID_PRODUCTO in PRODUCTO.ID_PRODUCTO%type
,p_DESCRIPCION in PRODUCTO.DESCRIPCION%type default null
,p_VALPRODUCTO in PRODUCTO.VALPRODUCTO%type
,p_STOCK in PRODUCTO.STOCK%type
,p_IMAGEN in PRODUCTO.IMAGEN%type default null
);
-- delete
procedure del (
p_ID_PRODUCTO in PRODUCTO.ID_PRODUCTO%type
);
end PRODUCTO_tapi;

/
create or replace package body PRODUCTO_tapi
is
-- insert
procedure ins (
p_TIPOPRODUCTO in PRODUCTO.TIPOPRODUCTO%type
,p_FABRICPROPIA in PRODUCTO.FABRICPROPIA%type
,p_MARCA in PRODUCTO.MARCA%type default null
,p_NOMBREPRODUCTO in PRODUCTO.NOMBREPRODUCTO%type
,p_MODELO in PRODUCTO.MODELO%type default null
,p_ID_PRODUCTO in PRODUCTO.ID_PRODUCTO%type
,p_DESCRIPCION in PRODUCTO.DESCRIPCION%type default null
,p_VALPRODUCTO in PRODUCTO.VALPRODUCTO%type
,p_STOCK in PRODUCTO.STOCK%type
,p_IMAGEN in PRODUCTO.IMAGEN%type default null
) is
begin
insert into PRODUCTO(
TIPOPRODUCTO
,FABRICPROPIA
,MARCA
,NOMBREPRODUCTO
,MODELO
,ID_PRODUCTO
,DESCRIPCION
,VALPRODUCTO
,STOCK
,IMAGEN
) values (
p_TIPOPRODUCTO
,p_FABRICPROPIA
,p_MARCA
,p_NOMBREPRODUCTO
,p_MODELO
,p_ID_PRODUCTO
,p_DESCRIPCION
,p_VALPRODUCTO
,p_STOCK
,p_IMAGEN
);end;
-- update
procedure upd (
p_TIPOPRODUCTO in PRODUCTO.TIPOPRODUCTO%type
,p_FABRICPROPIA in PRODUCTO.FABRICPROPIA%type
,p_MARCA in PRODUCTO.MARCA%type default null
,p_NOMBREPRODUCTO in PRODUCTO.NOMBREPRODUCTO%type
,p_MODELO in PRODUCTO.MODELO%type default null
,p_ID_PRODUCTO in PRODUCTO.ID_PRODUCTO%type
,p_DESCRIPCION in PRODUCTO.DESCRIPCION%type default null
,p_VALPRODUCTO in PRODUCTO.VALPRODUCTO%type
,p_STOCK in PRODUCTO.STOCK%type
,p_IMAGEN in PRODUCTO.IMAGEN%type default null
) is
begin
update PRODUCTO set
TIPOPRODUCTO = p_TIPOPRODUCTO
,FABRICPROPIA = p_FABRICPROPIA
,MARCA = p_MARCA
,NOMBREPRODUCTO = p_NOMBREPRODUCTO
,MODELO = p_MODELO
,DESCRIPCION = p_DESCRIPCION
,VALPRODUCTO = p_VALPRODUCTO
,STOCK = p_STOCK
,IMAGEN = p_IMAGEN
where ID_PRODUCTO = p_ID_PRODUCTO;
end;
-- del
procedure del (
p_ID_PRODUCTO in PRODUCTO.ID_PRODUCTO%type
) is
begin
delete from PRODUCTO
where ID_PRODUCTO = p_ID_PRODUCTO;
end;
end PRODUCTO_tapi;

create or replace package PROVEEDOR_tapi
is

type PROVEEDOR_tapi_rec is record (
EMAIL_PROVEEDOR  PROVEEDOR.EMAIL_PROVEEDOR%type
,DIRECCION_PROVEEDOR  PROVEEDOR.DIRECCION_PROVEEDOR%type
,RUT_PROVEEDOR  PROVEEDOR.RUT_PROVEEDOR%type
,TELEFONO_PROVEEDOR  PROVEEDOR.TELEFONO_PROVEEDOR%type
,NOM_PROVEEDOR  PROVEEDOR.NOM_PROVEEDOR%type
,ID_PROVEEDOR  PROVEEDOR.ID_PROVEEDOR%type
,APE_PROVEEDOR  PROVEEDOR.APE_PROVEEDOR%type
);
type PROVEEDOR_tapi_tab is table of PROVEEDOR_tapi_rec;

-- insert
procedure ins (
p_EMAIL_PROVEEDOR in PROVEEDOR.EMAIL_PROVEEDOR%type default null
,p_DIRECCION_PROVEEDOR in PROVEEDOR.DIRECCION_PROVEEDOR%type default null
,p_RUT_PROVEEDOR in PROVEEDOR.RUT_PROVEEDOR%type
,p_TELEFONO_PROVEEDOR in PROVEEDOR.TELEFONO_PROVEEDOR%type default null
,p_NOM_PROVEEDOR in PROVEEDOR.NOM_PROVEEDOR%type
,p_ID_PROVEEDOR in PROVEEDOR.ID_PROVEEDOR%type
,p_APE_PROVEEDOR in PROVEEDOR.APE_PROVEEDOR%type default null
);
-- update
procedure upd (
p_EMAIL_PROVEEDOR in PROVEEDOR.EMAIL_PROVEEDOR%type default null
,p_DIRECCION_PROVEEDOR in PROVEEDOR.DIRECCION_PROVEEDOR%type default null
,p_RUT_PROVEEDOR in PROVEEDOR.RUT_PROVEEDOR%type
,p_TELEFONO_PROVEEDOR in PROVEEDOR.TELEFONO_PROVEEDOR%type default null
,p_NOM_PROVEEDOR in PROVEEDOR.NOM_PROVEEDOR%type
,p_ID_PROVEEDOR in PROVEEDOR.ID_PROVEEDOR%type
,p_APE_PROVEEDOR in PROVEEDOR.APE_PROVEEDOR%type default null
);
-- delete
procedure del (
p_ID_PROVEEDOR in PROVEEDOR.ID_PROVEEDOR%type
);
end PROVEEDOR_tapi;

/
create or replace package body PROVEEDOR_tapi
is
-- insert
procedure ins (
p_EMAIL_PROVEEDOR in PROVEEDOR.EMAIL_PROVEEDOR%type default null
,p_DIRECCION_PROVEEDOR in PROVEEDOR.DIRECCION_PROVEEDOR%type default null
,p_RUT_PROVEEDOR in PROVEEDOR.RUT_PROVEEDOR%type
,p_TELEFONO_PROVEEDOR in PROVEEDOR.TELEFONO_PROVEEDOR%type default null
,p_NOM_PROVEEDOR in PROVEEDOR.NOM_PROVEEDOR%type
,p_ID_PROVEEDOR in PROVEEDOR.ID_PROVEEDOR%type
,p_APE_PROVEEDOR in PROVEEDOR.APE_PROVEEDOR%type default null
) is
begin
insert into PROVEEDOR(
EMAIL_PROVEEDOR
,DIRECCION_PROVEEDOR
,RUT_PROVEEDOR
,TELEFONO_PROVEEDOR
,NOM_PROVEEDOR
,ID_PROVEEDOR
,APE_PROVEEDOR
) values (
p_EMAIL_PROVEEDOR
,p_DIRECCION_PROVEEDOR
,p_RUT_PROVEEDOR
,p_TELEFONO_PROVEEDOR
,p_NOM_PROVEEDOR
,p_ID_PROVEEDOR
,p_APE_PROVEEDOR
);end;
-- update
procedure upd (
p_EMAIL_PROVEEDOR in PROVEEDOR.EMAIL_PROVEEDOR%type default null
,p_DIRECCION_PROVEEDOR in PROVEEDOR.DIRECCION_PROVEEDOR%type default null
,p_RUT_PROVEEDOR in PROVEEDOR.RUT_PROVEEDOR%type
,p_TELEFONO_PROVEEDOR in PROVEEDOR.TELEFONO_PROVEEDOR%type default null
,p_NOM_PROVEEDOR in PROVEEDOR.NOM_PROVEEDOR%type
,p_ID_PROVEEDOR in PROVEEDOR.ID_PROVEEDOR%type
,p_APE_PROVEEDOR in PROVEEDOR.APE_PROVEEDOR%type default null
) is
begin
update PROVEEDOR set
EMAIL_PROVEEDOR = p_EMAIL_PROVEEDOR
,DIRECCION_PROVEEDOR = p_DIRECCION_PROVEEDOR
,RUT_PROVEEDOR = p_RUT_PROVEEDOR
,TELEFONO_PROVEEDOR = p_TELEFONO_PROVEEDOR
,NOM_PROVEEDOR = p_NOM_PROVEEDOR
,APE_PROVEEDOR = p_APE_PROVEEDOR
where ID_PROVEEDOR = p_ID_PROVEEDOR;
end;
-- del
procedure del (
p_ID_PROVEEDOR in PROVEEDOR.ID_PROVEEDOR%type
) is
begin
delete from PROVEEDOR
where ID_PROVEEDOR = p_ID_PROVEEDOR;
end;
end PROVEEDOR_tapi;

create or replace package ROL_tapi
is

type ROL_tapi_rec is record (
ID_ROL  ROL.ID_ROL%type
,NOMBRE  ROL.NOMBRE%type
);
type ROL_tapi_tab is table of ROL_tapi_rec;

-- insert
procedure ins (
p_ID_ROL in ROL.ID_ROL%type
,p_NOMBRE in ROL.NOMBRE%type
);
-- update
procedure upd (
p_ID_ROL in ROL.ID_ROL%type
,p_NOMBRE in ROL.NOMBRE%type
);
-- delete
procedure del (
p_ID_ROL in ROL.ID_ROL%type
);
end ROL_tapi;

/
create or replace package body ROL_tapi
is
-- insert
procedure ins (
p_ID_ROL in ROL.ID_ROL%type
,p_NOMBRE in ROL.NOMBRE%type
) is
begin
insert into ROL(
ID_ROL
,NOMBRE
) values (
p_ID_ROL
,p_NOMBRE
);end;
-- update
procedure upd (
p_ID_ROL in ROL.ID_ROL%type
,p_NOMBRE in ROL.NOMBRE%type
) is
begin
update ROL set
NOMBRE = p_NOMBRE
where ID_ROL = p_ID_ROL;
end;
-- del
procedure del (
p_ID_ROL in ROL.ID_ROL%type
) is
begin
delete from ROL
where ID_ROL = p_ID_ROL;
end;
end ROL_tapi;
/

create or replace package SEGUIMIENTOENVIOS_tapi
is

type SEGUIMIENTOENVIOS_tapi_rec is record (
ESTADOENTREGA  SEGUIMIENTOENVIOS.ESTADOENTREGA%type
,FECENTREGA  SEGUIMIENTOENVIOS.FECENTREGA%type
,FECDESPACHO  SEGUIMIENTOENVIOS.FECDESPACHO%type
,ID_VENTA  SEGUIMIENTOENVIOS.ID_VENTA%type
,ID_SEGUI_ENVIOS  SEGUIMIENTOENVIOS.ID_SEGUI_ENVIOS%type
);
type SEGUIMIENTOENVIOS_tapi_tab is table of SEGUIMIENTOENVIOS_tapi_rec;

-- insert
procedure ins (
p_ESTADOENTREGA in SEGUIMIENTOENVIOS.ESTADOENTREGA%type
,p_FECENTREGA in SEGUIMIENTOENVIOS.FECENTREGA%type default null 
,p_FECDESPACHO in SEGUIMIENTOENVIOS.FECDESPACHO%type default null 
,p_ID_VENTA in SEGUIMIENTOENVIOS.ID_VENTA%type
,p_ID_SEGUI_ENVIOS in SEGUIMIENTOENVIOS.ID_SEGUI_ENVIOS%type
);
-- update
procedure upd (
p_ESTADOENTREGA in SEGUIMIENTOENVIOS.ESTADOENTREGA%type
,p_FECENTREGA in SEGUIMIENTOENVIOS.FECENTREGA%type default null 
,p_FECDESPACHO in SEGUIMIENTOENVIOS.FECDESPACHO%type default null 
,p_ID_VENTA in SEGUIMIENTOENVIOS.ID_VENTA%type
,p_ID_SEGUI_ENVIOS in SEGUIMIENTOENVIOS.ID_SEGUI_ENVIOS%type
);
-- delete
procedure del (
p_ID_SEGUI_ENVIOS in SEGUIMIENTOENVIOS.ID_SEGUI_ENVIOS%type
);
end SEGUIMIENTOENVIOS_tapi;

/
create or replace package body SEGUIMIENTOENVIOS_tapi
is
-- insert
procedure ins (
p_ESTADOENTREGA in SEGUIMIENTOENVIOS.ESTADOENTREGA%type
,p_FECENTREGA in SEGUIMIENTOENVIOS.FECENTREGA%type default null 
,p_FECDESPACHO in SEGUIMIENTOENVIOS.FECDESPACHO%type default null 
,p_ID_VENTA in SEGUIMIENTOENVIOS.ID_VENTA%type
,p_ID_SEGUI_ENVIOS in SEGUIMIENTOENVIOS.ID_SEGUI_ENVIOS%type
) is
begin
insert into SEGUIMIENTOENVIOS(
ESTADOENTREGA
,FECENTREGA
,FECDESPACHO
,ID_VENTA
,ID_SEGUI_ENVIOS
) values (
p_ESTADOENTREGA
,p_FECENTREGA
,p_FECDESPACHO
,p_ID_VENTA
,p_ID_SEGUI_ENVIOS
);end;
-- update
procedure upd (
p_ESTADOENTREGA in SEGUIMIENTOENVIOS.ESTADOENTREGA%type
,p_FECENTREGA in SEGUIMIENTOENVIOS.FECENTREGA%type default null 
,p_FECDESPACHO in SEGUIMIENTOENVIOS.FECDESPACHO%type default null 
,p_ID_VENTA in SEGUIMIENTOENVIOS.ID_VENTA%type
,p_ID_SEGUI_ENVIOS in SEGUIMIENTOENVIOS.ID_SEGUI_ENVIOS%type
) is
begin
update SEGUIMIENTOENVIOS set
ESTADOENTREGA = p_ESTADOENTREGA
,FECENTREGA = p_FECENTREGA
,FECDESPACHO = p_FECDESPACHO
,ID_VENTA = p_ID_VENTA
where ID_SEGUI_ENVIOS = p_ID_SEGUI_ENVIOS;
end;
-- del
procedure del (
p_ID_SEGUI_ENVIOS in SEGUIMIENTOENVIOS.ID_SEGUI_ENVIOS%type
) is
begin
delete from SEGUIMIENTOENVIOS
where ID_SEGUI_ENVIOS = p_ID_SEGUI_ENVIOS;
end;
end SEGUIMIENTOENVIOS_tapi;
/


create or replace package SERVICIO_tapi
is

type SERVICIO_tapi_rec is record (
PRECIOSERVICIO  SERVICIO.PRECIOSERVICIO%type
,DESCRIPCION_SERVICIO  SERVICIO.DESCRIPCION_SERVICIO%type
,ID_SERVICIO  SERVICIO.ID_SERVICIO%type
);
type SERVICIO_tapi_tab is table of SERVICIO_tapi_rec;

-- insert
procedure ins (
p_PRECIOSERVICIO in SERVICIO.PRECIOSERVICIO%type
,p_DESCRIPCION_SERVICIO in SERVICIO.DESCRIPCION_SERVICIO%type
,p_ID_SERVICIO in SERVICIO.ID_SERVICIO%type
);
-- update
procedure upd (
p_PRECIOSERVICIO in SERVICIO.PRECIOSERVICIO%type
,p_DESCRIPCION_SERVICIO in SERVICIO.DESCRIPCION_SERVICIO%type
,p_ID_SERVICIO in SERVICIO.ID_SERVICIO%type
);
-- delete
procedure del (
p_ID_SERVICIO in SERVICIO.ID_SERVICIO%type
);
end SERVICIO_tapi;

/
create or replace package body SERVICIO_tapi
is
-- insert
procedure ins (
p_PRECIOSERVICIO in SERVICIO.PRECIOSERVICIO%type
,p_DESCRIPCION_SERVICIO in SERVICIO.DESCRIPCION_SERVICIO%type
,p_ID_SERVICIO in SERVICIO.ID_SERVICIO%type
) is
begin
insert into SERVICIO(
PRECIOSERVICIO
,DESCRIPCION_SERVICIO
,ID_SERVICIO
) values (
p_PRECIOSERVICIO
,p_DESCRIPCION_SERVICIO
,p_ID_SERVICIO
);end;
-- update
procedure upd (
p_PRECIOSERVICIO in SERVICIO.PRECIOSERVICIO%type
,p_DESCRIPCION_SERVICIO in SERVICIO.DESCRIPCION_SERVICIO%type
,p_ID_SERVICIO in SERVICIO.ID_SERVICIO%type
) is
begin
update SERVICIO set
PRECIOSERVICIO = p_PRECIOSERVICIO
,DESCRIPCION_SERVICIO = p_DESCRIPCION_SERVICIO
where ID_SERVICIO = p_ID_SERVICIO;
end;
-- del
procedure del (
p_ID_SERVICIO in SERVICIO.ID_SERVICIO%type
) is
begin
delete from SERVICIO
where ID_SERVICIO = p_ID_SERVICIO;
end;
end SERVICIO_tapi;
/

create or replace package SOLICITUDARRIENDO_tapi
is

type SOLICITUDARRIENDO_tapi_rec is record (
TIPOBICICLETA  SOLICITUDARRIENDO.TIPOBICICLETA%type
,ID_USUARIO  SOLICITUDARRIENDO.ID_USUARIO%type
,ESTADO  SOLICITUDARRIENDO.ESTADO%type
,FECINI_ARRIENDO  SOLICITUDARRIENDO.FECINI_ARRIENDO%type
,ID_SOL_ARRIENDO  SOLICITUDARRIENDO.ID_SOL_ARRIENDO%type
,FECFIN_ARRIENDO  SOLICITUDARRIENDO.FECFIN_ARRIENDO%type
,FORMAPAGO_ARRI  SOLICITUDARRIENDO.FORMAPAGO_ARRI%type
,DEPOSITOGARANTIA  SOLICITUDARRIENDO.DEPOSITOGARANTIA%type
);
type SOLICITUDARRIENDO_tapi_tab is table of SOLICITUDARRIENDO_tapi_rec;

-- insert
procedure ins (
p_TIPOBICICLETA in SOLICITUDARRIENDO.TIPOBICICLETA%type
,p_ID_USUARIO in SOLICITUDARRIENDO.ID_USUARIO%type
,p_ESTADO in SOLICITUDARRIENDO.ESTADO%type default null
,p_FECINI_ARRIENDO in SOLICITUDARRIENDO.FECINI_ARRIENDO%type
,p_ID_SOL_ARRIENDO in SOLICITUDARRIENDO.ID_SOL_ARRIENDO%type
,p_FECFIN_ARRIENDO in SOLICITUDARRIENDO.FECFIN_ARRIENDO%type
,p_FORMAPAGO_ARRI in SOLICITUDARRIENDO.FORMAPAGO_ARRI%type
,p_DEPOSITOGARANTIA in SOLICITUDARRIENDO.DEPOSITOGARANTIA%type default null
);
-- update
procedure upd (
p_TIPOBICICLETA in SOLICITUDARRIENDO.TIPOBICICLETA%type
,p_ID_USUARIO in SOLICITUDARRIENDO.ID_USUARIO%type
,p_ESTADO in SOLICITUDARRIENDO.ESTADO%type default null
,p_FECINI_ARRIENDO in SOLICITUDARRIENDO.FECINI_ARRIENDO%type
,p_ID_SOL_ARRIENDO in SOLICITUDARRIENDO.ID_SOL_ARRIENDO%type
,p_FECFIN_ARRIENDO in SOLICITUDARRIENDO.FECFIN_ARRIENDO%type
,p_FORMAPAGO_ARRI in SOLICITUDARRIENDO.FORMAPAGO_ARRI%type
,p_DEPOSITOGARANTIA in SOLICITUDARRIENDO.DEPOSITOGARANTIA%type default null
);
-- delete
procedure del (
p_ID_SOL_ARRIENDO in SOLICITUDARRIENDO.ID_SOL_ARRIENDO%type
);
end SOLICITUDARRIENDO_tapi;

/
create or replace package body SOLICITUDARRIENDO_tapi
is
-- insert
procedure ins (
p_TIPOBICICLETA in SOLICITUDARRIENDO.TIPOBICICLETA%type
,p_ID_USUARIO in SOLICITUDARRIENDO.ID_USUARIO%type
,p_ESTADO in SOLICITUDARRIENDO.ESTADO%type default null
,p_FECINI_ARRIENDO in SOLICITUDARRIENDO.FECINI_ARRIENDO%type
,p_ID_SOL_ARRIENDO in SOLICITUDARRIENDO.ID_SOL_ARRIENDO%type
,p_FECFIN_ARRIENDO in SOLICITUDARRIENDO.FECFIN_ARRIENDO%type
,p_FORMAPAGO_ARRI in SOLICITUDARRIENDO.FORMAPAGO_ARRI%type
,p_DEPOSITOGARANTIA in SOLICITUDARRIENDO.DEPOSITOGARANTIA%type default null
) is
begin
insert into SOLICITUDARRIENDO(
TIPOBICICLETA
,ID_USUARIO
,ESTADO
,FECINI_ARRIENDO
,ID_SOL_ARRIENDO
,FECFIN_ARRIENDO
,FORMAPAGO_ARRI
,DEPOSITOGARANTIA
) values (
p_TIPOBICICLETA
,p_ID_USUARIO
,p_ESTADO
,p_FECINI_ARRIENDO
,p_ID_SOL_ARRIENDO
,p_FECFIN_ARRIENDO
,p_FORMAPAGO_ARRI
,p_DEPOSITOGARANTIA
);end;
-- update
procedure upd (
p_TIPOBICICLETA in SOLICITUDARRIENDO.TIPOBICICLETA%type
,p_ID_USUARIO in SOLICITUDARRIENDO.ID_USUARIO%type
,p_ESTADO in SOLICITUDARRIENDO.ESTADO%type default null
,p_FECINI_ARRIENDO in SOLICITUDARRIENDO.FECINI_ARRIENDO%type
,p_ID_SOL_ARRIENDO in SOLICITUDARRIENDO.ID_SOL_ARRIENDO%type
,p_FECFIN_ARRIENDO in SOLICITUDARRIENDO.FECFIN_ARRIENDO%type
,p_FORMAPAGO_ARRI in SOLICITUDARRIENDO.FORMAPAGO_ARRI%type
,p_DEPOSITOGARANTIA in SOLICITUDARRIENDO.DEPOSITOGARANTIA%type default null
) is
begin
update SOLICITUDARRIENDO set
TIPOBICICLETA = p_TIPOBICICLETA
,ID_USUARIO = p_ID_USUARIO
,ESTADO = p_ESTADO
,FECINI_ARRIENDO = p_FECINI_ARRIENDO
,FECFIN_ARRIENDO = p_FECFIN_ARRIENDO
,FORMAPAGO_ARRI = p_FORMAPAGO_ARRI
,DEPOSITOGARANTIA = p_DEPOSITOGARANTIA
where ID_SOL_ARRIENDO = p_ID_SOL_ARRIENDO;
end;
-- del
procedure del (
p_ID_SOL_ARRIENDO in SOLICITUDARRIENDO.ID_SOL_ARRIENDO%type
) is
begin
delete from SOLICITUDARRIENDO
where ID_SOL_ARRIENDO = p_ID_SOL_ARRIENDO;
end;
end SOLICITUDARRIENDO_tapi;
/

create or replace package USUARIO_tapi
is

type USUARIO_tapi_rec is record (
CONVENIO  USUARIO.CONVENIO%type
,ID_USUARIO  USUARIO.ID_USUARIO%type
,PASSWORD  USUARIO.PASSWORD%type
,DIRECCION_USUARIO  USUARIO.DIRECCION_USUARIO%type
,ID_ROL  USUARIO.ID_ROL%type
,EMAIL_USUARIO  USUARIO.EMAIL_USUARIO%type
,APELLIDOS  USUARIO.APELLIDOS%type
,RUT_USUARIO  USUARIO.RUT_USUARIO%type
,FECHANAC  USUARIO.FECHANAC%type
,NOMBRE  USUARIO.NOMBRE%type
,NUMTELEFONO  USUARIO.NUMTELEFONO%type
);
type USUARIO_tapi_tab is table of USUARIO_tapi_rec;

-- insert
procedure ins (
p_CONVENIO in USUARIO.CONVENIO%type default null 
,p_ID_USUARIO in USUARIO.ID_USUARIO%type
,p_PASSWORD in USUARIO.PASSWORD%type
,p_DIRECCION_USUARIO in USUARIO.DIRECCION_USUARIO%type
,p_ID_ROL in USUARIO.ID_ROL%type
,p_EMAIL_USUARIO in USUARIO.EMAIL_USUARIO%type default null 
,p_APELLIDOS in USUARIO.APELLIDOS%type
,p_RUT_USUARIO in USUARIO.RUT_USUARIO%type
,p_FECHANAC in USUARIO.FECHANAC%type
,p_NOMBRE in USUARIO.NOMBRE%type
,p_NUMTELEFONO in USUARIO.NUMTELEFONO%type
);
-- update
procedure upd (
p_CONVENIO in USUARIO.CONVENIO%type default null 
,p_ID_USUARIO in USUARIO.ID_USUARIO%type
,p_PASSWORD in USUARIO.PASSWORD%type
,p_DIRECCION_USUARIO in USUARIO.DIRECCION_USUARIO%type
,p_ID_ROL in USUARIO.ID_ROL%type
,p_EMAIL_USUARIO in USUARIO.EMAIL_USUARIO%type default null 
,p_APELLIDOS in USUARIO.APELLIDOS%type
,p_RUT_USUARIO in USUARIO.RUT_USUARIO%type
,p_FECHANAC in USUARIO.FECHANAC%type
,p_NOMBRE in USUARIO.NOMBRE%type
,p_NUMTELEFONO in USUARIO.NUMTELEFONO%type
);
-- delete
procedure del (
p_ID_USUARIO in USUARIO.ID_USUARIO%type
);
end USUARIO_tapi;
/
create or replace package body USUARIO_tapi
is
-- insert
procedure ins (
p_CONVENIO in USUARIO.CONVENIO%type default null 
,p_ID_USUARIO in USUARIO.ID_USUARIO%type
,p_PASSWORD in USUARIO.PASSWORD%type
,p_DIRECCION_USUARIO in USUARIO.DIRECCION_USUARIO%type
,p_ID_ROL in USUARIO.ID_ROL%type
,p_EMAIL_USUARIO in USUARIO.EMAIL_USUARIO%type default null 
,p_APELLIDOS in USUARIO.APELLIDOS%type
,p_RUT_USUARIO in USUARIO.RUT_USUARIO%type
,p_FECHANAC in USUARIO.FECHANAC%type
,p_NOMBRE in USUARIO.NOMBRE%type
,p_NUMTELEFONO in USUARIO.NUMTELEFONO%type
) is
begin
insert into USUARIO(
CONVENIO
,ID_USUARIO
,PASSWORD
,DIRECCION_USUARIO
,ID_ROL
,EMAIL_USUARIO
,APELLIDOS
,RUT_USUARIO
,FECHANAC
,NOMBRE
,NUMTELEFONO
) values (
p_CONVENIO
,p_ID_USUARIO
,p_PASSWORD
,p_DIRECCION_USUARIO
,p_ID_ROL
,p_EMAIL_USUARIO
,p_APELLIDOS
,p_RUT_USUARIO
,p_FECHANAC
,p_NOMBRE
,p_NUMTELEFONO
);end;
-- update
procedure upd (
p_CONVENIO in USUARIO.CONVENIO%type default null 
,p_ID_USUARIO in USUARIO.ID_USUARIO%type
,p_PASSWORD in USUARIO.PASSWORD%type
,p_DIRECCION_USUARIO in USUARIO.DIRECCION_USUARIO%type
,p_ID_ROL in USUARIO.ID_ROL%type
,p_EMAIL_USUARIO in USUARIO.EMAIL_USUARIO%type default null 
,p_APELLIDOS in USUARIO.APELLIDOS%type
,p_RUT_USUARIO in USUARIO.RUT_USUARIO%type
,p_FECHANAC in USUARIO.FECHANAC%type
,p_NOMBRE in USUARIO.NOMBRE%type
,p_NUMTELEFONO in USUARIO.NUMTELEFONO%type
) is
begin
update USUARIO set
CONVENIO = p_CONVENIO
,PASSWORD = p_PASSWORD
,DIRECCION_USUARIO = p_DIRECCION_USUARIO
,ID_ROL = p_ID_ROL
,EMAIL_USUARIO = p_EMAIL_USUARIO
,APELLIDOS = p_APELLIDOS
,RUT_USUARIO = p_RUT_USUARIO
,FECHANAC = p_FECHANAC
,NOMBRE = p_NOMBRE
,NUMTELEFONO = p_NUMTELEFONO
where ID_USUARIO = p_ID_USUARIO;
end;
-- del
procedure del (
p_ID_USUARIO in USUARIO.ID_USUARIO%type
) is
begin
delete from USUARIO
where ID_USUARIO = p_ID_USUARIO;
end;
end USUARIO_tapi;
/

create or replace package VENTA_tapi
is

type VENTA_tapi_rec is record (
ESTADOVENTA  VENTA.ESTADOVENTA%type
,TOTALVENTA  VENTA.TOTALVENTA%type
,ID_USUARIO  VENTA.ID_USUARIO%type
,ID_VENTA  VENTA.ID_VENTA%type
,FECHORA  VENTA.FECHORA%type
);
type VENTA_tapi_tab is table of VENTA_tapi_rec;

-- insert
procedure ins (
p_ESTADOVENTA in VENTA.ESTADOVENTA%type default null 
,p_TOTALVENTA in VENTA.TOTALVENTA%type
,p_ID_USUARIO in VENTA.ID_USUARIO%type
,p_ID_VENTA in VENTA.ID_VENTA%type
,p_FECHORA in VENTA.FECHORA%type
);
-- update
procedure upd (
p_ESTADOVENTA in VENTA.ESTADOVENTA%type default null 
,p_TOTALVENTA in VENTA.TOTALVENTA%type
,p_ID_USUARIO in VENTA.ID_USUARIO%type
,p_ID_VENTA in VENTA.ID_VENTA%type
,p_FECHORA in VENTA.FECHORA%type
);
-- delete
procedure del (
p_ID_VENTA in VENTA.ID_VENTA%type
);
end VENTA_tapi;
/
create or replace package body VENTA_tapi
is
-- insert
procedure ins (
p_ESTADOVENTA in VENTA.ESTADOVENTA%type default null 
,p_TOTALVENTA in VENTA.TOTALVENTA%type
,p_ID_USUARIO in VENTA.ID_USUARIO%type
,p_ID_VENTA in VENTA.ID_VENTA%type
,p_FECHORA in VENTA.FECHORA%type
) is
begin
insert into VENTA(
ESTADOVENTA
,TOTALVENTA
,ID_USUARIO
,ID_VENTA
,FECHORA
) values (
p_ESTADOVENTA
,p_TOTALVENTA
,p_ID_USUARIO
,p_ID_VENTA
,p_FECHORA
);end;
-- update
procedure upd (
p_ESTADOVENTA in VENTA.ESTADOVENTA%type default null 
,p_TOTALVENTA in VENTA.TOTALVENTA%type
,p_ID_USUARIO in VENTA.ID_USUARIO%type
,p_ID_VENTA in VENTA.ID_VENTA%type
,p_FECHORA in VENTA.FECHORA%type
) is
begin
update VENTA set
ESTADOVENTA = p_ESTADOVENTA
,TOTALVENTA = p_TOTALVENTA
,ID_USUARIO = p_ID_USUARIO
,FECHORA = p_FECHORA
where ID_VENTA = p_ID_VENTA;
end;
-- del
procedure del (
p_ID_VENTA in VENTA.ID_VENTA%type
) is
begin
delete from VENTA
where ID_VENTA = p_ID_VENTA;
end;
end VENTA_tapi;
/

create or replace package MANTENCION_tapi
is

type MANTENCION_tapi_rec is record (
COMENTARIOS  MANTENCION.COMENTARIOS%type
,ID_SERVICIO  MANTENCION.ID_SERVICIO%type
,VALORTOTAL  MANTENCION.VALORTOTAL%type
,ID_USUARIO  MANTENCION.ID_USUARIO%type
,FEC_SOLICITADA  MANTENCION.FEC_SOLICITADA%type
,ESTADOSOLICITUD  MANTENCION.ESTADOSOLICITUD%type
,FECINGRESO  MANTENCION.FECINGRESO%type
,GARANTIA  MANTENCION.GARANTIA%type
,ID_MANTENCION  MANTENCION.ID_MANTENCION%type
,FECSALIDA  MANTENCION.FECSALIDA%type
,RETIRODOMICILIO  MANTENCION.RETIRODOMICILIO%type
);
type MANTENCION_tapi_tab is table of MANTENCION_tapi_rec;

-- insert
procedure ins (
p_COMENTARIOS in MANTENCION.COMENTARIOS%type default null
,p_ID_SERVICIO in MANTENCION.ID_SERVICIO%type
,p_VALORTOTAL in MANTENCION.VALORTOTAL%type default null
,p_ID_USUARIO in MANTENCION.ID_USUARIO%type
,p_FEC_SOLICITADA in MANTENCION.FEC_SOLICITADA%type
,p_ESTADOSOLICITUD in MANTENCION.ESTADOSOLICITUD%type
,p_FECINGRESO in MANTENCION.FECINGRESO%type default null
,p_GARANTIA in MANTENCION.GARANTIA%type default null
,p_ID_MANTENCION in MANTENCION.ID_MANTENCION%type
,p_FECSALIDA in MANTENCION.FECSALIDA%type default null
,p_RETIRODOMICILIO in MANTENCION.RETIRODOMICILIO%type
);
-- update
procedure upd (
p_COMENTARIOS in MANTENCION.COMENTARIOS%type default null
,p_ID_SERVICIO in MANTENCION.ID_SERVICIO%type
,p_VALORTOTAL in MANTENCION.VALORTOTAL%type default null
,p_ID_USUARIO in MANTENCION.ID_USUARIO%type
,p_FEC_SOLICITADA in MANTENCION.FEC_SOLICITADA%type
,p_ESTADOSOLICITUD in MANTENCION.ESTADOSOLICITUD%type
,p_FECINGRESO in MANTENCION.FECINGRESO%type default null
,p_GARANTIA in MANTENCION.GARANTIA%type default null
,p_ID_MANTENCION in MANTENCION.ID_MANTENCION%type
,p_FECSALIDA in MANTENCION.FECSALIDA%type default null
,p_RETIRODOMICILIO in MANTENCION.RETIRODOMICILIO%type
);
-- delete
procedure del (
p_ID_MANTENCION in MANTENCION.ID_MANTENCION%type
);
end MANTENCION_tapi;

/
create or replace package body MANTENCION_tapi
is
-- insert
procedure ins (
p_COMENTARIOS in MANTENCION.COMENTARIOS%type default null
,p_ID_SERVICIO in MANTENCION.ID_SERVICIO%type
,p_VALORTOTAL in MANTENCION.VALORTOTAL%type default null
,p_ID_USUARIO in MANTENCION.ID_USUARIO%type
,p_FEC_SOLICITADA in MANTENCION.FEC_SOLICITADA%type
,p_ESTADOSOLICITUD in MANTENCION.ESTADOSOLICITUD%type
,p_FECINGRESO in MANTENCION.FECINGRESO%type default null
,p_GARANTIA in MANTENCION.GARANTIA%type default null
,p_ID_MANTENCION in MANTENCION.ID_MANTENCION%type
,p_FECSALIDA in MANTENCION.FECSALIDA%type default null
,p_RETIRODOMICILIO in MANTENCION.RETIRODOMICILIO%type
) is
begin
insert into MANTENCION(
COMENTARIOS
,ID_SERVICIO
,VALORTOTAL
,ID_USUARIO
,FEC_SOLICITADA
,ESTADOSOLICITUD
,FECINGRESO
,GARANTIA
,ID_MANTENCION
,FECSALIDA
,RETIRODOMICILIO
) values (
p_COMENTARIOS
,p_ID_SERVICIO
,p_VALORTOTAL
,p_ID_USUARIO
,p_FEC_SOLICITADA
,p_ESTADOSOLICITUD
,p_FECINGRESO
,p_GARANTIA
,p_ID_MANTENCION
,p_FECSALIDA
,p_RETIRODOMICILIO
);end;
-- update
procedure upd (
p_COMENTARIOS in MANTENCION.COMENTARIOS%type default null
,p_ID_SERVICIO in MANTENCION.ID_SERVICIO%type
,p_VALORTOTAL in MANTENCION.VALORTOTAL%type default null
,p_ID_USUARIO in MANTENCION.ID_USUARIO%type
,p_FEC_SOLICITADA in MANTENCION.FEC_SOLICITADA%type
,p_ESTADOSOLICITUD in MANTENCION.ESTADOSOLICITUD%type
,p_FECINGRESO in MANTENCION.FECINGRESO%type default null
,p_GARANTIA in MANTENCION.GARANTIA%type default null
,p_ID_MANTENCION in MANTENCION.ID_MANTENCION%type
,p_FECSALIDA in MANTENCION.FECSALIDA%type default null
,p_RETIRODOMICILIO in MANTENCION.RETIRODOMICILIO%type
) is
begin
update MANTENCION set
COMENTARIOS = p_COMENTARIOS
,ID_SERVICIO = p_ID_SERVICIO
,VALORTOTAL = p_VALORTOTAL
,ID_USUARIO = p_ID_USUARIO
,FEC_SOLICITADA = p_FEC_SOLICITADA
,ESTADOSOLICITUD = p_ESTADOSOLICITUD
,FECINGRESO = p_FECINGRESO
,GARANTIA = p_GARANTIA
,FECSALIDA = p_FECSALIDA
,RETIRODOMICILIO = p_RETIRODOMICILIO
where ID_MANTENCION = p_ID_MANTENCION;
end;
-- del
procedure del (
p_ID_MANTENCION in MANTENCION.ID_MANTENCION%type
) is
begin
delete from MANTENCION
where ID_MANTENCION = p_ID_MANTENCION;
end;
end MANTENCION_tapi;
