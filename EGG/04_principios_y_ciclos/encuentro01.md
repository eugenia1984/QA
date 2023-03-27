# ENCUENTRO 1 / 20

---

## :star: Principios y ciclo de vida del testing

---

## :star: Introducción + icebreaker

**¡Te damos la bienvenida a nuestras guías de trabajo!**

En cada encuentro, tendrás una guía como esta que te acompañará durante tu avance en el aprendizaje de los temas.

En los primeros encuentros, verás que nuestras guías te indican cómo usar el tiempo de estudio, te ofrecen ideas sobre cómo interactuar en las salas de grupos pequeños (breakout rooms) y cómo solicitar ayuda a otros estudiantes.

A medida que avances en el recorrido, ya no tendremos tanto para indicarte y tendrás suficiente autonomía para tomar decisiones acerca de tu propia administración del tiempo en relación al curso.

## 10 minutos

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

## 10 minutos

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

## 15 minutos

**¡MANOS A LA OBRA!**

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

## 10 minutos

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

## 50 minutos




---

