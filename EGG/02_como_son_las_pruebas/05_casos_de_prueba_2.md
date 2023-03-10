# :star2: 2.5 - Casos de prueba II

---

MODULO 2 - ENCUENTRO 11 / 17

---

Hoy iniciaremos el encuentro mirando un video sobre un ejemplo de un caso de prueba. Este ejemplo es m谩s complejo que el ejemplo que vimos en el encuentro anterior.


:tv: -> [video](https://www.youtube.com/watch?v=qASPwVFGj3E&ab_channel=EggCooperation)

---

# 馃摉 Paso a paso en el Plan de Prueba :book:

Ahora veremos paso a paso c贸mo debemos realizar un plan de pruebas. Los datos necesarios para identificar y armar cada caso de prueba incluye diversa informaci贸n, que vimos anteriormente pero volveremos a repasar aquellas m谩s relevantes:


- **Identificador**: Identificador 煤nico para el caso de prueba. Es el c贸digo con el objetivo de vincular, por ejemplo, un informe de errores al caso de prueba en el cual ha sido detectado.

- **Conjunto de prueba**: Identificador de los conjuntos de prueba donde el caso de prueba es usado.

- **Nombre de la Funcionalidad**: Funcionalidad del IP (Inventario de Prueba) que se testea con este caso de prueba.

- **Prioridad**: Prioridad asignada al caso de prueba, por ejemplo: 1- alta, 2- media, 3-baja.

- **Requisitos**: caracter铆sticas del objeto de pruebas que el caso de prueba debe evaluar.

- **Necesidades de ambientes**: si bien no es un requisito obligatorio, debe saberse e indicarse en qu茅 ambiente se van a correr las pruebas. Lo ideal es que haya un ambiente separado de Testing y exclusivo para correr las pruebas, para no ser afectado por que se est茅 actualizando el c贸digo, como ser en el ambiente de desarrollo o por que est茅n realizando otras pruebas como puede ser en los ambientes de pre-producci贸n donde el cliente prueba para dar su aceptaci贸n o en un ambiente de pruebas de automatizaci贸n donde se pueden afectar los resultados por el uso de dicho ambiente. 

- **Situaci贸n**: puede haber un caso en el que est茅 probando una aplicaci贸n, un desarrollador est茅 realizando modificaciones en paralelo a la misma aplicaci贸n o alguien pueda actualizar la aplicaci贸n despu茅s de que termine la prueba. Esto conduce a una situaci贸n en la que los resultados de su prueba pueden variar con el tiempo.

Por lo tanto, siempre es mejor agregar una marca de tiempo con el nombre del evaluador en los comentarios de la prueba para que el resultado de una prueba (aprobado o reprobado) se pueda atribuir al estado de una aplicaci贸n en ese momento en particular. 

Alternativamente, puede tener una columna 'Fecha de ejecuci贸n' agregada por separado al caso de prueba que identificar谩 expl铆citamente la marca de tiempo de la prueba.

- **HW**: Lista de Hardware requerido para ejecutar el caso de prueba.

- **SW**: Lista de Software requerido para ejecutar el caso de prueba.

- **Configuraci贸n (setup)**: Lista de pasos necesarios para comenzar las pruebas.

- **Retroceder acciones (cleanup)**: Lista de pasos necesarios para retroceder al estado previo a la prueba.

- **Precondiciones**: situaci贸n inicial o previa a la ejecuci贸n de pruebas o caracter铆sticas de Explicaci贸n de la acci贸n que se har谩 con los datos de la situaci贸n inicial. Por ejemplo: dar de alta un elemento, agregar un elemento a una lista.

- **Resultado esperado**: Especificaci贸n del resultado esperado de ejecutar las pruebas.

- **Dependencias (si hay)**: orden de ejecuci贸n de casos de prueba, raz贸n de las dependencias.

- **Valores de entrada**: descripci贸n de los datos de entrada de un objeto de pruebas. Puede ser un dibujo o un texto explicando los datos con los que se probar谩 el caso. Debe ser claro y no dejar dudas.

Los siguientes datos se completan una vez que el caso de prueba se ejecut贸:

- **Resultado real**: Especificaci贸n de lo que realmente ocurri贸: Pas贸/Fall贸/No se pudo ejecutar

- **Post-caso de prueba condiciones**: caracter铆sticas de un objeto de prueba tras la ejecuci贸n de pruebas, descripci贸n de su situaci贸n tras la ejecuci贸n de las pruebas.  Puede ser un dibujo o texto explicando c贸mo se espera que los datos iniciales queden luego de ejecutar la acci贸n. Debe ser claro y no dejar dudas.

##### Ejemplo

路 Identificador: 1

路 Nombre: Alta de elemento al final de una lista ordenada

路 Situaci贸n inicial: Lista:(3 鈫? 5 鈫? 7 鈫? 15)

路 Acci贸n: Agregar a la lista el elemento 18

路 Resultado esperado: Lista: (3 鈫? 5 鈫? 7 鈫? 15 鈫? 18)

- **Duraci贸n**: Tiempo reloj en ejecutar el caso de prueba.

- **Esfuerzo**: Horas-Persona requeridas para configurar y ejecutar el caso de prueba.

- **Fecha**: Fecha en la que se realiz贸 la prueba.

- **Identificaci贸n del Defecto**: En caso de que la prueba falle se debe identificar el incidente reportado para su seguimiento.

- **Versi贸n**: Identificador de la versi贸n probada.

- **Tester**: Nombre del tester que ejecut贸 el caso de prueba.

- **Evidencias**: son los resultados que se adjuntan con foto/s de la/s pantallas con los resultados (screenshot) y pueden ser tambi茅n con los pasos realizados. Tambi茅n se pueden realizar videos para mostrar el paso a paso y el resultado final. 

Cada vez que se ejecuta un caso debe registrarse la informaci贸n resultante para que quien sea responsable del c贸digo probado, sepa si est谩 correcto o se produjo alg煤n error o resultado no deseado.

Aqu铆 se obtiene un resultado real de la ejecuci贸n del c贸digo que denominamos Resultado Final de la Ejecuci贸n del Caso de Prueba.

Las ejecuciones de casos se agrupan en 鈥淐orridas鈥? que se deben identificar para saber cu谩ndo (y a veces qui茅n) realiz贸 una ejecuci贸n.

---

## :tv: Material de apoyo sugerido para revisar pre o post del encuentro en vivo :tv:

:tv: -> [APRENDE C贸mo Dise帽ar CASOS DE PRUEBA 馃殌 (con EJEMPLOS PR脕CTICOS)](https://youtu.be/rQf50sYvgJE)

:tv: -> [C贸mo Escribir  Casos de Pruebas | Paso a paso](https://youtu.be/laawNIdX9js)

:tv: -> [Como disen虄ar y mantener casos de prueba - Jorge Gomez](https://youtu.be/ZEqwbR1YyJU)


---

## 馃摉  Consideraciones respecto de las pruebas 馃摉 

El fundamento respecto a la Prueba de Software es que no se puede probar completamente un sistema compuesto por varios programas, por lo que en el momento de realizar las pruebas se deben tomar decisiones respecto a c贸mo se van a dise帽ar los casos de prueba. Otro punto importante a tener en cuenta es la actitud que debe tener la persona que realiza las pruebas.

La prueba exhaustiva requiere probar el comportamiento de un programa para todas las combinaciones v谩lidas e inv谩lidas de entradas. Adem谩s, se debe probar esto en cada punto donde se ingresan datos, bajo cada estado posible del programa en ese punto. Esto no es posible, ya que el tiempo requerido y el costo es prohibitivo.

En un mundo ideal, desear铆amos probar cada permutaci贸n posible de un programa. Incluso un programa aparentemente simple puede tener centenares o millares de combinaciones posibles de la entrada y de la salida. Crear los casos de prueba para todas estas posibilidades no es econ贸micamente factible. Este problema fundamental, tendr谩 implicancias para la econom铆a de las pruebas, suposiciones que el tester tendr谩 que hacer sobre el programa y la manera en el cual los casos de prueba se dise帽an. 

El objetivo debe ser maximizar la producci贸n de las pruebas, esto es, maximizar el n煤mero de los errores encontrados por un n煤mero finito de los casos de prueba. 

La forma en c贸mo se seleccionan los casos de prueba es una de las principales decisiones a tomar, teniendo en cuenta las siguientes consideraciones:

Los casos de prueba deben ser revisados regularmente, escribiendo nuevas pruebas que ejerciten diferentes partes del software, con el objetivo de encontrar m谩s defectos 

Otro aspecto que se debe considerar al realizar pruebas es decidir cu谩ndo el programa falla para un conjunto de datos de entrada, o sea, conocer cu谩l es la salida esperada del programa. Este problema es conocido como el problema del or谩culo. 

Un or谩culo es cualquier agente (humano o mec谩nico) que decide si un programa se comport贸 correctamente en una prueba dada, y produce por consiguiente un veredicto de "pas贸" (pass) o de "fall贸" (fail). 

Un or谩culo es lo que nos dice qu茅 resultado debemos esperar ante determinadas entradas y condiciones de ejecuci贸n.

B谩sicamente es el mecanismo, ya sea manual o autom谩tico, de verificar si el comportamiento del sistema es el deseado o no. Para esto, el or谩culo deber谩 comparar el valor esperado contra valor obtenido, el estado final esperado con el estado final alcanzado, el tiempo de respuesta aceptable con el tiempo de respuesta obtenido, etc. Pueden ser: 

- personas

- modelos

- Documentos

- productos similares

- normas o est谩ndares

Existen diversas clases de or谩culos, y la automatizaci贸n del or谩culo puede llegar a ser muy compleja y costosa. El or谩culo m谩s com煤n es el or谩culo entrada/salida, que especifica la salida esperada para una entrada espec铆fica. Si el programa hace exactamente lo que su especificaci贸n dice que debe hacer y no hace nada m谩s, entonces cumple con su especificaci贸n.

No es razonable decir que un programa es correcto si cumple con su especificaci贸n, ya que las especificaciones pueden tener errores. 

En este punto es interesante reflexionar sobre algo a lo que se llama la Paradoja del Pesticida: los insectos (bugs, refiri茅ndose a fallos) que sobreviven a un pesticida se hacen m谩s fuertes, y resistentes a ese pesticida. O sea, si dise帽amos un conjunto de pruebas probablemente ciertos bugs sobrevivan. Si luego dise帽amos una t茅cnica m谩s completa y llam茅mosle 鈥渆xhaustiva鈥?, entonces encontraremos m谩s bugs, pero otros seguir谩n sobreviviendo. Al fin de cuentas los que van quedando son los m谩s duros de matar, y se van haciendo resistentes a los distintos pesticidas.

---

## 馃摉  Obtenci贸n de casos de prueba a partir de requisitos 馃摉 

El dise帽o de casos de prueba debe ser un proceso controlado.
Los casos de prueba pueden ser creados formal o informalmente, dependiendo de las caracter铆sticas del proyecto y la madurez del proceso en uso.

## :star: Cobertura de pruebas

Es una medida de calidad de las pruebas. Se definen cierto tipo de entidades sobre el sistema, y luego se intenta cubrirlas con las pruebas. Es una forma de indicar cu谩ndo probamos suficiente, o para tomar ideas de qu茅 otra cosa probar (pensando en aumentar la cobertura elegida). 


**驴NECESITAS UN EJEMPLO?**

Ejemplo: podr铆amos decir que la cobertura es como cuando barremos la casa. Barro la cocina, el comedor, el ba帽o y mi dormitorio, pero siempre se me olvida el segundo dormitorio, eso es que en mi barrido no estoy cubriendo este dormitorio. Mide la calidad de mi barrido, y a su vez me da una medida para saber cu谩ndo tengo que terminar de barrer: cuando cubra cada habitaci贸n, por ejemplo. 

Ahora, lograr el 100% de cobertura con ese criterio, 驴indica que mi casa est谩 limpia? No, porque el garaje, el patio y la lavander铆a que est谩n en el fondo de la casa, no los he tenido en cuenta. Por lo cual hay que manejar el concepto con cuidado. Tener cierto nivel de cobertura es un indicador de la calidad de las pruebas, pero nunca es un indicador de la calidad del sistema, por ejemplo, ni me garantizar谩 que est谩 todo probado. 

驴Entonces para qu茅 me sirve? 

- Medida de calidad de c贸mo barro 

- Me indica cu谩ndo parar de barrer 

- Me sugiere qu茅 m谩s barrer 

Unos criterios pueden ser m谩s fuertes que otros, entonces el conocerlos me puede dar un indicador de qu茅 tan profundas son las pruebas, cu谩ndo aplicar uno y cu谩ndo otro. Se dice que un criterio A incluye a otro criterio B cuando cualquier conjunto de casos de prueba que cubre el criterio A tambi茅n cubre el criterio B. 

- Criterio 1: barrer cada habitaci贸n. 

- Criterio 2: barrer cada habitaci贸n dentro o fuera de la casa principal (habitaciones, comedor, cocina, ba帽o, garaje, lavander铆a, etc.). 

- Criterio 3: barrer cada habitaci贸n, incluso en las esquinas, porque ah铆 hay m谩s posibilidades de que se acumule suciedad. 

Criterio 3 incluye al criterio 2, el cual incluye al criterio 1 (y la relaci贸n es transitiva, con lo cual el criterio 3 integra al criterio 1).

---

## :star:  Trazabilidad

Las pruebas deben ser trazables: 驴qu茅 casos de prueba han sido incluido en el cat谩logo o listado de pruebas, basados en qu茅 requisitos?

Las consecuencias de los cambios en los requisitos sobre las pruebas a realizar pueden ser identificadas directamente.

La trazabilidad tambi茅n ayuda a determinar la cobertura de requisitos.

## :star: Especificaci贸n de casos de prueba

Se han desarrollado muchas maneras de escribir y especificar estos Casos. Aqu铆 presentaremos una adaptaci贸n que busca simplificar las pruebas:

Ejemplo: si quiero probar si mi soluci贸n de agregar un elemento a una lista simplemente vinculada que est谩 ordenada podr铆a plantear las siguientes situaciones o CASOS (estos son s贸lo algunos ejemplos):

- Agregar un elemento a una lista vac铆a.

- Agregar un elemento a la lista que tiene un solo elemento.

- Agregar un elemento al principio de la lista.

- Agregar un elemento al medio de la lista.

- Agregar un elemento al final de la lista.

- Agregar un elemento que ya existe en la lista.

**Construcci贸n de Casos de Prueba**: Este paso debe realizarse muy temprano en el proceso de desarrollo, tal como se mencion贸 anteriormente. El resultado de este paso es una especificaci贸n de Casos de Prueba, que pueden tener una estructura como la que proponemos en el punto siguiente (鈥淓structura de los Casos de Prueba鈥?).

**Ejecuci贸n de los Casos de Prueba**: (com煤nmente llamada 鈥渃orrida鈥?) La ejecuci贸n de los casos se realiza una vez terminada la codificaci贸n. Esta ejecuci贸n consiste en tomar cada especificaci贸n de caso de prueba, ejecutar el software que estamos probamos (puede ser una porci贸n de c贸digo) y registrar el resultado de la ejecuci贸n. Normalmente una corrida implica la ejecuci贸n de TODOS los casos de prueba. Un mismo Caso de Prueba se puede ejecutar muchas veces, tantas como corridas se realicen, idealmente al menos cada vez que se modifica algo del c贸digo.


## :star: Los 3 problemas m谩s comunes en casos de prueba

#### Pasos compuestos

En primer lugar, 驴qu茅 es un paso compuesto? Es aquel que se puede dividir en varios pasos individuales.

- Ejemplo: est谩s dando instrucciones desde el punto A al punto B: si dices que 'Ve al lugar XYZ y luego al ABC', esto no tendr谩 mucho sentido, porque aqu铆 nos encontramos pensando: '驴C贸mo puedo llegar a XYZ en primer lugar鈥?- en lugar de comenzar con 鈥淕ire a la izquierda desde aqu铆 y avance 1 kil贸metro, luego gire a la derecha en R n煤mero 11 para llegar a XYZ 鈥? podr铆a lograr mejores resultados.

Las mismas reglas exactas se aplican a las pruebas y sus pasos tambi茅n. 

Por ejemplo: escribiendo una prueba para Amazon.com: haga un pedido de cualquier producto. Recuerde, las pruebas siempre tratan sobre 'C贸mo' realizar la prueba, por lo que es importante escribir los pasos exactos de 'C贸mo pagar y pagar' en su prueba.

1. Dirigirse a: Amazon.com

2. Busque un producto ingresando la palabra clave / nombre del producto en el campo 'Buscar' en la parte superior de la pantalla. 

3. De los resultados de b煤squeda que se muestran, elija el primero. 

4. Haga clic en Agregar al carrito en la p谩gina de detalles del producto. 

5. Checkout y pago. 

6. Consulta la p谩gina de confirmaci贸n del pedido.

El paso 鈥?5鈥? es un paso compuesto, por lo tanto, el caso anterior es m谩s efectivo cuando se escribe de la siguiente manera: 


1. Dirigirse a:  Amazon.com Busque un producto ingresando la palabra clave / nombre del producto en el campo 'Buscar' en la parte superior de la pantalla. 

2. De los resultados de b煤squeda que se muestran, elija el primero. 

3. Haga clic en Agregar al carrito en la p谩gina de detalles del producto.

4. Haga clic en Pagar en la p谩gina del carrito de compras. 

5. Ingrese la informaci贸n de CC, env铆o y facturaci贸n. 

6. Haga clic en Pagar. 

7. Consulta la p谩gina de confirmaci贸n del pedido.

El comportamiento de la aplicaci贸n se toma como comportamiento esperado

Cada vez m谩s proyectos tienen que afrontar esta situaci贸n en estos d铆as. La falta de documentaci贸n, la programaci贸n extrema, los ciclos de desarrollo r谩pidos son algunas de las razones que nos obligan a confiar en la aplicaci贸n (una versi贸n anterior m谩s o menos) para escribir las pruebas o para basar las pruebas en s铆. 

Ejemplo: si la siguiente es la p谩gina para la que est谩 escribiendo / dise帽ando los pasos de prueba:

![image](https://user-images.githubusercontent.com/72580574/216708385-c4f2f119-33e4-4565-9a8a-5e1df460121b.png)

Si los pasos de mi caso de prueba son los siguientes: 

- Caso 1: 

1. Inicie el sitio de compras.

2. Haga clic en Env铆o y devoluci贸n. Resultado esperado: la p谩gina de env铆o y devoluci贸n se muestra con 'Ponga su informaci贸n aqu铆' y un bot贸n 'Continuar'.

Entonces, esto es incorrecto.

- Caso 2: 

1. Inicie el sitio de compras.

2. Haga clic en Env铆o y devoluci贸n.

3. En el cuadro de texto 'Ingrese el n煤mero de pedido' presente en esta pantalla, ingrese el n煤mero de pedido.

4. Haga clic en Continuar - Resultado esperado: se muestran los detalles del pedido relacionados con el env铆o y las devoluciones.

El caso 2 es un mejor caso de prueba porque a pesar de que la aplicaci贸n de referencia se comporta de manera incorrecta, solo la tomamos como una gu铆a, investigamos m谩s y escribimos el comportamiento esperado seg煤n la funcionalidad correcta anticipada.


### Varias condiciones en un caso

Los siguientes son los pasos dentro de una prueba para una funci贸n de inicio de sesi贸n. 

Ejemplo: 

1. Ingrese detalles v谩lidos y haga clic en Enviar. 

2. Deje el campo Nombre de usuario vac铆o. Haga clic en Enviar. 

3. Deje el campo de la contrase帽a vac铆o y haga clic en Enviar. 

4. Elija un nombre de usuario / contrase帽a que ya haya iniciado sesi贸n y haga clic en Enviar.

Lo que ten铆an que ser 4 casos diferentes se combinan en uno. Podr铆as estar pensando: 驴Qu茅 hay de malo en eso? Est谩 ahorrando mucha documentaci贸n y lo que puedo hacer en 4, lo estoy haciendo en 1. Bueno, no del todo, 驴por qu茅?

驴Qu茅 pasa si una de las condiciones falla? Tenemos que marcar toda la prueba como 'fallida'. Si marcamos el caso completo como 'fallido', significa que las 4 condiciones no est谩n funcionando, lo cual no es realmente cierto.

Las pruebas deben tener un flujo. Desde la condici贸n previa hasta el paso 1 y todos los pasos. Si sigo este caso, en el paso A, si tiene 茅xito, iniciar茅 sesi贸n en la p谩gina, donde la opci贸n 'iniciar sesi贸n' ya no est谩 disponible. Entonces, cuando llegue al paso B, 驴d贸nde ingresar谩 el tester el nombre de usuario? Ver谩s, el flujo est谩 roto.

Por eso, escribir pruebas modulares, parece mucho trabajo, pero todo lo que necesitas es separar las cosas y usar a nuestros mejores amigos Ctrl + C y Ctrl + V para trabajar para nosotros.

Ejemplo:

Veamos c贸mo escribir casos de prueba de manera eficiente para una pantalla de 'Inicio de sesi贸n' familiar y simple como se muestra en la siguiente figura. Los enfoques de prueba ser谩 casi el mismo incluso para pantallas complejas con m谩s informaci贸n y caracter铆sticas cr铆ticas.

![image](https://user-images.githubusercontent.com/72580574/216708696-92f6989e-2ac7-445d-90e5-f99fe17a660f.png)

El primer enfoque para cualquier proceso de caso de prueba ser谩 obtener un prototipo de pantalla, si est谩 disponible. Es posible que esto no est茅 disponible para algunas de las funcionalidades y depende de la importancia de dise帽ar un prototipo en las primeras etapas de desarrollo.

Pero, si un SRS (Especificaci贸n de requisitos de software) documento est谩 disponible para el proyecto, la mayor铆a de los prototipos de pantalla son desarrollados por el equipo del proyecto. Este tipo de pantalla simplifica el trabajo del evaluador y aumenta la eficiencia de las pruebas.


A continuaci贸n, las especificaciones de requisitos funcionales. Depende del proceso de organizaci贸n, estar谩 disponible en un conjunto de m煤ltiples documentos.

Por lo tanto, decida cu谩l es el mejor documento para redactar casos, ya sea un documento de requisitos del usuario o una especificaci贸n de requisitos funcionales (o incluso un documento SRS si el equipo de pruebas lo puede entender c贸modamente) que proporcionar谩 un flujo funcional completo de lo seleccionado. caracter铆stica para ser probado.
Una vez que el prototipo de pantalla y las especificaciones funcionales est谩n en su lugar, el tester debe comenzar a escribir los casos con el siguiente enfoque y criterio.

- **Pruebas de IU, Interfaz Usuaria**: los controles / campos que son visibles para el usuario. Hay controles est谩ticos y din谩micos disponibles para probar la funci贸n. Por ejemplo, En la pantalla de inicio de sesi贸n anterior, los textos de 'Nombre de usuario y contrase帽a' son campos est谩ticos que no requieren la interacci贸n del usuario, solo para mostrar el texto.

- **Casos funcionales**: Por otro lado, el bot贸n Iniciar sesi贸n y los Hiperv铆nculos (驴Olvid贸 su contrase帽a? Y Registro) son campos din谩micos que requieren la interacci贸n del usuario haciendo clic en los controles, que realizar谩n alguna acci贸n despu茅s.

- **Casos de bases de datos**: Una vez que el usuario ingresa el nombre de usuario y la contrase帽a, las pruebas se pueden escribir para verificar la base de datos relacionada, si el nombre de usuario y la contrase帽a est谩n verificados en la base de datos y la tabla correctas y tambi茅n el usuario tiene permiso para iniciar sesi贸n en la aplicaci贸n bajo prueba. 

- **Pruebas de proceso**: esto est谩 relacionado con el proceso (no las acciones asociadas con los controles visibles disponibles en la pantalla) asociado con la caracter铆stica y la funcionalidad. 

Por ejemplo, Si hace clic en el enlace 鈥淥lvid茅 mi contrase帽a鈥? en la pantalla de muestra anterior, puede enviar un correo electr贸nico al usuario. Entonces, tal vez un correo electr贸nico deba probarse para el proceso y la confirmaci贸n adecuados.

Finalmente, mantenga el Enfoque de BAOE (B谩sico, Alternativo, Opciones y Excepciones) para la cobertura completa del flujo funcional y la caracter铆stica a probar. Todos los conceptos deben aplicarse a pruebas positivas y negativas.

1 - Flujo b谩sico 

2 - Flujo alternativo 

3 - Opciones 

4 - Excepciones 

Por ejemplo, Veamos el enfoque BAOE simple para la pantalla de inicio de sesi贸n 

- **Flujo b谩sic**o: Ingrese la ruta URL del inicio de sesi贸n en cualquier navegador e ingrese la informaci贸n requerida e inicie sesi贸n en la aplicaci贸n.

- **Flujo alternativo**: Instale la aplicaci贸n en un dispositivo m贸vil e ingrese la informaci贸n requerida e inicie sesi贸n en la aplicaci贸n.

Opciones: 驴Cu谩les son las opciones disponibles para llegar a la misma pantalla de inicio de sesi贸n? 

Ejemplo, despu茅s de iniciar sesi贸n en la aplicaci贸n, al hacer clic en 'Cerrar sesi贸n' puede aparecer la misma pantalla o, si el tiempo de espera de la sesi贸n o la sesi贸n expir贸, el usuario puede acceder a la pantalla de inicio de sesi贸n.

---

## :star: Excepciones

### 驴Cu谩les son las excepciones si mis pruebas son negativas? 

Ejemplo si se ingresan credenciales incorrectas en la pantalla de inicio de sesi贸n, si el usuario recibir谩 un mensaje de error o ninguna acci贸n asociada.

Con toda esta informaci贸n en la mano, comencemos a escribir los casos de prueba para la pantalla de inicio de sesi贸n, en un formato con la cobertura y trazabilidad completa y con informaci贸n detallada. La secuencia l贸gica y la numeraci贸n de identificar el ' ID de caso de prueba ' ser谩 muy 煤til para un historial de ejecuci贸n de identificaci贸n r谩pida de casos de prueba.

![image](https://user-images.githubusercontent.com/72580574/216710100-931a717b-3da4-467b-a365-bbdd80854e9f.png)

![image](https://user-images.githubusercontent.com/72580574/216710159-9bc2a317-1b70-43f7-b1da-d048e6ed756e.png)

![image](https://user-images.githubusercontent.com/72580574/216710223-9ad040b5-15c7-4b65-97d2-516bbe64dc20.png)

![image](https://user-images.githubusercontent.com/72580574/216710268-6940e902-a20b-4119-b138-f4665826b764.png)

![image](https://user-images.githubusercontent.com/72580574/216710295-d9d1dd95-8998-47d4-9a28-790ccff0074d.png)


---

## :book: Recopilaci贸n de datos de prueba :book:

Cuando se escribe el caso de prueba, la tarea m谩s importante para cualquier tester es recopilar los datos de prueba. Muchos evaluadores omiten esta actividad y la pasan por alto con la suposici贸n de que los casos de prueba se pueden ejecutar con algunos datos de muestra o datos ficticios y se pueden alimentar cuando los datos realmente se requieren. Este es un concepto err贸neo cr铆tico de alimentar datos de muestra o datos de entrada desde la memoria mental en el momento de ejecutar casos de prueba.

Si los datos no se recopilan y actualizan en el documento de prueba en el momento de escribir las pruebas, el evaluador pasar铆a anormalmente m谩s tiempo para recopilar los datos en el momento de la ejecuci贸n de la prueba. Los datos de la prueba deben recopilarse tanto para casos positivos como negativos desde la perspectiva del flujo funcional de la caracter铆stica. 

Encuentre un documento de datos de prueba de muestra para las pruebas escritas anteriormente, que a su vez ser谩 煤til sobre la eficacia con la que podemos recopilar los datos que facilitar谩n nuestro trabajo en el momento de la ejecuci贸n de la prueba.

![image](https://user-images.githubusercontent.com/72580574/216710365-3a9833fc-4e2b-4275-978e-23196f4df5f3.png)

![image](https://user-images.githubusercontent.com/72580574/216710400-9def6951-11a9-46a8-8f49-216f82ddbb9a.png)

![image](https://user-images.githubusercontent.com/72580574/216710428-110ef085-8c18-4bbc-87c8-7f70ae558f64.png)

---

## :book: 驴Qu茅 es una prueba est谩ndar en pruebas web? :book:

Repasemos algunos conceptos que debemos tener presentes:

- Cree casos de prueba que est茅n completos: pasos, datos, variables, etc. Esto garantizar谩 que los datos / variables (aunque no similares) se puedan reemplazar simplemente cuando se requiera un caso de prueba similar.

- Los criterios de entrada y salida deben definirse adecuadamente.

- Los pasos modificables o la declaraci贸n en los pasos deben resaltarse en un color diferente para encontrarlos y reemplazarlos r谩pidamente.

- El lenguaje utilizado para la creaci贸n de casos de prueba est谩ndar debe ser gen茅rico.

- Todas las caracter铆sticas de cada sitio web deben cubrirse en los casos de prueba.

- El nombre de los casos de prueba debe ser el nombre de la funcionalidad o la caracter铆stica que cubre el caso de prueba Esto facilitar谩 mucho la b煤squeda del caso de prueba del conjunto.

- Si hay una muestra b谩sica o est谩ndar, un archivo GUI o una captura de pantalla de la funci贸n, debe adjuntarse con los pasos correspondientes.

Al usar los consejos anteriores, uno puede crear un conjunto de scripts est谩ndar y usarlos con modificaciones peque帽as o necesarias para diferentes sitios web.

El uso de un conjunto est谩ndar de casos de prueba manuales para diferentes sitios web con modificaciones menores es la mejor manera de realizar una prueba de sitio web. Todo lo que necesitamos es crear y mantener los casos de prueba con los est谩ndares y el uso adecuados.

---

## :book: Mejoramiento y mantenimiento de los casos de prueba :bok:

### :star: Comprobaci贸n de los casos de prueba 

Una prueba realizada con precisi贸n es f谩cil de ejecutar lo que significa que, si el tester sigue las instrucciones, el resultado de aprobado o fallido ser谩 correcto. Se puede medir f谩cilmente por medio del tiempo que se tarda en ejecutar la prueba, y si el tester tiene que buscar o no aclaraciones en el proceso de prueba. 

### :star: Lenguaje para mejorar la comprobaci贸n

Los pasos de los casos de prueba deben ser escritos en forma activa. El tester debe saber qu茅 hacer, y c贸mo hacerlo. 

Por ejemplo, navegar en la p谩gina de la tienda online y preparar la lista de lo que va a comprar, para comparar los precios y la variedad con los datos disponibles. 

### :star: Controlar longitud para mejorar la comprobaci贸n

Es necesario tener en cuenta la longitud de los casos de prueba para saber cu谩n compleja y precisa es la prueba. 

Un buen caso de prueba debe tener entre 8 y 16 pasos 鈥昬n el m茅todo paso a paso.

Existen varias ventajas en mantener los casos de prueba cortos: se requiere menos tiempo y hay menos posibilidades de cometer errores, de necesitar ayuda o de alguna p茅rdida de datos. 

Con base en la longitud de los casos de prueba es posible estimar con precisi贸n el tiempo y el esfuerzo que se debe invertir en la prueba, lo mismo que sus resultados. 

En los casos de prueba de matriz, una buena longitud oscila entre 18 y 20 minutos para la prueba.

---

## :book: Tipos de Mantenimiento :book:

Si un problema es detectado por el usuario, inmediatamente puede notificarlo al administrador del sistema. Dicha petici贸n debe ser atendida por el administrador y este proceder谩 a diagnosticar de qu茅 tipo de mantenimiento se trata, luego de finalizar las etapas de desarrollo de un sistema.

Atendiendo a estos fines, podemos establecer los siguientes tipos de mantenimiento: 

- **Correctivo**. Cambios precisos para corregir errores del producto de software. 

- **Evolutivo**. Incorporaciones, modificaciones y eliminaciones necesarias en un producto de software para cubrir la expansi贸n o cambio en los requerimientos del usuario. 

- **Adaptativo**. Modificaciones que afectan los entornos en los que el sistema opera, por ejemplo, cambio en las configuraciones del hardware, software de base, gestores de base de datos, comunicaciones, etc. 

- **Perfectivo**. Acciones llevadas a cabo para mejorar la calidad interna de los sistemas en cualquiera de sus aspectos: restructuraci贸n de c贸digo, definici贸n m谩s clara del sistema y optimizaci贸n del rendimiento y eficiencia. 

Una vez identificado el tipo de mantenimiento y su origen se determina un tiempo razonable para su modificaci贸n y prueba, haci茅ndolo del conocimiento del usuario. 

Si se trata de un mantenimiento correctivo, los cuales son m谩s comunes, se verifica y reproduce el problema, o se estudia la viabilidad del cambio propuesto por el usuario. En ambos casos se identifican, seg煤n el tipo de mantenimiento de que se trate, cu谩l es la m谩s adecuada. El plazo y urgencia de la soluci贸n a la petici贸n se establece de acuerdo con el estudio anterior. 

Las tareas de los procesos de desarrollo que va a ser necesario realizar son determinadas en funci贸n de los componentes del sistema actual afectados por la modificaci贸n. Estas tareas pertenecen a actividades de los procesos an谩lisis, dise帽o, desarrollo y pruebas. 

Por 煤ltimo, y antes de la aceptaci贸n del usuario, es preciso establecer un plan de pruebas de regresi贸n que asegure la integraci贸n del sistema de informaci贸n afectado.


---

## :book: Revisiones peri贸dicas :book:

El monitoreo permanente del sistema asegura que las necesidades de mantenimiento sean identificadas y satisfechas cuando resulte necesario. Cuando el sistema es de uso prolongado, se puede establecer un mecanismo para recibir retroalimentaci贸n de los usuarios como una forma efectiva para determinar las necesidades de mantenimiento y modificaci贸n. 

A los sistemas se les debe dar mantenimiento para asegurar que contin煤en operando en el nivel mostrado durante la etapa de prueba. Si los sistemas se deterioran, existe el riesgo de que no se desempe帽en conforme a los est谩ndares requeridos.

### :star: Problemas comunes a la hora de hacer casos de prueba

#### Demasiado espec铆fico: ejecute solo una condici贸n de prueba espec铆fica

Los casos de prueba deben considerar una variedad de condiciones que se espera que maneje el software. El caso de prueba debe poder probar exhaustivamente el m贸dulo de software con casi todas las combinaciones posibles de condiciones principales.
Para poder probar exhaustivamente todas las combinaciones de condiciones, el probador de software debe encontrar una manera de presentar estas condiciones de manera que sea f谩cil de seguir, revisar y modificar para otros si el proceso del mundo real exige tales acciones.

#### Cubrir una peque帽a parte de la funcionalidad: necesitan probar una parte m谩s grande del sistema

Los casos de prueba a menudo se centran en una funci贸n espec铆fica. A menudo, esta funci贸n est谩 determinada por el dise帽o t茅cnico interno del software. Tales pr谩cticas a menudo se encuentran en grandes aplicaciones monol铆ticas como SAP u Oracle ERP, donde un probador de software no siempre puede tener conocimiento de todo el proceso comercial, por lo que el caso de prueba nunca termina reflejando lo que el dise帽ador de prueba no sabe, pero deber铆a tener. hizo el esfuerzo de comprender.

En cambio, los casos de prueba deben reflejar los patrones y flujos de uso. Cada caso de prueba debe tratar de cubrir la mayor parte del flujo que sea razonablemente posible, cruzando los l铆mites t茅cnicos y modulares de la aplicaci贸n.

#### Prueba de software creada solo para un rol de usuario espec铆fico

A menudo hemos visto casos de prueba escritos para un rol de usuario muy espec铆fico, sin tener en cuenta a todos los dem谩s usuarios de la aplicaci贸n. Esto limita el alcance de los casos de prueba y, por lo tanto, compromete significativamente su efectividad. Dichos casos de prueba prueban efectivamente solo peque帽os elementos de la aplicaci贸n, mientras que enga帽osamente pretenden ser casos de prueba completos y s贸lidos.

Los casos de prueba que son m谩s efectivos reflejan los patrones de uso, o lo que el mundo Agile denomina viajes de usuario. Una aplicaci贸n comercial, por ejemplo, debe probarse con casos de prueba dise帽ados para probar todo el proceso comercial, cubriendo todos los roles de usuario y todos los sistemas que podr铆an estar involucrados en el proceso comercial.

#### Escrito para demostrar que los casos de uso m谩s comunes est谩n bien cubiertos en la aplicaci贸n

Esto es uno de los problemas m谩s comunes y es el resultado de lo que yo llamo un enfoque 'perezoso' para el dise帽o de pruebas. El dise帽ador de pruebas simplemente convierte el documento de requisitos en casos de prueba.

En cambio, el dise帽ador de la prueba debe buscar los "casos de esquina" o las "condiciones de contorno". La mayor铆a de los desarrolladores pueden escribir f谩cilmente c贸digo para los casos de uso m谩s comunes. Los problemas surgen en el momento en que hay una condici贸n que es incluso ligeramente diferente al caso de uso m谩s com煤n o previsto. Un caso de prueba bien dise帽ado los detectar谩 de manera f谩cil y consistente.


#### Catalogaci贸n de casos de prueba y control de versiones

Cualquier caso de prueba puede volverse completamente in煤til si no se cataloga sistem谩ticamente y se mantiene disponible para su uso. Imagine una biblioteca con libros no catalogados y colocados sistem谩ticamente en estantes, especialmente despu茅s de que varios prestatarios se hayan saciado. Ser铆a imposible usar los libros si no puede encontrarlos con facilidad cuando los necesita.

A menudo, cientos de casos de prueba se escriben con mucho esfuerzo y luego se vuelcan en una estructura de carpetas compartidas. Si bien esto puede funcionar si tiene muy pocos casos de prueba, un sistema mal organizado colapsa en el momento en que la cantidad de casos de prueba aumenta m谩s all谩 de un pu帽ado.

Por lo tanto, necesita una herramienta de prueba de software que pueda etiquetar y catalogar sistem谩ticamente los casos de prueba. Luego, su herramienta de prueba de software deber铆a poder "sacar" casos de prueba cuando sea necesario ejecutarlos. Para que todo este proceso sea fluido en todo el equipo de pruebas de software, necesita una poderosa herramienta de pruebas que pueda crear y mantener sin esfuerzo m煤ltiples versiones de casos de prueba.

---

-> **隆Pro tip alert!** Mejorar la eficiencia de los casos de prueba no es un t茅rmino simplemente definido, sino que es un ejercicio y se puede lograr a trav茅s de un proceso maduro y pr谩ctica regular.

El equipo de pruebas no debe cansarse de involucrarse en la mejora de tales tareas, ya que es la mejor herramienta para lograr mayores logros en el mundo de la calidad, esto est谩 probado en muchas de las organizaciones de prueba en todo el mundo en proyectos de misi贸n cr铆tica y aplicaciones complejas.

---


### 馃摉 Escenarios de an谩lisis  馃摉

Te presentamos varios escenarios de an谩lisis en donde veremos aplicados algunos de los conceptos que aprendimos hoy. Te invitamos a que tomes algunos minutos de reflexi贸n con tus compa帽eros de equipo y discutas cada escenario y su respuesta. Cada uno deber谩 exponer las razones por las que elige cada opci贸n. Podr谩n coincidir o no entre ustedes, no se preocupen, intenten llegar a una opini贸n un谩nime, pero de no hacerlo cada uno enviar谩 sus propias respuestas. 
En el formulario de fin de gu铆a encontrar谩s estos mismos escenarios y sus respuestas, env铆enlas de forma individual luego de haberlo discutido. 


- **1 - Javier es tester. Est谩 convencido que puede realizar un buen caso de prueba para rastrear bugs. Luego, una vez resueltos, har谩 una prueba m谩s exhaustiva. De esta forma se asegura terminar con todos los bugs existentes en esa funcionalidad.**

A - Si bien la intenci贸n de Javier es buena, no es una meta realista terminar con todos los bugs.

B - Si Javier quiere terminar con todos los bugs, no debe hacer pruebas m谩s exhaustivas sino pruebas distintas.

C - De acuerdo a la Paradoja del pesticida, al hacer distintas pruebas y m谩s exhaustivas encontraremos m谩s bugs pero sobrevivir谩n aquellos m谩s fuertes, resistentes a los "pesticidas"

D - Javier lograr谩 su cometido de esa forma

- **2 - Laura est谩 escribiendo los pasos de un caso de prueba y se ve de esta forma: 1-Ingresar a la URL 2-Utilizar el motor de b煤squeda para hallar el producto "X" 3-Seleccionarlo, realizar la compra y pagarlo.**

A - Es correcto y f谩cilmente comprensible.

B - El paso 3 de Laura es compuesto. Deber铆a dividirlo en instancias menores.

C - No cumple con las buenas pr谩cticas pero no es incorrecto

D - Al ser un caso tan sencillo, puede dejarlo de esa forma

- **3 - Gonzalo est谩 armando sus casos de prueba. Tiene una cita ma帽ana con recursos humanos para solicitar que contraten a otro Tester ya que su dise帽o incluye una cobertura del 100%. Esta convencido que le aprobar谩n la solicitud debido a que esta cobertura garantizar谩 una excelente calidad en las  pruebas.**

A - Recursos humanos rechazar谩 su petici贸n debido a que deber铆a dise帽ar pruebas con m谩s criterios que s贸lo la cobertura.

B - Recursos humanos aprobar谩 su pedido ya que asegurar la calidad es el objetivo.

C- Recursos humanos aprobar谩 su pedido pero deber谩 reportar luego esa calidad de las pruebas.

D- Recursos humanos rechazar谩 su pedido ya que deber铆a dise帽ar pruebas que 茅l s贸lo pueda ejecutar.

- ** 4 - Raquel esta en la fase de recopilar datos de pruebas. Tiene casos positivos y negativos por ejecutar para un mismo requerimiento. Para ahorrar tiempo, recopilar谩 s贸lo los datos del escenario positivo.**

A - Es suficiente recopilar informaci贸n de ese manera, ya que al tratarse de un mismo requerimiento no precisa de ambos datos.

B - Deber铆a s贸lo recuperar los datos del escenario negativo para garantizar que el sistema funcione s贸lo de la manera esperada.

C - Deber铆a recuperar datos de ambos casos, pero s贸lo si el caso de prueba falla.

D - Deber铆a recopilar datos de ambos casos, ya que tener un enfoque de casos positivos y negativos no s贸lo nos brinda informaci贸n de que el sistema funciona en un escenario positivo, sino que tambi茅n garantizamos que no funcione en escenarios negativos.

- **5 - Juan ha reportado que al probar un inicio de sesi贸n, el sistema permite logearse tanto si introduces la contrase帽a en min煤sculas o may煤sculas.  El administrador deber谩 clasificar este fallo como un mantenimiento:**

A - Adaptativo, ya que se deber谩 hacer una gesti贸n de la base de datos.

B - Correctivo, ya que es un error del producto

C - Evolutivo, ya que es un cambio de adaptaci贸n a un nuevo requerimiento de usuario.

D - Perfectivo, ya que es una mejora en el sistema.

---

## 馃搵  Ejercicios 馃搵 


#### Ejercicio #1

De las siguientes afirmaciones: 驴cu谩les son verdaderas y cu谩les falsas? Marcalas en la siguiente tabla, puedes utilizar esta plantilla. Luego compara las respuestas con tu equipo.

#### Afirmaciones

- La prioridad de un caso de prueba puede ser Cr铆tico, Mayor o Menor

- La cobertura de pruebas me permite indicar cuando probamos lo suficiente

- Las precondiciones son las situaci贸n inicial o previa a la ejecuci贸n de pruebas

- Todos los casos de prueba tienen una misma cantidad de pasos a seguir

- La trazabilidad no ayuda a determinar la cobertura de los requisitos

- El or谩culo es lo que nos dice que resultados tenemos que esperar de determinadas entradas y condiciones de ejecuci贸n

- La duraci贸n es el tiempo en reloj en ejecutar el caso de prueba

- Las evidencias son los resultados esperados de los casos de prueba

- El ID (Identificador) puede repetirse en los casos de prueba

- Al dise帽ar las pruebas, todos los bugs deben ser descubiertos y ninguno sobrevive

- El dise帽o de casos de pruebas en un proceso del cual no se puede llevar control

 
### Ejercicio #2

Una empresa est谩 desarrollando una p谩gina web, y te contrata como Tester para realizar las pruebas de la siguiente p谩gina:

[http://demo.testim.io/](http://demo.testim.io/)

Ingrese al siguiente link: http://demo.testim.io/ (es un sitio armado para pruebas) y realiza lo siguiente:

A- Analiza el sistema, rec贸rrelo e identifique qu茅 funcionalidades que posee

B- Arma una planilla para cargar los casos de prueba

C- Carga los casos de prueba en la planilla

D - Corre los casos de prueba y guarda evidencia de sus resultados. (La evidencia pueden ser capturas de pantalla, GIFs, etc)

E - Comprueba con tu equipo los casos desarrollados y los errores hallados.

F - Arma en equipo una grilla m谩s completa entre todo el equipo

Modelo de un caso de prueba:

![image](https://user-images.githubusercontent.com/72580574/216711866-26333094-44ec-4539-907c-03ad4aaa8f3f.png)


 Puedes utilizar esta plantilla de ejemplo para realizar el ejercicio.

---
