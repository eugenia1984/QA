# :computer: ENCUENTRO 41


## Introducción

Los principios SOLID son un conjunto de directrices y mejores prácticas que nos ayudan a diseñar y desarrollar software de alta calidad, modular y fácil de mantener. Cada uno de estos principios se enfoca en un aspecto clave de la programación orientada a objetos y nos proporciona pautas claras para estructurar nuestros programas de manera eficiente. Durante este curso, exploraremos cada uno de los cinco principios SOLID y entenderemos cómo aplicarlos en nuestras aplicaciones.

Comenzaremos con el Principio de Responsabilidad Única (Single Responsibility Principle), que nos guiará para que cada clase o componente tenga una única responsabilidad bien definida. A medida que avanzamos, aprenderemos sobre el Principio de Abierto/Cerrado (Open/Closed Principle), que nos enseña a diseñar nuestras clases de manera que puedan ser extendidas sin necesidad de modificar el código existente. Continuaremos con el Principio de Sustitución de Liskov (Liskov Substitution Principle), que nos ayudará a utilizar la herencia de manera correcta, garantizando que las subclases puedan ser utilizadas en lugar de las superclases sin problemas. Luego, estudiaremos el Principio de Segregación de Interfaces (Interface Segregation Principle), que nos mostrará cómo dividir nuestras interfaces en conjuntos más específicos y cohesivos, evitando la dependencia innecesaria de código. Por último, exploraremos el Principio de Inversión de Dependencia (Dependency Inversion Principle), que nos mostrará cómo estructurar nuestras dependencias para que los módulos de alto nivel no dependan de los módulos de bajo nivel, sino de abstracciones comunes. Te dejamos a continuación la teoría sobre Asociación de objetos:

[👉 Teoría Principios SOLID]([)](https://drive.google.com/file/d/19vPf4OvBw5ZYT7_8N5AJzeudFzh2Kq-E/view)https://drive.google.com/file/d/19vPf4OvBw5ZYT7_8N5AJzeudFzh2Kq-E/view

---

## Patrón experto

## Ahora vamos a poner manos en la masa! 

Mira el siguiente video si necesitas ayuda con los siguientes ejercicios: [ver video](https://youtu.be/DKL5_XrJChI)https://youtu.be/DKL5_XrJChI)

📍No tienes que crear clases de test para tus clases dentro del paquete “modelos”

---

## EJercicio 1

Utiliza el primer ejercicio de la sección anterior (Construye un sistema de gestión para una liga de fútbol) como base y crea un nuevo proyecto donde apliques el patrón experto.

---

## Ejercicio 2

Utiliza el segundo ejercicio de la sección anterior  (Construye un sistema de gestión para una liga de fútbol - Parte 2)  como base y crea un nuevo proyecto donde apliques el patrón experto.

---

## Ejercicio 3 - Proyecto para administrar personas
Crea un proyecto para administrar personas y países usando el patrón experto. Las personas deben tener nombre, edad y país, y los países tienen que tener nombre. La relación debe ser de agregación y debes darles las siguientes opciones al usuario:

Crear Persona: Esta opción te permitirá crear una nueva persona. Deberás pedir al usuario el nombre, la edad y mostrar la lista de países disponibles para que el usuario elija uno, si no hay países disponibles permítele al usuario crear uno para asignarse a la persona.

Crear País: Esta opción te permitirá crear un nuevo país. Deberás pedir al usuario el nombre del país.

Mostrar lista de personas: Esta opción mostrará en formato tabla la lista de personas

Mostrar lista de países: Esta opción mostrará en formato tabla la lista de equipos.

Cuando se muestre la lista de personas o países se deben mostrar las siguientes opciones según corresponda:

Filtrar: Con esta opción debes usar un arreglo distinto al base de la clase correspondiente para poder almacenar los objetos filtrados. Además de mostrar opciones para filtrar por propiedad debes agregar una opción para aplicar un segundo filtro

Ordenar: Con esta opción debes usar el arreglo que usas para filtrar, permitir seleccionar la propiedad por la cual se va a ordenar y aplicar un algoritmo de ordenamiento. (Luego de ordenar y filtrar siempre vuelve a mostrar la lista resultante)

Seleccionar Persona: Con esta opción el usuario debe  seleccionar una persona y luego mostrar un submenú con estas opciones:

Ver detalles.

Cambiar nombre.

Cambiar edad.

Reasignar país.

Regresar al menú principal.

Seleccionar País: Con esta opción el usuario debe seleccionar un país y luego mostrar un submenú con estas opciones:

Ver detalles.

Cambiar nombre: Debes asegurarte que cambie el nombre de la instancia de país que pertenece a cada persona también.

Mostrar personas del país.

Regresar al menú principal.

Regresar al menú principal.

Salir: Esta opción termina la ejecución del programa.


