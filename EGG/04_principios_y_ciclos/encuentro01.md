# ENCUENTRO 1 / 20

---

## :star: Principios y ciclo de vida del testing :star:

---

## :star: Introducción + icebreaker :star:

**¡Te damos la bienvenida a nuestras guías de trabajo!**

En cada encuentro, tendrás una guía como esta que te acompañará durante tu avance en el aprendizaje de los temas.

En los primeros encuentros, verás que nuestras guías te indican cómo usar el tiempo de estudio, te ofrecen ideas sobre cómo interactuar en las salas de grupos pequeños (breakout rooms) y cómo solicitar ayuda a otros estudiantes.

A medida que avances en el recorrido, ya no tendremos tanto para indicarte y tendrás suficiente autonomía para tomar decisiones acerca de tu propia administración del tiempo en relación al curso.

## ⏰ 10 minutos

**¡Demos comienzo a la actividad del día de hoy!**

 Presentación del equipo:
 
Si no lo han hecho todavía o eres de las personas que prefiere que otro comience, te sugerimos que indiques tu nombre y lugar de dónde vienes. Lo puedes hacer en el chat o usando tu micrófono. Hoy compartes el encuentro con una pequeña porción de personas integrantes de una gran comunidad que irás conociendo poco a poco.

Luego de haber cursado el módulo anterior ya tendrás una idea sobre algunas de las palabras claves de esta carrera. Les proponemos que redacten una definición para cada uno de los siguientes conceptos:

A) Calidad

B ) Testing

- Recuerden sumar todos los aportes individuales.

- Cuando finalicen, compartan las definiciones de ambos términos en el chat dentro de la breakout room.

Utilicen unos 10 minutos para intercambiar y leer las definiciones del resto del equipo. ¡Anímense! 

---

## ⏰ 10 minutos

**Fundamentos de la calidad de software**

Según lo analizado en el módulo anterior y en la actividad realizada hace unos minutos es posible deducir que la calidad está íntimamente ligada al proceso de testing. Veamos definiciones:

Calidad es el grado en el cual un componente, sistema o proceso cumple con los requerimientos especificados y/o con las necesidades y expectativas del usuario o cliente. Accedé a la fuente de información [aqui](https://glossary.istqb.org/en/term/quality-2)

Visitá la siguiente página haciendo [click en el enlac](https://softwaretestingfundamentals.com/software-quality/) para leer otras definiciones y profundizar al respecto. Tip: ¡Podés añadir esta web a tus favoritos y visitarla periódicamente!

A continuación, te invitamos a ver el siguiente video sobre los fundamentos de la calidad del software. Pueden hacerlo todos juntos o de manera individual.

**TIP**: Tomen nota y registren los **key concepts**. ¿Tienes dudas? Velas con tu equipo

:tv: [Ver video “Los fundamentos de la calidad del software”](https://youtu.be/sMsMDlPlKkc)

Repasamos nuevamente estas imágenes que aparecen en el video. Nos referimos a la historieta y al meme.

¿Entienden su significado? ¿Cómo se relacionan con el testing y la calidad?

![image](https://user-images.githubusercontent.com/72580574/228070833-d976c5ba-0ceb-4e52-835c-b3ddc68a81d5.png)


Fuentes: [https://dev.to/codemouse92/turning-bugs-into-features-48gl](https://dev.to/codemouse92/turning-bugs-into-features-48gl)

---

## ⏰ 15 minutos

✋ **¡MANOS A LA OBRA!**

### Entrada en calor: Ejercicio #1

¡Vayamos entrando en calor! Piensen en productos que hayan comprado y no se hayan ajustado a la descripción o que no ofreciera las funcionalidades que debieran tener.

Recuerden compras online, electrodomésticos, viajes, ropa, alimentos, bebidas, hardware,  equipamiento tecnológicos, etc. ¿Listo?
¿Cómo manejaron esa situación?

## :book: Rol de QA y Rol del desarrollador: ¿todo junto o separado?

Aquí te proponemos tres razones que fundamentan la existencia de roles diferenciados:

1. En procesos de creación (como el desarrollo de software) suele ser difícil tomar distancia crítica sobre el producto creado.

Se torna complejo -para el creador (es decir, el desarrollador)- encontrar sus propias fallas. Por esa razón es más efectivo la diferenciación de roles, siendo los especialistas en QA quienes testean y prueban el producto creado.

2. El programador/desarrollador no puede simular el lugar de usuario final y probar todos los escenarios y combinaciones de uso posibles para su desarrollo. En primer lugar porque no es su función primordial, en segundo porque de ser así le insumiría mucho tiempo que podría destinar a desarrollar mejoras en las funcionalidades del producto.

3. El tester QA desarrolla una estrategia para testear el producto y luego lleva a cabo todas las pruebas posibles.

Propone una cuarta razón para comentar con tu equipo y no olvides compartirla en el chat del encuentro en vivo.

---

## ⏰ 10 minutos

### Entrada en calor: Ejercicio #2: Simulación de un “plan de pruebas”

- Objetivo: Testear Gmail (bandeja de correo de Google)

- ¿Cómo? mediante escenarios de prueba

- ¿De qué manera? Ordenando los escenarios por prioridad 

A continuación deberás diseñar escenarios que podrían simular un “plan de pruebas”. Hazlo de forma individual y escribe tantos como consideres

¿Cuál de ellos probarían primero? Aplicando este criterio ya estás listo para comenzar..

Puedes utilizar la siguiente [plantilla]([)](https://docs.google.com/document/d/1Q_7DiWWWjl29CSNf_SxfWI8vt3NQxIAHFUIuTNWCDw8/edit?usp=sharing)

![image](https://user-images.githubusercontent.com/72580574/228071445-0b1716d5-45c0-46ff-92f8-f84baa7f586e.png)


Al finalizar, vas a utilizar una metodología de evaluación para descubrir si tu plan de pruebas es correcto. Esta metodología se denomina” peer to peer” y seguramente la utilices en tu futuro laboral. Hacé una búsqueda online para investigar de qué se trata… ¿Listo? ¡Comencemos!

- **Paso 1**: Revisar al menos 2 (dos) planes de pruebas de un compañero de tu equipo. Utiliza la siguiente guía de evaluación para dejar tu huella en el plan de pruebas que recibirás.

### Evaluación peer to peer

1. **Claridad**: ¿Los escenarios están descritos claramente? ¿Son de fácil comprensión? ¿Es un escenario realmente? Se comprende “qué” es lo que se debe probar en cada uno?

2. **Comportamiento**: ¿Cada escenario refleja correctamente el comportamiento esperado?

3. **Orden**: ¿El orden establecido es el correcto? ¿Cumple con el requisito de “orden por prioridad”? ¿Vos hubieses propuesto otra manera?

4. **Gaps**: ¿Están todos los escenarios de prueba clave? ¿Faltó alguno importante? 

5. **Redundancia**: ¿Algún escenario es innecesario? ¿Se repiten o son muy similares?


- **Paso 2**: Ofrecer y registrar comentarios, feedback, dudas, preguntas y correcciones. Cada Plan de prueba debe contener al menos tres huellas visibles:

-La del creador

-La del primer evaluador del equipo

-La del segundo evaluador.

- **Paso 3**: Puesta en común: ¿Cómo resultó el ejercicio anterior? ¿En algún caso el plan de pruebas no recibió ninguna corrección? ¿A qué creen que se debe? 

---

## ⏰ 50 minutos

## :book: MATERIAL DE LECTURA

El crecimiento del área de desarrollo de software puso de manifiesto la necesidad de contar con un profesional que asumiera la responsabilidad de analizar y testear los productos creados. Es así, que el área de QA adquiere relevancia para la industria IT.

El programador desarrolla teniendo en cuenta los requerimientos y especificaciones solicitadas. Sin embargo, en cualquiera de las etapas de su trabajo (creación de un programa o cambios en productos ya en funcionamiento) existen  variables que podrían generar errores en el funcionamiento del producto. 

Por eso,  es fundamental la presencia de profesionales que revisen (testeen) la funcionalidad desde la definición solicitada, hasta su implementación en el código. Todo esto debe realizarse antes de colocar el producto en el mercado. Es decir, mientras antes se evalúen los posibles errores, mejor.

### ¿NECESITAS UN EJEMPLO?

En la industria IT, se testea antes de que un producto o sistema avance a la etapa de producción detectando errores y comprobando que cumpla con los requisitos solicitados.

¿Qué tipos de problemas te imaginás que sucederían si no se hiciese testeo antes de la producción? ¿Cómo afecta eso al negocio -en caso de tratarse de una empresa- o a la reputación de un profesional independiente?

Comenten entre el equipo las respuestas a estas interrogantes 👆

- [Podés seguir profundizando en estas notas de interés](https://www.celerity.com/insights/the-cost-implications-of)

- [The true cost of a software bug at each phase of the SDLC](https://brainhub.eu/library/strategies-for-managing-bugs)



Al testear, se podrían encontrar con defectos que son productos de gaps o faltas de definiciones.

Analicemos su definición:

Gap o Falta de definición: Algo que no funciona o funciona de manera errática. El escenario que da lugar a ese funcionamiento puede no haber sido considerado al momento de definir los requerimientos y/o especificaciones del sistema.

**En resumen**: El objetivo del testing es asegurar que los requerimientos funcionales y no funcionales sean analizados antes de que un sistema entre en servicio para que cualquier defecto encontrado, sea reportado al equipo de desarrollo y pueda corregirse. Los test a un sistema permiten medir aspectos relacionados a la calidad. 

### Responde las siguientes preguntas:

- El testing por sí solo eleva la calidad del producto por proponer opciones de mejora.

- El testing por sí solo no eleva la calidad pero contribuye a la mejora en la calidad.

Debatan entre ustedes y comenten sus respuestas. Pueden llamar a un mentor para revisar sus respuestas.

**Super pro tip**: Testing y riesgo. 

Desde tu rol, siempre deberás preguntarte: ¿Cuál sería el impacto de encontrar un fallo en el sistema testeado? ¿Qué probabilidad de que ese error suceda? 

**IMPACTO + PROBABILIDAD= RIESGO**

Tendría sentido mencionar que a mayor riesgo, mayor cantidad y complejidad de las pruebas de testeo. 

*Sabemos que has hecho un gran esfuerzo hoy. Tomaste contacto nuevamente con todos los entornos de aprendizaje cooperativo, conociste estudiantes como tú,recuperaste contenidos vistos anteriormente y has asimilado definiciones de palabras nuevas.
Estamos para pedirte un último esfuerzo. ¡Un ejercicio más para hoy!*

---

## ✋ Ejercicio #3:


Lean las siguientes definiciones. Les servirá para comprender algunos temas de los próximos encuentros. Pueden comentarlas y leerlas en grupo para consultar dudas

- Requerimientos funcionales: Son requerimientos que especifican y/o describen funciones que debería llevar a cabo el sistema o componente. Es decir: describen en detalle qué es lo que debería hacer el sistema o componente en cada situación. 

- Requerimientos no funcionales: Todos los requerimientos que debe cumplir un sistema y que no son parte del comportamiento del sistema.

---

## ⏰ 15 minutos

### Extra credits

¿Escuchaste hablar del ciclo virtuoso de deming?

Investiga y relaciona con el proceso de testing y calidad. Luego, realiza la puesta en común para socializar con tu equipo.


### :book: MATERIAL DE LECTURA

Profundicemos un poco más en el tema calidad. Existen normas que se usan para medir la calidad se software. Algunas de ellas son: 
 
1. **CALIDAD ISO / IEC 9126**


![image](https://user-images.githubusercontent.com/72580574/228072828-b1bade36-a6c3-4a31-8ca8-c46b3973b842.png)

**Super TIP**: A continuación te dejamos el mismo gráfico pero en su versión original. Es importante que puedas aprender vocabulario específico en inglés ya que -como mencionamos en el curso anterior- es el idioma predominante en la industria IT.

![image](https://user-images.githubusercontent.com/72580574/228072912-41fc5bee-ab07-498b-be82-e5df14a127ca.png)

Fuente: Abran, Alain & Al-Qutaish, Rafa. (2010). ISO 9126: Analysis of Quality Models and Measures. 10.1002/9780470606834.ch10. 

2. **ISO / IEC 25010 SQuaRE —  System and Software Quality Requirements and Evaluation.**

Para conocer más sobre esta norma, te invitamos a leer el siguiente [artículo](https://iso25000.com/index.php/normas-iso-25000/iso-25010)

![image](https://user-images.githubusercontent.com/72580574/228073058-6b33bbdf-89ad-4ccd-ba12-1abc51b037e2.png)

Ambas normas abarcan los mismos aspectos. Sin embargo existen algunas diferencias:

- En el gráfico ISO 9126, seguridad y compatibilidad (e interoperabilidad) están considerado dentro de la rama de Funcionalidad

- En el gráfico ISO 25010 esos mismos aspectos aparecen separados y algo más desglosados. 


**Secreto de la industria**: Sabemos que en IT la actualización constante es fundamental para ponerse al día con los cambios tecnológicos. Es importante que dediques un tiempo diario o semanal a revisar múltiples fuentes, páginas, foros y comunidades de expertos para estar al día y ofrecer un servicio profesional acorde a la velocidad que caracteriza a la industria.

**Es importante tener en cuenta estas normas referidas a la calidad de software a la hora de desarrollar las tareas de testing: desde el análisis de los requerimientos hasta el diseño del plan de pruebas.**

### ¿Cómo se organiza el área de testing?

![image](https://user-images.githubusercontent.com/72580574/228073300-bb4cf29f-78fa-4fb3-b7f5-efb47943cb0b.png)

### Entrada en calor: Ejercicio #4:

A) Les asignan su primer trabajo: Evaluar y testear un e-commerce.

La compañía te pide que realices las pruebas de evaluación siguiendo y cumpliendo las normas de calidad Iso 9126. ¿Qué pruebas harían?.

B) Clasifiquen las pruebas según su Tipo. ¿Son todas funcionales? Recordá las clasificaciones de las normas ISO9126 y las definiciones que les ofrecimos anteriormente

C) Descarguen la siguiente [plantilla]([)](https://docs.google.com/document/d/1_Feh-F5mUtePN9P0ncBUDhC_mD6aDAL6jY_1zzIqTXU/edit?usp=sharing7dfjTa-jyz-TU/edit) y compartan solo a su equipo.


![image](https://user-images.githubusercontent.com/72580574/228073553-278ec52c-1cf0-44f8-837d-a55a18624de1.png)

### :stars: SOLUCION

Como la consigna es amplia seguramente todas sus respuestas fueron correctas. 
Aquello que testearíamos depende de lo que consideremos que un e-commerce debería incluir en relación a la funcionalidad.

Debajo dejamos algunos ejemplos de aquellos aspectos que podrían probarse. 

**Atención**: Es una lista de funcionalidades a probar. No es una lista de casos de prueba ni tampoco es una lista exhaustiva. 

-> Login: que no se pueda acceder sin usuario ni contraseña válidos. Según especificación, si posee

-> Recuperar contraseña.

-> Creación de usuario.

-> Que no se puedan ingresar scripts en ningún formulario o campo.

-> Procesamiento correcto del pago.

-> Que si se ingresan datos de pago pero se cancela el mismo (usando opción cancelar) se pueda volver o la flecha de navegación hacia atrás del explorador no se procese el pago.

-> Mensajes de error ante el ingreso de datos inválidos.

-> Carrito: que permita agregar y eliminar elementos correctamente

-> Calculo de total, subtotal y descuentos

-> Que el sitio se visualice bien en diferentes dispositivos [resoluciones mobile, tablet, desktop]

-> Que el sitio se visualice bien en múltiples buscadores: Firefox, Edge, Opera, Brave (última versión)

-> Todas las funcionalidades en: Android, ios, Windows 10, macOS Monterey, ubuntu, fedora, linux

-> Tiempos de carga (según requerimiento)

-> Que se pueda proseguir con la compra correctamente aunque la pantalla haya quedado en espera o luego de un time-out

-> Que soporte la cantidad de visitas en simultáneo según lo especificado

-> Que soporte la cantidad de compras en simultáneo según requerimiento

-> Proceso de compra según especificación. 

-> Que las opciones principales para concretar la compra estén visibles según lo especificado en el mock up.

-> Que el sitio pueda ser navegado y se pueda concretar el proceso de compra con asistencia de un lector de pantallas.

-> Recuperación del sistema ante un fallo crítico
 
2. Clasifiquen las pruebas según su Tipo. ¿Son todas funcionales?

En la lista de aspectos a testear hay aspectos funcionales y no funcionales

![image](https://user-images.githubusercontent.com/72580574/228074018-e80e17a2-3228-4e4a-b986-5ac71ec4a32b.png)

![image](https://user-images.githubusercontent.com/72580574/228074059-d14d0cf5-b75b-4a76-bcf1-708c686bbce5.png)


![image](https://user-images.githubusercontent.com/72580574/228074114-405e058d-8407-4411-8a61-714da368f6d9.png)




---

## ⏰ ¡Hora de cerrar!


¡Lo hemos logrado! Has llegado al final del primer encuentro.

Tómense 15 minutos como equipo para conversar sobre los riesgos que podría ocasionar no realizar testing.

Les dejamos algunas preguntas disparadoras:

- ¿Cuáles son las habilidades blandas que debería desarrollar un tester para cumplir con su rol efectivamente?

- ¿Cómo viene tu aprendizaje? ¿Cómo aprovechas la cooperación para aprender?

Recuerda que los equipos cambian en cada encuentro. En el próximo, no necesariamente te encontrarás con el mismo de hoy.

¡Gran momento para recordar qué son los pulsos. ¿Te gustaría recibir pulsos? no olvides cooperar, dar lo máximo en cada encuentro y colaborar con todos los integrantes. 

Este breve video les recuerda cómo se utilizan los pulsos para armar los equipos en el futuro.




---

