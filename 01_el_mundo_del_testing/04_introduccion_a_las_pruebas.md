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

¡Te damos la bienvenida a tu cuarto encuentro de trabajo!

Check de 1 minuto: ¿Cómo te sientes hoy? Tómate un minuto y dedícalo a agradecerte a ti mism@ por hacer este esfuerzo de aprender algo nuevo. Ese futuro del que hablan todos ya está aquí: una persona cambiará de carrera de 5 a 7 veces en su vida. No es una frase de marketing, es real. Si no nos crees, [aquí tienes un artículo en inglés](https://careers-advice-online.com/career-change-statistics) y [aquí uno en español](https://www.businesstribe.com.mx/inicio/mitos-mas-grandes-sobre-cambiar-de-profesion/). 

Ya estás en camino: si este es tu primer estudio luego de la escuela, sentará las bases de los que sigan. Y si estás aquí complementando estudios anteriores, este programa enriquecerá tus conocimientos. 

¡Demos comienzo a la actividad del día de hoy!

---

## ¡Demos comienzo a la actividad del día de hoy! ⏰ (10min)

### 1. Presentación del equipo:

¡Listos, preparados, ya! A esta altura conoces bien cómo funciona este momento. ¿Ya se han presentado con el equipo? ¿Te has encontrado nuevamente con alguien? ¿Qué conceptos o nuevo vocabulario has incorporado sobre QA en el encuentro anterior?

Utilicen unos 10 minutos para compartir estas breves presentaciones y repasar los conceptos que han aprendido en el encuentro anterior. ¡Seguro recuerdas más de lo que crees!

---

## :book: MATERIAL DE LECTURA ⏰ (20min)


### 2. Introducción 

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



La funcionalidad es la forma en la que se debe comportar el software. Los errores funcionales son, por ejemplo, si algo que se espera que realice es difícil, resulta confuso y extraño o es directamente imposible.

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
