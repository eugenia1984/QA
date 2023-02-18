# :star2: 1.5 Casos de estudio

---

MODULO 1 ENCUENTRO 5 / 17

---

## :star: INTRODUCCION

**¡Te damos la bienvenida a tu quinto encuentro de trabajo!**

**Check de 1 minuto**: Hoy es un encuentro de integración de conceptos. Nos tomaremos el día de hoy para ejercitar, consolidar y transferir los aprendizajes a contextos nuevos y desafiantes. Lo más beneficioso para ti es darte cuenta de cuánto sabes. 

También, podrás identificar aquellos conceptos que más te cuestan o que todavía no has asimilado completamente. 

¡No te preocupes! A mayor conciencia de tus áreas de mejora, mayor foco para poder trabajar sobre ellas. 

**¡Demos comienzo a la actividad del día de hoy!**

##  :star: 1. PRESENTACION DEL EQUIPO  ⏰ (10min)

¡Listos, preparados, ya! A esta altura conoces bien cómo funciona este momento. 

¿Ya se han presentado con el equipo? 

¿Te has encontrado nuevamente con alguien? 

¿Han podido resolver las actividades que han surgido hasta ahora?		

Utilicen unos ⏰ 10 minutos ⏰  para compartir estas breves presentaciones y repasar los conceptos que han aprendido en el encuentro anterior. ¡Seguro recuerdas más de lo que crees!

---

## :book: MATERIAL DE LECTURA ⏰ (30min)

## 2. EVALUACION DE CRITICIDAD Y PRIORIDAD


Hemos explorado ampliamente el mundo de los errores (¡y todavía falta!) pero nos detendremos hoy a entender **cómo clasificar a un error o defecto en el momento en el que lo encontramos**(1). 


(1)  **Error** es **lo que comete el desarrollador al escribir el código**, **defecto** es **lo que vemos de manifiesto en el software**.


Si el ciclo de producción de software está funcionando correctamente el equipo de testing (QA) podrá **identificar o alertar de errores a tiempo antes de que salgan a la luz, frente a los clientes o usuarios finales**. Como bien sabemos esto sería una descripción del escenario ideal. Lo habitual es que haya muchas líneas de código y muchas personas colaborando al mismo tiempo (grandes empresas con procesos de trabajo muy establecidos) o pocas personas haciendo muchas tareas superpuestas (contexto de empresas pequeñas o en estadío de startup). **Es en esa superposición de muchas personas o muchas tareas que a veces vemos cómo los errores salen a la luz (bugs o defectos)**. O **los descubrimos con muy poco tiempo antes de que sea necesario entregar el producto y ya no hay margen para cambios**. 

En la siguiente imagen vemos una simple matriz de análisis que nos puede servir de ayuda para saber qué hacer al descubrir un defecto. 

![image](https://user-images.githubusercontent.com/72580574/214962980-dcd2e457-01d9-42ea-849e-b534e041a4fb.png)

Imagen 5.1: Matriz de priorización de defectos, basada en la matriz de toma de decisiones de Eisenhower. Fuente: producción propia.


---

## :star: MANOS A LA OBRA ✋

###  ☑️ EJERCICIO #1

Vamos a poner en práctica la matriz de priorización y le vamos a sumar un componente: **identificar el tipo de error que vemos**. 

- (**A**) En el cuadro a continuación verás distintas descripciones de un reporte en el que el equipo de QA detecta varios defectos en una app mobile (para teléfonos celulares).

- (**B**) - Clasifica cada uno de los defectos detectados. En la columna de **Criticidad/gravedad** clasifícalos en torno a su impacto en la funcionalidad. Y en **prioridad** asígnales un valor basándote en cuánto afectan al valor de la empresa.

[Aquí tienes una copia de la tabla](https://docs.google.com/document/d/1oH_G2MjeZDJp4mgD85O-uH-BmdloriPLF-g1ZAFz34k/edit?usp=sharing) para poder trabajar.


![image](https://user-images.githubusercontent.com/72580574/214963433-b417b363-5895-4ace-992f-7082c24f57d3.png)

- (**C**) - Si no lo han hecho todavía, es un buen momento para compartir el ejercicio y cómo lo resolvieron. Estos son casos reales y muchas veces no hay consenso sobre qué funcionalidad se debe resolver primero. Lo más importante es poder traer evidencias de impacto. ¿Qué están viendo ustedes como testers que los otros equipos no han logrado identificar? Cuanto más eficientes sean al explicar por qué estos defectos son relevantes, más rápido se podrá proceder a solucionarlos y más valor tendrá cada uno de ustedes en los equipos. 


- (**D**) - BONUS #1: ¿Se animan a catalogar qué tipo de error es cada uno? 

- (**E**) - BONUS #2: ¿Tienen ejemplos gráficos de defectos parecidos? Vale usar Google, no es necesario que los hayan encontrado ustedes.

---

## :book: MATERIAL DE LECTURA ⏰ (25min)

### ☑️  3 - VERIFICACION Y VALIDACION 

El proceso de **verificar** y **validar** es el proceso por el cual **se investiga si un sistema de software satisface las especificaciones, requerimientos y estándares indicados y si cumple el propósito deseado**.

- **Verificación: ¿Estamos construyendo el producto correctamente?**

- **Validación: ¿Estamos construyendo el producto correcto?**

Estos dos términos son utilizados indistintamente por muchas personas. Dado que los especialistas en testing se encargan fundamentalmente de la verificación, debemos hacer foco en comprender el término y distinguirlo de la validación. 

#### VERIFICACION

Es el proceso por el que **se determina si el software que está siendo analizado se está diseñando y desarrollando de acuerdo a requerimientos especificados**(2). Los **requerimientos** o **especificaciones** actúan como guía en todo el proceso de desarrollo de software. El código que se escribe para un software está basado en esa **documentación inicial**.

(2)  En el encuentro #1, vimos cómo se inicia un proyecto de software. En la primera etapa **“Estrategia”** el equipo de desarrollo recopila todo lo que debe ejecutar el software y redacta un **documento guía** que acompaña todos los estadíos de desarrollo. A ese documento se lo conoce como **“Requerimientos”**.

Seth Godin (3) define a la **calidad** como **“estar a la altura de los requerimientos”**.

(3) Seth Godin es un autor, emprendedor y consultor de Marketing y ventas estadounidense. Entre sus logros se encuentran ser el autor del blog más antiguo de internet: [https://seths.blog/](https://seths.blog/). Desde su inicio, Seth no ha dejado de publicar una entrada por día. Si vas a procrastinar con tu tiempo, hazlo leyendo sobre Seth Godin. 


La potente definición de Godin simplifica al máximo nuestra tarea al **iniciar un proyecto**:

- Asegúrate de haber **comprendido lo que se debe hacer**

- Haz las **preguntas** en este momento o luego ya deberás cumplir con lo establecido en ese documento inicial

La **verificación** se realiza para **corroborar que el software que está siendo desarrollado adhiera a estas especificaciones en todos los momentos de su ciclo de desarrollo**. La verificación asegura que **la lógica del código esté alineada con estas especificaciones y que no contenga errores**.

Dado que el proceso de verificación suele ser complejo debido al tamaño del proyecto o la complejidad del mismo, se utilizan varios **métodos de verificación**. Algunos de ellos son: 

- inspección del código

- revisiones de código

- revisiones técnicas
 
Los equipos de testing (QA) también pueden usar modelos matemáticos y cálculos para predecir el comportamiento del código y verificar su lógica (etapa de análisis de requerimientos). 



### ¿NECESITAS UN EJEMPLO? 

Supongamos que debemos testear una aplicación para teléfonos móviles. O dicho como lo diría un profesional: una app mobile. 

Esta verificación tiene tres fases:

- 1 - La verificación de los **requerimientos**.

- 2 - La verificación del **diseño**.

- 3 - La verificación del **código**.


---->> **Paso 1**: es **verificar** y **confirmar** que **los requerimientos están completos, son claros y correctos**. Antes de que una aplicación vaya a ser desarrollada, el equipo de QA testea que los requerimientos del negocio o del cliente estén **completos** y **correctos**(4).

(4) ¿Te acuerdas del caso que vimos en el Encuentro #1 en el que un cliente ficticio hacía un pedido? El primer paso luego de ese pedido era que el equipo de desarrollo se preocupara por tener todos los requerimientos lo más exactos posibles, para no diseñar ni cotizar nada que no sea relevante. 


----->>**Paso 2**: La **verificación del diseño** es el proceso por el cual el equipo se **asegura** que el **software cumple con los requerimientos de diseño y lo hace a través de mockups o evidencias gráficas**. Aquí el equipo de QA testea si los **layouts**(5), **prototipos** (**mockups**), los **flujos de navegación**, el **diseño de la arquitectura** y los **modelos lógicos** de las bases de datos están a la altura de los requerimientos funcionales y no-funcionales del cliente. 

(5) Layout es la distribución gráfica de los elementos en una pantalla, por ejemplo. En una habitación, el layout es cómo están distribuidos los muebles y qué sensación generan de una u otra manera. 


------>> **Paso 3**: La **verificación del código** tiene por objetivo **evaluar el código para ver si está (a) completo, (b) correcto y (c) si es consistente (al ser testeado, responde en forma previsible)**. En esta etapa el equipo de QA chequea si el **código fuente**, las **interfaces de usuario** y el **modelo de la base de datos** de la aplicación cumplen con las especificaciones de diseño. 

Lo más importante a recordar de este ejemplo es que la verificación se realiza en forma interna, dentro de los equipos que van a estar trabajando con el desarrollo de la aplicación. Es importante hacer este proceso antes de iniciar el trabajo ya que asegura que no se trabaje en direcciones equivocadas, gastando recursos escasos. Una vez más, el equipo de testing está para asegurarse de que se trabaje en forma eficiente, anticipando los problemas y ahorrando tiempo y dinero.

*La realidad*: muchas organizaciones y startups tardan mucho en implementar procesos de verificación. Y suelen hacerlo cuando ya han constatado más de una vez que se gasta mucho más en “lo hacemos rápido, sin un plan” que “lo hacemos bien, verificando paso por paso y luego lo construimos.”

#### CONCLUSIONES:

La verificación es un proceso continuo, interno que se debe realizar en todas las etapas del desarrollo de software. La verificación es el testing estático. 

Sus principales ventajas son:

- Actúa como **control de calidad** en cada etapa del proceso de desarrollo de software.

- Permite que el **equipo de desarrollo produzca productos que se ajustan a los requerimientos y a las necesidades del cliente**.

- **Ahorra tiempo** ya que se **detectan** los **defectos** en las **etapas tempranas** del desarrollo de software.

- **Reduce** o **elimina** los **defectos** que pueden surgir en las etapas más tardías del desarrollo de software.


### VALIDACION

La validación es el **proceso de chequear que se esté desarrollando el producto correcto**. A diferencia de la verificación que va desde los requerimientos hacia el código, la validación se hace en dirección opuesta. Va escalando por las distintas capas de desarrollo y va chequeando que el software desarrollado sea el producto correcto. Es por ello que este proceso lo lleva adelante, en su mayor parte, el equipo de desarrollo, y se realiza cuando el producto ya está listo para ser entregado. La validación es el **testing dinámico**. 

Para que ya vayas teniendo un idea, en el proceso de validación, estas son las actividades más relevantes:

1. Testeo de caja negra (**Black box testing** - **BBT**) (6) - Testeo de sistema completo. Responsables: equipo de QA/testing


(6)  Podemos hacer muchos esfuerzos para que tengas esta información en español, pero la realidad es que el 90% de las veces vas a escuchar que se llama a estos tests por su denominación original en inglés. 


2. Testeo de caja blanca (**White box testing** - **WBT**). Responsables: desarrolladores

3. Testeo unitario (**Unit testing** - **UT**). Responsables: desarrolladores

4. Testeo de integración o integraciones (**Integration testing**). Responsables: desarrolladores

El extraño caso del UAT (**User Acceptance Test**). El UAT es el último test del proceso de verificación (y está a cargo de usuarios reales, beta testers o usuarios designados por el cliente), o puede ser considerado como parte de la Validación ya que es parte del proceso de validación del producto. Hoy en día la línea que divide Verificación de Validación es muy difusa ya que los procesos se han vuelto más dinámicos, respondiendo a cambios mucho más ágiles propios del desarrollo de software ágil. (7)

(7) ¿Quieres leer más sobre este tema? AVISO: está en inglés y es altamente técnico. 


Si en el campo profesional estos dos procesos se superponen, ¿por qué es importante que aprendamos estos conceptos? 
Volviendo al punto de partida inicial: la verificación sirve para saber si estamos construyendo el producto correctamente (de acuerdo a lo pedido) y la validación nos sirve para saber si hemos construido el producto correcto (el que necesita el mercado o el cliente y que va a generar valor).

![image](https://user-images.githubusercontent.com/72580574/214965634-7843b9c2-1dda-45fb-ab1a-29dc81d0d755.png)


### ¿NECESITAS UN EJEMPLO? 

¡Por supuesto que sí! La teoría es útil pero solamente cuando sabemos en dónde utilizarla y para qué. 

**Vamos a dar un paseo por una verificación. Estaremos verificando un automóvil y una aplicación de software al mismo tiempo**. 

1. **Inspección**: se refiere a examinar un producto o sistema sin intervenir en él. Puede ser la simple manipulación física o tomar medidas, por ejemplo.

- Automóvil: inspeccionar visualmente el automóvil para asegurarnos de que cumpla con los requerimientos especificados: levanta cristales eléctrico, asientos ajustables, aire acondicionado, sistema de navegación a bordo, kit de remolque, etc.

- Software: examinar visualmente el software para constatar que existan las pantallas solicitadas, chequear que estén los campos necesarios para el ingreso de datos (nombre de usuario, por ejemplo), verificar que existan todos los botones para las funcionalidades solicitadas, etc.

2. **Demostración**: es la manipulación del producto como se espera que sea usado, para verificar que se comporte como se planificó o de acuerdo a las expectativas.

- Automóvil: poner en uso los comandos de las ventanas y los asientos para verificar que funcionen correctamente, encender el vehículo para corroborar que el aire acondicionado produzca aire frío, dar una vuelta con el automóvil para tener una idea de aceleración y rango de maniobras como fue descrito en los requerimientos.

- Software: ingresar todos los campos en las pantallas y seleccionar los botones que cumplan con lo solicitado, esperando la respuesta específica. Asegurar que los datos devueltos son del tipo requerido.

3. **Prueba**: es la verificación del producto o sistema utilizando una serie de estímulos, datos o ingresos predeterminados para corroborar que el producto produzca un resultado específico y predefinido en los requerimientos.  
	
- Automóvil: acelerar el automóvil de cero a 100 km/h. Verificar que pueda ser realizado en 5.2 segundos. Acelerar en una curva bajo condiciones de control, produciendo 0.8 fuerza G, sin que el vehículo pierda tracción.

- Software: ingresar el tipo y modelo de automóvil, con levanta cristales eléctrico, dirección asistida, y el resto de las opciones definidas en el plan de pruebas, seleccionar el botón de “obtener precio ya” y que la aplicación devuelva el valor preciso de “$43.690”.

4. **Análisis**: es la verificación del producto o sistema utilizando modelos, cálculos y equipos de pruebas especializados. Esta etapa permite que se puedan hacer predicciones sobre el desempeño o performance típicos del producto o software basados en resultados confirmados de las pruebas. También se pueden combinar estos resultados para ofrecer mayor información sobre el producto para poder estimar los rangos límites de performance. 


- Automóvil: completar una serie de aceleraciones a unas revoluciones/m por un tiempo determinado, mientras se monitorea la vibración del motor y su temperatura, verificando que se logran los resultados deseados. Utilizar esta información para predecir el punto de falla del motor. Ej, las rev/m máximas toleradas por un tiempo estimado.

- Software: completar una serie de pruebas en las que un número predeterminado de usuarios ingresan las características del automóvil que están intentando cotizar e inician la función “obtener precio” al mismo tiempo. Se mide el tiempo de respuesta para corroborar que la función devuelve un precio dentro de los límites de tiempo preestablecidos. Se analiza la relación entre el incremento de usuarios en el sistema y el tiempo que le toma a la función devolver el precio. Se documentan los resultados y el tiempo de cada prueba para ver si se degrada la performance a medida que el sistema recibe mayor carga para detectar cuándo es el momento en el que el sistema deja de cumplir con las expectativas definidas en los requerimientos.

---

## ¡MANOS A LA OBRA! ✋

### EJERCICIO OPTATIVO

Es mucho material para absorber y seguro volverás en el futuro a leerlo con mayor entendimiento de su importancia. 

Les proponemos un ejercicio optativo como equipo. Si vienen bien con los tiempos de hoy, si estos temas ya los tienen claros o si prefieren el camino de “probar y luego entender”, este ejercicio es para ustedes. 

En Egg debemos realizar todas estas pruebas, y a medida que nuestra tecnología va adquiriendo complejidad, estas pruebas se realizan para sostener nuevas funcionalidades y nuevos desafíos de cantidad de usuarios. 

¿Se animan a diseñar un plan de pruebas simple para la tecnología de Egg, siguiendo los 4 pasos de verificación que vimos en el ejemplo anterior?


---

## :book: MATERIAL DE LECTURA ⏰ (25min)

### 4. INTRODUCCION A LA DOCUMENTACION DE DEFECTOSs (bugs)

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

- **UX**: **user experience** o **experiencia de usuario** se refiere a la **navegación intuitiva y sensación de claridad que tienen los usuarios al interactuar con soluciones de software**. A pesar de que la UX (User Experience) y la **UI** (**User Interface**) tienen nombres parecidos son completamente diferentes. La UI o **interfaz de usuario** está dirigida hacia el lado más racional de la navegación y la arquitectura de cómo se presentan los elementos.

![image](https://user-images.githubusercontent.com/72580574/214966226-9a5c4a8c-d7cd-4415-b809-3557208874f5.png)


---

## :star: ¡MANOS A LA OBRA! ✋

### EJERCICIO  #2 

Te presentaremos una serie de imágenes. En el encuentro anterior te alcanzamos [este artículo](https://diariobug.com/error-bug-falla/) que creemos que será de gran ayuda para ir consolidando el lenguaje con el que hablamos de los defectos o bugs. 

- A - ¿Puedes documentar los defectos que ves en las imágenes a continuación? Te dejamos [una copia del reporte](https://docs.google.com/document/d/1uu-j02GruDZ-jSQ9dEPOGa2_4jUHmDjpN14ahjWnGiQ/edit?usp=sharing) para que puedas usar. 

*Tickets: en general para dar seguimiento a los bugs se utilizan sistemas como Trello, Atlassian o ClickUp. Si quieres comenzar a investigar estas herramientas, te invitamos a hacerlo ya que es una ventaja competitiva para tí conocerlas en profundidad. Más adelante las estaremos poniendo en práctica con algunos ejercicios.*


- B - ¿Puedes incluir el tipo de error que ves? Si no los recuerdas, son estos que vimos en el encuentro anterior.

-> Ejemplo 1: Trip Advisor

![image](https://user-images.githubusercontent.com/72580574/219875873-6edaad3f-3a66-4dfb-b483-f448eb2e2eb3.png)

Cuando el nombre del lugar ocupa más de un rengló, se superpone con los iconos de valoración y cantidad de reviews.

Se debería poder leer todo claro.

-> Ejemplo 2: Notificaciones

![image](https://user-images.githubusercontent.com/72580574/219875881-c78a0782-1b88-4048-9637-486722bd82fd.png)


Ejemplo 2: Facebook


![image](https://user-images.githubusercontent.com/72580574/214967412-07f74e21-1131-4f1c-ac52-670847b72a32.png)


Ejemplo 3:

![image](https://user-images.githubusercontent.com/72580574/214967449-51dd5da7-22f9-454c-b2e2-2e70f7d3eeea.png)

Ejemplo 4:

![image](https://user-images.githubusercontent.com/72580574/214967451-b8c6f4ac-7920-4f45-9161-0fdc45eb9f7e.png)


---

## :star:  5. COLECCION DE DEFECTOS IN THE WILD ⏰ (15min)

Estuvimos viendo muchos ejemplos. Casi todos recuperados de la vida real, de anécdotas de testers y de nuestras experiencias personales. Es hora de que te sumes y comiences tu propia colección de errores que han atravesado barreras de supervisión y testeo para llegar directamente al usuario final. 


### ¡MANOS A LA OBRA!  ✋

#### EJERCICIO #3 

En nuestro Discord, ve al canal de [WANTED - Errores infraganti](https://discord.com/channels/1042107558485311619/1052702755585794079) y comienza a postear defectos que hayas encontrado en estos días. 
Puedes practicar hacer el reporte en tu mismo posteo y explicar qué tipo de defecto has encontrado, cómo replicarlo y si el productor de ese software tiene algún sistema de recolección de errores, como el WER de Windows que vimos en el encuentro pasado.  

¡Entre tod@s los estudiantes de la comunidad podremos lograr una colección enorme de defectos encontrados in the wild! Y si hoy no tienes ninguno a mano, no te preocupes, puedes volver cuando quieras y dejar tu aporte. 


---

## :star: EJERCITACION DE CASOS ⏰ (40min)

Tenemos una serie de ejercicios que te ayudarán a poner en práctica todos los conceptos aprendidos hasta hoy. 
Puedes hacerlos en forma individual o como equipo. Sabemos que el esfuerzo es grande. 

### EJERCICIO #4 ✋

¡Tip! Ten a mano las guías de los encuentros anteriores ya que estarás usando conceptos que ya hemos visto.

A continuación, podrás ver algunos casos de interacción con sistemas informáticos (software).

- (**A**) - Identifica todas las funcionalidades y selecciona aquellas que consideres críticas para ser analizadas y déjalo asentado en un cuadro como este. Allí verás un ejemplo para ayudarte desde el principio. 

- (**B**) - En equipo, comparen sus análisis y debatan las razones por las que eligieron esas transacciones como críticas. No olviden hacer referencia a las instancias de verificación que se vieron en la sesión de hoy.

---> **CASO 1**. El usuario utiliza su tarjeta de crédito en una empresa de electrodomésticos que posee el servicio de postnet para las compras. Se cargan los datos que validen que quien compra es el dueño de esa tarjeta, y el sistema se conecta con el sistema de la Tarjeta de Crédito MasterCompra para validar que puede venderle a ese cliente y que dispone de margen de crédito para comprar. 

El sistema actúa habilitando la operación para la compra de un producto porque tiene un valor inferior al límite total que la tarjeta. Luego, el sistema guarda los datos de la compra vinculados a los del cliente y almacena los datos en la base de datos e imprime la factura y el ticket de compra a través del mismo postnet. De esta forma lo desarrollado cumple con todas las especificaciones para realizar una compra con una tarjeta de crédito.


---> **CASO 2**. El sistema AsisteMed solicita desarrollar un sistema para agendar citas de pacientes con médicos en una clínica. Sus funciones son: alta, modificación y baja de los médicos con su especialidad; alta y baja de un turno o cita; alta y modificación de los consultorios. 
Cuando los médicos acceden al sistema, al presionar el botón de actualizar horarios de cada uno de ellos, no pueden indicar los días en que los médicos no se encuentran por operaciones, emergencias, viajes, vacaciones u otras situaciones, por lo que no pueden indicar qué citas se deben reprogramar.

---> **CASO 3**. La empresa Aión se dedica a fabricar y recargar de manera mayorista matafuegos o extinguidores. Tu consultora está desarrollando el sistema Kairos que tiene por objetivo manejar el stock de entrada y salida. El stock de entrada es cuando piden recargas de extinguidores y el stock de salida son los productos nuevos que venden a comercios del rubro y a comercios que venden repuestos para autos. La funcionalidad de carga de los datos de entrada: recibe información de un sistema (Lector de datos), que toma la lectura de todos los códigos de barra de cada matafuego/extintor a ser recargado. Esta información es enviada al sistema Kairos para llevar el registro de todos los matafuegos a recargar en la base de datos del sistema.

--->**CASO 4**. El sistema Cronos se está desarrollando para diseñar, confeccionar y vender ropa de jean a medida. Para ello se utiliza un scanner especial para tomar las medidas de una persona y fotos 360 grados para mostrar en pantalla sobre el cuerpo real del usuario cómo quedaría el modelo diseñado o elegido. 

El sistema, hasta el momento permite tomar los datos del cliente y ofrece los diseños de pantalones, bermudas, shorts, camisas, polleras, tops y camperas para que el cliente pueda elegir los productos a confeccionar. El sistema recibe del scanner los datos de las medidas guardándolos en la ficha del cliente. 

Cuando se intenta simular cómo quedaría en la persona con las fotos 360 tomadas por el mismo, el botón de simulación solo muestra las prendas elegidas del catálogo, pero no con las medidas y el escaneo de la persona.

---

## :star: MATERIAL DE LECTURA 📖

Las pruebas son necesarias para reducir el riesgo de detectar errores pero muchas veces no logran anticipar todos los casos posibles de uso. 

Cuanto mejores y más adecuadas sean las pruebas de software, menor será el riesgo de encontrar errores durante la fase de operación o producción, y ya sabemos que no todos los errores son iguales. No es lo mismo un error crítico y urgente que un error trivial que puede esperar. El problema con los errores en producción es que están a la vista de todos.  

La ejecución anticipada de las pruebas reduce el riesgo de que los errores provoquen fallas críticas en el sistema. 

### ¿QUÉ PUEDE CAUSAR UN ERROR Y/O DEFECTO EN UN PROGRAMADE SOFTWARE?


Ya hemos visto errores y defectos. Veamos cuáles son las causas posibles de los errores y defectos en software 

- **1. Error Humano**: Las personas a cargo de un proyecto pueden equivocar alguno de los puntos a resolver. Desde una fecha de entrega incorrecta (“Era para hoy?”), hasta enviar a producción una porción de código que no estaba testeada todavía. Los memes abundan, dando cuenta de cuántas veces se pierden los detalles en la comunicación incompleta de requerimientos o en la falta de procesos de verificación.  


- **2. Condiciones Ambientales**: Existen causas ambientales que tienen impacto directo sobre la tecnología. Algunos ejemplos son la radiación, el magnetismo, campos electromagnéticos, polución, tormentas solares, rayos cósmicos. Y luego algunas fallas en el hardware (los componentes duros de la tecnología) causadas por elementos externos. Algunos ejemplos son: fallos de discos duros debido a fluctuaciones en el suministro de energía eléctrica, temblores, terremotos, inundaciones, y otros elementos de la naturaleza que puedan afectar directamente a la estructura más visible de una computadora. 

- **3. Defectos de fabricación (Defects)**: Estos son desperfectos en un componente que pueden causar que el sistema falle en desempeñar las funciones requeridas, por ejemplo, una sentencia o una definición de datos incorrectos. Failure (Fallo) es una desviación funcional de un componente o sistema respecto de la prestación, servicio o resultado esperados.

4. Errores en el código

Errores al escribir código por parte de un programador que no hayan sido detectados en la fase de pruebas. No son errores de malos entendidos (como en el caso de los errores humanos) sino que son errores de la lógica interna que hacen que el código no pueda ser ejecutado. Por ejemplo, ingresar una edad “negativa” (-18) puede generar que una aplicación no funcione o que un usuario pueda pedir 1 millón de hamburguesas mediante una app de pedidos a domicilio.  

---

## :star: ¡MANOS A LA OBRA! ✋

### EJERCICIO #5

¡Tip antes de empezar! Te recordamos una máxima del testing: “El testing puede probar la presencia de errores, pero no la ausencia de ellos”.
Antes de avanzar con este ejercicio, ¿quieres acceder a las posibles soluciones del ejercicio anterior (#4)? Hazlo [desde aquí](https://docs.google.com/document/d/1-afW7Kw8FjXH_LIZC5zvq6hhM24Aw7ZL50_vJwO_Mu0/edit?usp=sharing). Sabemos que la atención al detalle implicó un gran esfuerzo pero queremos que puedas validar si has podido observar bien al detalle.


En la siguiente tabla, tienes algunos defectos para iniciarte en tu detección de causas. Aquí hemos preparado [una copia de la tabla](https://docs.google.com/document/d/1-tEmRPEC9NGQpf4vibgANVSCQ0eZWbV3GcGHFHXPn9w/edit?usp=sharing) para que puedas trabajar directamente en ella. 


![image](https://user-images.githubusercontent.com/72580574/214968322-7c664e5c-6624-463a-a40f-2ffd9a2ef24a.png)


![image](https://user-images.githubusercontent.com/72580574/214968342-21cc4858-0a50-406e-8892-653960162398.png)


![image](https://user-images.githubusercontent.com/72580574/214968361-349d0811-f544-4d7f-ae9d-e99674678fd1.png)


![image](https://user-images.githubusercontent.com/72580574/214968389-66a2f83c-a0a9-488d-99a3-c8203d8ddf50.png)


![image](https://user-images.githubusercontent.com/72580574/214968425-2c085bda-eb3a-4a46-8808-e117af55ca80.png)


![image](https://user-images.githubusercontent.com/72580574/214968449-5a134e1a-4c4c-4d9b-8905-b440f096cb0f.png)


![image](https://user-images.githubusercontent.com/72580574/214968475-a3bffccb-7cfa-43b6-b8c4-2be38897162f.png)


---

## :star: ¡HORA DE CERRAR! 

**¡Lo hemos logrado! Has llegado al final del quinto encuentro**.

Tómense 5 minutos como equipo para conversar sobre la dificultad de priorizar: ¿qué es urgente? ¿Qué es crítico pero no urgente?
Este tipo de discusiones ocurren en todas las organizaciones y es una gran deuda de los equipos cuando no cuentan con esta habilidad para diferenciar entre lo que es crítico y urgente y lo que es urgente y no crítico.

Poder ejecutar este análisis te ayuda a desarrollar el juicio crítico, habilidad altamente solicitada en el mercado laboral. 

¡Gran momento para recordar y agradecer a nuestro equipo de hoy! En el próximo encuentro estaremos poniendo a prueba lo aprendido hasta hoy. Si tienes tiempo de sobra, es hora de recorrer el material de estos primeros 5 encuentros. También te sugerimos hacer preguntas en tu equipo y en el foro de Discord sobre este encuentro. Tus preguntas o tus respuestas son de gran ayuda para el aprendizaje de la comunidad. 


---

