# Prueba tecnica Cristian Amado Cuadro

* DataBase: MySQL
* Backend: Micro Servicios spring-boot
* Frontend: Aplicacion Angular

# 1 - Creacion de la base de datos: 

 - Instalación de motor de base de datos MySQL. 
 - Creación base de datos: XPrueba
 - Creación objetos de base de datos.
 
# 2 - Instalación y configuración de herramientas para el desarrollo: 


## 2.1 - Instalación para el manejo practico de librerias Java:  apache-maven-3.8.6

Descargar en la web: https://maven.apache.org/download.cgi


## 2.2 - Instalación del JDK de Java:

Descargar en la web: https://www.oracle.com/java/technologies/downloads/#jdk18-windows


## 2.3 - Configuración de variables de entorno para el manejo de Maven:

	MAVEN_HOME, con valor:  C:\maven
	Agregar en la variable Path la ruta:  %MAVEN_HOME%\bin
	
	
## 2.4 - Configuración de variables de entorno del JDK:

	JAVA_HOME, con valor:  C:\Program Files\Java\jdk-18.0.2.1
	Agregar en la variable Path la ruta:  %JAVA_HOME%\bin


## 2.5 - Instalación de NodeJS:

Descargar en la web: https://nodejs.org/es/download/


## 2.6 - Instalación de Angular:

Documentación en la web: https://angular.io/cli


# 3 - Creación de proyecto Backend: 


## 3.1 - Generación de los proyectos Java por medio de spring initializr:

Desde la web: https://start.spring.io/

## 3.2 - Configuración de dependencias Maven a utilizar en los proyectos.

## 3.3 - Implementacion de swagger para la documentacion de las APIs.

* URL de acceso:
					- http://localhost:8091/swagger-ui.html
					- http://localhost:8092/swagger-ui.html

## 3.4 - Configuración de credenciales de origenes de datos en el archivo: application.properties de cada microservicio


## 3.5 - URL de acceso a los metodos desarrollados:

http://localhost:8080/swagger-ui.html#/planes-controller/getPlanUsingGET
http://localhost:8091/api/clientes
http://localhost:8092/api/planesMP
http://localhost:8092/api/tpIdentificacion

## 3.6 - Comandos bash para el manejo de los microservicios con Maven:

	* Levantar los servicios:  mvn spring-boot:run
	* Generar el paquete del despliegue:  mvn package


# 4 - Creación de proyecto Frontend Angular: 


## 4.1 - Xxxxx

## 4.2 - Xxxxx

## 4.3 - Xxxxx

## 4.4 - Xxxxx


# 5 - Creación de pruebas unitarias de los microservicios:
		
## 5.1 - Desarrollo de pruebas unitarias


# 6 - Instalación Docker:
	https://docs.docker.com/desktop/install/windows-install/
	
## 6.1 - Generación de archivo docker de cada proyecto