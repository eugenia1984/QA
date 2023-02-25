# :star: ESTIMACION DE DESARROLLO DE PRUEBAS

---

## :book: TEMAS

- 1 - Puntos a tener en cuenta

---

## :star: 1 - Puntos a tener en cuenta

Realización de una estimación del desarrollo de pruebas. Puntos a tener en cuenta.

## Estimación de Pruebas 

Estimar el esfuerzo de pruebas no es una tarea sencilla, y en la mayoría de los casos, dependemos de fechas que nos han marcado previamente. 

Sin dudas, debemos aplicar alguna técnica y saber cómo manejar impedimentos como para llegar a una estimación aceptable y que calcule los tiempos con razonabilidad. 

Inicialmente detallar una lista de actividades que debe llevar el plan de pruebas:

• Análisis y diseño de casos de prueba (elaboración de la matriz de casos) 

• Obtener datos de pruebas. 

• Instalar en ambiente de testing la entrega de desarrollo. 

• Ejecutar casos de pruebas. 

• Verificar nuevamente los casos con incidencias corregidos (repruebas). 

• Apoyo al pase a producción. 

• Soporte durante el período de post-implantación. 

Para realizar la estimación, debemos partir de una especificación funcional o historias de usuario si estamos usando Agile. 

Estas especificaciones funcionales deben estar razonablemente libres de dudas. 

Si existen dudas funcionales o técnicas significativas es preferible regresar la especificación al emisor y esperar a que las ambigüedades sean aclaradas. 

A continuación indico como se podría estimar cada actividad: 

Análisis y diseño de casos de prueba (elaboración de la matriz de casos) Esta es una de las más difíciles de estimar de antemano, después de todo como puedo decirte cuanto tiempo me tomará hacer el análisis si todavía no lo he analizado (jaja). 

Aquí se puede manejar alguna regla cualitativa según la complejidad de la especificación funcional que recibas. Por ejemplo, puedes definir un SLA de 2 días para Requerimientos de complejidad baja (por ej. que tomen 30 jornadas o menos de desarrollo), 5 días para requerimientos complejos ((menos de 90 jornadas) y 10 días para los más complejos. 

Podría ser inclusive más tiempo para proyectos más grandes. 

Para esta parte el método de estimación que más he usado es el Juicio Experto. 

### Ejecutar casos de pruebas 

Esta actividad la puedes estimar después del análisis pues depende directamente del número de casos de prueba a ejecutar y cuanto tiempo te tomará cada uno. 

Lo primero es identificar los casos de prueba, en mi experiencia he usado principalmente el Juicio Experto (un experto determina cuales casos se necesitan) y también por casos de uso (identificar los escenarios de prueba por caso de uso). Planning Poker no lo he usado, pero he leído sobre él y me parece interesante, pues en realidad es una técnica de juicio experto estructurada de forma grupal donde participa todo el equipo Scrum. 

Una vez tienes identificados los casos de prueba, puedes utilizar información histórica (cuanto tiempo te ha tomado ejecutar casos de prueba en el pasado) para definir cuanto tiempo te tomará ejecutar cada caso de prueba. Puedes inclusive clasificarlos por complejidad y tener un tiempo predefinido a cada caso según su complejidad por aplicación (cada aplicación puede tardar distinto en probarse). 

### Obtener datos de pruebas 

Podría calcularse como un porcentaje de lo que te toma ejecutar un caso de prueba. Esto dependerá de la información histórica (cuanto tiempo te ha tomado hacerlo en el pasado que tengas). Podrías definir por ejemplo 10% o 20% del tiempo de ejecución del caso (según complejidad), luego sumas el tiempo de obtención de datos de prueba de cada caso y así tendrías la estimación. 

### Instalar en ambiente de testing la entrega de desarrollo 

Esto depende de la complejidad del desarrollo, no de la cantidad de casos de prueba a ejecutar. 

Puede estimarse por juicio experto según el número de instalaciones y diferentes aplicativos y bases de datos a instalar. Aquí la información histórica también es clave. 

Verificar nuevamente los casos con incidencias corregidos (repruebas) Para estimarlo, puedes definir una regla de porcentaje de casos que estimas tendrán incidencia y debes repetir. 

Por ejemplo, supongamos que en tu peor escenario, el 30% de los casos tendrán incidencias. 

Entonces puedes estimarlo como el 30% del tiempo de ejecución de pruebas. No es exacto pero es una aproximación. 

Para definir el porcentaje de casos con error, se debe revisar la historia de desarrollos pasados para el aplicativo que estés probando y el equipo de trabajo. 

### Apoyo al pase a producción 

Es una actividad de soporte que dura el tiempo del pase a producción, incluyendo actividades previas y posteriores. Para estimarla el equipo de desarrollo define cuanto tiempo durará y se estima en función de las personas de pruebas que deben estar presentes. 

### Soporte durante el período de post-implantación 

Va en función de cuántas personas de pruebas (Testers) estén asignados y cuanto tiempo dura la actividad. Puede ser a dedicación parcial, por ejemplo se estima la mitad del tiempo a dar soporte y la otra mitad a iniciar el siguiente proyecto. 

---
