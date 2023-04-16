# :star: MODULO 4 - BASE DE DATOS - MYQSL ||

---

ENCUENTRO 14 / 20

---

## :star: ¡Te damos la bienvenida al encuentro de trabajo N°14!

¿Ya se presentaron? ¿Se conocieron? ¿Tienen algunas dudas para intercambiar? ¿Necesitan ayuda para reforzar contenidos anteriores? ¡Este es el momento!

Tal como realizamos en el encuentro anterior, explicaremos y detallaremos especificidades del Sistema MySQL.

---

## :book: MATERIAL DE LECTURA - Consultas para borrar

## DROP TABLE

La sentencia para eliminar una tabla y por ende todos los objetos asociados con ella es DROP TABLE, donde r es el nombre de una tabla existente.

```SQL
DROP [TEMPORARY] TABLE [IF EXISTS]
    nombre_de_tabla_1 [, nombre_de_tabla_2] ...
    [RESTRICT
| CASCADE]
```

Arriba mostramos la sentencia con todas las opciones que podría tener. 
Pero la misma podría ser tan simple como 
```SQL
DROP TABLE mi_tabla_test;
```

**¿Estás interesado en profundizar sobre este tema?** Te dejamos el siguiente link: [https://dev.mysql.com/doc/refman/8.0/en/drop-table.html](https://dev.mysql.com/doc/refman/8.0/en/drop-table.html) - Tiempo estimado: 15 minutos


---

## :book: MATERIAL DE LECTURA - Consultas para actualizar 

## ALTER TABLE

Esta sentencia sirve para poder modificar una tabla que ya fue creada.

Requiere indicar qué tabla queremos alterar o modificar y qué opciones deben modificarse, 

### ¿NECESITAS UN EJEMPLO? 

```SQL
ALTER TABLE nombre_tabla 
[alter_option [, alter_option] ...]
    [partition_options]
```

Modificaciones más usuales:

- ```RENAME TO nuevo_nombre_de_tabla```

- ```RENAME COLUMN viejo_nombre TO nuevo_nombre```

- ```ADD [COLUMN] (nombre definición)```

- ```DROP [COLUMN] nombre```

- ```MODIFY COLUMN nombre_columns definición_columna```

- ```CHANGE nombre_col_vieja nombre_col_nueva definicion_columna_nueva```

- ```ALTER COLUMN nombre_atributo nuevo_nombre nueva_definición```

Algunos de los cambios que se pueden realizar con la sentencia SQL ALTER TABLE son:

- Añadir una definición de columna a una tabla. Puede crearse con valores nulos o con valores. 

- Eliminar una columna de la tabla. Pero antes de su eliminación deben ser eliminados por ALTER TABLE todas las restricciones que estén definidas sobre esta columna. 

- Eliminar la definición de: llave primaria, foránea o restricciones de ligaduras de integridad (check), existentes para una tabla. Esta acción no elimina a la columna con sus valores, ella permanece tal cual como está, solo se elimina su definición.

- Definir una llave primaria para una tabla. La columna(s) a la cual se le dará esta responsabilidad debe contener previamente valores únicos por fila.

- Definir una nueva llave foránea para una tabla. La columna a definir como llave foránea debe contener previamente valores que corresponden a la llave primaria de otra tabla.

Para ver todas las posibilidades de ALTER TABLE revisá [https://dev.mysql.com/doc/refman/8.0/en/alter-table.html](https://dev.mysql.com/doc/refman/8.0/en/alter-table.html) - Tiempo estimado: 20 minutos


---

## ✋ ¡MANOS A LA OBRA! - Ejercicio #1

Para la realización de los ejercicios que se describen a continuación, es necesario descargar el archivo scriptsBD.zip que contiene algunos scripts con las bases de datos sobre las cuales trabajarán (Archivo scripts.zip: ScriptsDB).

En cada ejercicio se indica el nombre del script que se debe utilizar. Para abrir y ejecutarlos encontrarán un Tutorial Scripts SQL.pdf que les indica cómo hacerlo. 

**¡Comencemos!**

1. Ejecuta un script y crea una base de datos por primera vez. 

1- Abrir el script llamado “superhéroes.sql” y ejecutarlo de modo tal que se cree la base de datos y todas sus tablas. 

2- Analiza el script detenidamente, línea por línea, ayudándote con la guía. Intenta comprender qué pasa en cada sentencia del script. Luego responde:

2.1.  ¿Cuántas columnas posee la tabla “creador”?

a. 0

b. 1

c. 2

d. 3

2.2.  ¿Cuántas columnas numéricas posee la tabla “personaje”?

a. 11

b. 9

c. 10

d. 12

2.3.  ¿Cuántas columnas de la tabla “personaje” pueden ser nulas?

a. Todas las columnas

b. 12

c. 10

d. Ninguna columna

2.4.  ¿Qué significa la primera línea del script?

a. Selecciona la base de datos sobre la cual se aplicarán las siguientes sentencias.

b. Elimina la base de datos al finalizar de ejecutar el script.

c. Elimina la base de datos en caso de ya estar creada.

d. Ninguna de las anteriores

- Elimina la base de datos “superhéroes.sql”.

---

## :book: Consultas de Manipulación de Datos (DML)

## INSERT INTO

En su formato más sencillo, INSERT se utiliza para añadir una sola fila a una tabla. Debemos especificar el nombre de la tabla y una lista de valores para la fila. Los valores deben suministrarse en el mismo orden en el que se especificaron los atributos correspondientes en el comando CREATE TABLE.

### ¿NECESITAS UN EJEMPLO? 

```SQL
INSERT INTO nombre_tabla (columna1, columna2, columna3,...) 
VALUES (valor, valor2, valor3,...);
```

- Nombre_tabla: la tabla en la que se van a insertar las filas o registros.

- (columna1, columna2, columna3,...): representa el campo o campos en los que vamos a introducir valores.

- (valor, valor2, valor3,...): representan los valores que se van a almacenar en cada campo.

Los valores se deben corresponder con cada uno de los campos que aparecen en la lista de campos, tanto en el tipo de dato que  contienen como en el orden en el que se van a asignar.
Es decir, si se indican una serie de campos en un orden determinado, la lista de valores debe especificar los valores a almacenar en dichos campos, en el mismo orden exactamente.
Si un campo no está en la lista, se almacenará dentro de éste el valor NULL, siempre y cuando el campo admita valores null.

---

**Secreto de la industria 1**: INSERT INTO sí es una sentencia que como QA’s podría utilizar con frecuencia. Por ejemplo: si tenemos acceso a la BD (base de datos) de un sistema que debemos testear y necesitamos crear datos de prueba, podríamos insertar los datos directamente en las tablas correspondientes en lugar de ingresarlos manualmente a través de la interfaz de usuario.

---

Una vez que te familiarices con estas sentencias, ejecutarlas para completar tablas con datos puede ser mucho más ágil que ingresar datos y crear registros desde una interfaz de usuario (UI).
De todos modos hay aplicaciones y herramientas que facilitan esta tarea. 

### ¿NECESITAS UN EJEMPLO? 

Mockaroo nos ofrece una interfaz visual amigable para indicar qué tipo de información debemos completar en una tabla (copiamos los nombres de las columnas de nuestra tabla en la sección “Field Name” y elegimos el tipo de dato que corresponde en la columna “Type”).

La columna type no muestra el nombre de tipo de dato SQL, si no una descripción amigable para quienes no dominan este programa. De todos modos, si necesitamos ser más específicos con los tipos de datos que necesitamos que genere, podemos configurar esa función.

![image](https://user-images.githubusercontent.com/72580574/232264166-1a3476b3-ae60-448b-ba69-4777b4ba2c45.png)

Luego especificamos el  formato en el  queremos extraer los datos de test, cuántos registros queremos generar y cuál es el nombre de la tabla que necesitamos completar:

![image](https://user-images.githubusercontent.com/72580574/232264169-2ea7e893-9598-4166-9d2e-050cd9a9acb3.png)

Tenemos la opción de bajar las sentencias en un archivo o previsualizarla

![image](https://user-images.githubusercontent.com/72580574/232264185-73162100-8bd3-4564-afee-62e2c9432703.png)

Con una previsualización alcanza. De aquí se pueden copiar todas las sentencias para completar nuestra tabla con datos de test o la cantidad de líneas que deseemos.

![image](https://user-images.githubusercontent.com/72580574/232264237-be0ac82b-2b0c-459f-ba01-16a714e29ce1.png)


A continuación se presentan tres sentencias que generó Mockaroo con data de test para completar la tabla que indica en la aplicación:

1.
```sql
insert into TEST_DATA (id, first_name, last_name, email, tipo_de_tarjeta, número_de_tarjeta, moneda, pais, ciudad) 
values (1, 'Kaine', 'McClay', 'kmcclay0@acquirethisname.com', 'americanexpress', '372301606637173', 'Peso', 'Argentina', 'Lobos'); 
```

2.
```SQL
insert into TEST_DATA (id, first_name, last_name, email, tipo_de_tarjeta, número_de_tarjeta, moneda, pais, ciudad) 
values (2, 'Noelyn', 'Hurleston', 'nhurleston1@nbcnews.com', 'jcb', '3589679104362250', 'Peso', 'Chile', 'Futaleufú'); 
```

3. 
```SQL
insert into TEST_DATA (id, first_name, last_name, email, tipo_de_tarjeta, número_de_tarjeta, moneda, pais, ciudad) 
values (3, 'Ray', 'Sudworth', 'rsudworth2@indiatimes.com', 'jcb', '3564585478860424', 'Krona', 'Sweden', 'Stockholm'); 
```

---

¡Atención curiosos y curiosas!

Si queres saber todo sobre la sentencia INSERT INTO salta a: [https://dev.mysql.com/doc/refman/8.0/en/insert.html](https://dev.mysql.com/doc/refman/8.0/en/insert.html) - Tiempo estimado: 20 minutos


---

## UPDATE

El comando UPDATE se utiliza para modificar los valores de atributo de una o más filas seleccionadas. Una cláusula WHERE en el comando UPDATE selecciona las filas de una tabla que se modificarán.. La sentencia UPDATE tiene la siguiente forma:

```SQL
UPDATE nombre_tabla
SET nombre_columna1 = valor1,
nombre_columna2 = valor2,
[ORDER BY ...] [WHERE condicion]
```

---

##  DELETE

El comando DELETE elimina filas de una tabla. Incluye una cláusula WHERE, para seleccionar aquellas que se eliminarán.

Las filas se eliminan explícitamente sólo de una tabla a la vez. Sin embargo, la eliminación se puede propagar a filas de otras tablas si se han especificado opciones de acciones referenciales en las restricciones de integridad referencial del DDL.

En función del número de filas seleccionadas por la condición de la cláusula WHERE, ninguna, una o varias filas pueden ser eliminadas por un solo comando DELETE. La ausencia de una cláusula WHERE significa que se borrarán todas las filas de la relación; sin embargo, la tabla permanece en la base de datos, pero vacía. Debemos utilizar el comando DROP TABLE para eliminar la definición de la tabla.

```SQL
DELETE FROM nombre_tabla [WHERE condicion] [ORDER BY ...] [LIMIT cantidad_filas]
```

#### Pasos a realizar para Implementar una Base de Datos:

1. Definir en el disco duro, el área física que contendrá las tablas de la base de datos. Sentencia SQL 🡪 CREATE DATABASE

2. Crear las diferentes tablas de la base de datos. Sentencia SQL 🡪 CREATE TABLE

3. Insertar en las filas los datos a las diferentes tablas, sin violar la integridad de los datos. Sentencia SQL 🡪 INSERT INTO

4. Actualizar los datos que cambian con el tiempo en las diferentes tablas. Sentencia SQL 🡪 UPDATE

5. Eliminar las filas que ya no se requieran en las diferentes tablas. Sentencia SQL 🡪 DELETE

6. Realizar las consultas deseadas a las tablas de la base de datos a través de la poderosa sentencia de consultas del SQL, llamada SELECT

7. Dar nombre a las consultas, elaboradas en el paso No.6 cuando se requiera ocultar el diseño y columnas de las tablas a través de la creación de vistas lógicas. Sentencia SQL 🡪 CREATE VIEW

---

## ✋ ¡MANOS A LA OBRA - Ejercicio #2

¿Recuerdan el Script Superheroes? Volvamos a abrirlo y ejecutarlo. Hasta el momento, nuestra base de datos “superhéroe” se encuentra vacía. Sólo tenemos la estructura (tablas y columnas). Es turno de insertar registros en cada tabla. A continuación, te mostramos el modelo Entidad-Relación.


![image](https://user-images.githubusercontent.com/72580574/232264360-3b271177-e3e0-4196-847f-e30e8fa4d74d.png)

Primero insertar en la tabla “creador” los siguientes datos:


![image](https://user-images.githubusercontent.com/72580574/232264365-95cab7d0-2434-4392-ba69-1b1fc774673c.png)


Luego inserta registros en la tabla personaje


![image](https://user-images.githubusercontent.com/72580574/232264374-9988e99a-5bd4-4f83-8596-83b0c624f23c.png)

¡Felicitaciones! Creaste y completaste tu primera base de datos. A continuación, te pediremos que realices algunos cambios en ella para continuar practicando.

-> Cambiar en la tabla personajes, el año de aparición del personaje Superman a 1938.

-> Eliminar el registro que contiene al personaje Flash. 

---

## Ejercicio extra 1💪

Abran el script llamado “nba” y ejecutenlo de modo tal se cree la base de datos con todas sus tablas. Este proceso puede demorar, es normal y es super importante que lo hagas: ¡ten paciencia! Más adelante la vamos a necesitar esta información.

## Ejercicio extra 2💪

Usando Mockaroo crea las sentencias INSERT INTO para completar alguna/s de la/s tablas que ya tienes creadas. Luego utiliza esas sentencias para completar tu tabla con miles de registros.


---

## ¡Hora de cerrar! 

¿Cómo estás en relación al aprendizaje de este nuevo lenguaje?

¿Podés identificar si hay algo que te abruma? ¿Qué dominas con facilidad?
Siempre revisa tu proceso de aprendizaje... Conocer cómo aprendemos nos permite concentrarnos en mejorar y avanzar en este trayecto formativo. ¡Adelante!

¡Llegó el momento de los pulsos. ¿Te gustaría recibir? Demuéstrales a tus compañeros qué estás presente para promover su aprendizaje y el tuyo también.

---
