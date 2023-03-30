# :star: ENCUENTRO 3 / 20

---

## ⏰ 10 minutos

## :star: Introducción

**¡Te damos la bienvenida a tu tercer encuentro de trabajo!**

Seguramente conoces la dinámica de trabajo, es aquella que te permite presentarte y conocer gente increíble. Juntos construyen una gran red de profesionales dispuestos a colaborar.
Recordá ofrecerles pulsos a quien haya hecho un gran trabajo de cooperación con tu aprendizaje o con el del equipo. No olvides que es tu oportunidad para destacarte y conseguir tus propios pulsos. ¡Ya sabes lo que tienes que hacer!

¡Demos comienzo a la actividad del día de hoy!

-Presentación del equipo:

Toma tan solo unos minutos y cambia la experiencia de todo el equipo. Indica tu nombre y de dónde vienes.

Si lo creen necesario, aquí les dejamos una pregunta para abrir la sesión:

¿Cuál es el desafío más importante del área QA? 

Utilicen unos 10 minutos para compartir estas breves presentaciones. ¿Opinan todos de la misma manera?

---

## ✋ Ejercicio #1

Comencemos activando algunas ideas previas. Ready? Set? ¡Go! Responde V o F según corresponda y justifiquen la respuesta.

a) El testing pone de manifiesto la presencia, no la ausencia de defectos

b) El testing exhaustivo no es posible

c) Las testing temprano ahorra tiempo y dinero

d) El testing depende del contexto

e) La ausencia de errores es una falacia

Solución → ¿Cómo les fue? sus respuestas fueron acertadas? ¿Alguna de las afirmaciones generó inquietud? ¡Recuerden que pueden solicitar un mentor cuando deseen!

![image](https://user-images.githubusercontent.com/72580574/228079428-33466e73-57ba-44bd-b1a5-08e3bd92fa4a.png)


---

### ¿NECESITAS UN EJEMPLO? 

Te proponemos el siguiente desafío para que converses con tu equipo del día.

¿Estás preparado? ¡Es hora de interpretar el rol de TESTER!


- ¿Podemos comprobar (y asegurar) que un software tiene cero defectos? ¿Es viable? ¿Se les ocurre algún ejemplo?

- Si quisiéramos testear de manera exhaustiva la creación correcta de un password que contenga: al menos 8 dígitos, una letra mayúscula, una letra minúscula, un número y un símbolo, cuantas combinaciones deberíamos probar? ¿Cuántos casos de prueba serían? ¿Cuánto tiempo asignaríamos a esa tarea? ¿Valdría la pena documentar y ejecutar esa cantidad de pruebas? ¿Cómo se cubre la funcionalidad “crear password”?

- ¿En qué momento sería menos costoso detectar defectos en el software? ¿Durante la etapa de desarrollo o durante las etapas de testing?

- ¿Cómo evaluarías el riesgo asociado a una funcionalidad a testear?

Seguramente habrán llegado a varias conclusiones. Al finalizar el encuentro haremos una puesta en común de las preguntas 1 y 3. 


---

## :book: MATERIAL DE LECTURA 

### ¡Los 7 principios de testing!

Los principios o reglas -en cualquier disciplina- orientan, estructuran y guían metodologías de trabajo. Es decir, nos ayudan a orientar la práctica profesional. 
Les presentamos los 7 principios del testing:

![image](https://user-images.githubusercontent.com/72580574/228079643-a05baec4-9863-43fc-9010-475e094c07d5.png)


Analicemos cada uno de ellos en profundidad.

## :stars: 1 - El testing pone de manifiesto la presencia -no la ausencia- de defectos

A través de las pruebas es posible encontrar defectos, visibilizarlos y evidenciarlos. Sin embargo, es IMPOSIBLE confirmar la INEXISTENCIA de algún defecto silencioso, no descubierto en pruebas o validaciones.

Nunca puede determinarse la “ausencia total de fallos”.

#### ¿NECESITAS UN EJEMPLO? 

En ocasiones los fallos se dan por razones no funcionales: 

**Secreto de la industria 1**: Un sitio web podría fallar por razones relacionadas a la seguridad (fue hackeado). También puede fallar por razones de performance, por ejemplo no soportar la carga/ tráfico de usuarios.


---

## ✋ ¡MANOS A LA OBRA! 

### ✋ Ejercicio #2

Teniendo en cuenta los siguientes sistemas:

- Un portfolio de obras de arte digital 

- Un registro de personas. Este sistema guarda datos personales y permite que cada usuario ingrese con diferentes niveles de acceso según el tipo de clave.

Enumeren - según orden de prioridad- las siguientes condiciones de prueba:

1. Que todas las fotos tengan texto alternativo

2. Que los formularios usen metodología de envío POST

3. Que el título principal `<h1>` este en el color definido en el mock up

4. Que los párrafos <p> estén escritos en letra roboto 

5. Que no se pueda ingresar nadie que sin cuenta creada previamente

6. Que el usuario que  ingresa pueda ver aquello con lo que se corresponde su nivel de acceso.

7. Que el contraste de colores sea suficiente como para que cualquier persona pueda leer los textos e instrucciones, aún aquellos con problemas de visión

8. Que el sitio  pueda leerse y ser navegable con  un lector de pantallas (screen reader)

9. Que las imágenes estén alineadas según la maqueta o mockup.

Pueden descargar la siguiente plantilla para realizar esta actividad
  
  ![image](https://user-images.githubusercontent.com/72580574/228080046-9c4bfe72-5e72-4478-8ba9-4b9134decd14.png)

  
  ![image](https://user-images.githubusercontent.com/72580574/228080077-a659877f-a21b-45ff-9839-e16f2ddd8427.png)

 ### RESPUESTAS
  
  
 
->> En un portfolio 

  Por orden de prioridades:

1. Que las imágenes estén alineadas según la maqueta o mockup

2. Que el título principal `<h1>` este en el color definido en el mock up

3. Que todas las fotos tengan texto alternativo

4. Que los párrafos <p> esten escritos en letra roboto 

5. Que el contraste de colores sea suficiente como para que cualquier persona pueda leer los textos e instrucciones, aunque tengan problemas de visión

6. Que el sitio entero pueda ser leído y navegado con un lector de pantallas (screen reader)

7. Que los formularios usen metodología de envío POST

(No Aplica) Que no se pueda ingresar nadie que no tenga una cuenta creada previamente

(No Aplica) Que la persona que se ingresa pueda ver solamente las cosas que correspondan a su nivel de acceso

Las pruebas de login no aplican a una página web de tipo portfolio que generalmente no tiene un sistema de creación de usuarios ya que es solo para mostrar contenido.


-> Un sistema del gobierno de registro de las personas.

1. Que no se pueda ingresar nadie que no tenga una cuenta creada previamente

2. Que la persona que se ingresa pueda ver solamente las cosas que correspondan a su nivel de acceso

3. Que los formularios usen metodología de envío POST

4. Que el sitio entero pueda ser leído y navegado con un lector de pantallas (screen reader)

5. Que el contraste de colores sea suficiente como para que cualquier persona pueda leer los textos e instrucciones, aunque tengan problemas de visión

6. Que todas las fotos tengan texto alternativo

7. Que el título principal <H1> este en el color definido en el mock up

8. Que los párrafos `<p>` estén escritos en letra roboto 

9. Que las imágenes estén alineadas según la maqueta o mockup


En un sistema del gobierno que debería poder ser usado por la ciudadanía general van a ser más prioritarias las pruebas de acceso seguro y las de navegabilidad y accesibilidad para personas con capacidades diferentes (que los lectores de pantalla puedan navegar) y con menor prioridad las pruebas de look and feel. 



---
  
### :stars: 2 -  El testing exhaustivo es imposible
  
Mientras usamos un sistema pueden ocurrir diversas situaciones. Algunas serán propias del contexto y/o del espacio en donde vivimos y otras inherentes al software.

### ¿NECESITAS UN EJEMPLO? 
  
Estás comprando un pasaje en micro on line. Luego de seleccionar empresa, fechas de viaje, y reserva de asientos debes completar el formulario de pago para abonar con tu tarjeta de crédito. En ese momento suena el teléfono y mantienes una conversación de 20 minutos. Al finalizar vuelves a la página del sitio y decides terminar de completar el formulario-

####  ¿Qué sucederá?
  
¿Se enviará el formulario correctamente al clickear “enviar”?
  
¿El sistema debería esperar media hora o varios días “abierto”? 
  
¿El sistema debería timeoutear y pedirme que vuelva a ingresar todos los datos de cero?

¿Es necesario que el equipo de desarrollo dedique esfuerzos en anticipar ese tipo de situaciones excepcionales?


**Veamos otros ejemplos**
  
¿Qué ocurre si me quedo sin conexión a internet mientras intento comprar entradas a un concierto? ¿La transacción debería cancelarse? ¿O almacenar los datos en mi perfil?

¿Y en el caso de una transferencia bancaria?


**Secreto de la industria **2:  En algunos casos puede que el comportamiento del sistema frente a una situación excepcional ni siquiera esté definido. Sobre todo si la probabilidad de que esa situación excepcional suceda es muy baja. 

En la mayoría de los sistemas  -a menos que sea extremadamente simple- es imposible testear todos las combinaciones de datos y escenarios. De hacerlo, podríamos poner en riesgo la eficiencia del plan de pruebas.
  
 Para seleccionar qué pruebas  testear y cuales no, hay que tener en cuenta los objetivos principales del sistema y los riesgos asociados al fallo de sus diferentes componentes.  

 
---
  
## :stars: 3 - El testing temprano ahorra tiempo y dinero
  
Luego de todo lo analizado, pareciera claro entonces que mientras más temprano comiencen las pruebas de testing, menos costoso será corregir los bugs encontrados. 
En ocasiones, si los tester tienen disponible el sistema para la revisión del plan de pruebas pueden encontrar menor cantidad de bugs en el código.

¡Pro tip alert! De ser posible, es bueno comunicar al equipo de desarrollo las pruebas que pensamos llevar a cabo.
Es probable que los desarrolladores - al tener una idea de los escenarios de prueba que prevemos, los consideren en su trabajo y por ende existan menos bugs.


Iniciando las tareas de testing y análisis con anticipación, evitamos que los errores que aparecen en las etapas tempranas del proceso de desarrollo migren a etapas más avanzadas.
La siguiente imagen los ayudará a graficar esta situación. 
  
  ![image](https://user-images.githubusercontent.com/72580574/228080718-baae98ba-8406-4ba9-8a31-4d44489cb697.png)


 
---
  
## :stars: 4 - Defectos agrupados

Es probable que la mayor cantidad de defectos se concentren en algunas áreas del sistema. Quizás en aquellas que revisten mayor complejidad o que fueron modificadas múltiples veces. También puede deberse al trabajo de desarrolladores con menor experiencia (solo por nombrar algunos factores)

Si bien es importante testear las áreas del sistema más conflictivas o que tiendan a tener defectos, esto no implica dejar de lado la ejecución de pruebas sobre otras partes que -a simple vista- parecen menos complejas. 

¿A qué área nos referimos ? ¿Cuáles creen que podrían ser aquellas en donde suelen agruparse más defectos?


---
  
## :stars: 5 - Pesticide paradox/ Paradoja del pesticida

¿Conoces la frase que se le atribuye a Albert Einstein: "Si buscas resultados distintos, no hagas siempre lo mismo”? 

Trasladamos el espíritu de la misma, a nuestro campo de estudio: repetir una y otra vez las pruebas no servirá para encontrar defectos nuevos. 

Las pruebas de regresión tienen por objetivo revisar que los cambios introducidos en el sistema no rompan lo que funcionaba correctamente. Para esto, es necesario revisar estas pruebas y asegurar que sean relevantes para los requerimientos nuevos. 
Si el sistema y sus funcionalidades van modificándose con el tiempo, las pruebas deben adaptarse a esos cambios. 

---
  
## :stars: 6 - El testing es dependiente del contexto

Qué tipo de pruebas implementar y cómo llevarlas a cabo dependerá de aquello que se está testeando.

Una aplicación web que permite el ingreso de datos personales requerirá más pruebas y foco en ciertos aspectos que un sitio web que sólo visualiza información.

Un sistema de navegación de un avión va a necesitar pruebas más exhaustivas que los dos sistemas mencionados anteriormente. 

---
  
## ✋ ¡MANOS A LA OBRA! 
 
### ✋ Ejercicio #3

¿Cuál crees que sea el factor que determina la cantidad de pruebas a realizar en un sistema? Discutan la respuesta en el equipo

---
  
## :stars: 7 - La ausencia de errores es una falacia

Que no se hayan descubierto errores en un sistema, antes, durante o al finalizar el testeo no implica que el sistema carece de bugs.

El testing busca que el sistema que revisamos alcance niveles de calidad y sea aceptable (según los criterios establecidos) además de cumplir con los requisitos solicitados al inicio del desarrollo del sistema.

---
  
## :book: MATERIAL DE LECTURA 
  
**¡Un esfuerzo más!**
  
Sabemos que el encuentro de hoy requiere de habilidades de lectura y concentración. Hoy debes focalizarse en aprender material teórico. ¡Vienes muy bien!
Te pedimos un esfuerzo más para conocer todo lo que queremos enseñarte.  Toma una pausa de 10 minutos si lo consideras necesario. Conversa con tus compañeros de equipo, respira, mueve tu cuerpo por un rato. Recarga energía para continuar.🧘💪🏻🧎

## :star: Proceso de testing
  
Un poco de contexto…
  
Ya sabemos que el testing es un proceso que no implica “hacer siempre lo mismo”. 
  
Las pruebas se realizan según la naturaleza del sistema o proyecto en el que se trabaja: qué, cómo y cuánto testear varía. Por otra parte, cada empresa u organización tiene procedimientos propios. 


La organización del proceso de testing dependerá de algunos factores tales como:
  
- Procesos, políticas y estándares propios de la empresa/organización en el que se trabaja.
  
- El tipo de metodología de desarrollo que utilice el equipo.
  
- El tipo de producto en desarrollo, es decir su dominio
  
- Los riesgos asociados al producto o sistema
  
- Tiempo y presupuesto
  
- La preponderancia del área para una organización.

Como hemos mencionado anteriormente, las actividades del área de testing son mucho más que solo “ejecutar pruebas”. Hay otras responsabilidades que debemos asumir. 

Algunas de ellas son: 

  - Planificación

  - Monitoreo y control

  - Análisis

  - Diseño

  - Implementación

  - Ejecución

  - Completitud (test completion)

Es común que en el proceso de testing haya iteraciones entre alguna de estas actividades. Además, el tipo de iteración se modifica según la  metodología de desarrollo en uso.

---
  
**Secreto de la industria 3**: No todas las empresas desarrollan estas actividades en su totalidad ni las nombran del mismo modo. Si ya trabajas como QA es probable que hayas realizado alguna de estas, conozcas su clasificación o no.
  
---
  
**Diversidad de perfiles:** Las habilidades para cada una de estas actividades, ¿serán similares? ¿Cuál elegirías para desarrollarte profesionalmente?

 
  
---

## Veamos en profundidad cada una de las actividades y responsabilidades:

  
- 1 - **Test planning. – planificación de las pruebas**


En la etapa de planificación se define cómo abordar y organizar las tareas relacionadas al testing durante el desarrollo del producto. Además se dividen las  funciones, responsabilidades y se asignan las tareas y se coordina la agenda de trabajo

En esta etapa se analizan y deciden la infraestructura y las herramientas para realizar las pruebas.

Atendiendo al tipo de producto con el que se trabajará (junto a otras variables tales como tiempo, presupuesto, etc) se decide y diagraman las actividades, tiempos, roles y criterios para identificar la completitud de las pruebas.  

Como toda etapa de planificación puede recibir ajustes en caso de ser necesario.


---
  
**Secreto de la industria 4**:  En una metodología de trabajo ágil, al comienzo de cada ciclo o sprint se planifican las tareas de desarrollo y se deciden qué historias de usuario ingresan. Para cada historia se realiza una estimación de tiempo (de manera grupal) que debe incluir el esfuerzo de testing.

---
  
- 2 - **Test monitoring and control – monitoreo y control de las pruebas**


Esta función implica monitorear el avance de las pruebas cotejando con los objetivos definidos en el plan de pruebas. En caso de que no se cumplan, deberán tomarse todas las decisiones necesarias para el logro de los mismos.

Es posible que en algunos proyectos sea necesario emitir “reportes de progreso”  e involucrar a las personas para que estén al tanto de los avances o en caso de ser necesario un ajuste en las acciones.

En todo caso es bueno tener a las personas involucradas que correspondan al tanto de los avances sobre todo cuando haga falta implementar algún tipo de ajuste para alcanzar algún deadline.

Es interesante tener en cuenta qué tipo de audiencia recibirá nuestros reportes. Esto nos permitirá incluir la información pertinente para cada uno. Seguramente, un cliente no recibirá el mismo reporte que el equipo de desarrollo.

---
  
- 3 - **Test Analysis - análisis**

La etapa de análisis consiste en revisar la base para los tests y para identificar qué es lo que hay que testear.

Incluye  revisar todo aquello que consideremos “insumo”: historias de usuario, casos de uso, requerimientos funcionales y no funcionales, especificaciones o specs, documentación funcional, diagramas, UMLs, hojas de implementación, tablas, reportes etc.

Estos, deben ser claros, precisos y consistentes (es decir, sin contradicciones).

De la revisión de todo lo disponible para análisis se identifica:

  - Qué testear

  - El orden de prioridades

  - Las condiciones a tener en cuenta

  - Los primeros defectos. 

Es importante (y muy útil) generar trazabilidad entre las condiciones identificadas para las pruebas y los elementos de la base para los tests (test basis) que dieron lugar a dichas condiciones. 

De esta manera, si algo se modifica conocemos con exactitud qué otros materiales deberían ajustarse también.

  
### ¿NECESITAS UN EJEMPLO? 
  
Como parte de los requerimientos, un cliente solicitó que cuando los usuarios se registren en su sitio, deben recibir un email automático con la siguiente leyenda “Bienvenido a nuestro sitio”. Es probable que tengamos un test que evalúe la condición mencionada. Es decir, un test que evalúe que el usuario recibe el mail indicado.

Supongamos que el cliente cambia de opinión y lo que en realidad desea es que cuando una persona nueva -que no se había registrado antes- se registra para asistir a un evento, se le envíe el siguiente mail: “Bienvenido a nuestro sitio”. Ahora bien, si esa persona (que ya estaba registrada) intenta hacerlo por segunda vez (quizás con otro mail, pero mismo ID, SSN, nro de pasaporte, etc) se le debe mostrar la siguiente leyenda  “gracias por volver. Por favor revisa la configuración de tu cuenta para corroborar que las notificaciones llegarán al email deseado” 

Además  si una persona (ya registrada en el sitio) lo hace para otro evento, las condiciones indican que se envíe otro mail con un contenido diferente, por ejemplo “Gracias por inscribirte al evento x”

---
  
## ✋ ¡MANOS A LA OBRA! 

### ✋ Ejercicio #1

Cuando se presentan cambios en la especificación, debemos  revisar y modificar las pruebas que ya  teníamos: ¿Qué cambiarían en la prueba? ¿Agregarían algunas? ¿cuántas? ¿cuáles?
Ofrezcan sus respuestas a un compañero. Al recibirla deberán comparar y proponer alternativas a esas respuestas (en caso de ser necesario).

Realicen una puesta en común en el equipo.
  
Pueden ver la solución aquí:

### SOLUCION
  
Ante el cambio en los requerimientos se debería: 

-A ) modificar la prueba que ya había diseñado

-B) agregar nuevas pruebas. 

Por ejemplo:

-A) La prueba existente:

- Envío de mensaje de bienvenida “bienvenido a nuestro sitio” para nuevo usuario registrado

- Podría modificarse como:

- Envío de mensaje de bienvenida “bienvenido a nuestro sitio” para usuario que se registra usando la opción “registrarse” [precondición: no debe existir otro ID / SSN / nro de pasaporte igual en el sistema]

-B) Nuevas pruebas:

- Envío de mensaje “gracias por volver, por favor revisa la configuración de tu cuenta para corroborar que las notificaciones llegarán al email deseado” 
para usuario que se registra usando la opción “registrarse” [precondición: debe existir otro ID / SSN / nro de pasaporte igual en el sistema] 
  
- Envío de mensaje “gracias por inscribirte al evento x” para usuario que se registra usando la opción “registrarse para el evento” [precondición: debe existir otro ID / SSN / nro de pasaporte igual en el sistema] 

- Mensaje de error “usuario ya registrado” en pantalla para usuario que intenta registrarse con un email ya registrado.

  
¿Cómo les fue?


---
  
## ✋ Ejercicio #2

¿Cuál es el costo de corregir defectos encontrados en la documentación en relación al costo de que avancen y lleguen a otras etapas del ciclo de desarrollo?

#### SOLUCION
  
El costo de encontrar y corregir defectos aumenta a lo largo del ciclo de vida de desarrollo. Cuanto más temprano detectemos, menor costo e impacto tendrá sobre el sistema y el presupuesto

  
![image](https://user-images.githubusercontent.com/72580574/228081897-c3cd1bcf-4dbc-4309-99a8-6d670f484e0f.png)

  
  
Hay algunas técnicas de testing que, sobre todo al principio de tu carrera, pueden ser útiles para esta etapa  ya que pueden ayudarte a visualizar condiciones para las pruebas que a simple vista no resulten tan obvias. Las detallaremos más adelante. 

---
  
**Secreto de la industria 5**:  En una metodología de trabajo ágil, se seleccionan las pruebas que deberían quedar como pruebas de regresión y se analizan si estas  deberían actualizarse o editarse. 

---
  
## :stars:  4 - Test design – Diseño de casos de prueba


En esta etapa profundizamos los detalles y definimos cómo se realiza el testeo. 
  
Se diseñan casos de prueba y grupos de casos de prueba para las condiciones identificadas en la etapa anterior. 
  
Cada caso de prueba debe explicitar:
  
- Los pasos para probar cada condición

- Los datos necesarios en caso de que sea necesario ingresarlos
  
- Los detalles a tener en cuenta para ejecutar la prueba concreta (tipo de usuario si es relevante para la prueba, registro sobre el cual se hace la prueba si aplica o si es relevante, etc) 

 - El resultado esperado de cada prueba. 

Se deben crear la cantidad de casos de prueba necesarios para probar cada condición. 

  
#### ¿NECESITAS UN EJEMPLO? 
  
Condición: “ Para pagos en efectivo, aplicar un 10% de descuento sobre el total de la compra” 

Esta condición podría dar lugar a tantos casos de prueba como métodos de pago existiesen al menos dos casos de prueba: 

 - A ) Se abona en efectivo y en el resultado se debe observar el 10% de descuento. 

-  B ) Se abona con cualquier método de pago (distinto al efectivo) y su resultado esperado NO incluye el. 

  
Es importante generar trazabilidad entre los casos de prueba creados en esta instancia y las condiciones para las cuales se está creando los casos de prueba. A su vez, los casos de prueba deben haber quedado vinculados a la base para los tests (nuestro insumo fundamental de análisis).

Creando casos de prueba también podríamos identificar escenarios para los cuales el resultado esperado no es claro.

#### ¿NECESITAS UN EJEMPLO? 
  
Estas son algunas de las preguntas que podríamos hacer:

¿Transferencia bancaria cuenta como pago en efectivo?
  
¿Tarjeta de débito cuenta como pago en efectivo? ¿Se aplica el descuento para alguno de esos métodos de pago? ¿Pago en efectivo es únicamente con billetes o mediante transacción personal?

  
---
  
**¡SUPER TIP!**  Lo ideal es tomar nota de todas las preguntas funcionales que nos surgen y comunicarlas de manera ordenada a quien corresponda. Sugerimos que todo el trabajo del tester esté documentado y registrado y la comunicación unificada mediante canales oficiales.

---
  
## ✋ Ejercicio #3

Analicen la descripción de requerimientos que se encuentra en el recuadro debajo. 
  
Identifiquen si la información está completa. 
  
Redacten las preguntas que consideren y decidan a quién se las harían.
  
Realicen una puesta en común en común.
  
Pueden ver la solución aquí:
  
  #### SOLUCION
  
  Algunas preguntas funcionales, :
  
¿Cuál es el criterio para considerar una venta mayorista o minorista?
  
Hay algún criterio para definir cuando se está vendiendo un rollo entero? ¿Es por cantidad de metros? O el artículo “rollos” de carga independientemente de la unidad “metros”?

---
  
Sitio: E-commerce de venta minorista y mayorista de telas por metro y por rollo. 

- El sitio debe permitir cobro por transferencia bancaria, tarjeta de débito y crédito.

- Debe enviar mensaje de confirmación de compra exitosa.

- Envío de email con listado de los items comprados, total de la compra, información de método de pago utilizado y estado del pago, link de tracking de envío. 

- Mensaje de pago rechazado

---
  
## SUPER TIP
  
High level test case – low level test case

Puede suceder que en ciclos de Desarrollo ágil (o trabajando con restricciones de tiempo) sea difícil escribir todos los casos de prueba con el detalle requerido para cada caso de prueba. 

Deberíamos entonces documentar al menos los escenarios de prueba (high level test case)  es decir los que corresponden a las condiciones diferentes que tenemos que probar. Esto se realiza escribiendo generalidades y evitando los  sets de datos específicos que deberían encontrarse en cada caso de prueba.
Como ventaja se encuentra el menor tiempo empleado y la utilización de este escrito como guía para no olvidar el testeo de ninguna condición del sistema. Si la ejecución de las pruebas la realiza otra persona con poco conocimiento en el sistema se lo considera esto no sería útil, entonces se lo considera  una desventaja. 


  
---
  
## :stars: 5 - Test implementation - implementación


En esta etapa (puede suceder de manera independiente o simultánea con las otras) se vinculan los casos de pruebas creados con  la ejecución de los casos de prueba (es decir con hacer correr las pruebas). 

Aquí analizamos si contamos con todo lo necesario para ejecutar las pruebas: 
  
¿Tenemos procedimientos de prueba creados y priorizados?
  
¿Hace falta crear algún script de automatización?
  
¿Tenemos suites de prueba en base a los procedimientos de prueba?
  
¿Hace falta crear alguna agenda de ejecución de suits de prueba para ser más eficientes en la ejecución?
  
¿Necesitamos y tenemos ambientes de prueba con configuraciones específicas para correr las pruebas?
  
  ¿Tenemos listos los datos y registros necesarios para correr las pruebas?
  
¿Hay trazabilidad entre todos los elementos que fuimos creando a partir de otros?
  
### ¿NECESITAS UN EJEMPLO? 
  
Casos de prueba: 
  
Probar que no puedo registrarme si ya tengo un usuario creado con el mismo email. 
  
En el ambiente de prueba debería tener el email que voy a usar creado en el sistema que voy a testear.  La precondición para mi prueba seria: “En el sistema ya hay un usuario creado con el email xxxx”

---

### ✋ Ejercicio #4

Teniendo en cuenta la solución del ejercicio anterior (e-commerce). ¿Qué revisarían en la etapa de implementación y qué información agregarían para cumplir con la ejecución?
Compartan con el resto del equipo. ¿Todos alcanzaron las mismas conclusiones?

#### SOLUCION

Teniendo en cuenta la  solución del ejercicio anterior ( e-commerce). ¿Qué revisarían de la etapa de implementación y qué información agregarían para cumplir con la ejecución?


¿Necesitamos y tenemos ambientes de prueba con configuraciones específicas para hacer correr las pruebas?
  
¿Tenemos procedimientos de prueba creados y priorizados?
  
¿Hace falta crear algún script de automatización?
  
¿Tenemos suits de prueba en base a los procedimientos de prueba?
  
¿Hace falta crear alguna agenda de ejecución de suits de prueba para ser más eficientes en la ejecución?
  
¿Tenemos listos los datos y registros necesarios para correr las pruebas?
  
¿Hay trazabilidad entre todos los elementos que fuimos creando?


Como mínimo deberíamos contar con: 
  
Un  ambiente de testing dado de alta que contenga los elementos que luego voy a usar para las pruebas: telas en stock, telas sin stock, algún usuario ya dado de alta, etc. 

Una matriz de prueba con los casos de prueba bien escritos.
 
---
  
## :stars: 6 - Test execution – Ejecución de las pruebas


Llamamos a esta es la etapa ecuación de las pruebas ya que es en la cual se “corren los tests” manualmente o con herramientas de ejecución de pruebas
Las suites de prueba se corren tal como se detallan en la agenda de ejecución.

Además es necesario:
  
Identificar la versión del sistema que se está testeando
  
Comparar el comportamiento obtenido con el comportamiento esperado para cada caso de prueba (cuando las pruebas corren de manera automática esto debería hacerlo el script creado para cada prueba) y registrar el resultado de cada una
(PASS / FAIL)
  
En el caso de falla de una prueba (es decir que el comportamiento obtenido no fue el esperado) se debe analizar si estamos ante la presencia de un falso positivo o si se encontró algún defecto. En ese caso, se reporta para su corrección.

  Revisar la trazabilidad y/o actualizar lo que corresponda (tracking)
  
Volver a ejecutar pruebas cuando corresponda (i.e.: luego de que corregir un bug)

Como resultado de esta etapa, pueden surgir los siguientes productos:
  
-Estado de cada test
  
-Passed

-Failed

-Blocked*

-Reportes de errores

---
  
###  ✋ Ejercicio #5

¿En qué situación un caso de prueba podría quedar marcado como bloqueado?

### SOLUCION
  
En qué situación un caso de prueba podría quedar marcado como bloqueado?

Podemos mencionar al menos tres situaciones:
  
Cuando un paso necesario para ejecutar el caso de prueba no puede llevarse  a cabo por algún defecto aún no resuelto. 
  
Cuando alguna condición necesaria para llevar a cabo el caso de prueba no puede implementarse por algún motivo (algo lo bloquea).
  
Cuando parte de la funcionalidad a probar aún no se implementó en el ambiente de testing. 


---
  
## :stars: 7 - Test completion


Esta etapa hace alusión a la finalización de la ejecución de las pruebas. También se la denomina “de completitud de las pruebas” 

En inglés las referencias a esta etapa se pueden encontrar como: test completion (completitud de las pruebas), completion criteria (criterio de completitud), exit criterio (criterio de salida), definition of done (definición de hecho).

Qué acciones reviste esta etapa:
  
Revisar que los defectos reportados estén cerrados o mover al backlog lo necesario (pedidos de cambio o reportes de bug).
  
Crear un reporte resumiendo los resultados de los tests.
  
Guardar y archivar el ambiente y la infraestructura para la ejecución de los tests que podría rehusarse a futuro.
  
Analizar si existe algún espacio de mejora en base a la experiencia del proceso terminado.

---
  
### ✋  Ejercicio #6


Pedidos de cambio o reportes de bug [change request / feature request or bug report]

Imaginen que atravesaron por las etapas de análisis y ejecución de pruebas y que encontraron algunos comportamientos no esperados.
  
¿En qué situación reportan un bug? 
  
¿Cuándo podrían  crear una nueva historia, un pedido de cambio o un pedido de ajuste de funcionalidad?
  
#### SOLUCION
  
  
### Pedidos de cambio o reportes de bug [change request / feature request or bug report]

Imaginen que atravesaron por las etapas de análisis y ejecución de pruebas y que encontraron algunos comportamientos no esperados. 

  - ¿En qué situación reportan un bug ? 

  - ¿Cuándo podrían  crear una nueva historia, un pedido de cambio o un pedido de ajuste de funcionalidad?



### Bug request: 
  
Ante un comportamiento obtenido que sea diferente del comportamiento esperado para un caso de prueba que estaba claramente definido en la documentación. 

  Cuando existe duda y revisé el escenario en cuestión con el PO (product owner), BA (business analyst), FA (functional analyst) o persona que fue nombrada como responsable de informar cómo debería comportarse el sistema y me confirma que lo encontrado  es un bug (y no algo que no se tuvo en cuenta y que debería tratarse como una mejora).

  
  ## Feature request / mejora / nueva historia de usuario:
  
Si el comportamiento que obtuve se relaciona a algo que no estaba muy bien documentado o muy claro en el insumo que use como base para diseñar los tests y lo reviso con la persona en el equipo que debería poder decir como se debería comportar el sistema (FA, PO, etc) y me confirma que lo que encontré debería tratarse como una mejora y no como un bug. 

 ---

 ## ¿NECESITAS UN EJEMPLO? 
  
Encuentras algo que parece un bug. Sin embargo, al reportarlo, el desarrollador no está de acuerdo. A su vez, el responsable (PO, FA, etc) solicita que reporten aquello que encontré como bug. 

  Una buena manera de resolver ese conflicto es con una breve reunión entre: QA, FA, Tester para revisar el escenario y acordar cómo tratarlo.

  En un equipo de desarrollo el abordaje del trabajo es siempre colaborativo, la meta es escucharnos, entendernos y construir y  jamás competir.

---
  
**TIP ALERT**: La comunicación es fundamental para evitar malos entendidos y comprender cómo continuar frente a ciertos inconvenientes. Recuerda: Organiza reuniones y encuentros para aclarar las diferencias  o para explicar aquello que consideres necesario

---
  
**¡Se viene un momento de esfuerzo!**
  
Ánimo, sabemos que hoy fue un día intenso: mucha lectura, análisis, reflexión y varios ejercicios. Queremos que desarrollen su perfil al máximo. Aquí les ofrecemos las mejores oportunidades para que lo logren 🙂


## ✋ Ejercicio #7

A continuación les presentamos dos sistemas:
  
- Homebanking
  
- Blog de recetas.

Debatan y documenten cómo ordenarían las tareas de test para cada uno de estos sistemas dependiendo de si cuentan con tiempo limitado o con tiempo ideal para desarrollar las pruebas de test.

#### SOLUCION
  
  ![image](https://user-images.githubusercontent.com/72580574/228083375-da4a4c36-e41c-4e1e-9f68-f6db2dd73aeb.png)

  ![image](https://user-images.githubusercontent.com/72580574/228083406-1a7f6e18-9ff9-45d5-ac0d-7c95d082a632.png)
  
  ![image](https://user-images.githubusercontent.com/72580574/228083430-23c62f3b-bbc7-424f-874c-2ecdd557971f.png)

  

---

## :star: Modelos y metodologías de desarrollo
  
Las actividades de testing tienen sentido cuando se enmarcan en un ciclo de desarrollo del software. A este ciclo lo atraviesan distintas metodologías compuestas por etapas. En cada una se produce algún tipo de material.

  Según cuál sea la metodología elegida, puede hablarse de ciclos de desarrollo  secuencial o iterativo.
  
En este sentido las tareas de testing se organizan acorde a la metodología elegida.
  
  **¡Pro tip alert!** Testeamos softwares en etapa de desarrollo que eventualmente tendrán su aprobación para iniciar la producción.

  ¿Cómo comienza un ciclo de vida de desarrollo de software?

  -> Relevamiento de los requerimientos para el desarrollo del producto 

  -> Expresión y documentación de cada requerimiento

  -> Desarrollo de código utilizando la documentación como insumo.

  -> Testing del producto

A continuación vamos a ver tres tipos de metodologías que se utilizan en la industria IT

  ### Desarrollo en cascada – Waterfall model

Esta metodología es de carácter secuencial: es decir que cada etapa inicia solo cuando la etapa anterior finalizó. 

![image](https://user-images.githubusercontent.com/72580574/228083625-6d591acc-7478-438a-8506-19b8e322630e.png)

### ¿Y el testing?

Se realiza solo cuando el código fue desarrollado por completo. El testing funciona como “evaluación de calidad” ya se  para aceptar o rechazar el producto.

#### ¿NECESITAS UN EJEMPLO? 
  
En una analogía con una fábrica, el testing podría representar el retiro de la línea de producción de aquellos productos con fallas para que solo salgan al mercado los productos que pasaron las pruebas de calidad.

En desarrollo de software no siempre es posible quitar parte del desarrollo. En primer lugar porque al hacerlo podríamos causar fallas en otras áreas. Además porque si lo que deberíamos retirar se encuentra cerca del final del ciclo y fuese parte de una funcionalidad clave, el sistema quedaría obsoleto o inaceptable su nivel de calidad. 

### Modelo V

Este modelo al igual que el anterior, también es de carácter secuencial. Podría decirse que es una extensión del modelo en cascada ya que intenta resolver su desventaja principal: el testing está al final relanteciendo la posibilidad de encontrar defectos.

Como se puede observar en la siguiente imagen, a cada etapa del modelo en cascada le corresponden actividades de planificación relacionadas con la etapa en desarrollo. 

  
  ![image](https://user-images.githubusercontent.com/72580574/228083719-37f55d4b-63f9-4cef-b303-5e12ed8b2f56.png)

  Con este modelo se pueden identificar defectos al finalizar cada etapa.
Al igual que en el desarrollo en cascada, cada etapa debe cerrarse antes de comenzar la siguiente. 


  
#### ¿NECESITAS UN EJEMPLO? 
La planificación del UAT (user acceptance testing) se genera cuando la especificación de los requerimientos están listos, claros y documentados.

Esto implica que omisiones, inexactitudes y todo tipo de errores humanos (que pueden  dar lugar a defectos) son posibles de identificar y corregir al principio del ciclo, antes de continuar con las etapas siguientes.

## :star: Modelos iterativos e incrementales

Las metodologías ágiles producen software en entregas a lo largo de iteraciones, ciclos o sprints (tres palabras similares para referirnos a lo mismo). 

En cada iteración se avanza en la construcción del sistema en producción.
Generalmente los ciclos o iteraciones son de 2, 3 o 4 semanas

Cada ciclo tiene un comienzo y un momento final delimitado. Usualmente las actividades que se realizan dentro del ciclo son las mismas.

Esta metodología de trabajo, permite que el software salga a producción con una versión del producto que puede modificarse a lo largo del tiempo o en los siguientes ciclos de desarrollo. Esto abre la posibilidad de recibir feedback por parte del usuario a lo largo de las iteraciones. 

  El producto se puede ajustar conforme modificaciones en el mercado o a las necesidades del cliente o usuario final.  En ocasiones significa que el trabajo de la construcción del producto puede no tener fecha de finalización o que comunicar una fecha de cierre a un potencial cliente puede ser algo difícil. 

Como desventaja puede mencionarse que en ciclos o iteraciones no se documenten correctamente los procesos. Para mitigar este posible error, es importante la tarea de análisis del equipo de testing y la implementación de TDD como método de trabajo. 
  
#### ¿NECESITAS UN EJEMPLO? 

  Algunos Modelos iterativos son también conocidos como Metodologías Ágiles:

- **Scrum** – Una variante muy conocida, con iteraciones cortas y foco en la autoorganización y mentalidad de equipo. Toma su nombre del deporte Rugby por generar  paralelismos entre la metodología de trabajo y el juego. 

  - **Kanban** – Hace foco en la visualización del flujo de trabajo para encontrar y eliminar los cuellos de botella. 

  - **RUP** – Rational Unified Process – Iteraciones un poco más largas que Scrum. Fases de transición: Incepción, elaboración, construcción.

  - **Spiral** – El factor de riesgo se usa para determinar el nivel de documentación y esfuerzo dedicado a cada fase. 

---
  
## Vamos con el siguiente desafío ¿Estás preparado? 
  
Lee el siguiente artículo (que se encuentra en inglés): [https://www.toolsqa.com/software-testing/waterfall-model/](https://www.toolsqa.com/software-testing/waterfall-model/)
  
---
  
## ✋ ¡MANOS A LA OBRA! 

### ✋ Ejercicio #8
  
- Discutan las ventajas y desventajas de cada modelo y completen el siguiente cuadro indicando qué tipo de modelo elegirían para el desarrollo de cada uno de estos productos.

  - Justifiquen sus respuestas:
  
  ![image](https://user-images.githubusercontent.com/72580574/228084109-67f4cda2-d150-4cde-8d06-5d3df682ef6d.png)

  
  ![image](https://user-images.githubusercontent.com/72580574/228084142-b840ed3f-366b-4cd8-bab1-d9db95124959.png)

  
---
  
**¡Pro tip alert!** Siempre deben validarse y chequear con el equipo los procedimientos de testing hasta estar seguro que lo que se está haciendo y que el abordaje elegido es funcional al equipo de desarrollo. 
Recuerda que si bien hay buenas prácticas y estándares, cada equipo o empresa, trabaja con metodologías propias. Esto puede derivar en prácticas más específicas, especiales o algo diferentes. 
Escuchá al equipo, realiza aportes constructivos y decidan en conjunto como trabajar en cada proyecto. 


  
  
---
  
  ## ⏰ ¡Hora de cerrar! 
  
El día de hoy estuvo dedicado a la lectura y a la ejercitación. Sabemos que no todos aprendemos de la misma manera y queremos respetar eso: ¿Cómo se sintieron? ¿Qué contenidos lograron incorporar?

  ¿Qué es lo que les genera más dudas o temor a la hora de desarrollar el puesto de tester? Compartan entre ustedes estas sensaciones. 

¡Llegó el momento de los pulsos. ¿Te gustaría recibir? No olvides cooperar, dar lo máximo en cada encuentro y colaborar con todos los integrantes. 


----
