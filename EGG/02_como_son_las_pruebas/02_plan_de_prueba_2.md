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

###· Cómo elegir el tipo de prueba más apropiado

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








