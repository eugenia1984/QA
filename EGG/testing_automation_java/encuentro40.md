# :computer: ENCUENTRO 40

## Introducción

En esta sección veremos la asociación de objetos. Este es un principio clave en la POO que nos permite establecer relaciones entre objetos para lograr una mayor flexibilidad y modularidad en nuestros programas. A través de la asociación, podemos definir cómo los objetos colaboran entre sí, intercambiando información y realizando tareas conjuntas para alcanzar un objetivo común.

A lo largo del curso, trabajaremos en ejercicios prácticos y proyectos que nos ayudarán a aplicar los conceptos de asociación de objetos en situaciones del mundo real. También contaremos con recursos adicionales, como lecturas recomendadas y ejemplos de código, para ampliar nuestra comprensión y fomentar nuestra creatividad en la resolución de problemas.

Te dejamos a continuación la teoría sobre Asociación de objetos:

[👉 Teoría Asociación de objetos](https://drive.google.com/file/d/1iucKIYem27AIk_dQxWjnSor1AVQGnvki/view)


---

## Aora vamos a poner manos en la masa! 

Mira el siguiente video si necesitas ayuda con los siguientes ejercicios: [ver video](https://youtu.be/0zwBoq9CAlM)


---

## Construye un sistema de gestión para una liga de fútbol

Deberás manejar equipos y jugadores con una relación de agregación, permitiendo al usuario interactuar con ellos a través de un menú de texto:

- Crear jugador: Esta opción te permitirá crear un nuevo jugador. Deberás pedir al usuario el nombre del jugador y mostrar la lista de equipos disponibles para que elija uno, si no hay equipos creados entonces debería mostrar un mensaje que diga que no hay equipos disponibles y setear null.

- Crear equipo: Esta opción te permitirá crear un nuevo equipo. Deberás pedir al usuario el nombre del equipo.

- Asignar jugador a equipo: Con esta opción, podrás asignar un jugador existente a un equipo existente. Deberás permitir al usuario seleccionar de la lista de jugadores y equipos existentes.

- Seleccionar jugador: Con esta opción, podrás seleccionar un jugador específico para ver o modificar sus detalles. Esto debería llevar a un submenú con opciones como:

- Ver detalles: Muestra el nombre del jugador y el equipo al que está asignado.

- Cambiar nombre: Permite al usuario cambiar el nombre del jugador.

- Cambiar equipo: Permite al usuario cambiar el equipo al que está asignado el jugador.

- Regresar al menú principal.

Seleccionar equipo: Al elegir esta opción, se debe mostrar la lista de equipos, seleccionar uno y luego mostrar el siguiente submenú con las siguientes opciones:

Ver detalles.

- Cambiar nombre: Debes asegurarte que cambie el nombre de la instancia de equipo que pertenece a cada jugador también.

- Agregar jugador al equipo: se debe mostrar la lista de jugadores para que el usuario elija a cual asignarle el equipo.

- Mostrar jugadores del equipo.

- Regresar al menú principal.

Mostrar lista de jugadores: Esta opción mostrará una lista de todos los jugadores creados, junto con el nombre del equipo al que están asignados, si corresponde.

- Mostrar lista de equipos: Esta opción mostrará una lista de todos los equipos creados.

- Eliminar jugador: te debe permitir seleccionar un jugador para ser eliminado de un array de jugadores global

- Eliminar Equipo: te debe permitir eliminar un equipo de un array de equipos global.

- Salir: Esta opción termina la ejecución del programa.

📍 El programa debe mantener en memoria las listas de jugadores y equipos.

--

### Construye un sistema de gestión para una liga de fútbol - Parte 2

Utiliza el ejercicio anterior pero ahora crea un proyecto nuevo donde la lógica sea una relación de composición:

No debes dejar que se pueda crear un Jugador si no hay equipos disponibles.

Cuando eliminas un equipo debes eliminar también los jugadores que pertenezcan a ese equipo. Pero la relación inversa no se cumple, es decir, si eliminas un jugador no debes eliminar al equipo al que pertenece.

💡Nota: Recuerda realizar los test de tus clases.
