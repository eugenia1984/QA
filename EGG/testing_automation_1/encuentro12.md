# :computer: ENCUENTRO 12 

--- 

##:book: Temas:

-  Introducción a versiones de un sitio en Github con ChatGPT 

- ChatGPT como herramienta de optimización 

- ChatGPT para la página principal 
 
- ChatGPT para la página de “servicios” 

- ChatGPT para mejorar el CSS 

- Desafío del día 

- Recuperatorio 

-  Despedida

---

## :computer:  INTRODUCCION A VERSIONES DE UN SITIO EN GITHUB CON CHATGPT

¡Te damos la bienvenida a la última clase de Programación Web desde Cero! 👋

Queremos felicitarte por haber llegado hasta aquí. A lo largo del curso has aprendido nuevos conceptos que te ayudaron a crear tu primer sitio web y publicarlo en tu portfolio personal.

Hoy veremos cómo la inteligencia artificial puede ayudarte a optimizar tu sitio y sugerir cambios en el mismo. Utilizaremos la herramienta chatGPT para trabajar durante la clase de hoy e iremos probando algunos cambios en el sitio web ya creado por cada uno de ustedes.

¡Comencemos! 🚀

---

## :computer:  ChatGPT como herramienta de optimización 

ChatGPT es un programa de inteligencia artificial diseñado para responder preguntas y mantener conversaciones con las personas.

Cuando interactúas con ChatGPT, le puedes hacer preguntas o simplemente iniciar una conversación. El modelo analiza la información que le das y trata de generar una respuesta relevante basada en su conocimiento previo.

En esta oportunidad, nuestras conversaciones van a estar orientadas a programación web.

💡Para que ChatGPT “responda” de la forma que nosotros esperamos, es necesario hacer preguntas específicas y también entender sobre el tema que estamos consultando. Por eso, hemos construido nuestro sitio web desde cero para hoy contar con las capacidades necesarias para preguntar con especificidad y también evaluar si es útil su respuesta.

---

## :computer:  ChatGPT para la página principal 
 
 Hoy, tu sitio web seguramente tenga similitudes con este ejemplo:
 
 ![image](https://github.com/eugenia1984/QA/assets/72580574/2f970058-9893-4e16-bd6a-0549753f7955)

A continuación, comenzaremos a realizar cambios en nuestro código según sugerencias de chatGPT ingresando 👉chat.openai.com

Vamos a hacer:

Cambios en la página principal

Cambios en la página de servicios

❗Recuerda crear una nueva carpeta con el nombre de “Sección 12 - Versiones con Chat GPT” y hacer una copia de los documentos sobre los que venías trabajando. Luego, abre la carpeta en Visual Studio Code.

Arranquemos entonces con los cambios en la página principal:

Actualmente, tu pie de página (o “footer", como se llama comúnmente) tiene un diseño básico. Entonces, podemos pedirle a chatGPT que cree un footer más elaborado  por nosotros.

¿Eso es todo lo que le vamos a pedir? ¿Así a secas? ¡En absoluto! Usemos la inteligencia artificial a nuestro favor para requerir códigos más complejos. 

Veamos el siguiente ejemplo: Le pedimos al chatGPT que genere un footer con un color de fondo específico, un color de tipografía blanca y un botón con un estilo específico.

![image](https://github.com/eugenia1984/QA/assets/72580574/b87e1f62-81b4-4062-bfa9-23451c4c23a5)

Para esto, debemos copiar en el chat nuestro documento de HTML entero y pedirle que cree una variación de nuestro footer con una sintaxis similar a esta:

“Teniendo en cuenta este HTML, crea un nuevo código CSS que haga que el footer tenga un color X, las letras en el mismo sean de color y tamaño X y que el botón tenga un estilo específico para ese elemento”.

Como respuesta, el chat nos brindará un código CSS que tendremos que añadir al final de nuestro archivo CSS.

Si aplicamos los cambios que nos ha devuelto las herramienta en el ejemplo anterior, el resultado final se visualizará de la siguiente forma:

![image](https://github.com/eugenia1984/QA/assets/72580574/419050fa-c11c-4aa2-be20-1b87ee94ae2e)

Muy bien, pasemos ahora a utilizar ChatGPT para generar cambios en el diseño de la página principal del sitio web, específicamente sobre el footer, la barra de navegación  y el video.

¡Manos a la obra!

1. Ir a la página del ChatGPT 👉chat.openai.com.

2. Iniciar una conversación con ChatGPT.

3. Copiar y pegar el código HTML completo de la página principal en el chat.

4. Solicitar a ChatGPT que genere un nuevo código CSS para modificar el footer, la barra de navegación y los estilos del video. 

Puedes especificar los cambios deseados, como el color de fondo, el color y tamaño de la tipografía, el estilo del botón, la ubicación del video, etc.

5. Copiar y añadir el código CSS al final de tu archivo de estilos existente en la carpeta correspondiente. El código anterior puedes dejarlo en formato de “/* comentario */” por si luego quieres volver al diseño original.

6. Observar y analizar cómo se ven afectados el footer, la barra de navegación y el video con los cambios aplicados.

¡Listo! 🙌
Solo queda que realices los ajustes adicionales en el CSS si es necesario para lograr el resultado deseado.

Luego, continuaremos con la página de “servicios”...

---

## :computer:  ChatGPT para la página de “servicios” 

La página de “servicios” que has creado (o del tópico que hayas elegido) probablemente tenga una estructura similar a la siguiente:

![image](https://github.com/eugenia1984/QA/assets/72580574/deddbb40-6d86-48c3-a176-9e20bf015c61)

¿Qué sucede si le pedimos a ChatGPT que genere una sección de servicios desde cero con su CSS correspondiente para reemplazar la actual?

Aprovechemos y pidamos una estructura distinta, como por ejemplo, que contenga imágenes:

![image](https://github.com/eugenia1984/QA/assets/72580574/1996dc62-0968-460a-ac4a-c40ccdf679ae)

Aquí deberíamos esperar un código HTML y un código CSS dado que estamos pidiendo que se modifique la estructura.

Si reemplazamos el código HTML de nuestra página de servicios por el provisto por ChatGPT y añadimos también el estilo CSS que obtuvimos en la carpeta correspondiente, obtendremos un resultado similar al siguiente:

![image](https://github.com/eugenia1984/QA/assets/72580574/93335600-cd3c-491d-841c-1e043806f133)

💡ChatGPT no te dará los archivos de las imágenes sino que creará en el código un ejemplo para que lo reemplaces. Puedes descargar imágenes desde el sitio de 👉freepik.

Ahora, veamos qué sucede si queremos que las imágenes adopten una organización horizontal:

Una opción sería aplicar un CSS propio a la clase “.service” con lo que has aprendido hasta el momento.

```CSS
.service {
   text-align: center;
   margin: 20px;
   width: 30%;
   display: inline-block;
}
```

Y se vería así:

![image](https://github.com/eugenia1984/QA/assets/72580574/020a6452-28ad-4f6e-8026-ea9960ac2c19)

O bien, en este caso, otra opción sería pedirle a ChatGPT que haga este código por ti.

¡Vamos a la obra!

1. Ir a la página del ChatGPT 👉chat.openai.com.

2. Iniciar una conversación con ChatGPT.

3. Solicitar a ChatGPT que genere el código HTML y CSS para la sección de servicios, con una estructura distinta y que incluya imágenes. 

Recuerda que ChatGPT no proporcionará los archivos de las imágenes, sino que creará ejemplos para reemplazar.

4. Pegar el código HTML de la página de servicios con el generado por ChatGPT. No elimines el código original, déjalo en formato de ``“<!-- comentario –>”``.

5. También, reemplazar el estilo CSS  con el generado por ChatGPT. No elimines el código original, déjalo en formato de “/* comentario */”.

6. Comparar los códigos que has creado con los devueltos por ChatGPT. 

¡Listo! 🙌

Observen si son iguales o diferentes, y analicen cómo difiere el resultado en el sitio web. Pueden considerar aspectos como la estructura, el diseño, la organización de las imágenes y cualquier otra diferencia que encuentres.

Genial, avancemos…

---

## :computer:  ChatGPT para mejorar el CSS 

Comprobemos ahora si es posible que esta herramienta nos de sugerencias para optimizar nuestro CSS. Intentemos algo así:

“Tu tarea es optimizar el siguiente código CSS: (recuerda pegar el CSS de tu sitio)”

![image](https://github.com/eugenia1984/QA/assets/72580574/9fd0dcb3-9f63-4f6d-9531-21b9608bad7d)


Seguramente ChatGPT devolverá una serie de comentarios y un código CSS modificado.

Ahora, ¿qué tal si lo ponemos en práctica?:

¡Manos a la obra!

1. Ir a la página del ChatGPT 👉chat.openai.com.

2. Iniciar una conversación con ChatGPT.

3. Copiar y pegar el código CSS de tu sitio en la ventana de chat.

4. Pedir a ChatGPT que optimice el código CSS y observar las sugerencias que devuelve.

5. Analizar las diferencias entre la versión original y la versión optimizada: ¿Qué cambios se realizaron?, ¿comprendes todas las funciones del nuevo código?

6. Aplicar los cambios sugeridos por ChatGPT en tu sitio web.

¡Listo! 🙌

Verifica si el nuevo código funciona correctamente y haz las iteraciones que creas necesarias.


---

## :computer:  Desafío del día 


¿Pueden creer que llegamos al último desafío del curso? ¡Fantástico!

El mismo consiste en crear un sitio web desde cero con ayuda de ChatGPT por cada mesa de trabajo. Es decir, deberán armarlo en equipo.

¡Empecemos!

1. Crear un ambiente de trabajo adecuado.

Antes de empezar necesitan crear un espacio de trabajo. Para ello, deben armar una carpeta que se llame “mi primera web con ChatGPT”. Dentro de esta carpeta, añadan 3 archivos y una carpeta de imágenes:

index.html

styles.css

scripts.js

Carpeta “Imágenes”

Te compartimos la siguiente imagen a modo de referencia:

![image](https://github.com/eugenia1984/QA/assets/72580574/2f561044-bdb0-4221-9f99-b20695e5f5e4)

2. Definir el tema del sitio

Luego, deberán elegir qué tipo de sitio web quieren construir como por ejemplo:

Sitio de adopción de mascotas.

Sitio para un restaurante.

Sitio para un portfolio personal.

💡De preferir alguna otra opción, pueden pedirle a ChatGPT que genere  ideas de temáticas para un sitio web: “Quiero que me proporciones 5 ideas con temáticas diferentes para crear un sitio web”.

![image](https://github.com/eugenia1984/QA/assets/72580574/e4678b17-dc8b-4cc0-8277-7872de81581c)


3. Generar el código HTML.

Una vez que ya tengan elegida la temática pueden pedirle al chatGPT que genere una “landing page” (la página inicial del sitio) sobre el tema escogido. 

💡Pedir que genere una landing page completa hará que el sitio web se vea más profesional, ya que va a incluir elementos como links a redes sociales, botones, o banners.

Por ejemplo: “Generar una landing page completa de un sitio para la adopción de mascotas”.

![image](https://github.com/eugenia1984/QA/assets/72580574/2f81e282-88aa-4202-9707-1e821f55f754)

Veamos qué sucedió en la imagen anterior: el chat nos devolvió un texto que no es funcional para pegar en nuestro “index.html”, por lo que ahora tenemos que ser más específicos y pedirle que genere el HTML correspondiente.

Por ejemplo: “Genera el HTML para el ejemplo anterior”.

![image](https://github.com/eugenia1984/QA/assets/72580574/188988be-f298-4f5c-94e8-beb2ba36abcd)


Ahora sí, van a poder copiar el código en el “index.html”, y con la opción de “Go live” podrán ver cómo se visualiza en el navegador. 

Les mostramos un ejemplo:

![image](https://github.com/eugenia1984/QA/assets/72580574/2abaf695-8a15-4b08-a4eb-085b3f55b66e)

4. Generar el código CSS.

Con el código HTML terminado es momento de centrarse en el CSS, para lo cual, pueden recurrir nuevamente al chat para pedirle que lo genere.

Algunos atributos específicos que se podrían requerir son:

Que cuente con el uso flexbox

Que cuente con colores específicos 

💡Es importante tener en cuenta que, tanto los estilos CSS como los scripts, deben estar linkeados de la forma que vimos en clases anteriores.

Les compartimos un ejemplo:

![image](https://github.com/eugenia1984/QA/assets/72580574/ac010136-f00f-4438-afc4-4d1b9da69764)


Tengan en cuenta que este es un ejercicio libre y pueden modificar el código de la manera que lo deseen. La idea es ver qué opciones les proporciona Chat GPT y de qué forma puede ayudarles a optimizar el sitio web. 5. Buscar e incorporar imágenes.

¿Qué es un sitio web sin imágenes? Seguramente un lugar muy aburrido y poco interesante para ver. 

Por esto, deben buscar algunas imágenes que sean de su agrado para agregarlas al sitio y darle un toque más profesional.

Les compartimos algunos ejemplos de lo que podrían lograr:

![image](https://github.com/eugenia1984/QA/assets/72580574/152bfe98-555b-4780-bfe3-921131d1f897)

![image](https://github.com/eugenia1984/QA/assets/72580574/aa9d674a-8f2c-4c54-8020-27da45e42533)


6. Implementar JavaScript en el sitio.

Ahora, vamos a implementar JavaScript en el formulario:

Si su sitio no tiene uno creado, no se preocupen, ¡van a poder pedirle a ChatGPT que lo haga por ustedes!

Si ya lo tiene, pueden directamente pedirle que genere una validación con una alerta que le agradezca al usuario por haberlo completado. Por ejemplo: “Generar una validación para el formulario en JavaScript que produzca una alerta al usuario cuando le haga submit”.

Un ejemplo de código que podría proporcionarles sería el siguiente: 

![image](https://github.com/eugenia1984/QA/assets/72580574/d6530856-fd23-4b33-ba14-d5f72dcec8ec)

💡Recuerden “linkear” el script en el código HTML del sitio

![image](https://github.com/eugenia1984/QA/assets/72580574/0838da7b-86cd-414d-a5dc-ed11796e1ba5)

Al final deberían poder ver algo así:

![image](https://github.com/eugenia1984/QA/assets/72580574/870a9225-d692-46f8-9b30-bb878e2aa3a5)

7. Publicar el sitio web.

Por último, deben publicar este nuevo sitio web en GitHub tal como vimos en clases pasadas y compartir el link.

💡Ten en cuenta que no estás limitad@ a seguir solo nuestras sugerencias al utilizar ChatGPT para generar un sitio web. ¡Es una ocasión ideal para desatar tu creatividad y explorar diferentes enfoques!

---

##:computer:   Despedida

Hemos llegado al final de nuestro curso de Programación Web Desde Cero y sin lugar a dudas podemos decir que ha sido un viaje muy enriquecedor. 🎆

A lo largo de estas semanas hemos navegado a través del lenguaje HTML, los cimientos de cualquier página web, hasta las sutilezas de CSS y JavaScript, encargados de darle vida y estilo a nuestras páginas web. Creamos barras de navegación interactivas, optimizamos el contenido, hicimos un recorrido por GitHub y cerramos con broche de oro aprendiendo sobre ChatGPT.

¿Nos cuentas cómo fue tu experiencia?

👉Responder encuesta
Independientemente de si tu objetivo es trabajar en una empresa de tecnología, iniciar tu propio proyecto o simplemente aprender algo nuevo, estas habilidades que has adquirido son valiosas y útiles en el momento en que nos encontramos hoy. 

¡Esto es solo el comienzo! Recuerda que el aprendizaje en el mundo de la tecnología no es un destino, sino un viaje, por lo que la práctica es lo que hace al maestro. 

Finalmente queremos agradecerte por haberte animado a tomar este curso y te invitamos a que continúes aprendiendo con nosotros a través de las diferentes propuestas que tenemos preparadas para ti.

¡Felicitaciones por este logro y nos vemos pronto!

---
