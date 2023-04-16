# :star: MODULO 4 -  Modelo Relacional

---

ENCUENTRO 12 / 20

---

## ¡Te damos la bienvenida al encuentro de trabajo N°12!

Seguiremos profundizando en las bases de datos que, como mencionamos anteriormente, serán de tipo relacionales. ¿Are we ready?

---

## :book: MATERIAL DE LECTURA  - Base de datos relacionales 

Las bases de datos relacionales se basan en el modelo relacional, una forma intuitiva y directa de representar datos en tablas. En este tipo de base de datos cada fila de la tabla es un registro único que posee un identificador específico llamado **clave primaria** o **llave primaria** (**PK** - **Primary_Key**). 

Las columnas de una tabla se corresponden con los atributos de los datos, y cada fila es un registro que (generalmente) tiene un valor para cada atributo. Ésto, facilita el establecimiento de las relaciones entre los datos:

## ¿NECESITAS UN EJEMPLO? 


![image](https://user-images.githubusercontent.com/72580574/232262306-7ab1765d-c482-48f7-b016-25cd847d2fa0.png)

---

## ✋ ¡MANOS A LA OBRA! - Ejercicio #1

Debatan en equipo:

- ¿Qué es una base de datos?

- ¿Cuáles son las características principales de cada tipo?

---

## :book: ¿Qué es un modelo de base de datos?

Se denomina así a la estructura lógica que adopta la base de base datos, incluyendo las relaciones y limitaciones que determinan cómo se almacenan, organizan y se accede a los datos. 

Un modelo de base de datos también define qué tipo de operaciones se pueden realizar con los datos, es decir, determina cómo se manipulan los mismos, proporcionando la base sobre la que se diseña el lenguaje de consultas.

En general, prácticamente todos los modelos de base de datos pueden representarse a través de un diagrama de base de datos (NO se preocupen, más adelante veremos algunos)


## :star: Modelo relacional

El modelo relacional que se utiliza para el modelado y la gestión de bases de datos, es un modelo de datos basado en la lógica de predicados y en la teoría de conjuntos. Este modelo de bases de datos fue creado por un científico informático inglés llamado Edgar Frank "Ted" Codd a finales de los 60’. Su idea fundamental es el uso de relaciones.

Estas relaciones podrían considerarse en forma lógica como conjuntos de datos. Dichos conjuntos de datos, se denominan tuplas. 

Pese a que ésta es la teoría de las bases de datos relacionales creadas por Codd, en muchas ocasiones se conceptualiza de una manera más fácil de imaginar, pensando en cada relación como una tabla que está compuesta por registros (cada fila de la tabla sería un registro o “tupla”) y columnas (también llamadas “campos”).

Es el modelo más utilizado en la actualidad para modelar problemas reales y administrar datos dinámicamente.

Este modelo se basa en que todos los datos están almacenados en tablas (también llamadas entidades o relaciones) y cada una de es un conjunto de datos, por lo tanto una base de datos es un conjunto de relaciones.

Las tablas están formadas por:

- **Filas** (tuplas, **registros**) en donde se describen los elementos que configuran la tabla (es decir, los elementos de la relación establecida por la tabla).

- **Columnas** o **campos**, con los **atributos** y **valores** correspondientes

- **Dominio**; concepto que agrupa a todos los valores que pueden figurar en cada columna.

## Características del modelo relacional


![image](https://user-images.githubusercontent.com/72580574/232262363-a4bbbae6-b87e-4651-927e-ff75a93cdd3a.png)


Para que una tabla sea considerada como una relación tiene que cumplir con lo siguiente:

- Cada tabla debe tener un nombre único.

- Los datos de cualquier columna corresponden a un solo tipo de dato (por ejemplo cadena, entero, doble).

- Las columnas de una relación se conocen como atributos.

- El orden de los atributos no afecta: los atributos no están ordenados.

- Cada atributo de la tabla solo puede tener un valor en cada tupla.

- Cada atributo tiene un nombre único en cada tabla (aunque pueden coincidir en tablas distintas)

- Cada atributo tiene un dominio.

- El orden de las filas no importa

- No se permiten filas repetidas mediante la clave primaría.

- No existen 2 filas en la tabla que sean idénticas.

- Los valores de los atributos son atómicos: en cada tupla (fila), cada atributo (columna) toma un solo valor. Esto aporta a la normalización de la base de datos.


## :star:  Relaciones

Uno de los aspectos fundamentales de las bases de datos relacionales son precisamente las relaciones. En pocas palabras, una “relación” es una asociación que se crea entre tablas, con el fin de vincularlas y garantizar la integridad referencial de sus datos.

Una relación es la abstracción de un conjunto de asociaciones que existen entre las tablas de dos tuplas.

#### ¿NECESITAS UN EJEMPLO? 

Existe una relación entre Película (tabla Película) y Director (tabla Director).
Para que una relación entre dos tablas exista, la tabla que deseas relacionar debe poseer una clave primaria (PK) o identificador único, mientras que la tabla donde estará el lado dependiente de la relación debe poseer una **clave foráne**a (**FK Foreign_Key**) o **llave foránea** de esa clave primaria.


- Las relaciones tienen sentido bidireccional.

- Las relaciones existen ya que las entidades representan aspectos del mundo real y en este mundo, los componentes no están aislado, sino que se relacionan entre sí; es por esto que las relaciones entre las entidades son necesarias 


## :star:  Tipos de relaciones

Las bases de datos relacionales tienen diversos tipos de relaciones que se utilizan para vincular las tablas.

Este vínculo dependerá de la cantidad de ocurrencias que tiene un registro o fila de una tabla dentro de otra tabla (esto se conoce como cardinalidad).

Veamos entonces estos tipos de vínculos o relaciones:

- **Relaciones uno a uno**: Se presentan cuando un registro de una tabla sólo está relacionado con un registro de otra tabla y viceversa.


#### ¿NECESITAS UN EJEMPLO? 

Una empresa necesita almacenar datos de contacto de sus empleados  En este caso la relación puede establecerse de la siguiente manera:

-Un empleado tiene **una sola** información de contacto.

-Y una información de contacto pertenece a **un solo** empleado.

Dado que la información de contacto es la que depende principalmente del empleado, es en ella donde existirá la clave foránea para representar el vínculo.

- **Relaciones uno a muchos/muchos a uno**: esta relación es un poco más compleja que la anterior. Por tal motivo utilizaremos las tablas A y B para su explicación. Una relación de uno a muchos se presenta cuando un registro de la tabla A está relacionado con ninguno o muchos registros de tabla B, pero este registro en la tabla B sólo está relacionado con un registro de la tabla A. 

#### ¿NECESITAS UN EJEMPLO? 

Supongamos que tenemos ciudades en las cuales viven nuestras personas, pero cada persona solo puede pertenecer a una ciudad. Para este caso, pudiésemos leer la relación de esta manera: 

-Una ciudad tiene **muchas** (o ningún) personas.

-Y una persona vive en una **sola** ciudad.

Dado que la persona es la que necesita de la ciudad, es en ese dato (la persona) en donde existirá la clave foránea para representar el vínculo.

- **Relaciones muchos a muchos**: Estas son las relaciones más complejas, se presentan cuando muchos registros de una tabla se relacionan con muchos registros de otra tabla.

#### ¿NECESITAS UN EJEMPLO? 

Supongamos que los empleados de una fábrica trabajan en turnos. 

Juan trabaja en el turno de la mañana y de la noche, pero en el turno de la mañana trabajan Juan, Pedro y María.

Para este tipo de relación se crea una tabla intermedia conocida como tabla asociativa. Por convención, el nombre de esta tabla debe estar formado por el nombre de las tablas participantes (en singular y en orden alfabético) separados por un guión bajo `(_)`.  Esta tabla está compuesta por las claves primarias de aquellas que se relacionan con ella, así se logra que la relación sea de uno a muchos, en los extremos, de modo tal que la relación se lea:

-Un empleado trabaja en **muchos** turnos.

-Y un turno tiene **muchos** empleados.

La tabla recibirá las llaves primarias como llaves foráneas.


#### ¿NECESITAS OTRO EJEMPLO? 

A continuación les presentamos dos tablas: ticket y producto. En el registro “Ticket” se reflejan las compras del supermercado que incluye varios productos. 

Los productos cargados en el ticket podrán ser visualizados a través de la tabla intermedia. Allí, podemos ver que tenemos dos productos asociados al id_ticket de valor 915. Por lo tanto, el ticket 915 tiene registro de compra de Pan (6714) y Agua (3452). Sin embargo, al mismo tiempo un producto puede ser comprado por varios clientes. Esta es una relación de muchos a muchos. Las tablas se verían así:

![image](https://user-images.githubusercontent.com/72580574/232262520-353723f3-0944-46d7-b105-918ccd34810f.png)

Tabla intermedia

![image](https://user-images.githubusercontent.com/72580574/232262525-b055b82d-6e62-4efc-bfbb-7191d94c93ec.png)


---


## ✋ ¡MANOS A LA OBRA! - Ejercicio #2

Hemos abordado temas centrales y pensamos que es oportuno analizar algunas definiciones. Por ello, te proponemos respondas las siguientes preguntas a fin de asentar mejor algunos conceptos clave. 
Tómate unos minutos para responderlas solo y luego comparte con tu equipo para buscar coincidencias y enriquecer tus respuestas. 

1. ¿Qué es una base de datos?

a. Un conjunto de datos organizados de manera aleatoria.

b. Una colección organizada de datos no estructurados.

c. Una tabla que posee filas y columnas que estructuran la información.

d. Una colección organizada de información estructurada.

**respuesta** d. Una colección organizada de información estructurada.

2. ¿Qué es una tabla?

a. Las tablas constituyen la base de datos y organizan la información.

b. Una tabla es una estructura organizada para almacenar información.

c. Una tabla posee filas y columnas, en apariencia, es similar a una hoja de cálculo.

d. Todas son correctas.

**respuesta**: d. Todas son correctas.

3. ¿Cuál de estos no es un tipo de base de datos?

a. Base de datos no relacional

b. Base de datos relacional

c. Base de datos imperativa

d. Base de datos orientada a objetos

**respuesta**: c. Base de datos imperativa

4. ¿Cuál de estas SI es una ventaja al trabajar el almacenamiento de los datos con bases de datos en lugar de hojas de cálculo?

a. Los datos están más protegidos.

b. Hay mayor repetición de datos.

c. Existe mayor eficiencia en la codificación, pero no en la captura.

d. Los datos dependen de las aplicaciones que los usan.

**respuesta**: a. Los datos están más protegidos.

5. En las bases de datos relacionales existe un elemento clave que identifica a cada registro o fila y la hace única, ¿cómo se llama ese elemento?

a. Clave única

b. Clave foránea

c. Llave primaria

d. Llave maestra

**respuesta**: c. Llave primaria -> **PK** / Primary Key

---
---

## :book: Diagramas DER

Los diagramas de relación de entidades (Diagrama Entidad Relación) son representaciones visuales de bases de datos que muestran cómo los elementos dentro de una base de datos están relacionados entre sí. 

Un ERD se compone de dos tipos de objetos: entidades y relaciones. Las entidades ( tablas) y las relaciones tienen finales de línea especiales llamados cardinalidades que describen cómo dos elementos de la base de datos interactúan entre sí.

#### ¿NECESITAS UN EJEMPLO?

![image](https://user-images.githubusercontent.com/72580574/232262640-aa9ae018-a514-4c3c-941f-4dcc4ce8610a.png)


Estos diagramas servirán para representar las relaciones previamente mencionadas. Para ello, existen las siguientes líneas que unen las tablas entre sí:


![image](https://user-images.githubusercontent.com/72580574/232262646-699ce9d7-ea2c-4649-a109-33033e124f37.png)



####  ¿NECESITAS UN EJEMPLO? 
Teniendo en cuenta las líneas que se utilizan para cada relación, analicemos cómo serían cada una de ellas: 

- Relaciones uno a uno

![image](https://user-images.githubusercontent.com/72580574/232262655-38caea5b-ba90-46cd-a4c6-234cf40a1786.png)

- Relaciones uno a muchos / muchos a uno

![image](https://user-images.githubusercontent.com/72580574/232262663-8e390193-01e2-48ba-aec9-a52fa65c0ec1.png)

- Relaciones muchos a muchos.

![image](https://user-images.githubusercontent.com/72580574/232262669-568250b6-20d6-4d31-963f-b77f9e8487d9.png)


---

## :star:  ¿Dónde se almacenan los datos de las bases de datos relacionales?

Para aprovechar al máximo la flexibilidad de una base de datos, los datos deben organizarse en tablas evitando redundancias. 

En una tabla de base de datos, los datos se almacenan en filas y columnas asimilando su apariencia a una hoja de cálculo

Siguiendo el caso de los empleados, si se desea almacenar información sobre ellos, cada uno debe especificarse una única vez en la tabla configurada para la información personal. En tanto que, los datos sobre los productos se almacenarán en su propia tabla y, finalmente, los datos sobre las sucursales se almacenarán en una tabla diferente. Este proceso se denomina normalización y lo abordaremos con más profundidad.

## Componentes de una tabla

Cada tabla debe tener un nombre único en la base de datos

- Las tablas están compuestas por filas (registros) y campos (columnas)

- Una base de datos generalmente está compuesta de varias tablas

- Cada fila de una tabla se denomina registro. En los registros se almacena información. 

- Cada registro está formado por uno o varios campos. Los campos equivalen a las columnas de la tabla. Los nombres de columnas son atributos de la entidad.



#### ¿NECESITAS UN EJEMPLO? 

En una tabla llamada "Empleados" cada registro (fila) contiene información sobre un empleado distinto y cada campo (columna) contiene otro tipo de información, atributos como nombre, apellido, dirección, etc. 
Los campos deben designarse como un determinado tipo de datos, ya sea texto, fecha u hora, número o algún otro tipo. Veamos una tabla de Empleado:

![image](https://user-images.githubusercontent.com/72580574/232262691-612a503f-7951-46ce-a6a2-505ee6dcd6d3.png)


---

## :star:  Elementos del modelo relacional


![image](https://user-images.githubusercontent.com/72580574/232262699-5d7ec41a-98d8-4476-961f-fba1c97371ac.png)


- **Atributos (nombres de columnas)**: Un atributo en el Modelo Relacional representa una propiedad. En la tabla cada nombre de columna representa un atributo (propiedad) y es equivalente al atributo del Modelo Entidad-Relación. 

-Un atributo en una tabla representa un atributo o propiedad de una clase entidad.

-Los atributos (columnas) de una misma tabla no pueden nombrarse de igual manera. Cada atributo debe poseer un nombre único.

Por ejemplo, la información de los estudiantes de un curso se representa mediante la tabla Estudiantes, y posee cuatro atributos (representadas en columnas) id_estudiante, nombre, apellido y edad.

- **Dominio**. El dominio dentro de la estructura del Modelo Relacional es el conjunto de valores que puede tomar un atributo.

![image](https://user-images.githubusercontent.com/72580574/232262729-8ff7a1e1-e6fe-4a83-b69c-f16632fba728.png)

-Contiene los posibles valores que puede tomar un determinado atributo. Dos atributos distintos pueden tener el mismo dominio.

-Es un conjunto finito de valores del mismo tipo. Distintos tipos de dominios son: enteros, cadenas de texto, fecha, etc.

- **Tuplas, filas, registros**. Las tuplas son las filas de una tabla que contienen valores para cada uno de los atributos (equivale a los registros). Por ejemplo una “tupla” o fila o registro de una tabla como la de “Estudiantes” podría ser: 34563, José, Martínez, 19. 

-Cada registro de una tabla representa un objeto único. 

-Los datos se encuentran estructurados en una tabla. Cada fila de la tabla está compuesta por campos que contienen datos representando a una entidad.

- **Claves**.Las claves son campos cuyo valor es único para cada registro. 

Hay dos tipos de clave: primaria y foránea

1. **Clave primaria - PK (Primary_Key)**: Se denomina clave primaria o identificador único o llave principal al atributo que identifica a cada instancia de un registro.

Una base de datos relacional está diseñada para imponer la exclusividad de las claves primarias. Esto permite que haya sólo una columna con un valor de clave primaria en una tabla. Por ende, no pueden existir dos instancias de un registro con el mismo valor de llave primaria.

Para mejorar el desempeño de la base de datos se recomienda utilizar claves primarias numéricas. Idealmente, se nombran “id” (abreviación de identificador) seguido por un guión bajo ``(_)`` y el nombre de la tabla. Por ejemplo: id_estudiante.

**Super TIP**: Idealmente las llaves primarias poseen un valor autogenerado y solo puede haber una clave primaria por tabla. Esta, debe ser un valor abstracto de la tabla en sí y su única función será identificar una tupla, diferenciándose de otras

#### ¿NECESITAS UN EJEMPLO?

![image](https://user-images.githubusercontent.com/72580574/232262774-d3e16250-19e7-4931-ae3b-809ff9bbe1b9.png)

En esta tabla “Estudiantes", tendremos dos estudiantes con el mismo nombre y apellido, pero con distintos identificadores y edades, por lo que no se consideran datos duplicados. Si nos basáramos en el “nombre “para evitar datos duplicados, no podríamos ingresar dos alumnos llamados igual. Esta, es otra de las ventajas del identificador único o clave prima.

2. **Clave FORÁNEA - FK Foreign_Key**. Una clave foránea o llave foránea es una columna de una tabla cuyos valores corresponden a los valores de la clave primaria de otra tabla. A veces, esto también se denomina clave de referencia. 

Para asignarle un valor a un campo de llave foránea, se requiere la existencia de una llave primaria con el mismo valor. Asimismo, la relación entre dos tablas coincide con la clave primaria en una de las tablas y con una clave foránea en la segunda tabla.

Por ejemplo, si tenemos las tablas profesor y curso, para relacionarlas, tendríamos, en la tabla curso, una columna de clave foránea cuyo campo será el valor de la clave primaria de la tabla profesor. De esta manera se dice que un profesor específico pertenece a un curso específico. 

Analicemos esto con ayuda del siguiente ejemplo:

![image](https://user-images.githubusercontent.com/72580574/232262790-9f943db5-2f03-4d8d-92c8-e28423836dcc.png)

En este ejemplo la tabla Curso (tabla de la derecha), tiene una columna llamada id_profesor. Ésta columna será la que tendrá las claves foráneas y la que mostrará que hay una relación entre ambas tablas. 

En este ejemplo, la columna id_profesor de la tabla curso, tiene el valor “1” que se corresponde con la llave primaria (id_profesor) de un registro de la tabla Profesor. Esto nos indicaría que Agustín es el Profesor del Curso de Programación. 


---
---


## ✋ ¡MANOS A LA OBRA! - Ejercicio #3

Hemos abordado conceptos nuevos que serán de mucha ayuda y utilidad para seguir avanzando en este curso. 

¿Te parece si repasamos un poco con una actividad?

Responde de manera individual acorde a la información en cada tabla creadas con el programa Workbench. 

Luego comparte con tu equipo las respuestas y acude a ellos en caso de necesitar ayuda.

![image](https://user-images.githubusercontent.com/72580574/232262814-dd045fb5-b3c3-44e2-b17b-e197c1d63b75.png)

1. Localiza en ambas tablas los siguientes elementos: 

-Llaves primarias: de la tabla casa el dato del **id_casa**(163748) y de la tabla usuario el **id_usuario**(854267)

-Llave foránea: en la tabla usuario el **id_casa**(163748)

-Un campo que almacena datos de tipo carácter: en la tabla casa: **Calle**(Avenida El Libertador) -en realida es un vARCHAR, es màs de un caracter- y en al tabla usuario: **nombre** y **apellido** -en realida es un vARCHAR, es màs de un caracter-.

-Los atributos de cada tabla

-Una tupla

2. ¿Cuál es la función de una llave primaria? Selecciona la opción correcta:

a. Una llave primaria identifica a cada registro imposibilitando la repetición de un mismo registro, y por defecto, la redundancia

b. Una llave primaria, debería ser un valor abstracto de la relación y su valor debería ser autogenerado.

c. Una llave primaria es un elemento clave en la relación entre tablas, ya que para la existencia de una llave foránea, se requiere anteriormente, la de una llave primaria.

d. Todas las anteriores son correctas

**Respuesta**: d. Todas las anteriores son correctas


---

## Felicitaciones por el esfuerzo... hoy lo has dado todo!

Sabemos que el encuentro de hoy estuvo cargado de teoría y especificaciones sobre un tema muy complejo como son las bases de datos. Ánimo que es fundamental para tu futuro desempeño laboral. Estamos seguros de que pronto dominarás todos los contenidos vistos hasta aquí.


---

## ¡Hora de cerrar! 

¡Han dado lo mejor! Revisa si las instalaciones que hiciste están correctas: consulta, llama al mentor, coopera con tus compañeros. Se vienen más ejercicios y necesitas afianzar todo los contenidos que mencionamos aquí.

¡Llegó el momento de los pulsos! ¿Te gustaría recibir? Demuéstrales a tus compañeros qué estás presente para promover su aprendizaje y el tuyo también.



---
