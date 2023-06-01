# :star: ENCUENTRO 10 - 1 JUNIO - A PRACTICAR

---

##  Introducción

Hola ¡Nos encontramos de nuevo! 👋

En nuestra clase práctica de hoy nos enfocaremos en afianzar lo aprendido de una manera divertida y dinámica. 

¿Recuerdas lo que vimos en las clases anteriores? Pues hoy lo vamos a poner en práctica a través de 3 ejercicios que podrás compartir y trabajar en conjunto con tus compañeros. 

En esta oportunidad más que una guía te daremos pautas para que, como en un rompecabezas, vayas descubriendo poco a poco cómo encajan las piezas.

¡Vamos a por ello! 🧩🚀

---

## :computer: Ejercicio 1


En este ejercicio te desafiamos a crear una galería de imágenes en la que se pueda navegar de diferentes maneras. 

Realiza los siguientes pasos para completar el ejercicio:

1. Crear un nuevo archivo HTML. Dentro de la etiqueta <body> de este archivo, insertar un total de cuatro etiquetas <img> (cada una vinculada a una imagen distinta).

2. Asignar una clase a las etiquetas <img> para controlar la presentación de las imágenes. Puede ser, por ejemplo, “img”.

3. Establecer las propiedades “max-width” y “max-height” al 99% en el archivo CSS para esta clase. De esta manera, no tendrás que preocuparte por las variaciones en los tamaños de las imágenes.

Ahora, proseguiremos con la creación del carrusel o "slider" que nos permitirá visualizar nuestras imágenes de manera individual. 

4. Definir un contenedor Flexbox con la clase “image-slider”. Este contenedor alojará a tus imágenes y proporcionará una navegación fluida entre ellas.

5. Asignar a la clase “image-slider” un estilo de “display: flex” junto con propiedades que aseguren que el contenedor ocupe todo el ancho de la pantalla y que la imagen se centre tanto horizontal como verticalmente. 

6. Incluir dos botones; uno etiquetado como "anterior" y otro como "siguiente".

7. Declarar un array llamado “images” que contendrá las rutas a las imágenes que deseamos mostrar en el slider. 

💡Es recomendable que todas las imágenes se guarden en una misma carpeta para facilitar su localización.

8. Agregar una variable llamada “currentImageIndex” para llevar un registro de la imagen que se está mostrando en ese momento.

9. Asignar manejadores de eventos a los botones "anterior" y "siguiente". Debes actualizar “currentImageIndex” y cambiar el “src” de la etiqueta <img> para que cuando se haga clic en estos botones se muestre la imagen correspondiente.

10. Modificar el contenedor “image-slider” en el archivo CSS para que tenga un fondo negro, una altura de 600px y una posición relativa. Esto ayudará a que los botones queden bien posicionados y las imágenes se muestren de mejor manera.

11. Modificar los botones para que tengan una “position: absolute” dentro del contenedor, con el botón "anterior" alineado a la izquierda (“left: 0”) y el "siguiente" a la derecha (“right: 0”).

12. Asignar una clase llamada “button-slider”, que eliminará los bordes del botón, hará que su altura sea del 100%, su ancho del 10%, su color de fondo sea transparente, y su tamaño de fuente sea de 60px.

13. Cambiar el texto de los botones por los símbolos "&lt;" y "&gt;".

14. Usar el selector “.button-slider:hover” para que el botón cambie de color cuando el cursor pase sobre él. Si, por ejemplo, quisieras que el botón cambie a una tonalidad semitransparente podrías usar “background-color: rgba(255, 255, 255, 0.5);”, pero recuerda que tienes total libertad para elegir el color de tu preferencia modificando la función “rgba”.

15. Crear un nuevo contenedor con la clase “gallery-container” en donde se alojarán todas las imágenes de tu galería. 

💡Nuestro objetivo es que en dispositivos de escritorio se muestren tres imágenes simultáneamente mientras que en dispositivos móviles las imágenes se desplieguen una debajo de la otra. Para lograr esta disposición, puedes considerar la utilización de contenedores anidados para agrupar las imágenes adecuadamente.

16. Finalmente, agregar un botón en la parte superior de la página que funcionará como un interruptor, mostrando la galería de imágenes y ocultando el slider, y viceversa. 

El texto del botón debe cambiar dependiendo del estado: "Ver vista galería de imágenes" cuando se muestre el slider y "Ver vista deslizador de imágenes" cuando la galería esté visible.

¡Fin del primer ejercicio!

Te compartimos las siguientes imágenes a modo de referencia:


![image](https://github.com/eugenia1984/QA/assets/72580574/5bd8ae40-85ce-4fd8-bb37-075d15c76183)

---
  
## :computer: Ejercicio 2


En este ejercicio te desafiamos a desarrollar una tabla dinámica sobre diferentes países que cumpla con ciertas características. 

Esta tabla deberá: 

1. Contar con dos columnas: una para el "Nombre del país" y otra para un "Puntaje" que variará entre 1 y 1000.

2. Comenzar con cinco países cargados de forma predeterminada cuyos puntajes pueden ser asignados arbitrariamente.

3. Contener una funcionalidad para que los usuarios puedan añadir nuevas filas a la tabla.

4. Tener un botón que agregue una nueva fila al hacer clic en él en la parte de abajo de la tabla. Los usuarios deben ser capaces de rellenar esta fila con el nombre de otro país y asignarle un puntaje, pudiendo modificarlo directamente en la tabla (puedes usar la propiedad de “contentEditable” ).

5. Tener otro botón de "Reset" en la parte superior de la aplicación que restaure la tabla a su estado original. Puedes almacenar el estado inicial de la tabla como un array de objetos.

6. Contener una funcionalidad para guardar el estado actual de la tabla. Para ello, crea un botón en la parte superior de la aplicación que realice dicha acción. Al hacer clic por primera vez en él debe generar un menú desplegable (“select input”) que permita a los usuarios seleccionar qué versión histórica de la tabla quieren visualizar, actualizándose adecuadamente.

Te compartimos la siguiente imagen a modo de guía de cómo debería quedar la tabla:
  
 ![image](https://github.com/eugenia1984/QA/assets/72580574/e1fb0d93-a682-4ccf-b1c8-8c1dd50f4f11)

¡Ahora vamos a ponerle un poco de picante!🔥 A partir de aquí, puedes elegir si quieres profundizar en este ejercicio o continuar con el siguiente. 

¿Sigues ahí? ¡Genial! Continuemos entonces con las funcionalidades que debe tener la tabla para clasificar las columnas: 

7. La tabla debe ordenarse de forma ascendente o descendente, a modo de “toggle”, basándose en los valores de esa columna al hacer clic en el encabezado de cada una.

💡Vas a poder ayudarte con el método “sort()” de lo arreglos y usar funciones de comparación. Te dejamos el siguiente enlace para que puedas profundizar y conocer más al respecto 👉Array.prototype.sort().

8. Crear un botón de "Iniciar" que cambie su texto a "Parar" cuando se haga clic en él. Además, se debe ejecutar una función que modifique el puntaje de todos los países de la tabla de forma aleatoria cada tres segundos.

💡Puedes ayudarte con el método “setInterval()” que te permite ejecutar una función cada cierto tiempo. Te dejamos el siguiente enlace para que puedas profundizar y conocer más al respecto 👉setInterval(), junto con este otro enlace que te muestra cómo generar un número aleatorio 👉Math.random().

9. La tabla debe reordenarse de forma descendente por puntaje después de cada actualización.

10. Cada estado generado de la tabla se debe guardar en el “select input” de las versiones guardadas de la tabla. Al hacer clic en el botón de "Parar" este proceso debe detenerse.

¡Fin del segundo ejercicio!

Te compartimos el siguiente video para entender cómo se vería la tabla en acción:  [:tv: video](https://youtu.be/U8qi05PqPts)
 
---
  
## :computer: Ejercicio 3


En este ejercicio te desafiamos a armar una página web sobre tu artista favorito. Deberás crear un “index.html” el cual contendrá: una estructura básica de página web incluyendo un encabezado, un cuerpo y un pie de página.

Dentro del cuerpo de la página (<body>), deberás agregar por lo menos tres secciones diferentes que contengan información de tu artista que consideres relevante. Por ejemplo, podrías tener una sección acerca de su biografía, otra que haga referencia a su discografía y una tercera que incluya fotos o vídeos. 

❗Al sumar un vídeo de Youtube puede figurar el mensaje de “video no disponible” dentro del mismo. No te preocupes por esto ya que ocurre por derechos de autor. 

Además, deberás utilizar CSS para darle estilo.

💡Puedes basarte en los dos ejercicios anteriores para agregar un slider de imágenes con las portadas de sus discos y que a su vez muestre una tabla dinámica con la lista de las canciones de ese disco con una columna con un link a Spotify y otra columna para Youtube.

¡Y fin del último ejercicio!

Te compartimos la siguiente imagen a modo de inspiración:
  
  ![image](https://github.com/eugenia1984/QA/assets/72580574/7ed5103d-e4e1-4345-b848-803ccfedd6c1)

  
  
  
---  
