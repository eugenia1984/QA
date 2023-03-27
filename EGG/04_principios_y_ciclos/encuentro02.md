# :star: ENCUENTRO 2 / 20

---

## 10 minutos

### Introducción

**¡Te damos la bienvenida a tu segundo encuentro de trabajo!**

Esperamos que hayas tenido un excelente equipo en tu primera sesión. Hoy conocerás un equipo nuevo. Recuerda reconocer con un pulso a aquellos integrantes que hoy colaboren más con tu aprendizaje. Esfuérzate por conseguir pulsos también.
Si valoras al equipo completo, ¡no dudes en entregarle un pulso a cada integrante! Así te estarás asegurando de que nuestro algoritmo te empareje con personas que colaboran con tu aprendizaje.

**¡Demos comienzo a la actividad del día de hoy!**

 Presentación del equipo:

Realiza en equipo este ejercicio cotidianamente. Toma tan solo unos minutos y cambia la experiencia de todo el equipo. Indica tu nombre y de dónde vienes. Ya sabes: puedes hacerlo en el chat si no deseas romper el hielo tú primero.
Les dejamos una pregunta para abrir la sesión (si lo desean):

¿Por qué decidieron realizar este curso? ¿Qué fué lo que más les interesó de este rol de la industria IT?

Utilicen unos 10 minutos para compartir estas breves presentaciones. ¡Anímense! Quienes están contigo en el equipo de hoy son parte de la gran comunidad que está aprendiendo junto a tí.

---

## :star: Fallas en el sistema:

## Ejercicio #1

Lean la siguiente frase:“An error (or mistake) leads to a defect (or fault), which can cause an observed failure”

1. Debatan y analicen en equipo su significado. Luego -de acuerdo a sus conclusiones- diagramen un flujo o bosquejo sobre el proceso de falla que se describe en la frase. Pueden utilizar la pizarra de Zoom u otra herramienta que conozcan.

2. ¿Qué entendemos por cada uno de estos conceptos?

![image](https://user-images.githubusercontent.com/72580574/228074846-7ae838d9-04a4-4537-b3ba-22dcee12d0de.png)

:tv: [Revisa este video](https://youtu.be/mkMz4OLgtx0) sobre el error, defecto y falla


Busquen ejemplos de cada uno y aprovechen para compartirlos, si así lo desean, con el equipo.

**Tip de la industria**:

Es muy común en diferentes grupos de trabajo que a la falla se la llame bug, incidente o incidencia al resultado inesperado que se encuentra en el sistema.

Una persona puede cometer un error (desatino), que puede llevar a la introducción de un defecto (falla o bug) en el código del software o en algún otro producto de trabajo relacionado. Un error que conduzca a la introducción de un defecto en un producto de trabajo puede desencadenar un error que conduzca a la introducción de un defecto en un producto de trabajo relacionado. Por ejemplo, un error de obtención de requisitos puede llevar a un defecto de requisitos, lo que a su vez da como resultado un error de programación que conduce a un defecto en el código.

Si se ejecuta un defecto en el código, esto puede causar una falla, pero no necesariamente en todas las circunstancias. Por ejemplo, algunos defectos requieren entradas o condiciones previas muy específicas para desencadenar una falla, que puede ocurrir raramente o nunca.

Los errores pueden ocurrir por muchas razones, tales como: la presión de tiempo; falibilidad humana; participantes en el proyecto sin experiencia o insuficientemente capacitados; falta de comunicación entre los participantes del proyecto, incluida la falta de comunicación sobre los requisitos y el diseño; complejidad del código, diseño, arquitectura, el problema subyacente a resolver y/o las tecnologías utilizadas; malentendidos sobre las interfaces dentro del sistema y entre sistemas, especialmente cuando tales interacciones dentro del sistema y entre sistemas son grandes; nuevas tecnologías poco comunes; etc.

Además de las fallas causadas por defectos en el código, las fallas también pueden ser causadas por condiciones ambientales. Por ejemplo, la radiación, los campos electromagnéticos y la contaminación pueden causar defectos en el firmware o influir en la ejecución del software al cambiar las condiciones del hardware. No todos los resultados inesperados de las pruebas son fallos. Los falsos positivos pueden ocurrir debido a errores en la forma en que se ejecutaron las pruebas.


---

## 30 minutos

### :book: MATERIAL DE LECTURA 

#### Falsos positivos/Falsos negativos

Algunas consideraciones

- No todo lo que parece un bug o falla en el sistema realmente lo es. 

- No toda falla aparente es sinónimo de bug. 

Al igual que en otras disciplinas existen los falsos positivos y los falsos negativos.

#### ¿NECESITAS UN EJEMPLO?

- **Ejemplo #1**: Supongamos que un QA o tester creó un caso de prueba habiendo entendido mal la especificación o el comportamiento esperado de una funcionalidad.  Cuando otra persona “corre el test”, el comportamiento esperado (es decir el descrito en las especificaciones) no se observa, pero el comportamiento obtenido es correcto. Decimos entonces que estamos “frente a un falso positivo” [not a bug].

- **Ejemplo #2**: Un falso negativo sería el resultado de un caso de prueba que al terminar de ejecutarse, no ha detectado un problema a pesar del comportamiento erróneo obtenido. Es decir: hay presencia de un bug, pero al estar mal diseñado, el caso de prueba no pudo identificarlo.

**¡TIP!**: En ambos casos: falso positivo y falso negativo, hay un error en el diseño del caso de prueba. ¡No lo olvides!


### Estrategia

Es importante desarrollar un criterio y comprender qué, por qué y para qué se testea. Cualquier individuo o empresa que ponga energías en desarrollar algún sistema, lo hace con un objetivo. Organizando y planificando la estrategia de Testing correctamente, ayudamos al cumplimiento de los objetivos, evitamos errores o detectamos defectos. 

Este trabajo de análisis y de diseño de estrategia debe comenzar lo antes posible. De ser posible junto al inicio del desarrollo y debe continuar hasta que aseguremos el nivel de calidad deseado.

Un producto deficiente resulta en pérdidas de tiempo, dinero, imagen corporativa, suscriptores, compradores. Pero también podrían ser pérdidas humanas o de nuestro ecosistema.

El trabajo desde el área de calidad (Quality assurance) es importante para evitar posibles pérdidas

Imaginemos las consecuencias de la falla en un sistema de navegación de un auto o en un sistema de automatización de señales viales, o en un sistema de ventilación en un hospital, un gps, o en un sistema de transferencias de dinero?

### Root Cause

Un defecto es lo que está mal, su efecto es la forma en la cual aparece. Podríamos generalizar el defecto y su efecto como el QUE sucedió y su causa o root cause como el PORQUÉ.

Veámoslo de forma gráfica:

![image](https://user-images.githubusercontent.com/72580574/228075590-eaa6ff7d-f4c6-4c39-bc80-efb629001593.png)

En otras palabras: la root cause es la causa del defecto.

#### ¿NECESITAS OTRO EJEMPLO? 

**Ejemplo #2**

Una transacción bancaria ejecutada que no impacta - en la cuenta destino- el monto transferido.

La causa del defecto o root cause, es aquello que dió lugar al defecto. Ejemplo: un time-out no manejado, un error en el código, entre otros

---

## 20 minutos

## Ejercicio #2:

Piensen un ejemplo en el que se exprese claramente un error en algún sistema

Intenta describirlo y detalla al menos 2 (dos) Root causes


Observa el siguiente gráfico:


![image](https://user-images.githubusercontent.com/72580574/228075812-eaaee9c5-fa83-408f-bb4b-7bf9ee9ad676.png)


Es posible señalar que el efecto se traduce en “ Qué sucede” o “cómo se expresa” y su causa o “Root Cause” el por qué o la razón de ese defecto.


**Secreto de la industria 1**: En ocasiones, nuestro cliente puede consultarnos o desea saber sobre las causas que dieron lugar a un fallo o bug, razón por la cual, es bueno tener pleno conocimiento de la Root cause.


## Objeto y Función del Testing:

### ¿Qué hace un tester? ¿Cuál será tu trabajo en un futuro cercano?

Planifica y ejecuta pruebas para comprobar si el producto funciona de la manera esperada, en todos los escenarios posibles. 

Identifica los defectos y bugs para reportarlo al área de desarrollo.

En ocasiones puede sugerir opciones de mejora. 

¿Se te ocurre otra tarea fundamental para cumplir con el rol? Comparte tu opinión con tus compañeros.

**Secreto de la industria 2**: En organizaciones grandes, la tarea “definición de funcionalidad” suele ser la del Analista Funcional (Functional Analyst) o Product Owner.

- El tester deberá hacer grandes esfuerzos a lo largo de su carrera ya que siempre tendrá que:

-Conocer el producto en profundidad.

-Conocer el diseño.

-Conocer el desarrollo.


### Perfil de un tester:


-Curioso y abierto al aprendizaje para conocer cada producto que debe testear.

-Atención al detalle

-Pensamiento “out of the box” (¿Te animás a investigar de qué se trata esta expresión?)

-Habilidad para anticiparse a escenarios complejos o problemáticos.

-Excelente redacción para poder expresar funcionalidades en los escenarios en los planes de pruebas.

Reflexiona unos minutos… ¿Qué tan cerca estás del perfil del tester? Comparte tus sensaciones con los demás integrantes. ¿Qué les pasa a ellos? ¿Hay coincidencia entre tus compañeros y tú?

---

## 15 minutos

### Ejemplo #3

Tarea: testear la actualización de un software de cajero automático.

Escenarios: 

1. Usuario intenta retirar dinero (Rol de usuario)

2. Ingresa tarjeta 

3. Ingresa PIN incorrecto

4. Recibe mensaje de error

5. No se le permite extraer dinero

6. Ingresa PIN correcto

7. El usuario solo puede ingresar a su cuenta con PIN correcto y no a otra

8. Validación del Idioma asociado a la información de la cuenta del usuario

9. Verificación de dinero en cuenta de usuario

**Algunas preguntas probables en relación al funcionamiento:**

-> ¿Qué ocurre en caso de que el cajero no disponga de dinero?

Validar que se muestre el mensaje “error”

Validar que el cajero no me entregue dinero y que no modifique el dato “saldo” en cuenta, en caso de no haberse efectuado ningún movimiento bancario.

-> ¿Qué sucede al terminar la transacción? ¿La sesión queda abierta o cerrada? ¿Qué se observa en pantalla?

-> ¿Y si el cajero automático entregó todo el dinero disponible?

-> ¿Qué tipo de usuario (con otros permisos) podría operar en el cajero? ¿Algún usuario debería poder operar en el cajero aunque el usuario común no? 

-> ¿Quién puede cargar dinero en el cajero?

-> ¿Algún usuario puede retirar dinero del cajero automático desde otro lugar físico? ¿Y sin ingresar tarjeta?

**Super tip:** No te olvides de ir siempre más allá, con las preguntas… ¿Qué es lo que NO estás preguntando? Por ejemplo: ¿Hay distintos permisos para acceder a la información? ¿Conoces las acciones permitidas de cada usuario en relación a los permisos que tienen?


---

## Ejercicio #3

Piensen preguntas funcionales que podrían agregar para comprender el sistema.

¿A quién estarían dirigidas?

¿Qué escenarios o casos de uso crees que debería contemplar el software de un cajero automático de un banco?

¿Y el de un autoservicio?

Conoce las posibles soluciones [desde aquí](https://docs.google.com/document/d/1dPD7ZLfmLWbYqjHAAe59DTd5grKh2Zb0d7nD9O542gM/edit?usp=sharing)

## SOLUCIONES

A) Piensen preguntas funcionales que podrían agregar para comprender el sistema.

1. ¿Qué tipo de tarjetas acepta el cajero? débito / crédito / tarjetas de entidades de criptomonedas como Binance, Lemon, Nexo? ¿Solo Nacionales? ¿solo internacionales? ¿Ambos tipos? ¿De cualquier entidad bancaria? ¿De cualquier red bancaria? (ejemplo Banelco/Link)

2. ¿Existe otra validación además del ingreso de pin correcto?

3. ¿Cuál es la cantidad máxima de intentos para poder ingresar al sistema?

4. ¿Cuántas veces se puede ingresar un pin incorrecto sin perder el acceso?

5. Qué sucede ( o debería suceder)  si se superó la cantidad de intentos de ingresos de pin incorrecto? ¿se retiene la tarjeta? ¿Se muestra alguna pantalla de error? ¿Cuánto tiempo debe esperar el usuario para volver a operar?

6. ¿Qué debe suceder cuando el usuario logra acceder al sistema? Que debe visualizarse en pantalla?

7. ¿Todos los tipos de usuario / tipos de tarjeta deben ver las mismas opciones de menú?

8. ¿A dónde dirige cada opción del menú en pantalla? 

9. ¿Qué moneda entrega el cajero?

10. ¿Qué ocurre  si al término de la transacción la tarjeta es expulsada por el cajero, pero el usuario no la retira?

11. ¿Cuánto tiempo debe pasar entre una transacción y otra? ¿Y entre el fin de una transacción y el mensaje de bienvenida del próximo usuario o transacción?

12. ¿Cuándo el cajero entra en modo “fuera de servicio”? 

13. ¿Qué tiempos de respuesta son los esperados luego de cada “input”?


B) ¿A quién estarían dirigidas?

Al analista funcional, analista de producto, product owner, business owner o a quien se haya señalado en el grupo de trabajo, equipo o empresa como la persona responsable de responder las dudas funcionales. 
Además podría preguntarse a quién creó la documentación. 
Esto dependerá de la organización interna de la empresa.

C) ¿Qué escenarios o casos de uso  crees que debería contemplar el software de un cajero automático de un banco?

1. Personas con visión reducida que utilizan el producto.

2. Utilización con tarjeta contactless.

3. Utilización de tarjeta con/sin chip (ingreso por ranura)

4. Alta de claves de seguridad

5. Blanqueo de claves

6. Extracción en moneda local

7. Extracción en moneda extranjera

8. Mensaje de error con cajero fuera de servicio

9. Mensaje de error cuando el cajero no tiene dinero suficiente para completar la solicitud requerida.

10. Mensaje de error cuando la persona no tiene suficiente saldo para la operación que desea hacer.

11.consultas (saldo, límite, movimientos)

12. Impresión de comprobantes

D) Autoservicio

1. Consultas

2. Ingreso de dinero

3. Mensaje fuera de horario de servicio cuando corresponda.

4. Mensaje cuando el autoservicio está dentro de horario pero fuera de servicio.

5. Impresión de comprobantes

6. Pago de impuestos y servicios


---

## 25 minutos

**Secreto de la industria 3**: En cada empresa o grupo de trabajo hay una persona asignada que debería tener el conocimiento “funcional” del sistema. Es decir, conocer qué debe hacer el sistema en múltiples situaciones o escenarios.

Recuerda identificar quién es la “go to person” cuando surgen preguntas funcionales. 

## :book: MATERIAL DE LECTURA

### El arte de preguntar

**La mayéutica**

¿Escuchaste alguna vez acerca de este método? Es el que utilizaba Sócrates en la antigua Grecia con sus alumnos y consistía en hacer muchas preguntas para así descubrir el conocimiento.
Trasladando este método a nuestra área de expertise, se trata de que uds realicen todas las preguntas funcionales que deseen para inferir posibles escenarios y evitar fallas.

El objetivo es tratar de obtener las respuestas a los “¿qué pasa si….?” o “¿qué pasa cuándo…?” que se nos ocurran. 

Detectar la falta de información, identificar omisiones o contradicciones y realizar la pregunta correcta a la persona precisa es parte del rol profesional.

**TIP**: ¡Atención! no asuman situaciones solo porque “les  parece” que algo debería ser o comportarse así. La recomendación es: PREGUNTAR

Luego de cubrir las dudas, organizamos por prioridad el plan de pruebas. Luego comienza la ejecución. 

En el curso anterior (Introducción a QA) profundizaron sobre este tema. ¿Recuerdan su definición?

**“Es un elemento que nos ayuda a cuantificar -en términos de cobertura- la calidad del producto que saldrá a producción”.**

¿Qué otras definiciones tienen para agregar al concepto “plan de pruebas"? Podes revisar las guías anteriores, apuntes etc.

## Acerca de las funcionalidades

A simple vista puede parecer la misma funcionalidad, pero ¿realmente es así?

#### ¿NECESITAS UN EJEMPLO? 

Es probable que un adolescente y una persona 30 años mayor, aborden o utilicen el mismo sistema de manera diferente. Pueden elegir o interactuar con diversas opciones.

Entonces, desde nuestro rol, debemos comunicar y registrar cuáles podrían ser esas múltiples formas de usar el sistema o la diversidad de escenarios que el sistema debiera contemplar.

Pensemos en la funcionalidad “login” de un cliente de email (como por ejemplo Gmail o Outlook)

Cada uno de estos sujetos e prueba mencionados anteriormente puede intentar loguearse: 

->Desde diferentes navegadores

-> Con / sin conexión a internet

-> Desde diferentes dispositivos (Tablet, celular, pc de escritorio, laptop, tv)

-> Dentro / fuera de una VPN

-> Con / sin proxy

-> Con un usuario existente / inexistente

-> Con un password correcto / incorrecto

-> Con un usuario que existió pero que fue dado de baja

-> Cliqueando en el botón de ingresar luego de que la sesión dió time out.

Estos son solo algunos factores que un analista QA podría querer tener en cuenta para delinear sus casos de prueba.



---

## Ejercicio #4

¿Qué otros factores tendrías en cuenta para el armado del plan de pruebas de un cliente de email como Gmail o Outlook? ¿Escenarios particulares?

¿Ya los has pensado? Recurre a las posibles [soluciones desde aquí.](https://docs.google.com/document/d/1mxs8UakHveSLXPKIOYIYnji9DvLx241TM980d82Rs9A/edit?usp=sharing)

### SOLUCIONES

Algunos escenarios adicionales que se podrían tener en cuenta:

- Usuario intenta ingresar desde un dispositivo que nunca usó antes

- Usuario intenta ingresar con un email que no fue dado de baja pero que no había tenido actividad por un lapso mayor a un año. 

- Ingreso al inbox de una cuenta de gmail desde otra cuenta de gmail.

- Requerimientos de tiempos de respuesta (performance):

- Respuesta de la página si hay N cantidad de usuarios logueandose a la vez 

- Proceso de login con la ayuda de un lector de pantallas

- Proceso de recuperación / reseteo de contraseña (Forgot your password?) 

- ingreso desde un link de activación (invitación a unirse a gmail)

---

## Ejercicio#5 Optativo

¿Estás con ganas de profundizar? Si lo deseas y quieres ganar experiencia “haciendo”, puedes hacer un último ejercicio.

¿Qué preguntas funcionales harías si te encargaran testear una app móvil de mensajería? 
¿Qué escenarios o casos de uso considerás que una app móvil de mensajería debería tener? 

¿Qué escenarios o casos de uso consideras que serían deseables pero no necesariamente indispensables?

Posibles soluciones a estas preguntas, accede [desde aquí](https://docs.google.com/document/d/1HzQRD2990ArfiZheOR2bI1FHMsKPWsdTSrQiafi9O5M/edit?usp=sharing)

### SOLUCIONES

A) ¿Qué preguntas funcionales harías si te encargaran testear una app móvil de mensajería?


- ¿Qué tipo de mensajes puede enviar (sms, mensajes de voz, video, solo texto)?

- ¿Debe recibir?

- Admite todo tipo de caracteres?

- ¿Cuántos caracteres admite por mensaje?

- ¿Permite incluir  emojis y stickers?

- ¿Qué redes puede utilizar?

- ¿En qué sistema debe funcionar? (Android / IOS, etc)

- ¿En qué tiendas móviles debería estar disponible? (google app store, huawei app store, etc)

- ¿Posee proceso de validación de usuario?

- ¿Tiene versión desktop (de escritorio)?

B ) ¿Qué escenarios o casos de uso considerás que una app móvil de mensajería debería tener? 

- envío y recepción de los tipos de mensajes según el requerimiento y a través de las redes especificadas. 

- escritura y guardado de mensajes (en draft) sin conexión

- mensajes de error - mensaje no enviado

- mensaje de error - sin conexion a red

- mensaje de confirmación de envío exitoso

C ) ¿Qué escenarios o casos de uso consideras que serían deseables pero no necesariamente indispensables?

- creación de grupos para el envío de mensajes grupales

- configuración de quien puede enviar mensajes dentro de grupos

- avatar

- bloqueo de usuarios

- estados

- manejo de cuentas múltiples en simultáneo


---

**¡Un esfuerzo más!**

Hasta aquí has practicado mucho. ¡Felicitaciones! Te pedimos que continúes haciéndolo, sabemos que es un esfuerzo, pero la práctica te beneficiará en tu futuro rol. Toma una pausa de 10 minutos, respira, haz algunos ejercicios, recarga energía para desafiarte nuevamente.


---

## Ejercicio #6

Este ejercicio consta de una instancia individual y una grupal. Comencemos por la individual. Reflexiona unos minutos…

- ¿Qué tipos de errores podrían producirse durante la creación de un documento funcional? ¿Y en la documentación de historias de usuario?

- Enumera todos los tipos de errores que podrían dar lugar a gaps o defectos en la documentación.

- Realicen una puesta en común con sus integrantes de equipo.

- Seleccionen aquellos que consideren fundamenta/es

- Ofrezcan respuesta para prevenir esos errores.

¡Accede a la solución [desde aqui](https://docs.google.com/document/d/1O1_blizpb_mVPhTDdG-suCuN_6qqPIAyIIg9vNHgL8k/edit)

### SOLUCION

Algunos de los defectos que pueden aparecer son: 

-Omisiones

-Casos que no se tuvieron en cuenta

-Contradicciones 

-Ambigüedades 

-Descripciones vagas que dan lugar múltiples interpretaciones

-Afirmaciones confusas.

Resumiendo:

-Omisión de: escenarios a cubrir, casos de uso o comportamientos esperados

-Documentación incorrecta sobre escenarios a cubrir, casos de uso o comportamientos esperados.

Todo aquello que no sea preciso y de lugar a duda, requiere de mejora para asegurar que todas los  involucrados – cliente, desarrollador, QA. comprenden exactamente aquello que se va a implementar.

---

## :book: MATERIAL DE LECTURA

Algunas empresas hacen una distinción entre QA (Quality Assurance) y QC (Quality Control). Veamos la diferencia entre cada una: 

![image](https://user-images.githubusercontent.com/72580574/228078307-f41f8c08-fcf1-4a67-a649-a205499b92a9.png)


Como mencionamos anteriormente estas distinciones no existen en todas las empresas y en algunos casos, puede ocurrir que la denominación de las áreas sea la de QC/QA pero algunas de sus funciones actividades y/o responsabilidades cambien se diferencien entre organizaciones.

**Secreto de la industria 4**: En algunas empresas las áreas pueden estar divididas según las siguientes tareas:

-Realizar análisis estático y diseño del plan de pruebas

-Ejecutan los planes de prueba.

No hay homogeneidad en las prácticas producto de la velocidad con la que crece la industria IT.

---

## Bug Reporting: 

¿Y si al ejecutar una prueba nos encontramos con algún comportamiento que no es el esperado? Será momento de reportar nuestro hallazgo.

### ¿Cómo debe ser ese reporte?

- Ordenado

- Comprensible

- Reproducible (es decir que podamos reproducir el escenario que derivó en un comportamiento inesperado): el reporte debe tener pasos simples y concretos para que el desarrollador o cualquier persona que lo lea pueda reproducir el error.

### El objetivo de reportar los fallos o bugs 

que encontramos es que los desarrolladores puedan seguir de manera fácil los pasos que les comunicamos, (que tienen que ser simples y precisos).

Es decir, el objetivo es que los desarrolladores:

- Analicen las acciones que derivaron en un bug o comportamiento inesperado

- Encuentren la root cause (la causa del bug) 

- Corrigan el comportamiento no deseado

### ¿Cómo lo hacen?

Reproduce -en su propio ambiente de desarrollo- el bug reportado y lo debuggean

Luego realizan los cambios necesarios en el código. 

Más adelante analizaremos “las buenas prácticas” para reportar bugs y algunos ejemplos para practicar.

El trabajo de testing requiere tiempo para analizar. Si le pidiéramos al equipo de desarrollo que realice funciones de testeo, el desarrollo ágil no sería tal y la implementación en modalidad cascada sería un proceso muy largo. 

La colaboración dentro del equipo y entre equipos también es fundamental.

La mayoría de las empresas del área IT remarcan la importancia del trabajo en equipo como parte de su cultura y en los procesos de búsqueda de personal suelen solicitar personas con las siguientes habilidades:

- Autonomía

- Capacidad de resolución

- Proactividad

- Capacidad de adaptación,

- Colaboración

- Trabajo en equipo.

**TIP**: La voluntad de compartir lo aprendido y ayudar a que la organización crezca es muy importante sobre todo en empresas jóvenes o startup. ¿Estás preparado/a para trabajar de esa manera?

### En equipo analicen…

¿Qué es el testing?

Debatan en equipo

Luego contrasten su respuesta con la que les ofrecemos ¿Hay coincidencia?

#### SOLUCION

¿Qué es el testing?

Esta pregunta tiene múltiples respuestas, sin embargo podríamos decir que es una serie de actividades que se llevan a cabo para reducir riesgos y mejorar la calidad a partir de la detección de defectos y fallas en un software


---

## Diccionario de cabecera

Como sabrás, todas las disciplinas tienen un diccionario propio y específico del campo de conocimiento al que están circunscritas. Es decir vocabulario relacionado a tareas, elementos, objetos, sistemas, programas o actividades.
A continuación les presentamos las más importantes:

### Test basis o base para los test: 

Es el insumo que usamos para el análisis y el diseño de casos de prueba. 
Punto inicial para empezar a definir qué testear y cómo hacerlo basándonos en el cuerpo de conocimiento, las definiciones, las especificaciones y la historia de usuario.
Nos ofrece información sobre todo aquello que el sistema debe hacer.

### Test condition:
Las descripciones a los comportamientos esperados frente a situaciones concretas son las que se denominan condiciones del test. Nos hablan de circunstancias, aunque no contienen el detalle suficiente para hacer “correr el test”. 
Las condiciones son aspectos que se encuentran en la base para los tests y son relevantes para alcanzar objetivos de prueba específicos. Un aspecto testeable del sistema descrito en la base para los tests, es decir en el insumo con información del sistema a diseñar del cual se disponga .

### Test Case:

Es el caso de prueba concreto, basado en las condiciones que se desean testear. El caso de prueba debe incluir una descripción de cuál es el comportamiento esperado (expected outcome).

Se debe realizar teniendo en cuenta:

- Precondiciones (si aplica):

Las precondiciones sirven para saber cómo tiene que estar configurado el ambiente para testar un caso particular. Es un estado de las cosas previo a la ejecución del test. Ejemplos: que el usuario tenga un email sin verificar, que el usuario no esté registrado, que el usuario esté deshabilitado, entre otros.

- Datos de entrada

- Acciones (de ser necesarias)

- Resultado esperado

- Poscondiciones

### Test Procedure:

Procedimiento de pruebas o script de pruebas. 

Es la secuencia de casos de prueba en orden de ejecución. Son todas aquellas acciones necesarias para configurar precondiciones (si aplica) y acciones de cierre en el caso de ser necesarias.

#### ¿NECESITAS UN EJEMPLO?

- Test Basis: Si el usuario ingresa un password incorrecto 5 veces, la cuenta se bloquea y solo el administrador puede desbloquearla.

- Test Conditions: No se sabe cuál es el password incorrecto, sólo sabemos cómo debería reaccionar el sistema cada vez que se ingresa un password incorrecto 5 veces. 

- Test case: Si la intención es probar que se bloquea la cuenta luego de 5 intentos de password incorrecto y que solo el administrador puede desbloquearla, es necesario asegurar -como precondiciones- que el usuario (en este test de prueba) no posee permisos para desbloquear cuentas.

---

### ¡Hora de cerrar! 

¡Últimos minutos!

Hemos trabajado mucho en el encuentro de hoy.

¿Qué dudas tienen sobre los ejemplos de testing mencionados? ¿Necesitan consultar a un mentor? ¿Cuál es el concepto más difícil de aprender hasta este momento? ¿Qué les genera más incertidumbre?


---
