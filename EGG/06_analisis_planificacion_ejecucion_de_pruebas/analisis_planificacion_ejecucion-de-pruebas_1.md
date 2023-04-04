# :star: Análisis, planificación y ejecución de pruebas I

---

## :star: Introducción

**¡Te damos la bienvenida a tu séptimo encuentro de trabajo!**

Damos inicio a un nuevo módulo en el que profundizaremos en la ejecución de las pruebas. El encuentro anterior estuvo cargado de mucha práctica… ¡Felicitaciones a todos por el esfuerzo!
Bien llegó la hora de iniciar la sesión. ¡A conocerse!…. ya lo saben, nombre, lugar de procedencia y… aquí tienen una pregunta para facilitar la socialización 

¿Cómo fue que decidieron elegir esta carrera? ¿Qué los convocó? 


---

## :book: MATERIAL DE LECTURA 

### :star: Estrategia y análisis

¿Recuerdan que mencionamos los enfoques “estáticos y dinámicos”? Pues bien, retomaremos este tema y profundizaremos en tres grupos de actividades asociadas: 

- Análisis

- Planificación de pruebas

- Ejecución de pruebas

### Análisis de requerimientos o insumos

Ya mencionamos en reiteradas ocasiones que la base para diseñar las pruebas es el insumo que tengamos a disposición. Este,  puede llegarnos en formato requerimientos, especificaciones, casos de uso, historias de usuario, diagramas de flujo o inclusive una combinación de estos elementos o ninguno. 

El tipo y calidad del insumo que tengamos dependerá del nivel de organización y recursos de nuestro equipo de trabajo.
En este punto, podemos poner en práctica lo visto en “proceso de revisión y técnicas” ya que el análisis de requerimientos consiste básicamente en revisar el insumo que tenemos para luego diseñar nuestro plan de pruebas y reportar cualquier defecto encontrado en la documentación.

Estos son los pasos para realizar un análisis detallado:

1. Revisar el insumo a disposición.

2. Determinar si se entiende la necesidad se quiere cubrir y cómo se la quiere cubrir a partir del insumo.

3. Tratamos de pensar por fuera del documento. ¿Falta algo? ¿Algo nos genera duda? En este punto conviene  revisar alguna funcionalidad, producto o información ya existente que nos ayude a analizar críticamente el documento en busca de errores u omisiones. 

#### ¿NECESITAS UN EJEMPLO? 

Si el documento que revisamos describe cambios para una funcionalidad ya existente, podemos revisar en paralelo esa funcionalidad para verificar que los cambios descritos se apliquen.

4. Registramos las preguntas que nos hicimos para consultar a quien corresponda.

Una vez que entendimos la necesidad que se desea cubrir, los objetivos, el scope (o alcance del proyecto) que finalizamos el análisis de la documentación, hicimos todas las preguntas y obtuvimos respuestas, podemos comenzar con el proceso de diseño de las pruebas que llevaremos a cabo.

---

-> **TIP** 😉 : **¡Siempre se debe tener en cuenta los atributos de la calidad!** ¿Recuerdas que los estudiamos en el módulo 1? Nos referimos a las ISOS 9126 y 2500. Al revisarlos seguramente surgirán inquietudes para resolver.

---

#### ¿NECESITAS UN EJEMPLO? 

Podríamos necesitar información sobre:

- Si el producto debe cumplir con algún estándar de accesibilidad o de seguridad. 

- Si debe tener requisitos mínimos de performance y eficiencia. 

- Qué sucede con la interoperabilidad, si el sistema debe poder comunicarse con otro.

- Qué sucede con la portabilidad (en qué sistemas operativos y/o en qué exploradores debería funcionar)

Las respuestas a esas preguntas nos darían la pauta sobre la necesidad de incluir pruebas para evaluar esos aspectos o si debemos incluir el uso de alguna herramienta que nos permita evaluarlos. Incluso nos indica si debemos solicitar ayuda de algún otro equipo.

A continuación les ofrecemos preguntas disparadoras sobre algunos temas para abordar la etapa de análisis. No es un cuestionario obligatorio,  pero puede ayudarnos a ejercitar la mirada crítica a la hora de leer y comprender la documentación.

Sugerimos que en este punto puedes poner en práctica técnicas de “diseño de caso de prueba” tales como las tablas de decisión para identificar fácilmente si en la documentación falta describir alguna condición o resultado esperado.


### 1 - Respecto de los “Roles y permisos”

¿Cualquier usuario podría usar el sistema y todas sus funcionalidades? ¿Hay algún tipo de usuario que pueda / no pueda completar algún tipo de acción específica?


### 2 - Respecto de las “Condiciones”

¿Se debe cumplir alguna condición para llevar a cabo esta acción?

Por ejemplo: Para ingresar al sistema por primera vez, ¿debo tener un usuario creado? ¿Quién puede crear ese usuario? ¿Yo mismo? ¿Alguien con el rol de administrador?

¿O quizás no? ¿El sistema crea un usuario para mí automáticamente la primera vez que ingreso?
¿El sistema no requiere la existencia de un usuario para interactuar con él?

### 3 - Respecto de los “Inputs válidos/inválidos”

¿Existen para esta funcionalidad grupos de acciones o inputs válidos e inválidos?

En aquellos formularios en los que se puede ingresar datos, ¿los campos son son para texto libre? ¿o tipos de campos en los cuales se espera que ingrese cierto tipo de información? Ej, sólo números, sólo números con formato telefónico de estados unidos, solo números con formato de documento de identidad, sólo emails.


---

-> **Secreto de la industria 1**: Aún en los campos de texto libre seguramente no se pueda ingresar cualquier tipo de texto libre. Por cuestiones de seguridad, el ingreso de scripts o código ejecutable no esté permitido. 

---

### 4 - Respecto de “Outputs o comportamientos esperados”

¿Tengo en claro cuál es el comportamiento esperado para cada funcionalidad y combinación de inputs?


---

-> **¡¡¡Pro tip alert!!!** 😨 No den por sentado que la documentación o insumo recibido está libre de errores. 

---

## Diseño de plan de pruebas

Con el análisis del insumo reflexionamos y delineamos escenarios.

Esos escenarios de prueba son descripciones de alto nivel de aquello que tenemos que probar.


---

-> **¡Disclaimer!** El diseño del plan de prueba entra dentro de la planificación. Pero en la planificación de las pruebas podrían entrar más actividades > las actividades necesarias para completar un plan de pruebas más elaborado con toda o alguna de la información sobre estimación, plazos, estrategia, análisis de riesgo. etc.
De alguna forma, podemos decir que la planificación incluye al diseño del plan. La planificación de la prueba implica actividades que definen los objetivos de la prueba y el enfoque para cumplir los objetivos de prueba dentro de las limitaciones impuestas por el contexto. Los planes de prueba pueden revisarse en función de los comentarios de las actividades de monitorización y control.

---

Cada escenario se complejiza a partir de la descripción en detalle hasta lograr lo que se denomina como “Casos de prueba".

![image](https://user-images.githubusercontent.com/72580574/229868862-b3f66d27-aef6-46bf-9584-6ef6d047199f.png)

Al analizar los requerimientos se podría delinear los siguientes escenarios:

- Probar inicio de sesión válido.

- Probar intento de inicio de sesión con email no registrado.

- Probar intento de inicio de sesión con contraseña incorrecta.


Estas descripciones generales son escenarios de prueba que me permiten tomar nota y recordar funcionalidades que deseo probar. De cada escenario de prueba es probable que surjan una cantidad de casos de prueba.

**Cada caso de prueba debe ser preciso, apuntar a una finalidad particular y ser lo suficientemente claro para que otra persona lo pueda ejecutar aún sin conocer el sistema.**

Un plan de pruebas puede incluir simplemente una matriz de casos de pruebas -es decir, las pruebas ordenadas- o un documento más complejo y elaborado que incluya otro tipo de información tal como:

- Descripción

- ID del plan

- Organización

- Autoridad de aprobación

- Historial de cambios

- Introducción

- Alcance

- Referencias

- Glosario

- Contexto de pruebas

- Análisis de riesgos

- Estrategia de pruebas

- Actividades de testing y estimaciones

- Equipo

- Agenda de trabajo

 ---
 
 ## Matriz de casos de prueba
 
Como ya mencionamos, es útil organizar los casos de prueba dentro de una matriz. Pero, ¿qué es una matriz? Es una tabla compuesta por filas y columnas. Las filas presentan un caso de prueba y las columnas la información que debe ser completada por cada caso.

##### ¿NECESITAS UN EJEMPLO? 

![image](https://user-images.githubusercontent.com/72580574/229869306-f7639ae4-5efe-452f-9a51-0cf844a897a4.png)

![image](https://user-images.githubusercontent.com/72580574/229869350-d4ca851f-f74f-4f2f-881e-3b3f6e4307c6.png)


---

-> **Secreto de la industria 1**: No todos los grupos de trabajo usan matrices de casos de prueba, o bien porque no llevan un orden o bien porque utilizan algún sistema de creación de casos de prueba que genera la misma trazabilidad que generaría la matriz.


---

Hay diversas herramientas en el mercado que permiten organizar los casos de pruebas en matices. Algunas son pagas, otras gratuitas. Las hay gratuitas hasta cierto cantidad de usuarios


#### ¿NECESITAS UN EJEMPLO? 

Está es una visualización de la herramienta Zephyr en su versión Scale:

![image](https://user-images.githubusercontent.com/72580574/229869567-4cd0ad2c-759b-4cd1-9b36-7e09737678b3.png)


Zephyr ofrece tres versiones que son gratuitas hasta cierto número de usuarios y se integra fácilmente a jira, una herramienta de gestión de desarrollo, ampliamente usada en el mundo del desarrollo de software.

En la vista de arriba, los casos de prueba están agrupados por módulo del sistema bajo prueba.

El identificador de trazabilidad se genera de manera automática para cada prueba y las etiquetas de estado pueden ser creadas con texto libre por el administrador de la herramienta.

En el ejemplo de arriba la etiqueta “TBC BY PO/FA” significa to “be confirmed by product owner or functional analyst” y se utiliza para marcar los casos de prueba que fueron creados pero que tiene algún detalle a confirmar por el analista del producto.


### ¿NECESITAS UN EJEMPLO? 

En la imagen de abajo se ve el detalle de un caso de prueba en particular.

Aunque la información está ordenada de un modo distinto al que vimos en la matriz de trazabilidad clásica (formato de tabla) la información que se captura es más o menos la misma:

![image](https://user-images.githubusercontent.com/72580574/229869786-c8bd4750-a26b-4e15-a9e0-58b50fa2dfb8.png)


![image](https://user-images.githubusercontent.com/72580574/229869860-5ccab029-e1a5-491c-9687-70d38eef488e.png)


![image](https://user-images.githubusercontent.com/72580574/229869888-381b37aa-0cdd-49f6-9ce6-01feb20443a8.png)


![image](https://user-images.githubusercontent.com/72580574/229869951-5dcb98de-a7b0-4b6f-8d25-1e3e670ebb94.png)


El uso de herramientas para la gestión de las pruebas puede agregar un componente de trazabilidad algo más potente que una planilla de cálculos, ya que el plan de pruebas de un componente o funcionalidad específico puede quedar directamente asociada a la historia de desarrollo creada en la herramienta.


#### ¿NECESITAS UN EJEMPLO? 

Aquí se muestra un ejemplo de cómo es posible visualizar un grupo de pruebas para un componente específico en una historia de usuario dentro de Jira:

![image](https://user-images.githubusercontent.com/72580574/229870066-2c0e9e5f-6436-4f17-9fa4-5b22b571e137.png)


---

## ✋ ¡MANOS A LA OBRA! 

Es hora consolidar, repasar y revisar los conceptos vistos hasta el momento.

¿Recuerdas a qué llamamos “caso de prueba”?

Retomemos la definición:

*Un test case o caso de prueba es una serie de precondiciones (en caso de ser necesarias) valores (o datos de entrada) acciones (o pasos a ejecutar) y descripción de un resultado esperado que se utiliza para probar que una condición o funcionalidad específica se comporte de la manera deseado.*

A continuación indicamos los pasos necesarios para generar pruebas para una condición específica:

- Identificar la condición o funcionalidad que se va a probar.

- Diseñar el o los casos de prueba que van a verificar esa condición o funcionalidad.

- Diseñar el procedimiento de ejecución de las pruebas.
 
### ¿NECESITAS UN EJEMPLO? 

Con todo lo dicho, esto sería un flujo de trabajo:


![image](https://user-images.githubusercontent.com/72580574/229870480-b9b2472e-44b2-4e1e-864b-7064ec8f04a8.png)

Anteriormente sugerimos algunos ejemplos de matriz de casos de prueba y vimos que la información a completar puede variar dependiendo de la organización del equipo, su orden y el nivel de trazabilidad que requieran.


#### Es fundamental que cada caso de prueba contenga:

- Título descriptivo del caso de prueba  

- Funcionalidad específica a cubrir y contexto

- Datos de entrada

- Resultado esperado

---

-> **TIP** 😉: Podría pasar que en momentos de tiempos ajustados quizás no llegaras a escribir el “paso a paso” detallado para cada caso de prueba.  De ser así, ten en mente incluir al menos la información fundamental con una descripción clara y concreta. Para que cualquier persona que no conozca el sistema que se va a probar entienda cómo ejecutar el caso de prueba.


---

## ✋ Ejercicio #1

Del siguiente listado de casos de pruebas, identifica aquellas que están descritas correctamente.

- Probar inicio de sesión

- Iniciar sesión en Gmail.com/login con $usuario (rol administrador) y $contraseña válidos. Se llega a bandeja de entrada con mensaje: “Bienvenido $usuario”

- Contraseña incorrecta

- Intentar iniciar sesión desde Firefox con un usuario no registrado. Se muestra mensaje: usuario inexistente 

- Probar exportar reporte 

- Exportar reporte Excel desde Brave browser en Administración > ventas con usuario con permiso “export:reporte Ventas”

- Intentar ingresar con un usuario registrado y un password válido luego de tres intentos de ingreso fallidos. La cuenta se bloquea y el usuario no puede ingresar. Se muestra el mensaje: usuario bloqueado

#### SOLCUION


-> Probar inicio de sesión **Rta: No es un caso de prueba**

-> Iniciar sesión en Gmail.com/login con $usuario (rol administrador) y $contraseña válidos. Se llega a bandeja de entrada con mensaje: “Bienvenido usuario” **Rta:si. Descripción correcta**

-> Contraseña incorrecta **Rta: No es un caso de prueba**

-> Intentar iniciar sesión desde Firefox con un usuario no registrado. Se muestra mensaje: usuario inexistente **Rta: si**

-> Probar exportar reporte **Rta: No**

-> Exportar reporte Excel desde Brave browser en Administración > ventas con usuario con permiso “export:reporte Ventas” **Rta: si**

-> Intentar ingresar con un usuario registrado y un password válido luego de tres intentos de ingreso fallidos. La cuenta se bloquea y el usuario no puede ingresar. Se muestra el mensaje: usuario bloqueado **Rta: si**

---
