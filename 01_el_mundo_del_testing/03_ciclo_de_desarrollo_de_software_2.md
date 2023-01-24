# :star2: 1.3 - Ciclo de desarrollo de software II

## OBJETIVOS DEL MÓDULO 1

**¿Qué habilidades desarrollarás?**

- Aprendizaje cooperativo entre pares

- Atención al detalle

- Fundamentos de la lógica de programación

- Manejo y priorización de la información

- Herramientas mínimas de seguridad de la información

**¿Qué herramientas técnicas aprenderás?**

- Entendimiento del mundo del testing

- Ciclo de desarrollo de software

- Introducción al desarrollo ágil

- Lenguaje unificado de modelado (UML)

- Terminología fundamental

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


(SDLC o software development life cycle, en inglés, ¿recuerdan?)

Sabemos que puede sonar repetitivo, pero estamos haciendo algo que se llama consolidación que es cuando recordamos algo que aprendimos y hacemos el intento de ponerlo en práctica y no solamente repetirlo como cuando estudiábamos de memoria... ¡si es que alguien sigue estudiando así!
Strategy: En el primer paso, ese en el que se toman los requerimientos del cliente y se comienza a pensar la estrategia con la que se va a resolver el proyecto o el producto, aparecen una serie de relaciones entre personas (usuarios, roles) y datos (que ingresan, se almacenan o se entregan al usuario).

#### ¿NECESITAS UN EJEMPLO? 

¡Pues claro que sí! Estábamos por dártelo.

En el encuentro pasado te pedimos que aprendieras sobre UML y cómo graficar los requerimientos de un pedido o un proyecto según este código de símbolos comunes que se usan en tecnología. Aquí hemos traído otro similar con el que vamos a estar trabajando hoy.

**Aplicación web de registro de hábitos:**

<img width="446" alt="Casos de uso para un tracker de hábitos src="https://user-images.githubusercontent.com/72580574/214365956-fb157171-67e9-4b9c-8162-2a967b478d1d.png">


Imagen 2.1: Casos de uso para un tracker de hábitos. Fuente: adaptado de https://app.diagrams.net/

---

## :star: ¡MANOS A LA OBRA! 

### Ejercicio #1

Instrucciones:

1. Observa detenidamente el gráfico de la imagen 2.1 y toma notas sobre lo que ocurre. Es una plataforma de registro de hábitos.

A- ¿Cuántos roles puedes identificar? (Un rol es un tipo de usuario con acceso diferenciado)

B-Identifica en qué situaciones hay intercambio de datos. Ej: usuario ingresa sus datos en el momento del login [nombre] y [contraseña].

2. Toma nota de lo que no sabes. Ej: no sé qué significa “include”. 

Cuando decimos “toma nota”, lo decimos de verdad. Anótalo de la forma que te sirva (papel, dibujos, notepad, word) pero haz el esfuerzo de capturar aquello que en este momento no entiendes.

---

## :book: MATERIAL DE LECTURA ⏰ (15MIN)

### Manejo y transacción de datos:

#### Datos

Los datos son representaciones simbólicas de determinados atributos, variables  cuanti o cualitativas. Podemos considerar que son una descripción codificada de un suceso o una entidad. En tecnología digital, estos valores son recibidos por la computadora a través de distintos medios, y son manipulados a través de distintos procesamientos.

¿Cómo puede ser que hablemos de datos todos los días y nunca hayamos dicho que son una descripción codificada de un suceso?

¡A por un ejemplo se ha dicho! Cuando vemos la siguiente imagen:

<img width="215" alt="Screen Shot 2023-01-24 at 14 38 19" src="https://user-images.githubusercontent.com/72580574/214367023-7b7d79d0-31df-492b-9331-e315a57976ca.png">

¿Puedes decir qué estás viendo?

Eso que ha salido de tu cabeza es un dato. Frente a un evento (te mostramos una imagen), regresa un dato (en este caso, el dato es un gato).

*Tip de Inglés* (que en realidad es un tip de latín): **Dato** en singular es datum y casi nadie lo sabe y se usa muy poco. Pero lo que sí se usa y mucho es su plural: **DATA**. Entonces vamos a encontrar muchas veces que “datos” se presenta como data en inglés - y a veces también en español.

#### Metadatos

Apenas entendemos lo que es un dato, y tenemos que hablar de metadatos. Es necesario para quue no exista confusión entre uno y el otro. 

<img width="674" alt="Screen Shot 2023-01-24 at 14 40 09" src="https://user-images.githubusercontent.com/72580574/214367511-5c98a0d9-dc39-42ae-abd7-449f143ac83f.png">



Los metadatos son la descripción de los datos. Podemos considerarlo como “datos sobre datos”. Describen qué sabemos sobre el dato. 

Se definen como los datos que proporcionan información sobre uno o más aspectos de los datos; se utilizan para resumir información básica sobre datos que pueden facilitar el seguimiento y el trabajo con datos específicos.

Una situación cotidiana puede ser: buscar en nuestro disco rígido todos los archivos que sean .pdf (metadato: tipo de archivo) para luego ordenarlos por tamaño (metadato: bytes que ocupan) y así eliminar aquellos que consuman mucho espacio de almacenamiento. 



---


## :star: ¡MANOS A LA OBRA! 

### Ejercicio #2 ⏰ (35MIN)

¡Entrada en calor rápida! 

En la siguiente tabla, identifica los datos y los metadatos:

<img width="698" alt="Screen Shot 2023-01-24 at 14 41 44" src="https://user-images.githubusercontent.com/72580574/214367860-0c43c942-73d0-43de-bbbc-d73048e39aee.png">


Anota tus observaciones. ¿Dices que todo el equipo obtuvo los mismos resultados? Tómate un minuto para revisar por medio del chat y averigua qué piensan tus compañer@s sobre este ejercicio rápido. 

#### Impacto comercial de los metadatos

Los metadatos dentro de las páginas web también pueden contener  descripciones del contenido de la página, así como palabras clave vinculadas al contenido que hacen que al buscar algo online, los buscadores como Google o Ecosia (1) puedan entender mejor dónde encontrar lo que estás buscando. 

(1) https://www.ecosia.org/ es el buscador que planta árboles con tus búsquedas. ¿Qué más podemos pedir?


