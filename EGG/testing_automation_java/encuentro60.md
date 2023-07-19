# :computer: ENCUENTRO 60

## Introducción

En Java, las colecciones son estructuras de datos que se utilizan para almacenar, organizar y manipular conjuntos de elementos de manera eficiente. Proporcionan implementaciones de diversas interfaces y clases que facilitan el manejo de los datos. Las colecciones en Java se encuentran en el paquete java.util.

Te dejamos a continuación la teoría sobre Collections

[👉 Teoría Collections](https://drive.google.com/file/d/1dpKBCQQ7ExnRSSk3bx8TcnaGPw2nw8Lk/view)

---

## Ejercicio Collections


Mira los siguientes videos si necesitas ayuda: [video 1](https://youtu.be/3lMj5WFjLSs) y [video 2](https://youtu.be/xHLCv34YQX0)


## Ejercicio 1

Estás a cargo de desarrollar un sistema de sorteo de turnos para un servicio al cliente en Java. Los clientes toman un número cuando llegan y se mantienen en una lista en el orden de su llegada. Además del servicio normal (donde se atiende al cliente que lleva más tiempo esperando), cada cierto tiempo se realiza un sorteo donde un número aleatorio es seleccionado y el cliente con ese número es atendido inmediatamente.

Para lograr esto, necesitas mantener una lista de números de turnos en el orden en que se emitieron y debes ser capaz de buscar eficientemente un número de turno específico en la lista cuando es seleccionado en el sorteo.

Implementa esta funcionalidad utilizando la implementación adecuada de la interfaz List de Java que permita mantener los elementos en el orden de inserción y realizar búsquedas eficientes por índice. 

## Ejercicio 2

Estás desarrollando una aplicación de lista de reproducción de música en Java. Los usuarios pueden agregar canciones a la lista de reproducción, mantenerlas en el orden en que se agregaron, y además, pueden insertar una nueva canción en cualquier posición de la lista, por ejemplo, al inicio para reproducirla a continuación, o en medio de la lista para reproducirla más tarde.

Además, los usuarios deben tener la opción de eliminar cualquier canción de la lista, sin importar si es la primera, la última o una canción en el medio de la lista.

Por tanto, necesitarás una lista que permita insertar y eliminar elementos de cualquier posición de manera eficiente, así como mantener el orden de inserción.

Desarrolla esta funcionalidad utilizando la implementación adecuada de la interfaz List de Java que cumpla con estos requisitos.

## Ejercicio 3

Desarrolla una aplicación en Java para gestionar un sistema de impresión en una biblioteca. La aplicación debe ofrecer un menú interactivo con las siguientes opciones:

Añadir un trabajo de impresión: permite a los usuarios ingresar trabajos de impresión como cadenas de texto que se añadirán al final de la cola.

Ver el próximo trabajo a imprimir: muestra al usuario el trabajo de impresión que está al frente de la cola, es decir, el próximo en ser procesado.

Establecer la cantidad de trabajos a imprimir: permite al usuario especificar cuántos trabajos de impresión, empezando desde el frente de la cola, deben ser procesados.

Cancelar trabajo: te permite ver la lista de trabajos en la cola y seleccionar el trabajo o los trabajos a eliminar.

La aplicación debe asegurarse de que los trabajos de impresión se procesen siguiendo el la regla FIFO (First-In-First-Out). 

Para implementar eficientemente estas operaciones, utiliza la interfaz List de Java más adecuada para este escenario.

💡TIP: Puedes ver qué estructura de datos usar en la siguiente pantalla. Te invitamos a pensar, siguiendo la teoría, qué implementación tiene los métodos más adecuados para cada problema


---
