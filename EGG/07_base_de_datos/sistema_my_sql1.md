# :star: MODULO 4 - BASE DE DATOS - SISTEMA MYSQL |

---

ENCUENTRO 13 / 20

---

## ¡Te damos la bienvenida al encuentro de trabajo N°13!

Tómense unos minutos para intercambiar dudas e inquietudes de los temas vistos hasta ahora... ¿Necesitan llamar a un mentor? ¡Este es el momento!
A lo largo de esta guía, la información se complejiza. Presten atención, revisen contenidos previos, hagan preguntas y cooperen entre ustedes.

¿Comenzamos?

---

## :book: MATERIAL DE LECTURA - Introducción

Llegó el momento de diseñar una tabla... ¿Qué aspectos hay que tener en cuenta? Los desarrolladores deben ser estrictos y cuidadosos al diseñarlas, para que guarden sólo aquellos datos y caracteres que sean estrictamente necesarios para la información que se desea guardar.

La correcta decisión en el modelado de tablas no solamente cumple una función de seguridad y consistencia de la base, sino que también se relaciona con la velocidad con la que se podrán ejecutar las consultas.
Como tester o QA, es importante que consideres siempre poner a prueba todos los puntos de entrada para el guardado de información en base de datos. 

---

**Secreto de la industria 1**:Revisa que cada campo de formulario y cada input sólo acepte el tipo de dato que corresponde al tipo de campo que estás probando. 

---

###  ¿NECESITAS UN EJEMPLO? 

Un campo “email” solo debería aceptar texto con el siguiente formato: carácteres alfanuméricos y / o algunos tipos de símbolos con al menos un “@” y un “.” entre medio. Lo que sigue después del “.” podría ser una lista específica de extensiones, tales como  .com.ar, .mx. .de, .com, etc. No deberían ser aceptados  .js o .exe.


---

## ✋ MANOS A LA OBRA - Ejercicio #1

¿Por qué les parece que el ejemplo anterior debería ser así?

```
Un campo “email” solo debería aceptar texto con el siguiente formato: 
carácteres alfanuméricos y / o algunos tipos de símbolos con al menos 
un “@” y un “.” entre medio. Lo que sigue después del “.” podría ser 
una lista específica de extensiones, tales como  
.com.ar, .mx. .de, .com, etc. 
No deberían ser aceptados .js o .exe.

-Respuesta:
.exe podría ser la extensión de un ejecutable, 
.js podría ser la extensión de un script con código malicioso 
```

Es imprescindible realizar pruebas para verificar que los campos (que se utilizan como inputs para guardar información en base de datos) sólo admiten el ingreso de los tipos y cantidad de datos correspondientes a lo que se debe guardar en cada uno.

---
---

## :book: Tipos de datos

A continuación veremos tres tipos de datos que pueden guardarse en una tabla y sus características principales.

- **Cadenas de texto-String**

| Nombre | Descripción |
| ------ | ----------- |
| CHAR | Almacena cadenas de longitud fija, puede abarcar entre 1 a 255 caracteres. El campo ocupará siempre el máximo de longitud que se le haya asignado, aunque el tamaño del dato ingresado sea menor. |
| VARCHAR | Almacena cadenas de longitud variable en el rango 1:255. Defino un máximo, pero la longitud de la cadena guardada puede ser menor. |
| TINYTEXT | Texto de longitud variable de hasta 255 caracteres. |
| TEXT | Texto de longitud variable de hasta 65535 caracteres |
| MEDIUMTEXT | Texto de longitud variable de hasta 16777215 caracteres |
| LONGTEXT | Texto de longitud variable de hasta 4.294.967.295 caracteres |
| BLOB | Dato binario que puede almacenar archivos o texto. TINYBLOB, MEDIUMBLOB, LONGBLOB Las búsquedas en un tipo blob son case sensitive |

- **Numérico**

| Nombre | Descripción |
| ------ | ----------- |
| BIT o BOOL | 0 , 1 / False, True |
| TINYINT | Entero. Rango de valores: [-128; 127] – If unsigned (sin signo) rango [0; 255] |
| SMALLINT | Enteros. Rango [-32768; 32767]. If Unsigned [0; 65535] |
| MEDIUMINT | Enteros. Rango [-8388608;8388607]. Unsigned [0; 429967295] |
| INT | Enteros. [-2.147.463.848;2.147.483.647]. Unsigned [0; 4.294.967.295] |
| BIGINT | Enteros. [-9.223.372.036.854.775.808;9.223.372.036.854.775.807]. Unsigned [0; 18.446.744.073.709.551.615] |
| FLOAT (m,d) | Decimales. Se puede especificar cuántos dígitos (m) y cuántos en la parte decimal (d) |
| DOUBLE | Decimal |
| DECIMAL | Almacena los números como cadenas 

- **Fecha**

| Nombre | Descripción |
| ------ | ----------- |
| DATE | Fecha. Formato por defecto: YYY MM DD desde 0000 00 00 a 999 12 31 |
| DATETIME | Fecha y hora. Formato: año-mes-dia hh:mm:ss Rango: 1001-01-01 00:00:00 hasta 9999-12-31 23:59:59 |
| TIME | Hora. Rango: -838 hh, 59m 59s a 838h 59m 59s Formato: hh:mm:ss |
| YEAR | Año. Rango 1901 a 2155 |

Como parte del equipo de testing podrás tener acceso a la base de datos o al menos a la documentación creada para el desarrollo del sistema (por ejemplo diagramas entidad-relación [DER])

Saber en qué tabla se guardarán los datos que serán ingresados a través de la interfaz de usuario (UI) de la aplicación que tendrás que probar y conocer cómo fue construida la tabla (es decir qué tipo de datos soporta) es información valiosa para la creación de casos de prueba.

Para la detección temprana de defectos -durante la etapa estática- podrías revisar como la construcción de las tablas, tipos y longitud de datos que podrá capturar cada campo. 

En esa etapa será momento de poner a prueba las especificaciones y señalar un posible problema.


#### ¿NECESITAS UN EJEMPLO? 

Podrías notar que todos los campos van a soportar VARCHAR(255, es decir cadenas de texto muy largas que pueden no ser necesarias para todos los campos. 

---

## ## ✋ MANOS A LA OBRA - Ejercicio #2

Marca V o F: Justifica y compara tus respuestas con las de tus compañeros.

- Para que exista una relación se requiere de una llave foránea. ¿V o F?

Si, para que exista una relación se requiere una llave foránea. Y también una llave primaria. Para que una relación entre dos tablas exista, la tabla que deseas relacionar debe poseer una clave primaria (PK) o identificador único, mientras que la tabla donde estará el lado dependiente de la relación debe poseer una clave foránea (FK Foreign_Key) o llave foránea de esa clave primaria.


- Pueden existir relaciones entre tablas de muchos a muchos. ¿V o F?

Verdadero


- En un diagrama ERD con una llave dorada se identifica la llave foránea. ¿V o F?

Falso. Con una llave dorada se identifica la clave primaria.


- Existen cuatro tipos de relaciones entre tablas. ¿V o F?

Falso. Existen tres tipos de relaciones entre tablas.


---
---

## :book: ¿Qué es MySQL?

MySQL es un sistema de gestión de bases de datos relacionales (SGBD) multihilo y multiusuario de código abierto basado en SQL. 

Fue diseñado y optimizado para aplicaciones web y puede ejecutarse en cualquier plataforma. A medida que surgían nuevos y diferentes requisitos con Internet, MySQL se convirtió en la plataforma elegida por los desarrolladores web y las aplicaciones basadas en la web. Debido a que está diseñada para procesar millones de consultas y miles de transacciones. La flexibilidad bajo demanda es la característica principal de MySQL. 

Las principales ventajas de este Sistema Gestor de Bases de datos son:

- Facilidad de uso y gran rendimiento.

- Facilidad para instalar y configurar.

- Soporte multiplataforma.

- Soporte SSL.

La principal desventaja es la escalabilidad, es decir, no trabaja de manera eficiente con bases de datos muy grandes que superan un determinado tamaño.

---

**Secreto de la industria 2**: ¿Porqué SQL para Testers / QA’s?

- Entender cómo funciona el sistema / tecnología mejora nuestras capacidades de testear

- Amplía nuestras herramientas de debugging

- Permite setear data de testing con más rapidez

- Empleabilidad

---

## :book: Lenguaje de consulta estructurado SQL

SQL es un acrónimo en inglés para Structured Query Language, un lenguaje de Consulta Estructurado.


Es un tipo de lenguaje de programación que permite acceder, manipular y descargar datos de una base de datos mediante comandos, mejor conocido como consultas (Querys). 

Tiene capacidad de hacer cálculos avanzados y álgebra. Es utilizado en la mayoría de empresas que almacenan datos en una base de datos. Ha sido y sigue siendo el lenguaje de programación más usado para bases de datos relacionales.

El lenguaje SQL también se usa para controlar el acceso a datos y para la creación y modificación de esquemas de Base de datos. SQL utiliza los términos tabla, fila y columna para los términos relación, tupla y atributo del modelo relacional formal, respectivamente. Por lo tanto, es posible utilizar todos estos términos indistintamente.

Existen varios tipos de sentencias SQL y se clasifican en:

- Sentencias de manipulación de datos (DML)

- Sentencias de Definición de datos (DDL)

- Sentencias de control de acceso o control de transacciones (DCL)

Veamos en profundidad cada una de estas:

1. **Lenguaje de Definición de Datos (DDL)**: Permite crear y definir nuevas bases de datos, campos e índices.

- **CREATE**: Crea nuevas tablas, campos e índices.

- **DROP**: Elimina tablas e índices.

- **ALTER**: Modifica las tablas agregando campos o cambiando la definición de los campos.

2. **Lenguaje de Manipulación de Datos (DML)**: Permiten generar consultas para ordenar, filtrar y extraer datos de la base de datos.

- **SELECT**: Consulta registros de la base de datos que satisfagan un criterio determinado.

- **INSERT**: Carga lotes de datos en la base de datos en una única operación.

- **UPDATE**: Modifica los valores de los campos y registros especificados.

- **DELETE**: Elimina registros de una tabla de una base de datos.

3. **Control de acceso (DCL)**: Permiten generar consultas para ordenar, filtrar y extraer datos de la base de datos.

- **COMMIT**: Es para commitear / llevar a cabo / confirmar una transacción

- **ROLLBACK**: Deshace una transacción. No todos los resultados de las transacciones se pueden deshacer

- **REVOKE**: Quita privilegios

- **GRANT**: Asigna privilegios

- **START**: Inicia una transacción

Utilizando una herramienta visual como Workbench es posible que no se necesite escribir sentencias DCL, ya que la herramienta tiene una interfaz para ejecutar esas sentencias de manera fácil e intuitiva con opciones visuales. 

Si estuvieras consultando una base de datos desde un terminal, entonces sí utilizarías algunas de las sentencias mencionadas.

---

## :star:  Scripts

Los scripts son fragmentos de código. Podremos encontrar scripts de distintos lenguajes y con diversos objetivos. Cuando hablamos de scripts de bases de datos éstos contienen consultas específicas a la base de datos que se utilizan para compartir con otras personas. En general encontraremos dos funciones principales:

- **Scripts para compartir bases de datos**. Al ejecutar este tipo de scripts podremos obtener una misma base de datos que otra persona.

- **Scripts para compartir consultas a una base de datos específica**. Al ejecutar este tipo de scripts podremos obtener consultas que podrían guardarse en nuestros ordenadores en caso de ser muy  complejas o utilizarse a diario.


---

**TIP** 😀 En este módulo utilizaremos mucho los scripts para realizar ejercitación. Encontrarás más material al respecto conforme avanzamos en la guía.


---

## :star: Consultas de Definición de Datos (DDL)

Estas son las consultas que vamos a escribir en nuestro software de base de datos para crear, actualizar, borrar, acceder y manipular información de nuestra base de datos.

- **Consultas para crear**

Estas son las cuatro opciones de sentencias para crear una base de datos nueva:

```SQL
CREATE DATABASE nombre_base_datos
```

```SQL
CREATE SCHEMA nombre_base_datos
```

```SQL
CREATE DATABASE [IF NOT EXISTS] nombre_base_datos
```

```SQL
CREATE SCHEMA [IF NOT EXISTS] nombre_base_datos
```

**¡Atención! CREATE SCHEMA o CREATE DATABASE son sinónimos.**

Algunas aclaraciones: 

1. Para poder crear una base de datos, el usuario que la crea debe tener privilegios de creación asignados.

2. IF NOT EXISTS significa: SI NO EXISTE: la cláusula IF EXISTS devuelve una Advertencia en caso de que no exista la tabla a eliminar.

3. No se pueden crear dos bases de datos con el mismo nombre en el mismo servidor.

---


**TIP** 😀 Afortunadamente MySQL está muy bien documentado. Puedes acceder al manual y buscar en la documentación por palabra clave en su página oficial https://dev.mysql.com/doc/


---

## :star: Veamos cómo crear una tabla:

```SQL
CREATE TABLE
```

```CREATE TABLE``` crea una tabla con el nombre que le asignes. La sentencia puede ser tan simple como:

```SQL
CREATE TABLE tabla_test (
 campo1, 
 campo2, 
 campo3)
```

O tener ciertas opciones y restricciones para sus campos, lo que la hace ver un poco más compleja.

```SQL
CREATE [TEMPORARY] TABLE [IF NOT EXISTS] nombre_de_tabla (
 campo1 tipoDato [NULL/NOT NULL] | CHECK (expresiónLógica) | [
 DEFAULT expresiónConstante],
 campo2 tipoDato [NULL/NOT NULL] | CHECK (expresiónLógica) | [
 DEFAULT expresiónConstante ],
 campo-N,
 PRIMARY KEY(campo_llave),
 FOREIGN KEY (campo_llave) REFERENCES tabla2 (campo_llave-tabla2))
```

### ¿NECESITAS UN EJEMPLO? 

```SQL
CREATE TABLE Vehiculos (
    idVehiculo INT(6) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(20) NOT NULL,
    Precio DOUBLE,
    Marca VARCHAR(20) NOT NULL,
   	Stock INT(6) NOT NULL,
    Publicado BOOLEAN DEFAULT false
);
```

El ejemplo de arriba crea una tabla de nombre “Vehiculos” con 6 columnas.

- La columna idVehiculo admite solamente hasta 6 enteros positivos, no puede quedar vacía, se auto completa e incrementa automáticamente cada vez que se agrega un registro a la tabla y es la clave primaria de la tabla.

- Las columna nombre y marca admiten cadenas de texto de hasta 20 caracteres y no puede quedar vacía

- La columna precio admite decimales

- La columna stock admite solamente números enteros y no puede quedar vacía 

- La columna publicado solo admite el tipo de dato es booleano, es decir 1 y 0. 0 es considerado Falso y 1 es considerado Verdadero.


---

**Nota para curiosos**: Como QA es posible que nunca necesites ni crear una base de datos ni crear tablas nuevas. Sin embargo es útil conocer para qué sirven estas sentencias y qué significan cada uno de sus componentes. Esto te permitirá interpretar mejor la documentación debes revisar.
Si queres leer todo sobre la sentencia CREATE TABLE en MySQL 8 podes ver: [https://dev.mysql.com/doc/refman/8.0/en/create-table.html](https://dev.mysql.com/doc/refman/8.0/en/create-table.html)

---

## :star: Atributos de las columnas - CONSTRAINTS

Los Constraints por su nombre en inglés o restricciones (por su traducción) son atributos que se usan para especificar reglas que deberán cumplir los datos ingresados en cada columna.

- **DEFAULT**: Esta restricción asigna un valor específico a una columna cuando éste, no fue explícitamente proporcionado para tal columna en una sentencia "INSERT" o de adición de un nuevo registro en la tabla.

- **CHECK**: Especifica los valores de datos que el DBMS acepta le sean ingresados para una columna.

- **REFERENCES**: Específica los valores de datos que el DBMS acepta le sean ingresados para una columna.

- **PRIMARY KEY**: Se usa para identificar los datos de qué columnas se utilizarán como llave primaria. Tener una llave primaria de la columna no contendrá valores duplicados. Los valores nulos no están permitidos para este tipo de restricción.

- **UNIQUE**: indica que la columna no tendrá ningún valor repetido. Similar a Primary Key, pero a diferencia de ésta última, permite un valor nulo, y puede haber varias columnas de este tipo en una tabla.

- **FOREIGN KEY**: En esta restricción se define una llave foránea, una columna o combinación de columnas en las cuales su valor debe corresponder al valor de la llave primaria en la misma u en otra tabla.

- **NOT NULL**: indica que una columna no puede ser NULL. NULL constituye un valor en sí (valor desconocido). No es vacío en un campo de tipo texto, ni 0 en un campo numérico.

- **BINARY**: indica que los valores en esta columna se almacenarán en modo binario, respetando mayúsculas y minúsculas

- **UNSIGNED**: indica que esta columna no usará un byte para el signo, o sea que permitirá almacenar números positivos solamente.

- **ZERO FILL**: indica que el contenido del campo se completará con ceros si es numérico.

- **AUTO_INCREMENT**: el motor de base de datos incrementará automáticamente su valor. Una tabla sólo puede tener un campo autoincremental y éste tiene que formar parte de la PK
 
- **ENUM**: es como un single option field. permite hacer que solo puedas elegir entre x y z opciones

---

## Extra credits:

Si queres leer más sobre este tema podes ver [https://www.w3schools.com/sql/sql_constraints.asp](https://www.w3schools.com/sql/sql_constraints.asp)

---


### ¡Hora de cerrar! 

¡¡Bravo!! Seguimos profundizando en aspectos teóricos de este módulo. No es fácil, ¡lo sabemos!... Estamos seguros de que pronto dominarás todos los contenidos vistos hasta aquí.

¡Llegó el momento de los pulsos. ¿Te gustaría recibir alguno? Demuéstrales a tus compañeros qué estás presente para promover su aprendizaje y el tuyo también.




---


