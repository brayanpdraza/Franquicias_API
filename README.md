# API FRANQUICIAS

## Tabla de Contenidos
1. [Descripción](#descripción)
2. [Tecnologías Usadas](#tecnologías-usadas)
3. [Despliegue Local desde GitHub](#despliegue-local)
4. [Uso](#uso)
5. [Contacto](#contacto)

## Descripción
Este proyecto es una API hecha en Spring Boot Maven, para gestionar franquicias, sucursales, Productos y Usuarios, permitiendo realizar operaciones CRUD sobre los mismos. La data se almacena en una Base de Datos SQL Server, la cual se encuentra en la nube en "Somee".

## Tecnologías Usadas
- Java
- Spring Boot
- Maven

## Despliegue Local desde GitHub

Para desplegar este proyecto localmente desde el repositorio de GitHub, sigue estos pasos:

1. **Clonar el repositorio**:
   Abre una terminal y clona el repositorio usando el siguiente comando:
   git clone https://github.com/brayanpdraza/Franquicias_API.git

2 **Navegar al directorio del proyecto: Cambia al directorio del proyecto recién clonado**:
cd Franquicias_API

3 **Instalar dependencias: Ejecuta el siguiente comando para instalar las dependencias**:
mvn install

4 **Ejecutar la aplicación: Una vez que todas las dependencias estén instaladas, inicia la aplicación con el siguiente comando**:

mvn spring-boot:run

5 **Acceder a la API: Una vez que la aplicación esté en ejecución, podrás acceder a la API en tu navegador o en herramientas como Postman usando la siguiente URL**:
http://localhost:8080/usuario/obtenerUsuariosInnerPerfil

Con esta URL de prueba, deberías ver los usuarios registrados en el sistema.

## Uso
### Ejemplo de Uso de la API
Para esta sección, tomaré como referencia el uso del software POSTMAN.
- **Añadir una Sucursal Nueva**
  - **Endpoint:** `/Productos/Sucursal/guardarSucursal`
  - **Ejemplo de Solicitud:**
    Seleccionamos solicitud de tipo "POST":
    http://localhost:8080/Sucursal/guardarSucursal/
    
    Body:
    json
    {
    "idMTFranquicias": 2,
    "nombreSucursal": "Mc Donnalds Villavicencio",
    "idcreador" : 1,
    "fechaCreador" : "10/25/2024",
    "idmodif": null,
    "fechaModif": null,
    "ideliminador": null,
    "fechaEliminador": null
  }
  - **Respuesta Esperada:**
  json
  {
    "idMTFranquicias": 2,
    "nombreSucursal": "Mc Donnalds Villavicencio",
    "idcreador" : 1,
    "fechaCreador" : "10/25/2024",
    "idmodif": null,
    "fechaModif": null,
    "ideliminador": null,
    "fechaEliminador": null
  }
Si el nombre de la sucursal ya se encuentra registrado para otra Sucursal de la misma Franquicia, la API no permitirá añadir la Sucursal informando al usuario. Si la sucursal no tiene asociado una Franquicia (ID_MT_Franquicias),
la API no permitirá añadir la Sucursal informando al usuario.

- **Modificar Nombre de Producto**
  - **Endpoint:** `/Productos/ModificarNombreProducto/{id}/{nuevoNombre}`
  - **Ejemplo de Solicitud:**
    Seleccionamos solicitud de tipo "PUT":
    http://localhost:8080/Productos/ModificarNombreProducto/1/Burguer Pollo
  - **Respuesta Esperada:**
    json
    {
    "idProductos": 1,
    "idMTSucursales": 5,
    "nombreProducto": "Burguer Pollo",
    "stock": 4.00,
    "fechaCreador": "2024-10-25 00:00:00.0",
    "idcreador": 1
}

Si el nombre no cambia para el mismo producto o ya se encuentra registrado para otro producto de la misma sucursal, la API no permitirá el cambio informando al usuario.

## Contacto
Brayan Alejandro Pedraza León - brayanelarquero@gmail.com / brayan_pedraza@javeriana.edu.co
