# :star: CASOS DE PRUEBA
---

## :book: TEMAS

- Como registrar un caso de prueba

- Técnicas TDD y BDD

- Tips para crear buenos casos de pruebas

- El Método de Clases de equivalencia (CE) en test de Caja Negra

- Descripción en un caso de prueba

---

## :star: 1 - Como registrar un caso de prueba

- Datos a incorporar 

- Forma de Escritura 

- Ejemplo Práctico

---

## :star: 2 - Técnicas TDD y BDD

#### Modelos de Testing y creación de casos de prueba

Aunque TDD no fue creado para testing, es un sistema muy utilizada en este ámbito.

TDD es una metodología de desarrollo cuyo objetivo es crear primero las pruebas y luego escribir el software y luego probar si el software está funcionando de acuerdo a esas pruebas "pre-planeadas".

BDD (Behavior Driven Development), también es una estrategia de desarrollo dirigido por comportamiento, que ha evolucionado desde TDD (Test Driven Development), y tampoco nació como una técnica de testing.

Tanto en TDD como en BDD, las pruebas se deben definir antes del desarrollo, aunque en BDD, las pruebas se centran en el usuario y el comportamiento del sistema como un conjunto, a diferencia del TDD que se centra en funcionalidades específicas del software.

##### ¿Qué enfoque de testing debo aplicar? ¿TDD o BDD?

Aunque TDD o BDD parecen muy similares, la principal diferencia entre ambas está en el alcance. TDD es una práctica de desarrollo, enfocada en cómo revisar el sistema y cómo debería funcionar. Mientras que BDD es un enfoque de equipo que hace hincapié en porqué debes revisar ese código y porqué se debería comportar de una forma u otra.

En TDD el tester escribe los tests mientras que en BDD el usuario final, junto al resto del equipo multidisciplinario, escriben los tests.

---

## :star: 3 - Tips para crear buenos casos de pruebas

![image](https://user-images.githubusercontent.com/72580574/220201503-d49ce532-a300-4583-95d3-556c90b609fb.png)


---

## :star: 4 - El Método de Clases de equivalencia (CE) en test de Caja Negra


- Consiste en dividir los valores de entrada en clases de datos para derivar casos de prueba.

- Se asume que el resultado de una prueba con un valor representativo de cada CE equivale a
realizar la misma prueba con cualquier otro valor de la CE.

- Pasos para diseñar casos de prueba:

1. Identificar clases de equivalencia.

2. Identificar los casos de prueba. Minimizando no casos de prueba, considerar tantas
condiciones como sea posible. 

Pasos:

- Asignar a cada CE un representante único.

- Definir casos de prueba que cubran tantas CE válidas como sea posible. Repetir
hasta que todas las CE estén cubiertas.

- Definir un caso de prueba para cubrir una única CE no válida. Repetir hasta que
todas estén cubiertas.

![image](https://user-images.githubusercontent.com/72580574/220201644-45917d4e-d9f5-4d77-9d2b-14d4e32ccf29.png)


---

## :star: 5 - Descripción en un caso de prueba


La descripción en el paso de prueba como parte fundamental del resultado de un buen testing

---
