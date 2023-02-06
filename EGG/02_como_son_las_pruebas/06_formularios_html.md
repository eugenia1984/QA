# :star2: 2.6 - Formularios HTML

---

MODULO 2 - ENCUENTRO 12 / 17

---

Hoy aprenderemos a:

- Reconocer los elementos que conforman un formulario HTML

- Reconocer cuándo es conveniente utilizar cada elemento.

---

## :book: MATERIAL DE LECTURA :book:

## ¿Qué es un formulario web?


Ya todos sabemos lo que es un formulario web, son esa serie de campos de texto, fechas, números, cajitas para tiquear y con un botón al final que tenemos que rellenar para registrarnos en un página, para reservar un fin de semana en cancun o para aprobar un examen. 

![image](https://user-images.githubusercontent.com/72580574/217088983-9a0b4f56-fffb-45af-b83d-15d6ba145371.png)




## ¿Por qué vamos a analizar los formularios HTML?

El testing de formularios es un proceso que se realiza para probar la calidad de un formulario en un página web, verificando elementos como campos de texto, longitud y diseño en general. Uno de los propósitos de testear formularios es para mejorar las tasas de conversión, lo que sería el porcentaje de gente que pasa de ser visitantes de la página a consumidores/clientes de dicha página.

Los formularios son herramientas importantes para muchos sitios web ya que sirven como dispositivos de comunicación con los clientes, creando una conexión entre los visitantes y las empresas.

Que los clientes puedan enviar la información que quieren de manera correcta a través del formulario es importante como, por ejemplo en el caso de un pedido o una consulta de soporte. Ahí tenemos información que se debe representar de la manera que quiere el cliente y por eso es importante que probemos el correcto funcionamiento del formulario. 

Por ejemplo, una tienda de ropa en línea podría usar un formulario de encuesta para que sus clientes califiquen diferentes aspectos del sitio web que les gustan y no les gustan. La tienda puede realizar pruebas al formulario para evaluar si el diseño está en línea con la estética general del sitio web. También, pueden asegurarse de que la fuente sea legible, que sea de fácil acceso, que cada opción sea funcional y no tenga errores técnicos o de usabilidad. Ya que, en caso que enviemos un formulario que no esté probado podemos perder toda esa información que para la empresa puede ser de mucha utilidad.


## ¿Por qué es importante la prueba de formularios?

Ya vimos que es la prueba de formulario y algunas de las razones por las cuales deberíamos siempre hacer pruebas de formulario, ahora vamos a enumerar todas las ventajas que nos va a dar la prueba de formularios.

- **Impulsa el tráfico de usuarios**: 
Puede ayudar a impulsar el tráfico a su sitio web, mejorando tanto las variantes orgánicas (visitantes) como las pagas (clientes). Cuando sus formularios funcionan correctamente, es más probable que los clientes regresen a su sitio web y dejen comentarios. 

- **Mejora las comunicaciones empresa-cliente**: Un formulario que funciona según lo previsto permite a los clientes comunicarse con la empresa para proporcionar la información necesaria para las operaciones comerciales. 

- **Percepción del cliente**: Tener un formulario que funciona como corresponde puede darle mucha información a la empresa sobre cómo el cliente percibe el sitio web, que cosas le gustan, cuáles no, qué cosas están fallando, siempre desde la perspectiva de alguien que utiliza el sitio web. 

- **Mejora la resolución de problemas**: El testeo de formularios es útil porque nos va a ayudar a descubrir todos los problemas que tenga nuestro formulario y cómo resolverlos.

- **Mejora las conversiones de clientes**: Testear nuestro formulario es importante porque puede ayudar a convertir a los visitantes en clientes. Además, los formularios que funcionan correctamente pueden mejorar la percepción que tiene el cliente sobre nuestro sitio web.

- **Mejora la usabilidad del formulario**: La usabilidad es esencial para un formulario porque describe qué tan bien los clientes pueden usar y navegar a través de los distintos aspectos y detalles del formulario. Probar los formularios nos va a dejar un formulario sencillo de utilizar para el cliente.


**Conclusión**: ya entendemos que es un formulario, que son las pruebas de formulario y por qué son importantes, pero, ahora hay una pregunta que nos aparece, **¿qué elementos componen un formulario y que cosas deberíamos validar de dichos elementos ?**

## Pero… ¿Qué elementos componen a un formulario?

Los formularios están compuestos principalmente por campos de texto o en html (lenguaje de programación con el que se crean los formularios) conocidos como **inputs**, estos campos son los que deberemos completar con nuestra información.

Hay muchas convenciones que damos por sentado en los formularios, por ejemplo si me piden ingresar numeros, que solo pueda ingresar numeros o que si voy a ingresar mi contraseña no se pueda ver el texto y aparezcan circulos negros. 

Pero esto hay que validarlo y para eso tenemos que entender cómo funcionan estos campos y qué tipos de campos existen. En esta guía veremos los distintos tipos de campos que existen y cuáles son algunas de las validaciones importantes que tenemos que hacer.

## Inputs

HTML, que es el lenguaje de programación usado para crear formularios, nos propone una gran diversidad de alternativas a la hora de crear nuestros formularios, es decir, una gran variedad de elementos para diferentes propósitos. Estas van desde la clásica caja de texto, hasta la lista de opciones en un menú desplegable, pasando por las cajas de validación, etc. Por ahora nos concentramos en los inputs y más adelante veremos las cajas o menús desplegables

Los campos de texto son generados en el código por medio de la etiqueta `<input>` por eso les decimos inputs. Con solo la etiqueta input decimos que el formulario va a tener un campo de texto, pero, no tiene definido ningún tipo de dato concreto. 

## Tipo de inputs

Para poder especificar el tipo de dato que se va a ingresar en nuestro input se le agrega un atributo llamado type y a ese atributo se le especifica el tipo de dato, por ejemplo:  

```<input type="number">```

Esto haría un input de tipo numérico. Veamos entonces todos los tipos de datos que nos permite el input.


### 1 - TEXT (Texto)

Este tipo permite al usuario ingresar texto.

Se vería así: 

![image](https://user-images.githubusercontent.com/72580574/217089459-79f28ec1-fd5b-4e05-9ba5-d2c2a0228972.png)

Para textos muy grandes usamos otro tipo de input llamado textarea, que lo veremos más adelante.

#### Validaciones a realizar en los campos de texto

Al encontrarnos con un campo de texto, nosotros como testers tenemos la tarea de validar los siguientes puntos, para que el formulario funcione de la manera esperada.

- **Mayúsculas, minúsculas y números**: Que el campo le permita al usuario escribir en mayúsculas, minúsculas y números. Imagínate que tienes que ingresar la dirección de tu calle, deberías poder ingresar mayúsculas, minúsculas y números. 

- **Caracteres especiales**: Los caracteres especiales son caracteres que no están presentes en el diseño del teclado. Se pueden usar si se presiona una combinación de teclas en el teclado (ej: coma, ©,®, #)

- **Caracteres de control**: Un carácter de control es, en el ámbito de la informática, un carácter no imprimible que sirve para uso interno de la computadora (ej: null, ETX)

- **Máximo posible**: Usualmente nosotros validamos una longitud de caracteres que elija el programador, supongamos que el programador elige que se pueden ingresar 100 caracteres, deberemos probar qué más de 100 no se pueda. 
El máximo posible de caracteres que se puede ingresar por defecto en un campo de texto es 524,288 caracteres. 

- **No trunca la cadena ingresada**: Cuando decimos que no trunque la cadena ingresada es que no acorte el largo de la cadena, por ejemplo: "Mi nombre es M…"


## 2 - NUMBER (Numérico) 

Este tipo permite al usuario ingresar números. Los navegadores vienen con validaciones para evitar que el usuario ingrese algo que no sea números. Además, en los navegadores modernos, los campos numéricos suelen venir con controles que permiten a los usuarios cambiar su valor de forma gráfica.

Se vería así:

![image](https://user-images.githubusercontent.com/72580574/217089711-23cf0e4f-bcb5-4326-9336-e9de8847cbfe.png)

### Validaciones a realizar en los campos numéricos

Al encontrarnos con un campo numérico, nosotros como testers tenemos la tarea de validar los siguientes puntos, para que el formulario funcione de la manera esperada.

- **Sólo números (o carácteres como +, -, .,  o el número e, entre otros)**: Supongamos que tenemos que ingresar una suma o que tenemos que ingresar un dni con puntos entre cada número.

- **Máximo posible**: Usualmente nosotros validamos una longitud numérica que elija el programador, supongamos que el dato a ingresar es un año, el programador pondrá que no se puedan ingresar más de 4 caracteres y nosotros deberemos validar que el funcionamiento sea correcto. 

Dato de color: el máximo posible de caracteres numéricos que se puede ingresar por defecto es de 524,288 caracteres numéricos.

- **Números negativos, cero, decimales**: Que el campo le permita al usuario escribir números negativos, el número cero o escribir con decimales. Lo decimales en campos numéricos suelen escribirse con punto en vez de coma, ej: 10.5

- **No nulos**: Significa que no permite enviar el formulario con ese campo vacío, seguramente lo has visto en algún formulario de google que has completado en el pasado. Depende de como armemos el formulario y que consideremos importante, este tipo de restricciones pueden existir o no. Por ejemplo, muchas veces los datos personales son campos marcados como no nulos, ya que son fundamentales para poder procesar y gestionar  los datos ingresados.

## 3 - DATE (Fechas)

Este le permite al usuario ingresar una fecha, ya sea mediante una caja de texto o una interfaz gráfica con selector de fecha.

![image](https://user-images.githubusercontent.com/72580574/217089944-ffd64e9d-a662-4fdf-ad66-a0978e430a7d.png)

### Validaciones a realizar en los campos de fechas

Al encontrarnos con un campo de fecha, nosotros como testers tenemos la tarea de validar los siguientes puntos, para que el formulario funcione de la manera esperada.

- **Sólo números, tipo de caracteres aceptados, combinado, formato predefinido**: Que el campo le permita al usuario solo escribir números o usar caracteres combinados como por ejemplo el guión para escribir una fecha (31-05-1997)

- **Formato:  d/m/a  .  a/m/d  .  m/d/a  .  d-m-a  .  a-m-d  .  m-d-a**: El formato en el que se representa la fecha depende del país en donde se utilice la web que aloja al formulario o la cultura a la que pertenecen los usuarios que lo van a completar. Supongamos que en el argentina usamos dia/mes/año, revisar que esté ese formato y no a/m/d

- **Caracteres especiales**: Los caracteres especiales son caracteres que no están presentes en el diseño del teclado. Se pueden usar si se presiona una combinación de teclas en el teclado (ej: coma, ©,®, #). Es necesario corroborar si el formulario acepta o no acepta este tipo de caracteres según los requerimientos planteados en el proyecto. 

- **No nulos**: Significa que no permite enviar el formulario con ese campo vacío, seguramente lo has visto en algún formulario de google que has completado en el pasado.





---
