Enunciado del proyecto:

Ejercicio Maven – Proyecto Multi-módulo

Objetivo:
Diseñar y desarrollar un proyecto multi-módulo utilizando Maven que permita profundizar en la comprensión de la estructura modular, la herencia de POMs y la agregación de módulos.

Estructura de Módulos:

Módulo Padre (POM):
	Centralizar la configuración común: dependencias, plugins y propiedades.
Módulo "main":
	Contendrá el punto de entrada de la aplicación.
	Debe tener la clase main para ejecutar el programa y iniciar la calculadora.
Módulo "core":
	Este módulo albergará la funcionalidad principal de nuestra aplicación. 
	En nuestro caso tendra dos clases:
		- Una para la lectura y escritura por consola. Un método para imprimir por consola y otro leer input del usuario.
		- Otra que se llame "CalculatorService" que va a tener un método que sea "runCalculator", este método se debe encargar de interactuar con el usuario y de llamar a la operación que 
		  corresponda según indique el usuario.
			Para elegir la operación a realizar tendremos que pintar un menú por consola como el siguiente:
				Select an operation:
				1. Split
				2. Sum
				3. String concatenation
				4. Exit
				Option:
Módulo "operations":
	Debe tener un clase que se llame BasicOpertationsService e implemente las operaciones básicas (suma, resta, multiplicacion, división) un método para cada operación


Parte uno:
	- Crea la estructura mencionada. El resultado tiene que ser que podemos ejecutar el módulo main y utilizar la calculadora por consola

Parte dos:	
	- Añadir mockito al proyecto padre y materializarlo SOLO en los proyectos core y operations
	- Añadir lombok al padre de tal manera que la tengan todos los módulos hijos sin tener que configurar nada más
	- En los módulos que dependan de otros módulos indicar la versión y el groupId por variables
	- Configurar dos perfiles distintos:
		- Un perfil que utilice el maven repository (https://mvnrepository.com/) y otro que utilice
		  el repositorio de spring (https://repo.spring.io/ui/packages)
		- Un perfil que utilice el jdk 19 y otro el 17
		- Que cada uno tenga un driver distinto para la bbdd
		- Crea dos carpetas en resources y en un perfil excluye una y el otro tenga una expresión regular
		- Un perfil debe activarse según una propertie, el otro que se active si existe un fichero en concreto
