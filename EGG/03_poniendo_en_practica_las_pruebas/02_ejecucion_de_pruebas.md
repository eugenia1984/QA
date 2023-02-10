# :star2: 3.2 - Ejecución de pruebas

---

MODULO 3 - ENCUENTRO 15 / 17

---


En los encuentros anteriores pudimos analizar en el **plan de pruebas** las primeras etapas del STLC. Durante el encuentro de hoy, veremos en detalle las etapas finales del mismo. Al finalizar esta guía encontrarás un cuadro que te ayudará a repasar el STLC completo.

---


##:book: MATERIAL DE LECTURA :book:

### Implementación

Es la etapa donde los diseños de prueba realizados en las etapas previas del STLC como casos, procedimientos y datos de prueba, se configuran para estar listos para la etapa siguiente -Ejecución-. Es un proceso que respeta un orden lógico y prioritario establecido por el Gerente de pruebas, quien también prepara los entornos para la ejecución de las pruebas. 

En este momento, si realizaramos alguna prueba automatizada aquí también se desarrollarían esos scripts. También es el momento en donde se adquieren, de ser necesario, herramientas para la gestión de estas pruebas. 

En esta etapa, el Gerente de Pruebas debe asegurar:

- entrega del entorno de prueba

- entrega de datos de prueba

- se comprueban las limitaciones, los riesgos y las prioridades

- se comprueban los criterios de entrada (explícito/implícito)

- el equipo de prueba está listo para la ejecución:

-Asegurarse de que el entorno de prueba está en su lugar.

-Garantizar que cada caso de prueba esté bien documentado y revisado.

-Poner el entorno de prueba en un estado de preparación.

-Verificación contra criterios de entrada explícitos e implícitos para el nivel de prueba especificado.

-Describir el entorno de prueba, así como los datos de prueba con gran detalle.

-Realización de una verificación de aceptación de código ejecutándolo en un entorno de prueba.

-> **¡Pro tip alert!** Algunas organizaciones pueden seguir el estándar IEEE829 para definir las entradas y los resultados esperados asociados durante las pruebas. Búscalo en google, te ayudará a tener claridad respecto a la documentación en estos procesos.

---

## Desventajas de la implementación temprana de pruebas
La implementación temprana de las pruebas también puede tener algunas desventajas.

- Por ejemplo, si se ha adoptado el ciclo de vida ágil para el desarrollo de productos, el código en sí puede sufrir cambios drásticos entre iteraciones consecutivas. Esto hará que toda la implementación de la prueba sea inútil.

- De hecho, cualquier ciclo de vida de desarrollo iterativo afectará el código entre iteraciones, incluso si no es tan drástico como en el ciclo de vida Agile.

- Esto hará que las pruebas predefinidas queden obsoletas o requieran un mantenimiento continuo y con muchos recursos.

- De manera similar, incluso en el caso de ciclos de vida secuenciales, si el proyecto está mal administrado y los requisitos siguen cambiando incluso cuando el proyecto se encuentra en un estado avanzado, la implementación de la prueba inicial puede volverse obsoleta.

Por lo tanto, antes de iniciar el proceso de implementación de pruebas, el gerente de pruebas (Test Manager) debe considerar estos puntos importantes:

· Ciclo de vida de desarrollo de software que se utiliza

· Características que deben probarse

·  Probabilidad de cambio en el requisito tarde en el ciclo de vida del proyecto

·  Posibilidad de cambios en el código entre dos iteraciones

## Ventajas de la implementación temprana de pruebas

La implementación temprana de la prueba también ofrece algunas ventajas.

- Las pruebas concretas, por ejemplo, brindan ejemplos listos del comportamiento apropiado del software si se documentan de acuerdo con las condiciones de la prueba.

- A los expertos en dominios les resulta más fácil verificar las pruebas concretas que las reglas comerciales no concretas, lo que les permite detectar fallas en las especificaciones del software.

### Entorno de pruebas

El primer paso es configurar el entorno de pruebas

¡Lenguaje técnico! **Entorno de pruebas** es una configuración de software y hardware para que los equipos de prueba ejecuten casos de prueba. En otras palabras, admite la ejecución de pruebas con hardware, software y red configurados.
En otras palabras, un entorno de prueba le permite crear entornos idénticos cada vez que necesite probar su producto. Es la herramienta más importante para que un ingeniero de pruebas tenga confianza en los resultados de las pruebas.

**¿NECESITAS UN EJEMPLO?**

Pensemos en un experimento sencillo. ¿Alguna vez has germinado una semilla en un frasco de algodón? Digamos que nuestro estudio -o testeo- consiste en ver la diferencia de crecimiento entre el frasco A y el frasco B que serán regados, el primero con agua de la canilla y el segundo con agua destilada. Para analizar los verdaderos resultados de nuestro experimento, debemos evitar que haya otras diferencias entre ambos frascos. No sería lo mismo que el frasco A reciba más sol que el B. El ENTORNO DE PRUEBA de este experimento es tener dos frascos iguales, con semillas de la misma plata, que reciban los mismos cuidados EXCEPTO aquel que se está probando.

## Configuración del entorno de pruebas

Esta es una fase crucial del ciclo de vida de las pruebas de software y requiere la ayuda de otros miembros de la organización. Los tester deben tener acceso a las capacidades de informe de errores, así como a la arquitectura de la aplicación para respaldar el producto. Sin estos elementos, es posible que los tester no puedan hacer su trabajo.

Una vez listos, los testers establecen los parámetros para el entorno de prueba, que incluyen el hardware, el software, los datos de prueba, los marcos, las configuraciones y la red. En esta fase STLC, los testers ajustan estos parámetros ambientales según lo que requiera el caso de prueba. 
La configuración de un entorno de prueba adecuado garantiza el éxito de las pruebas de software. Cualquier falla en este proceso puede generar costos y tiempo adicionales para el cliente.

**¿NECESITAS UN EJEMPLO?** 
La mayoría de los usuarios de un producto pueden estar en un dispositivo Android, usar una determinada versión de un navegador Chrome y tener una cierta cantidad de potencia de procesamiento en esos dispositivos; estos son parámetros que incluiría el entorno de prueba.

## Importancia del entorno de prueba

Un entorno de prueba proporciona información precisa sobre la calidad y el comportamiento de la aplicación que se está probando. En otras palabras, un entorno de prueba le proporciona la configuración necesaria para ejecutar sus casos de prueba.

Un entorno de prueba lo ayuda aún más al proporcionar un entorno dedicado para que pueda aislar el código y verificar el comportamiento de la aplicación. Esto garantiza que no se esté ejecutando en el servidor ninguna otra actividad que pueda influir en el resultado de las pruebas.

## Desafíos en la configuración de la gestión del entorno de prueba

- **Planificación adecuada del uso de recursos**. La planificación ineficaz del uso de recursos puede afectar el resultado real. Además, puede dar lugar a conflictos entre equipos.

- **Entorno remoto**. Es posible que un entorno de prueba esté ubicado geográficamente aparte. En tal caso, el equipo de prueba debe confiar en el equipo de soporte para varios activos de prueba. (Software, hardware y otros temas).

- **Tiempo de configuración elaborado**. A veces, la configuración de la prueba se vuelve demasiado elaborada en casos de pruebas de integración.

- **Uso compartido por equipos**. Si el entorno de prueba es utilizado por el equipo de desarrollo y prueba simultáneamente, los resultados de la prueba se dañarán.

- **Configuración de prueba compleja**. Ciertas pruebas requieren una configuración de entorno de prueba compleja. Puede representar un desafío para el equipo de prueba.

-> **¡Pro tip alert!** Prácticas recomendadas para configurar una gestión del entorno de prueba

- Comprende los requisitos de la prueba a fondo y educa a los miembros del equipo de prueba.

- La conectividad debe verificarse antes del inicio de la prueba.

- Comprueba el hardware y el software necesarios, las licencias, navegadores y versiones

- Planificación del uso programado del entorno de prueba.

- Herramientas de automatización y sus configuraciones.


---

### Ejecución

Si es hora de ejecutar tus pruebas, comprueba este checklist de procedimientos que deben cumplirse previamente:

- El diseño o definición de las pruebas debe ser completo.

- Las herramientas de prueba, especialmente las herramientas de gestión de pruebas deben estar listas

- Los procesos para el seguimiento de los resultados de las pruebas, incluidas las métricas, deben estar funcionando.

- Cada miembro del equipo debe comprender los datos a rastrear

- Los criterios para registrar pruebas y reportar defectos deben publicarse y estar disponibles para todos los miembros del equipo.

- Si la estrategia de prueba que se utiliza es reactiva, aunque sea parcialmente, se debe asignar tiempo adicional para aplicar metodologías basadas en defectos y experiencia.

La ejecución de prueba es la etapa del STLC donde se ejecuta una prueba en el componente o sistema bajo prueba, produciendo un resultado real.

Durante la ejecución, una función de los administradores de pruebas es:

- Supervisar el progreso de acuerdo con el plan.

- Iniciar y llevar a cabo acciones de control para guiar las pruebas.

Durante la ejecución, es importante mantener una capacidad de seguimiento entre las condiciones, la base y el objetivo de las pruebas y tener el nivel adecuado de registro de la prueba que incluya detalles relevantes..

Se debe reservar tiempo suficiente para las sesiones de ejecución de pruebas. Esta estimación de 
tiempo estará basada en la experiencia y en los defectos impulsados por los hallazgos del tester.
Los testers seguirán los planes de prueba desarrollados en la primera fase y utilizarán los scripts de prueba escritos en la segunda fase. Las pruebas deben ejecutarse siguiendo estrictamente el plan, con todas las discrepancias, defectos, fallas, problemas y errores registrados tan pronto como se identifiquen. Los defectos y discrepancias deben asignarse a los casos de prueba y luego volver a probarse para garantizar la validez de los resultados de la prueba. 

Las discrepancias se miden como la diferencia entre los resultados de la prueba reales y esperados.

Idealmente, las pruebas deben realizarse según los casos de prueba definidos. Sin embargo, el administrador de pruebas puede permitir que los testers realicen pruebas adicionales para detectar comportamientos nuevos e interesantes observados durante las pruebas.

Obviamente, si se detecta alguna falla durante tales pruebas no planificadas, se deben documentar las variaciones de los casos de prueba predefinidos, para que puedan reproducirse en el futuro.

### Desafíos para la ejecución en STLC

Muchos de los desafíos relacionados con la fase de ejecución del ciclo de vida de las pruebas de software se relacionan con la documentación, la consistencia y la tecnología.

A menudo, en el rápido ritmo de desarrollo y lanzamiento, las pruebas se vuelven de baja prioridad. El equipo sacrificará las pruebas críticas para sacar el lanzamiento más rápido, lo que puede generar problemas que solo se descubren más tarde.

Según una encuesta reciente, quienes diseñan pruebas de TI en los Estados Unidos y el Reino Unido identificaron la dificultad para usar software y herramientas de prueba como el mayor desafío para la ejecución exitosa de las pruebas. Las herramientas que no son fáciles de usar y requieren una capacitación extensa y que requiere mucho tiempo para los testers no técnicos pueden aumentar el costo y limitar la eficiencia de las pruebas.

-> **¡Pro tip alert!** ¿Quieres ser un experto en ejecución? Te dejamos aquí las mejores prácticas:

- Registra las pruebas realizadas para respaldar cada requisito.

- Verifica que se hayan cumplido los requisitos en el producto, utilizando una Matriz de 
- - Trazabilidad de Requisitos (RTM).

- Utiliza el RTM para analizar el trabajo realizado en un proyecto. Con este análisis, el equipo de control de calidad puede estimar mejor los ciclos de trabajo posteriores, se pueden eliminar las reelaboraciones innecesarias y redundantes para reducir los costos y los proyectos tendrán menos defectos y problemas.

Al final de la fase de ejecución, se debe completar todo el plan de prueba, con todos los defectos identificados y documentados. Este documento, un informe de defectos, es una herramienta importante para administrar el proyecto y garantizar una versión de alta calidad.


## Informe de defectos

El informe de defectos es un proceso de detección de defectos en la aplicación que se está probando o en el producto mediante la prueba o el registro de los comentarios de los clientes y la creación de nuevas versiones del producto que solucionen los defectos en función de los comentarios del cliente. Es el documento por excelencia que culmina la etapa de ejecución.

**¿NECESITAS UN EJEMPLO?**

¿Quieres ver cómo redactar un informe? Te dejamos un modelo a continuación:

[QA E15 - Ejemplo informe de errores](https://docs.google.com/document/d/1CN2Y27fWr2xw8CnXig4l3fXWSiHhYNqXKEt7JpzjXS0/edit?usp=sharing)

![image](https://user-images.githubusercontent.com/72580574/218189998-9c98b07b-1f73-4bd5-bbbd-c4feed4f7480.png)


---

## Mapeo de defectos

Una vez que se informa y se registra el defecto, debe mapearse con los casos de prueba fallidos/bloqueados y los requisitos correspondientes en la Matriz de trazabilidad de requisitos.

Este mapeo lo realiza el Defect Reporter. Ayuda a hacer un informe de defectos adecuado y analizar el producto. Una vez que los casos de prueba y los requisitos se mapean con el defecto, las partes interesadas pueden analizar y tomar una decisión sobre si reparar o diferir el defecto en función de la prioridad y la gravedad.

## Volver a probar

Volver a probar es ejecutar una prueba fallida anteriormente contra AUT para verificar si el problema se resolvió. Una vez que se ha solucionado un defecto, se realiza una nueva prueba para verificar el escenario en las mismas condiciones ambientales.

Durante la nueva prueba, los tester buscan detalles granulares en el área modificada de la funcionalidad, mientras que la prueba de regresión cubre todas las funciones principales para garantizar que no se rompa ninguna funcionalidad debido a este cambio.

## Pruebas de regresión

Una vez que todos los defectos están en estado cerrado, aplazado o rechazado y ninguno de los casos de prueba está en estado de progreso/fallido/no ejecutado, se puede decir que la prueba de integración del sistema se basa completamente en los casos de prueba y los requisitos. Sin embargo, se requiere una ronda de pruebas rápidas para garantizar que ninguna de las funciones se interrumpa debido a cambios en el código/arreglos de defectos.

## Tipos de pruebas de regresión
Pruebas de regresión finales: se realiza una "prueba de regresión final" para validar la compilación que no ha sufrido cambios durante un período de tiempo. Esta compilación se implementa o envía a los clientes.

Pruebas de regresión: se realiza una prueba de regresión normal para verificar si la compilación NO ha roto ninguna otra parte de la aplicación debido a los cambios recientes en el código para corregir defectos o mejorar.

La ejecución de la prueba también ocurre en al menos 2 ciclos (3 en algunos proyectos). Por lo general, en cada ciclo, se ejecutarán todos los casos de prueba (el conjunto de pruebas completo). El objetivo del primer ciclo es identificar cualquier bloqueo, defectos críticos y la mayoría de los defectos altos. El objetivo del segundo ciclo es identificar defectos altos y medios remanentes, corregir lagunas en los guiones y obtener resultados.

 ## Informe de estado de ejecución de prueba

Informe de ejecución de prueba diario/semanal:

¡Alerta de lenguaje técnico! Informe de estado de ejecución de prueba.
Por lo general, se trata de una comunicación enviada para establecer la transparencia de las actividades del día del equipo de control de calidad durante el ciclo de prueba; incluye información sobre defectos e información sobre la ejecución del caso de prueba.

¿A quién debería ir? – Normalmente, el equipo de desarrollo, el equipo de soporte del entorno, el analista comercial y el equipo del proyecto son los destinatarios/participantes de la reunión. El Plan de prueba es el mejor lugar para encontrar esta información.

#### ¿Qué contiene un informe de estado de ejecución de prueba?

1. Número de casos de prueba planificados para ese día

2. Número de casos de prueba ejecutados ese día

3. Número de casos de prueba ejecutados en general

4. Número de Defectos encontrados ese día/y sus respectivos estados

5. Número de Defectos encontrados hasta el momento/y sus respectivos estados

6. Número de defectos críticos: aún abiertos

7. Tiempos de inactividad del entorno, si los hay

8. Showstoppers - si los hay

9. Adjunto de la hoja de ejecución de pruebas / Enlace a la herramienta de Gestión de Pruebas donde se ubican los casos de prueba

10. Archivo adjunto al informe de error/enlace a la herramienta Defecto/Prueba/Gestión utilizada para la gestión de incidentes

Los 10 puntos anteriores, si los miras de cerca, son los datos sin procesar. Reportar los hechos es una cosa y reportar algunos hechos “inteligentes” es otra. **¿Cómo refinamos esta información?**

Muestra el estado general con un indicador de color. Por ejemplo: Verde: a tiempo; Naranja: Ligeramente atrasado, pero puede absorber el retraso; Rojo: Retrasado.

Incluye algunas métricas simples como el % de casos de prueba aprobados hasta el momento, la densidad de defectos, el % de defectos graves; Al hacer esto, no solo estás dando números, en realidad estás dando una idea de la calidad del producto que está probando.

- Si una fase significativa está completa, resaltala.

- Si hay un defecto crítico que va a bloquear toda/una parte de la ejecución futura, resaltalo.

- Si usas una presentación, asegúrate de incluir algunos gráficos para tener un mejor impacto.

Por ejemplo, el siguiente gráfico es una representación del número de defectos abiertos, por módulo:

![image](https://user-images.githubusercontent.com/72580574/218190463-026db575-cefe-4bc9-96c1-602a5e95fe11.png)


Cuadro 15.1: número de defectos abiertos. Fuente: elaboración propia

Aparte de estos, también puedes incluir opcionalmente:

- ¿Cuáles son las próximas actividades previstas?

- ¿Necesitas algún aporte de alguno de los otros equipos y, de ser así, qué?

Por último, algunos consejos para ayudar en el proceso:

- Ser conciso a la vez que completo.

- Asegurate de que los resultados que informe sean precisos

- Usa puntos con viñetas para que el informe sea muy legible

- Vuelve a verificar para incluir la fecha, el asunto, la lista y los archivos adjuntos correctos.

- Si el Informe es demasiado grande y tiene demasiados factores para informar: colócalo en una ubicación común como un archivo y envía un enlace en el correo electrónico en lugar del archivo en sí. (Asegúrese de que los destinatarios tengan permisos de acceso a esta ubicación y al archivo)

---

## :star: Informe de estado de muestra

Informe de estado de las pruebas de control de calidad:

Siguiendo estas pautas, llegamos al siguiente informe de estado.

![image](https://user-images.githubusercontent.com/72580574/218190651-d3915140-4e0b-4c07-b2ca-906573ea7bce.png)


Qué encuentro intenso, ¿no? Suele decirse que el dibujo relaja mucho. Garabatear en un papel o en la pantalla de tu ordenador es otra 💫 manera de desconectar y descansar un rato💫 del trabajo. 

¡Prueba esta herramienta a ver qué tal te resulta! → http://weavesilk.com/


---

## Actividades de cierre

Las actividades de cierre de prueba son aquellas actividades que se realizan al final del proceso de prueba. Por lo general, se realizan después de que se entrega el producto, como por ejemplo generar un informe de prueba. De acuerdo con el proceso de prueba, es esencial garantizar que los procesos para entregar información de origen esencial para evaluar los criterios de salida y los informes estén disponibles y sean efectivos.

Una vez que se declara finalizada la fase de ejecución de la prueba, se deben capturar los 
resultados importantes para archivarlos o transmitirlos a la persona interesada.

Desde la fase de análisis de la prueba hasta la ejecución, pasando por el diseño y la implementación, el Gerente de prueba debe asegurarse de que los miembros del equipo proporcionen la información de manera correcta y oportuna. Esto es necesario para una evaluación y un informe eficientes.

La tasa de informes y su profundidad dependen del proyecto y de la organización. Ambos factores deben discutirse durante la planificación de la prueba después de las conversaciones con las partes interesadas del proyecto.

Juntas, estas tareas forman las actividades de cierre de prueba, que se dividen en estos cuatro grupos clave:

## Comprobación de la finalización de las pruebas

Aquí, el administrador de pruebas se asegura de que todos los trabajos de prueba se hayan completado realmente. Por ejemplo, cada prueba planificada debe haberse ejecutado o evitado deliberadamente.

Todos los errores conocidos deben corregirse, aplazarse o reconocerse como limitaciones permanentes. En caso de corrección de errores, las correcciones también deben probarse.

## Entrega de objetos de prueba

Los productos de trabajo relevantes deben pasarse a las personas relevantes. Por ejemplo, los errores conocidos deben comunicarse al equipo de mantenimiento del sistema.

Las pruebas y su información de configuración deben transmitirse al equipo de pruebas de mantenimiento. Los conjuntos de pruebas de regresión manuales y automáticas deben registrarse y transmitirse al equipo de mantenimiento del sistema.

## Experiencia de aprendizaje

Un componente importante de las actividades de cierre de pruebas son las reuniones que analizan y documentan las lecciones aprendidas de las pruebas, así como el ciclo de vida completo del desarrollo de software.

Estas discusiones se enfocan en asegurar que los buenos procesos se repitan y los malos se eliminen en el futuro. Si quedan algunos problemas sin resolver, se vuelven parte de los planes del proyecto.

Algunas de las áreas consideradas en futuros planes de prueba incluyen:

1. ¿Se involucró un amplio espectro de usuarios en el análisis de los riesgos de calidad? Por ejemplo, muchas veces se descubren defectos inesperados al final del proyecto.

A - Podría haberse evitado si hubiera una representación más amplia de usuarios en las sesiones de análisis de riesgos de calidad.

B- Por lo que, en futuros proyectos, se incluirían más usuarios en estas sesiones.

2. ¿Fueron correctas las estimaciones de la prueba? Si, por ejemplo, las estimaciones han estado significativamente fuera de lugar, las futuras tareas de estimación deben abordar las razones, como las pruebas ineficientes, detrás de esta estimación incorrecta.

3. ¿Cuáles fueron los resultados del estudio de causa y efecto de los defectos y las tendencias mostradas por ellos?

A - Por ejemplo, si las solicitudes de cambio se propusieron tarde en el proyecto, afectando la calidad del análisis y el desarrollo, Test Manager debe investigar las tendencias que implican métodos incorrectos.

B - Estas tendencias podrían ser como perder un nivel de prueba que tenía el potencial de identificar defectos antes, uso de nuevas tecnologías, cambio en los miembros del equipo, falta de experiencia, etc.

4. ¿Hay margen para mejorar los procesos de prueba?

5. ¿Hubo alguna desviación inesperada del plan de prueba, que debería incorporarse en la planificación de pruebas futuras?

---

## Archivar

Los documentos de prueba como los informes y registros de prueba y los productos de trabajo deben archivarse en el sistema de gestión de configuración. Es decir, tanto los planes de prueba como los de proyecto, con una relación clara con la versión y el sistema utilizado para la prueba, deben estar disponibles en el archivo de planificación.

Las tareas mencionadas anteriormente son muy importantes, pero los equipos de prueba generalmente las pasan por alto. Por lo tanto, deben estar claramente integrados en el plan de prueba.
Una o más de estas tareas pueden quedar fuera debido a cualquiera de estas razones:

- Reasignación inoportuna

- Eliminación de miembros del equipo.

- Demanda de recursos para otros proyectos

- Fatiga del equipo

Para garantizar la inclusión de estas tareas en el plan de pruebas, el contrato debe mencionarlas explícitamente.

---

 ## :star: Control y monitoreo

El Monitoreo de Pruebas y el Control de Pruebas es básicamente una actividad de gestión. El Monitoreo de Pruebas es un proceso de evaluación y retroalimentación sobre la fase de prueba “actualmente en progreso”. Test Control es una actividad de guiar y tomar acciones correctivas basadas en algunas métricas o información para mejorar la eficiencia y la calidad.

La actividad de supervisión de pruebas incluye:

1. Proporcionar feedback al equipo y a los otros usuarios interesados en el progreso de los esfuerzos de prueba.

2. Informar los resultados de las pruebas realizadas, a los miembros asociados.

3. Encontrar y rastrear las métricas de prueba.

4. Planificación y Estimación, para decidir el camino de acción futuro, en base a las métricas calculadas.

Los puntos 1 y 2 hablan sobre los Informes de prueba, que es una parte importante del Monitoreo de prueba. Los informes deben ser precisos y concisos. Aquí es importante comprender que el contenido del informe difiere para cada parte interesada.

Los puntos 3 y 4 hablan de las métricas. Las siguientes métricas se pueden utilizar para la supervisión de pruebas:

- Métrica de cobertura de prueba.

- Métricas de ejecución de pruebas (Número de casos de prueba aprobados, fallidos, bloqueados, en espera).

- Métricas de defectos.

- Métricas de trazabilidad de requisitos.

- Métricas varias como el nivel de confianza de los tester, hitos de fecha, costo, cronograma y tiempo de respuesta.

---

## :star: Métricas

Una métrica es una medida cuantitativa del grado en que un sistema, componente del sistema o proceso posee un atributo dado. Las métricas se pueden definir como "ESTÁNDARES DE MEDICIÓN".

Las métricas de software se utilizan para medir la calidad del proyecto. Simplemente, una métrica es una unidad utilizada para describir un atributo. La métrica es una escala para medir.

Supongamos que, en general, “Kilometro” es una métrica para medir el atributo “Distancia”. De manera similar, en el software, "¿Cuántos problemas se encuentran en mil líneas de código?", Aquí el número de problemas es una medida y el número de líneas de código es otra medida. La métrica se define a partir de estas dos medidas.

**¿NECESITAS UN EJEMPLO?** 

Ejemplo de métricas de prueba:

¿Cuántos errores existen dentro del módulo?

 ¿Cuántos casos de prueba se ejecutan por tester?
 
 ¿Cuál es el porcentaje de cobertura de prueba?
 
## ¿Por qué probar métricas?

La generación de métricas de prueba de software es la responsabilidad más importante del líder/gerente de prueba de software. Las métricas de prueba se utilizan para:

o   Tomar las decisiones necesarias para la siguiente fase de actividades.

o   Comprender qué tipo de mejora se requiere para el éxito del proyecto.

o   Tomar una decisión sobre las modificaciones a realizar.

Importancia de las métricas de prueba de software:

Por ejemplo, un analista de pruebas tiene que:

1.       Diseñar los casos de prueba para 3 requisitos.

2.      Ejecutar estos 3 casos de prueba diseñados.

3.      Registrar los errores, buggs o fallos encontrados en los casos de prueba relacionados

4.      Una vez resuelto volver a ejecutar el caso de prueba fallido correspondiente.

En el escenario anterior, si no se siguen las métricas, el trabajo realizado por el analista de pruebas será subjetivo, es decir, el informe de pruebas no tendrá la información adecuada para conocer el estado de su trabajo/proyecto.

Si las métricas están involucradas en el proyecto, entonces se puede publicar el estado exacto de su trabajo con los números/datos adecuados. Es la manera en la que los tester cuantifican las pruebas.

---

## :star: Control de pruebas

El Control de Pruebas implica orientar y tomar medidas correctivas de la actividad, con base en los resultados del Monitoreo de Pruebas. Los ejemplos de control de prueba incluyen:

1.       Priorización de los esfuerzos de prueba

2.      Revisión de los horarios y las fechas de las pruebas

3.      Reorganización del entorno de prueba

4.      Repriorización de los casos/condiciones de prueba

La supervisión y el control de las pruebas van de la mano. Al ser principalmente una actividad de gerente, un Analista de Pruebas contribuye a esta actividad recopilando y calculando las métricas que eventualmente se utilizarán para el seguimiento y el control.

¿Necesitas recordar un poco el STLC? Ten este cuadro a mano para recordar cada etapa: [QA E15 - Resumen etapas STLC.docx](https://docs.google.com/document/d/10JLHMp4Jd_hpOdU0Ex0OpcV8j2RSJrCY/edit?usp=sharing&ouid=100957054197686802986&rtpof=true&sd=true)

![image](https://user-images.githubusercontent.com/72580574/218191481-29b70a37-982a-45ff-800b-32ecc537ef45.png)

![image](https://user-images.githubusercontent.com/72580574/218191520-44c2fbdc-06b8-4c40-a62e-5e1f65356413.png)


![image](https://user-images.githubusercontent.com/72580574/218191558-2f421b42-9afb-4958-9886-736042c85c14.png)


---


## :star: Ejercicios

¡Vamos a poner en práctica todo lo que hemos visto en esta guía con los siguientes ejercicios!

### Ejercicio #1

Al implementar la ejecución de pruebas, el Gerente de Pruebas debe asegurar:

A - la entrega del entorno de prueba

B - la entrega de datos de prueba

C - que se comprueben las limitaciones, los riesgos y las prioridades

D - que el equipo de prueba esté listo para la ejecución

E - que se comprueben los criterios de entrada (explícito/implícito)

En este sentido, ¿cuáles son las preguntas necesarias a realizarse en cada uno de estos puntos? Creen todas estas preguntas a modo de guía, para que cuando deban implementar una ejecución de pruebas, tengan presentar qué preguntas hacerse para ser precisos y lograr buenos resultados.

Desarrolla al menos 5 preguntas por cada uno de los ítems. Puedes utilizar la siguiente plantilla para resolver el ejercicio: [QA E15- Ejecución de pruebas](https://docs.google.com/document/d/1TK7UWJJ_7OaeDcQ4acl56sVKW1t8G5up5kaU_0nRzC8/edit?usp=sharing)

![image](https://user-images.githubusercontent.com/72580574/218191821-eb858be7-be04-417b-8b82-e4f8a691ea67.png)


## Ejercicio #2

Desafío de aprendizaje: Trata de contestar las siguientes preguntas sin tener el material de lectura (¡Como si fuera un desafío propio!)

1. ¿Qué es la implementación?

2. Mencione algunas ventajas y desventajas de la implementación temprana de pruebas.

3. ¿Qué es un entorno de prueba?

4. ¿Cuál es la importancia del entorno de prueba?

5. Enumerar los elementos que se requieren para crear un entorno de prueba.

6. ¿Se pueden organizar múltiples entornos de prueba?

7. Mencione algunas buenas prácticas recomendadas para configurar un entorno de prueba

8. ¿Cuáles son las 4 actividades de cierre de pruebas?

9. ¿Para qué sirven las actividades de Monitoreo de pruebas y el control de pruebas?

10. ¿Es importante probar las métricas?

### Ejercicio #3

1.	Enumere las condiciones necesarias para una ejecución efectiva y eficiente (Pista: son 7).

2.	Según una encuesta realizada a tomadores de decisiones de pruebas de IT: ¿cuál es el mayor desafío para lograr el éxito en la ejecución de pruebas? 

3.	¿Cual es el objetivo de la fase de ejecución?

4.	Si hablo de registrar las pruebas, utilizar una RTM (matriz de trazabilidad) para la verificación del cumplimiento de los requisitos y el análisis del trabajo realizado, ¿a qué me estoy refiriendo?

5.	¿Por qué se realizan las Pruebas de Regresión?

6.	¿Cuáles son los 3 entornos donde se puede encontrar alojada la aplicación o producto software?

7.	¿Cuál es el nombre que se le da a la prueba en la que nos ponemos en la piel de un usuario sin planificación ni documentación?

8.	Analiza el siguiente ejemplo y responda si implementaría pruebas automatizadas o no y por qué: 

- Este proyecto es para realizar un chat interno de una empresa.

- El sistema es necesario, pero no es una empresa muy grande ni de muchas áreas.

- Es simplemente para facilitar y hacer más eficiente la comunicación.

- Solo cuenta con dos módulos, la administración del chat que es la sección donde se crean los perfiles y se dan de alta para poder utilizar el chat y el chat mismo.

- Tiene que ser compatible con las distintas configuraciones y tipos de computadoras que utilizan los empleados.

- No hay más que una forma de utilizar el sistema

---
