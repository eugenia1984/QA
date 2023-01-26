# :star2: 1.5 Casos de estudio

---

![image](https://user-images.githubusercontent.com/72580574/214962387-36e44baf-6ae5-4d97-a77e-805122efce6d.png)


---

## :star: INTRODUCCION

**¡Te damos la bienvenida a tu quinto encuentro de trabajo!**

Check de 1 minuto: Hoy es un encuentro de integración de conceptos. Nos tomaremos el día de hoy para ejercitar, consolidar y transferir los aprendizajes a contextos nuevos y desafiantes. Lo más beneficioso para ti es darte cuenta de cuánto sabes. También, podrás identificar aquellos conceptos que más te cuestan o que todavía no has asimilado completamente. ¡No te preocupes! A mayor conciencia de tus áreas de mejora, mayor foco para poder trabajar sobre ellas. 

**¡Demos comienzo a la actividad del día de hoy!**

##  :star: 1. Presentación del equipo⏰(10min)

¡Listos, preparados, ya! A esta altura conoces bien cómo funciona este momento. ¿Ya se han presentado con el equipo? ¿Te has encontrado nuevamente con alguien? ¿Han podido resolver las actividades que han surgido hasta ahora?		

Utilicen unos 10 minutos para compartir estas breves presentaciones y repasar los conceptos que han aprendido en el encuentro anterior. ¡Seguro recuerdas más de lo que crees!

---

## :book: MATERIAL DE LECTURA ⏰ (30min)

## 2. Evaluación de criticidad y prioridad

Hemos explorado ampliamente el mundo de los errores (¡y todavía falta!) pero nos detendremos hoy a entender cómo clasificar a un error o defecto en el momento en el que lo encontramos(1). 


(1)  Error es lo que comete el desarrollador al escribir el código, defecto es lo que vemos de manifiesto en el software.


Si el ciclo de producción de software está funcionando correctamente el equipo de testing (QA) podrá identificar o alertar de errores a tiempo antes de que salgan a la luz, frente a los clientes o usuarios finales. Como bien sabemos esto sería una descripción del escenario ideal. Lo habitual es que haya muchas líneas de código y muchas personas colaborando al mismo tiempo (grandes empresas con procesos de trabajo muy establecidos) o pocas personas haciendo muchas tareas superpuestas (contexto de empresas pequeñas o en estadío de startup). Es en esa superposición de muchas personas o muchas tareas que a veces vemos cómo los errores salen a la luz (bugs o defectos). O los descubrimos con muy poco tiempo antes de que sea necesario entregar el producto y ya no hay margen para cambios. 

En la siguiente imagen vemos una simple matriz de análisis que nos puede servir de ayuda para saber qué hacer al descubrir un defecto. 

![image](https://user-images.githubusercontent.com/72580574/214962980-dcd2e457-01d9-42ea-849e-b534e041a4fb.png)

Imagen 5.1: Matriz de priorización de defectos, basada en la matriz de toma de decisiones de Eisenhower. Fuente: producción propia.


---

## :star: MANOS A LA OBRA

### Ejercicio #1

Vamos a poner en práctica la matriz de priorización y le vamos a sumar un componente: identificar el tipo de error que vemos. 

- A - En el cuadro a continuación verás distintas descripciones de un reporte en el que el equipo de QA detecta varios defectos en una app mobile (para teléfonos celulares).

- B - Clasifica cada uno de los defectos detectados. En la columna de Criticidad/gravedad clasifícalos en torno a su impacto en la funcionalidad. Y en prioridad asígnales un valor basándote en cuánto afectan al valor de la empresa.

[Aquí tienes una copia de la tabla](https://docs.google.com/document/d/1oH_G2MjeZDJp4mgD85O-uH-BmdloriPLF-g1ZAFz34k/edit?usp=sharing) para poder trabajar.


![image](https://user-images.githubusercontent.com/72580574/214963433-b417b363-5895-4ace-992f-7082c24f57d3.png)

- C - Si no lo han hecho todavía, es un buen momento para compartir el ejercicio y cómo lo resolvieron. Estos son casos reales y muchas veces no hay consenso sobre qué funcionalidad se debe resolver primero. Lo más importante es poder traer evidencias de impacto. ¿Qué están viendo ustedes como testers que los otros equipos no han logrado identificar? Cuanto más eficientes sean al explicar por qué estos defectos son relevantes, más rápido se podrá proceder a solucionarlos y más valor tendrá cada uno de ustedes en los equipos. 


- D - BONUS: ¿Se animan a catalogar qué tipo de error es cada uno? 

- E - BONUS #2: ¿Tienen ejemplos gráficos de defectos parecidos? Vale usar Google, no es necesario que los hayan encontrado ustedes.

---

## :book: MATERIAL DE LECTURA ⏰ (25min)

### 3 - Verificación y validación 

El proceso de **verificar** y **validar** es el proceso por el cual **se investiga si un sistema de software satisface las especificaciones, requerimientos y estándares indicados y si cumple el propósito deseado**.

- Verificación: ¿Estamos construyendo el producto correctamente?

- Validación: ¿Estamos construyendo el producto correcto?

Estos dos términos son utilizados indistintamente por muchas personas. Dado que los especialistas en testing se encargan fundamentalmente de la verificación, debemos hacer foco en comprender el término y distinguirlo de la validación. 

#### Verificación

Es el proceso por el que se determina si el software que está siendo analizado se está diseñando y desarrollando de acuerdo a requerimientos especificados(2). Los requerimientos o especificaciones actúan como guía en todo el proceso de desarrollo de software. El código que se escribe para un software está basado en esa documentación inicial.

(2)  En el encuentro #1, vimos cómo se inicia un proyecto de software. En la primera etapa “Estrategia” el equipo de desarrollo recopila todo lo que debe ejecutar el software y redacta un documento guía que acompaña todos los estadíos de desarrollo. A ese documento se lo conoce como “Requerimientos.”

Seth Godin (3) define a la calidad como “estar a la altura de los requerimientos.”

(3) Seth Godin es un autor, emprendedor y consultor de Marketing y ventas estadounidense. Entre sus logros se encuentran ser el autor del blog más antiguo de internet: https://seths.blog/. Desde su inicio, Seth no ha dejado de publicar una entrada por día. Si vas a procrastinar con tu tiempo, hazlo leyendo sobre Seth Godin. 


La potente definición de Godin simplifica al máximo nuestra tarea al iniciar un proyecto:

- Asegúrate de haber comprendido lo que se debe hacer

- Haz las preguntas en este momento o luego ya deberás cumplir con lo establecido en ese documento inicial

La verificación se realiza para corroborar que el software que está siendo desarrollado adhiera a estas especificaciones en todos los momentos de su ciclo de desarrollo. La verificación asegura que la lógica del código esté alineada con estas especificaciones y que no contenga errores.

Dado que el proceso de verificación suele ser complejo debido al tamaño del proyecto o la complejidad del mismo, se utilizan varios métodos de verificación. Algunos de ellos son: inspección del código, revisiones de código, revisiones técnicas, entre otros. Los equipos de testing (QA) también pueden usar modelos matemáticos y cálculos para predecir el comportamiento del código y verificar su lógica (etapa de análisis de requerimientos). 

### ¿NECESITAS UN EJEMPLO? 

Supongamos que debemos testear una aplicación para teléfonos móviles. O dicho como lo diría un profesional: una app mobile. 
Esta verificación tiene tres fases:

- La verificación de los requerimientos.

- La verificación del diseño.

- La verificación del código.

**Paso 1**: es verificar y confirmar que los requerimientos están completos, son claros y correctos. Antes de que una aplicación vaya a ser desarrollada, el equipo de QA testea que los requerimientos del negocio o del cliente estén completos y correctos(4).

(4) ¿Te acuerdas del caso que vimos en el Encuentro #1 en el que un cliente ficticio hacía un pedido? El primer paso luego de ese pedido era que el equipo de desarrollo se preocupara por tener todos los requerimientos lo más exactos posibles, para no diseñar ni cotizar nada que no sea relevante. 


**Paso 2**: La verificación del diseño es el proceso por el cual el equipo se asegura que el software cumple con los requerimientos de diseño y lo hace a través de mockups o evidencias gráficas. Aquí el equipo de QA testea si los layouts(5), prototipos (mockups), los flujos de navegación, el diseño de la arquitectura y los modelos lógicos de las bases de datos están a la altura de los requerimientos funcionales y no-funcionales del cliente. 

(5) Layout es la distribución gráfica de los elementos en una pantalla, por ejemplo. En una habitación, el layout es cómo están distribuidos los muebles y qué sensación generan de una u otra manera. 


**Paso 3**: La verificación del código tiene por objetivo evaluar el código para ver si está (a) completo, (b) correcto y (c) si es consistente (al ser testeado, responde en forma previsible). En esta etapa el equipo de QA chequea si el código fuente, las interfaces de usuario y el modelo de la base de datos de la aplicación cumplen con las especificaciones de diseño. 

Lo más importante a recordar de este ejemplo es que la verificación se realiza en forma interna, dentro de los equipos que van a estar trabajando con el desarrollo de la aplicación. Es importante hacer este proceso antes de iniciar el trabajo ya que asegura que no se trabaje en direcciones equivocadas, gastando recursos escasos. Una vez más, el equipo de testing está para asegurarse de que se trabaje en forma eficiente, anticipando los problemas y ahorrando tiempo y dinero.

La realidad: muchas organizaciones y startups tardan mucho en implementar procesos de verificación. Y suelen hacerlo cuando ya han constatado más de una vez que se gasta mucho más en “lo hacemos rápido, sin un plan” que “lo hacemos bien, verificando paso por paso y luego lo construimos.”

#### Conclusiones:

La verificación es un proceso continuo, interno que se debe realizar en todas las etapas del desarrollo de software. La verificación es el testing estático. 

Sus principales ventajas son:

Actúa como control de calidad en cada etapa del proceso de desarrollo de software.

Permite que el equipo de desarrollo produzca productos que se ajustan a los requerimientos y a las necesidades del cliente.
Ahorra tiempo ya que se detectan los defectos en las etapas tempranas del desarrollo de software.

Reduce o elimina los defectos que pueden surgir en las etapas más tardías del desarrollo de software.

### Validación

La validación es el proceso de chequear que se esté desarrollando el producto correcto. A diferencia de la verificación que va desde los requerimientos hacia el código, la validación se hace en dirección opuesta. Va escalando por las distintas capas de desarrollo y va chequeando que el software desarrollado sea el producto correcto. Es por ello que este proceso lo lleva adelante, en su mayor parte, el equipo de desarrollo, y se realiza cuando el producto ya está listo para ser entregado. La validación es el testing dinámico. 

Para que ya vayas teniendo un idea, en el proceso de validación, estas son las actividades más relevantes:

1. Testeo de caja negra (Black box testing - BBT) (6) - Testeo de sistema completo. Responsables: equipo de QA/testing


(6)  Podemos hacer muchos esfuerzos para que tengas esta información en español, pero la realidad es que el 90% de las veces vas a escuchar que se llama a estos tests por su denominación original en inglés. 


2. Testeo de caja blanca (White box testing - WBT). Responsables: desarrolladores

3. Testeo unitario (Unit testing - UT). Responsables: desarrolladores

4. Testeo de integración o integraciones (Integration testing). Responsables: desarrolladores

El extraño caso del UAT (User Acceptance Test). El UAT es el último test del proceso de verificación (y está a cargo de usuarios reales, beta testers o usuarios designados por el cliente), o puede ser considerado como parte de la Validación ya que es parte del proceso de validación del producto. Hoy en día la línea que divide Verificación de Validación es muy difusa ya que los procesos se han vuelto más dinámicos, respondiendo a cambios mucho más ágiles propios del desarrollo de software ágil. (7)

(7) ¿Quieres leer más sobre este tema? AVISO: está en inglés y es altamente técnico. 


Si en el campo profesional estos dos procesos se superponen, ¿por qué es importante que aprendamos estos conceptos? 
Volviendo al punto de partida inicial: la verificación sirve para saber si estamos construyendo el producto correctamente (de acuerdo a lo pedido) y la validación nos sirve para saber si hemos construido el producto correcto (el que necesita el mercado o el cliente y que va a generar valor).

![image](https://user-images.githubusercontent.com/72580574/214965634-7843b9c2-1dda-45fb-ab1a-29dc81d0d755.png)


### ¿NECESITAS UN EJEMPLO? 

¡Por supuesto que sí! La teoría es útil pero solamente cuando sabemos en dónde utilizarla y para qué. 

Vamos a dar un paseo por una verificación. Estaremos verificando un automóvil y una aplicación de software al mismo tiempo. 

1. **Inspección**: se refiere a examinar un producto o sistema sin intervenir en él. Puede ser la simple manipulación física o tomar medidas, por ejemplo.

-Automóvil: inspeccionar visualmente el automóvil para asegurarnos de que cumpla con los requerimientos especificados: levanta cristales eléctrico, asientos ajustables, aire acondicionado, sistema de navegación a bordo, kit de remolque, etc.

-Software: examinar visualmente el software para constatar que existan las pantallas solicitadas, chequear que estén los campos necesarios para el ingreso de datos (nombre de usuario, por ejemplo), verificar que existan todos los botones para las funcionalidades solicitadas, etc.

2. **Demostración**: es la manipulación del producto como se espera que sea usado, para verificar que se comporte como se planificó o de acuerdo a las expectativas.

-Automóvil: poner en uso los comandos de las ventanas y los asientos para verificar que funcionen correctamente, encender el vehículo para corroborar que el aire acondicionado produzca aire frío, dar una vuelta con el automóvil para tener una idea de aceleración y rango de maniobras como fue descrito en los requerimientos.

-Software: ingresar todos los campos en las pantallas y seleccionar los botones que cumplan con lo solicitado, esperando la respuesta específica. Asegurar que los datos devueltos son del tipo requerido.

3. **Prueba**: es la verificación del producto o sistema utilizando una serie de estímulos, datos o ingresos predeterminados para corroborar que el producto produzca un resultado específico y predefinido en los requerimientos.  
	
-Automóvil: acelerar el automóvil de cero a 100 km/h. Verificar que pueda ser realizado en 5.2 segundos. Acelerar en una curva bajo condiciones de control, produciendo 0.8 fuerza G, sin que el vehículo pierda tracción.

-Software: ingresar el tipo y modelo de automóvil, con levanta cristales eléctrico, dirección asistida, y el resto de las opciones definidas en el plan de pruebas, seleccionar el botón de “obtener precio ya” y que la aplicación devuelva el valor preciso de “$43.690”.

4. **Análisis**: es la verificación del producto o sistema utilizando modelos, cálculos y equipos de pruebas especializados. Esta etapa permite que se puedan hacer predicciones sobre el desempeño o performance típicos del producto o software basados en resultados confirmados de las pruebas. También se pueden combinar estos resultados para ofrecer mayor información sobre el producto para poder estimar los rangos límites de performance. 


-Automóvil: completar una serie de aceleraciones a unas revoluciones/m por un tiempo determinado, mientras se monitorea la vibración del motor y su temperatura, verificando que se logran los resultados deseados. Utilizar esta información para predecir el punto de falla del motor. Ej, las rev/m máximas toleradas por un tiempo estimado.

-Software: completar una serie de pruebas en las que un número predeterminado de usuarios ingresan las características del automóvil que están intentando cotizar e inician la función “obtener precio” al mismo tiempo. Se mide el tiempo de respuesta para corroborar que la función devuelve un precio dentro de los límites de tiempo preestablecidos. Se analiza la relación entre el incremento de usuarios en el sistema y el tiempo que le toma a la función devolver el precio. Se documentan los resultados y el tiempo de cada prueba para ver si se degrada la performance a medida que el sistema recibe mayor carga para detectar cuándo es el momento en el que el sistema deja de cumplir con las expectativas definidas en los requerimientos.

---

## ¡MANOS A LA OBRA! 

### Ejercicio optativo

Es mucho material para absorber y seguro volverás en el futuro a leerlo con mayor entendimiento de su importancia. 

Les proponemos un ejercicio optativo como equipo. Si vienen bien con los tiempos de hoy, si estos temas ya los tienen claros o si prefieren el camino de “probar y luego entender”, este ejercicio es para ustedes. 

En Egg debemos realizar todas estas pruebas, y a medida que nuestra tecnología va adquiriendo complejidad, estas pruebas se realizan para sostener nuevas funcionalidades y nuevos desafíos de cantidad de usuarios. 

¿Se animan a diseñar un plan de pruebas simple para la tecnología de Egg, siguiendo los 4 pasos de verificación que vimos en el ejemplo anterior?


---

## :book: MATERIAL DE LECTURA ⏰ (25min)

### 4. Introducción a la documentación de defectos (bugs)

Ya estamos afilando nuestras herramientas de detección de defectos. Ya sabemos cómo clasificarlos y hasta nos aventuramos a entender un poco del mundo de la UX. ¿Cómo podemos iniciarnos en la documentación clara y efectiva de un defecto?

Si bien vamos a estar explorando varias técnicas y matrices de documentación, es importante saber que hay una estructura básica que incluye todos los datos necesarios para que un equipo de desarrolladores sepa a qué error nos referimos, en qué contexto del software está y qué esperamos de la solución. Reportar defectos en forma clara también ayuda a que puedan resolverse rápidamente.


```
Reporte #125

Defecto: La palabra “Settings” está mal escrita en el menú de Configuración en la versión en inglés.

Descripción del defecto (¿Cuál es el bug?): Falta la letra “g” en la palabra “Settings”

Comportamiento esperado (¿Cómo debería verse?): Cambiar la palabra “Settins” por “Settings”

Enlaces relacionados: Ver imágenes a continuación

Más información: Si es necesario aclarar el contexto para replicar el error
```

* UX: user experience o experiencia de usuario se refiere a la navegación intuitiva y sensación de claridad que tienen los usuarios al interactuar con soluciones de software. A pesar de que la UX (User Experience) y la UI (User Interface) tienen nombres parecidos son completamente diferentes. La UI o interfaz de usuario está dirigida hacia el lado más racional de la navegación y la arquitectura de cómo se presentan los elementos.*

![image](https://user-images.githubusercontent.com/72580574/214966226-9a5c4a8c-d7cd-4415-b809-3557208874f5.png)


---




