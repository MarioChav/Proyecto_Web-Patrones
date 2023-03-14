/*Eliminar base de datos
drop schema proyecto ;
drop user usuario;
*/

/*Se crea la base de datos junto con el usuario y permisos*/
CREATE SCHEMA proyecto;
create user 'usuario'@'%' identified by 'root';
grant all privileges on proyecto.* to 'usuario'@'%';
flush privileges;


/*Creacion de tablas*/
create table proyecto.usuario (
  id_usuario INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  apodo VARCHAR(50) NOT NULL,
  clave VARCHAR(5000) NULL,
  activo bool,
  PRIMARY KEY (id_usuario)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;

create table proyecto.cliente (
  id_cliente INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  apellidos VARCHAR(50) NOT NULL,
  correo VARCHAR(50) NULL,
  telefono VARCHAR(50) NULL,
  activo bool,
  PRIMARY KEY (id_cliente)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;


create table proyecto.categoria(
  id_categoria INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(50) NOT NULL,
  PRIMARY KEY (id_categoria)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;

create table proyecto.producto (
  id_producto INT NOT NULL AUTO_INCREMENT,
  id_categoria INT NOT NULL,
  nombre VARCHAR(50) NOT NULL,
  descripcion VARCHAR(500) NOT NULL,  
  precio double,
  cantidad int,
  activo bool,
  PRIMARY KEY (id_producto),
  foreign key fk_producto_categoria (id_categoria) references categoria(id_categoria)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_eo_0900_ai_ci;

