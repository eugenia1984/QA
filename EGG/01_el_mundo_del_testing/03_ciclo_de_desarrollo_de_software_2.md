# :star2: 1.3 - Ciclo de desarrollo de software II

---

MÓDULO 1 ENCUENTRO 3 / 17


---

## :star: INTRODUCCION Y ROMPEHIELO ⏰ (15 MIN)

**¡Te damos la bienvenida a tu tercer encuentro de trabajo!**

Nos imaginamos que estas sesiones se están pasando rápido. Ya has logrado conocer a una docena de personas aproximadamente. Hoy conocerás más. Y tal vez, comiences a encontrarte nuevamente con alguien de encuentros anteriores.

Ya no es tan necesario que te expliquemos cómo comenzar, ¿o sí?

**¡Demos comienzo a la actividad del día de hoy!**

### Presentación del equipo:

Ya sabes cómo hacerlo. Toma tan solo unos minutos y cambia la experiencia de todo el equipo. Indica tu nombre y de dónde vienes.

Si lo creen necesario, aquí les dejamos una pregunta para abrir la sesión:

¿Podrían explicar qué es un algoritmo si se los pregunta alguien que no sabe nada de programación?

Si desean avanzar con la pregunta disparadora, utilicen unos 10 minutos.

Y prepárense para el encuentro de hoy: vamos a estar profundizando en los conceptos que exploramos en la sesión anterior haciendo hincapié en las transacciones de datos.

---

## CICLO DE VIDA DE DESARROLLO DE SOFTWARE ⏰ (25MIN)


(**SDLC** o **software development life cycle**, en inglés, ¿recuerdan?)

Sabemos que puede sonar repetitivo, pero estamos haciendo algo que se llama consolidación que es cuando recordamos algo que aprendimos y hacemos el intento de ponerlo en práctica y no solamente repetirlo como cuando estudiábamos de memoria... ¡si es que alguien sigue estudiando así!

**Strategy**: En el primer paso, ese en el que se toman los requerimientos del cliente y se comienza a pensar la estrategia con la que se va a resolver el proyecto o el producto, aparecen una serie de relaciones entre personas (usuarios, roles) y datos (que ingresan, se almacenan o se entregan al usuario).

#### ¿NECESITAS UN EJEMPLO? 

¡Pues claro que sí! Estábamos por dártelo.

En el encuentro pasado te pedimos que aprendieras sobre UML y cómo graficar los requerimientos de un pedido o un proyecto según este código de símbolos comunes que se usan en tecnología. Aquí hemos traído otro similar con el que vamos a estar trabajando hoy.

**Aplicación web de registro de hábitos:**

![image](https://user-images.githubusercontent.com/72580574/214429048-6285a50d-8519-4523-97b8-bb02f5f766c1.png)

Imagen 2.1: Casos de uso para un tracker de hábitos. Fuente: adaptado de https://app.diagrams.net/

---

## :star: ¡MANOS A LA OBRA! 

### Ejercicio #1

#### Instrucciones:

1. Observa detenidamente el gráfico de la imagen 2.1 y toma notas sobre lo que ocurre. Es una plataforma de registro de hábitos.

A- ¿Cuántos roles puedes identificar? (Un rol es un tipo de usuario con acceso diferenciado)

*Respuesta*: Tres roles: USER, COACH, ADMIN.

B-Identifica en qué situaciones hay intercambio de datos. Ej: usuario ingresa sus datos en el momento del login [nombre] y [contraseña].

*Respuesta*: 

Cuando el coach...

... agrega un comentario

Cuando el admin...

... elimina un usuario

... actualiza la lista de habitos

Cuando el usuario...

... agrega un habito

... elimina un habito

... marca un habito como hecho en el dia

2. Toma nota de lo que no sabes. Ej: no sé qué significa “include”. 

Cuando decimos “toma nota”, lo decimos de verdad. Anótalo de la forma que te sirva (papel, dibujos, notepad, word) pero haz el esfuerzo de capturar aquello que en este momento no entiendes.


Supongo que es similar a Java entonces el**Extend** es que *extiende* que *hereda de*, es decir que está la relación entre Clase Padre/Madre/super y clase hija.

Y probablemente el *include* sea para una inteface, que lo incluye, es la herencia multiple que ne realidad no tiene Java, es decir para ACTUALIZAR el historial dle habito se puede AGREGAR, BORRAR o MARCAR COMO REALIZADO dicho habito.


---

## :book: MATERIAL DE LECTURA ⏰ (15MIN)

### Manejo y transacción de datos:

#### Datos

Los **DATOS** son **representaciones simbólicas de determinados atributos, variables  cuanti o cualitativas**. Podemos considerar que son una **descripción codificada de un suceso o una entidad**. En tecnología digital, estos valores son recibidos por la computadora a través de distintos medios, y son manipulados a través de distintos procesamientos.

¿Cómo puede ser que hablemos de datos todos los días y nunca hayamos dicho que son una descripción codificada de un suceso?

¡A por un ejemplo se ha dicho! Cuando vemos la siguiente imagen:

<img width="215" alt="Screen Shot 2023-01-24 at 14 38 19" src="https://user-images.githubusercontent.com/72580574/214367023-7b7d79d0-31df-492b-9331-e315a57976ca.png">

¿Puedes decir qué estás viendo?

Eso que ha salido de tu cabeza es un dato. Frente a un evento (te mostramos una imagen), regresa un dato (en este caso, el dato es un gato).

*Tip de Inglés* (que en realidad es un tip de latín): **Dato** en singular es datum y casi nadie lo sabe y se usa muy poco. Pero lo que sí se usa y mucho es su plural: **DATA**. Entonces vamos a encontrar muchas veces que “datos” se presenta como data en inglés - y a veces también en español.

#### Metadatos

Apenas entendemos lo que es un dato, y tenemos que hablar de metadatos. Es necesario para que no exista confusión entre uno y el otro. 

<img width="674" alt="Screen Shot 2023-01-24 at 14 40 09" src="https://user-images.githubusercontent.com/72580574/214367511-5c98a0d9-dc39-42ae-abd7-449f143ac83f.png">



Los **metadatos** son la **descripción de los datos**. Podemos considerarlo como **“datos sobre datos”**. Describen qué sabemos sobre el dato. 

Se definen como **los datos que proporcionan información sobre uno o más aspectos de los datos**; se utilizan para resumir información básica sobre datos que pueden facilitar el seguimiento y el trabajo con datos específicos.

Una situación cotidiana puede ser: buscar en nuestro disco rígido todos los archivos que sean .pdf (metadato: tipo de archivo) para luego ordenarlos por tamaño (metadato: bytes que ocupan) y así eliminar aquellos que consuman mucho espacio de almacenamiento. 



---


## :star: ¡MANOS A LA OBRA! 

### Ejercicio #2 ⏰ (35MIN)

¡Entrada en calor rápida! 

En la siguiente tabla, identifica los datos y los metadatos:

<img width="698" alt="Screen Shot 2023-01-24 at 14 41 44" src="https://user-images.githubusercontent.com/72580574/214367860-0c43c942-73d0-43de-bbbc-d73048e39aee.png">

El dato es la celda con la informacion (las filas) y el meta dato es el nombre de cada columna.

Anota tus observaciones. ¿Dices que todo el equipo obtuvo los mismos resultados? Tómate un minuto para revisar por medio del chat y averigua qué piensan tus compañer@s sobre este ejercicio rápido. 

#### Impacto comercial de los metadatos

Los metadatos dentro de las páginas web también pueden contener  descripciones del contenido de la página, así como palabras clave vinculadas al contenido que hacen que al buscar algo online, los buscadores como Google o Ecosia (1) puedan entender mejor dónde encontrar lo que estás buscando. 

(1) https://www.ecosia.org/ es el buscador que planta árboles con tus búsquedas. ¿Qué más podemos pedir?

## Información

<img width="258" alt="Screen Shot 2023-01-24 at 14 42 54" src="https://user-images.githubusercontent.com/72580574/214368105-07e064e0-12bb-4ba2-8b31-e5e7bdb154c0.png">


Los sistemas de información son la integración de componentes para la recopilación, el almacenamiento y el procesamiento de datos para proporcionar información, contribuir al conocimiento y productos digitales que facilitan la toma de decisiones. Poseer información certera y a tiempo permite disminuir riesgos y mejorar la toma de decisiones.


La información tiene varias características que es importante que tengamos presentes. Antes de poner la lista, ilustremos la información con un ejemplo.

- Ejemplo A: “Los mejores lugares para vacacionar en abril son Brasil y Costa Rica.”

- Ejemplo B: “Los accidentes viales ocurren en su mayoría al amanecer y están protagonizados por jóvenes entre 18 y 15 años.”

Estos son dos ejemplos de información basada en datos. 

¿Qué datos se necesitaron para poder hacer estas afirmaciones? Para cada ejemplo, piensa qué datos estaban siendo buscados, dónde, con qué criterio se seleccionaron y qué datos te parece que pudieron haber sido dejados de lado. 

#### ¿NECESITAS UN EJEMPLO? 

**¡Para eso estamos!**

Pero vamos a usar un ejemplo nuevo:

“Los alimentos ricos en proteínas son buenos para la salud.”

-> ¿Qué datos se necesitaron para afirmar esto?

-Consenso de definición de “salud”

-Definición de qué es “rico en proteínas.” ¿Cuántas proteínas debe contener para entrar en esa categoría? ¿Cuándo es demasiada proteína?

-Investigación relevante que indique que hay una correlación entre el consumo de alimentos altos en proteínas y beneficios para la salud

-Definir para quiénes es bueno este enfoque. ¿Es lo mismo un niño que un adulto mayor?

-Investigar si existe alguien para quien esta dieta no esté indicada. 

Creemos que una afirmación así es información incompleta ya que no da cuenta de muchos datos que hemos descubierto como necesarios para tomar una decisión basada en esta información. 

---


## :star: ¡MANOS A LA OBRA! 

### Ejercicio #3

¡Ahora te toca a tí!

Vuelve a los dos ejemplos (A y B) y analiza qué datos pudieron haber dado origen a esa afirmación. E indica si presentan información completa o no.


**Habilidad esencial**: Cuando vemos información presentada como verdadera, nos debemos preguntar si faltan o no datos que nos ayuden a entender cómo fue lograda esa información. Esta habilidad es esencial en el mundo de la creación de software de buena calidad. ¡Los testers son muchas veces quienes hacen las mejores preguntas! Asegúrate de mantenerte siempre con la curiosidad y el juicio crítico encendidos al máximo.

### Características de la buena información

Lee estas características pensando en los ejemplos anteriores y el ejercicio que has realizado. ¿Pudiste detectar evaluaciones subjetivas en la información presentada?

- **Subjetividad**: El valor y la utilidad de la información son muy subjetivos, porque al momento de relacionar los datos y sus metadatos, puede que haya intereses detrás de cómo se presentan los mismos. Asimismo, lo que es información para una persona puede no serlo para otra.

- **Relevancia**: La información es buena solo si es relevante, es decir, pertinente y significativa para quien toma las decisiones. 

- **Oportunidad**: La información debe ser entregada en el momento correcto y en el lugar correcto a la persona correcta.

- **Exactitud**: La información debe estar libre de errores, porque la información errónea puede resultar en malas decisiones y erosionar la confianza de las personas o usuarios.

- **Formato de información correcto**: La información debe estar en el formato correcto para que sea útil para el tomador de decisiones.

- **Completa**: Se dice que la información está completa si el tomador de decisiones puede resolver satisfactoriamente el problema en cuestión utilizando esa información.

- **Accesibilidad**: La información es inútil si no es de fácil acceso para los tomadores de decisiones, en el formato deseado, cuando se necesita.
En el mundo de la tecnología, muchas veces como usuarios accedemos a información que está destinada a cambiar conductas (aplicaciones para entrenar, para registrar hábitos) o para consumir (comercio electrónico, compras y ventas), entre otras opciones. Es fundamental que cualquier información presentada a los usuarios cumpla con las características de la buena información ya que ayudará a generar confianza en el producto tecnológico y a lograr cumplir con el objetivo deseado en el usuario.

#### ¿Por qué es importante este tema para un tester?

Un tester es una pieza fundamental en el proceso de construcción de software de buena calidad. Para ello debe traer información sobre algo que no funciona como se espera y debe poder sostener su información en base a qué datos tomó para hacer esa afirmación. 

Muchas veces una sola persona haciendo pruebas debe detener el trabajo de otros equipos para poder volver a analizar una porción de código que no está dando los resultados esperados. 

¿Quieres seguir profundizando sobre la diferencia entre Información y datos? Te dejamos [este breve video](https://youtu.be/zH2pCkPP-Yg)

**Aprender ejercitando los conocimientos: transacciones**

#### Los sistemas de información recolectan datos para convertirlos en información a través de transacciones.

Vamos a poner en práctica todo lo que hemos visto hasta hoy, integrando conceptos en los siguientes ejercicios. 

Pro tip: intenta resolver los próximos ejercicios antes de leer el material. Eso hará que te esfuerces mucho más por comprender los conceptos, ayudando a que aprendas de manera más sólida y profunda. Luego de haber ejercitado, en caso que lo desees podrás reforzar con la lectura que se encuentra justo debajo de los ejercicios.

---



## :star: ¡MANOS A LA OBRA! 

### Ejercicio #4

A continuación, encontrarás una pantalla para conectarte a una red profesional de ofertas de trabajo y recibir consejos a nivel profesional.

A. Arma un listado de las posibles transacciones que pueden llegar a hacerse en la pantalla y recuerda que, si está indicado en color azul, puede llevarte a realizar alguna acción en el sistema.

B. Sugerimos que realices una puesta en común con tu equipo para evaluar más puntos de vista. Debate con tus compañer@s sobre la diferencia entre lo que ustedes se imaginan como una transacción completa y acciones únicas como son hacer clic, ingresar texto o “hover” con el mouse.


<img width="519" alt="Screen Shot 2023-01-24 at 14 47 57" src="https://user-images.githubusercontent.com/72580574/214369149-ca616f6e-f195-451c-a898-58ec5e6f290c.png">

### Ahora sí: Transacciones

En la programación informática, una transacción generalmente significa una secuencia de intercambio de información y trabajo o procesamiento relacionado (como la actualización de la base de datos) que se trata como una unidad y tiene el fin de satisfacer una solicitud y garantizar la integridad de la base de datos. 

Para que una transacción se complete y los cambios en la base de datos sean permanentes, la transacción debe completarse en su totalidad. 
Una transacción típica es un pedido de mercadería por catálogo. Un cliente llama por teléfono al centro de ventas y un representante del cliente recibe su llamado, detecta su necesidad y la ingresa en una computadora. La transacción del pedido implica 

verificar una base de datos de inventario, confirmar que el artículo está disponible, realizar el pedido y confirmar que se ha realizado el pedido y la hora prevista de envío. Si vemos esto como una sola transacción, entonces todos los pasos deben completarse antes de que la transacción sea exitosa y la base de datos realmente cambie para reflejar el nuevo estado de inventario y estar lista para un nuevo pedido. Si algo sucede antes de que la transacción se complete con éxito, se debe realizar un seguimiento de cualquier cambio en la base de datos para que se pueda deshacer.

¡Un poco más!


(2) clic es la ortografía correcta en español para la palabra “click” en inglés

(3) hover significa flotar en un lugar, sobre algo. En tecnología usamos hover (se pronuncia jáver en inglés y los escucharás como jóver en los hispanohablantes) porque es una acción muy distintiva de pasar el mouse como flotando por encima de un botón y que se despliegue un pequeño cartel (modal) que nos da mayor información sobre lo que hace ese botón.

---

## :star: ¡MANOS A LA OBRA! 

### Ejercicio #4  ⏰  (20MIN)

A continuación, tienes un texto típico que describe las transacciones esperadas en un producto. La redacción es similar a la que encontrarás en un texto original en una situación laboral con un cliente. 

A. Identifique en el texto las “transacciones”. Para ello, presta atención a todas las frases que puedan ser luego parte de un sistema, en las que se describen transacciones.

B. Una vez identificadas, puedes compartir tus hallazgos con tu equipo para compararlos.

C. En equipo, armen colaborativamente un listado enumerando todas las transacciones halladas. No olviden compartir pantalla y recuerden que tienen opciones para armar respuestas en conjunto en una pizarra compartida. En la guía del encuentro #1 les sugerimos algunas: Zoom, Jamboard o Excalidraw.

### Texto a analizar: Sistema de Airbnb

El área de Marketing ha decidido usar emails para las campañas masivas de venta. Han diseñado un email que, al mismo tiempo que recuerda al destinatario que puede aceptar y registrar una reserva de alojamiento que dejó incompleta, le ofrece un descuento interesante, el cual, si es seleccionado, le dará una rebaja del 15% en el alojamiento diario.

El email se envía automáticamente después de que el usuario efectúa una búsqueda concreta de un alojamiento en la página. Cabe destacar que ese mensaje se transmite sin descuidar la coherencia visual y diseño con otros elementos de la marca de Airbnb, como lo son el logotipo o los colores.

El email está personalizado y adaptado a las prioridades del usuario. Al mismo tiempo, deja claro que es una oferta que se ofrece a los tres primeros huéspedes que reserven, lo que subraya su exclusividad. El usuario percibirá el trato personalizado que la empresa le ofrece con este email, ya que es una oferta por tiempo limitado solo dirigida a este.

Es muy probable que le siga interesando viajar a ese destino y esa es una información muy valiosa para iniciar la comunicación. Si decide aceptar esta propuesta, haciendo clic en el botón al pie del correo, se le redirige directamente al sistema. Allí, se debe identificar como cliente, para luego ir a la propuesta en la que solo con hacer clic en aceptar, la propuesta se vuelve una venta. Luego el usuario elegirá entre las opciones de pago disponibles, mediante un clic del mouse en la opción de pago que prefiera.

**Super pro tip**: ¿Recuerdas que estuvimos trabajando en los dos encuentros anteriores en atención al detalle y en poder priorizar acciones?
Cuando nos comunicamos por escrito a veces pensamos que es lo mismo que hablar. Y enviamos mensajes poco ordenados, redundantes y con instrucciones confusas. Esto no es deseable pero es habitual ya que las habilidades de comunicación efectiva no son simples de adquirir. Requieren mucha práctica intencional y poder imaginarnos en los zapatos de esa persona que recibe nuestro correo e intenta adivinar qué necesitamos.

Verás que mucha ejercitación apunta a desarrollar estas habilidades, que son un gran diferencial en el desempeño profesional.


---

## Hora de cerrar! 

Si te animas, sé el que lidera el agradecimiento a tus compañer@s de equipo de hoy. Ya has cumplido 9 horas de instrucción en este módulo de Introducción al testing manual.

¿Cuántas palabras nuevas has aprendido en estos tres días? Asegúrate de usarlas al contar tus avances en el curso con tus amistades o tu familia.
Consolidarás tus conocimientos casi sin esfuerzo.

---


