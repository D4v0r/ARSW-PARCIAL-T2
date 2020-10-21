# Weather API

> Davor Javier Cortés Cardozo
>
> Arquitectura de Software (ARWS)
>
> Parcial 2T

## Descripción

Parcial del segundo tercio

Su compañía lo ha seleccionado para construir una aplicación para consultar el estado del clima en lugares específicos de la tierra.

La aplicación recibirá en un campo el nombre de una ciudad, por ejemplo London para Londres y deberá mostrar la información del clima para esa ciudad. Para esto utilice el API gratuito de openweathermap (Puede crear una cuenta para obtener la llave para realizar consultas). Se le pide que su implementación sea eficiente en cuanto a recursos así que debe implementar un caché que permita evitar hacer consultas repetidas al API externo. Una vez tenga la funcionalidad básica, extienda su implementación para incluir una funcionalidad para mostrar mapas de la ciudad con diferentes capas del clima (revise la funcionalidad del API de mapas de clima y el ejemplo anexo.). La implementación del mapa puede ir directamente a los servicios externos sin pasar por el servidor intermediario. Sugerencia realice la implementación de manera incremental. Haga commits regulares.

## Arquitectura

La API implementada Usa una arquitectura por capas de estilo Cliente-Servidor, cuenta con las siguientes capas en el lado del servidor:

+ Cache
+ Servicios
+ Controladores
+ Modelo

Las capas se implementaron haciendo uso de la inversión de dependencias con el fin de lograr un bajo acoplamiento.



## Comenzando

### Instalación

Primero se debe clonar el repositorio para ello inserte el siguiente comando en la línea de comandos:
```
https://github.com/D4v0r/ARSW-PARCIAL-T2
```

### Compilación y Pruebas

En la consola de comandos ingresar el siguiente comando para compilar el proyecto y ejecutar las pruebas:

```
mvn package
```

### Ejecución
Para ejecutar el servicio web en el localhost:8080 debe usar el siguiente comando:

```
mvn spring-boot:run
```
