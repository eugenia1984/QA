# :star2: 2.5 - Casos de prueba II

---

MODULO 2 - ENCUENTRO 11 / 17

---

Hoy iniciaremos el encuentro mirando un video sobre un ejemplo de un caso de prueba. Este ejemplo es más complejo que el ejemplo que vimos en el encuentro anterior.


:tv: -> [video](https://www.youtube.com/watch?v=qASPwVFGj3E&ab_channel=EggCooperation)

---

## Paso a paso

Ahora veremos paso a paso cómo debemos realizar un plan de pruebas. Los datos necesarios para identificar y armar cada caso de prueba incluye diversa información, que vimos anteriormente pero volveremos a repasar aquellas más relevantes:


- **Identificador**: Identificador único para el caso de prueba. Es el código con el objetivo de vincular, por ejemplo, un informe de errores al caso de prueba en el cual ha sido detectado.

- **Conjunto de prueba**: Identificador de los conjuntos de prueba donde el caso de prueba es usado.

- **Nombre de la Funcionalidad**: Funcionalidad del IP (Inventario de Prueba) que se testea con este caso de prueba.

- **Prioridad**: Prioridad asignada al caso de prueba, por ejemplo: 1- alta, 2- media, 3-baja.

- **Requisitos**: características del objeto de pruebas que el caso de prueba debe evaluar.

- **Necesidades de ambientes**: si bien no es un requisito obligatorio, debe saberse e indicarse en qué ambiente se van a correr las pruebas. Lo ideal es que haya un ambiente separado de Testing y exclusivo para correr las pruebas, para no ser afectado por que se esté actualizando el código, como ser en el ambiente de desarrollo o por que estén realizando otras pruebas como puede ser en los ambientes de pre-producción donde el cliente prueba para dar su aceptación o en un ambiente de pruebas de automatización donde se pueden afectar los resultados por el uso de dicho ambiente. 

- **Situación**: puede haber un caso en el que esté probando una aplicación, un desarrollador esté realizando modificaciones en paralelo a la misma aplicación o alguien pueda actualizar la aplicación después de que termine la prueba. Esto conduce a una situación en la que los resultados de su prueba pueden variar con el tiempo.

Por lo tanto, siempre es mejor agregar una marca de tiempo con el nombre del evaluador en los comentarios de la prueba para que el resultado de una prueba (aprobado o reprobado) se pueda atribuir al estado de una aplicación en ese momento en particular. 

Alternativamente, puede tener una columna 'Fecha de ejecución' agregada por separado al caso de prueba que identificará explícitamente la marca de tiempo de la prueba.

- **HW**: Lista de Hardware requerido para ejecutar el caso de prueba.

- **SW**: Lista de Software requerido para ejecutar el caso de prueba.

- **Configuración (setup)**: Lista de pasos necesarios para comenzar las pruebas.

- **Retroceder acciones (cleanup)**: Lista de pasos necesarios para retroceder al estado previo a la prueba.

- **Precondiciones**: situación inicial o previa a la ejecución de pruebas o características de Explicación de la acción que se hará con los datos de la situación inicial. Por ejemplo: dar de alta un elemento, agregar un elemento a una lista.

- **Resultado esperado**: Especificación del resultado esperado de ejecutar las pruebas.

- **Dependencias (si hay)**: orden de ejecución de casos de prueba, razón de las dependencias.

- **Valores de entrada**: descripción de los datos de entrada de un objeto de pruebas. Puede ser un dibujo o un texto explicando los datos con los que se probará el caso. Debe ser claro y no dejar dudas.

Los siguientes datos se completan una vez que el caso de prueba se ejecutó:

- **Resultado real**: Especificación de lo que realmente ocurrió: Pasó/Falló/No se pudo ejecutar

- **Post-caso de prueba condiciones**: características de un objeto de prueba tras la ejecución de pruebas, descripción de su situación tras la ejecución de las pruebas.  Puede ser un dibujo o texto explicando cómo se espera que los datos iniciales queden luego de ejecutar la acción. Debe ser claro y no dejar dudas.

Ejemplo

· Identificador: 1

· Nombre: Alta de elemento al final de una lista ordenada

· Situación inicial: Lista:(3 → 5 → 7 → 15)

· Acción: Agregar a la lista el elemento 18

· Resultado esperado: Lista: (3 → 5 → 7 → 15 → 18)

- **Duración**: Tiempo reloj en ejecutar el caso de prueba.

- **Esfuerzo**: Horas-Persona requeridas para configurar y ejecutar el caso de prueba.

- **Fecha**: Fecha en la que se realizó la prueba.

- **Identificación del Defecto**: En caso de que la prueba falle se debe identificar el incidente reportado para su seguimiento.

- **Versión**: Identificador de la versión probada.

- **Tester**: Nombre del tester que ejecutó el caso de prueba.

- **Evidencias**: son los resultados que se adjuntan con foto/s de la/s pantallas con los resultados (screenshot) y pueden ser también con los pasos realizados. También se pueden realizar videos para mostrar el paso a paso y el resultado final. 

Cada vez que se ejecuta un caso debe registrarse la información resultante para que quien sea responsable del código probado, sepa si está correcto o se produjo algún error o resultado no deseado.

Aquí se obtiene un resultado real de la ejecución del código que denominamos Resultado Final de la Ejecución del Caso de Prueba.

Las ejecuciones de casos se agrupan en “Corridas” que se deben identificar para saber cuándo (y a veces quién) realizó una ejecución.

---

Material de apoyo sugerido para revisar pre o post del encuentro en vivo:

:tv: -> [APRENDE Cómo Diseñar CASOS DE PRUEBA 🚀 (con EJEMPLOS PRÁCTICOS)](https://youtu.be/rQf50sYvgJE)

:tv: -> [Cómo Escribir  Casos de Pruebas | Paso a paso](https://youtu.be/laawNIdX9js)

:tv: -> [Como diseñar y mantener casos de prueba - Jorge Gomez](https://youtu.be/ZEqwbR1YyJU)


---

###  Consideraciones respecto de las pruebas

El fundamento respecto a la Prueba de Software es que no se puede probar completamente un sistema compuesto por varios programas, por lo que en el momento de realizar las pruebas se deben tomar decisiones respecto a cómo se van a diseñar los casos de prueba. Otro punto importante a tener en cuenta es la actitud que debe tener la persona que realiza las pruebas.

La prueba exhaustiva requiere probar el comportamiento de un programa para todas las combinaciones válidas e inválidas de entradas. Además, se debe probar esto en cada punto donde se ingresan datos, bajo cada estado posible del programa en ese punto. Esto no es posible, ya que el tiempo requerido y el costo es prohibitivo.

En un mundo ideal, desearíamos probar cada permutación posible de un programa. Incluso un programa aparentemente simple puede tener centenares o millares de combinaciones posibles de la entrada y de la salida. Crear los casos de prueba para todas estas posibilidades no es económicamente factible. Este problema fundamental, tendrá implicancias para la economía de las pruebas, suposiciones que el tester tendrá que hacer sobre el programa y la manera en el cual los casos de prueba se diseñan. 

El objetivo debe ser maximizar la producción de las pruebas, esto es, maximizar el número de los errores encontrados por un número finito de los casos de prueba. 

La forma en cómo se seleccionan los casos de prueba es una de las principales decisiones a tomar, teniendo en cuenta las siguientes consideraciones:

Los casos de prueba deben ser revisados regularmente, escribiendo nuevas pruebas que ejerciten diferentes partes del software, con el objetivo de encontrar más defectos 

Otro aspecto que se debe considerar al realizar pruebas es decidir cuándo el programa falla para un conjunto de datos de entrada, o sea, conocer cuál es la salida esperada del programa. Este problema es conocido como el problema del oráculo. 

Un oráculo es cualquier agente (humano o mecánico) que decide si un programa se comportó correctamente en una prueba dada, y produce por consiguiente un veredicto de "pasó" (pass) o de "falló" (fail). 

Un oráculo es lo que nos dice qué resultado debemos esperar ante determinadas entradas y condiciones de ejecución.

Básicamente es el mecanismo, ya sea manual o automático, de verificar si el comportamiento del sistema es el deseado o no. Para esto, el oráculo deberá comparar el valor esperado contra valor obtenido, el estado final esperado con el estado final alcanzado, el tiempo de respuesta aceptable con el tiempo de respuesta obtenido, etc. Pueden ser: 

- personas

- modelos

- Documentos

- productos similares

- normas o estándares

Existen diversas clases de oráculos, y la automatización del oráculo puede llegar a ser muy compleja y costosa. El oráculo más común es el oráculo entrada/salida, que especifica la salida esperada para una entrada específica. Si el programa hace exactamente lo que su especificación dice que debe hacer y no hace nada más, entonces cumple con su especificación.

No es razonable decir que un programa es correcto si cumple con su especificación, ya que las especificaciones pueden tener errores. 

En este punto es interesante reflexionar sobre algo a lo que se llama la Paradoja del Pesticida: los insectos (bugs, refiriéndose a fallos) que sobreviven a un pesticida se hacen más fuertes, y resistentes a ese pesticida. O sea, si diseñamos un conjunto de pruebas probablemente ciertos bugs sobrevivan. Si luego diseñamos una técnica más completa y llamémosle “exhaustiva”, entonces encontraremos más bugs, pero otros seguirán sobreviviendo. Al fin de cuentas los que van quedando son los más duros de matar, y se van haciendo resistentes a los distintos pesticidas.

---

### Obtención de casos de prueba a partir de requisitos

El diseño de casos de prueba debe ser un proceso controlado.
Los casos de prueba pueden ser creados formal o informalmente, dependiendo de las características del proyecto y la madurez del proceso en uso.

#### Cobertura de pruebas

Es una medida de calidad de las pruebas. Se definen cierto tipo de entidades sobre el sistema, y luego se intenta cubrirlas con las pruebas. Es una forma de indicar cuándo probamos suficiente, o para tomar ideas de qué otra cosa probar (pensando en aumentar la cobertura elegida). 


**¿NECESITAS UN EJEMPLO?**

Ejemplo: podríamos decir que la cobertura es como cuando barremos la casa. Barro la cocina, el comedor, el baño y mi dormitorio, pero siempre se me olvida el segundo dormitorio, eso es que en mi barrido no estoy cubriendo este dormitorio. Mide la calidad de mi barrido, y a su vez me da una medida para saber cuándo tengo que terminar de barrer: cuando cubra cada habitación, por ejemplo. 

Ahora, lograr el 100% de cobertura con ese criterio, ¿indica que mi casa está limpia? No, porque el garaje, el patio y la lavandería que están en el fondo de la casa, no los he tenido en cuenta. Por lo cual hay que manejar el concepto con cuidado. Tener cierto nivel de cobertura es un indicador de la calidad de las pruebas, pero nunca es un indicador de la calidad del sistema, por ejemplo, ni me garantizará que está todo probado. 

¿Entonces para qué me sirve? 

- Medida de calidad de cómo barro 

- Me indica cuándo parar de barrer 

- Me sugiere qué más barrer 

Unos criterios pueden ser más fuertes que otros, entonces el conocerlos me puede dar un indicador de qué tan profundas son las pruebas, cuándo aplicar uno y cuándo otro. Se dice que un criterio A incluye a otro criterio B cuando cualquier conjunto de casos de prueba que cubre el criterio A también cubre el criterio B. 

- Criterio 1: barrer cada habitación. 

- Criterio 2: barrer cada habitación dentro o fuera de la casa principal (habitaciones, comedor, cocina, baño, garaje, lavandería, etc.). 

- Criterio 3: barrer cada habitación, incluso en las esquinas, porque ahí hay más posibilidades de que se acumule suciedad. 

Criterio 3 incluye al criterio 2, el cual incluye al criterio 1 (y la relación es transitiva, con lo cual el criterio 3 integra al criterio 1).

---

### Trazabilidad

Las pruebas deben ser trazables: ¿qué casos de prueba han sido incluido en el catálogo o listado de pruebas, basados en qué requisitos?

Las consecuencias de los cambios en los requisitos sobre las pruebas a realizar pueden ser identificadas directamente.

La trazabilidad también ayuda a determinar la cobertura de requisitos.

#### Especificación de casos de prueba

Se han desarrollado muchas maneras de escribir y especificar estos Casos. Aquí presentaremos una adaptación que busca simplificar las pruebas:

Ejemplo: si quiero probar si mi solución de agregar un elemento a una lista simplemente vinculada que está ordenada podría plantear las siguientes situaciones o CASOS (estos son sólo algunos ejemplos):

- Agregar un elemento a una lista vacía.

- Agregar un elemento a la lista que tiene un solo elemento.

- Agregar un elemento al principio de la lista.

- Agregar un elemento al medio de la lista.

- Agregar un elemento al final de la lista.

- Agregar un elemento que ya existe en la lista.

**Construcción de Casos de Prueba**: Este paso debe realizarse muy temprano en el proceso de desarrollo, tal como se mencionó anteriormente. El resultado de este paso es una especificación de Casos de Prueba, que pueden tener una estructura como la que proponemos en el punto siguiente (“Estructura de los Casos de Prueba”).

**Ejecución de los Casos de Prueba**: (comúnmente llamada “corrida”) La ejecución de los casos se realiza una vez terminada la codificación. Esta ejecución consiste en tomar cada especificación de caso de prueba, ejecutar el software que estamos probamos (puede ser una porción de código) y registrar el resultado de la ejecución. Normalmente una corrida implica la ejecución de TODOS los casos de prueba. Un mismo Caso de Prueba se puede ejecutar muchas veces, tantas como corridas se realicen, idealmente al menos cada vez que se modifica algo del código.


### Los 3 problemas más comunes en casos de prueba

#### Pasos compuestos

En primer lugar, ¿qué es un paso compuesto? Es aquel que se puede dividir en varios pasos individuales.

- Ejemplo: estás dando instrucciones desde el punto A al punto B: si dices que 'Ve al lugar XYZ y luego al ABC', esto no tendrá mucho sentido, porque aquí nos encontramos pensando: '¿Cómo puedo llegar a XYZ en primer lugar”- en lugar de comenzar con “Gire a la izquierda desde aquí y avance 1 kilómetro, luego gire a la derecha en R número 11 para llegar a XYZ ” podría lograr mejores resultados.

Las mismas reglas exactas se aplican a las pruebas y sus pasos también. 

Por ejemplo: escribiendo una prueba para Amazon.com: haga un pedido de cualquier producto. Recuerde, las pruebas siempre tratan sobre 'Cómo' realizar la prueba, por lo que es importante escribir los pasos exactos de 'Cómo pagar y pagar' en su prueba.

1. Dirigirse a: Amazon.com

2. Busque un producto ingresando la palabra clave / nombre del producto en el campo 'Buscar' en la parte superior de la pantalla. 

3. De los resultados de búsqueda que se muestran, elija el primero. 

4. Haga clic en Agregar al carrito en la página de detalles del producto. 

5. Checkout y pago. 

6. Consulta la página de confirmación del pedido.

El paso “5” es un paso compuesto, por lo tanto, el caso anterior es más efectivo cuando se escribe de la siguiente manera: 


1. Dirigirse a:  Amazon.com Busque un producto ingresando la palabra clave / nombre del producto en el campo 'Buscar' en la parte superior de la pantalla. 

2. De los resultados de búsqueda que se muestran, elija el primero. 

3. Haga clic en Agregar al carrito en la página de detalles del producto.

4. Haga clic en Pagar en la página del carrito de compras. 

5. Ingrese la información de CC, envío y facturación. 

6. Haga clic en Pagar. 

7. Consulta la página de confirmación del pedido.

El comportamiento de la aplicación se toma como comportamiento esperado

Cada vez más proyectos tienen que afrontar esta situación en estos días. La falta de documentación, la programación extrema, los ciclos de desarrollo rápidos son algunas de las razones que nos obligan a confiar en la aplicación (una versión anterior más o menos) para escribir las pruebas o para basar las pruebas en sí. 

Ejemplo: si la siguiente es la página para la que está escribiendo / diseñando los pasos de prueba:

![image](https://user-images.githubusercontent.com/72580574/216708385-c4f2f119-33e4-4565-9a8a-5e1df460121b.png)

Si los pasos de mi caso de prueba son los siguientes: 

- Caso 1: 

1. Inicie el sitio de compras.

2. Haga clic en Envío y devolución. Resultado esperado: la página de envío y devolución se muestra con 'Ponga su información aquí' y un botón 'Continuar'.

Entonces, esto es incorrecto.

- Caso 2: 

1. Inicie el sitio de compras.

2. Haga clic en Envío y devolución.

3. En el cuadro de texto 'Ingrese el número de pedido' presente en esta pantalla, ingrese el número de pedido.

4. Haga clic en Continuar - Resultado esperado: se muestran los detalles del pedido relacionados con el envío y las devoluciones.

El caso 2 es un mejor caso de prueba porque a pesar de que la aplicación de referencia se comporta de manera incorrecta, solo la tomamos como una guía, investigamos más y escribimos el comportamiento esperado según la funcionalidad correcta anticipada.


### Varias condiciones en un caso

Los siguientes son los pasos dentro de una prueba para una función de inicio de sesión. 

Ejemplo: 

1. Ingrese detalles válidos y haga clic en Enviar. 

2. Deje el campo Nombre de usuario vacío. Haga clic en Enviar. 

3. Deje el campo de la contraseña vacío y haga clic en Enviar. 

4. Elija un nombre de usuario / contraseña que ya haya iniciado sesión y haga clic en Enviar.

Lo que tenían que ser 4 casos diferentes se combinan en uno. Podrías estar pensando: ¿Qué hay de malo en eso? Está ahorrando mucha documentación y lo que puedo hacer en 4, lo estoy haciendo en 1. Bueno, no del todo, ¿por qué?

¿Qué pasa si una de las condiciones falla? Tenemos que marcar toda la prueba como 'fallida'. Si marcamos el caso completo como 'fallido', significa que las 4 condiciones no están funcionando, lo cual no es realmente cierto.

Las pruebas deben tener un flujo. Desde la condición previa hasta el paso 1 y todos los pasos. Si sigo este caso, en el paso A, si tiene éxito, iniciaré sesión en la página, donde la opción 'iniciar sesión' ya no está disponible. Entonces, cuando llegue al paso B, ¿dónde ingresará el tester el nombre de usuario? Verás, el flujo está roto.

Por eso, escribir pruebas modulares, parece mucho trabajo, pero todo lo que necesitas es separar las cosas y usar a nuestros mejores amigos Ctrl + C y Ctrl + V para trabajar para nosotros.

Ejemplo:

Veamos cómo escribir casos de prueba de manera eficiente para una pantalla de 'Inicio de sesión' familiar y simple como se muestra en la siguiente figura. Los enfoques de prueba será casi el mismo incluso para pantallas complejas con más información y características críticas.

![image](https://user-images.githubusercontent.com/72580574/216708696-92f6989e-2ac7-445d-90e5-f99fe17a660f.png)

El primer enfoque para cualquier proceso de caso de prueba será obtener un prototipo de pantalla, si está disponible. Es posible que esto no esté disponible para algunas de las funcionalidades y depende de la importancia de diseñar un prototipo en las primeras etapas de desarrollo.

Pero, si un SRS (Especificación de requisitos de software) documento está disponible para el proyecto, la mayoría de los prototipos de pantalla son desarrollados por el equipo del proyecto. Este tipo de pantalla simplifica el trabajo del evaluador y aumenta la eficiencia de las pruebas.


A continuación, las especificaciones de requisitos funcionales. Depende del proceso de organización, estará disponible en un conjunto de múltiples documentos.

Por lo tanto, decida cuál es el mejor documento para redactar casos, ya sea un documento de requisitos del usuario o una especificación de requisitos funcionales (o incluso un documento SRS si el equipo de pruebas lo puede entender cómodamente) que proporcionará un flujo funcional completo de lo seleccionado. característica para ser probado.
Una vez que el prototipo de pantalla y las especificaciones funcionales están en su lugar, el tester debe comenzar a escribir los casos con el siguiente enfoque y criterio.

- Pruebas de IU, Interfaz Usuaria: los controles / campos que son visibles para el usuario. Hay controles estáticos y dinámicos disponibles para probar la función. Por ejemplo, En la pantalla de inicio de sesión anterior, los textos de 'Nombre de usuario y contraseña' son campos estáticos que no requieren la interacción del usuario, solo para mostrar el texto.

- Casos funcionales: Por otro lado, el botón Iniciar sesión y los Hipervínculos (¿Olvidó su contraseña? Y Registro) son campos dinámicos que requieren la interacción del usuario haciendo clic en los controles, que realizarán alguna acción después.

- Casos de bases de datos: Una vez que el usuario ingresa el nombre de usuario y la contraseña, las pruebas se pueden escribir para verificar la base de datos relacionada, si el nombre de usuario y la contraseña están verificados en la base de datos y la tabla correctas y también el usuario tiene permiso para iniciar sesión en la aplicación bajo prueba. 

- Pruebas de proceso: esto está relacionado con el proceso (no las acciones asociadas con los controles visibles disponibles en la pantalla) asociado con la característica y la funcionalidad. 

Por ejemplo, Si hace clic en el enlace “Olvidé mi contraseña” en la pantalla de muestra anterior, puede enviar un correo electrónico al usuario. Entonces, tal vez un correo electrónico deba probarse para el proceso y la confirmación adecuados.

Finalmente, mantenga el Enfoque de BAOE (Básico, Alternativo, Opciones y Excepciones) para la cobertura completa del flujo funcional y la característica a probar. Todos los conceptos deben aplicarse a pruebas positivas y negativas.

i) Flujo básico 

ii) Flujo alternativo 

iii) Opciones 

iv) Excepciones 

Por ejemplo, Veamos el enfoque BAOE simple para la pantalla de inicio de sesión 

- Flujo básico: Ingrese la ruta URL del inicio de sesión en cualquier navegador e ingrese la información requerida e inicie sesión en la aplicación.

- Flujo alternativo: Instale la aplicación en un dispositivo móvil e ingrese la información requerida e inicie sesión en la aplicación.

Opciones: ¿Cuáles son las opciones disponibles para llegar a la misma pantalla de inicio de sesión? 

Ejemplo, después de iniciar sesión en la aplicación, al hacer clic en 'Cerrar sesión' puede aparecer la misma pantalla o, si el tiempo de espera de la sesión o la sesión expiró, el usuario puede acceder a la pantalla de inicio de sesión.

