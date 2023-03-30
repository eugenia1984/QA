# :star: ENCUENTRO 5 y 6 / 20 -  Revisión de pruebas

---

## :star: Introducción

### ¡Te damos la bienvenida a tu nuevo encuentro de trabajo!

Atentos y atentas, esta guía de trabajo tiene una duración de dos encuentros. Es decir, tienes dos encuentros completos para dedicarle a todas las lecturas, videos y ejercicios que se encuentran en este documento.

Ya sabes cómo empezamos ¿no? Pues bien indica tu nombre y lugar de procedencia.

Recordá ofrecerles pulsos a quien haya hecho un gran trabajo de cooperación con tu aprendizaje o con el del equipo. No olvides que es tu oportunidad para destacarte y conseguir tus propios pulsos. ¡Ya sabes lo que tienes que hacer!

Les dejamos una pregunta para abrir la sesión: ¿Comenzaron el proceso de búsqueda laboral en la industria IT? o ¿ya trabajan?

Utilicen unos 10 minutos para compartir estas breves presentaciones. 
¿Opinan todos de la misma manera?

---

## :book: MATERIAL DE LECTURA 

En el encuentro anterior estudiaron sobre los tipos de prueba de testing y su clasificación. Hoy seguiremos profundizando en esta temática.

Si quedó alguna duda, pueden resolverla en equipo o llamar al mentor para que pueda ayudarlos. Recuerden que ustedes también pueden ser un mentor en caso de recibir los pulsos necesarios 💪

## :star: Proceso de revisión y técnicas

Las revisiones se realizan para cumplir con diversos objetivos:

- Identificar defectos con anticipación.

- Comprender el producto (favorece el aprendizaje)

- Debate y toma de decisiones dentro del equipo.

#### Hay dos tipos: 

1. **Revisión Informal**: Para la revisión informal no es requerido seguir ningún proceso definido ni generar alguna documentación en particular. 

Según “..... No requiere ningún proceso definido, ni reuniones específicas, ni creación “obligada” de documentación. Quien revisa se organiza como desee. El objetivo es encontrar defectos…” 


2. **Revisión Formal**: La revisión formal sigue un proceso definido, requiere participación del equipo y documentación sobre los resultados.

El tipo de revisión (informal a lo formal) depende de cada empresa. 
Usualmente entre más consolidado el proceso de desarrollo, más formal tiende a ser el proceso de revisión.

Otros factores que determinan el nivel de formalidad son: 

- La complejidad del producto

- Los requerimientos legales o regulatorios

- El tipo de ciclo de vida de desarrollo

- Las necesidades relacionadas a la auditoría externa. 

---

## ¡MANOS A LA OBRA! 

## Ejercicio #1

Tómense unos minutos para reflexionar individualmente.

¿Qué harías si durante el proceso de revisión del insumo (base para planificar y diseñar las pruebas) encontras algunas “aparentes contradicciones” o si surgen dudas sobre la documentación?


### SOLUCION

- Tomar nota de las inquietudes.

- Informar a la persona designada (podría ser el autor del material, el FA, PO o BA – según la empresa).

El modo de informar dependerá de cuán formal o informal sea el proceso de comunicación en las organizaciones. Lo ideal es documentar y registrar los intercambios. 
Podríamos pensar en enviar minutas luego de una conversación para evitar malos entendidos.


---

## :book: Proceso de revisión formal: pasos a segui


1. **Planificación**

->Definir el propósito de la revisión y su alcance. ¿Cuál es el objetivo de esta revisión? ¿Qué documentos y/o que secciones de qué documento se van a revisar?

-> Estimar el esfuerzo requerido. ¿Cuánto tiempo llevará el proceso de revisión? ¿Cuál es la fecha estimada de cierre de esta etapa?

El esfuerzo y/o tiempo requerido es importante para la planificación general del proyecto y para la definición de presupuestos.

-> Definir quienes estarán  involucrados en el proceso de revisión. [SMEs – subject matter experts] Para esto, incluir personas que agreguen valor a la revisión.

Preferentemente personas con atención al detalle, que se animen a disentir y / o con diverso tipo de experiencia. 


---

:tv: **Secreto de la industria 1**: Una buen grupo para este trabajo podría estar constituido por: 

Alguien con mucha experiencia en el tipo de proyecto, producto o sistema que se va a construir + alguien nuevo + alguien de otro equipo o módulo + alguien que puede aportar mirada crítica (aquella que podría ofrecer alternativas en el análisis) + un coordinador o moderador que lidere el proyecto de revisión. 

---

-> Definición de roles y responsabilidades. Asignar a cada persona que forme parte del proceso de revisión un foco específico, para que cada uno analice el insumo desde diversos ángulos, por ejemplo: desde la usabilidad, desde la mirada del negocio, desde lo testeable, etc

Otros Roles que pueden ser necesarios para las tareas de revisión son: 

- Autor (al autor de la documentación)

- Manager

- Facilitador o moderador

- Líder de revisión

- Escriba (o alguien que tome nota de lo que se habla y decide)

El moderador, o quien lidere el proceso de revisión,  debería definir que es necesario para iniciar el proceso y qué entregables marcan su fin. [kick-off del proyecto y deliverables]

Documentar de qué tipo de revisión se trata y sus características. Por ejemplo: tipo de revisión, actividades que son parte de la revisión, kick-off, actividades de cierre, roles y responsabilidades. 

Un tester podría o no ser formalmente invitado a un proceso formal de revisión de documentación. Sea invitado o no, tendrá que analizar la documentación para planificar las pruebas que se llevarán a cabo y en esa revisión y buscará identificar cualquier tipo de defectos en la documentación.


2. **Inicio de la revisión^^

-> Para el inicio o kick-off de la revisión es necesario: 

- Compartir los documentos a revisar con quienes forman parte del grupo de revisión

- Explicar el proyecto y sus objetivos (todo lo decidido anteriormente): alcance del proceso de revisión, objetivos, roles y responsabilidades, tiempos, procesos, entregables.

- Responder preguntas del equipo de revisión

-> La revisión dependerá del proyecto en sí (recursos tiempo, necesidades).  Puede ser presencial o virtual o por mail. La forma que tome el kick-off (presencial, virtual o comunicación vía email) dependerá del proyecto, los recursos y las necesidades

---

3. **Revisión individual^^

-> Revisar toda la documentación puesta a disposición.

-> Tomar nota aquello clave y relevante que se encuentra

-> Tomar nota de aquello que “hace ruido” o que genere duda. También de las contradicciones o situaciones confusas. 

-> En esta etapa el tester debería comprender por completo aquello que se está solicitado desarrollar. Es muy importante abordar la revisión con mirada crítica. No es una simple lectura sino un análisis profundo. 

-> Puede ser útil tomar nota de lo que vamos confirmando como comportamientos esperados e ir teniendo en cuenta lo registrado durante la revisión de los documentos. ¿Encontramos contradicciones en la lista final de nuestras notas?Si le hacemos preguntas a nuestro registro ¿encontramos las respuestas?

### ¿NECESITAS UN EJEMPLO? 

Supongamos que el documento dice:

- Soporte para Firefox y Chrome

- Cuando se hace click en “guardar” el archivo debe guardarse

Yo podría preguntarme: 

- Soporte para Firefox y Chrome ¿a partir de qué versión?

- ¿Soporte para FireFox y Chrome en cualquier sistema operativo? Windows, MacOs, (¿en cualquier versión?) Linux (¿de cualquier distribución?) 

- Soporte para FireFox y Chrome ¿en cualquier dispositivo?

- Cuando se hace click en “Guardar el archivo” ¿en donde debe guardarse? ¿En una carpeta por defecto? Y si esa carpeta no existe ¿debería crearse una automáticamente? ¿Podría  alojarse en otra carpeta? O debería aparecer una ventana que pregunte al usuario ¿dónde desea guardar el documento? 

---

4. **Comunicación y análisis de problemas**

-> Comunicar los registros sobre posibles errores o gaps y las dudas surgidas. Esto podría hacerse vía email o en una reunión de revisión. 

-> Analizar si entre lo reportado hay defectos o gaps en el diseño y  en la documentación.

-> Revisar si los resultados de la revisión cumplen lo definido como entregable para el fin del proyecto. 

---

5. **Reporte y correcciones**

-> Crear reportes de defectos para todo lo encontrado junto a cualquier comentario relevante o nota de lo que se haya decidido al respecto en relación a los defectos.

-> Corregir aquello que corresponda. Generalmente el autor de la documentación es quien corrige.

-> Llevar el registro de los defectos reportados y solucionados

-> Utilizar métricas: tiempo de revisión, cantidad de defectos encontrados y corregidos. 

-> Revisar si se cumplió el criterio definido para el cierre del proceso de revisión.

---

:tv: **Secreto de la industria 2**: Es muy probable que en muchas empresas o grupos de trabajo estas estrategias de revisión no sean explícitas. En algunas  inclusive ni siquiera solicitan al tester que revise la documentación. 

Por este motivo se valora el CRITERIO que puedas desarrollar a partir del conocimiento de las  herramientas, metodologías de organización, técnicas y estrategias.

---

Puede ocurrir que en un grupo de trabajo no se solicite al tester que revises documentación. Sin embargo están acostumbrado a que lo haga y realice pruebas cuando el cambio o funcionalidad ya está desarrollado
Sea cual sea la metodología, no olvides que proponer un cambio valioso para la mejora de la calidad y los presos es una buena opción.

Recuerda: Analizar cada situación, reflexionar sobre la estrategia a utilizar y evaluar si existen posibilidades para incluir cambios en los procedimientos

---

## Ejercicio #2 – Roles y responsabilidades

¡Atención! Este ejercicio podrá llevarles un poco más de una hora para realizarlo de forma completa.

Dividanse en roles simulando un equipo de trabajo (pueden revisar un poco más arriba de esta guía cuáles son los posibles roles).

Analicen la siguiente documentación funcional de forma grupal, cada uno desde su rol asignado.

Generen sus reportes de revisión de forma individual.

#### Documentación a revisar: 

Creación de sistema para cochera (estacionamiento) de vehículos.

Al abrir la cochera, se debe fijar el precio por hora y por día de: camión, auto y moto. Atención:

- Al abrir la cochera se debe fijar la capacidad máxima de vehículos que pueden entrar en el establecimiento.

- Cuando la capacidad máxima de la cochera es alcanzada, el sistema debe mostrar una alerta para no permitir el ingreso de un nuevo vehículo.

- Cuando se enciende esta alarma, debe mostrarse por pantalla el tiempo estimado hasta la liberación de un espacio.

- El sistema debe mostrar por pantalla cuánto lugar disponible hay en todo momento.


El sistema debe permitir el ingreso de los siguientes datos para cada vehículo:

- Patente

- Tipo de vehículo

- DNI del conductor

- Hora de ingreso

El sistema debe imprimir un ticket con dichos datos al momento del ingreso de cada vehículo.

A la salida del vehículo, el sistema debe imprimir un ticket con los siguientes datos:

- Patente

- Tipo de vehículo

- DNI del conductor

- Hora de ingreso

- Hora de salida

- Tipo de tarifa aplicada

- Monto a pagar

El sistema debe permitir generar un reporte que muestre:

- Cantidad de vehículos que pasaron por el establecimiento

- Monto total recaudado

- El reporte debe poder imprimirse en cualquier momento.

- El sistema debe permitir imprimir reportes de días anteriores filtrando por fecha.


#### Roles: Autor

Al final del trabajo deberían juntarse de forma grupal a ver si el reporte que analizaron de forma individual fue comprendido de la misma manera respecto de cómo debería funcionar el sistema que se pidió que se desarrolle. 

---

## :star: Técnicas de revisión

Existen diversidad de técnicas de revisión. Estas pueden clasificarse en aquellas que son:

- **Ad hoc**: No le indica en qué hacer foco a quienes analizan el material. Esta técnica depende mucho de las habilidades de la persona que revisa. Generalmente se usa en las revisiones informales. 

- **Basadas en listas**: Se usa una lista o checklist como guía del proceso de revisión. Para documentar qué actividades se deben llevar a cabo,  qué elementos revisar y/o qué tipo de defectos buscar. Es útil para efectuar una revisión sistemática y organizada.

- **Basadas en Escenarios y pruebas**: Se entrega documentación con información de guía para que el tester comprenda cómo leer e interpretar el documento. El escenario permite testear basándose en el comportamiento esperado del producto. Es decir, que provee la información suficiente para poder identificar defectos. 

- **Basada en roles**: El documento se analiza desde la perspectiva de un rol específico. Por ejemplo: desde la visión de un administrador del sistema (admin) o de un usuario final, vendedor o auditor (dependiendo de los roles existentes en el sistema)

- **Basadas en perspectiva**: Este modo de revisar la documentación es similar a la técnica basada en roles, pero no se limita solo a ellos sino que utiliza diferentes perspectivas para el análisis. Por ejemplo, la perspectiva de un diseñador UX, la perspectiva de un usuario final, la perspectiva  comercial, o una perspectiva de tester.  
Cada perspectiva busca información diversa en documentación
  
### ¿NECESITAS UN EJEMPLO? 

Mientras que un tester analiza si se comprenden las condiciones para cada escenario, si posee el material para armar su plan de pruebas o si el documento parece libre de defectos, un diseñador UX - probablemente- analiza si están dadas las guías para la construcción de un sistema que contemple usabilidad y experiencia de usuarios según los niveles de calidad esperados. 

En cambio un usuario final sólo podría revisar si el sistema le permite hacer todo lo esperable. Desde un punto de vista comercial podría verificar si la documentación contempla que el sistema visualice métricas o ejecute algunos reportes u otro tipo de acciones de interés propias para el área. 

---

- **TIP** 😉: Siempre que realices las pruebas, sin importar la técnica utilizada comunícate eficazmente, genera propuestas superadoras y sé abierto para escuchar las ideas de los demás. El objetivo es aprender a trabajar en equipo

---

Te proponemos el siguiente desafío. 

It's time to Practice your english💪

Want to read more about revision techniques? Click [here](https://medium.com/@HugoSaxTavares/istqb-foundation-level-syllabus-chapter-3-of-6-static-testing-813868d2460c)


---

## :star: Técnicas de diseño de casos de prueba  

A continuación profundizaremos en las técnicas de diseño de casos de prueba relevantes para un test manual. Estas son dos: pruebas de caja negra y pruebas basadas en la experiencia.


1. **Técnicas de caja negra**

Las técnicas de caja negra, también llamadas “basadas en especificaciones” o “basadas en comportamientos” [BBT, black-box testing, behavior-based, specification-based testing] prueban el sistema sin tener algún tipo de conocimiento sobre cómo está construido. 

Se enfocan en corroborar el comportamiento esperado ante cada condición que se prueba. 

En casos de mala interpretación de comportamientos por parte del desarrollador o de errores que podrían derivar en comportamientos diferente al especificado en los requerimientos, estas pruebas podrían encontrar el/los fallo/s  justamente por hacer hincapié en el análisis de los ”comportamientos”  

Para crear las pruebas, nos basamos en el insumo que tengamos a disposición (base para las pruebas). En caso de no existir ningún tipo de documentación, nuestro insumo podría ser aquello que interpretemos o tomemos de una sesión con alguien que nos guíe y explique lo que se espera que el sistema haga (aka walk-through session).

Los requerimientos para el sistema pueden ser funcionales y no funcionales también. Todos tienen que ser tenidos en cuenta y probados sistemáticamente. 

A continuación, encontrarán técnicas para diseñar casos de prueba y también para: 

- Romper el hielo cuando necesitas organizarte o no sabes cómo empezar.

- Analizar las especificaciones y si todas las opciones posibles están cubiertas.

- Seleccionar con algún criterio los valores a probar y cantidad de pruebas para cierta condición


### PARTICIÓN DE EQUIVALENCIAS

Veamos el siguiente video para comprender cómo funciona esta técnica. Hacé [click aquí](https://youtu.be/vvWxJmCz8dc)

---

### ¡MANOS A LA OBRA! 

## Ejercicio #3

Un equipo de desarrolladores ha creado un formulario que tiene como input un campo que solo permite ingresar hasta 64 caracteres alfabéticos juntos. Sin símbolos ni números ni espacios entre medio. 

- Debatan en grupo cómo crearían las particiones de equivalencia para este caso.

- Divídanlas en particiones para probar casos positivos y casos negativos.

- Finalmente registren 

A) qué valor seleccionarán de cada partición para armar cada caso de prueba

B) cantidad de casos de prueba. 

### SOLUCION

![image](https://user-images.githubusercontent.com/72580574/228986861-ef42a073-462b-420a-8bd2-c9298df3a3f8.png)


---


## ANÁLISIS DE VALORES LÍMITE

En este caso también los invitamos a ver el siguiente [video](https://youtu.be/plChKlXGCo0)

---

## Ejercicio #4

Es hora de  analizar el sistema de un protector de tensión. Este debe cortar cuando la tensión es menor a 182 Volts o cuando es mayor a 242 Volts. 

¿Cuáles son nuestros valores límite? Usando la versión de la técnica que aconseja agregar un valor más en cada partición, ¿qué valores límite identifican?


### Ejercicio Extra

Crear casos de prueba para una app que debe mostrar un ícono diferente según rangos de temperatura ambiental que muestra en pantalla. El termómetro mide entre -100 y 100 grados celsius:

Para temperaturas negativas: un ícono A

Para temperaturas positivas hasta 25 grados: un ícono B

Para temperaturas mayores a 25 grados: un ícono C

Indiquen cuales son las particiones equivalentes y los valores límite para esta especificación
Indiquen qué casos de prueba armaron, con qué datos o inputs.



https://docs.google.com/document/d/1vwEBGS1l6j5dy9nbRxh_1fFO92U4BxoUaEUOOPEjImk/edit#

---



