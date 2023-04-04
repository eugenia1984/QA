# :star: Análisis, planificación y ejecución de pruebas II

---

ENCUENTRO 8 / 20

---

## Introducción

**¡Te damos la bienvenida a tu octavo encuentro de trabajo!**

A partir de ahora ya no tendrás marcado el uso de los tiempos ya que has adquirido progresivamente la suficiente autonomía como para administrarlo tú mismo. Por supuesto que podrás ir conversando con tu equipo para ver qué tal vienen a medida que vayan avanzando con el contenido de hoy.

Podrás notar que las guías comienzan a tener más páginas o se complejizan ¡Ten calma! Ya eres un experto gestionando los tiempos. Además, encontrarás que a veces hacemos breves repasos de temas ya vistos y que los tópicos y ejercicios están acompañados de imágenes. 

Continuemos con los temas iniciados el encuentro anterior.

---

## :book: MATERIAL DE LECTURA 

### Prioridad: Impacto y riesgo

¿Por qué es tan importante saber priorizar?

Testear todo es imposible, sería una actividad infinita. Por esa razón tenemos que identificar para cada sistema que testeamos (y para cada contexto) qué testear y qué no. 

Además debemos analizar:

- Qué testear primero

- Qué pruebas son imprescindibles

- Cuáles son deseables pero prescindibles.

Con el objetivo de alcanzar un nivel de calidad aceptable para el sistema que estamos testando en cada caso, tendríamos que tener en cuenta qué testear y en qué orden.

Se debe comenzar con las pruebas más importantes. Suena obvio. Pero, ¿cómo identificamos cuáles son las pruebas más importantes para cada sistema y contexto particular?

El objetivo de probar lo más importante primero es asegurar que lo crucial del sistema está cubierto aun cuando no hayamos llegado a ejecutar todo nuestro plan de prueba.


#### Entonces…

¿Qué es crucial de un sistema? ¿Cuáles son las funcionalidades claves? Claramente las respuestas a estas preguntas varían de sistema en sistema. No serán las mismas las funcionalidades principales de un home banking, de un software, de un scanner, de una casilla de correo electrónico, de un chat o un videojuego.

Las funcionalidades claves del sistema:

- Dependen del sistema en sí

- Probablemente estén descritas en los requerimientos o especificaciones del sistema.

- Podrían ser las que le interesan al usuario final del sistema o las que nuestros stakeholders indiquen.

- Podrían ser aspectos generales de calidad relacionados a la performance.
 
 - Se analizan proyecto a proyecto.

#### ¿NECESITAS UN EJEMPLO? 

En un sistema de envío de emails, la funcionalidad principal seguramente sea el envío y recepción de correos electrónicos. 

Es muy probable que otros aspectos de calidad con igual nivel de importancia como la funcionalidad principal existan, tales como aspectos relacionados a la seguridad. 

Un sistema de envío de emails podría tener otras funcionalidades tales como el ordenamiento de correos en diferentes carpetas, la creación de etiquetas, la creación de múltiples bandejas de entrada entre otras.

Todos los aspectos funcionales y no funcionales deben testearse. Pero en el orden de ejecución tendría sentido que primero se lleven a cabo las pruebas que revisen los aspectos claves que afectan la calidad de ese sistema. Lo que de ningún modo debería fallar. 

Es decir, todo aquello que en caso de fallar tuviese un impacto grande, debería ser testeado exhaustivamente.


### ¿NECESITAS UN EJEMPLO? 

La desconfiguración del color de fondo personalizado guardado por el usuario podría ser algo cosmético y de bajo impacto si sucede en un sistema de envío y recepción de emails.
La desconfiguración del color de fondo personalizado guardado por el usuario podría ser algo de prioridad e impacto alto si sucede en un sistema de creación de páginas web (al estilo wordpress).

#### Es importante tener en cuenta:

- Cuáles son las funcionalidades esenciales del sistema que vamos a probar

- Qué funcionalidades le interesan a los stakeholders principales o a los usuarios finales del sistema

- Qué aspectos de calidad no funcionales deberían estar cumplidos según la especificación del sistema (seguridad, performance, portabilidad, etc)

-> Las dos palabras claves a la hora de priorizar son impacto y riesgo

Veamos las definiciones oficiales (según la RAE):

- Riesgo: contingencia o proximidad de un daño.

- Impacto: Huella o señal que deja un impacto. / Efecto de una fuerza aplicada bruscamente.  

- Efecto producido en la opinión pública por un acontecimiento, una disposición de la autoridad, una noticia, una catástrofe. / Probabilidad de que ocurra un golpe o un efecto.

**Entonces**: Si un resultado inesperado - con alta probabilidad de que suceda- tiene impacto negativo, entonces se considera que el nivel de riesgo es alto.

Como mencionamos anteriormente, no todo resultado inesperado genera un impacto negativo - Recuerden el ejemplo de los bug-features... bugs que suelen confundirse con funcionalidades diseñadas adrede

**Seamos conscientes y testeamos exhaustivamente y conciente aquellos escenarios de alto riesgo.**

---

-> **SUPER TIP**: Generamos pruebas para verificar que el sistema se comporte de la manera esperada como se definió en las especificaciones del sistema. Si encontramos comportamientos inesperados, generalmente los reportamos al equipo de desarrollo para que corrijan el defecto que dio lugar al comportamiento inesperado.

---

Cuando diseñamos nuestro plan de pruebas (junto al orden de prioridades o al orden de ejecución)  podemos encontrar algún bug. Es útil tener en mente las variables riesgo e impacto para dar la prioridad correcta a cada caso.


#### ¿NECESITAS UN EJEMPLO? 

Supongamos que tenemos que probar una aplicación de calendario que debe permitir al usuario final visualizar sus tareas y citas en su celular y en su laptop.

Como analista de calidad sé que debo asegurarme de que los aspectos “privacidad y confidencialidad” están bien cubiertos. Por todo esto, además de probar que las funcionalidades principales de la aplicación se comporten de la manera esperada (creación de eventos y tareas, visualización del calendario sincronizado en diversos dispositivos), también deben  agregarse pruebas para asegurarse que:

- Solo el usuario -dueño del calendario o con permisos de acceso al calendario- puede manejar el sistema

- Los eventos creados en un calendario privado no son encontrables o visibles en otros puntos de entrada.

Es útil definir un criterio de salida (aka completion criteria). Es decir, un criterio que nos ayude a saber cuándo es seguro parar de testear.

Las prioridades y el criterio de salida nos dan la base que guía la planificación. Nos permiten saber cuánto hay que testear para alcanzar los niveles de calidad acordados.

**The most important tests Will still be those that have already been done whenever we stop (ISTQB guide).**

---

## ✋ ¡MANOS A LA OBRA! 

### ✋ Ejercicio #1

Diseñá los planes de pruebas que usarías para testear las aplicaciones de ejemplo que aparecieron en este artículo (Sistema de envío de emails/Aplicación de calendario). Para el plan de pruebas es suficiente con generar una lista con los casos de prueba escritos en orden de prioridades.

Para cada caso de prueba indica:

- Id

- Título

- Descripción

- Precondiciones (si aplica)

- Datos de entrada (si aplica)

- Pasos

- Comportamiento esperado

- Prioridad

- Comentario (si es necesario)


Si tu tiempo es justo puedes entregar una versión reducida que incluya:

- Id

- Título

- Descripción

- Comportamiento esperado

- Prioridad

- Comentario (si es necesario)

Para esta segunda versión deberías poder sintetizar y asegurar que el título sea conciso y descriptivo de tal manera que una persona que no conoce el sistema pueda ejecutar la prueba correctamente aún sin tener pasos ni los datos de entrada.

#### SOLUCION

[Aca ver respuestas](https://docs.google.com/document/d/1zYHWG0AYF2epuPMW8R9ACmVAMOVwdQmEBpiXD2AcjfQ/edit)

---

##  ¡Hora de cerrar! 

Finalizamos el encuentro de hoy. ¿Dudas? ¿Sugerencias ? ¿inquietudes? En Discord podrás realizar los comentarios que desees. Busca y ofrece cooperación. ¿Estás preparado/a?


---
