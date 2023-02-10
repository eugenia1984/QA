# :star2: 3.3 - Ejecución de Errores

---


MODULO 3 - ENCUENTRO 16 / 17

---

## :book: MATERIAL DE LECTURA :book: 

Una vez que hemos aprendido cómo funcionan los procedimientos y ciclos de prueba, al ejecutar las pruebas deberemos reportar los errores encontrados. A continuación, analizaremos cómo encontrar errores y cómo reportarlos efectivamente para lograr su resolución, y así, aportar como tester, calidad al producto.

## Proceso de gestión de defectos

La gestión de defectos es un proceso sistemático para identificar y corregir errores. Un ciclo de 
gestión de defectos contiene las siguientes etapas:

![image](https://user-images.githubusercontent.com/72580574/218184193-b0b3344e-da2c-4836-89ee-dd83d6ba6f92.png)


1. **DESCUBRIMIENTO**

En la fase de descubrimiento, los equipos de proyecto tienen que descubrir tantos defectos como sea posible, antes de que el cliente final pueda descubrirlos. Se dice que se descubre un defecto y se acepta el cambio de estado cuando los desarrolladores lo reconocen y lo aceptan.

![image](https://user-images.githubusercontent.com/72580574/218184291-38d3a706-cdd5-4347-90bd-33dad415c9f5.png)


2. **CATEGORIZACIÓN**

La categorización de defectos ayuda a los desarrolladores de software a priorizar sus tareas. Eso significa que este tipo de prioridad ayuda a los desarrolladores a corregir primero aquellos defectos que son muy cruciales.

**¿Necesitas recordar cómo categorizamos errores?** Puedes volver a revisar el material aquí [QA E5- Casos de estudio](https://docs.google.com/document/d/1jNrJZsp_LuP2n_aDCcdkugo14vuSmXYU/edit?usp=sharing&ouid=100957054197686802986&rtpof=true&sd=true)

3. **RESOLUCIÓN**

La resolución de defectos en las pruebas de software es un proceso paso a paso para corregir los defectos. El proceso de resolución de defectos comienza con la asignación de defectos a los desarrolladores, luego los desarrolladores programan el defecto para que se solucione según la prioridad, luego se solucionan los defectos y finalmente los desarrolladores envían un informe de resolución al administrador de pruebas. Este proceso ayuda a corregir y rastrear defectos fácilmente.

Puedes seguir los siguientes pasos para corregir el defecto:

![image](https://user-images.githubusercontent.com/72580574/218184634-8cbce01e-f6e5-49a0-8a87-ab76baf8b9a6.png)

Imagen 16.3: Pasos para la resolución de defectos. Fuente: elaboración propia

- **Asignación**: asignada a un desarrollador u otro técnico para que la corrija y cambie el estado a Respondiendo.

- **Calendarizar el arreglo**: el lado del desarrollador se hace cargo de esta fase. Crearán un cronograma para corregir estos defectos, dependiendo de la prioridad del defecto.

- **Arreglar el defecto**: mientras el equipo de desarrollo está reparando los defectos, el administrador de pruebas realiza un seguimiento del proceso de reparación del defecto en comparación con el cronograma anterior.

- **Reportar la solución**: obtenga un informe de la resolución de los desarrolladores cuando se solucionen los defectos.

4. **VERIFICACIÓN**

Después de que el equipo de desarrollo soluciona e informa el defecto, el equipo de prueba verifica que los defectos se hayan resuelto realmente.

5. **CIERRE**

Una vez que se ha resuelto y verificado un defecto, el estado del defecto cambia a cerrado. De lo contrario, debe enviar un aviso al desarrollo para verificar el defecto nuevamente.

-> ¡Pro tip alert! Existen​ organizaciones internacionales como IEEE e ISO han publicado estándares para la documentación de pruebas de software.

Buscalas en google si quieres ser un experto documentando 🤓

O revisa este documento: [¿Cómo encontrar Un Error En La Aplicación](https://docs.google.com/document/d/1Fy2TeLoLa8nSlqRpkqWW44vli2ig_iRM462Ee883t4Q/edit?usp=sharing)


---

#### ¿Cómo encontrar un error en la aplicación?


Actualmente existe una serie de estándares de prueba de software llamado ISO/IEC/IEEE 29119 por las organizaciones que lo soportan. Su propósito es definir un conjunto de estándares acordado internacionalmente para la prueba de software que puede ser utilizado por cualquier organización al realizar cualquier forma de prueba de software.

Hay muchos otros estándares y decidir cual seguir es un desafío del equipo de testing.

Encontrar errores tan sutiles es el trabajo más desafiante y le brinda la satisfacción de su trabajo. Además, debe ser recompensado por las personas mayores. Tratar de descubrir los errores ocultos en el sistema que pueden ocurrir en condiciones especiales y que causan un impacto poderoso en el sistema. Puede encontrar un error de este tipo con algunos consejos y trucos.

Aquí están estos consejos:

1. Comprenda en profundidad toda la aplicación o el módulo antes de comenzar la prueba.

2. Prepare buenos casos de prueba antes de comenzar con las pruebas. Me refiero a dar énfasis a los casos de prueba funcionales, que incluyen el mayor riesgo de la aplicación.

3. Cree suficientes datos de prueba antes de las pruebas. Este conjunto de datos incluye las condiciones del caso de prueba y también los registros de la base de datos si va a probar una aplicación relacionada con la base de datos.

4. Realice pruebas repetidas con diferentes entornos de prueba.

5. Trate de averiguar el patrón resultante y luego compare sus resultados con esos patrones.

6. Cuando creas que has completado la mayoría de las condiciones de la prueba y cuando creas que estás un poco cansado, haz algunas pruebas de mono.

7. Use su patrón de datos de prueba anterior para analizar el conjunto actual de pruebas.

8. Pruebe algunos casos de prueba estándar para los que encontró los errores en alguna aplicación diferente. Al igual que si está probando el cuadro de texto de entrada, intente insertar algunas etiquetas HTML como entradas y vea la salida en la página de visualización.

9 . El último y mejor truco es esforzarse mucho para encontrar el error. ¡Como si estuviera probando solo para romper la aplicación!


---

6. **REPORTE DE ERRORES**

#### ¿Es lo mismo un reporte de errores o de incidencias?

Un informe de incidencias es un documento en el que se registran y detallan las ocurrencias encontradas en una prueba. El informe de incidencias describe un fallo, no su causa. La estructura de un informe de incidencias puede ser encontrada en el estándar ISO/IEC/IEEE 29119-3:2013 que incluye plantillas y ejemplos de documentación de prueba.

### Elementos del reporte

Los reportes de testing deben ser comprensibles, ordenados, fiables, transparentes, ágiles, consistentes, precisos, completos y trazables, por lo cual, deben gozar de información pertinente y congruente para ayudar a todos en el equipo a entenderlos fácil y rápidamente.

En general incluyen los siguientes elementos:

- Caso de prueba (aporta todos los detalles respecto de las precondiciones)

- Resultado del defecto modo de fallo (usando una descripción del resultado obtenido y el resultado esperado)

- Descripción de la desviación para facilitar su resolución (incluyendo informes, capturas de pantalla, mensajes de error de la aplicación, etc.)

- Referencias cruzadas a informes relacionados.

- Origen del problema: se puede mostrar la trazabilidad hasta indicar donde es el origen del problema

- Comentarios

- Acciones correctivas tomadas

- Hora y usuarios que ha realizado cambios

- Muchos sistemas hacen un seguimiento automático de cambios en el ciclo de vida de incidente / error

- Registro histórico (history log)

### Métricas de errores importantes

##### ¿Cómo medir y evaluar la calidad de la ejecución de las pruebas?

Esta es una pregunta que todo Gerente de Pruebas quiere saber. Hay 2 parámetros que puede considerar de la siguiente manera

![image](https://user-images.githubusercontent.com/72580574/218185710-b05133ad-9c11-46e1-8ea2-981575e043ac.png)

Imagen 16.4: Parámetros de reporte de errores. Fuente: elaboración propia

**¿NECESITAS UN EJEMPLO?**

![image](https://user-images.githubusercontent.com/72580574/218185835-3386f62e-603c-4b46-8513-7c83d843a4eb.png)

Imagen 16.5: Ejemplo reporte de errores. Fuente: elaboración propia

En el escenario anterior, puede calcular que la tasa de rechazo de deserción (DRR) es 20/84 = 0,238 (23,8 %).

Otro ejemplo, supongamos que un sitio web tiene un total de 64 defectos, pero su equipo de pruebas solo detectó 44 defectos, es decir, no detectaron 20 defectos. Por lo tanto, puede calcular que la relación de fugas por defecto (DLR) es 20/64 = 0,312 (31,2 %).

**Conclusión**: la calidad de la ejecución de la prueba se evalúa a través de los siguientes dos parámetros

Cuanto menor sea el valor de DRR y DLR, mejor será la calidad de la ejecución de la prueba. ¿Cuál es el rango de relación que es aceptable? Este rango podría definirse y aceptarse en base al objetivo del proyecto o puede consultar las métricas de proyectos similares.

En este proyecto, el valor recomendado de relación aceptable es 5 ~ 10%. Significa que la calidad de la ejecución de la prueba es baja. Debe encontrar una contramedida para reducir estas proporciones, como

- Mejorar las habilidades de prueba de los miembros.

- Dedique más tiempo a probar la ejecución, especialmente a revisar los resultados de la ejecución de la prueba.


---

## :stars:  Reportar un defecto paso a paso
1.       Definir el error
El primer paso es definir el error escribiendo un resumen en el título y proporcionando una descripción general del problema. Al escribir un resumen en el título del defecto, incluya el área y la función donde ocurre el problema. ¿Por qué? Porque la mayoría de las aplicaciones están altamente integradas y, por lo tanto, son complejas. Además, no puede asumir que los desarrolladores u otros revisores de defectos saben cómo funciona la aplicación en todos los casos.
¿NECESITAS UN EJEMPLO? 
Por ejemplo, encontré un defecto en una aplicación de administración de medicamentos; un usuario puede ingresar un medicamento al que el registro del paciente mostró una alergia grave. El botón de alergia no se resalta en rojo para indicar visualmente la alergia y, lo que es peor, le permite al usuario ingresar el medicamento en cuestión, independientemente. 
En mi título de resumen, ingresará el área y la función general:
El botón de alergia no está resaltado en rojo y el usuario puede ingresar el medicamento.
Esta es una breve declaración del problema en una oración concisa y comprensible. A continuación, debe agregar una breve descripción en el cuerpo del informe del defecto:
El botón de alergia no se resalta en rojo cuando se guarda una alergia en el registro del paciente. Además, la entrada de alergia está configurada para no permitir la entrada de medicación de la medicación que interactúa. El usuario puede ingresar y guardar el medicamento al que el paciente es alérgico.
La descripción irá seguida de detalles adicionales, así que sé breve y ve al grano. Puede ser lo único que leen muchos revisores, por lo que es esencial describir el problema de manera efectiva.
2.      Investiga la causa raíz
La investigación significa asegurarse de que el error sea realmente un error. Querrá verificar los ajustes de configuración, los ajustes del usuario, cualquier cosa en la aplicación que afecte su funcionamiento. Haga todo lo posible para asegurarse de haber establecido una base precisa. Busque declaraciones de registro de errores, si es posible. 
Asegúrese de agregar cualquier investigación realizada al final de su informe de defectos en un formato de nota. 
¿NECESITAS UN EJEMPLO? 
Siguiendo el ejemplo anterior, podrías redactar la siguiente nota:
NOTA: Configuración configurada para bloquear la entrada de medicamentos cuando existe alguna alergia relacionada en el registro del paciente, independientemente del valor de gravedad. El usuario es un MD con acceso completo. La tabla de la base de datos muestra el valor de alergia correcto en el paciente. No se generaron errores en el registro de errores.
Las "notas" son buenas maneras de comunicar a los desarrolladores la investigación que ha realizado para que puedan determinar dónde deben comenzar. 
3.      Agregar documentación de respaldo
Agrega o adjunta un archivo de grabación de pasos o un video del defecto siempre que sea posible. Si usa productos de Microsoft, hay una aplicación gratuita de grabadora de pasos que puede usar para solucionar el problema. Creará una vista de captura de pantalla por captura de pantalla de dónde hizo clic y la ubicación del código. Esto ayuda a los desarrolladores a resolver el problema de manera más eficiente. Además, enumere los resultados de las consultas de la base de datos o los archivos de registro de errores. Similar a agregar una nota, esto brinda soporte de respaldo de que el defecto existe y no es solo un problema de UI. Los cinco tipos de documentación de respaldo que se debe considerar usar son:
Archivos de la grabadora de pasos de Microsoft
Video grabado de los pasos que toma y la reacción de la aplicación (elija entre varios programas de video gratuitos disponibles en línea o simplemente use su teléfono inteligente)
Consulta de base de datos y captura de pantalla de los resultados.
Capturas de pantalla o texto completo de los mensajes de error en la descripción o como archivo adjunto
Registros de errores, que existen para la mayoría de las aplicaciones, independientemente de si son móviles, web o heredadas; adjunte una copia del registro o copie y pegue el texto en su descripción; asegúrese de identificar qué archivo de registro, si hay más de uno
 
4.      Formatee su informe para una alta legibilidad
Proporcionar un formato comprensible hace que su defecto sea más fácil de revisar y más probable que sea aceptado. Dé formato al texto del defecto separándolo en las siguientes secciones:
Resumen (título)
Descripción
Compilación/plataforma
Pasos para reproducir
Resultados previstos
Resultados actuales
Investigar
Documentación de soporte

La sección "compilación/plataforma" es opcional, según la aplicación que se esté probando. Incluya esta sección cada vez que la aplicación se ejecute en más de una plataforma o navegador, y anote la versión específica. 

La sección "pasos para reproducir" debe ser precisa. Si no puede reproducir el defecto cada vez, incluilo en el informe. Repetí los pasos para reproducir varias veces y verifique que tiene los pasos y acciones correctos en el orden correcto que son necesarios para reproducir el defecto. Al escribir los pasos para reproducir, tene en cuenta que es posible que los desarrolladores no sepan cómo funciona la aplicación en general. Dales pasos detallados pero concisos para que puedan reproducir el defecto.
¿NECESITAS UN EJEMPLO? 
Configuración: Establezca la configuración de alergias en SIEMPRE BLOQUEAR y guarde.
Inicie sesión como usuario de MD con acceso completo.
Seleccione un paciente con una alergia existente guardada a la penicilina.
Vea el botón de alerta de alergia en la esquina superior derecha.
Ingrese una orden de medicación para penicilina, q4h durante 30 días. Ahorrar.
Sea directo y al grano. Si son posibles varias formas de realizar una acción, asegúrese de anotar cuál usó. Por ejemplo:
Haga clic en el botón Ingresar medicamento del menú principal para agregar un medicamento. Utilice la ventana Buscar/Seleccionar para elegir la penicilina. Haga clic en Aceptar en la ventana emergente para confirmar la selección del medicamento.


Elementos importantes en el informe de errores
A continuación, se presentan las características importantes en el informe de error:
1.       Número/id de error
Un número de error o un número de identificación (como swb001) hace que el informe de errores y el proceso de referencia a errores sean mucho más fáciles. El desarrollador puede verificar fácilmente si un error en particular se ha corregido o no. Hace que todo el proceso de prueba y repetición sea más fluido y fácil.
2.      Título del error
Los títulos de errores se leen con más frecuencia que cualquier otra parte del informe de errores. Esto debería explicar todo sobre lo queincluye el error. El título del error debe ser lo suficientemente sugerente para que el lector pueda entenderlo. Un título de error claro hace que sea fácil de entender y el lector puede saber si el error se informó anteriormente o se solucionó.
3.      Prioridad
Según la gravedad del error, se puede establecer una prioridad para él. Un error puede ser un Bloqueador, Crítico, Mayor, Menor, Trivial o una sugerencia. Las prioridades de errores se pueden dar de P1 a P5 para que los importantes se vean primero.
4.      Plataforma/Entorno
La configuración del sistema operativo y del navegador es necesaria para un informe de error claro. Es la mejor manera de comunicar cómo se puede reproducir el error.
Sin la plataforma o el entorno exactos, la aplicación puede comportarse de manera diferente y es posible que el error del lado del tester no se replique del lado del desarrollador. Por lo tanto, es mejor mencionar claramente el entorno en el que se detectó el error.
5.      Descripción
La descripción del error ayuda al desarrollador a comprender el error. Describe el problema encontrado. Una descripción deficiente creará confusión y hará perder el tiempo a los desarrolladores y testers.
Es necesario comunicar claramente sobre el efecto de la descripción. Siempre es útil usar oraciones completas. Es una buena práctica describir cada problema por separado en lugar de desmenuzarlos por completo. No utilice términos como “Creo” o “Creo”.
6.      Pasos para reproducir
Un buen informe de error debe mencionar claramente los pasos para reproducir. Estos pasos deben incluir acciones que puedan causar el error. No haga declaraciones genéricas. Sea específico en los pasos a seguir.
7.      Resultado esperado y real
La descripción de un error está incompleta sin los resultados esperados y reales. Es necesario delinear cuál es el resultado de la prueba y qué debe esperar el usuario. El lector debe saber cuál es el resultado correcto de la prueba. Claramente, mencione lo que sucedió durante la prueba y cuál fue el resultado.
8.      Captura de pantalla
Una imagen vale más que mil palabras. Tome una captura de pantalla de la instancia de falla con los subtítulos adecuados para resaltar el defecto. Resalte los mensajes de error inesperados con color rojo claro. Esto llama la atención sobre el área requerida.
¿NECESITAS UN EJEMPLO? 
Aquí te dejamos un reporte de ejemplo: QA E16 - Ejemplo Reporte de error.docx

¡Pro tip alert! Conviértete en un escritor excepcional de informes de defectos.
Revisa todo el informe de defectos antes de enviarlo. La credibilidad de los miembros del equipo de desarrollo mejora cuando los defectos son claros, concisos y reproducibles. Si mencionas un archivo adjunto, asegúrate de agregarlo. Ten en cuenta en la descripción si puedes o no reproducir el error a voluntad, o solo en ciertas versiones o plataformas. Se conciso y directo, incluyendo solo los datos de defectos relevantes.


¿Cuáles son los estados de un defecto?
El número de estados soportados por herramientas es variable, veamos a continuación una categorización de defectos en un ciclo:
Nuevo– el tester ha introducido un defecto en el sistema
Abierto– informe de problema confirmado (por el jefe de pruebas o desarrollador)
Rechazado– rechazado el informe del problema (por el tester, jefe de pruebas o desarrollador)
Inspección– el desarrollador intenta identificar el defecto
En observación– el defecto no puede ser reproducido, se encuentra bajo vigilancia
Trabajo en progresión– el defecto es localizado y preparado/desbloqueado para su corrección
Repetición de pruebas (retest)– el desarrollador ha corregido la causa del error y ha hecho su prueba de escritorio (revisa que se cumpla el requerimiento y el error ya no esté)
Finalizado- tester ha verificado la corrección a través de la repetición de las pruebas
No resuelto– el tester no ha podido verificar la corrección, el defecto aún se encuentra ah
Análisis y modificación de estados
Normalmente el jefe de pruebas o responsable decide si un defecto debe ser corregido o rechazado - de forma alternativa el consejo de control de cambio puede decidir sobre la corrección de un defecto teniendo en cuenta el coste de reparación. En el caso en que no haya un responsable de testing, muchas veces dicho rol es tomado por el líder de proyecto.
Todos los cambios (incluidos los comentarios) deben ser registrados en el sistema de gestión de incidencias. Esto asegura el control continuo sobre el estado de corrección de un defecto. Permite Pueden planificar las actividades de pruebas futuras
¡Sólo un tester puede poner un defecto en estado Finalizado!
Los informes de defectos son analizados de forma sistemática con el objeto de evaluar el estado de desarrollo de las actividades de corrección de defectos conformidad con el plan de proyecto y la calidad de software.
Preguntas para tener en cuenta:
¿Es perceptible una reducción en el número de detecciones de nuevos defectos? ¿o se está incrementando el número a lo largo del ciclo de vida del proyecto?
¿Hay objetos de prueba particulares que presenten un alto número de defectos? ¿Hay algún objeto de prueba que presente un número de defectos más bajo que el número medio de defectos?
¿Cuántos defectos de severidad alta / prioridad alta aún siguen abiertos?
¿Cuánto tiempo requiere la corrección de un defecto? ¿Cuál es el tiempo medio para la corrección de defectos?
¿NECESITAS UN EJEMPLO? 
Estás en camino a convertirte en un Tester, te dejamos una plantilla para que reportes todos tus errores. QA E16 - Plantilla Reporte de errores.docx







¡MANOS A LA OBRA! 
Ejercicio #1
¿Recuerdas cuando revisamos esta web?
https://www.theworldsworstwebsiteever.com/old.htm
Utilizando la plantilla que te dimos antes, reporta al menos 3 errores. Al terminar, compara con tus compañeros los reportes realizados. 
¿Alguno reportó el mismo error que vos? ¿Alguno reportó un error que no viste?
💡 Ayudín: ¿Encontraste la lista de errores que brinda la página?

Ejercicio #2
El ejercicio se va poniendo desafiante… ¡Llegó la hora de investigar en la web!
Te dejamos aquí este sitio de prueba:
Automation Practice Site
Escribe el reporte de error correspondiente. Luego, pueden compartir con el equipo los errores que identificaron para cada caso.
Utiliza esta plantilla: QA E16- Reporte de errores
¡Recuerda que aquí no hay respuestas correctas y/o incorrectas!








