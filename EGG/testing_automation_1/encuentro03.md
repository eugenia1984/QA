#ENCUENTRO 03 - 19 MAYO - Introducción a diseño y maquetación con CSS

---

## ¡Te damos la bienvenida a esta sección sobre diseño CSS! 👋

Ya aprendimos sobre los conceptos básicos de CSS y aplicamos algunos estilos simples a nuestra página HTML.

En esta clase, exploraremos técnicas de CSS más avanzadas para mejorar la disposición y el diseño de nuestra página web. Cubriremos Box Model, Display y Position (“visualización y posicionamiento”), Flexbox y Grid, y el diseño responsivo.

Al final de esta sección, podrás mejorar la disposición y el diseño de la página HTML en la que hemos estado trabajando.

¡Vamos! 🚀

---

## BOX MODEL

El Box Model (“modelo de caja”) es uno de los conceptos más importantes en CSS, y es fundamental para comprender cómo se estructuran y diseñan los elementos en una página web.

Describe cómo se componen los elementos HTML en una página. Cada elemento se considera una "caja" que consta de cuatro partes:

- Content

- Padding

- Border

- Margin

![image](https://github.com/eugenia1984/QA/assets/72580574/46b00d22-a626-4649-b153-beccc72da47d)


Veamos en más detalle de qué trata cada parte:

- **Content** → Es el área donde se muestra el contenido real del elemento (como el texto o las imágenes).

- **Padding** → La propiedad de padding (“relleno”) se usa para definir el espacio entre el contenido de un elemento y su borde. Los valores que se pueden utilizar incluyen:

- Un valor numérico, que define el espacio en píxeles.

- Un valor porcentual, que define el espacio en relación al ancho del elemento.

- La palabra clave "auto", que centra el contenido horizontalmente.

- **Border** → La propiedad de border se usa para definir el borde de un elemento, es decir, es la línea que rodea el contenido y el padding. Los valores que se pueden utilizar incluyen:

- El ancho del borde en píxeles, como "1px".

- El tipo de borde, como "solid" para un borde sólido o "dashed" para un borde discontinuo.

- El color del borde, como "black" para un borde negro o "#cccccc" para un color hexadecimal.

- **Margin** → La propiedad de margin (“margen”) se usa para definir el espacio entre el borde y el elemento adyacente (como otro elemento o el borde del navegador). Los valores que se pueden utilizar incluyen:

- Un valor numérico, que define el espacio en píxeles.

- Un valor porcentual, que define el espacio en relación al ancho del elemento padre.

- La palabra clave "auto", que centra el elemento horizontalmente.

---

Veamos un ejemplo de cómo se aplica el box model a un elemento HTML simple:

![image](https://github.com/eugenia1984/QA/assets/72580574/1ad5f0ac-cd06-4344-a1dc-511694b2071d)

En este caso, el elemento es un “div” con la clase “ejemplo”. El contenido es simplemente el texto: "Este es un ejemplo de contenido".

El padding, border y margin no se han definido explícitamente, por lo que serían 0.

💡De todas maneras, el navegador por defecto agrega estilos. Por lo que, si quisiéramos resetearlos, vamos a poder hacerlo con el siguiente código CSS:

![image](https://github.com/eugenia1984/QA/assets/72580574/3bdd63ea-9035-4363-8934-095a01cb9ab7)

Ahora si aplicamos algunos estilos CSS para agregar padding, border y margin, se podría declarar así:

![image](https://github.com/eugenia1984/QA/assets/72580574/c4a71c9c-9653-4e8f-878e-02aa992f4a96)


💡Como podemos observar en la imagen, la propiedad de border tiene asignados varios valores en una misma línea (el ancho, tipo y color). Se escribe de esa manera para simplificar el código y que sea más legible y eficiente.

Y el resultado final se vería así:

![image](https://github.com/eugenia1984/QA/assets/72580574/8fc079d2-05cf-44d9-be24-b1871c500d89)


Como se puede ver, el contenido está rodeado por un espacio de 10px de padding, luego por un borde negro sólido de 1px, y finalmente por un margen de 20px. Todo esto compone la "caja" del elemento.

Ahora bien, si quisiéramos darle diferentes valores a los espacios de cada uno de los cuatro lados del elemento, las propiedades de padding y margin se pueden declarar junto con la palabra: top, right, bottom o left, para especificar la cantidad de espacio que se desea agregar en una dirección específica. Por ejemplo:

Para agregar 200px de margen en la parte superior y a la parte derecha de un elemento, pero no en la parte izquierda y en la parte inferior, podríamos utilizar la siguiente regla CSS:

![image](https://github.com/eugenia1984/QA/assets/72580574/bb379a22-f73e-4333-a315-cb5a8de746ef)


Y el resultado final se vería así:

![image](https://github.com/eugenia1984/QA/assets/72580574/8c19f149-19af-499b-ae2b-2a4d0b8746bc)

Otra forma de declarar los margins que vimos anteriormente sería la siguiente:

![image](https://github.com/eugenia1984/QA/assets/72580574/0574dd25-f877-4570-9206-a2b8a80500e2)

Cuando el margin se declara de manera abreviada se divide en cuatro valores separados por espacios. El primer valor corresponde al margen superior (top), el segundo al margen derecho (right), el tercero al margen inferior (bottom) y el cuarto al margen izquierdo (left).


De esta manera, al asignar "200px 200px 0px 0px" se está indicando un margen superior y derecho de 200px y un margen inferior e izquierdo de 0px, simplificando la escritura del código y haciendo que sea más fácil de leer. Y el resultado que obtenemos será el mismo:


![image](https://github.com/eugenia1984/QA/assets/72580574/0d4d1614-906b-4b15-afd7-3efa07f6c2e0)


---

## :star: Actividad de Box Model


Para que practiques y comprendas mejor cómo funciona el Box Model de CSS y las propiedades que lo rodean, tales como tamaño, posicionamiento, border, margin y padding de un elemento, te proponemos hacer un ejercicio.

La práctica del Box Model es fundamental para que puedas construir páginas web bien estructuradas y adaptativas a diferentes dispositivos y tamaños de pantalla. Además, te permitirá desarrollar habilidades de diseño más avanzadas y crear sitios web de alta calidad y usabilidad.

¡Manos a la obra!

1. Crear un archivo HTML con un elemento “div” y dale una clase.

![image](https://github.com/eugenia1984/QA/assets/72580574/b94cd169-f4ea-4d64-80bb-8378056e4c8e)


2. Crear un archivo CSS llamado “style.css” y agregar estilos al elemento “div” utilizando el Box Model. Agregar un border, margin, padding y ajustar su tamaño.

![image](https://github.com/eugenia1984/QA/assets/72580574/ebd71736-ea46-4109-ad55-89bf698aa7c4)

3. Abrir el archivo HTML en tu navegador y observar cómo se aplica el Box Model al elemento “div”.

4. Modificar los valores de padding, border y margin para ver cómo afectan la apariencia del elemento.


💡 Te mostramos cómo inspeccionar un elemento para que puedas interactuar directamente con el código HTML que lo conforma


:tv: [Video: Inspeccionar elemento](https://www.youtube.com/watch?v=AsKqzQ62wDc)

5. Añadir 2 elementos “div” más con diferentes clases y aplicar diferentes estilos de Box Model para cada uno.

💡 Te compartimos un video que muestra cómo funciona la extensión para Visual Studio Code conocida como “Live Server”, que agrega funcionalidades al editor de código como la opción de ver tu página en vivo en el navegador sin tener que guardar los cambios.

:tv: [Instalación Extensión Live server](https://youtu.be/z3YBKqeSD6k)

¡Llegamos al final de este ejercicio!

---

A continuación, te mostramos paso a paso la forma de solucionarlo junto con el resultado esperado: :tv: [video de resolucion](https://youtu.be/HTbTv5i50tM)

---

## :star: Display y Position


Recordemos que cada elemento HTML en una página web es una “caja rectangular”.

Las propiedades de display y position determinan cómo se comporta esa caja rectangular. Es decir, se utilizan para controlar la visualización y el posicionamiento de los elementos HTML.


## Algunos valores comunes para la propiedad de display (“visualización”) incluyen:

- **none**: Oculta completamente el elemento, es decir, no se muestra en la página web. Es muy útil para hacer que un elemento desaparezca temporalmente o para ocultarlo en diferentes condiciones de visualización (esto se logra manipulando el CSS con javascript).

- **inline**: Convierte un elemento en un elemento en línea. Los elementos en línea son aquellos que no comienzan una nueva línea y sólo ocupan el ancho necesario para mostrar su contenido. Los elementos en línea pueden contener elementos en línea y texto, pero no otros bloques.

- **block**: Convierte un elemento en un bloque. Los elementos de bloque comienzan una nueva línea y ocupan todo el ancho disponible. Los elementos de bloque pueden contener elementos en línea, otros bloques e incluso otros elementos de tipo inline-block.

- **inline-block**: Combina las características de los elementos inline y los elementos block. Los elementos inline-block se muestran como elementos en línea, pero permiten establecer ancho y altura como si fueran elementos de bloque.

- **inherit**: Hace que el elemento herede el valor de la propiedad display de su elemento padre.

- **flex**: Convierte un elemento en un contenedor flexible, lo que permite controlar el tamaño y la posición de sus elementos hijos.

- **grid**: Convierte un elemento en un contenedor de cuadrícula, lo que permite colocar elementos hijos en filas y columnas.

:tv: [Propiedad display](https://youtu.be/eNiIM4r7-Qc)

## Y, algunos valores comunes para la propiedad de position (“posicionamiento”) incluyen:

- **static**: Este es el valor predeterminado de la propiedad de "position". Cuando se establece el valor de "static", no se aplica ningún posicionamiento especial al elemento y se colocará en el lugar que le corresponda en el flujo normal del documento.

- **relative**: El elemento se posiciona en relación con su posición normal, es decir, puede moverse hacia arriba, abajo, izquierda o derecha desde su posición inicial.

- **absolute**: El elemento se posiciona en relación a su “ancestro posicionado” más cercano, es decir, al “elemento padre” que tenga un valor de posición distinto a "static". Si no hay ningún “ancestro posicionado”, el elemento se posiciona en relación al bloque contenedor inicial del documento (generalmente al “body”). Cuando se establece el valor de "absolute" en un elemento, se elimina del flujo normal del documento, lo que significa que no afecta a la posición de otros elementos en la página.

- **fixed**: El elemento se posiciona en relación con la ventana del navegador, lo que significa que permanece en la misma posición incluso cuando se desplaza la página. Cuando se establece el valor de "fixed" en un elemento, también se elimina del flujo normal del documento. El elemento se coloca en la posición especificada con las propiedades "top", "right", "bottom" y "left". Si no se especifica ninguna de estas propiedades, el elemento se coloca en la esquina superior izquierda de su “ancestro posicionado” más cercano.

- **sticky**: El elemento se comporta como un elemento posicionado relativamente hasta que alcanza una posición específica en la página, donde se vuelve fijo.

- **inherit**: Hereda el comportamiento del elemento padre para dicha propiedad

:tv: [Propiedad position](https://youtu.be/w_mJaFQ7wvg)

---

¿Demasiada información? ¡No te preocupes! Vas a poder ver el siguiente video el cual te ayudará a visualizar y comprender mejor cómo funciona Flexbox:

:tv: [Propiedades de flexbox](https://youtu.be/PX27r7GLad4)

---

¡Muy bien! Ahora continuemos con las propiedades de Grid y sus posibles valores. No tienes que leerlo ahora, puedes hacerlo cuando lo consideres necesario:

👉 Leer sobre [Propiedadesde Grid](https://drive.google.com/file/d/1kNDt0EE9WMoVYDNuZJmFQkJMUDLoZa8Z/view)


💡¿Te gustaría poder practicar de una forma didáctica y divertida tanto Flexbox como Grid?

Te compartimos los enlaces de los siguientes juegos para que puedas hacerlo en tu tiempo libre:

[Flexbox Froggy](https://flexboxfroggy.com/#es)

[Grid Garden](https://cssgridgarden.com/#es)

---

## :star: Diseño responsivo


El diseño responsivo (“responsive”) es la práctica de crear páginas web que se adaptan automáticamente a diferentes tamaños y orientaciones de pantalla, brindando una experiencia de visualización óptima en varios dispositivos (de escritorio, tablets o smartphones).

Para realizar un diseño responsivo se utilizan las “media queries”, que son una técnica de CSS que permite aplicar estilos específicos a un documento HTML en función de las características del dispositivo que lo está visualizando, como el tamaño de la pantalla, la resolución, la orientación, entre otros. De esta manera, es posible crear diseños web adaptables y optimizados para diferentes dispositivos.

Las media queries se definen usando la sintaxis “@media”, seguido de un conjunto de reglas CSS.

![image](https://github.com/eugenia1984/QA/assets/72580574/38449a85-4306-4fdb-84e8-f4bb9c4640fa)

A continuación, te compartimos todas las opciones de uso posible de las media queries:

- **min-width**: Se aplica cuando la anchura de la pantalla es mayor o igual a un valor específico.

- **max-width*: Se aplica cuando la anchura de la pantalla es menor o igual a un valor específico.

- **min-height**: Se aplica cuando la altura de la pantalla es mayor o igual a un valor específico.

- **max-height**: Se aplica cuando la altura de la pantalla es menor o igual a un valor específico.

- **orientation**: Se aplica según la orientación del dispositivo, ya sea portrait (vertical) o landscape (horizontal).

- **aspect-ratio**: Se aplica según la relación entre el ancho y la altura de la pantalla.

- **device-aspect-ratio**: Se aplica según la relación entre el ancho y la altura del dispositivo.

- **resolution**: Se aplica según la resolución de la pantalla en píxeles por pulgada (PPI) o en puntos por pulgada (DPI).

- **min-resolution**: Se aplica cuando la resolución de la pantalla es mayor o igual a un valor específico.

- **max-resolution**: Se aplica cuando la resolución de la pantalla es menor o igual a un valor específico.

- **pointer**: Se aplica según el tipo de dispositivo de entrada que se esté utilizando, como none (para pantallas táctiles) o coarse (para dispositivos con puntero menos preciso).

- **hover**: Se aplica según la presencia o no de un dispositivo de puntero que permita la interacción a través de hover.

- **any-pointer**: Se aplica si el dispositivo tiene algún tipo de dispositivo de entrada de puntero.

- **any-hover**: Se aplica si el dispositivo tiene algún tipo de dispositivo de puntero que permita la interacción a través de hover.

En el siguiente video te ayudamos a comprender mejor cómo funcionan las medias queries más utilizadas:


:tv: [Media Queries mas utilizadas](https://youtu.be/TBipiJFQeLk)

---

## :star: Desafío del día


¡Llegó el momento de poner en práctica algunos de los conceptos vistos! El desafío de hoy consiste en mejorar el diseño y la estructura de la página HTML sobre la que viniste trabajando en los encuentros anteriores.

1.  Abrir el archivo "styles.css" de la sección anterior y comenzar añadiendo un contenedor para centrar nuestro contenido. Agregar el siguiente código CSS:

![image](https://github.com/eugenia1984/QA/assets/72580574/9a49b836-37c7-4e72-adbc-a898918f81c2)

2. Ahora, abrir el archivo "mi-primer-website.html" y envolver el contenido dentro de la etiqueta <body> con un nuevo elemento <div> con una clase de "container". Tu HTML actualizado debería similar a este:


![image](https://github.com/eugenia1984/QA/assets/72580574/1740f818-07d6-4f00-b811-10d03f3a6e61)

  
3. Guardar tu archivo HTML y actualizar el navegador. Ahora deberías ver el contenido de tu página web centrado dentro de un contenedor.

4. A continuación, crearemos un simple diseño responsivo de dos columnas utilizando Flexbox. Agregar el siguiente código CSS a tu archivo "styles.css":
  
![image](https://github.com/eugenia1984/QA/assets/72580574/b56b6cac-c608-415b-8c26-fa7e1e2e9c8d)

5. Actualizar tu archivo "mi-primer-website.html" para incluir un diseño de dos columnas. Envolver los párrafos existentes en un nuevo <div> con una clase de "row" y encerrar cada párrafo dentro de un <div> con una clase de "column". Tu código HTML actualizado debería quedar similar al siguiente:
  
![image](https://github.com/eugenia1984/QA/assets/72580574/6d6e4723-6006-41af-a41e-a26d0537ea90)

6. Guardar tu archivo HTML y actualizar el navegador. Ahora deberías ver un diseño responsivo de dos columnas para tus subtítulos y párrafos.

7. Para hacer que el diseño sea verdaderamente responsivo, agregaremos una media query para apilar las columnas en pantallas más pequeñas. Agregar el siguiente código a tu archivo "styles.css":
  
![image](https://github.com/eugenia1984/QA/assets/72580574/e5d5f0b5-92d3-404c-86be-0095b34809a2)

 Este código aplicará el nuevo estilo a la clase “.column” cuando el ancho de la pantalla sea de 600 píxeles o menos, haciendo que las columnas se apilen verticalmente.

8. Guardar tu archivo "styles.css" y probar la capacidad de respuesta de tu página web redimensionando la ventana del navegador. Recuerda que las columnas deberían apilarse cuando el ancho de la ventana sea de 600 píxeles o menos.

¡Desafío terminado! 🙌
  
[esolución del desafío - En el siguiente video te compartimos un paso a paso de cómo resolver el desafío anterior](https://youtu.be/B_Rjk4jTMJ8)
  
---
  
## :star: Valida tus conocimientos


Te facilitamos nuevamente los enlaces del material complementario para que puedas continuar profundizando sobre estos temas cuando más gustes:

[Propiedades de Flexbox](https://drive.google.com/file/d/1D4FSZSgnyioBYt7fRsAgX2wC5I4STER6/view)

[Propiedades de Grid](https://drive.google.com/file/d/1kNDt0EE9WMoVYDNuZJmFQkJMUDLoZa8Z/view)

Por último, te proponemos realizar la autoevaluación para poner a prueba los principales aprendizajes del día de hoy. ¿Vamos?

📝 Realizar Test

Ten en cuenta que si has llegado hasta aquí, ya has cumplido con el objetivo del encuentro.

¡Hasta la próxima! 👋
  
---
  
## :star: Mapa de conceptos vistos

¡Felicidades! 🎉

Has mejorado con éxito el diseño y la estructura de tu página HTML. Hoy aprendiste sobre: Box Model, Display y Position, Flexbox y Grid, y el diseño responsivo. Estos conceptos te ayudarán a crear páginas web más complejas y visualmente agradables.

En el encuentro que le sigue, introduciremos JavaScript, un lenguaje de programación potente que te permitirá agregar interactividad y contenido dinámico a tus sitios web.

---
  
## Mapa de conceptos

Te dejamos a continuación una imagen para que revises los conceptos vistos
  
![image](https://github.com/eugenia1984/QA/assets/72580574/0ceee0b4-304e-4e35-91ab-714ab5ea7d0d)

  
---  
 
## :computer: MI PRACTICA
  
Asi se ve:
  
![image](https://github.com/eugenia1984/QA/assets/72580574/609e28a9-1feb-449c-a5db-3883c52bf1fd)

  Es responsive, en pantallas de hasta 600px de ancho:
  
  ![image](https://github.com/eugenia1984/QA/assets/72580574/a3785ead-a17c-4094-8dc4-bc6ead478c9d)

  
[Aca podes ver el codigo](https://github.com/eugenia1984/QA/tree/main/EGG/testing_automation_1/practicas/encuentro03)
  
  
  

