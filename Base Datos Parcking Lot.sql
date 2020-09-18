create Database System_of_parckinglot
go

use System_of_parckinglot
go
/* Creamos la Tabla Primero */


Create table Vehiculo (
id_vehiculo bigint identity (1,1) not null,
placa varchar (8) not null,
modelo varchar (25) not null,
propietario varchar (40) not null,
tipo_vehiculo varchar (25) not null,
hora_entrada varchar (50) not null
)

create table persona (
id_persona bigint identity (1,1) not null,
cedula varchar (10) not null,
nombre varchar (40) not null,
apellido varchar (40) not null,
telefono varchar (10) not null,
tipo_persona varchar (40) not null
)

create table factura (
id_factura bigint identity (1,1) not null,
fecha varchar (50) not null,
ruc varchar (10) not null,
ref_cliente bigint not null,
ref_empleado bigint not null
)

create table detalle_factura (
id_detalle bigint identity (1,1) not null,
servicios varchar (50) not null,
descripcion varchar (150) ,
ref_factura bigint not null
)

create table pago (
id_pago bigint identity (1,1) not null, 
tiempo_parqueado varchar (50) not null,
hora_salida varchar (50) not null,
total varchar (6) not null,
tipo_pago varchar (40) not null,
ref_factura bigint not null,
ref_detalle bigint not null
)

create table tickets (
id_tickets bigint identity (1,1) not null,
ref_cliente bigint not null
)
Go 

/********************************
Primary key 
*/

alter table vehiculo 
add constraint PK_Vehiculo
primary key (id_vehiculo)


alter table persona
add constraint PK_Persona
primary key (id_persona)


alter table factura
add constraint PK_Factura
primary key (id_factura)

alter table detalle_factura
add constraint PK_Detale_Factura
primary key (id_detalle)

alter table pago 
add constraint PK_Pago
primary key (id_pago)

alter table tickets
add constraint PK_Tickets
primary key (id_tickets)

go

/***********************
Foring Key
*/

alter table factura
add constraint FK_Factura_Persona_cliente
foreign key (ref_cliente)
references persona (id_persona)


alter table factura
add constraint FK_Factura_Persona_empleado
foreign key (ref_empleado)
references persona (id_persona)

alter table detalle_factura
add constraint FK_Detalle_Factura
foreign key (ref_factura)
references factura (id_factura)

alter table pago
add constraint FK_Pago
foreign key (ref_factura)
references factura (id_factura)


alter table pago
add constraint FK_Pago_Detalle
foreign key (ref_detalle)
references detalle_factura (id_detalle)


alter table tickets
add constraint FK_Tickest
foreign key (ref_cliente)
references persona (id_persona)
go













