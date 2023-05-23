# :star: ENCUENTRO 5 - 23 MAYO - Introducción a Integrando Javascript en el sitio web

---

## ¡Te damos la bienvenida a una nueva clase! 👋


En nuestro último encuentro aprendimos sobre los conceptos básicos de JavaScript y creamos una función simple para mostrar una alerta en una página HTML. 

Hoy exploraremos formas más avanzadas de integrar JavaScript en un sitio web; veremos las estructuras de control de flujo y el Modelo de Objeto de Documento (DOM), entenderemos qué son y cómo gestionar eventos y oyentes de eventos, manejo y validación de formularios. 

Al final de esta clase, lograrás implementar formularios y su validación correspondiente en la página HTML sobre la que vienes trabajando.

¡Arranquemos! 🚀

---

## :star: Estructuras de control de flujo


Las **estructuras de control de flujo** son utilizadas para controlar el flujo de ejecución del programa y tomar decisiones basadas en ciertas condiciones.

Algunos ejemplos de estructuras de control de flujo incluyen:

- **Estructuras condicionales**: if, else, else if → Se usan para ejecutar diferentes bloques de código dependiendo de si una condición es verdadera o falsa. 

- **Estructuras de bucles**: for, while, do-while → Se usan para repetir un bloque de código hasta que se cumpla una condición. 

- **Estructuras de control de excepciones**: try, catch, finally → Se usan para manejar errores en el código. 

Las estructuras de control de flujo **se pueden anidar unas dentro de otras, lo que permite crear programas complejos y avanzados**. También es importante tener en cuenta la eficiencia del código y evitar anidaciones excesivas o redundantes que puedan afectar el rendimiento del programa.

---

💡Para poder profundizar más sobre este tema, vas a poder acceder a este material complementario:

## Tipos de “estructuras de control de flujo”

Existen varios tipos de estructuras de control de flujo, sin embargo, aquí te detallamos acerca de las más comunes:

## Estructuras condicionales: “if”, “else”, “else if”.

Se usan para ejecutar diferentes bloques de código dependiendo de si una condición es verdadera o falsa.

- **if** → Se utiliza para ejecutar un bloque de código si se cumple una condición específica.

- **else** → Se utiliza junto con la instrucción "if" para proporcionar una alternativa cuando la condición no se cumple.

- **else if** → Se utiliza para agregar una nueva condición a un bloque "if" existente.

![image](https://github.com/eugenia1984/QA/assets/72580574/7c22427b-fb9f-4377-a2b0-49b58f2965f7)


En este ejemplo, se define una constante “mayorEdad” con un valor de 18 y luego se utiliza un condicional “if” para comprobar si “mayorEdad” es mayor o igual a 18. Si esto es verdadero, se muestra un mensaje en la consola indicando que la persona es mayor de edad.

Luego se utiliza un condicional “else if” para comprobar si “mayorEdad” está entre 18 y 25. Si esto es verdadero, se muestra un mensaje en la consola indicando que la persona es un adulto joven.

Finalmente, si ninguna de las condiciones anteriores es verdadera, se utiliza un
condicional “else” para mostrar un mensaje en la consola indicando que la persona es menor de edad.


## Estructuras de bucles: “for”, “while”, “do-while”.

Se usan para repetir un bloque de código hasta que se cumpla una condición.

- **for** → Se repite hasta que la condición que se está evaluando se cumpla.

![image](https://github.com/eugenia1984/QA/assets/72580574/4212d8a1-169f-4371-8567-698b6caae340)


En este ejemplo vemos un bucle “for” que se ejecuta cinco veces utilizando la variable "paso" como contador.

En cada iteración se imprime un mensaje en la consola que indica que se está dando el siguiente paso y se muestra el número del paso actual en la variable "paso".

**El ciclo continúa hasta que la variable "paso" alcanza el valor de 5** que es el número total de pasos especificado en la variable "pasos".

- **while** → Ejecuta una sentencia mientras la condición que se esté evaluando sea
verdadera.

![image](https://github.com/eugenia1984/QA/assets/72580574/29cc2296-aa1a-4328-a6e7-bcc9dae0fde2)


En este ejemplo se define una variable llamada "contador" con un valor inicial de 0. Luego, el bucle “while” se ejecutará mientras que el “contador” sea menor que 3. En el cuerpo del bucle, se incrementa el “contador” en 1 en cada iteración utilizando el operador “++”.

Una vez que el “contador” alcanza un valor de 3 y ya no se cumple la condición del bucle, este se detiene y se imprime el valor de contador utilizando “console.log”.

- **do while** → Ejecuta una sentencia al menos una vez y luego se repite mientras la condición que se está evaluando sea verdadera.

![image](https://github.com/eugenia1984/QA/assets/72580574/91abf7d8-d787-4c78-bc26-283f729cea91)


En este ejemplo, el bucle “do-while” se ejecuta al menos una vez, ya que la condición se evalúa al final del bucle.

Dentro del cuerpo del bucle, se incrementa el contador en 1 en cada iteración usando el operador de incremento “++”. Luego, se verifica si el contador sigue siendo menor que 3.

En la tercera iteración el valor del contador se convierte en 3 por lo que la condición ya no es verdadera y el bucle se detiene. Finalmente, se imprime el valor del contador en la consola.

En resumen, este código incrementa el contador hasta que alcanza un valor de 3 y luego imprime ese valor en la consola pero a diferencia del bucle “while” el bucle “do-while” se ejecuta al menos una vez, independientemente de la condición inicial. Para verficarlo podemos usar los dos ejemplos que acabamos de ver; ambos devuelven como resultado 3, pero si cambiamos la condición de salida de ambos bucles por contador < 0 entonces verán como en “while” el resultado es 0 y en el “do while” el resultado será 1. Esto se debe a que en este último la operación dentro del bucle sucede al menos una vez

## Estructuras de control de excepciones: “try”, “catch”, “finally”.

Se usan para gestionar errores en el código.

- **do while** → Ejecuta una sentencia al menos una vez y luego se repite mientras la condición que se está evaluando sea verdadera.

- **try** → Este bloque se utiliza para envolver el código que puede generar una excepción. Si esta se produce el control pasa al bloque “catch”.

- **catch** → Este bloque se ejecuta si se produce una excepción en el bloque “try”. Aquí es donde se maneja la excepción ya sea mostrando un mensaje de error o tomando alguna otra acción para recuperarse de la excepción.

- **finally** → Este bloque se ejecuta siempre después de que se hayan ejecutado los bloques “try” y “catch” independientemente de si se produjo una excepción o no. Es útil para realizar tareas de limpieza como cerrar archivos o conexiones de bases de
datos.

Por ejemplo: Supongamos que tenemos un código que intenta dividir dos números y mostrar el resultado por pantalla. Si el segundo número es 0, se produce una excepción de división por cero y se muestra un mensaje de error en su lugar.


![image](https://github.com/eugenia1984/QA/assets/72580574/b5a0a179-69cf-4b36-b982-f1dce5226769)


En este ejemplo el bloque “try” envuelve el código que realiza la división. Como el segundo número es 0 se produce una excepción y el control pasa al bloque “catch”. El mensaje de error se muestra en la consola. Finalmente, el bloque “finally” se ejecuta para mostrar un mensaje indicando que la ejecución del programa ha finalizado.

---

## :star: Manipulación del DOM


El DOM (“Document Object Model” o “Modelo de Objetos del Documento”) es una representación de la estructura de un documento HTML que se organiza como un árbol de objetos (“nodos”), donde cada objeto representa una parte del documento, como un elemento o un atributo.

En otras palabras, es una interfaz de programación de aplicaciones (API) que proporciona una forma estándar para que los programadores accedan y manipulen los elementos HTML de un documento web.

![image](https://github.com/eugenia1984/QA/assets/72580574/7e97ea10-714f-4e77-9c4d-db609913dfaf)

**JavaScript se utiliza para acceder a los objetos del DOM y manipularlos, lo que permite actualizar dinámicamente el contenido y la estructura de una página web en tiempo real.**

La manipulación del DOM puede incluir la creación, eliminación, modificación y movimiento de elementos y atributos en una página web.

💡 Es importante tener en cuenta que la manipulación del DOM debe hacerse detalladamente y no en exceso, ya que puede afectar el rendimiento de la página.

## Encontrando los elementos HTML
Como mencionamos, JavaScript se puede usar para manipular elementos HTML, pero para hacerlo, debemos encontrarlos primero.

Se puede realizar la búsqueda a partir de las siguientes características:

- Encontrando elementos HTML por su **id**


![image](https://github.com/eugenia1984/QA/assets/72580574/dab084dd-e379-4515-abb9-d4fd52658fcb)

- Encontrando elementos HTML por su **nombre de etiqueta**

![image](https://github.com/eugenia1984/QA/assets/72580574/e622f203-4c1d-405d-84ad-aff2f4f390e9)

- Encontrando elementos HTML por su **nombre de clase**

![image](https://github.com/eugenia1984/QA/assets/72580574/83371bab-2292-4993-9b2e-cab7f3aaefcc)

---

## :star: Eventos


Los eventos son acciones que ocurren en la página web o en el navegador, como hacer clic en un botón, pasar el mouse sobre una imagen y escribir en un campo de texto, entre otros.

Estos eventos pueden ser detectados y manejados a través de JavaScript para realizar acciones específicas. Es decir, son una herramienta poderosa para interactuar con el usuario y mejorar su experiencia en la página web.

## Tipos de eventos

En JavaScript hay una gran cantidad de eventos disponibles. Algunos de los más comunes son:

- **Eventos de ratón**: Se activan cuando el usuario interactúa con el mouse, como hacer clic, mover el mouse, presionar y soltar el botón del mouse, etc.

- **Eventos de teclado**: Se activan cuando el usuario interactúa con el teclado, como presionar una tecla, soltarla, mantenerla presionada, etc.

- **Eventos de formulario**: Se activan cuando el usuario interactúa con un formulario; al hacer clic en un botón de envío y cambiar el valor de un campo de formulario, entre otros.

- **Eventos de ventana**: Se activan cuando el usuario interactúa con la ventana del navegador, como cambiar el tamaño de la ventana, minimizarla o maximizarla y cerrarla, etc.

💡Es importante mencionar que la mayoría de los eventos son "disparados" por los usuarios pero también se pueden activar mediante código. Para conocer más acerca los diferentes eventos puedes acceder al material complementario de: Tipos de eventos en Javascript

Tipos de eventos en JavaScript
El manejo de eventos es una parte importante de la programación en Javascript que permite a los desarrolladores crear interacciones dinámicas y personalizadas en sus páginas o aplicaciones web.

A continuación, lo veremos en más detalle…

## Tipos de eventos en JavaScript

- **Eventos del ratón**: Estos eventos ocurren cuando el usuario interactúa con la página utilizando el mouse. Algunos ejemplos son:

-click: Se dispara cuando el usuario hace clic en un elemento.

-dblclick: Se dispara cuando el usuario hace doble clic en un elemento.

-mousedown: Se dispara cuando se presiona un botón del mouse.

-mouseup: Se dispara cuando se suelta un botón del mouse.

-mousemove: Se dispara cuando el puntero del mouse se mueve sobre un elemento.

-mouseover: Se dispara cuando el puntero del mouse ingresa al área de un elemento.

-mouseout: Se dispara cuando el puntero del mouse sale del área de un elemento.


- **Eventos del teclado**: Estos eventos ocurren cuando el usuario interactúa con la página utilizando el teclado. Algunos ejemplos de eventos del teclado son:

-keydown: Se dispara cuando se presiona una tecla.

-keyup: Se dispara cuando se suelta una tecla.

-keypress: Se dispara cuando se presiona una tecla y se mantiene presionada.


- **Eventos de formulario**: Estos eventos ocurren cuando el usuario interactúa con elementos de formulario en la página. Algunos ejemplos son:

-submit: Se dispara cuando se envía un formulario.

-change: Se dispara cuando se cambia el valor de un elemento de formulario como un cuadro de texto, una casilla de verificación o un botón de opción.

-focus: Se dispara cuando un elemento de formulario recibe el foco.

-blur: Se dispara cuando un elemento de formulario pierde el foco.

- **Eventos de ventana**: Estos eventos ocurren en relación con la ventana del navegador. Algunos ejemplos son:


-load: Se dispara cuando se ha cargado completamente la página incluidos todos los recursos (imágenes, estilos, scripts, etc.).

-unload: Se dispara cuando se cierra la ventana del navegador o se navega a otra página.

-resize: Se dispara cuando se cambia el tamaño de la ventana del navegador.

-scroll: Se dispara cuando el usuario se desplaza por la página.


---

## :star: Manejo de eventos


Para manejar un evento en JavaScript se utiliza un oyente de eventos (“event listener”). 

Un **event listener** es una función que se encarga de "escuchar" estos eventos específicos y ejecutar ciertas acciones en función de lo ocurrido. Algunos ejemplos podrían ser:

- Cambio de contenido al hacer clic en una pestaña.

- Una validación al enviar un formulario.

- Expandir y colapsar elementos al hacer clic en un botón.

- Cargar datos adicionales al llegar al final de una página (scroll infinito).

- Cambiar el estilo de la barra de navegación al desplazarse.

El método “addEventListener()” es el que se utiliza para agregar un oyente de eventos a un elemento HTML. Este método toma dos argumentos:

- Tipo de evento que se desea escuchar.

- Función que se ejecutará cuando se active el evento.

Todo ok con la teoría… Pero veamos cómo ponerla en práctica:

Supongamos que tenemos un botón en nuestra página HTML con el siguiente código:

![image](https://github.com/eugenia1984/QA/assets/72580574/2e3527e1-5145-4c23-a756-81037559b6c3)


Queremos que cuando el usuario haga clic en el botón se muestre un mensaje de alerta en la pantalla. Para hacer esto, necesitamos añadir un "oyente de eventos" al botón que esté "escuchando" cuando se hace clic en el mismo. Esto se puede hacer en JavaScript de la siguiente manera:

![image](https://github.com/eugenia1984/QA/assets/72580574/dfc9dd2f-8636-4264-ba55-4343d844f138)

En el código anterior, primero obtenemos el botón por su id utilizando el método “getElementById()” para almacenarlo en la variable “boton”. Luego, utilizamos el método “addEventListener()” para añadir un oyente de eventos al botón. Este método toma dos argumentos en consideración:

- **Tipo de evento que se desea escuchar** → en este caso, el evento "click".

- **Función que se ejecutará cuando se produzca ese evento** → una función anónima que muestra un mensaje de alerta en la pantalla.

Ahora, cada vez que el usuario haga clic en el botón se ejecutará la función que hemos definido y se mostrará el mensaje de alerta.

---

## Ahora es tu turno:

¡Manos a la obra!

1. Abrir Visual Studio Code y crear un nuevo archivo HTML ("index.html").

2. Agregar el siguiente código HTML en el archivo:

```HTML
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Actividad de oyente de eventos en JavaScript</title>
  </head>
  <body>
    <button id="miBoton">Haz clic aquí</button>
    <script src="index.js"></script>
  </body>
</html>
```

3. Crear un nuevo archivo JavaScript ("index.js") y “encontrar” el elemento HTML al que quieres agregarle el oyente de eventos. Para ello, vas a poder usar el método “getElementById” y pasarle el ID del botón como argumento:

![image](https://github.com/eugenia1984/QA/assets/72580574/ae4e0ea8-f4cd-45a1-8be9-61151cacadd3)

4. Definir la función que se ejecutará cuando se haga clic en el botón. En este caso, se va a mostrar una alerta en la pantalla. La función puede tener cualquier nombre, por ejemplo, “handleClick”:

![image](https://github.com/eugenia1984/QA/assets/72580574/0ce1a2be-31f7-4e75-940b-0d1d5c92b298)

5. Agregar un oyente de eventos al botón. Para ello, se utiliza el método “addEventListener” y se pasa el evento que se quiere escuchar, en este caso “click”, y la función que se va a ejecutar cuando se dispare el evento, “handleClick”:

6. Abrir el archivo "index.html" en tu navegador web.

7. Hacer clic en el botón de la página web.

¡Listo! Debería aparecer una alerta con el mensaje "¡Hola! Has hecho clic en el botón."

---

## :star: Frmularios


Un formulario es un elemento que se utiliza para recopilar información ingresada por el usuario como nombres, correos electrónicos, contraseñas, comentarios, entre otros. Son esenciales en las páginas web para permitir interacciones entre el usuario y el servidor, como iniciar sesión, registrarse, enviar comentarios y realizar pedidos en línea.


![image](https://github.com/eugenia1984/QA/assets/72580574/d6d4b973-e082-4ad5-9b2e-c6f4f61218bf)


Un formulario típico de HTML se crea utilizando la etiqueta ``<form> ``y contiene varios elementos de entrada como ``<input>``, <textarea>, <select> y <button> que facilitan la recopilación de datos de los usuarios.

Veamos un ejemplo de una estructura HTML básica para un formulario:

![image](https://github.com/eugenia1984/QA/assets/72580574/c1b11f20-65f8-4abd-b531-277743513890)

  
- ``<form>``: Envuelve todos los campos del formulario. Se utiliza para agrupar los elementos relacionados en un solo bloque.

- ``<label>``: Se utiliza para etiquetar los campos del formulario. El atributo "for" se utiliza para vincular la etiqueta con el campo.

- ``<input>``: Se utiliza para crear campos de entrada de texto. En este caso, se utilizó el tipo "text" para el campo de nombre y el tipo "email" para el campo de correo electrónico. El atributo "id" se utiliza para identificar el campo y el atributo "name" se utiliza para definir el nombre del campo en el servidor.

- ``<textarea>``: Se utiliza para crear áreas de texto más grandes. En este caso, se utiliza para el campo de mensaje.

- ``<select>``: Se utiliza para crear listas desplegables. En este caso, se utiliza para el campo de selección de país. Cada opción dentro del elemento <select> se crea con el elemento <option>, que contiene un valor y el texto a mostrar en la lista.

- ``<button>``: Se utiliza para crear botones en el formulario. En este caso, se utiliza para el botón de envío del formulario. El atributo "type" se establece en "submit" para enviar el formulario.

¡Genial! Ahora, pasemos a ver cómo manejar y validar los formularios con JavaScript…
  
---
  
## :star: Manejo y validación de formularios


El manejo y validación de formularios es un aspecto clave para garantizar que los datos ingresados por los usuarios sean correctos y estén en el formato esperado antes de ser procesados o almacenados en un servidor.

![image](https://github.com/eugenia1984/QA/assets/72580574/120a6adf-723d-46d6-b214-49346b30a821)
  
💡 Esta práctica mejora la calidad de los datos y la experiencia del usuario, al tiempo que minimiza posibles problemas o errores en el procesamiento de la información.

El **manejo de formularios** en JavaScript implica la interacción con elementos de formulario HTML como campos de entrada, botones, casillas de verificación y listas desplegables. 

Algunas tareas comunes en el manejo de formularios incluyen:

- Acceder a los valores de los campos de entrada.

- Cambiar dinámicamente el contenido o atributos de un elemento de formulario.

- Enviar un formulario o realizar una acción cuando se hace clic en un botón.

- Utilizar eventos de formulario, como submit, change, focus y blur, para detectar y responder a las interacciones del usuario.

- Validación de formularios

La **validación de formularios** es el proceso de verificar que los datos ingresados por el usuario cumplen con ciertos criterios o reglas. Estos pueden incluir:

- Comprobar que un campo es obligatorio y no está vacío.

- Validar que el valor ingresado sea del tipo de datos esperado como un número, una dirección de correo electrónico o una fecha.

- Verificar que el valor esté dentro de un rango específico como una cantidad mínima y máxima, o una longitud mínima y máxima.

- Comprobar que el valor cumpla con un patrón específico como una expresión regular para una contraseña segura o un formato de número de teléfono.  

---
  
## :star: Desafío del día


El desafío de hoy consiste en **agregar un formulario y su validación en la página HTML** sobre la que viniste trabajando en los encuentros anteriores.

❗Antes de comenzar, recuerda crear una nueva carpeta con el nombre de la sección “Sección 5 - Integrando JavaScript en el sitio web” y hacer una copia del documento “.html” sobre el que venías trabajando.

Tu código debería ser similar al siguiente:

![image](https://github.com/eugenia1984/QA/assets/72580574/dd7e724b-fd9d-475d-ac80-4c740976295a)
  
Ahora sí, ¡en marcha!

1. Crear un formulario HTML con campos de entrada y un botón de envío:

```HTML
<form id="myForm">
  <label for="email">Correo electrónico:</label>
  <input type="email" id="email" name="email" required>
  <button type="submit">Enviar</button>
</form>
```
  
2. Agregar un oyente de eventos al formulario para manejar el evento “submit”:

```JavaScript  
const form = document.getElementById('myForm');
form.addEventListener('submit', function(event) {
  event.preventDefault();
  validateForm();
});
```
  
En este ejemplo se utiliza “event.preventDefault()” para evitar que el formulario se envíe de la manera predeterminada, lo que permite realizar la validación antes de enviar los datos.

3. Sumar una función de validación que verifique los criterios deseados:

```JavaScript
function validateEmail(email) {
  const regex =  /^[^\s@]+@[^\s@]+\.[^\s@]{2,7}$/
  return regex.test(email)
}
function validateForm() {
  const emailInput = document.getElementById('email');
  const email = emailInput.value;
  if (!validateEmail(email)) {
    alert('Por favor ingrese un correo electrónico válido.');
  } else {
    alert('Correo electrónico enviado correctamente.');
  }
}
```

Aquí la función “validateEmail()” indica que el mail contenga un “@” y un “.” para ser válido. No te preocupes por cómo crear esta función podrás aprender a usarla en nuestro curso de Frontend y FullStack.

¡Desafío terminado! 🙌

---
  
## Resolución del desafío


En el siguiente video te compartimos un paso a paso de cómo resolver el desafío anterior:  [ver video](https://youtu.be/-hbdp8kfkPg)

---
