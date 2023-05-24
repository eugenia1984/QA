# :star: ENCUENTRO 4 - 22 MAYO -  Introducción a JavaScript

---

## :star: Introducción a JavaScript

¡Hola! 👋 Te damos la bienvenida al cuarto encuentro del curso de Programación web desde cero.

Hasta ahora, hemos cubierto lo básico de HTML y CSS para crear y diseñar páginas web.

Y hoy, nos adentraremos en el mundo de JavaScript, un lenguaje de programación que te permite agregar interactividad y contenido dinámico a tus sitios web, y cubriremos su sintaxis, tipos de datos, variables y constantes, operadores, y funciones.

Al final de esta clase, crearás una función simple de JavaScript para mostrar una alerta en la página HTML sobre la que vienes trabajando.

¡Empecemos! 🚀

---

## ¿Qué es JavaScript?


Como adelantamos antes, JavaScript es un lenguaje de programación utilizado para crear páginas web interactivas. Permite crear efectos visuales y animaciones en la página, manipular contenido en tiempo real, crear formularios interactivos y mucho más.

Este lenguaje se ejecuta en el navegador web, lo que significa que no necesita ningún software adicional para funcionar. Esto lo hace extremadamente popular y accesible, ya que se puede usar en cualquier dispositivo con acceso a un navegador web.
Una de las características más importantes de JavaScript es su capacidad para interactuar con HTML y CSS, es decir, podemos modificar y manipular elementos de una página web a través de este lenguaje. Por ejemplo, usaremos JavaScript cuando queramos cambiar el texto de un botón, cuando se hace clic en él o para cambiar el color de fondo de una sección de la página después de que se haya cargado.

---

## Características de JavaScript


Para comenzar a aprender sobre JavaScript es importante conocer sus características básicas, por eso, en esta oportunidad te daremos un pantallazo de las mismas:

💡En este curso no vamos a estar profundizando en todas, sin embargo iremos cubriendo lo esencial para que puedas comenzar a poner en práctica este lenguaje.

## Conceptos básicos

- **Variables**: Son como "cajitas" en las que guardamos valores. **Palabras clave**: let, const.

- **Tipos de datos**: Son los diferentes "elementos" que podemos guardar en nuestras variables. 

- **Operadores**: Son símbolos que nos permiten realizar operaciones con los valores, como sumar, restar, comparar, etc.

## Funciones

- **Funciones**: Son bloques de código que podemos "llamar" para ejecutar una tarea específica. Podemos crear nuestras propias funciones o usar funciones ya existentes en JavaScript. **Palabras clave**: function, return.

## Estructuras de control

- **Condicionales**: Nos permiten tomar decisiones en nuestro código. Ejemplo: "Si el usuario es mayor de 18 años, mostrar un mensaje". **Palabras clave**: if, else, else if.

- **Bucles**: Nos permiten repetir una acción varias veces. Ejemplo: "Hacer algo 10 veces". **Palabras clave**: for, while, do-while. 

- **De control de excepciones**: Nos permiten manejar errores en el código. Ejemplo: Si se genera un error aparecerá el mensaje de "Se ha producido un error". **Palabras clave**: try, catch, finally.

## Objetos y arrays

- **Objetos**: Nos permiten agrupar variables y funciones relacionadas. Ejemplo: Un objeto que representa a una persona con sus datos y acciones. **Palabras clave**: { }, this.

- **Arrays**: Son listas de valores. Ejemplo: Una lista de amigos, donde cada amigo es un objeto. **Palabras clave**: ``[ ]``, length.

## Manipulación del DOM

- **DOM (Document Object Model)**: Es la representación de una página web en forma de objetos y sus relaciones. JavaScript nos permite modificar el DOM para cambiar cómo se ve y funciona la página web. **Palabras clave**: getElementById, querySelector, innerHTML, addEventListener.

---

## Sintaxis de JavaScript


Una sintaxis es la forma en la que están dispuestos y ordenados los componentes de un lenguaje. La sintaxis de JavaScript es similar a la de otros lenguajes de programación, pero tiene algunas particularidades propias:

- Las sentencias simples se encierran entre paréntesis “()”.

- Los bloques de código se encierran entre llaves “{ }” y se utilizan puntos y comas “;” para separar las sentencias.

Por ejemplo, el siguiente comando muestra la sintaxis básica de Javascript para imprimir "Hola mundo" en la consola del navegador *(veremos más sobre la consola a continuación):

![image](https://github.com/eugenia1984/QA/assets/72580574/52ca1471-d971-4086-a4e8-599e69f52191)



Esta sería una sentencia simple por lo que está encerrada entre paréntesis. (No te preocupes ahora por comprender la composición total de la sentencia y su función, eso lo iremos viendo a medida que avancemos).

Por otro lado, podemos observar la siguiente sintaxis para este otro comando de JavaScript:

![image](https://github.com/eugenia1984/QA/assets/72580574/f42bbec1-e604-4e23-a3ce-7678cd332905)


En el caso de bloques de código más grandes, como funciones o estructuras de control de flujo que veremos más adelante, utilizaremos las llaves “{ }” para delimitar el bloque como mencionamos más arriba.

## Consola del navegador

La consola del navegador es una herramienta de desarrollo que permite ver información y mensajes relacionados con el código que se está ejecutando en una página web. Entendamos en más detalle de qué trata:

---

## ¡Manos a la obra!

1. En una nueva pestaña del navegador, hacer clic derecho > “Inspeccionar”.

2. Luego, ir a la pestaña de “Console” y ya estarás en la consola del navegador. También puedes hacerlo presionando F12 en la mayoría de los navegadores

3. Probar de escribir algunos comandos simples, como “Hola Mundo” (usar las comillas) o 2 + 2. 

4. Dar un “Enter” en la consola y observar lo que sucede. La consola debería ir mostrando el resultado de los comandos.

5. Ahora, ingresar el comando: document.title ¿Qué ocurrió? La consola puede ser utilizada para enviar comandos a la página web y obtener información útil o para realizar pruebas y depuración de código.

Para más información sobre la consola del navegador, te invitamos a ver el siguiente video:

[Ver el video](https://youtu.be/XeBlwsNEFho)

Ahora bien, pasemos a comprender qué elementos pueden formar parte de estos códigos. JavaScript tiene varios elementos fundamentales que son esenciales para poder escribir código en este lenguaje:

- Variables y constantes

- Tipos de datos

- Operadores

A continuación, vamos a hablar un poco más sobre estos elementos.

---

## Tipos de datos


JavaScript tiene varios tipos de datos que es importante conocer para poder manipularlos adecuadamente en el código, y comprender mejor cómo funciona este lenguaje de programación. Entre ellos se incluyen:

![image](https://github.com/eugenia1984/QA/assets/72580574/82b8bb17-5fcc-42a4-a204-637f21742631)

Cadena de caracteres o texto (“string”): Representa texto y se define entre comillas simples o dobles (ambas son válidas y producen el mismo resultado). 

💡 No te preocupes si no logras entender la totalidad del código ya que lo iremos viendo a medida que avancemos. En este momento lo relevante a observar es cómo se escriben los valores de los diferentes datos.

- **Números (“number”)**: enteros y decimales. Para representar números enteros grandes se utiliza el tipo de dato de **BigInt**, y se escriben con la letra "n" al final del número. Ejemplo: 9007199254740991n.

- **Booleanos (“boolean”)**: “true” o “false” (verdadero o falso).

- **Objeto (“object”)**: Es una colección de propiedades y valores. Cada propiedad tiene un nombre y un valor asociado, que puede ser de cualquier tipo de dato válido como números, cadenas de texto, booleanos, etc. Para crear un objeto, se utiliza la sintaxis de llaves "{}".

- **Arreglo (“array”)**: Es una colección ordenada de valores (pueden ser de elementos de cualquier tipo). Cada valor en el arreglo tiene una posición o índice numérico que comienza desde cero. Para crear un arreglo, se utiliza la sintaxis de corchetes "[]".

- **Null**: Representa la ausencia de valor.

Ahora, te proponemos realizar la siguiente actividad que te ayudará a comprender mejor estos tipos de datos y cómo se pueden identificar mediante el operador “typeof” (ya veremos qué són los operadores). Además, al ejecutarla en la consola del navegador, podrás ver los resultados de manera inmediata y experimentar con diferentes valores y tipos de datos


---

## ¡Manos a la obra!

1. En una nueva pestaña del navegador, abrir la consola del navegador (puedes hacerlo presionando F12 en la mayoría de los navegadores).

2. Ingresar los siguientes comandos uno por uno y presiona enter después de cada uno:

- typeof 5

- typeof "Hola"

- typeof true

- typeof {}

3. Observar los resultados que se muestran en la consola para cada uno de los comandos.

4. Comparar los resultados y tratar de entender qué tipo de dato representa cada uno de ellos.

¿Has finalizado? Muy bien, continuemos…

---

## Operadores


¡Muy bien! De los elementos fundamentales ya vimos las variables y constantes y los tipos de datos. Nos quedan por ver entonces los operadores.

Los operadores son herramientas esenciales para manipular el valor de las variables, realizar cálculos complejos y tomar decisiones lógicas en función de comparaciones y otros tipos de condiciones.

Existen varios tipos de operadores que se utilizan para diferentes propósitos. Algunos de ellos son:

![image](https://github.com/eugenia1984/QA/assets/72580574/c161090c-b2c5-4446-bbc8-1eb5d54c19da)


- **Operadores aritméticos** → Se utilizan para realizar operaciones matemáticas con valores numéricos. 

- **Operadores de comparación** → Se utilizan para comparar dos valores y devolver un resultado booleano (true o false). Ejemplos: 2 == 2 devuelve true, 5 != 5 devuelve false, o  3 >= 3 devuelve true.

- **Operadores de asignación** → Se utilizan para asignar valores a variables y constantes. El operador más común es el operador de asignación simple “=”. Ejemplo: let x = 2 asigna el valor 2 a la variable x. 

- **Operadores lógicos** → Se utilizan para combinar dos o más expresiones booleanas y devolver un resultado booleano. 

**“&&” (AND)**: Comprueba si dos expresiones booleanas son verdaderas. Ejemplo: true && true devuelve true.

**“||” (OR)**: Comprueba si al menos una de dos expresiones booleanas es verdadera. Ejemplo: true || false devuelve true.

**“!” (NOT)**: Se usa para negar una expresión booleana. Ejemplo: !true devuelve false.

---

## Funciones


Las funciones en Javascript son bloques de código que se pueden llamar en cualquier momento y que realizan una tarea específica. Son útiles para organizar el código en bloques más pequeños y reutilizables.

![image](https://github.com/eugenia1984/QA/assets/72580574/8b9942e8-dfb1-4d74-9f9f-ea0e6ae5c893)

Veamos cómo están conformadas las funciones:

- **Sintaxis** → Las funciones se definen utilizando la palabra clave "function", seguida del nombre de la función y los parámetros que recibe, si es que los hay. El cuerpo de la función se encierra en llaves { }. Por ejemplo, aquí está la sintaxis básica de una función que toma dos números y los suma:

![image](https://github.com/eugenia1984/QA/assets/72580574/e835a4dc-266a-4d30-b541-d4c96e48637d)


- **Parámetros y argumentos** → Los parámetros son variables que se utilizan dentro de la función para realizar una tarea específica y los argumentos son los valores reales que se pasan a la función cuando se llama. Por ejemplo, si llamamos a la función sumar(2, 3), “2” y “3” son los argumentos que se pasan a la función, y num1 y num2 son los parámetros que se utilizan para realizar la suma.

- **Retorno de valores** → Las funciones pueden devolver valores utilizando la palabra clave "return". Los valores devueltos pueden ser de cualquier tipo de datos. Por ejemplo, la función “sumar” devuelve un valor numérico, en este caso “5”.

![image](https://github.com/eugenia1984/QA/assets/72580574/b8de103d-beba-4193-8d47-fe2a14a2718c)

## Funciones anónimas y funciones flecha

Las funciones anónimas son funciones que no tienen un nombre y se pueden utilizar como expresiones. Las funciones flecha son una sintaxis abreviada para definir funciones anónimas y son muy útiles para escribir código más limpio y legible. Por ejemplo, aquí vemos una función anónima que toma un número y lo duplica:

![image](https://github.com/eugenia1984/QA/assets/72580574/3d53dfac-04c3-4aaa-ab47-55bf99694e00)

Y aquí está la misma función escrita como una función flecha:

![image](https://github.com/eugenia1984/QA/assets/72580574/97faec93-1bda-432c-8071-abd931d826c6)


💡Como los parámetros de una función generalmente se usan para realizar una tarea específica dentro de la misma, su valor no debería cambiar durante la ejecución, por lo que se recomienda usar “const” en su declaración. Sin embargo, en otros casos donde se espera que el valor cambie, se podría utilizar “let”.

En resumen, las funciones en JavaScript son bloques de código que te permiten realizar tareas específicas de forma organizada y reutilizable. Con una sintaxis simple y la capacidad de aceptar parámetros y devolver valores, las funciones son una parte fundamental de cualquier programa JavaScript.


---

## Desafío del día


Si llegaste hasta aquí, ¡Ya puedes comenzar a escribir código en Javascript! ¿Probamos? El desafío de hoy consiste en crear una función simple para mostrar una alerta en la página HTML.

1. Crear un nuevo archivo en tu editor de texto y guardalo con una extensión ".js", como "script.js". Este archivo contendrá nuestro código JavaScript.

2. Vincular el archivo JavaScript externo a tu documento HTML. Abrir tu archivo "mi-primera-pagina.html" del encuentro pasado y agregar el siguiente código justo antes de la etiqueta de cierre ``</body>``:

![image](https://github.com/eugenia1984/QA/assets/72580574/ffd1e3b6-f663-40c6-98d7-8f1bd9af2d09)


**Este código indica al navegador que cargue el archivo "script.js" y ejecute el código JavaScript contenido en él.**

3. Crear una función simple de JavaScript en el archivo "script.js" que mostrará una alerta cuando se llame:

![image](https://github.com/eugenia1984/QA/assets/72580574/b9ce70d2-f37c-4d2a-b2e5-a02d68d2ed1b)

Ten en cuenta que en JavaScript los paréntesis son necesarios para llamar o ejecutar una función. Sin los paréntesis, sólo se hace referencia a la función, pero no se ejecuta

Esta función, cuando se llame, mostrará una alerta del navegador con el mensaje: "¡Hola, esta es una alerta desde JavaScript!".

💡La función “showAlert()” está utilizando la función integrada o nativa de “alert()”. En JavaScript hay muchas funciones predefinidas que se pueden utilizar sin necesidad de definirlas.

4. Para llamar a esta función desde tu página HTML, necesitamos agregar un botón que active la función al hacer clic. Agregar el siguiente código a tu archivo "mi-primera-pagina.html", dentro del elemento “.container”:

![image](https://github.com/eugenia1984/QA/assets/72580574/947e44bf-4923-4f34-a526-138a7e332c18)


Este código agrega un botón con el texto "¡Haz clic en mí!" y un atributo onclick, que llama a la función “showAlert()” cuando se hace clic en el botón.

5. Guardar ambos archivos, "mi_primera_pagina.html" y "script.js", luego actualiza tu página web en el navegador.

Ahora deberías ver el botón "¡Haz clic en mí!" en tu página web. Haz clic en el botón y aparecerá la alerta con el mensaje: "¡Hola, esta es una alerta desde JavaScript!".

¡Desafío terminado! 🙌

## Resolución del desafío


En el siguiente video te compartimos un paso a paso de cómo resolver el desafío anterior:

[Ver el video](https://youtu.be/IplPpRAWjF0)

---

## Valida tus conocimientos


Te compartimos el enlace del material complementario para que puedas continuar profundizando sobre el siguiente tema cuando más gustes:

En JavaScript hay muchas funciones predeterminadas que se pueden utilizar sin
necesidad de definirlas. Estas se encuentran en el objeto global del navegador o del
entorno de ejecución de JavaScript y se llaman funciones integradas o funciones
nativas.
Por ejemplo, algunas funciones predefinidas en JavaScript son:


console.log() - Imprime un mensaje en la consola del navegador o de Node.js.

prompt() - Crea un cuadro de diálogo que solicita al usuario que ingrese un valor.

alert() - Crea un cuadro de diálogo que muestra un mensaje al usuario.

parseInt() - Convierte una cadena de texto en un número entero.

parseFloat() - Convierte una cadena de texto en un número decimal.

Math.random() - Genera un número aleatorio entre 0 y 1.

Math.round() - Redondea un número al entero más cercano.

Math.floor() - Redondea un número hacia abajo al entero más cercano.

Math.ceil() - Redondea un número hacia arriba al entero más cercano.

Date() - Crea un objeto de fecha.

new Date() - Crea un objeto de fecha con la fecha y hora actual.

Date.now() - Devuelve la cantidad de milisegundos transcurridos desde el 1 de enero de 1970.

isNaN() - Determina si un valor no es un número.

isFinite() - Determina si un valor es un número finito.

decodeURI() - Decodifica una cadena codificada con encodeURI().

encodeURI() - Codifica una cadena para ser utilizada como URI.

parseFloat() - Convierte una cadena de texto en un número de punto flotante.

parseInt() - Convierte una cadena de texto en un número entero.

JSON.stringify() - Convierte un objeto JavaScript en una cadena JSON.

JSON.parse() - Convierte una cadena JSON en un objeto JavaScript.

String.fromCharCode() - Convierte valores Unicode en una cadena.

toFixed() - Formatea un número con una cantidad específica de decimales.

toPrecision() - Formatea un número con una cantidad específica de dígitos significativos.

replace() - Reemplaza una subcadena de una cadena por otra subcadena.

split() - Divide una cadena en un arreglo de subcadenas.

slice() - Extrae una sección de una cadena y devuelve una nueva cadena.

substr() - Extrae una sección de una cadena comenzando en un índice especificado y devuelve una nueva cadena.

---

concat() - Combina dos o más cadenas en una sola cadena.

push() - Agrega uno o más elementos al final de un arreglo y devuelve la nueva longitud del arreglo.

pop() - Elimina el último elemento de un arreglo y devuelve el elemento eliminado.

shift() - elimina el primer elemento de un arreglo

unshift() - agrega uno o más elementos al inicio de un arreglo

reverse() - invierte el orden de los elementos de un arreglo

sort() - ordena los elementos de un arreglo alfabéticamente o numéricamente

filter() - filtra los elementos de un arreglo según una condición especificada

map() - crea un nuevo arreglo a partir de la aplicación de una función a cada uno de los elementos de un arreglo

reduce() - reduce los elementos de un arreglo a un solo valor mediante la aplicación de una función acumulativa

some() - verifica si al menos un elemento de un arreglo cumple con una condición especificada

every() - verifica si todos los elementos de un arreglo cumplen con una condición especificada

setTimeout() - ejecuta una función después de un tiempo especificado

setInterval() - ejecuta una función cada cierto intervalo de tiempo

clearTimeout() - cancela una función establecida para ejecutarse después de un tiempo especificado

clearInterval() - cancela una función establecida para ejecutarse cada cierto
intervalo de tiempo

---

## :computer: MI PRACTICA


Asi se ve:

![image](https://github.com/eugenia1984/QA/assets/72580574/b915cf8c-9ada-4cc1-a34e-246972a6555c)


[Aca pueden ver el codigo](https://github.com/eugenia1984/QA/tree/main/EGG/testing_automation_1/practicas/encuentro04)

---
