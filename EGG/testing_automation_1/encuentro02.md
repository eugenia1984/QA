# :star: CLASE 2 - 18 MAYO - INTRODUCCION A CSS

---

## :star: Introducción

¡Hola, de nuevo!


En el encuentro anterior, aprendimos sobre los conceptos básicos de HTML y creamos una página web simple con encabezados y párrafos. Hoy aprenderemos sobre CSS, que significa "Cascading Style Sheets" ("Hojas de estilo en cascada").

**CSS** es un lenguaje que se utiliza para dar estilo a los HTML con elementos como colores, fuentes y espaciado para generar páginas web visualmente atractivas. Separar el estilo de la estructura de una página web hace que sea más fácil mantener y actualizar el contenido.

![image](https://github.com/eugenia1984/QA/assets/72580574/a1ead47e-d6da-4d7e-b8b9-5a7014bc2aea)


A continuación, cubriremos los conceptos básicos de CSS incluyendo los tipos, selectores y propiedades, y luego aplicaremos CSS a la página HTML que creamos en la clase anterior.

¡Allá vamos!

---

## :star:  Sintaxis de CSS

La **sintaxis de CSS** es fundamental para darle el estilo deseado a una página web porque permite definir las propiedades que determinarán la apariencia visual de los elementos del documento HTML.

Veamos un ejemplo de cómo se estructura la sintaxis:

![image](https://github.com/eugenia1984/QA/assets/72580574/64dbdadb-b9ea-4603-afd6-349549aa5a86)

A tener en cuenta sobre las declaraciones CSS:

- **Tienen un formato específico de "propiedad: valor;"**: (diferente al formato de igualdad usado en los atributos HTML).
Si queremos, por ejemplo, aplicar el estilo de color rojo y un tamaño de fuente de 18px a un título que se encuentra dentro de una etiqueta h1 en HTML, lo declararíamos en CSS de la siguiente manera:


![image](https://github.com/eugenia1984/QA/assets/72580574/b3dd485b-f41e-4c32-a612-ddbf8633eeb9)

Con lo anterior, estamos seleccionando el elemento "h1" del HTML y aplicando las propiedades "color" y "font-size" con sus respectivos valores para cambiar su estilo en la página web.

- **No se ven afectadas por el espacio en blanco**: Las propiedades se pueden escribir de corrido o una debajo de la otra. Otra forma en la que podemos declarar el CSS anterior, por ejemplo, sería la siguiente:

![image](https://github.com/eugenia1984/QA/assets/72580574/2c13ac3b-eeea-4e8e-9d7b-508ffcae2d3e)

- Al definir una propiedad numérica se debe especificar la unidad de medida que se está usando.
No se deben agregar espacios entre el número y la unidad de medida. Por ejemplo, si queremos definir el tamaño de letra en 18 píxeles, debemos escribir ``"font-size: 18px;"`` y no solo ``"font-size: 18;"``.

- No se ven afectadas por los comentarios. En CSS, los comentarios se realizan con la sintaxis: ``/* comentario */``. Todo lo que se encuentra dentro de los símbolos ``/* y */`` será ignorado por el navegador, lo que permite agregar notas o aclaraciones en el código sin afectar su funcionamiento.

---

## :star: Etiquetas “padres e hijos”

Dentro de la sintaxis del CSS, nos podemos encontrar con el concepto de “padres” e “hijos”. Cuando una etiqueta está contenida dentro de otra, se utiliza el término "padre" para referirse a la primera e "hijo" para hacer referencia a la segunda.

Esta relación permite agregar atributos específicos a los elementos "hijos", sin afectar a los del "padre". Cada "padre" puede tener varios "hijos", y todos ellos heredan las características del "padre", pero también pueden tener características únicas.
Esta relación permite una mayor flexibilidad en la estructuración de los elementos en un documento o página web.

Ten presente que al seleccionar una etiqueta, debes incluir las etiquetas “padre/s” para que sean más específicas a la hora de aplicar estilos. Veamos un ejemplo:

![image](https://github.com/eugenia1984/QA/assets/72580574/782c1881-053f-4d9f-bd60-92381f062264)

---

## :star: Propiedades básicas de CSS

Las **propiedades de CSS** se utilizan para definir estilos para los elementos HTML. Estas son como las instrucciones de diseño que le damos a una página web para que se vea visualmente bonita y atractiva. Podemos cambiar el color del texto, el tamaño de la fuente, la imagen de fondo y muchos otros aspectos visuales.

En otras palabras, las propiedades CSS son una forma de hacer que nuestra página web se vea única y personalizada.

A continuación, te compartimos algunas de las propiedades de CSS más comunes:

- **color**: Se utiliza para establecer el color del texto dentro de un elemento HTML. El valor de la propiedad puede ser un nombre de color, un código hexadecimal o un valor RGB. Por ejemplo:

![image](https://github.com/eugenia1984/QA/assets/72580574/48e7f87b-8c0d-483e-8200-70d05e3931a4)

- **background-color**: Se utiliza para establecer el color de fondo de un elemento HTML. Como sucede con la propiedad color, el valor de la propiedad puede ser un nombre de color, un código hexadecimal o un valor RGB. Por ejemplo:

![image](https://github.com/eugenia1984/QA/assets/72580574/5bcba92f-ca73-4963-be59-1076c7059515)


- **font-family**: Se utiliza para establecer la fuente para el texto dentro de un elemento HTML. El valor de la propiedad es una lista de nombres de fuentes separados por comas, y si la primera fuente no está disponible, se utilizará la siguiente en la lista. Por ejemplo:

![image](https://github.com/eugenia1984/QA/assets/72580574/3cc9cf35-86ea-4572-8378-c6077f0b80ca)


- **font-size**: Se utiliza para establecer el tamaño del texto dentro de un elemento HTML. El valor de la propiedad puede ser un número seguido de una unidad de medida como píxeles o em, o puede ser una palabra clave como small, medium o large. Por ejemplo:

![image](https://github.com/eugenia1984/QA/assets/72580574/194f6843-1039-435a-b544-d94c7c6da11e)


- **margin**: Se utiliza para establecer el espacio entre el borde de un elemento y cualquier elemento adyacente. El valor de la propiedad puede ser un número seguido de una unidad de medida como píxeles o em, o puede ser una serie de valores separados por espacios para establecer diferentes márgenes para diferentes lados del elemento. Por ejemplo:

![image](https://github.com/eugenia1984/QA/assets/72580574/8f315b57-5b53-4304-9631-2056c4f30cae)


- **padding**: Se utiliza para establecer el espacio entre el contenido de un elemento y su borde. El valor de la propiedad puede ser un número seguido de una unidad de medida como píxeles o em, o puede ser una serie de valores separados por espacios para establecer diferentes rellenos para diferentes lados del elemento. Por ejemplo:

![image](https://github.com/eugenia1984/QA/assets/72580574/a0376fc4-7bf1-4474-b292-38795c53c044)


---

Ahora, te proponemos realizar la siguiente actividad que te ayudará a comprender mejor las propiedades de CSS y cómo aplicarlas:

## :star: ¡Manos a la obra!

1. Ingresar a la siguiente página → [www.codepen.io](www.codepen.io), y hacer clic en el botón de
“Start coding” que se encuentra en la columna izquierda de la pantalla.

2. En la pestaña de HTML , colocar el siguiente código:

```
<html>
<head>
  <title>Ejemplo de CSS</title>
</head>
<body>
  <h1>Introducción a CSS</h1>
  <p>CSS es un lenguaje que se utiliza para dar estilo a los HTML con elementos como colores, fuentes y espaciado para generar páginas web visualmente atractivas.</p>
</body>
</html>
```

3. En la pestaña de CSS, utilizar las siguientes propiedades para modificar el estilo de las etiquetas “h1” y “p”:


- color: (blue, red, green, pink, etc.)

- background-color: (black, orange, yellow, etc.)

- font-family: (arial, helvetica, etc.)

- font-size: (medidas tales como 20px, 40px, etc.)

- margin: (medidas tales como 20px, 50px, 100px, etc.)

4. Experimentar con diferentes valores para cada propiedad para lograr un diseño que te guste.

Tanto el título como el párrafo te deberían quedar con: un color de fuente, un color de fondo, un tipo y tamaño de letra
y un margen diferente al original.

Te mostramos un ejemplo de un posible diseño a modo de inspiración:

![image](https://github.com/eugenia1984/QA/assets/72580574/469e47a6-da23-48a8-bf96-d3fd90cc7940)


¿Lo has logrado? ¡Muy bien! Sigamos…

---

## :star: Selectores de CSS

Los **selectores de CSS** son fundamentales para aplicar estilos y diseños específicos a los elementos de una página web.
Estos selectores permiten una selección precisa y detallada de los elementos HTML que se desea estilizar.
Hay varios tipos de selectores. Algunos de ellos son:

- **Selectores de ID**: Seleccionan elementos con un atributo de ID específico. Cada elemento HTML puede tener un solo ID
y este debe ser único en todo el documento HTML. Los selectores de ID son precedidos por un numeral (#), por ejemplo,
#header o #footer

- **Selectores de clase**: Seleccionan elementos con un atributo de clase específico. Los elementos HTML pueden tener múltiples clases, y estas pueden ser compartidas por diferentes elementos HTML. Los selectores de clase son precedidos por un punto (.), por ejemplo: **.container** o **.highlight**

- **Selectores de elemento**: Seleccionan elementos basados en sus nombres de etiquetas. Por ejemplo: **h1**, **p**, o **body**. Supongamos que deseamos seleccionar todos los títulos h1 en un documento HTML, podemos utilizar el selector de elemento "h1".



---


## Sumar IDs y clases al código HTML

Para agregar IDs y clases a nuestro código HTML, debemos incluir el atributo "id" o "class" en la etiqueta HTML correspondiente. Por ejemplo, si queremos agregar un ID a un elemento "div", podríamos escribir:


![image](https://github.com/eugenia1984/QA/assets/72580574/2a3ba1ca-d934-484a-a3ec-d84d942f1cbf)


En este caso, agregamos el ID "mi-id" al elemento "div". Ahora, podemos utilizar este ID en nuestro código CSS para aplicar estilos específicos a este elemento. Por ejemplo:

![image](https://github.com/eugenia1984/QA/assets/72580574/0013bf8d-7701-4327-a039-28da785f6659)

En este código CSS, estamos aplicando un color de fondo azul, un color de texto blanco y un tamaño de fuente de 18 píxeles al elemento con el ID "mi-id". Así se vería el resultado final:

![image](https://github.com/eugenia1984/QA/assets/72580574/1d643d7d-bb92-4b60-8ca2-35677492f61d)


---

## :star: Reglas de especificidad

Las **reglas de especificidad de los selectores de CSS** determinan qué estilo se aplicará a un elemento HTML cuando existen múltiples reglas que compiten por dar estilo al mismo elemento.

Cada selector tiene un valor de especificidad que se basa en su tipo (ID, clase, elementos o universales) y en su posición en la hoja de estilos. El selector con la mayor especificidad ganará y se aplicará a ese elemento en particular:

- **Selectores universales**: Tienen una especificidad de 0, es decir, no se les asigna ningún valor de especificidad.

- **Selectores de elementos y pseudo-elementos**: Tienen una especificidad de 1.

- **Selectores de clase, atributo y pseudo clase**: Tienen una especificidad de 10.

- **Selectores de ID**: Tienen una especificidad de 100.

- **Estilos en líneas**: Tienen una especificidad de 1000

![image](https://github.com/eugenia1984/QA/assets/72580574/ba62cd80-52a9-4d73-b16d-721a665adfcc)

El valor de especificidad se calcula sumando los valores de los diferentes tipos de selectores utilizados en una regla de estilo. Un estilo en línea (que luego veremos de qué trata) tiene la máxima prioridad en CSS con una especificidad mayor que la de cualquier selector de ID, clase o elemento. Un selector de ID tiene un valor de especificidad mayor que un selector de clase, y un selector de clase tiene un valor mayor que un selector de elementos.

Por ejemplo, si hay un selector de elemento y un selector de clase que están aplicando diferentes estilos a un mismo elemento HTML, el selector de clase tendrá una especificidad mayor y, por lo tanto, su estilo será el que se aplicará al elemento.

En otras palabras, cuando se aplican múltiples reglas a un elemento, se determina cuál es la más específica y se aplica esa regla. Si dos reglas tienen la misma especificidad, se aplica la que aparece más tarde en el código CSS.


También existe el **“!important”** que no provee especificidad pero sobreescribe cualquier otra regla sin importar cuanta especificidad tenga, no se recomienda su uso porque es difícil de depurar y no respeta la cascada de estilos.

Para que quede un poco más claro, veamos un ejemplo de diferentes selectores con su correspondiente valor de especificidad:

![image](https://github.com/eugenia1984/QA/assets/72580574/c078b076-db24-4190-a79b-ab34d093958d)


Es importante tener en cuenta las reglas de especificidad al diseñar hojas de estilo para evitar conflictos y asegurarse de que los estilos se apliquen correctamente.

En el caso de los anidamientos, los puntos de especificidad se suman. Por ejemplo:

- Con el siguiente HTML:

```HTML
<div class="container">
   <h1 class="title">Título</h1>
</div>
```

- Y el siguiente código CSS:

```CSS
.container .title {
color: red;
}
```

Este selector tiene una especificidad de 20 (10 por la clase .container y 10 por la clase .title). Si se aplicara un estilo diferente al mismo elemento utilizando un selector con una especificidad de 10, el selector más específico tendría prioridad y se aplicaría el estilo correspondiente.

---

## :star: Tipos de CSS

Existen tres tipos de CSS que se utilizan para aplicar estilos a un documento HTML:

### CSS en línea

Los estilos se agregan directamente a los elementos HTML usando el atributo “style”. Por ejemplo:

```CSS
<html>
<head>
</head>
<body>
<p style=”color: red;”>
Un texto de color rojo
</p>
</body>
</html>
```
Aunque es fácil de implementar, no es recomendado ya que puede hacer que el código HTML sea difícil de leer y mantener.

##  CSS interno

Los estilos se colocan dentro de una etiqueta ``<style> `` dentro de la sección <head> del documento HTML. Por ejemplo:
  
```CSS
<html>
<head>
<style>
  p {color: red;}
</style>
</head>
<body>
  <p>Un texto de color rojo</p>
</body>
</html>
```

Este método sólo es adecuado para proyectos pequeños o sitios web de una sola página.
  
## CSS externo
  
Los estilos se colocan en un archivo separado con la extensión ".css", el cual luego se enlaza al documento HTML usando la etiqueta`` <link>``. 
  
Archivo “index.html”:
  
```HTML
<html>
<head>
  <link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>
  <p> Un texto de color rojo </p>
</body>
</html> 
```

Archivo “style.css”:
  
```CSS  
p {
  color: red;
}
```

Este método es el más utilizado y, a su vez, es la mejor opción de los 3 tipos de CSS, ya que permite mantener un estilo consistente en todo el sitio y hace que la actualización de estilos sea más manejable.

---
  
## :star: Desafío
  
A continuación, te presentamos el desafío de hoy. Deberás agregar algunos estilos CSS a la página HTML que creaste en el encuentro anterior cumpliendo con los siguientes requisitos:
  
- Cambiar el color del fondo de la página.

- Cambiar el color de la fuente de la página.

- Dar estilo al encabezado h1 y a los párrafos.
  
## A resolver:

1. Crear un archivo nuevo en Visual Code (o en tu editor de código) y guárdalo con la extensión
".css", como por ejemplo: "estilos.css". Este archivo contendrá los estilos CSS.  

2. Enlazar el archivo CSS externo que creaste con tu documento HTML. Abrir tu archivo
"mi-primer-website.html" del encuentro anterior y agregar el siguiente código dentro de la sección`` <head>``, justo debajo de la etiqueta`` <title>``:
  
![image](https://github.com/eugenia1984/QA/assets/72580574/83ec9a7b-08c4-4b47-a320-38424c2f44e3)

**El atributo "href" se utiliza para especificar la ubicación de un archivo.**
  
Puede ser una dirección de internet o una dirección de la propia computadora. En este caso, nos centraremos en la segunda opción. La ruta especificada es relativa al archivo HTML actual:

- Si el archivo "styles.css" está en una carpeta llamada "CSS" al mismo nivel que el archivo HTML, la ruta relativa sería: ``href = "css/styles.css"``
  

- Si los archivos HTML y CSS están en carpetas separadas al mismo nivel, la ruta relativa sería: ``href = "../css/styles.css"``.
  
En este caso, el código "href" le indica al navegador que busque un archivo llamado "styles.css" en el mismo directorio que el archivo HTML y aplique los estilos definidos en él.  
3. Abrir el archivo "styles.css" y agregar algunos estilos básicos. Empecemos cambiando el color de fondo y el color de fuente de toda la página. Por ejemplo, puedes agregar el siguiente código:  
  
![image](https://github.com/eugenia1984/QA/assets/72580574/70c62696-7a87-489d-b3e5-99b564a68124)

 Este código apunta al elemento ``<body>``, y establece su color de fondo en azul claro y su color de fuente en azul oscuro. 
 
4.   Dar estilo al encabezado`` <h1>``. Por ejemplo, puedes agregar el siguiente código a tu archivo "styles.css":
  
![image](https://github.com/eugenia1984/QA/assets/72580574/1cfbd446-db72-4415-be7e-3e0a1901215d)

  Este código apunta al elemento ``<h1> ``y establece su familia de fuente en Arial, tamaño de fuente en 36 píxeles y alineación de texto centrada.
  
 
  
5.   Finalmente, dar estilo a los párrafos. Por ejemplo, puedes agregar algunos márgenes y rellenos aplicando el siguiente código

  ![image](https://github.com/eugenia1984/QA/assets/72580574/bf6150ca-1a3d-4c49-a877-7fd107eac151)  

  Este código apunta a los elementos ``<p>`` y establece su familia de fuentes en Georgia, el tamaño de la fuente en 18 píxeles, el padding en 10 píxeles y el margen en 20 píxeles.
  
6. Guardar los archivos: "mi-primer-website.html" y "styles.css" , y luego actualizar la página web en el navegador. Ahora deberías ver los nuevos  estilos aplicados a tu página HTML, con un color de fondo, un color para los textos, y un encabezado y párrafos con otro aspecto.
  
**¡Desafío terminado!**
  
## Resolución del desafío
  
En el siguiente video te compartimos una de la formas en la que puedes resolver el desafío anterior:

[Como agregar una hoja de estilo (CSS) | Introducción al Desarrollo Web & HTML | Egg](https://www.youtube.com/watch?v=JGxVoiixjOM)
  
**¡Felicidades!**
  
Añadiste exitosamente CSS a tu página HTML para darle estilo. A medida que continúes en el curso, aprenderás más sobre propiedades de CSS, selectores avanzados y técnicas para crear páginas web responsivas y visualmente atractivas.
  
En el próximo encuentro, profundizaremos en el diseño y la disposición de CSS, cubriendo conceptos como el “Box Model”, “display” y posicionamiento, “Flexbox” y “Grid”, y diseño responsivo. Estos conceptos te ayudarán a crear diseños más complejos y pulidos para tus páginas web.  
  
---

## Valida tus conocimientos
  
Te compartimos el siguiente enlace para que puedas acceder al material complementario que contiene información que puede resultar útil y enriquecedora:
  
[Guía rápida de selectores](https://drive.google.com/file/d/1JdK1qbhy6O7mjMc_NhND_PpQZLgTamYz/view)

  
Además, te proponemos realizar una autoevaluación para poner a prueba los principales aprendizajes del día de hoy. ¿Te animas?:
  
---
  
 ## :star: Mapa de conceptos vistos 
  
  ![image](https://github.com/eugenia1984/QA/assets/72580574/31071de9-706f-4944-a35c-bf17a790e8e4)

---
---  

  
## MI PRACTICA  
  
 Asi se ve mi practica:
  
  ![image](https://github.com/eugenia1984/QA/assets/72580574/897a0611-0d96-4572-93e0-6fc429d542ef)
  
  [Aca podes ver el codigo](https://github.com/eugenia1984/QA/tree/main/EGG/testing_automation_1/practicas/encuentro02)
