# :star: 4 - Ciclo de vida del testing

---

## :book: Temas

- 1 - Mapa del Testing

- 2 - Práctica de Contenido n° 5.

- 3 - Clase 2 en Vivo. Curso de Testing. Transmisión en vivo de Instituto Web

---

## :star: 1 - Mapa del Testing

- Un recorrido por la "vida del software" y de como se inserta el testing en esta actividad.

![image](https://user-images.githubusercontent.com/72580574/216835215-6a35378c-c455-44b1-ab0a-4b1e674d6e7c.png)


Es conceptual, no es para hacer un análisis técnico, sino para entender el concepto.

Todo comienza con una **necesidad** de un usuario(puede ser usuario dle sistema, in cliente, un proveedor) y plantea una **idea de mejora del software**.

Una vez que esta idea es aceptada se hace el **análisis del desarrollo**: ¿tenemos a la gente?¿cuanto cuesta?¿Como se hace?

Pasamos a generar el **Requerimiento de cada historia de usaurio**, esa idea se la separa en partes, en tarjetas donde se anota que hay que hacer.

Esos requerimientos **llegan a desarrollo** y a su vez se va **Realizando testing**. 

Al llegar a testing, la gente de testing debe **Desarrollar el caso de prueba**, en base al requerimiento ¿Que voy a probar?¿Cual es el resultado esperado?. Este caso de prueba **se le asigna a un teeter**, el cual debe **analizar el caso de prueba**, para saber si se podrá realizar.¿Tenemos la Mac?¿Tenemos el celular?¿Estan todos los datos completos?¿Se entiende?

-> Hay dos caminos...

... rechazado o suspendido

... puede realizarse

Suponemos que el **Caso de prueba puede realizarse**, entonces se ejecuta y tenemos dos posibles escenarios...

... la prueba no pasa -> **vuelve a desarrollo**. Y se repten los pasos: llaga a desarrollo -> se envia a testing , etc, etc -> es un **Caso de regresión**(porque regresa a desarrollo).

... la prueba pasa ok -> **documentación de la prueba** -> **Test finalizado y cerrado**

---

## :star: 2 - Práctica de Contenido n° 5.

Componentes del Ciclo de Desarrollo

![image](https://user-images.githubusercontent.com/72580574/216836077-d589916f-c929-4baa-8b06-008f2a084d26.png)


---

## :star:  3 - Clase 2 en Vivo. Curso de Testing. Transmisión en vivo de Instituto Web (Nov 2022)

- CUANDO SE DESHABILITE **RESULTADO DE UNA PRUEBA** RECOMIENDA VER LA ENTREVISTA DE 10 MINUTOS DE UN QA, PARA VER SI YA INCORPORAMOS LOS CONCEPTOS DE TESTING.

- En **TIPO DE TEST** hay una **CLASIFICACIÓN DE LAS PRUEBAS**, son preguntas de entrevista, en el 90 % de las entrevistas se pregunta sobre esto.

1. Prueba Funcional

2. Prueba No Funcional

3. Caja Blanca

4. Caja Negra

5. Regresión

6. Pruebas Unitarias

->  Una de ellas es la **PRUEBA FUNCIONAL**, se prueba una funcionalidad que hizo algún programador del equipo. Es una **función que se agregó al programa**.

-> Otras son las **PRUEBAS NO FUNCIONALES**, como lo que se hizo al ver la velocidad de internet, si los antivirus están al día, todo lo que no tenga que ver con el desarrollo de un programador.

-> Como tester **se informa lo que se ve** que roblema se encuentra, pero NO es tarea del tester: brindar la solución, ni decir qué lo origina. Solo se **cuenta lo que se ve** y se avisa de las anormalidades encontradas. Hay ciertas **métricas** para uno poder comparar y saber si estamos bien. Acá surgen los **QA**, una persona de **calidad** que ya sabe de estas métricas, por ejemplo entre 3 y 4 seg. toma Google como ok para un tiempo de carga de la página. Y también tenemos a la gente de **QC**, de **control de calidad**, se aseguran que la calidad se cumpla.

**QA** (**Garantía de Calidad**)-> preve, desarrolla, mantiene pautas donde marca una calidad definida. Es el que diseña, y especifica, hace la **Definition of Done** (Definición de Hecho), donde se detallan los requerimientos y requisitos a cumplir. -> **General la especificación de requisitos para tener calidad**.

**QC** -> Los que llevan a cabo el control, en base a loq ue dice QA. Ellos son los que hacen las pruebas. -> **Prueban y desarrollan pruebas**.


:tv: -> [https://academybugs.com/](https://academybugs.com/)

Página con 25 errores, para llegar a encontrarlos hay que tener un plan claro, generar casoss y garantizar qeu esos casos fueron probados. Con solo una prueba exploratoria, sin un plan, nos perdemos en la web. Por eso hay que tener una definición de los casos de prueba, estar ordenados.

Una vez que hacemos click en el error, nos muestra como deberíamos hacer el informe. 

Las **pruebas exploratorias** son para cuando no hay tiempo y poca plata. Se prueba solo lo más importante, si veo un e-commerce, me aseguro que se complete la compra, que salgan bien las imágenes y los precios, que funcione agregar , quitar y modificar los productos del carrito. A veces se necesita que la gente que realiza la prueba tiene cierto conocimiento, por eso a veces se **prueba con usuarios**, esta prueba de usuarios es muy beneficioso hacerlo antes de salir a producción, que prueben las versiones Beta, por ejemplo.

-> Trello y Jira se utiliza 

Estoy viendo en el 1.06.23 (que falta ver)

---
