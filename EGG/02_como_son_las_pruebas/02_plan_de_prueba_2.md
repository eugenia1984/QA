# :star2: 2.2 - Plan de prueba II

---

MODULO 2 - ENCUENTRO 8 / 17

---

## Conceptos clave en el encuentro de hoy

- Estrategias de prueba

- Criterios de prueba

- Planificación de los entornos de pruebas

- Planes de prueba

- Requisitos necesarios para un buen diseño

- Tipos de pruebas


Recuerda que ya no tendrás nuestra sugerencia en el uso de los tiempos como en las primeras guías de trabajo. Sigue apoyándote en tu equipo siempre que lo necesites y también en la gran comunidad de Egg con la que te puedes comunicar a través de Discord.

Por otro lado, así como lo fue en el encuentro anterior, tienes un Check de Conocimiento para completar una vez que hayas completado la guía de trabajo de hoy. Te ayudará a consolidar todos los aprendizaje que vienes adquiriendo.


---

## :book: MATERIAL DE LECTURA :book:


Antes de comenzar con la lectura de hoy, te sugerimos esta videoaula en la que veremos una introducción al STLC (ciclo de vida del testing). Dura aproximadamente 5 minutos. Para acceder, haz clic en el botón [“videoaula.”](https://www.youtube.com/watch?v=x4HiQtipOPs)

### Planificación de pruebas de software

![image](https://user-images.githubusercontent.com/72580574/215887774-51af4bf9-1dff-46c9-91d3-3c36d7b42413.png)

Imagen 8.1: Ciclo de vida del testing. Fuente: GeeksForGeeks

La mayoría de las iniciativas de desarrollo comienzan con identificar los requisitos de software que especifican lo que la empresa espera del proyecto.

Los requisitos de software a menudo incluyen necesidades comerciales de alto nivel, requisitos arquitectónicos (1) que detallan cómo se diseñará y admitirá la función, y requisitos detallados del sistema a partir de los cuales los desarrolladores crearán el producto. Los requisitos del sistema incluyen especificaciones funcionales y no funcionales. Es trabajo del tester identificar oportunidades para probar y validar.


(1) Arquitectura en software hace referencia a la estructura y la relación entre las diferentes partes de un software y sus propiedades visibles externas. En suma, una arquitectura de Software está compuesta por más arquitecturas de datos que se articulan entre sí.[¿Quieres leer más?](https://keepcoding.io/blog/que-es-arquitectura-software/#:~:text=La%20arquitectura%20de%20Software%20hace,de%20datos%20articuladas%20entre%20s%C3%AD.)

En esta fase de STLC (Software Testing Life Cycle o Ciclo de vida del testeo del software), los tester trabajan tanto dentro de sus propios equipos como de forma interdisciplinaria para contextualizar cómo probarán el software. El análisis de requisitos a menudo incluye sesiones de intercambio de ideas, identificación de puntos ciegos o áreas poco claras en los requisitos y priorización de ciertas evaluaciones.
En caso de duda o falta de documentación de requisitos, el equipo de control de calidad hará preguntas a los equipos de ingeniería o comercial para aclarar y diseñar una estrategia de prueba.

La segunda fase de STLC es importante, ya que guía gran parte del trabajo a seguir. La planificación de pruebas toma los conocimientos encontrados durante los requisitos o el análisis del producto y los convierte en una estrategia de control de calidad documentada.

El liderazgo del equipo de prueba determina qué recursos y esfuerzos se destinarán a las pruebas. La documentación del plan de prueba resultante informa tanto a los testers como a otros departamentos cómo comenzará el trabajo de prueba, manteniendo a todos en la misma página. Este plan es especialmente útil cuando otros miembros de la organización son parte activa en las pruebas y en la corrección de errores, como por ejemplo los desarrolladores que ejecutan pruebas unitarias (2) y escriben revisiones.

El plan de pruebas especifica varios detalles del trabajo de control de calidad que se realizará, incluidos el alcance, los objetivos, los tipos de pruebas funcionales y no funcionales (tanto automáticas como manuales) y los detalles de los entornos de prueba. Una vez que se determinan estos detalles, la gestión de pruebas establece roles y plazos para el trabajo. Finalmente, el equipo de pruebas puede determinar qué entregables proporcionará al completar las fases de STLC.

(2) Unit testing: se llama testing y es testing pero lo llevan a cabo los desarrolladores de software.

La creación de un plan de pruebas implica los siguientes pasos:

![image](https://user-images.githubusercontent.com/72580574/215888079-96d8d578-948e-427e-933f-b108ee1720bd.png)

Imagen 8.1: Pasos en la creación del plan de pruebas. Fuente: elaboración propia.


##  FASES DE UNA PLANIFICACIÓN 

### 1 - Análisis de producto

El foco de un tester es aprender lo más posible sobre el producto que se está probando, el cliente y los usuarios finales de productos similares. Idealmente, esta fase debería centrarse en responder a las siguientes preguntas:

- ¿Quién usará el producto?

- ¿Cuál es el objetivo principal de este producto?

- ¿Cómo funciona el producto?

- ¿Cuáles son las especificaciones de software y hardware?

Para lograr estas respuestas, recomendamos hacer lo siguiente:

- Entrevistar a clientes, diseñadores y desarrolladores.

- Revisar la documentación del producto y del proyecto.

- Realizar un recorrido del producto.

![image](https://user-images.githubusercontent.com/72580574/215888220-f51c11f6-f5cc-4a57-bee2-e02815426322.png)

Imagen 8.2: Etapas del análisis de producto. Fuente: elaboración propia.


### 2 -  Diseño de la estrategia de prueba

El documento de estrategia de prueba es desarrollado por el administrador de pruebas y define lo siguiente:

- Objetivos del proyecto y cómo alcanzarlos.

- La cantidad de esfuerzo y costo requerido para la prueba.

Más específicamente, el documento debe detallar:

- Alcance de la prueba: contiene los componentes de software (hardware, software, middleware (3) ) que se probarán y también aquellos que no se probarán.

- Tipo de prueba: Describe los tipos de pruebas que se utilizarán en el proyecto. Esto es necesario ya que cada prueba identifica tipos específicos de errores.

- Riesgos y problemas: describe todos los posibles riesgos que pueden ocurrir durante las pruebas (plazos ajustados, gestión insuficiente, estimación presupuestaria inadecuada o errónea), así como el efecto de estos riesgos en el producto o negocio.

- Logística de prueba: menciona los nombres de los testers (o sus habilidades), así como las pruebas que realizarán. Esta sección también incluye las herramientas y el cronograma establecido para las pruebas.


(3) [¿Qué es middleware?](https://aws.amazon.com/es/what-is/middleware/#:~:text=El%20middleware%20es%20un%20software,se%20pueda%20innovar%20m%C3%A1s%20r%C3%A1pido.)

![image](https://user-images.githubusercontent.com/72580574/215888479-a7e75437-96ad-4afc-a41a-2e2d1f7d44f4.png)


#### 2.1 Definir el alcance de las pruebas

Antes del inicio de cualquier actividad de prueba, se debe conocer el alcance de la prueba. Debes pensarlo mucho. Los componentes del sistema que se probarán (hardware, software, middleware, etc.) se definen como "el alcance". Los componentes del sistema que no se probarán también deben definirse claramente como "fuera del alcance".

Definir el alcance de su proyecto de prueba es muy importante para todas las partes interesadas. Un alcance preciso ayuda ya que:

- Brinda a todos una información confiable y precisa de las pruebas que está realizando

- Todos los miembros del proyecto tendrán una comprensión clara de lo que se prueba y lo que no.

#### ¿Cómo determinar el alcance de tu proyecto?

Para determinar el alcance, debes tener en claro:

- Requisito preciso del cliente

- Presupuesto del proyecto

- Especificaciones del producto

- Habilidades y talento de su equipo de prueba

#### 2.2   Identificar el tipo de prueba

Un tipo de prueba es un procedimiento de prueba estándar que proporciona un resultado de prueba esperado. Cada tipo de prueba está formulado para identificar un tipo específico de errores del producto. Sin embargo, todos los tipos de pruebas tienen como objetivo lograr un objetivo común: "Detección temprana de todos los defectos antes de entregar el producto al cliente".

Los tipos de prueba comúnmente utilizados son pruebas de caja negra (black-box testing), pruebas basadas en la experiencia de usuario, pruebas basadas en requerimientos y especificaciones y pruebas de caja blanca (white-box testing).

### Cómo elegir el tipo de prueba más apropiado

Existe una amplia variedad de pruebas para probar productos de software. Puede que un equipo no tenga suficientes esfuerzos y/o recursos para manejar todos los tipos de pruebas disponibles. Como administrador de pruebas, debes establecer la prioridad de los tipos de pruebas. Usa estas preguntas como guía:

- ¿Qué tipos de pruebas son más pertinentes para las pruebas de aplicaciones web?

- ¿Qué tipos de pruebas pueden ignorarse para ahorrar costos?

- ¿Con qué tipos de pruebas ya trabajaste y te sientes a gusto?

- ¿Con qué recursos cuentas para probar pruebas nuevas?


**Pro tip**: existen estándares de calidad en procesos (4) regulados por las normas ISO. Para el testing de software estas normas se llaman ISO/IEC/IEEE 29119 e indican el orden y la seguridad necesarios para llevar a cabo pruebas robustas. No es algo que debas manejar ni saber en este momento de tu formación, pero consideramos que es lenguaje que debes saber en caso de querer profundizar algunos conocimientos. 


(4) Hacemos hincapié en que son estándares de calidad de procesos porque suelen confundirse con estándares de calidad en los productos. Para darte un ejemplo concreto: puedes estar fabricando lápices. Si tus lápices son los mejores del mercado, tienes un producto de excelente calidad. La calidad en los procesos habla de cómo fabricas ese producto. Dicho de otra manera, puedes tener procesos de una calidad excepcional y sin embargo tus lápices no son los mejores del mercado. ¿Te ha pasado estar en una organización que implemente alguna de las normas ISO?

### 2.3  Documentar riesgos y problemas

El riesgo es un evento incierto del futuro con una probabilidad de ocurrencia y un potencial de pérdida. Cuando el riesgo realmente ocurre, se convierte en el "problema".

En el plan de prueba de control de calidad, documentarás aquellos riesgos que puedas identificar: 

![image](https://user-images.githubusercontent.com/72580574/215890398-d54ab5ce-35c5-4bcf-8753-cca2edb1df33.png)


#### 2.4 -  Crear logística de prueba

El Test Manager debe responder a las siguientes preguntas:

- ¿Quién hará la prueba?

- ¿Cuándo ocurrirá la prueba?

Aún cuando no estén definidas las personas del equipo que llevarán a cabo las pruebas, el manager decidirá qué perfil de especialidad debe llevarlas a cabo.

Para seleccionar el miembro correcto para una tarea específica, debe considerar si su habilidad está calificada para la tarea o no, y también estimar el presupuesto del proyecto. 

¿Recuerdas atención al detalle? Es tu habilidad crítica a desarrollar. Sin embargo, te recomendamos tener una actitud de curiosidad y apertura en estas situaciones:
Habilidad para entender el punto de vista de los clientes.

- Fuerte deseo de calidad.

- Comunicación efectiva


En el desarrollo de las pruebas, todos los perfiles de personas tendrán una fuerte formación técnica, pero son aquellas personas que se dedican a completar su perfil quienes tienen mejor desempeño laboral y mayor crecimiento.

En este caso, el miembro que se hará cargo de la ejecución de la prueba es el probador. Según el presupuesto del proyecto, puede elegir un miembro interno o externo como probador.

####  ¿Cuándo ocurrirá la prueba?

Las actividades de prueba deben coincidir con el calendario de entregas de las actividades de desarrollo asociadas.

Comenzará a probar cuando tenga todos los elementos requeridos que se muestran en la siguiente figura.

![image](https://user-images.githubusercontent.com/72580574/215890597-8735d6b7-aa23-4130-a53c-263c9d6274cc.png)


## 3 - Definición de objetivos

Esta fase define los objetivos y los resultados esperados de la ejecución de la prueba. Dado que todas las pruebas pretenden identificar tantos defectos como sea posible, los objetivos deben incluir:

Una lista de todas las características del software (funcionalidad, GUI (5), estándares de rendimiento) que deben probarse.

(5) ¿Recuerdas? Graphic User Interface o muchas veces UI (pronunciada en inglés como “iuai”)

El resultado ideal o punto de referencia para cada aspecto del software que necesita pruebas. Este es el punto de referencia con el que se compararán todos los resultados reales.
 
## 4. 	Establecer criterios de prueba

Los criterios de prueba se refieren a los estándares o reglas que rigen todas las actividades en un proyecto de prueba. Los dos principales criterios de prueba son:

- **Criterios de Suspensión**: define los puntos de referencia para suspender todas las pruebas. Por ejemplo, si los miembros del equipo de control de calidad encuentran que el 50 % de todos los casos de prueba han fallado, todas las pruebas se suspenden hasta que los desarrolladores resuelvan todos los errores identificados hasta el momento

- **Criterios de salida**: define los puntos de referencia que significan la finalización exitosa de una fase de prueba o proyecto. Los criterios de salida son los resultados esperados de las pruebas y deben cumplirse antes de pasar a la siguiente etapa de desarrollo. Por ejemplo, el 80 % de todos los casos de prueba deben marcarse como exitosos antes de que una función o parte del software en particular pueda considerarse adecuada para uso público.

## 5 - Asignación de recursos de planificación

Esta fase crea un desglose detallado de todos los recursos necesarios para la finalización del proyecto. Los recursos incluyen el esfuerzo humano, el equipo y toda la infraestructura necesaria para realizar pruebas precisas y completas.

Esta parte del plan de prueba decide la medida de los recursos (número de testers y equipos) que requiere el proyecto. Esto también ayuda a los gerentes de pruebas a formular un cronograma y una estimación correctamente calculados para el proyecto.
Veamos una tabla de ejemplo para determinar los recursos humanos:

![image](https://user-images.githubusercontent.com/72580574/215890879-9e4e6db1-2d4a-4eff-b8f7-5aa3073f7fd8.png)

![image](https://user-images.githubusercontent.com/72580574/215890915-dadc533a-1f32-4ead-b102-ed4ad5ec6a21.png)

Veamos una tabla de ejemplo para determinar los recursos de sistemas:

![image](https://user-images.githubusercontent.com/72580574/215890988-8d2b7a4b-6fe5-47ac-9abe-773c0feecdec.png)


## 6 -  Planificación de la configuración del entorno de prueba

El entorno de prueba se refiere a la configuración de software y hardware en la que los QA ejecutan sus pruebas. Idealmente, los entornos de prueba deberían ser dispositivos reales para que los testers puedan monitorear el comportamiento del software en condiciones reales de usuario. Ya sea que se trate de pruebas manuales o pruebas de automatización, nada supera a los dispositivos reales, instalados con navegadores reales y los sistemas operativos no son negociables como entornos de prueba. No comprometa los resultados de sus pruebas con emuladores o simuladores.

###  ¿Cómo configurar el entorno de prueba?

Para finalizar esta tarea, se necesita una fuerte cooperación entre el equipo de prueba y el equipo de desarrollo.

Debe hacerle algunas preguntas al desarrollador para comprender claramente la aplicación web que se está probando. Aquí hay algunas preguntas recomendadas. Por supuesto, puede hacer las otras preguntas si lo necesita.

- ¿Cuál es la conexión máxima de usuarios que este sitio web puede manejar al mismo tiempo?

- ¿Cuáles son los requisitos de hardware/software para instalar este sitio web?

- ¿El ordenador del usuario necesita alguna configuración en particular para navegar por el sitio web?
 
## 7 -  Determinar el programa de prueba y la estimación.

Para la estimación de pruebas, el proyecto se dividirá en tareas más pequeñas y se asignará el tiempo y el esfuerzo necesarios para cada una.

Luego, se creará un cronograma para completar estas tareas en el tiempo designado con la cantidad específica de esfuerzo.

Sin embargo, la creación del cronograma requiere aportes desde múltiples perspectivas:

- Disponibilidad de empleados, número de días laborables, plazos de los proyectos, disponibilidad diaria de recursos.

- Riesgos asociados al proyecto que ha sido evaluado en una etapa anterior.

## ¿NECESITAS UN EJEMPLO? 

![image](https://user-images.githubusercontent.com/72580574/215891261-d9e349e3-9230-4ad6-a284-4d329fa82a5d.png)

Luego se crea el cronograma para completar estas tareas. Hacer un cronograma es un término común en la gestión de proyectos. Al crear un cronograma sólido en la Planificación de pruebas, el Gerente de pruebas puede usarlo como herramienta para monitorear el progreso del proyecto y controlar los sobrecostos.
Para crear el cronograma del proyecto, el administrador de pruebas necesita varios tipos de entrada, como se muestra a continuación:

- **Fecha límite del empleado y del proyecto**: los días hábiles, la fecha límite del proyecto, la disponibilidad de recursos son los factores que afectaron el cronograma

- **Estimación del proyecto**: en base a la estimación, el administrador de pruebas sabe cuánto tiempo lleva completar el proyecto. Para que pueda hacer el cronograma del proyecto apropiado

- **Riesgo del proyecto**: Comprender el riesgo ayuda a Test Manager a agregar suficiente tiempo adicional al cronograma del proyecto para lidiar con los riesgos.
 
## 8 -  	Establecer entregables de prueba

Los entregables de prueba se refieren a una lista de documentos, herramientas y otros equipos que deben crearse, proporcionarse y mantenerse para respaldar las actividades de prueba en un proyecto.

Se requiere un conjunto diferente de entregables antes, durante y después de la prueba. 

- Entregables requeridos antes de la prueba. Documentación sobre:

o   Plan de prueba

o   Diseño de prueba 

- Entregables requeridos durante la prueba. Documentación sobre:

o   Guiones de prueba

o   Simuladores o emuladores (en etapas iniciales)

o   Datos de prueba

o   Registros de errores y ejecuciones

- Entregables requeridos después de la prueba. Documentación sobre:

o   Resultados de la prueba

o   Informes de defectos

o   Notas de lanzamiento

Un plan de pruebas en software es la columna vertebral sobre la que se construye todo el proyecto. Sin un plan lo suficientemente amplio y bien elaborado, los controles de calidad se confundirán con objetivos y plazos vagos e indefinidos. Esto dificulta innecesariamente las pruebas rápidas y precisas, y retrasa los ciclos de lanzamiento. 

---

## MANOS A LA OBRA

## 7.1  Escenarios de análisis

Te presentamos varios escenarios de análisis en donde veremos aplicados algunos de los conceptos que vimos en el material de hoy. Te invitamos a que los resuelvas desde tu punto de vista.

Luego, podrás evaluar la discusión de estos puntos con tu equipo del día. ¡Te sorprenderá que haya más de un punto de vista!

Cada uno podrá exponer las razones por las que eligió cada opción. 

En el [formulario de fin de guía](https://forms.gle/S8VQWn2JPxHSsnGcA) encontrarás estos mismos escenarios y sus respuestas. Lo pueden resolver en forma individual y enviar cada uno su respuesta.

**1)** Ana pertenece a un equipo de QA reconocido y debe analizar un producto de Software. Dentro de las tareas a realizar decide no entrevistar a los diseñadores del producto. La decisión de Ana es:

a)  	Correcta, porque los diseñadores no son tan fundamentales como el cliente y los desarrolladores.

b) 	Incorrecta, lo ideal sería que entreviste a clientes, diseñadores y desarrolladores.

c)  	Correcta, porque sólo debe entrevistar a los clientes del producto, ya que son los consumidores finales.

d) 	Correcta, ya que por su grado de experiencia sabe a quién es necesario entrevistar.
 
**2)** 	Juan es administrador de pruebas y debe desarrollar el documento de estrategia de prueba. En el mismo solo define la cantidad de esfuerzo y costo requerido para la prueba. Esto es:

a)  	Correcto, ya que la cantidad de esfuerzo y costo requerido para la prueba son necesarios para un buen resultado.

b) 	Incorrecto, ya que el doc. de estrategia de prueba lo tiene que realizar un programador.

c)  	Incorrecto, ya que Juan también debería definir objetivos del proyecto y cómo alcanzarlos.

d) 	Incorrecto, ya que Juan no cuenta con las capacidades necesarias para hacer dicha tarea.


**3)** Sofía, que comenzó su recorrido en QA hace poco tiempo, debe determinar el programa de prueba y la estimación de un proyecto. Si tuvieras que darle un consejo sería:

a)  	Que dedique el tiempo que considere necesario, sin documentar ni avisar a nadie.

b) 	Que no divida el proyecto en tareas más pequeñas ya que esto será una pérdida de tiempo para su ejecución.

c)  	Que divida el proyecto en tareas más pequeñas y asigne el tiempo y el esfuerzo necesarios para cada una. Luego, cree un cronograma para completar estas tareas en el tiempo designado con la cantidad específica de esfuerzo.

d) 	Que sí divida el proyecto en tareas más pequeñas, pero no asigne el tiempo y esfuerzo ya que son variables. 

**4)** 	 Gino, quien es QA Semi senior de una multinacional IT, es la persona encargada de entregar el plan de prueba de un proyecto de Software. Por situaciones personales no pudo dedicarle el tiempo correspondiente, por lo cual, hizo el plan de prueba a último momento, sin repasarlo o ultimar detalles. En esta situación, ¿Qué crees que debería haber hecho Gino?

a)  	Nada, lo que hizo está bien porque el diseño de pruebas es más importante que el plan de pruebas.

b) 	Debería haber avisado a su equipo de trabajo sobre su inconveniente y pedir más tiempo para poder realizar un plan de prueba amplio y bien elaborado. Ya que el plan de prueba es la estructura principal sobre la que se construirá todo el proyecto.

c)  	Debería haber entregado el diseño de prueba antes que el plan de prueba.

d) 	Debería desestimar cualquier tipo de reclamo hacia su trabajo, ya que su grado y experiencia se lo permiten. 


**5)** 	María debe realizar un análisis de prueba de un sistema de Software y recurre a la experiencia de un usuario experimentado como base de información. La información no está documentada, pero María decide avanzar de todas maneras. Lo que hizo María es:

a)  	Incorrecto, ya que debe basarse en los documentos de base de prueba preexistentes y documentados. De lo contrario, el análisis carecerá de autenticidad y veracidad.

b) 	Correcto, ya que la base de la prueba incluye cualquier cosa en la que se basen las pruebas. En este caso, aunque dicha información no esté documentada, el conocimiento del usuario sobre el sistema puede aportar mucho al análisis que debe realizar María.

c)  	Ninguna de estas opciones es correcta.


**6)** 	Axel debe crear un análisis de prueba específico, pero decide no avanzar hasta que se terminen de definir las condiciones de prueba y se disponga de suficiente información para la creación de los casos de prueba. Lo que hizo Axel es:

a)  	Incorrecto, ya que el tiempo es esencial en esta etapa y debe avanzar, aunque los demás procesos no estén completados.

b) 	Correcto, ya que este orden de ejecución aplica para cualquier caso de prueba.

c)  	Incorrecto, ya que su tarea nada tiene que ver con los procesos anteriores.

d) 	Correcto, ya que, sólo en casos excepcionales como la creación de datos de prueba, se puede alterar este orden. Lo demás, por regla, debe respetar el orden y proceso para obtener un buen resultado.


---

## :book: MATERIAL DE LECTURA

## Análisis y diseño

Factores que determinan los niveles de detalles de las condiciones de prueba:

1. Nivel de prueba, el nivel de detalle y la calidad de la base de prueba.

2. Complejidad del sistema/software y ciclo de vida de desarrollo utilizado.

3. Riesgos asociados a proyectos y productos.

4. La relación entre los conceptos básicos de las pruebas, lo que debe probarse y cómo debe probarse.

5. Una herramienta de gestión de pruebas.

6. Madurez del proceso de evaluación, así como de las habilidades y conocimientos de los analistas.

7. El nivel de especificidad del Diseño de Prueba y otras implicaciones de la tarea de prueba.

8. Disposición de los clientes a participar en la consulta.

Las siguientes son las diversas fuentes para recopilar información de prueba:


1. **Requisitos de software**: la especificación de requisitos de software (documento SRS) establece cómo debe construirse el sistema de software. En pocas palabras, SRS proporciona una ruta de proyecto para todos los involucrados. Proporciona descripciones avanzadas de especificaciones de software activas e inactivas, así como condiciones de funcionamiento que indican cómo el usuario puede interactuar con el sistema una vez completado. Las siguientes son características comunes de SRS:

¿Cuál es el propósito del software que se está construyendo?

o   Todas las revisiones de software.

o   Rendimiento del software, o para qué está diseñado.

o   Rendimiento del software en el entorno de producción.

o   Detalles válidos y no válidos.

o   Conectores visuales externos, o cómo el software interactuará con el hardware u otro software.

o  Restricciones en el diseño del software o las establecidas en el entorno operativo.


2. **Requisitos comerciales**: muestra los detalles del software de alto rendimiento. Este es un documento oficial que describe las necesidades del cliente (escrito, oral). Por lo general, lo produce un analista comercial que trabaja con los clientes y se basa en la interacción y las necesidades de los clientes. Business Process es una descripción detallada de cómo nuestros socios comerciales pretenden cumplir con sus roles, construir relaciones comerciales y compartir tareas para participar de manera efectiva con la ayuda de sus sistemas de información.


3. **Documento de diseño funcional**: la especificación de diseño funcional, o FDS, es un documento que describe cómo funcionará un proceso o sistema de control. Explica cómo funcionará el sistema planificado, cómo interactuará la gente con él y qué se puede esperar de una variedad de condiciones operativas. La especificación de diseño específico ayuda por una variedad de razones. Una de las principales razones es que lleva mucho tiempo producir dibujos o escribir un código de PLC sin algún tipo de acuerdo escrito sobre lo que debe lograr el sistema. Las especificaciones de diseño funcional se pueden compartir con los miembros del equipo, los compradores y las partes interesadas relevantes para obtener comentarios y revisiones hasta que se acuerde y firme el documento final. Este proceso de revisión y los cambios son importantes para garantizar que el diseño final sea objetivo y satisfaga las necesidades de los participantes. Posteriormente, el documento se entrega a los equipos de ingenieros para el diseño técnico y los programas, con detalles operativos que sirven de guía. Los ingenieros sabrán qué dibujar, los desarrolladores sabrán qué debe hacer el código y los clientes sabrán qué traer cuando se complete la especificación de diseño funcional. La especificación de diseño específico identifica lo que debe usarse en el ciclo de vida de la ingeniería de software industrial.

4. **Requisitos operativos**: los requisitos de rendimiento son importantes para su producto porque, como dicen, proporcionan algunos tipos de funcionalidad. Hágase la pregunta "¿esto afecta el rendimiento de mi herramienta?" O "¿Cuál es el significado de esto?" puede ayudar con este programa. Esas necesidades específicas pueden tener un conjunto menor de riesgos y requisitos. También puede tener requisitos que expliquen cómo su sistema de software interactuará con diferentes herramientas, lo que nos lleva a las necesidades de las interacciones externas.

5. **Requisitos de relación externa**: los requisitos de interacción externa son la variedad más precisa de necesidades con propósito. Estos son especialmente importantes cuando se trabaja con sistemas integrados. Describen cómo su producto interactuará con diferentes componentes.

---

## MANOS A LA OBRA

### 7.2  Te proponemos una serie de desafíos para poner en práctica lo visto en el encuentro anterior y consolidar lo visto en el encuentro de hoy.

Tendrás que poner en práctica todas las habilidades que llevas entrenando, ya que deberás:

- Organizar la información

- Armar un flujo de uso (en UML si deseas, pero puede ser a modo de boceto)

- Distinguir las tareas a testear. Cada flujo debe ser probado por separado

- Revisar que los requerimientos estén bien definidos (7)

- Responde a las preguntas de cada caso


(7) Un requisito bien desarrollado debe tener estas características: 

Atómico

Identificado de forma única

Completo

Coherente y sin ambigüedades

Trazable

Priorizado

Comprobable


### Desafío 7.2.1. : Ejercicio de análisis de casos borde

Caso: Si tomas el tren antes de las 9:30 am o en la tarde, luego de las 16:00 (4 pm) y hasta las 19:30 (7:30 pm), debes pagar el precio total ya que te encuentras viajando en hora pico. Tienes un ticket “ahorro” que está disponible para los viajes entre las 9:30 am y las 4:00 pm y luego de las 7:30 pm.

¿Cómo testearías este sistema de venta de tickets? ¿Puedes anticipar cuáles son los casos “borde”? ¿Si compro mi ticket a las 15:58 para subir al tren de las 16:01, qué tarifa debería pagar?

¿Qué preguntas sumarías al caso para poder armar un plan de pruebas que contemple todos los casos claros + los casos de borde, o en los que pueden surgir dudas en los pasajeros? ¿El sistema tiene contemplados los casos borde?

### Desafío 7.2.2. - Ejercicio de tabla de decisiones

Caso: Si tienes una tarjeta de pasajero senior (60+ años), tienes un 35% de descuento en cualquier ticket que compres. Si viajas con un niño menor a 16 años, tienes un descuento del 50% en cualquier ticket si tienes una tarjeta de “Familia viajera”. Si no la tienes, recibes un 10% de descuento en el ticket para menores de 16 años. Solo puedes poseer un tipo de tarjeta de viajero frecuente.

Arma una tabla de decisiones mostrando todas las combinaciones posibles de tickets y los descuentos resultantes. Propone casos de prueba que se derivan de esta tabla.

En estos ejercicios hay desafíos que todavía no saben resolver. Les sugerimos sumar todos los puntos de vista del equipo del encuentro de hoy para intentar resolverlos. Se ponen en juego muchas habilidades extra como la atención al detalle, la capacidad de secuenciar procesos y poder definir casos de uso novedosos para ustedes. 

###  Desafío 7.2.3. - Statement and decision testing exercise

Caso: una máquina expendedora entrega bebidas calientes o frías. Si eliges una bebida caliente (café o té), pregunta si lo deseas con leche. Agrega la leche en caso de que sea requerida. Luego pregunta si deseas azúcar, y agrega el azúcar de ser requerida. Luego, entrega la bebida terminada.

- a. Dibuja un diagrama de flujo para este caso. Ayudita: la elección de la bebida es una sola decisión.

- b. Realizarás estas dos pruebas:

-Prueba 1: selecciona una bebida fría

-Prueba 2: selecciona un café con leche sin azúcar

¿Has cubierto todos los casos posibles?

Si tu respuesta es no, ¿qué porcentaje de casos has cubierto con estas pruebas? (Ayudita: haz una tabla con todos los casos posibles)

¿Qué pruebas deberías sumar para cubrir el total de los casos?


---

## :book: MATERIAL DE LECTURA 

### ¿Cuándo crear un diseño de prueba?

Una vez que se definen las condiciones de prueba y se dispone de suficiente información para crear los casos de prueba de alto o bajo nivel, se puede crear el diseño de prueba para un nivel específico.

Hay algunas actividades que se llevan a cabo de forma rutinaria cuando se implementa la prueba. Estas actividades también pueden incorporarse al proceso de diseño cuando las pruebas se crean de forma iterativa.

Un ejemplo de tal caso es la creación de datos de prueba.

Los datos de prueba definitivamente se crearán durante la implementación de la prueba. Por lo tanto, es mejor incorporarlo en el propio diseño de la prueba.
Este enfoque permite la optimización del alcance de las condiciones de prueba mediante la creación automática de casos de prueba de bajo o alto nivel.

### Tipos de prueba

Los tipos de prueba vistos a continuación son una clasificación sencilla, adaptada al nivel del curso.

### PRUEBAS DE CAJA BLANCA (8):

(8) ¿Recuerdas? WBT (white box testing) y BBT (black box testing) por sus siglas en inglés. 

Las técnicas de prueba de caja blanca analizan las estructuras internas, las estructuras de datos utilizadas, el diseño interno, la estructura del código y el funcionamiento del software en lugar de solo la funcionalidad como en las pruebas de caja negra. También se denomina prueba de caja de vidrio o prueba de caja transparente o prueba estructural.
Proceso de trabajo de las pruebas de caja blanca:

1.   	Entrada: requisitos, especificaciones funcionales, documentos de diseño, código fuente.

2. 	Tramitación: Realización de análisis de riesgos para orientar a lo largo de todo el proceso.

3. 	Planificación adecuada de las pruebas: diseñar casos de prueba para cubrir todo el código. Ejecute enjuague-repetir hasta que se alcance el software sin errores. Comunique los resultados.

4. 	Salida: Elaboración de informe final de todo el proceso de ensayo.
Ventajas:

o   Las pruebas de caja blanca son muy exhaustivas ya que se prueban todo el código y las estructuras.

o   Da como resultado la optimización del error de eliminación de código y ayuda a eliminar líneas adicionales de código.

o   Puede comenzar en una etapa anterior, ya que no requiere ninguna interfaz como en el caso de las pruebas de caja negra.

o   Fácil de automatizar.

Desventajas:

o   La principal desventaja es que es muy costoso.

o   El rediseño del código y la reescritura del código necesitan que los casos de prueba se escriban nuevamente.

o   Se requiere que los evaluadores tengan un conocimiento profundo del código y el lenguaje de programación en lugar de las pruebas de caja negra.

o   Las funcionalidades que faltan no se pueden detectar ya que se prueba el código existente.

o   Resulta muy complejo y a veces poco realista en el contexto de los tiempos de entrega de un proyecto.

###  PRUEBAS DE CAJA NEGRA:

La técnica de prueba en la que el tester no tiene acceso al código fuente del software y se lleva a cabo en la interfaz del software sin preocuparse por la estructura lógica interna del software se conoce como prueba de caja negra.

o   **PRUEBA FUNCIONAL**: Son aquellas que se llevan a cabo para comprobar las especificaciones críticas para el negocio, la funcionalidad y la usabilidad. Este tipo de pruebas garantizan que las características y funcionalidades del software se comporten según lo esperado sin ningún problema. Valida principalmente toda la aplicación con respecto a las especificaciones mencionadas en el documento Software Requirement Specification (SRS). Los tipos de pruebas funcionales incluyen pruebas unitarias, pruebas de interfaz, pruebas de regresión, entre otras.
o   PRUEBAS NO FUNCIONALES:
 Son pruebas similares a las funcionales, sin embargo, evalúan características como fiabilidad, usabilidad, escalabilidad, etc. Las pruebas no funcionales, como las pruebas de carga y esfuerzo, normalmente se llevan a cabo mediante herramientas y soluciones de automatización. Además de las pruebas de rendimiento, los tipos de pruebas no funcionales incluyen pruebas de instalación, pruebas de confiabilidad y pruebas de seguridad. Se cree que, al ser No funcionales, no deben realizarse, pero deben ejecutarse tan pronto como sea posible. Los errores no funcionales pueden desencadenar en el fracaso del proyecto.
 
o   **PRUEBA DE REGRESIÓN**: Se define como un tipo de prueba de software para confirmar que un programa reciente o un cambio de código no ha afectado negativamente a las funciones existentes. La prueba de regresión no es más que una selección total o parcial de casos de prueba ya ejecutados que se vuelven a ejecutar para garantizar que las funcionalidades existentes funcionen bien.

Esta prueba se realiza para asegurarse de que los nuevos cambios de código no tengan efectos secundarios en las funcionalidades existentes. Garantiza que el código antiguo siga funcionando una vez que se hayan realizado los últimos cambios en el código.
Tipos de pruebas de regresión

o   **Pruebas de regresión finales**: se realiza para validar la compilación que no ha sufrido cambios durante un período de tiempo. Esta compilación se implementa o envía a los clientes.

o   **Pruebas de regresión normal**: se realiza para verificar si la compilación NO ha roto ninguna otra parte de la aplicación debido a los cambios recientes en el código para corregir defectos o mejorar.

![image](https://user-images.githubusercontent.com/72580574/215895747-fd2e378a-4414-45fc-bf40-20d2e6ef8ee9.png)



![image](https://user-images.githubusercontent.com/72580574/215895769-57ed1c1c-aa5f-4659-bd59-94ce277cee87.png)


###  Niveles de prueba

Las pruebas de nivel de software se pueden clasificar principalmente en 4 niveles:


![image](https://user-images.githubusercontent.com/72580574/215895839-37b67658-2d7b-4fa8-9a4d-7b17d6e800c3.png)


1. **Pruebas unitarias**: un nivel del proceso de prueba de software donde se prueban unidades/componentes individuales de un software/sistema. El propósito es validar que cada unidad del software funcione según lo diseñado. Las realizan los desarrolladores sobre el mismo código.

2. **Pruebas de integración**: un nivel del proceso de prueba de software donde las unidades individuales se combinan y prueban como un grupo. El propósito de este nivel de prueba es exponer fallas en la interacción entre unidades integradas. Las realizan los desarrolladores, cuando deben integrar más de un sistema de datos, por ejemplo.

3. **Prueba del sistema**: un nivel del proceso de prueba de software en el que se prueba un sistema/software completo e integrado. El propósito de esta prueba es evaluar el cumplimiento del sistema con los requisitos especificados. Las realizan los testers.

4. **Pruebas de aceptación (UAT)**: un nivel del proceso de prueba de software en el que se prueba la aceptabilidad de un sistema. El propósito de esta prueba es evaluar el cumplimiento del sistema con los requisitos comerciales y evaluar si es aceptable para la entrega. Suele ser realizada por testers, usuarios beta y a veces por usuarios especiales del cliente (sus project managers, por ejemplo).


---

## MANOS A LA OBRA

### EJERCICIO

*Este es un ejercicio de alto grado de esfuerzo

Para consolidar lo aprendido durante el día de hoy, armaremos un plan de prueba.

### Consigna:

Te hemos dejado un ejemplo completo en el que hemos descrito los objetivos, alcance, equipo, estrategia, criterios, ambientes, entregables, incidentes, riesgos y tareas que se mencionan tomando como caso de prueba a un mouse. Sabemos que estás aprendiendo y este ejemplo te guiará y servirá de apoyo.

### Desafío:

En esta actividad te proponemos que elijas un ejemplo diferente al mouse y puedas describir todos los elementos mencionados.

Para resolver el ejercicio, utiliza esta [plantilla](https://docs.google.com/document/d/1gR03cYSOfdiE17EA5bco8pFmeC0VKNXeAYBg7zycwj8/edit?usp=sharing) para practicar de forma individual y consolidar el proceso de armado de pruebas. Tienes espacios en blanco en las tablas para ir complementando con tus respuestas. Aquí debajo tienes la resolución de la actividad utilizando el mouse como ejemplo.

## Prueba funcional: MOUSE (hardware periférico con conexión USB)

### Objetivo de las pruebas: ¿Para qué voy a probar?

Evaluar las funcionalidades del mouse para verificar y validar que el producto satisfaga las expectativas del cliente y de los usuarios. Así como también reducir la probabilidad de que aparezcan defectos en producción

### Alcance

Se verificará la funcionalidad del mouse así como también su compatibilidad con otros hardwares y su portabilidad en diferentes plataformas. También estará dentro del alcance de las pruebas verificar su ergometría y los tiempos de respuesta. 
Quedarán fuera del alcance de las pruebas las comprobaciones de seguridad.

### Equipo
El equipo de pruebas estará conformado por un tester junior full time y un tester semi-senior part time. Ambos testers estarán prestando servicios desde Argentina. Debido a que se estará trabajando con hardware, será necesario asistir a la oficina cada vez que se lance una nueva versión. 
 
### Estrategia

El equipo de desarrollo implementará pruebas unitarias de los drivers asociados al mouse como parte de su pipeline. 

El equipo de testing realizará pruebas funcionales y no funcionales de forma manual. Cada vez que una nueva versión llegue a testing se hará una prueba de regresión sobre aquellos escenarios que se consideren de prioridad alta. 
Dentro de las pruebas no funcionales se ejecutarán pruebas de performance, portabilidad, compatibilidad y usabilidad. 

Al finalizar cada sprint se realizarán pruebas de aceptación de usuario. Al mismo tiempo, se aprovecharán esas reuniones para hacer pruebas de usabilidad. 

### Criterios

Las pruebas del equipo de testing comenzarán cuando hayan pasado satisfactoriamente las pruebas unitarias.

El criterio de finalización de las pruebas será cuando se hayan ejecutado todas las pruebas planificadas o, si el tiempo apremia, al menos se hayan ejecutado los casos de prueba de prioridad alta y media. 

El criterio para pasar a producción será que no haya errores bloqueantes o críticos sin resolver. 

### Ambientes

Nuestros ambientes de prueba serán:

1 notebook mac

1 notebook lenovo con windows 10

1 notebook samsung con ubuntu 22.04 LTS

Superficies de madera, plástico y vidrio.

### Entregables

Los entregables que se generarán son: 

- Plan de pruebas

- Lista de escenarios de pruebas ejecutadas 

- Informe de estado al finalizar cada sprint

- Reporte de defectos

### Gestión de incidentes

Se utilizará el siguiente workflow para la gestión de defectos:

![image](https://user-images.githubusercontent.com/72580574/215896319-e3e75cbd-1e05-4115-bb8d-2fd4663f31fa.png)

La severidad será asignada por el tester y la prioridad por el product owner. 

Las severidades que se utilizarán serán: 

- Bloqueante: cuando una funcionalidad no se pueda utilizar y no haya otra forma de realizar esa misma acción.

- Crítica: cuando una funcionalidad no se pueda utilizar pero exista un camino alternativo para realizar eso mismo. 

- Alta: cualquier defecto sobre una funcionalidad prioritaria del sistema o que tiene impacto secundario en una funcionalidad prioritaria del mismo.

- Medio: cualquier defecto que impacte en una funcionalidad secundaria. 

- Bajo: cualquier defecto cosmético o errores de ortografía.

![image](https://user-images.githubusercontent.com/72580574/215896482-53d4788b-0082-4929-a940-399683a63e82.png)


![image](https://user-images.githubusercontent.com/72580574/215896513-fa016b2d-fc03-46e0-9495-90f72a4d9d65.png)

---

## EXTRA: ¿Quieres ver un caso explicado?

[Este video](https://www.youtube.com/watch?v=5jEPXychPZs) tiene una duración mayor a 60 minutos.

¿Por qué deberías verlo? Porque si tienes tiempo, es una excelente introducción al trabajo de un tester en una compañía pequeña, realizando todo el proceso de pruebas por sí mismo. Este es el escenario más común para un tester junior.

Tip: Puedes guardarlo para más adelante o para un día en el que quieras repasar conceptos.


---
