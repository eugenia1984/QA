# :star: PRACTICAS CON HERRAMIENTAS DE TESTING

---

## :book: TEMAS

- 1 - Práctica - chequear la velocidad de carga de una web

- 2 - Práctica: Chequeando Velocidad de carga de una Web

- 3 - Práctica: Buscando Links Rotos

- 4 - Práctica: Solicitud de Validación de Código de una web

- 5 - Práctica: Test Visual de Página Web

- 6 - Práctica de Contenido n° 4

- 7 - Clase 1 en vivo. Curso de Testing. Transmisión en vivo de Instituto Web

---

## :star: 1 - Práctica: Prueba de Velocidad de Tu Conexión a Internet

Autoprueba, para saber qué velocidad de internet tengo con [**Spped Test Ookla**](https://www.speedtest.net/)

![image](https://user-images.githubusercontent.com/72580574/216789660-1586d10b-2622-4bab-a0ca-2922dedc4926.png)

Se descarga un archivo y se sube, para saber la velocidad que tenemos de SUBIDA y de BAJADA

-> Medimos con el test de Ookla cual es tu velocidad de conexión, tu ancho de banda y la latencia de la conexión.😎

Se usa para un **testeo de estrés** y para una **prueba de velocidad** de una página web.

---

## :star: 2 - Práctica: Chequeando Velocidad de carga de una Web

- Utilizaremos un sistema de control de carga y estructura para medir si la página posee un buen rendimiento para ser considerada indicada en los listados de buscadores.

[https://pagespeed.web.dev/](https://pagespeed.web.dev/)


-En el buscardor ingresamos la URL que queremos testear

-Se puede elegir **mobil** ù **ordenador**

![image](https://user-images.githubusercontent.com/72580574/216790112-b65dc297-ec01-44e7-b0f6-b5363554e8da.png)

![image](https://user-images.githubusercontent.com/72580574/216790160-0f5b15c0-025f-4070-87ae-13af2e4d9f41.png)

![image](https://user-images.githubusercontent.com/72580574/216790171-83cb4d91-eea4-4693-af77-218854734f36.png)

![image](https://user-images.githubusercontent.com/72580574/216790180-7df0a63a-58fe-4c43-8089-bb9658a7674a.png)


-> Es parecido al **LightHouse** de las Tools de Desarrolladores de Chrome

-> Para poder analizar si la página comienza desde el inicio con problemas de carga.

---

## 3 - Práctica: Buscando Links Rotos

- Veamos como automatizar la búsqueda de links sin funcionamiento en una página web.

El chequeo de los links, de todo lo que tiene que ver con botones y derivaciones a la misma web o a otra página.

A veces si los links son muchos, el chequeo se complica.

Como ejemplo queremos analizar la web de la revista Caras -> [https://caras.perfil.com/](https://caras.perfil.com/), que al ser de noticias, tiene muchos links.

¿Cómo podemos quechear todos los links para confirmar que todos funcionan bien? ¿Que no tengamos un link que nos lleva a una web que no existe? ¿Qué todos los links lleven a algùn lugar?

- Existe un plugging(**extension de Chorme**) que se llama [**CheckMyLinks**](https://chrome.google.com/webstore/detail/check-my-links/ojkcdipcgfaekbeaelaapakgnjflfglf?hl=en)



![image](https://user-images.githubusercontent.com/72580574/216790466-2dd0ed91-021a-4e52-88a7-c8028f5be187.png)


-> Me marca 9 links invalidos, son con error 404 (page not found)

---

## :star: 4 - Práctica: Solicitud de Validación de Código de una web


- Mediante el "validator" podemos obtener un rápido informe sobre errores o faltantes en el código de la página, aunque no sepamos codificar ni que significan estos errores, simplemente ejecutar el proceso y derivarlo al sector de desarrollo es una de las responsabilidades del tester.

-Es una **Revisión del código** con la **W3C**, la fundación sin fines de lucro que lleva la definición de los estándares para las páginas webs. Tienen un validador de código: [**https://validator.w3.org/**]([)](https://validator.w3.org/)

![image](https://user-images.githubusercontent.com/72580574/216790888-03945521-a4f7-400e-9928-996c696b0769.png)

![image](https://user-images.githubusercontent.com/72580574/216790899-9d16cd71-e892-41f1-9f83-3ee94832931a.png)

![image](https://user-images.githubusercontent.com/72580574/216790921-b22e8074-70af-4097-8909-29c01cfa4752.png)


-> Son errores de código que se pueden informar.


---

## :star: 5 - Práctica: Test Visual de Página Web

- Testeando que las fuentes y colores sean correctos.

Son pruebas iniciales, que no se suelen hacer.

Vemos la web de Mercado Libre y comprobamos:

- Que la tipografía que se use en la página es la que seleccionó la gente de diseño. Para ello debemos tener la especificación.

- Que los colores matcheen con el diseño, vemos el logo y los colores.

Usamos dos extensiones:

- [**WhatFont**](https://chrome.google.com/webstore/detail/whatfont/jabopobgcpjmedljpbcaablpmlmfcogm?hl=en), para las tipografías

![image](https://user-images.githubusercontent.com/72580574/216791180-41e3c926-9ddb-4ec7-a9aa-019de3f2643f.png)

- [**ColorZilla**](https://chrome.google.com/webstore/detail/colorzilla/bhlhnicpbhignbdhedgjhgdocnmhomnp?hl=es-419)

![image](https://user-images.githubusercontent.com/72580574/216791226-dd7fcbae-7bfd-4e4c-a2d0-2fb6694a402e.png)


![image](https://user-images.githubusercontent.com/72580574/216791239-308f772b-20a0-4f22-94aa-54a94237b0d4.png)

Trabajan sobre páginas que no estuvieran ya abiertas.

ColorZilla tiene el **color picker** y voy a ir pasando por la web y me va mostrando el código de color en RGB y en HEXADECIMAL.

Los colores son parte del **Branding** de la marca.

Algo similar pasa con WhatFont, voy haciendo click en los titulos, textos, etc, aca lo vemos con ejemplo:

![image](https://user-images.githubusercontent.com/72580574/216791405-d037f038-34b0-4b3e-974f-8c68e925cbc2.png)

Es para ver que se cumpla con el diseño planteado.

Es un **Test visual** y de **Relación del usuario con la pantalla**.


---

## :star: 6 - Práctica de Contenido n° 4


![image](https://user-images.githubusercontent.com/72580574/216791541-a77d6259-5f58-4fea-aed2-928c644f6c41.png)


---


## :star: 7 - Clase 1 en vivo. Curso de Testing. Transmisión en vivo de Instituto Web

Se ve la página del banco Ciudad que despliega un cartel, y uno tiene la posibilidad de seleccionar de **Recordar màs tarde**, al hacer click, el cartel desaparece por un tiempo.

¿Y cómo se hace esto? Por medio de **cookies**, un archivo que va contando la cantidad de veces en que nosotros ingresamos en la página. Cuando ese valor llegue  acierto número el cartel vuelve a salir. La idea de la cookie es **guardar información del usuario**.

La **cookie** es el único archivo permitido, para que el navegador acceda al disco rígido.

-> Al limpiar el historia, se borran las cookies.

-> Si entramos en modo incógnito NO HAY COOKIES.

-> Depende del navegador, las coookies se guardan en distintos lugares. En Chrome se guarda todo en un único archivo.

-> El testing debe realizar análisis de las cookies, que están programadas por un desarrollador del proyecto.

-> Las cookies se guardan en carpetas donde están los navegadores de la pc.

Un ejemplo es al entrar a Mercado Libre por primera vez, que uno selecciona el pais, eso se guarda en una cookie, entonces ya no se vuelve a preguntar.

Otro ejemplo, es cuando uno hace una búsqueda de un producto, y luego al entrar de nuevo me muestra ese producto o cosas relacioandas.

-> Se supone que las cookies no pueden tener cosas ejecutables.

- Hay una extensión [**Cookie-Editor**](https://chrome.google.com/webstore/detail/cookie-editor/hlkenndednhfkekhgcdicdfddnkalmdm?hl=en) de Google Chrome.

![image](https://user-images.githubusercontent.com/72580574/216792064-bc3b9a97-bf70-4f7c-9e23-a959e299c9c1.png)


-> Al hacer click en el ícono de **cookie-editor** me aparece la lista de todas las cookies que tiene la web. Tengo la opción de poder **borrar todas las cookies**.


- Las **Extensiones** son programas que se instalan y nos dan una funcionalidad extra en el navegador.

-> La difernecia del cache es que guarda imagenes y datos de la web para que luego se abra más rápido. En cambio las cookies va guardando el paso a paso nuestro en la web.

- Detrás de las páginas hay tecnología. Y como testers vamos a consultar: ¿Tiene cookies? ¿Qué valores va a responder la cookie? ¿Qué actividad cumple la cookie? ¿En qué momento tiene que hacer algo la cookie? Todo esto es una documentación que nos tienen que dar.

- Al testear estas webs nos podemos encontrar con dos cosas...

... **bloqueadores** de carteles

... **captchas** (donde hay que hacere click a los semaforos, las biciletas, el hacer click donde no soy un humano)

-> Como tester se le pide al equipo de desarrollo que saquen la funcionalidad para poder testearla, asi no nos bloquean.  Por eso está en **entorno de testing** y el **entorno de desarrollo**. Porque sino estas funcionalidades nos bloquean el testing.

-> Es casi imposible forzar páginas online, por eso están los ambientes de desarrollo.

- Con **JMetter** se pueden hacer **pruebas de estress**, se le envía información a una web, hasta que la misma ya no pueda más. Y la **prueba de fuerza** es para saber hasta que momento la página pudo soportar toda esa acumulación de información que le llegó. 

Entonces llegamos a un resultado, por ejemplo: *Tu pagina aguanta hasta 3.000 usuarios por hora. Cuendo llega al 3.001 se cae, es la **prueba mayor de fuerza**. Entonces 3001 es el punto de estress.

-> JMetter tiene cosas de automatización.

- Siempre hay que dejar bien documentado **la velocidad que tenemos nosotros en el momento de hacer las pruebas**. Porque si tenemos internet lenta nos puede dar malos resultados. Por eso se utiliza [https://www.speedtest.net/](https://www.speedtest.net/). Da el ANCHO DE BANDA CONTRATADO, lo cual NO ES LA VELOCIDAD. La VELOCIDAD la marca LA LATENCIA, los números chicos abajo de los números grandes de descarga y salida. La conexión es **asincrónica** se descargan archivos mucho más rápidod e lo que se envían. En ejemplo: "Se envía más rápido un email de lo que se recibe".

- Con **10 mega** es suficiente para una prueba de estress.

- Todos estos testeos que se van haciendo, se van a ir **documentando** y se van agrupando por **categorías**.



---
