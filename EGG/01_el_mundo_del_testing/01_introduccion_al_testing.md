# :star2: Introducción al testing * Módulo 1 / Encuentro 1/17

---

## :star: ¿Que haremos hoy ?

![image](https://user-images.githubusercontent.com/72580574/213816298-81a11e11-6dd2-4545-8ac6-2fbb2bcf8353.png)


---

## :star: Introducción y rompehielo

**¡Te damos la bienvenida a nuestras guías de trabajo!**

En cada encuentro, tendrás una guía como esta que te acompañará para que puedas ir avanzando en tu aprendizaje.

En los primeros encuentros, verás que nuestras guías también te indican cómo usar el tiempo, te dan ideas de cómo interactuar en las salas de grupos pequeños (breakout rooms) y de cómo solicitar ayuda por parte de otros estudiantes.

A medida que avances en el recorrido, verás que ya no tendremos tanto para indicarte y que tendrás suficiente autonomía para tomar decisiones de cómo usar el tiempo cada día.

---

![image](https://user-images.githubusercontent.com/72580574/213806829-c3f4f732-151e-482f-aa3d-986b1124d833.png)

**¡Demos comienzo a la actividad del día de hoy!**



## ☑️ 1. PRESENTACIÓN DEL EQUIPO:

Si no lo han hecho todavía o eres de las personas que prefiere que otro comience, te sugerimos comenzar indicando tu nombre y de dónde vienes. Lo puedes hacer en el chat o usando tu micrófono. Hoy compartes el encuentro con una pequeña porción de una gran comunidad que irás conociendo poco a poco.

**¿Por qué quieres aprender sobre QA? ¿Sabes algo de testing o de Quality Assurance?**

Utilicen unos 10 minutos para compartir estas breves presentaciones. ¡Animate! Quienes están contigo en el equipo del día pueden ser tus colegas en el futuro.


---

![image](https://user-images.githubusercontent.com/72580574/213806982-b431c4b7-6e9c-483c-b3fe-9db3bfc2d41a.png)


![image](https://user-images.githubusercontent.com/72580574/213807035-5d0259aa-de3f-44cc-8b89-7cd570abf3ad.png)


---

## ☑️ 2. VAMOS A INICIARNOS RÁPIDAMENTE EN EL MUNDO DEL TESTING
 

Para ello debemos comprender un principio elemental de la industria de la tecnología. Un software es un programa que debe completar una cierta tarea. En ocasiones, ese software puede no realizar la tarea que se le encomendó o puede tener errores durante la ejecución de esa tarea.

En **forma individual, tómense 5 minutos** para recordar algún error de software que hayan experimentado. Ej: un enlace que no funciona, un botón que no lleva a ningún lado, una app que crashea el teléfono, etc. Sean muy precisos en la descripción del ejemplo.

La aptitud de ser precisos en una descripción de un error es una habilidad fundamental de un tester. Comienza ya mismo a ponerla en práctica.

En equipo, usen los 10 minutos restantes para compartir los ejemplos que trajo cada uno de ustedes.

- ¿Hay coincidencias?

- ¿Se imaginan qué error hay detrás de cada ejemplo?

**¡TIP!** - Designar a un integrante para cuidar el tiempo en la resolución de las actividades ayuda a que usemos el encuentro en forma efectiva.

- Podemos compartir pantalla, usar pizarras compartidas como la de [Zoom](https://www.google.com/search?q=crear+jamboard+tutorial+video&ei=uzV-Y-TGEovJ5OUP7de-4Ac&ved=0ahUKEwikkIX7yMT7AhWLJLkGHe2rD3wQ4dUDCA8&uact=5&oq=crear+jamboard+tutorial+video&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzIFCCEQoAEyBQghEKABMgUIIRCgAToKCAAQRxDWBBCwA0oECEEYAEoECEYYAFCrDljyE2DVFWgBcAF4AIABeIgBtASSAQM1LjGYAQCgAQHIAQjAAQE&sclient=gws-wiz-serp#fpstate=ive&vld=cid:762084e8,vid:JF05K9FzlxQ), [Jamboard](https://jamboard.google.com/) o [Excalidraw](https://excalidraw.com/).

---

![image](https://user-images.githubusercontent.com/72580574/213807369-fed21868-2509-4e26-8787-bc9bee9074e1.png)


Ya estarás descubriendo un poco el ritmo. Usamos el encuentro en vivo para leer, ejercitar, aprender de la experiencia de otros y poder resolver dudas junto a otros estudiantes que están aprendiendo junto a tí.

Ahora vamos a dedicar unos 35 minutos a la lectura de material. Nuestra sugerencia es que lo hagas en forma silenciosa y que junto a tu equipo del día indiquen a qué horario desean volver a interactuar.

Tendrás lectura ( :book: ) y también una ejercitación.

**¿Por qué sugerimos hacerlo en forma individual?**

- Porque todos tenemos distintos estilos de aprendizaje y al variar las formas, le damos lugar a la diversidad.

- Porque no solo se trata de aprender a cooperar, también se trata de que cada uno incorpore el material en forma efectiva.

De a poco vamos introduciéndonos en el mundo del Testing. 

Seguro que habrán podido inferir la necesidad de hacer pruebas de calidad en la producción de software.

Calidad es una de esas palabras que damos por sentado y tal vez no reparamos en su significado más preciso.


**La CALIDAD es una medida de excelencia. Se refiere a un estado libre de defectos, deficiencias o variaciones significativas de un producto o resultado que se entrega para satisfacer los requerimientos específicos de un proyecto o cliente.**

---

## :book: MATERIAL DE LECTURA :book:

### 📋 INTRODUCCIÓN AL TESTING Y A LA INDUSTRIA DEL SOFTWARE

Para comprender esta definición en contexto, es importante revisar cómo se produce software.

**Ciclo de vida de producción de software** (o **SDLC**, **software development lifecycle**, por sus siglas en inglés).

### El inglés es una necesidad de la industria

Si no lo han observado todavía, verán que la industria de la tecnología ha elegido al inglés como su lengua franca, o sea, el idioma universal en el cual se escribe, se produce y se trabaja en software y tecnología.

A medida que presentemos terminología específica de testing haremos especial hincapié en integrar los conceptos en inglés ya que en el mundo laboral serán muy necesarios. Les sugerimos, también, utilizar fuentes de estudio en inglés. Videos en YouTube con subtítulos activados y sitios web que los asistan a reforzar estos conceptos en inglés.


--->> **La producción de software se puede iniciar por una de dos vías**:

- **Proyecto**

- **Producto**


**Proyecto**: 

Existe un **cliente particular** con una **necesidad específica** para su negocio. Ej: Una peluquería que trabaja con turnos que desea además cobrar en el momento en el que se gestiona el turno.

El cliente entonces contacta a un **proveedor de software** y le detalla sus **necesidades**. El desarrollador (puede ser un individuo o una compañía, muchas veces llamadas software factories) toma nota de los **requerimientos**, hace las **preguntas** necesarias para entender mejor aquellas cuestiones que el cliente no sabe especificar - si desea que sea posible tomar turnos en feriados, por ejemplo - y luego realiza un **cotización** en base al esfuerzo - horas y cantidad de desarrolladores necesarios. Si el cliente lo acepta, se inicia el proyecto.

Entonces: un **proyecto** es una **solución particular** para un **cliente** con **necesidades específicas**. Típicamente nos encontramos a entidades financieras, bancos, gobiernos y grandes empresas entre los clientes que solicitan soluciones a medida, con alto grado de confidencialidad y exigencia.

**Producto**:

La **propuesta de software** para un **producto** se inicia con la **detección de una necesidad en el mercado**. Por ejemplo, podemos decir que la compra remota es una necesidad que puede ser satisfecha a gran escala. Soluciones como Amazon, Ebay, Mercado Libre pretenden dar solución a esta necesidad. El camino es un poco distinto ya que **el que produce el software responde casi siempre a un esfuerzo de un equipo** (muchas veces una start up) que trabaja para **entender cómo resolver ese problema de forma que muchos usuarios en el mundo deseen utilizar ese software**. Entonces un **producto** pretende **resolver un problema a gran escala y sus usuarios habitualmente van directo a consumirlo**.

Para el CICLO DE VIDA DE DESARROLLO DE SOFTWARE, ser un proyecto o ser un producto no cambia el orden en el que ocurren los pasos.

:star: El **ciclo de vida del desarrollo de software** luce así:

1. **Estrategia**: Recopilación de requisitos y planificación (**Strategy**: requirements specification and planning)

2. **Diseño de software** (**Software design**)

3. **Desarrollo de software** (**Software development**)

4. **Prueba e Integración** (**Testing and integration**)

5. **Despliegue** (**Deployment**)

6. **Operacionalización y Mantenimiento** (**Operation and maintenance**)


![image](https://user-images.githubusercontent.com/72580574/213807949-e3010f4c-1be8-4a18-848b-3f67176db410.png)


Imagen 1.2: Ciclo de vida de Producción de Software. Fuente: [https://www.itview.in/blog/indispensable-role-significance-of-testing-in-software-development-life-cycle-sdlc/ ](https://www.itview.in/blog/indispensable-role-significance-of-testing-in-software-development-life-cycle-sdlc/ )

---


### Secreto de la industria:

Existen varias versiones del gráfico o los pasos del ciclo de vida de la producción de software. La idea es que comiences a familiarizarte con la idea de que **el momento del testing es un paso previo a la entrega del producto al cliente**. Lo más probable es que en un proyecto real, estos pasos estén superpuestos. Por ejemplo: mientras se termina de desarrollar la fase 2, puede que el equipo de testing ya esté trabajando en las pruebas de la fase 1 y que también el cliente vaya viendo entregas parciales. Vamos a profundizar sobre este tema cuando veamos "Producción ágil de software" en encuentros futuros.

---

### ¿NECESITAS UN EJEMPLO? 

**¡Pongámosle vida al ciclo de desarrollo de software!**

Iniciamos un emprendimiento con unos amigos. Cocinamos snacks de origen vegetal, aptos para intolerantes al gluten y dietas vegetarianas y veganas. Deseamos tener algo de presencia en la web y en las redes sociales. Nos acercamos a un conocido que tiene una empresa de desarrollo de software especializada en páginas web.


### Lee atentamente la secuencia e intenta identificar cada uno de los pasos del ciclo de producción de software. Verás que una vez puesto en práctica, cada una de estas fases se vuelven simples de recordar y cobran sentido.


**Día 1**: Nos acercamos a la empresa. Nos citan a un encuentro y nos entrevistan.

*Compañía* - *Vamos a comenzar por la página web. ¿Tienen una idea de la imagen que desean proyectar? ¿Ya tienen algún diseño con el que están produciendo sus productos?*

*Nosotros* - *¡Sí! Nuestra marca ya es conocida y tenemos logo, packaging y hasta la frase con la que nos identifica el público: "Aptos para la pausa de cada uno."*

*Compañía* - *Excelente. Entonces les vamos a dejar un cuestionario para que nos cuenten en detalle sobre sus clientes. Quiénes son, qué edad tienen, qué les gusta. ¿Además de los clientes, alguien más va a usar esta web? - aquí inicia la exploración más técnica. La que tal vez nosotros como clientes no sabemos hacer porque no tenemos el conocimiento. Nos preguntan si va a haber más de un usuario (ej, administrador de stock?), si vamos a realizar transacciones en la página (compra y venta), si vamos a tener stock de nuestros productos, si tenemos una base de datos con la cual ya trabajamos. Cuántos usuarios esperamos de tráfico a nuestra web. No es lo mismo esperar un crecimiento lento y orgánico, que desarrollar una solución para sostener 10,000 clicks en un minuto. Todos hemos visto esos tickets de nuestra banda preferida irse en segundos a la madrugada en la que se pusieron a la venta.*

Con esta información, la compañía promete volver a nosotros con una propuesta económica, una idea de tiempos de resolución y prometen hacer más preguntas si se encuentran con falta de información.

-> **1 - STRATEGY** : requerimientos 

**Días 2 y 3**:

La compañía se reúne con su equipo multidisciplinario y evalúan el proyecto. Cada responsable de área calcula el costo en tiempo y esfuerzo de cada uno de los requerimientos identificados por el cliente y los identificados durante la entrevista. Producen un documento técnico que incluye:

- Especificación de requisitos funcionales

- Especificación de requisitos comerciales

- Requerimientos del cliente

- Requerimientos de usuarios/roles

- Requerimientos de seguridad y análisis de riesgos

- Esquema de testeo

-> **2 - SOFTWARE DESIGN** : presupuesto

¿Puedes identificar qué fases ya se han cumplido en este escenario?

**Día 4**: Nos presentan la documentación y los planes de pago. Nos satisface el nivel de detalle y la velocidad con la que han cumplido con esta fase del proyecto y rápidamente nos ponemos de acuerdo para que comiencen a trabajar. Estiman unos 3 meses antes de poder concretar con el proyecto, pero nos dicen que estarán presentando avances o muestras (mock-ups es la palabra que se utiliza en la industria tech y se refiere a las maquetas visuales o funcionales con las que los desarrolladores nos pueden acercar una idea que nosotros podamos entender, ya que la hacen lo más parecido al producto final posible).

-> **3 - SOFTWARE DEVELOPMENT**: comienzan con el desarrollo.

**Día 15**: Nos convocan a una reunión para mostrar avances. Nos muestran un mock-up del wireframe (¡este te toca googlear a tí!). Nos gusta mucho. Hacemos algunas observaciones de elementos que no nos imaginábamos que iban a mostrarse así. Damos feedback de la parte visual y jugamos a ser usuarios que llegan a nuestra página. Nos avisan que nada de esto que vemos está en el mundo real, sino que es tan solo una maqueta para que podamos dar nuestra opinión sin que ellos hayan invertido mucho tiempo en desarrollar el total de la propuesta.

---
---


### :book: Wireframes vs. mockups vs. prototypes

When designing an app or webpage, UX and UI designers and developers use a number of planning tools to iterate their ideas and outline their solutions. There are three main levels of visual outlines:

- Wireframes

- Mockups

- Prototypes

Each solution helps designers map and visualize their design plans at varying degrees of detail and functionality through the development phase.

#### What is a wireframe?

A wireframe is a skeletal blueprint or framework that outlines the basic design and functions of a user interface (such as a website or application). 

The goal of a wireframe is to quickly and easily communicate: 

- The contents of the page

- The page structure and layout

- The app’s functions

In other words, a wireframe describes the basic structure, functions, and content of the page. 

Wireframes can be low-fidelity or high-fidelity, depending on your needs and preferences. A low-fidelity wireframe is often sketched out on paper or a whiteboard and is a useful way to brainstorm the basic outline for your design. A high-fidelity wireframe has more detail and may include simple workflows and interactions. 

![image](https://user-images.githubusercontent.com/72580574/213882727-498dbb61-608f-48a6-87f4-d483e6054e08.png)

#### What is a mockup?

A mockup is the next, more in-depth iteration of the wireframe outline. A mockup is a static wireframe that includes more stylistic and visual UI details to present a realistic model of what the final page or application will look like. 

A good way to think of it is that a wireframe is a blueprint and a mockup is a visual model. 

A mockup typically includes additional visual details such as:

- Colors, styles, graphics, and typography

- Styled buttons and text

- Navigation graphics

- Component spacing

Mockups are useful tools for understanding and communicating what the final interface should look like and gives stakeholders a chance to preview design and style choices before committing to building the app in a functional prototype.

#### What is a prototype?

A prototype is an early model of a product or design built to test the concept. 

A prototype is typically a functional and interactive simulation that includes all the stylistic details intended for the final deliverable. This model allows developers to see how their product works in a real environment and test the usability of their designs.

The main purpose is to test the design before investing time and money to develop the full product. A prototype can help developers work out any bugs or design flaws, see the user flow and interactions in practice, and build support and engagement from stakeholders. 


---
---


## Metodologías ágiles ha ingresado a la habitación

![image](https://user-images.githubusercontent.com/72580574/213808519-d5c1f137-94bb-45a1-b502-9cee03565da3.png)


---
---


-> **TESTING INTEGRATION** and **DEPLOYMENT**

**Día 30**: Nos envían un prototipo para que veamos. Nos envían una URL que no está listada al público y que tiene acceso con usuario y contraseña. Nos cuentan que ya está armado el esqueleto funcional de los que solicitamos y que por favor probemos las funcionalidades que habíamos solicitado. Nos aseguran que funcionan todas pero quieren ver si a nosotros nos satisfacen.

-> **OPERATION AND MANTENANCE**

**Día 31**: Probamos todo con nuestro equipo. Usamos distintos nombres, realizamos distintas acciones. Nos encanta lo que han hecho... aunque todavía luce como un documento word hecho página web. Nos aseguran que así es el proceso. Que en breve, una vez que confirmemos que nos gusta así, se pondrán a trabajar con la parte de diseño de imagen.

**¿Cómo vienes? ¿Has podido adivinar algunos de los pasos que la compañía realiza aún cuando el cliente no se entera?**

Haremos de cuenta que todo siguió bien, que no se descubrieron errores, que no hubo atrasos, que el cliente estuvo satisfecho con cada paso hasta el momento de lanzar la página al mercado, abierta y con una URL comercial.

*Spoiler*: los proyectos raramente son lineales y la relación con el cliente (o producto, si estamos trabajando en forma interna en nuestra propia organización) suelen estar llenas de desafíos comunicacionales. No es fácil armar una lista de requerimientos exhaustiva y que cumpla con todos los deseos del cliente y no es fácil para el cliente transmitir todos esos deseos.

### ¿Qué es lo importante aquí?

Retrocedamos un segundo en el tiempo. Días 2 y 3. ¿Pudieron detectar el momento en el que el equipo de QA participó de la redacción de la propuesta?

**Día 30**: ¿Pudieron identificar el rol del equipo de testing antes de presentar un prototipo funcional al cliente?

Si no lo has descubierto, te sugerimos volver sobre el texto y buscar esas claves que hemos dejado para tí. Entender este proceso llevará varios intentos pero ganas mucho si ya desde el día 1 pones atención a cuál es la importancia de testear software lo antes posible y en la mayor cantidad de situaciones posibles.

**Descansa unos dos minutos**. Te lo has ganado.

¡Prepárate para tu primera ejercitación como tester!

---

###  ☑️  Super pro tip:

No es lo mismo QA que QC. ¿Qué pasa? Cuando se buscan roles, casi siempre se busca por las siglas **QA** (o sea, **quality assurance** que es "garantizador de calidad" o aseguramiento de la calidad). ¡Atención! ¡Es un truco!

El acto de testear un software es un acto de **QC** (o sea, de **quality control** - controlamos que la calidad sea la que prometimos). Y QA se refiere al responsable de garantizar que todo el proceso desde los requerimientos hasta el final cumpla con los estándares de calidad prometidos. Que incluye, por supuesto, hacer testeos de código, pero también incluye procesos de desarrollo de código, testeos unitarios, testeos estáticos y otros procesos que tal vez un tester no realice nunca, ya que caen bajo la responsabilidad de los desarrolladores de software.


---

## <img src="https://img.icons8.com/ios/50/null/hand-drag.png"/> ¡MANOS A LA OBRA! 

Vamos a poner a prueba todo lo que hemos leído hoy. Este desafío lo debes resolver en forma individual.

¿Por qué hacemos esto? A veces en equipo, a veces en forma individual. Como te fuimos anticipando, quien debe asimilar los conocimientos eres tú. Y el equipo está para sostenerte cuando tienes una duda.

Hay otros momentos en los que el conocimiento se consolida (se hace real y lo puedes utilizar en nuevas situaciones) solo cuando lo pones en acción en el equipo, e intentas explicar a otros eso que acabas de aprender. Confía en nosotros, sabemos de lo que hablamos.

### :star: EJERCICIO 1

Listos, preparados, ya… para dar inicio al primer **¡Manos a la obra!**

1. Ingresa a la siguiente página (no te dejes engañar por el nombre) haciendo click en el enlace: [https://www.theworldsworstwebsiteever.com/](https://www.theworldsworstwebsiteever.com/)


-> **Solución**: Ingresar al enlace y recorrer la página.

2. Busca el enlace a la página original: The original twwwe.
¿Qué tan fácil te resultó encontrarlo? ¿Aún no lo encontraste? La primera palabra de esta consigna es una pista: “Busca”. ¿Dónde buscarías algo que no conoces en la web?

-> **Solución**: utilizar el buscador de Google para encontrar el enlace a la página original. En el buscador se debe escribir, como dice en el ejercicio, “The original TWWWE”.

3. Hagan click en el enlace hallado en el punto anterior e ingresen al mismo.

-> **Solución**: acceder a “The original TWWWE”.

4. Dentro de la página, busca el enlace **amazing colours** y haz click allí. ¿Qué hace ese botón? ¿Cuál es la relevancia de este enlace?

.> **Solución**: En “The original TWWWE” buscar el enlace de AMAZING COLOURS.

Hay que hacer scroll horizontal para tener mas opciones del NavBar y llegar a AMAZING COLORS 

![image](https://user-images.githubusercontent.com/72580574/213883344-a6a3ed8f-6887-45b8-a004-4355996e8da9.png)


Haciendole click lleva aca 

![image](https://user-images.githubusercontent.com/72580574/213883428-4152b168-7e81-487e-a7e6-f1717816cef3.png)


Inspeccionando la web se ve que el NavBar ni siquiera es semnaticamente eso, ya que es una TABLA, por lo que el href lleva a cualquier lado¨
```
<td class="menuitemz">*<a href="colors.htm">Amazing Colors</a></td>
```

Y la parte de Amzing colors de nuevo esta con un div arriba y abajo paa la parte negra con las luces blancas, sin id, ni nada, sin significado semantido y la parte del texto de nuevo es una table.

5. Haz click en **shocking pictures**. ¿Qué más hace la página al llevarlos a esa sección? ¿Se la puede llamar sección?

-> **Solución**: Analizar el comportamiento de “SHOCKING PICTURES!” y pensar desde su perspectiva y experiencia qué conciben sobre el comportamiento de esa “sección”.

Ni siquiera se puede encontrar el ink, ni con ctrl+f y buscando la palabra.

6. Busca el enlace para volver a la página de “Inicio”. Vuelve de alguna manera: ¿De qué forma lo has hecho? Prueba que funcione cada una de las alternativas que se te hayan ocurrido.

-> **Solución**: Hay dos URL para volver a la página inicial: (1) [https://www.twwwe.com/](https://www.twwwe.com/) y (2) [https://www.theworldsworstwebsiteever.com/](https://www.theworldsworstwebsiteever.com/)

Si se hace click en el enlace donde dice “click here” te llevará a una lista de errores de la página.

![image](https://user-images.githubusercontent.com/72580574/213883636-4dfedb0f-a958-4efe-9352-eeeb7a2501ca.png)


Es muy dificil, arriba donde esta el nombre, que bien podria ser el logo, no tiene link a la home principal ydonde se lee MAIN MENU no hay un link a home, y cuando bajas en cada seccion tampoco tenes un volver.

7. Haz click en el enlace **Our FAV Software**. ¿Puedes observar enlaces de descarga del software mostrado? ¿Y qué cambio logras observar en el encabezado?

-> **Solución**: Dentro de [https://www.theworldsworstwebsiteever.com](https://www.theworldsworstwebsiteever.com) o [https://www.twwwe.com/](https://www.twwwe.com/) (dependiendo cuál enlace hayas utilizado en el punto 6), tenemos que hacer click en el enlace que dice “Our FAV Software”


![image](https://user-images.githubusercontent.com/72580574/213883687-8e83af00-6911-4b34-8546-f53c3eb0a7b8.png)

No se observan enlaces de descarga del software mostrado.

En el encabezado, la letra “P” de “Phab Fonts” ya no es blanca.

Al inicio luce así:

![image](https://user-images.githubusercontent.com/72580574/213883703-aa601d82-1502-42a2-a002-14944afd4e56.png)

Pero dentro de “Our fav software” luce así:

![image](https://user-images.githubusercontent.com/72580574/213883716-d124bc72-1a23-4762-ae00-a3a699e61b41.png)


8. Regresa nuevamente al inicio. ¿Qué forma has hallado para regresar esta vez?

-> **Solución**: No hay ningún enlace para regresar al inicio. Es necesario hacerlo manualmente:

1- Ingresando la URL de la página en nuestro navegador nuevamente

![image](https://user-images.githubusercontent.com/72580574/213883731-5bee0e88-351a-4a15-99db-53f3a72ee750.png)

2- Utilizando el botón de regresar en el navegador

![image](https://user-images.githubusercontent.com/72580574/213883747-f700ddba-0ea1-42e3-b929-5b091e6ce91d.png)


9. Utiliza el reproductor de audio de la web. ¿Qué pasa cuando das play? ¿Se visualiza correctamente? ¿Se puede utilizar el comando de volumen? ¿Queda completamente visible si tratas de hacer doble click en el volumen?


-> **Solución**: Este es el reproductor:

![image](https://user-images.githubusercontent.com/72580574/213883785-09e04776-b01d-48aa-af2f-97b649e5fb99.png)



Se visualiza correctamente.

Se puede utilizar el comando de volumen.

Si tratas de hacer doble click en el volumen, queda completamente visible. Pero si uno ingresa a las opciones, se visualizan incorrectamente la velocidad de reproducción.

10. ¡Encuentra si hay otro enlace oculto dentro de la página web!

-> **Solución**: ¡Si encuentras uno, coméntalo con tu equipo!

---

## <img src="https://img.icons8.com/ios/50/null/hand-drag.png"/> ¡MANOS A LA OBRA! 

![image](https://user-images.githubusercontent.com/72580574/213809096-4b27a7f3-8920-463c-9b52-b1e59e510bed.png)



---


Luego de un esfuerzo individual y personal, nos volvemos a encontrar con nuestros compañeros de equipo del día de hoy.

Les dejamos algunos disparadores para que retomen la conversación:

- ¿Qué buenas prácticas del diseño web pudieron inferir a partir de este ejercicio? (inferir: extraer una conclusión a partir de uno o varios casos particulares)

- ¿Les costó el idioma de la página para resolver el ejercicio?

- ¿Qué sintieron como usuarios al intentar navegar por una página web como la del ejercicio?


![image](https://user-images.githubusercontent.com/72580574/213809214-27eec3fb-f1ab-4b15-942e-768340ae4a9a.png)

---

### Sabemos que has hecho un gran esfuerzo hoy.

- Te adaptaste a un entorno nuevo, conociste otros estudiantes como tú y has asimilado muchas palabras nuevas.

- Tal vez no te haya costado tanto, tal vez sí.

- Estamos para pedirte un último esfuerzo. **¡Un ejercicio más para hoy!**

---

## :star: ATENCIÓN AL DETALLE 

Además de aprender las herramientas y los conceptos fundamentales del testing, vamos a estar trabajando sobre el desarrollo de habilidades esenciales para que nos desempeñemos sin errores desde el primer minuto como testers.

**La atención al detalle** es una habilidad que, como todas las habilidades, se entrena. Les proponemos un pequeño ejercicio de atención al detalle muy propio de las pruebas técnicas que pueden encontrar en una entrevista de trabajo. No se preocupen por cómo les va hoy. Usen sus resultados para entender mejor cuán desarrollada tienen esta habilidad y si tienen oportunidades para mejorarla con el tiempo.


Para poder detectar bien en dónde te encuentras con esta habilidad, primero resuelve los ejercicios en forma individual (20 minutos) y luego abre la conversación en la sala (15 minutos) para ver cómo les fue a tus compañer@s.

¿Qué dices? ¿Contamos contigo unos minutos más?


### ¿Listos? Arranquemos:

Todos los empleados de una empresa vuelven a trabajar a la oficina luego de unas vacaciones y es hora de revisar los papeles y ponerlos en orden.

La empresa está pasando por un gran momento, y para acompañar este crecimiento es necesario revisar muchos de los procesos realizados por el área administrativa.

El equipo es cada uno de los presentes en la mesa de trabajo del día de hoy. Ya están listos para llevar adelante este desafío y convertirse en auditores internos de la organización. Que esto suceda de forma correcta, depende de cada integrante. **Tienes 4 tareas por realizar**.

¡Atención! Tendrán una restricción: solo cuentan con menos de 20 minutos.

¡Corre el tiempo! ¡Éxitos!

---

## 📋 Tarea 1

Su empresa ha estado trabajando para agregar comprobantes de pago antiguos en papel a su nuevo sistema digital. Se te ha asignado la tarea de verificar la digitalización para asegurarte de que los detalles de la copia en papel se hayan ingresado en el nuevo sistema con precisión.

Compara cada elemento en la lista a continuación para ver si la versión que se muestra en tu pantalla coincide con la copia en papel.

Cualquier detalle cuenta

![image](https://user-images.githubusercontent.com/72580574/213809499-a2c57903-a4f7-4499-98d5-6a6e7ac84afe.png)

-> **respuesta**:

A continuación, detallaremos todos los items para que respondas si coincide o no la copia en papel con la copia digital.

```
     item           coincide
----------------   ----------
nombre                 si
nª de orden            no
monto total            si
código de descuento    si
dirección de entrega   no
nª de seguimiento      no
n! de cuenta           si
```


##  📋 Tarea 2

El equipo de Administración ha enviado los dos informes a continuación, que cubren los datos de ventas y bonificaciones de siete empleados. ¿Qué empleados tienen información diferente listada entre los informes? Seleccione todas las respuestas correctas.

Puedes ayudarte con lápiz y papel #oldstyle

![image](https://user-images.githubusercontent.com/72580574/213809583-49afb8f6-1ab9-40e5-94d4-4e545306d90b.png)


![image](https://user-images.githubusercontent.com/72580574/213809623-32a68dc9-9bba-4e87-b548-10377a273428.png)

- Empleado 705 -> NO COINCIDEN TODOS

- Empleado  801 -> todos los datos son iguales

-  Empleado 303 -> NO COINDIDEN TODOS (ventas)

- Empleado  207 -> todos los datos son iguales

- Empleado  406 ->   todos los datos son iguales

- Empleado  504 -> NO COINCIDEN TODOS (% ventas y bonus)

- Empleado  102 ->  todos los datos son iguales


## 📋 Tarea 3

En medio de la auditoría interna, el equipo está cubriendo a un compañero de trabajo que está de licencia. Su compañero de trabajo ha dejado un mensaje de correo de voz especificando las tareas que tendrá que hacer alguien del equipo por él.

“¡Hola! Muchas gracias por cubrirme. Lo principal que debes hacer es completar la hoja de cálculo de ingresos mensuales. Puedes hacerlo buscando los últimos ingresos publicitarios en los informes de marketing. Después de hacer todo eso, continúa y revisa mi correo electrónico - lo he redirigido en forma automática al @info para que todos lo reciban- y mi correo de voz en mi teléfono de escritorio para ver si hay alguna solicitud de los ejecutivos. Si hay tales solicitudes, hazlas primero a menos que tengas una solicitud de emergencia de otro departamento. Una vez que hayas terminado con la solicitud de cumplimiento, ¿podrías regar la planta de mi escritorio después de apagar la computadora? Ah, espera, debería haber mencionado un par de cosas: debes iniciar sesión con tu usuario de administrador para ver los informes de marketing, y tendrás que enviarme un correo electrónico de actualización justo después de que termines de manejar las solicitudes. Bueno, gracias de nuevo. ¡Eres de gran ayuda! Te debo el almuerzo cuando regrese.”

¿En qué orden colocarías las tareas? ¿Podrías animarte a priorizarlas?

1. Completar la hoja de cálculo

2. Iniciar sesión con el usuario administrador

3. REvisar ingresos poblicitarios

4. Revisar correo electrónico

5. Revisar el correo de voz

6. Completar solicitudes ejecutivas

7. Completar solicitudes de emergencia

8. Enviar email de actualización

9. Revisar el correo de voz



## 📋 Tarea 4

Pablo tiene algunos comprobantes de pago para cargar al sistema digital. También tiene dos personas que lo van a estar asistiendo. Juan y María.

Pablo ya cargó 3 comprobantes de pago y dividió los restantes en partes iguales entre él, Juan y María. Juan y María han cargado la mitad de los comprobantes de pago que han tenido asignadas.
Entre los 3, tienen 4 comprobantes de pago restantes.

¿Con cuántos comprobantes arrancó Pablo?

**Respuesta** : 9

---

¿Ya has realizado las 4 tareas? ¡Bien hecho!

---

 ## ⏰ ¡Hora de cerrar! 
 
 ¡Lo hemos logrado! Has llegado al final del primer encuentro.
Tómense 15 minutos como equipo para conversar sobre el ejercicio de atención al detalle.

Les dejamos algunas preguntas disparadoras:

1. ¿Qué pudieron descubrir sobre sus propias habilidades de atención al detalle? ¿Les es familiar esta habilidad?

2. En Egg creemos en la potencia del equipo. ¿Cuántas veces hoy recurrieron a la ayuda de otros integrantes del equipo?   ¿Ayudaron a algún integrante?

Recuerda que los equipos cambian en cada encuentro. En el próximo, no necesariamente te encontrarás con el mismo equipo de hoy.



¡Gran momento para recordar qué son los pulsos y cómo los pueden aprovechar mientras aprenden! Este breve video les recuerda cómo se utilizan los pulsos para armar los equipos en el futuro.

---

:tv: [Ver Video sobre Pulsos](https://youtu.be/beYoGWOU_bk)

---
