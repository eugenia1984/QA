# :star: ENCUENTRO 4 / 20 - Clasificación de pruebas

---

## :star: Introducción

## ⏰ 10 minutos

**¡Te damos la bienvenida a tu cuarto encuentro de trabajo!**

Seguramente conoces la dinámica de trabajo, es aquella que te permite presentarte y conocer gente increíble. Juntos construyen una gran red de profesionales dispuestos a colaborar.

Al finalizar, brinda tus pulsos a quien haya colaborado con tu aprendizaje individual y grupal. También puedes recibir tus pulsos guiando y acompañando a tus compañeros de equipo.  ¡Adelante!

**¡Demos comienzo a la actividad del día de hoy!**

## Presentación del equipo:

Toma tan solo unos minutos y cambia la experiencia de todo el equipo. Indica tu nombre y de dónde vienes. Les dejamos una pregunta para abrir la sesión:

## ¿Por qué el área de QA está creciendo velozmente? 

Utilicen unos 10 minutos para compartir estas breves presentaciones. 
¿Opinan todos de la misma manera?


---

## :book: MATERIAL DE LECTURA

## :star: Nivel de pruebas

Las pruebas se clasifican en niveles de acuerdo a la complejidad o al  desarrollo o que se desean cubrir. Implementar pruebas - desde niveles básicos (componentes pequeños en el código) hasta los niveles altos 
(implementación de un sistema) tiene por objeto prevenir el arrastre de los defectos.

Los niveles típicos son:

- Pruebas unitarias o de componentes (unit testing / component testing)

- Pruebas de integración (integration testing)

- Pruebas de sistema (system testing)

- Pruebas de aceptación (acceptance testing)

Veamos cada uno en profundidad.

1. :star: **Pruebas unitarias o de componentes (unit testing / component testing)**

Este tipo de pruebas suelen ser creadas por los desarrolladores en paralelo con el desarrollo del código para la funcionalidad en la que se esté trabajando en ese momento.
Las pruebas unitarias tienen como objetivo verificar que un componente o unidad específica dentro del código, funcione de manera correcta. 

El componente bajo test puede ser tanto funcional como no funcional.
 
Una prueba unitaria podría crearse para validar que cierto método específico en el código devuelve un valor “X”. 

Los insumo para las pruebas unitarias son: 
-el detalle del diseño
-las especificaciones del componente bajo prueba (en caso de que existan)
-el mismo código escrito. 

En general este tipo de pruebas se automatizan y conforman luego,  las pruebas de regresión. 

2. :star: **Pruebas de integración (integration testing^^

Este tipo de pruebas son creadas por los desarrolladores con foco en probar las interfaces y la interacción e integración entre los distintos componentes del sistema. 

Las pruebas de integración se podrían clasificar en:

- Pruebas de integración de componentes (component integration testing): son aquellas pruebas de interacciones e interfaces entre componentes integrados.

- Pruebas de integración de sistema (system integration testing): son aquellas pruebas de interacciones e interfaces entre sistemas, paquetes, microservicios y con sistemas externos.
 
En este nivel los objetos de prueba podrían ser: subsistemas, bases de datos, infraestructura, interfaces, APIs (application program interfaces) y microservicios. 

Estas pruebas también se automatizan y se agregan a las pruebas de regresión.

3. :star: **Pruebas de sistema (system testing)**

Este tipo de pruebas consideran la funcionalidad o sistema bajo análisis desde una perspectiva E2E (end to end). Se enfocan en el comportamiento del sistema o producto en su totalidad, tal como fue descrito en la documentación (base para el diseño de pruebas) 

Estas pruebas no son llevadas a cabo por los desarrolladores ni se basan en cómo está escrito el código. Este tipo de pruebas se planifican y ejecutan por el equipo de testing. 

Las pruebas de sistema incluyen pruebas funcionales y no funcionales

Objetivos de las pruebas de sistema:

- Verificar que el sistema creado cumpla con los requerimientos funcionales y no funcionales que fueron especificados para su construcción. 

- Validar que el sistema esté completo y que funcione de la manera esperada.

- Encontrar defectos y reducir riesgo de fallos del sistema en producción.

- Poner de manifiesto el nivel de calidad del sistema.

---


##  Ejercicio #1

¿Recuerdan cuáles son los aspectos no funcionales que pueden formar parte de los requerimientos de un sistema?

Puedes revisar el modelo anterior para recordar la respuesta


---

4. :star: **Pruebas de aceptación (acceptance testing)**

El objetivo es probar que el sistema funciona acorde a lo solicitado por el usuario final tanto  a nivel funcional como operacional.

Las pruebas de aceptación se pueden clasificar en:

- **Pruebas de aceptación del usuario (UAT – user acceptance testing)**:  
En estas, se solicita al usuario final (o un representante del grupo de usuarios finales) que pruebe el sistema y de el visto bueno final  confirmando que el sistema cumple con lo esperado.

- **Pruebas de aceptación operacional**: Aquí, se prueban los procesos y procedimientos para que el sistema pueda ser usado y operable. Esto podría incluir pruebas de: performance, de seguridad o pentesting, back up, actualizaciones, tareas de carga de datos y migraciones, procedimientos de mantenimiento, procedimientos de recuperación.

- **Pruebas de aceptación contractuales**: Cuando el criterio de aceptación está documentado en un contrato, las pruebas se llevan a cabo para confirmar que lo descrito haya sido diseñado e implementado correctamente 

- **Pruebas de aceptación regulatorias**: Cuando el sistema creado -por su naturaleza- se encuentra bajo regulaciones o estándares  gubernamentales, legales o de seguridad, las pruebas deben ser auditadas por los grupos regulatorios correspondientes. 

- **Pruebas en Alpha (Alpha testing)**: El sistema se prueba en su versión Alpha. Desde la experiencia del desarrollador

- **Pruebas en beta (Beta testing)**: El sistema se prueba desde la experiencia del cliente antes de que la  versión estable.

El testing en Alpha y en Beta se usa (sobre todo) para recibir feedback antes del “go live” () final 

El objetivo final de las pruebas de aceptación no solo encontrar defectos, si no hacer un chequeo final y comprobar que el sistema se ajusta a las necesidades del negocio y a los requerimientos comunicados. 


---

:computer: -> **Secreto de la industria 1**: Probablemente  el trabajo de análisis, planificación y ejecución de pruebas (anterior a la etapa de las pruebas de aceptación) ofrecería un sistema libre de bugs y ajustado a lo solicitado. Sin embargo, si se encuentran defectos, deben reportarse, pero en general las pruebas de aceptación son responsabilidad del cliente. 

---

## :star: Tipos de prueba

A continuación presentamos dos tipos de pruebas 

- Funcionales

- No funcionales

:star: **A - PRUEBAS FUNCIONALES**

Las pruebas funcionales se llevan a cabo en todos los niveles de testing desde las pruebas unitarias (unit testing) hasta el nivel de las pruebas de aceptación. 

Diseñar pruebas de este tipo generalmente requiere dominio del problema, conocimiento del negocio y del ámbito en el que se insertará el sistema a desarrollar.

#### ¿NECESITAS UN EJEMPLO?

![image](https://user-images.githubusercontent.com/72580574/228983429-3344d9f5-4ad0-4c18-89d9-a863da0678aa.png)


#### Entrada en calor

- ¿Ambos sistemas deberían hacer lo mismo?

- A simple vista, ¿qué funcionalidades debería tener cada sistema?

- Las funcionalidades de ambos sistemas ¿deberían tener un flujo idéntico

---

:computer: -> **Secreto de la industria 2**: Generalmente encontrarás documentación funcional, historias de usuario, requerimientos y algún documento o insumo que serán las bases para la planificación de nuestras pruebas. Sin embargo, la función del tester consiste en analizar todos estos insumos de manera critica para encontrar sus posibles contradicciones, ambigüedades, omisiones y errores de diversa naturaleza. 



---

Entonces: ¿Cómo podría llevar a cabo esta tarea de análisis si no conozco la ley impositiva de Argentina y la ley impositiva de Panamá? ¿Y si desconozco los flujos de facturación de cada país?

![image](https://user-images.githubusercontent.com/72580574/228983560-35903ad9-d5e7-412e-83ba-751aedab57d2.png)


![image](https://user-images.githubusercontent.com/72580574/228983583-be46376c-50c3-4f88-aa7a-6d97849038e9.png)


---

## Ejercicio #2

¿Qué experiencia sería de utilidad para el testing de los siguientes sistemas…?

- Aplicación de escritorio de una wallet fría

- Aplicación de escritorio para el diseño de patrones de tejido

- Aplicación móvil de seguimiento de paquetes

- Aplicación móvil de metrónomo y afinador

Justifiquen su respuesta y redacten los aportes que podría ofrecer la experiencia mencionada.

#### SOLUCION


![image](https://user-images.githubusercontent.com/72580574/228983727-4d537731-2806-4788-a00d-c708b3b75a4c.png)


:star: **B - PRUEBAS NO FUNCIONALES**

Estas pruebas se enfocan en los aspectos no funcionales del comportamiento del sistema tales como:  performance, accesibilidad, usabilidad, seguridad.

Al igual que las pruebas funcionales se llevan a cabo en todos los niveles, aunque a diferencia de las pruebas funcionales, el desarrollo y ejecución de las NO  funcionales requiere algún nivel de conocimiento técnico.

#### ¿NECESITAS UN EJEMPLO? 

- El conocimiento técnico sobre posibles vulnerabilidades que podrían afectar a un sistema

- El conocimiento técnico para evaluar y medir la performance del sistema, su accesibilidad o usabilidad. 

En general, los resultados de las pruebas no funcionales suelen ser medibles y  cuantificables.

Estas pruebas son las que verifican los requerimientos NO funcionales:
Repasemos algunos de ellos:

- Instalabilidad

- Mantenibilidad (y la capacidad del sistema de recibir cambios)

- Performance, tiempos de respuesta

- Manejo de carga (respuesta del sistema cuando la carga aumenta)

- Manejo de stress (comportamiento cuando se alcanzan los limites más altos de capacidad)

- Portabilidad (comportamiento en diferentes sistemas operativos)

- Recuperabilidad (procedimiento de recuperación ante fallos)

- Fiabilidad (habilidad de realizar las funciones esperadas a lo largo del tiempo)

- Usabilidad (facilidad de uso e interacción)

Existen distintas herramientas para realizar las pruebas no funcionales. Algunas de estas son: 

![image](https://user-images.githubusercontent.com/72580574/228983882-79dbf7ea-1b7b-4a47-9485-d9ef9504a17a.png)


---

### Para los más curiosos…

Algunas empresas deben cumplir con ciertos niveles de accesibilidad por diversos motivos. 

Si queres conocer mas sobre normas y guías de accesibilidad a los contenidos web, puedes encontrar información en los siguientes links:

[https://www.w3.org/WAI/WCAG2AAA-Conformance ](https://www.w3.org/WAI/WCAG2AAA-Conformance )

[https://userway.org/blog/what-are-wcag-2-0-a-aa-and-aaa/](https://userway.org/blog/what-are-wcag-2-0-a-aa-and-aaa/) 

Ten en cuenta los siguientes tips de diseño para tener en cuenta las condiciones de accesibilidad.

---

## :star: Pruebas de caja blanca  - (WBT – White-Box Testing / structural testing)


El testing de “caja blanca”, también conocido como pruebas estructurales,  refiere al hecho de que testeamos sabiendo cómo está construido el código: conocemos la estructura del código. 
Este tipo de pruebas se enfocan en la estructura interna del sistema, su código, arquitectura y los flujos de datos del sistema. 
Las pruebas de caja blanca se llevan a cabo en el nivel de las pruebas unitarias y de integración,niveles en los cuales se desarrollan las pruebas. 

Esto significa que su creación requiere conocimientos técnicos tales como capacidad de interpretación y redacción de código, conocimiento sobre bases de datos y herramientas de desarrollo.


---

##  Ejercicio #3

Anteriormente señalamos que las pruebas funcionales son conocidas como “black box testing”. Conociendo la definición de White box testing, ¿qué creen que significa black box testing? ¿Por qué se lo denomina así? 


#### SOLUCION

Llamamos pruebas funcionales de caja negra porque son pruebas que se enfocan en el comportamiento o respuesta del sistema a varios escenarios o estímulos, independientemente de la estructura del código. 

 Ya sea que conozcamos la arquitectura interna del sistema bajo análisis funcional o no, nos encargamos de probar los posibles escenarios y condiciones del sistema. Además, revisamos que en cada prueba el sistema responda de la manera esperada. En caso contrario reportamos, falla, bug, o el gap de definición en caso de no haberlo hecho anteriormente.



---


## :star: Test relacionado a cambios

Los defectos pueden aparecer en cualquier nivel del testing y al corregirlos, la calidad del sistema mejora. 

Al corregir un defecto, hay que testear la modificación aplicada al software para confirmar que efectivamente funciona de la manera esperada. En caso de que esto no sea así, es necesario reportar.
Además de testear que el bug reportado se corrigió, es necesario asegurarse que esa corrección no haya roto ninguna parte del sistema.
Y para esto existen las pruebas de regresión (regression testing). Dependiendo del tipo de sistema es probable que las pruebas de regresión sean automatizadas. 


### ¿NECESITAS UN EJEMPLO? 

Si se trata de un sistema que se desarrolla con metodología ágil sin fecha de finalización, la decisión sobre automatizar o no (cuánto y qué) dependerá de los recursos, el tipo de proyecto,  las ventajas y desventajas de invertir el tiempo para  crear el framework necesario para la automatización y los scripts para las pruebas automatizadas. 

Cuando los tests de regresión no están automatizados hay que ejecutarlos de manera manual.

![image](https://user-images.githubusercontent.com/72580574/228984204-136123ca-a136-451e-92ac-ad826b5c3605.png)
