# :star2: 1.4 - Introducción a las pruebas

---

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

## :star: INTRODUCCION

**¡Te damos la bienvenida a tu cuarto encuentro de trabajo!**

- **Check de 1 minuto**: ¿Cómo te sientes hoy? Tómate un minuto y dedícalo a agradecerte a ti mism@ por hacer este esfuerzo de aprender algo nuevo.  Ese futuro del que hablan todos ya está aquí: una persona cambiará de carrera de 5 a 7 veces en su vida. No es una frase de marketing, es real. Si no nos crees, [aquí tienes un artículo en inglés](https://careers-advice-online.com/career-change-statistics) y [aquí uno en español](https://www.businesstribe.com.mx/inicio/mitos-mas-grandes-sobre-cambiar-de-profesion/). 

- **Ya estás en camino**: si este es tu primer estudio luego de la escuela, sentará las bases de los que sigan. Y si estás aquí complementando estudios anteriores, este programa enriquecerá tus conocimientos. 

**¡Demos comienzo a la actividad del día de hoy!**

---

## ¡Demos comienzo a la actividad del día de hoy! ⏰ (10min)

### 1. Presentación del equipo:

¡Listos, preparados, ya! 

A esta altura conoces bien cómo funciona este momento. ¿Ya se han presentado con el equipo? ¿Te has encontrado nuevamente con alguien? ¿Qué conceptos o nuevo vocabulario has incorporado sobre QA en el encuentro anterior?

Utilicen unos 10 minutos para compartir estas breves presentaciones y repasar los conceptos que han aprendido en el encuentro anterior. 

¡Seguro recuerdas más de lo que crees!

---

## :book: MATERIAL DE LECTURA ⏰ (20min)


### :star: 2. Introducción 

En los encuentros anteriores estuvimos analizando el contexto de la producción de software y en qué momentos es posible hacer pruebas o diseñar la mejor estrategia para realizarlas. También, descubrimos en qué momentos es posible interactuar con el equipo de desarrollo.

En el encuentro de hoy, profundizaremos sobre el testing en sí. 

### ¿Qué es el Testing?

El testing o prueba de software es un método para verificar si el producto de software real cumple con los requisitos esperados y busca garantizar que el producto de software esté libre de defectos. 

Implica la ejecución de componentes de software o sistemas utilizando herramientas manuales o automatizadas y se evalúan una o más propiedades de interés. El propósito de las pruebas de software es identificar errores, brechas o requisitos faltantes en contraste con los requisitos reales.
La prueba de software es el proceso de evaluar y verificar que un producto o aplicación de software hace lo que se supone que debe hacer. Los beneficios de las pruebas incluyen la prevención de errores, la reducción de los costos de desarrollo y la mejora del rendimiento.


### ¿Cuáles son los objetivos del testing?

<img width="591" alt="Screen Shot 2023-01-24 at 14 57 27" src="https://user-images.githubusercontent.com/72580574/214371147-5ebd9d8a-e515-432f-817a-3141533c6bfc.png">

 Imagen 4.1: Objetivos del testing. Fuente: producción propia.

### 1. Para evitar defectos en el producto de software:

Uno de los objetivos de las pruebas de software es evitar los errores en las primeras etapas del desarrollo. La detección temprana de errores reduce significativamente el costo y el esfuerzo. La prevención de defectos implica hacer un análisis de causa raíz de los defectos encontrados previamente y luego tomar medidas específicas para prevenir la ocurrencia de ese tipo de errores en el futuro. Las pruebas eficientes ayudan a proporcionar una  aplicación sin errores. Si previene los defectos, se reducirá el recuento general de defectos en el producto, lo que garantiza aún más un producto de alta calidad para el cliente.

### 2. Evaluar productos de trabajo: 

Los requisitos iniciales, el diseño, las historias de usuario y el código deben verificarse antes de que el desarrollador los recoja para el desarrollo. Identificar cualquier ambigüedad o requisitos contradictorios en esta etapa ahorra un tiempo considerable de desarrollo y prueba. El **análisis estático del código** (1) (revisiones, recorridos, inspección, etc.) ocurre antes de que el código se integre o esté listo para la prueba. Esta prueba se conoce como Verificación y puede ser realizada por el mismo equipo de desarrollo o por el equipo de QA (quality assurance).


(1) Análisis estático y análisis dinámico son dos tipos de evaluación de código. ¿Tienes tiempo extra y deseas explorar más? Aquí puedes adelantar algunos conceptos.

### 3. Verificar requerimientos: 

El principal objetivo de las pruebas debe ser satisfacer las necesidades del cliente. Los testers prueban el producto y aseguran la implementación de todos los requisitos especificados. El desarrollo de todos los casos de prueba, independientemente de la técnica de prueba, garantiza la verificación de la funcionalidad de cada caso de prueba ejecutado. El tester también debe crear una matriz de trazabilidad de requisitos (**RTM**) (2), que garantizará el mapeo de todos los casos de prueba a los requisitos. RTM es una forma efectiva de garantizar que los casos de prueba tengan la cobertura de requisitos adecuada. 


(2) Lo verás más adelante, pero si no aguantas, te dejamos esta definición: La trazabilidad de requerimientos es la capacidad de registrar las relaciones existentes entre la necesidad dada por un interesado (stakeholder), el requerimiento de proyecto y la solución implementada finalmente.

### 4. Validar el objeto de prueba: 

Para validar si el objeto de prueba está completo y funciona según las expectativas de los usuarios y las partes interesadas (stakeholders). Las pruebas aseguran la correcta implementación de los requisitos junto con la seguridad de que funcionan según las expectativas de los usuarios. Esta idea de prueba se llama Validación.

### 5. Construir confianza: 

Uno de los objetivos críticos de las pruebas de software es mejorar la calidad del software que se entregará para construir confianza con quien lo solicitó. El software de alta calidad significa un menor número de defectos. En otras palabras, cuanto más eficiente sea el proceso de prueba, menos errores tendrá en el producto final. Lo que, a su vez, aumentará la calidad general del objeto de prueba. La excelente calidad contribuye a un aumento significativo en la satisfacción del cliente, así como a menores costos de mantenimiento.

### 6. Reducir riesgos:

La posibilidad de pérdida también se conoce como riesgo. El objetivo de las pruebas de software es reducir el riesgo. Cada proyecto de software es único y contiene un número significativo de incertidumbres desde diferentes perspectivas, como ser el tiempo de lanzamiento al mercado, el presupuesto, controlamos estas incertidumbres, podremos tener riesgos potenciales no solo durante las fases de desarrollo sino también durante todo el ciclo de vida del producto. Por lo tanto, el objetivo principal de las pruebas de software es integrar el proceso de gestión de riesgos para identificar cualquier riesgo lo antes posible en el proceso de desarrollo.(3)

(3) Recuerda este objetivo cuando al final del encuentro de hoy estés leyendo sobre el caso de Microsoft. #spoiler


### 7. Mantener informadas a las partes interesadas (stakeholders):

El propósito de las pruebas es proporcionar información completa a las partes interesadas sobre restricciones técnicas o de otro tipo, factores de riesgo, requisitos ambiguos, etc. Puede ser en forma de cobertura de pruebas, informes de pruebas que cubran detalles como lo que falta, lo que salió mal. El objetivo es ser transparente y hacer que las partes interesadas entiendan completamente los problemas que afectan la calidad. Un ejemplo concreto puede ser avisar al cliente que uno de los requerimientos tiene mucho riesgo y eso aumenta la probabilidad de errores y costos asociados. Al mantener informado al cliente, éste puede tomar decisiones con menor costo que si se le avisa al final, cuando no hay nada para hacer. 

### 8. Para encontrar defectos en el producto de software:

Otro objetivo esencial de las pruebas de software es identificar todos los defectos en un producto. El lema principal de las pruebas es encontrar el máximo de defectos en un producto de software mientras se valida si el programa funciona según los requisitos del usuario o no. Los defectos deben identificarse lo antes posible en el ciclo de prueba. 
Mientras que un defecto se pueda encontrar en la fase de pruebas, se lo conoce como error y tiende a ser solucionable antes de llevar el producto al cliente.

Otros objetivos posibles:

A veces debemos cumplir con los requisitos o estándares contractuales, legales o reglamentarios, y se debe verificar el cumplimiento del objeto de prueba con dichos requisitos o estándares. Por ejemplo, en relaciones contractuales con gobiernos o sistemas de seguridad o defensa, hay estándares de seguridad distintos que para una aplicación de compra y venta de ropa usada. 

Otros casos incluyen que el software sea desarrollado para una región específica y deba seguir las reglas y regulaciones legales de esa región. Además, el producto de software puede tener que ser compatible con los estándares de prueba nacionales e internacionales. 

### Tip de aprendizaje:

Toma nota o escribe estos objetivos e intenta recordar si has visto errores de este tipo en tu propia experiencia como usuario. Por ejemplo, en el número 5 (construir confianza), nosotros recordamos esas páginas web que a primera vista no nos resultan confiables ya que tienen demasiada información no relacionada al objetivo principal. ¿Quieres ver un ejemplo? No sabemos muy bien qué desean estas personas, pero desde el primer clic que ya no pondríamos nuestra tarjeta de crédito en [este sitio](http://www.greatdreams.com/).

---

## :star: BENEFICIOS DEL TESTING ⏰ (15min)


Estos son los beneficios de usar pruebas de software:

- **Rentabilidad**: es una de las ventajas más importantes de las pruebas de software. Probar cualquier proyecto de TI a tiempo lo ayuda a ahorrar dinero a largo plazo. En caso de que los errores se detecten en la etapa anterior de las pruebas de software, cuesta menos repararlos.

- **Seguridad**: Es el beneficio más vulnerable y sensible de las pruebas de software. La gente está buscando productos de confianza. Ayuda a eliminar riesgos y problemas antes.

- **Calidad del producto**: Es un requisito esencial de cualquier producto de software. Las pruebas aseguran que se entregue un producto de calidad a los clientes.

- **Satisfacción del Cliente**: El objetivo principal de cualquier producto es dar satisfacción a sus clientes. Las pruebas de UI/UX garantizan la mejor experiencia de usuario.

### ¿NECESITAS UN EJEMPLO? 

<img width="212" alt="Screen Shot 2023-01-24 at 15 02 39" src="https://user-images.githubusercontent.com/72580574/214372247-a0bc2f12-7c98-4bfb-938a-38d28e3446df.png">



Imagen 4.2: Pantalla de error. Fuente: producción propia.

Este es un mensaje emergente en una aplicación o una página web. A simple vista y sin mayor contexto, ¿puedes entender a qué se refiere? Y no estamos hablando de adivinar qué quisieron decir sino de que nos quede claro como usuarios (1) qué paso, (2) cuál es el próximo paso y (3) cómo evitar que nos vuelva a pasar. 

Si tuviéramos que explicar a soporte técnico qué nos pasó, ¿podrías hacerlo? Y si fueras soporte técnico, ¿podrías ayudar a este usuario con este nivel de detalle en el error?

### Secreto de la industria - Acelera tu aprendizaje

Estamos por explorar una variedad de elementos que “aparecen” en la pantalla de los usuarios. Si deseas explorar más, aquí te dejamos un artículo que explica la diferencia entre un pop up, un modal, un tool tip y una light box. [Leer](https://blog.ida.cl/diseno/ldiferencia-modal-pop-up-pop-over-light-box/)

---

## :star: MATERIAL DE LECTURA   ⏰  (45 min)

### Errores de software y bugs

Un error es una desviación de lo que se esperaba como exacto o correcto. En software, un bug es un error, defecto o falla en un programa o sistema que causa “un resultado inesperado o incorrecto o un comportamiento no deseado.“

Podemos inferir lo siguiente:

- Un error es una variante inesperada del resultado esperado

- Los errores son una categoría de bugs de software

Los errores pueden surgir de:

-requerimientos incompletos o incorrectos

-falla humana en el momento de la codificación (programación)

### Categorías comunes de errores de software:

#### 1 - Errores funcionales

La funcionalidad es la forma en la que se debe comportar el software. Los errores funcionales son, por ejemplo, si algo que se espera que realice es difícil, resulta confuso y extraño o es directamente imposible.



Mira esta pantalla de ejemplo:

<img width="405" alt="Screen Shot 2023-01-24 at 15 20 28" src="https://user-images.githubusercontent.com/72580574/214375714-58fb10e4-3fe3-4167-9cb1-8e2ee4aaa872.png">



Imagen 4.3: Pantalla “Eliminar publicación”. Fuente: producción propia.


La funcionalidad esperada del botón Cancelar es que el modal de Eliminar publicación se cierre y que se regrese a la página original de la publicación, sin eliminarla. Si el botón de cancelar no es clicable, estamos frente a un error de funcionalidad.



### 2 - Errores de comunicación o interpretación

El software presenta al usuario opciones o CTA (call to action) que son poco claros o que no realizan la acción que dicen realizar. Por ejemplo, no hay Menú de ayuda o Instrucciones para usuarios nuevos. O acciones que son centrales al software pero no figuran en la sección de Preguntas Frecuentes. Hasta puede ser que un botón lea “Guardar” y esté ejecutando “Eliminar.”

<img width="422" alt="Screen Shot 2023-01-24 at 15 22 26" src="https://user-images.githubusercontent.com/72580574/214376128-3aa16445-8247-4b50-aaf5-9da7e74810c0.png">

Imagen 4.4: Pantalla con copy erróneo en botón Guardar. Fuente: producción propia.

En este ejemplo - Imagen 4.4-, el equipo responsable de la creación visual de este aviso (Front End) transcribió incorrectamente el texto en el botón “Eliminar” y el usuario lee “Guardar” y el software ejecuta eliminar. 

### 3 - Errores de comandos faltantes

Este tipo de errores ocurre cuando un comando esperado está ausente. Observa el siguiente ejemplo:

<img width="227" alt="Screen Shot 2023-01-24 at 15 23 00" src="https://user-images.githubusercontent.com/72580574/214376237-49d43581-a149-4c69-b8be-f1f9d0d19dbf.png">



Imagen 4.5: Pantalla “Completa tu perfil”. Fuente: producción propia.

Esta pantalla permite que el usuario complete su perfil. Pero, no hay opción para que el usuario se vaya de esta pantalla sin completar su perfil. Ya que el botón “Cancelar” no se le provee al usuario, este es un error de comando faltante.


### 4 - Errores de sintaxis e idioma

Los errores de sintaxis corresponden a palabras mal escritas (ortografía o error de tipeado simple) u oraciones que son incorrectas desde lo gramatical. 

En el caso de software en español, también encontramos en esta categoría errores de herencia de inglés. Verás muchas veces que algunos textos todavía conservan el idioma en el que fueron escritos originalmente. Observa las siguientes imágenes a ver si puedes identificar todos los errores que puedas. 

Recuerda, ¡atención al detalle es una habilidad que debes desarrollar como si fueras investigador profesional!

Dato: estos errores generalmente se ven al testear un software que ya tiene su GUI o UI lista. (4)

<img width="660" alt="Screen Shot 2023-01-24 at 15 24 30" src="https://user-images.githubusercontent.com/72580574/214376575-9607cfa7-6da3-4103-8c43-cff83b6c2caf.png">

(4)  ¿GUI o UI? ¡Hora de googlear un concepto fundamental más! Tip: Saber usar los términos UX, UI y GUI te distingue en el mundo laboral. Muchos principiantes cometen el error de pensar que se refieren al mismo concepto. ¡Destácate desde el día #1! 

**Nota**: estos errores de sintaxis no se refieren a errores en la sintaxis del código. Esos los ven los desarrolladores cuando hacen sus tests funcionales.

**Practica inglés** y tómate una pausa refrescante

[Este artículo](https://www.idyoma.com/blog/funny-translation-fails) recopila algunas de las traducciones fallidas más graciosas. Y si tu nivel de inglés es intermedio a avanzado, puedes leer [este artículo](https://euro-com.net/en/the-8-biggest-mistakes-in-technical-translations-and-how-to-avoid-them/) que anticipa el problema de hacer traducciones técnicas sin traductores certificados. 


### 5 - Errores en el manejo de errores

Cualquier error que ocurra mientras el usuario está interactuando con el software necesita ser manejado en forma clara y con sentido. En otras palabras, el usuario debe comprender qué pasó (en un lenguaje ameno) y debe tener claro qué hacer como siguiente paso. Si esto no ocurre, a estos errores se los denomina “Error en el manejo de errores.”

<img width="234" alt="Screen Shot 2023-01-24 at 15 26 09" src="https://user-images.githubusercontent.com/72580574/214376925-f1fef5db-82c0-4e74-b2ff-d509ddebe589.png">


Imagen 4.8: Pantalla “Error 707”. Fuente: producción propia.


Siempre que sea posible, el usuario debe tener claro qué pasos debe seguir.
Si en un formulario, por ejemplo, hay campos obligatorios que necesitan ser llenados, los mensajes de validación deben ser claros e indicar qué acciones debe realizar el usuario. Aquí tienes un ejemplo bien manejado:

<img width="549" alt="Screen Shot 2023-01-24 at 15 26 26" src="https://user-images.githubusercontent.com/72580574/214377014-7427491e-9d0b-4158-8a1e-b82195009574.png">



Imagen 4.9: Pantalla “Completa tus datos”. Fuente: producción propia.

Otros ejemplos de mal manejo de errores pueden lucir como las pantallas a continuación: 

<img width="657" alt="Screen Shot 2023-01-24 at 15 27 17" src="https://user-images.githubusercontent.com/72580574/214377231-cccdbe0a-6caf-4a39-9cd7-271ce57220c9.png">

### 6 - Errores de cálculo

Este tipo de errores ocurre cuando una porción del código del software tiene algún error. Algunos ejemplos son:

- Errores de lógica

- Fórmulas incorrectas

- Tipos de datos no alineados (texto vs números, por ejemplo)

- Errores de código

- Errores en las funciones internas del código

- Bases de datos inexistentes o mal asignadas

En 1999, la NASA perdió su orbitador climático en Marte debido a que uno de los proveedores de la NASA involucrado en su construcción utilizó medidas imperiales (usadas en Inglaterra) en lugar de utilizar el sistema métrico universal (utilizado en todo proyecto científico). Este pequeño error causó que los propulsores del orbitador no funcionen correctamente. Debido a este error, el orbitador se estrelló casi inmediatamente al llegar a Marte.

### 7 - Errores de control de flujo

El control de flujo en un software describe qué hará este en su próximo paso y bajo qué condiciones.

Por ejemplo, consideremos un sistema en el que el usuario debe completar un formulario y las opciones disponibles son: Guardar, Guardar y cerrar y Cancelar. 

Si el usuario hace clic en el botón de Guardar y cerrar, la información del usuario en ese formulario debiera ser guardada y el formulario cerrarse. Si al hacer clic en ese botón, no se cierra el formulario, es un error de control de flujo. 

<img width="521" alt="Screen Shot 2023-01-24 at 15 28 26" src="https://user-images.githubusercontent.com/72580574/214377434-8647c63b-31fa-4bae-bc08-9288a299da8c.png">




Imagen 4.12: Pantalla “Formulario de inscripción”. Fuente: producción propia.


Antes de continuar, vamos a poner en práctica tus habilidades de detección de errores.

---

## :star: MANOS A LA OBRA ⏰ (40 min)

Tenemos dos ejemplos de errores para que comiences a practicar. 

- Ejemplos tipo 1: los preparamos para ustedes, basados en documentación real.

- Ejemplos tipo 2: los traemos del mundo real, así como vienen. Verán que están en inglés o español y puede que les falte contexto. 

### Ejercicio

Para cada uno de los ejemplos presentados a continuación, completa [una tabla como esta](https://docs.google.com/document/d/1VBZqJ7hs48AbapsU42OueCKdvymO1YhnBZbQeTj6hi4/edit?usp=sharing) indicando el tipo de error que visualizas (de los 7 tipos vistos), si tienes suficiente información para documentarlo o tienes preguntas y si existe superposición de errores (más de un tipo al mismo tiempo en un ejemplo). 

- Ejemplo 1: Error de sistema


<img width="318" alt="Screen Shot 2023-01-24 at 15 30 29" src="https://user-images.githubusercontent.com/72580574/214377828-91d880df-a8d0-4af3-9c17-7f94966b9b17.png">

- Ejemplo 2: El misterio del teclado

<img width="331" alt="Screen Shot 2023-01-24 at 15 30 47" src="https://user-images.githubusercontent.com/72580574/214377897-79904c33-cafe-40df-b97e-282b1ea2beae.png">


- Ejemplo 3: El inesperado de siempre

<img width="456" alt="Screen Shot 2023-01-24 at 15 31 22" src="https://user-images.githubusercontent.com/72580574/214378130-378f9f8c-574a-4707-bf3b-4df8abe5f7eb.png">


- Ejemplo 4: Eliminando publicaciones

<img width="458" alt="Screen Shot 2023-01-24 at 15 31 35" src="https://user-images.githubusercontent.com/72580574/214378272-65806db1-d625-4864-a6ca-5b9ea2386b28.png">

- Ejemplo 5: Guardar y compartir

<img width="383" alt="Screen Shot 2023-01-24 at 15 32 41" src="https://user-images.githubusercontent.com/72580574/214378547-0ec6f1f6-623e-4cb4-a039-badce1521b75.png">


- Ejemplo 6: El server no coopera

<img width="346" alt="Screen Shot 2023-01-24 at 15 33 14" src="https://user-images.githubusercontent.com/72580574/214378660-9087ead3-513e-40fe-832d-1c983a13a005.png">


- Ejemplo 7: Microsoft Visual Studio

<img width="385" alt="Screen Shot 2023-01-24 at 15 33 40" src="https://user-images.githubusercontent.com/72580574/214378717-79049957-053a-40ec-9340-625f1dc30122.png">


### Pregunta bonus:

¿Por qué no podemos mostrar ejemplos de todos los tipos de errores? 

- Accede al ANSWER KEY de este ejercicio desde [aquí](https://docs.google.com/document/d/1XVk_IbwhOz14MEcZ0VQ0R0DElVFvOfBM/edit?usp=sharing&ouid=107754327659263796384&rtpof=true&sd=true)

¿Cómo vienes? ¿Cómo están tus poderes de observación?

En el trabajo en equipo, ¿te ayuda conversar con tus compañer@s de hoy?

| Ejemplo |Tipo de error (Si hay superposición de errores, numéralos) | Explica tu categorización (¿Con qué evidencia cuentas para elegir una categoría?) | ¿Hay suficiente información? Si la respuesta es no, ¿qué preguntas necesitarías resolver? |
| ------- | -------- | --------- | --------------------|
| 1 |  |   |   |
| 2 |  |   |   |
| 3 |  |   |   |
| 4 |  |   |   |
| 5 |  |   |   |
| 6 |  |   |   |
| 7 |  |   |   |


---

## :book:  MATERIAL DE LECTURA ⏰ (20min)

### Error, defecto y falla

- **Error**: Acción humana que produce un resultado incorrecto

- **Defecto**: Desperfecto en un componente que puede causar que el mismo falle en sus funciones

- **Fallo**: Manifestación visible de un defecto

En el terreno profesional de un tester, normalmente siempre se topará con errores ya que son exactamente lo que está buscando al analizar un producto o un proyecto de software. Los defectos y las fallas se descubren una vez que el producto ya está funcionando del lado del cliente y es éste quien las informa.

La identificación de defectos - poder categorizarlos, reportarlos y que eventualmente se solucionen - es parte de las actividades del equipo de Control y Garantía de calidad. El mayor desafío que tiene este equipo es poder realizar las pruebas necesarias en cada momento de las etapas del Ciclo de vida del Desarrollo de Software (SDLC). El objetivo es poder detectar los errores lo antes posible. ¿Por qué? Porque a medida que se avanza en el proceso, los costos para encontrar y corregir errores crecen en forma exponencial.

El momento más económico para arreglar un error es durante el periodo de análisis de requerimientos, y luego el costo se va incrementando sin excepción en cada etapa subsiguiente, llegando al escenario más costoso de todos que es en el periodo de mantenimiento luego de la implementación. (ver “[Objetivos del testing](https://docs.google.com/document/d/1KB3o5M_RAaBhwVXoB_vAgjNnUySZZbRX/edit#heading=h.ipsj7oezbgag)”)  

### ¿Quieres saber más sobre la diferencia entre un error, un bug y una falla? 

[Este artículo](https://diariobug.com/error-bug-falla/) describe algunos de los desafíos que tenemos al trabajar en español sobre elementos que han sido creados en inglés, y la dificultad que existe para saber cómo nombrar a cada uno de ellos.


Aquí te dejamos un esquema para que recuerdes la secuencia de producción de un error:

<img width="657" alt="Screen Shot 2023-01-24 at 15 37 11" src="https://user-images.githubusercontent.com/72580574/214379486-2ca96257-80e3-4874-a15f-36ebdfb6dc26.png">


Un tester detecta defectos y explica cómo fallan, acompañando el reporte con un análisis de los efectos negativos. El tester no siempre puede saber cuál es el error que dio lugar a ese defecto.  


### ¿NECESITAS UN EJEMPLO? 

Windows XP tiene aproximadamente 45 millones de líneas de código. ¿Cuántos errores piensas que puede tener un software con esa cantidad de código?

Aproximadamente, unos 100 mil errores. Es por eso que en 2008, Microsoft contaba con 90 mil empleados, muchos de los cuales se dedicaban a escribir, arreglar y testear esas millones de líneas de código. En la década del 90, Microsoft implementó el reporte automatizado de errores. 

<img width="657" alt="Screen Shot 2023-01-24 at 15 37 11" src="https://user-images.githubusercontent.com/72580574/214379590-19471f6d-7a1f-4886-9153-f5d85531b95b.png">

Hoy en día estamos muy acostumbrados a ver este tipo de soluciones y rastreo de errores, pero para ese entonces era una idea muy innovadora. 

Una vez que Windows XP ya estaba funcionando en más de 1000 millones de computadoras personales, cada error que ocurría se cargaba automáticamente en este sistema (6) y los equipos de soluciones trabajaban directamente con los reportes que se generaban a partir de los millones de reportes enviados por los usuarios. 

Uno de los miembros del equipo de investigación de errores descubrió un reporte que le llamó la atención. Y levantó la alarma. Parece que Windows XP tenía una vulnerabilidad que podía ser utilizada para que terceras personas ingresaran al sistema de un usuario vía Windows y luego pudieran infectar toda la computadora, llevándose datos y haciendo que las computadoras crashearan sin arreglo. Este error se conoció como MS08-067. Fue publicado por Microsoft (MS) en su reporte interno del año 2008 y ese reporte era el número 67 ese año. Por ello se lo conoce como el MS08-067.

¿Puedes imaginar lo que costó arreglar este defecto? Si quieres saber más, ¡prepárate! El material es abundante. Podemos darte algunas pistas para que sepas qué leer primero. Busca MS08-067 y Conficker.(7)


(6) Quieres saber más? Se llama WER, Windows error reporting

(7) Solo podemos adelantarte que esto ocurrió en 2008… y en 2019 el total de sistemas afectados rondaba las 500.000 computadoras.


---


## ¡Hora de cerrar! 

¡Lo hemos logrado! Has llegado al final del cuarto encuentro.
Tómense 5 minutos como equipo para conversar sobre el ejercicio de clasificación de errores.

Les dejamos algunas preguntas disparadoras - no necesariamente tienen una sola respuesta correcta:

1. ¿Todos los errores entran en una sola categoría? O sea, ¿si es un error de sintaxis, eso anula que pueda ser parte de otra categoría o tipo de error?

2. ¿Hasta qué punto es importante clasificar el error en una categoría correcta? ¿Cómo ayuda a su resolución que tenga categoría?

¡Gran momento para recordar y agradecer a nuestro equipo de hoy! ¿Ya se han vuelto a encontrar con alguien de los equipos anteriores?

---
