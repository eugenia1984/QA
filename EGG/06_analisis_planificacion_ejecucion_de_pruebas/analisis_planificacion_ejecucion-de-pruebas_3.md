# :star: Análisis, planificación y ejecución de pruebas III

---

ENCUENTRO 9 Y 10 / 20

---

## :star: ¡Te damos la bienvenida a tu noveno y décimo encuentro de trabajo!

Ya eres un experto gestionando los tiempos. Encontrarás que a veces hacemos breves repasos de temas ya vistos y que los tópicos y ejercicios están acompañados de imágenes.

Esta guía está diseñada para realizarse durante los encuentros 9 y 10 del curso Testing Manual.


---

## :book: MATERIAL DE LECTURA 

### :star: Estimación

Para estimar el costo de llevar a cabo un plan de pruebas - en términos de esfuerzo y tiempo- no hay una sola receta.

#### ¿NECESITAS UN EJEMPLO? 

A continuación, te comentamos algunos encuadres que pueden servir para realizar una estimación:

#### Basarse en métricas

Este método de estimación consiste en basarse en datos provenientes de proyectos anteriores y -preferentemente- de información de proyectos similares.

Se podría tener en cuenta: la cantidad de casos de prueba escritos y ejecutados, el tiempo de desarrollo y ejecución,  la cantidad de defectos encontrados y el tiempo de corrección y re-testeo.

Esa información, ofrece un estimado del tiempo de desarrollo y ejecución de un plan de pruebas para un proyecto similar.

#### ¿NECESITAS UN EJEMPLO? 

Basarse en expertos en la materia (Wide band delphi approach)
Este encuadre consiste en consultar estimaciones a los responsables de cada una de las tareas o a personas consideradas expertas ya que son quienes tienen conocimiento sobre las herramientas a utilizar y experiencia en el área.

Por ejemplo, se podría tener en cuenta la estimación de consultores, analistas de calidad experimentados, desarrolladores o cualquier persona que conozca y entienda bien el sistema en desarrollo.

Es válido usar un mix de estas dos metodologías de estimación o inclusive probar nuevas técnicas.


---

-> **Secreto de la industria 1**: 

Ejecuta la prueba más larga y compleja de principio a fin Toma nota del tiempo de ejecución y usalo como parámetro para calcular el tiempo probable de las otras pruebas de menor complejidad.

Cronometra la tarea más larga de cada grupo de tareas para obtener un parámetro y calcular la compleción del total de las tareas de cada grupo (análisis, planificación, diseño, ejecución).

Es recomendable estimar los tiempos con holgura.

---

-> **TIP** 😉: El buffer time es tu aliado

Una estimación es una aproximación. ¡No lo olvides! Es útil estimar tiempos y esfuerzos holgados evitando que el equipo de desarrollo trabaje a contrarreloj.

Para esto siempre es bueno agregar un buffer time, es decir un margen de tiempo extra, de tal manera puedan hacer frente a los imprevistos  sin necesidad de trabajar horas extras.

---

#### ¿NECESITAS UN EJEMPLO? 

Base por puntos – Base por horas

En muchos grupos de trabajo se utiliza estimar el esfuerzo que lleva cada tarea en tiempo neto: horas, minutos, días, semanas, meses;.

Pero en el mundo ágil se utiliza frecuentemente la estimación por puntos o story points (puntos de historia)

### ¿En qué consiste la estimación por puntos?

Los puntos se utilizan para representar el tiempo de realización de una tarea o proyecto en términos de esfuerzo y complejidad. En esta modalidad se tiene en cuenta el volumen de trabajo y otros factores como la incertidumbre o los imprevistos.

El desarrollo ágil itera en ciclos. Cada uno engloba puntos. 

- Cuando el equipo planifica el trabajo que llevará a cabo en el ciclo por comenzar, sabe que su capacidad es por ejemplo, de 8 o 34 puntos.

- Si la capacidad del equipo es de 34 puntos y se asume una tarea o historia de 32, esa será la única tarea a realizar en el ciclo o sprint.

Es muy común que los puntos para estimar sigan el ciclo de la serie Fibonacci: cada número de la serie es la suma de los dos anteriores. Esto hace que la diferencia de esfuerzo entre números sea palpable por lo tanto, la serie resulta útil para cuantificar el esfuerzo de manera equilibrada o consistente.

Si bien existen equipos que utilizan escalas lineales (por ejemplo: 1, 2, 3, 4, 5, 6, 7… puntos) la diferencia entre cada número y los adyacentes, es la misma y por consiguiente el uso de la escala puede ser dispar dependiendo de cómo interprete la escala cada persona.

En cambio con Fibonacci: 2 podría ser 2 historias bien pequeñas (de 1 y 1 punto). 13 podría ser el análogo de una historia mediana (8) más una algo más pequeña (5)

La proporcionalidad entre los números nos permite tomar un número como parámetro y calcular la complejidad de cada historia en base a ese parámetro y a la experiencia adquirida.


### ¿Te has quedado con ganas de seguir aprendiendo más?

Aquí te dejamos unos artículos para que profundices:

[Story points vs horas](https://www.atlassian.com/es/agile/project-management/estimation)

[Pasos para estimar con story points](https://asana.com/es/resources/story-points)

[Razones para estimar en puntos - video: 15 minutos](https://www.youtube.com/watch?v=uLNzHsjgPwU)

[Why the Fibonacci sequence Works well for estimating](https://www.mountaingoatsoftware.com/blog/why-the-fibonacci-sequence-works-well-for-estimating)

Seguramente, con tiempo y experiencia, tus estimaciones se vuelvan más acertadas. Es perfectamente normal hacer estimaciones erróneas durante las primeras tareas, pero esto sirve de experiencia.


####¿NECESITAS UN EJEMPLO? 

Si estimé que la prueba de un login llevaría 4 hs o 2 puntos y el tiempo no fue suficiente, tengo un nuevo parámetro para saber que la próxima vez que tenga algo de complejidad similar, me llevará más puntos y horas.

Ese mismo parámetro me va a servir para estimar el esfuerzo para pruebas sobre algo de menor complejidad.

---

## ¡MANOS A LA OBRA! 

### Ejercicio #1

- Estimar en puntos y en horas los planes de prueba que preparaste en ejercicios anteriores. Elige el plan de prueba con el que más cómodo te sientas, dentro de los que ya hayas realizado, para estimar los puntos.

- Para tu estimación en puntos podes usar la escala que consideres más útil.

- En cada caso justifica con un breve comentario tu estimación: ¿Por qué elegiste esa escala? ¿Qué factores tuviste en cuenta?


---

### Ejercicio #2

**Peer review**

Entrega tu plan de pruebas priorizado junto a las estimaciones y comentarios realizados a un compañero.

A cambio recibirás el plan de pruebas de algún otro compañero. Revisalo críticamente utilizando la siguiente estructura de análisis:

Casos que agregarías / quitarías

Prioridades que modificarías.

Estimaciones que ajustarías

Ediciones en la redacción de los casos de prueba para que pueda ser ejecutado por otra persona.

Preguntas (en caso de que aplique)

Cualquier otro comentario que consideres relevante.

Comunica tus inquietudes y observaciones de manera constructiva y recuerda que los comentarios no son personales sino al ejercicio que se está analizando.

---

## :book:  MATERIAL DE LECTURA   Manejo de defectos

#### Breve repaso:

En encuentros anteriores definimos al error como “error humano”, al defecto como la consecuencia de un error que podría causar que el sistema falle, o no (a veces los defectos duermen en el sistema sin ser encontrados, sin causar una falla visible o inclusive se confunden con funcionalidades desarrolladas adrede) y a la falla o fallo, como la aparición de un resultado que no es el esperado (es decir la consecuencia de un defecto).
 
También definimos la calidad como el grado, en el cual un componente, sistema o proceso cumple con los requerimientos especificados y/o con las necesidades y expectativas del usuario o cliente (según la definición del ISTQB)

Finalmente mencionamos que el área de calidad (QA / testing) tiene como objetivo comprobar que un sistema en particular es efectivo, eficiente y funciona correctamente ( en la mayor medida posible). 
Uno de los objetivos del testing,  es asegurar que requerimientos funcionales y no funcionales claves sean analizados antes de que el sistema entre en servicio. Es decir, que cualquier defecto sea reportado al equipo de desarrollo para su corrección.

El testing por sí solo no eleva la calidad, pero contribuye a la mejora de la misma ya que al identificar y comunicar los defectos encontrados, permite que su corrección sea posible.

**Entonces básicamente debemos encontrar defectos para corregirlos y mejorar la calidad del producto.**

Cómo explicamos a lo largo de los primeros módulos, podemos encontrar defectos en todas las etapas del ciclo de vida de desarrollo de software.
 

### ¿Cómo se reportan los defectos encontrados en cada etapa?

Generalmente cada grupo de trabajo o empresa debe tener:

- Un proceso de gestión de defectos definido y compartido por los miembros del equipo (en caso de que no exista tal proceso es imprescindible definir uno)

- Reglas para la clasificación de defectos encontrados.

Es clave que el proceso de gestión de defectos sea conocido y acordado por los miembros del equipo así como también deben existir acuerdos sobre la clasificación de severidades para los defectos.

Esto último, es importante para que los miembros del equipo sepan reaccionar al tipo de defecto reportado y que el proceso de análisis y corrección de defectos sea fluido y sin trabas.
 
El proceso podría ser muy informal, muy formal o una mezcla de informalidad/formalidad.

### ¿NECESITAS UN EJEMPLO? 

Podría ser que los defectos encontrados en la etapa de análisis de documentación se revisaran o reportaran en reuniones o vía email o chat interno y que no hubiera mucha trazabilidad para ese tipo de defectos. Y que para los defectos encontrados en la etapa de testing dinámico (ejecutando las pruebas en el sistema en funcionamiento) hubiera una herramienta para reportar defectos y que, por lo tanto, hubiera mucho mayor nivel de trazabilidad para ese tipo de defectos.
 
La buena documentación y la trazabilidad pueden ser grandes ayudas para la eficiencia y el orden en el ciclo de vida de desarrollo.
Es recomendable primero, conocer y adaptarse a la organización en la cual nos sumamos a trabajar y con el tiempo, luego de conocer las ventajas y los gaps del proceso actual, proponer mejoras.

#### ¿Todo lo que nos reportan es necesariamente un bug? ¡No!

Ya dijimos que podemos identificar defectos a lo largo de todo el ciclo de vida de desarrollo.

En el mejor de los casos, encontramos los defectos durante las etapas de testing estático o dinámico y prevenimos que se trasladen a los ambientes productivos.
 
También podría pasar,  que algún defecto pase el filtro de nuestras pruebas y que un usuario final, otro usuario del sistema u otro equipo de desarrollo encontrara algún comportamiento inesperado y nos lo reportara.
 
En esos casos, como siempre, es importante mantener la mirada crítica.
No todo lo que nos reportan como defecto necesariamente lo es.
Inclusive aunque lo que nos están reportando suene muy feo, podemos y debemos hacernos las siguientes preguntas:

1. El comportamiento que nos reportan: ¿es realmente un comportamiento inesperado? ¿Es efectivamente un comportamiento diferente de lo que estaba definido en la especificación para esa funcionalidad? ¿Es sobre una funcionalidad que soportamos?

2. ¿Es un error de configuración? ¿Falta de permisos? ¿Error de uso?

3. ¿Se trata de un comportamiento resultado de un escenario o caso de uso que no había sido tenido en cuenta cuando se diseñó y desarrolló el sistema? ¿Es sobre una funcionalidad que no soportamos?

La primera pregunta es la que nos debemos hacer.

**Es muy común que un usuario final reporte como comportamiento inesperado, defecto o bug algo que no lo es**

#### ¿NECESITAS UN EJEMPLO? 

- Un usuario final quiere hacer algo que el sistema sí permite hacer pero con su rol de usuario no puede.

- Un usuario final quiere hacer algo que el sistema sí permite hacer pero no sigue los pasos correctos para hacerlo.

- Un usuario final quiere hacer algo que el sistema sí permite hacer, pero la configuración necesaria no está encendida / habilitada.

- Un usuario final está intentando hacer algo que el sistema no permite hacer porque la funcionalidad no fue solicitada al momento del diseño. En las especificaciones del sistema está claro que dicha funcionalidad no es soportada por el sistema.
 
#### Veamos algunos escenarios:

- Si la respuesta a la pregunta 1 es positiva  y las respuestas a las preguntas 2 y 3 son negativas: Estamos en presencia de un defecto que hay que reportar.

- Si la respuesta a la pregunta número 1 es negativa y la respuesta a la pregunta número 2 es positiva, estamos frente a un comportamiento inesperado o quizás frente a un error de configuración, no frente a un bug o defecto.

- Si la respuesta a las preguntas número 1 y 2 es negativa, probablemente la respuesta a la pregunta número 3 sea positiva. En este caso estaríamos frente a un gap de definición. Algo que no se tuvo en cuenta cuando se diseñó el sistema está generando un comportamiento poco amigable o errático porque se trata de algo que no se tuvo en cuenta y por lo tanto, no se definió ningún comportamiento asociado..

Es muy útil revisar estas preguntas y sus sutiles diferencias ya que nos ayudan a priorizar y a manejar expectativas con los usuarios finales en algunos casos.
 
### ¿NECESITAS UN EJEMPLO? 

El dueño de una pequeña empresa nos solicitó el desarrollo de un sistema de gestión de alquileres.

Nos reporta -como bug o defecto crítico de prioridad muy alta- que el sistema no lo está dejando ingresar alquileres con fechas pasadas.


¿Traslado esa inquietud al equipo de desarrollo sabiendo que dejarían sus tareas para dedicarse al análisis y corrección del código permitiendo el ingreso de alquileres con fechas pasadas? ¿Qué les parece?

Veamos…

Este podría ser un procedimiento a cumplir:

![image](https://user-images.githubusercontent.com/72580574/229879479-d88f326e-76b9-4c7e-812d-01a6e86db18e.png)

De esta manera sabemos con certeza que aquello que fue reportado como crítico y de prioridad muy alta, realidad  no es un defecto.


---

-> **Tip de la industria**: Cuando trabajamos en el desarrollo de sistemas para clientes es crucial tener muy en cuenta qué es lo que estaba dentro del alcance (scope) del sistema y qué no. De este modo, evitamos que ingresen “por la ventana” pedidos urgentes para crear funcionalidades nuevas. Evitamos agregar tareas y delays innecesarios en el ciclo de desarrollo.


---

-> **SUPER TIP**: Los pedidos de funcionalidad nueva deberían involucrar a las personas correspondientes (business analyst / analista funcional / dueño de producto) y atenerse al procedimiento correspondiente según el ciclo de vida de desarrollo en uso (análisis, documentación, etc).

---

### ¡Encontré un defecto! ¿Cómo lo reporto?

A continuación, les presentamos las características comunes de un informe o reporte de defecto. Puede ser llamado incidente, informe de incidente o incidencia.

1. 	**Id**: Todo proyecto debe incluir un identificador único. En caso de no contar con una herramienta de gestión de defectos que asigna un id automáticamente, se sugiere agregar uno de forma manual para ofrecer trazabilidad.

2. 	**Título**: El título del reporte de defecto debe ser conciso y descriptivo de tal manera que podamos reconocer cada defecto solamente leyendo el título.

3. 	**Descripción**: La descripción amplía la información del título pero debe ser concreta y descriptiva.

4. 	**Ambiente**: Describir el ambiente donde se reproduce el comportamiento inesperado. (ambiente de desarrollo, de testing, productivo). Si es un ambiente productivo de un cliente particular: su nombre y/o materialesdeconstruccion.prod.com

5. 	**Versión**: La versión de desarrollo en la cual se observa el comportamiento. Ejemplo: 2.1 o 2.1-beta. 2.3-alpha, etc

6. 	**Pasos para reproducir**: Estos pasos deben ser cortos y concretos. Una lista con instrucciones para que el desarrollador o cualquiera que revise el reporte pueda reproducir el error.

7. 	**Comportamiento obtenido**: Descripción del comportamiento no esperado que se obtiene (el defecto que se intenta reportar)

8. 	**Comportamiento esperado**: Descripción de cómo se debería comportar el sistema en realidad.

9. 	**Evidencia**: Captura de pantalla o imagen que evidencien el error (no siempre es posible conseguir una)

10.  **Error logs**: Si tenemos alguna herramienta de captura de registros de error e identificamos un log de error que aparece cada vez que ocurre el fallo, agregamos esa información al reporte.

También podría ser algún mensaje de error que aparece en la consola del explorador. Ejemplo: (click derecho > inspeccionar).

![image](https://user-images.githubusercontent.com/72580574/229879792-0d136b0e-b18f-4cff-866f-96e2d3fad984.png)

11. **Fecha**: Si no usamos ninguna herramienta de gestión de defectos (que guardaría la fecha automáticamente) deberíamos registrar la fecha de manera manual.

12.  **Severidad**: Cuál es la severidad del defecto que estamos reportando.

13.  **Referencias**: Toda referencia útil: tipo de versión, caso o historia de usuario que introdujo el defecto. En caso de otros reportes similares (que podrían ser defectos duplicados) lo registramos (y relacionamos los casos de ser posible)  

### ¿NECESITAS UN EJEMPLO? 

![image](https://user-images.githubusercontent.com/72580574/229880220-13ff4228-59d2-4cc4-bd08-41bf1c543ee5.png)

![image](https://user-images.githubusercontent.com/72580574/229880283-f3da71d1-5397-4409-b319-033bdc3cd2e3.png)


---

## :star: Severidad

Es muy probable que cada empresa tenga sus definiciones y nomenclaturas internas para identificar la severidad de los defectos.

Una terminología común para identificar severidad es:

- Crítica / Critical

- Alta / Major

- Baja / Minor

- Muy baja / Nominal / Trivial


Generalmente un defecto de severidad crítica sería uno que bloquea la operatividad del sistema. Uno que impide el cumplimiento del principal objetivo del sistema. Un ejemplo podría ser el sistema caído o inutilizable o inaccesible para todos los usuarios.

Un defecto de severidad alta podría ser uno que bloquea algún aspecto o proceso crítico principal del sistema y que no tiene workaround (es decir, no hay otra manera de completar el proceso o cumplir con el aspecto comprometido siguiendo un camino alternativo)

Un defecto de severidad baja sería uno que no afecta a todos los usuarios o a un proceso o aspecto clave. Si bien afecta un área clave, hay alternativas de llevar a cabo el mismo proceso o de completar la tarea.

Nominal o trivial en términos del sistema no afecta ni impide ninguno de sus aspectos principales.
 
Las definiciones y límites concretos entre la clasificación de severidad pueden variar.
 
A continuación les ofrecemos algunas preguntas para identificar la severidad de cada defecto:

- ¿Afecta a todos los usuarios del sistema? ¿A todos los usuarios de un Rol o tipo? ¿a un usuario específico?

- ¿Sucede siempre? ¿Sucede solamente a veces o de manera aleatoria? 

- ¿Sucedió una única vez? ¿Cuándo?

- ¿Bloquea algún proceso clave del negocio / para los usuarios finales?

Estas preguntas son clave, porque te van a ayudar a comprender la severidad de cada defecto, independientemente de la terminología sobre severidad utilizada. Las respuestas a estas preguntas serán útiles para el análisis del defecto.

Si un comportamiento inesperado afecta solamente a los usuarios que tienen un rol específico, podría investigar los permisos de dicho rol… ¿le falta alguno? ¿Tiene asignados todos los necesarios pero quizás hay uno que no está funcionando correctamente?.

Si un comportamiento inesperado se dio una sola vez en cierta fecha y hora concreta, podría revisar si en ese momento sucedió algo relacionado a la performance del sistema. ¿Hubo alguna sobrecarga en ese horario? ¿El servidor se cayó? 

Como verán las preguntas nos llevan a un profundo análisis.



---

## Ejercicio #3

Para cada uno de los siguientes escenarios o reportes:
Analiza y decide si se trata de un bug, un comportamiento esperado,  una funcionalidad no soportada, un error de configuración.
Justifica brevemente tu respuesta.

Si no estás seguro como para decidir escribe las preguntas que harías para confirmar de qué se trata.
Genera el reporte de bug para aquellos casos que identifiques como tal.

Disclaimer: En este ejercicio se está simulando reportes como si fueran de la vida real. Generalmente cuando nos reporta algo un cliente, el reporte suele venir con información escasa y hay mucho por inferir o preguntar por parte de quien recibe el reporte.


 

![image](https://user-images.githubusercontent.com/72580574/229880600-0ed45070-b426-494e-8b64-cfbc15062936.png)


![image](https://user-images.githubusercontent.com/72580574/229880669-44e51b33-a268-43a1-bfa9-9df137467b83.png)

## SOLUCION

![image](https://user-images.githubusercontent.com/72580574/229880759-c2f1991b-37e2-4942-bd7e-0e6ebd2d4375.png)

![image](https://user-images.githubusercontent.com/72580574/229880820-6410ee04-5974-496f-a255-8d9c4e555b24.png)

![image](https://user-images.githubusercontent.com/72580574/229880878-c23a6641-91ea-4f34-a495-09f6be9828da.png)


![image](https://user-images.githubusercontent.com/72580574/229880933-cb44df8c-1bf7-4919-b6c0-da6de73f3259.png)

---

## :star: Métricas y reportes

### Métricas
 
Las métricas se usan para tener un seguimiento del progreso de las actividades de prueba a lo largo del proceso hasta su fin.

Además dan  visibilidad sobre el progreso e intentan medir calidad, adecuación y efectividad. Para esto se generan reportes sobre aspectos tales como:
        	
- % del trabajo planificado completo

- % cobertura de los requerimientos (coverage, cobertura de pruebas de cada aspecto o funcionalidad clave)

- Ejecución: Cantidad de casos de pruebas ejecutados y no ejecutados

- De los casos ejecutados, cantidad de casos que dieron como resultado Pass / Fail

- Densidad de defectos encontrados (podría ser por funcionalidad o módulo)

- Cantidad de defectos encontrados y corregidos / no corregidos
Cantidad de defectos que volvieron a bug fixing luego de ser testeados

- Cantidad de veces que un defecto corregido tuvo que volver a ser corregido luego de ser testeado


Otros indicadores de performance, también conocidos como KPIs (Key Performance Indicators) podrían ser:

1. Tiempo en RFT → Promedio de tiempo que tarda un defecto corregido en comenzar a retestear (¿cuánto tiempo tardó un bugfix en empezar a testearse?)

2. Testing → Promedio de tiempo que lleva el testing de cada defecto corregido (¿cuánto tiempo tardó en testear el fix de un bug?)

3. Tiempo en assigned to QA → Promedio de tiempo de espera hasta el análisis de un defecto reportado (¿cuánto tiempo tardo en agarrar el bug que me reportaron?)

4. Tiempo de bug analysis → Promedio de tiempo de análisis de un defecto que se comenzó a analizar (¿cuánto tiempo se tarda en analizar un bug que me reportan?)

En general estas métricas son asumidas por el manager del equipo durante el proceso de ejecución de pruebas y al finalizar el proceso (podría ser durante y al final de cada ciclo de desarrollo).

La metodología para generar reportes depende de cómo y con qué herramientas se registren y documenten los planes y casos de pruebas,la ejecución de casos, los defectos encontrados, etc.
En general los sistemas para manejo de pruebas tienen integrados reportes que se pueden centralizar en tableros o dashboards para una fácil visualización del progreso y sus resultados finales.

## Reportes

### ¿NECESITAS UN EJEMPLO? 

A continuación se muestran algunos reportes de un Dashboard de Jira integrado a Zephyr scale:

![image](https://user-images.githubusercontent.com/72580574/229881397-328c0388-9869-4b2c-bb1d-3f572ff8cb1a.png)


![image](https://user-images.githubusercontent.com/72580574/229881436-2347aaf1-712a-4198-8189-7504fbfd3f4e.png)


![image](https://user-images.githubusercontent.com/72580574/229881547-92c1473f-fc53-4728-b171-22601439d45f.png)


![image](https://user-images.githubusercontent.com/72580574/229881602-98320792-2e9e-4531-9d37-fefc27342019.png)


![image](https://user-images.githubusercontent.com/72580574/229881651-4f400951-c2c1-4c5b-8140-0713e010cc1f.png)

---

**Secreto de la industria 1**: Este tipo de reportes no suelen ser definidos ni creados por los testers manuales, si no por managers.
Sin embargo creemos que es importante para tu labor diaria saber que se están tomando estas métricas del trabajo diario.

---

## Ejercicio #4
Si quieres eres cur
ioso y quieres profundizar,  puedes pasar a Zephyr scale algún plan de prueba que hayas diseñado e investigar -en la herramienta- cómo crear estos reportes y dashboards.

Si estuviste usando Excel y te sientes más cómodo con esa herramienta, puedes crearlos allí.

---

## ¡Hora de cerrar! 

¡Han dado lo mejor! Felicitaciones ¿Tienen dudas? No olviden nuestra comunidad de prácticas, la encuentran en Discord, siempre dispuesta a la cooperación. 

¡Llegó el momento de los pulsos. ¿Te gustaría recibir? Demuéstrales a tus compañeros qué estás presente para promover su aprendizaje y el tuyo también.

---
