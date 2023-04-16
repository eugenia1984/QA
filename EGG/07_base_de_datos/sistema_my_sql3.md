# :star:  MODULO 4 - BASE DE DATOS - SISTEMA MYSQL |||

---

## :star: ¡Te damos la bienvenida al encuentro de trabajo N°15!

Estamos cerca de llegar a la parte final de Testing Manual. Estamos seguros de que saben lo que tienen que hacer para dinamizar el encuentro. Tómense 5 minutos para presentarse y evacuar dudas, o sumar algún comentario.

¡Seguimos avanzando en la comprensión del Sistema MySQL!

---

## :book: MATERIAL DE LECTURA - Consultas para acceder y manipular información 

## SELECT

La sentencia SELECT es muy poderosa y ampliamente rica en sus cláusulas y variantes permitiendo la capacidad de atender en poco tiempo a consultas complejas sobre la base de datos. Está en el especialista desarrollador de aplicaciones conocerlo en profundidad para explotar sus bondades y virtudes.

Se utiliza para listar las columnas de las tablas que se desean observar al momento de realizar el resultado de una consulta. Además de las columnas se pueden listar columnas a calcular por el SQL cuando actúe la sentencia. Esta cláusula no puede omitirse.

La sentencia SELECT, obtiene y nos permite mostrar filas de la base de datos, también permite realizar la selección de una o varias filas o columnas de una o varias tablas. Para seleccionar la tabla de la que queremos obtener dichas filas vamos a utilizar la sentencia FROM. 

La sentencia FROM lista las tablas de donde se listarán las columnas enunciadas en el SELECT. Esta cláusula no puede omitirse.

#### ¿NECESITAS UN EJEMPLO? 

```SQL
SELECT columna1, columna2, columna3… FROM tablaOrigen; 
```


Ejemplo:
```SQL
SELECT nombre, apellido FROM Alumnos;
```

Teniendo la siguiente tabla de alumnos: 


![image](https://user-images.githubusercontent.com/72580574/232345942-99527348-7882-48c6-9663-7e6ca31c3cac.png)


El resultado que mostraría sería el siguiente: 

![image](https://user-images.githubusercontent.com/72580574/232345953-160423ed-d9cb-4eca-b87a-92ba402650b1.png)



Para mostrar todos los datos de una tabla usamos el símbolo (*). Esto nos mostraría la primera tabla.

```SQL
SELECT * FROM Alumnos;
```

En las consultas SELECT podemos hacer operaciones matemáticas entre los datos numéricos de las tablas que elijamos. Debemos colocar estas operaciones entre paréntesis para separar la operación del resto de la consulta.

---

**TIP**: Como QA’s podemos ayudarnos de este tipo de consultas para buscar datos en la base de datos.

---

- Quizás tenemos un registro de error del cual solo contamos con un Id y necesitamos saber a qué persona, registro o artículo pertenece ese id. 

- Quizás necesitamos encontrar una relación entre un id que tenemos y otra tabla, para investigar algún defecto

- Quizás no recordamos el nombre de algún permiso, o rol o entidad y queremos realizar una consulta rápida para encontrarlo

- O quizás solamente queremos revisar cómo se completan las tablas mientras probamos otras tareas o información desde la interfaz del usuario (UI) para verificar que los datos se almacenan en las tablas correctas. 

---

**SUPER TIP**: Hay muchos usos que un QA puede darle a las sentencias SELECT, a los criterios de filtrado y búsqueda y a los operadores lógicos. ¡Presta atención a las secciones que siguen!


---

**Secreto de la industria**: 🛑¿**WARNING / DANGER: Ojo con el uso la wildcard**🛑 Cuando estés trabajando en un ambiente de testing local o con una base de datos en un servidor local en tu pc, puedes usar esta wildcard ‘*’ para hacer búsquedas amplias y ver los datos de una tabla.

Pero si haces alguna consulta en una base de datos real o para una base de datos en producción, debes ser MUY CUIDADOSO con el tipo de búsquedas amplias. En lo posible intenta evitarlas. 
En producción es importante ahorrar recursos, por ende, siempre trata de realizar las consultas estrictamente necesarias y de forma acotada

Un ``SELECT * FROM tabla`` (es decir seleccionar todo los componentes  de una tabla)  puede ralentizar la base de datos y generar problemas de performance debido a la cantidad de miles de registros existentes.


---

#### ¿NECESITAS UN EJEMPLO? 

Puedes escribir qué columna/s deseas ver y combinar con condiciones de búsqueda o inclusive limitar el número de resultados arrojados

Hay muchas estrategias y ante la duda debes consultar con el equipo de desarrollo qué Query es mejor utilizar cuando estés buscando algo en producción.

```SQL
SELECT nombre,(salario+comision) FROM Empleados;
```


Teniendo la siguiente tabla de Empleados:

![image](https://user-images.githubusercontent.com/72580574/232346029-2e444677-6b58-420d-a0d3-5b622d1dc86f.png)


El resultado que mostraría sería:

![image](https://user-images.githubusercontent.com/72580574/232346043-d5b9b9c4-ff59-4cbf-9dc2-85fdc6ad60fb.png)

A la consulta SELECT podemos sumar cláusulas seguramente alterarán  el resultado de filas que obtenga el SELECT. Esto nos puede servir para traer ciertas filas y evitar algunas que no queremos mostrar. 

---

## :star:  SELECT DISTINCT

Se utiliza cuando queremos traer solo registros diferentes. En las tablas en ocasiones pueden repetirse valores. Para evitarlos usamos esta sentencia.
SELECT DISTINCT nombres de las columnas FROM tablaOrigen; 
SELECT DISTINCT nombre, apellido FROM Alumnos;

#### ¿NECESITAS UN EJEMPLO? 

Teniendo la siguiente tabla de alumnos: 

![image](https://user-images.githubusercontent.com/72580574/232346073-053a1eb3-2956-46ac-ab3c-781cb834445c.png)

![image](https://user-images.githubusercontent.com/72580574/232346080-17417cd8-e1ea-44f3-a504-3f6a613cdef4.png)


El resultado que mostraría sería:


![image](https://user-images.githubusercontent.com/72580574/232346091-891634a1-0373-46d2-810c-1e51fd67cc68.png)




---

## :star: WHERE

Establece criterios de selección de ciertas filas en el resultado de la consulta en base a las condiciones o filtros de búsqueda que se escriban después del WHERE.
Si no se requiere condiciones de búsqueda puede omitirse y el resultado de la consulta serán todas las filas de las tablas enunciadas en el FROM.

#### ¿NECESITAS UN EJEMPLO? 

```SELECT nombres de las columnas FROM tablaOrigen WHERE condición de Búsqueda;```

```sql
SELECT nombre, apellido FROM Alumnos WHERE nombre = “Agustin”;
```

En este ejemplo traerá todos los alumnos con nombre Agustín. Nótese que el nombre está en comillas dobles,ya que es una cadena en la condición si fuese un número no sería necesario.

Teniendo la siguiente tabla alumnos: 

![image](https://user-images.githubusercontent.com/72580574/232346123-e6ffbe72-a98c-4e85-923c-ad927d66931e.png)


El resultado que mostraría sería:

![image](https://user-images.githubusercontent.com/72580574/232346137-9bf65058-37ab-4658-a6ef-b549d3c243df.png)


En las condiciones WHERE podemos utilizar operadores lógicos, operadores relacionales y operadores propios de SQL.

Analicemos en detalle cada uno de estos operadores.

---


## :star: Operadores relacionales

![image](https://user-images.githubusercontent.com/72580574/232346148-d1037983-eb55-4456-8fe8-32ad4fd2e210.png)

En todos estos ejemplos buscamos aquellas filas en donde la edad de un alumno sea mayor, menor, etc, a “x” edad. Usamos edad, pero puede ser cualquier valor numérico o valor de tipo cadena.



---

## :star:  Operadores lógicos

![image](https://user-images.githubusercontent.com/72580574/232346170-7917b0e0-2b3c-4899-ac6d-fe33b3e5a44b.png)

![image](https://user-images.githubusercontent.com/72580574/232346180-974b54db-b1e7-4cf1-80f8-ce7955f24fe6.png)

---


Los operadores lógicos sirven para filtrar resultados basados en más de una condición.

## :star: Operadores propios de SQL

1. **BETWEEN**: El operador BETWEEN selecciona valores dentro de un rango determinado. Los valores pueden ser números, texto o fechas.

#### ¿NECESITAS UN EJEMPLO? 

```
SELECT nombre/s de la/s columna/s FROM tablaOrigen WHERE condición de Búsqueda BETWEEN valor1 AND valor2; 
```

```sql
SELECT * FROM Alumnos WHERE edad BETWEEN 21 AND 40;
```

Usamos edad, pero puede ser cualquier valor numérico o valor de tipo cadena.

Teniendo la siguiente tabla: 


![image](https://user-images.githubusercontent.com/72580574/232346223-ce72ff71-f026-44f3-841f-ac1c8ca92ce4.png)


El resultado sería: 


![image](https://user-images.githubusercontent.com/72580574/232346239-5917e1f6-165c-45b2-b349-75e5677bfc01.png)

![image](https://user-images.githubusercontent.com/72580574/232346247-d7d17341-61fe-4e16-863f-606807b0eaba.png)

2. **2. IN (y NOT IN)**: Los operadores IN y NOT IN sirven para averiguar si el valor de una expresión determinada está dentro de un conjunto indicado

El operador IN te permite especificar varios valores para una condición de una cláusula WHERE. Es un atajo para no escribir varias condiciones OR.

```
SELECT nombre/s de la/s columna/s FROM tablaOrigen WHERE condición de Búsqueda IN (valor1, valor2, valor3, …);
```

```sql
SELECT * FROM Alumnos WHERE nombre IN (“Agustín, “Mariela”, “Juliana”);
```

Usamos “nombre”, pero puede ser cualquier valor numérico o valor de tipo cadena.

#### ¿NECESITAS UN EJEMPLO? 

Teniendo la siguiente tabla de alumnos: 

![image](https://user-images.githubusercontent.com/72580574/232346285-e9a10a23-07ee-4a8a-9186-bcb1dfa4c3a5.png)

El resultado que mostraría sería:

![image](https://user-images.githubusercontent.com/72580574/232346317-e4866a10-086d-4627-9076-cd3f97fb14ab.png)


---

## ¿Estás interesado en profundizar?

Podes probar el operador IN usando esta herramienta de W3S: [https://www.w3schools.com/sql/trysql.asp?filename=trysql_op_in ](https://www.w3schools.com/sql/trysql.asp?filename=trysql_op_in )

---

3. **LIKE(y NOT LIKE)**: El operador LIKE se usa en una cláusula WHERE para buscar un patrón específico en una columna. También se usa cuando queremos utilizar una cadena en una comparación WHERE.

Hay dos símbolos que se utilizan a menudo junto con el operador LIKE:

- El signo de porcentaje (``%``) representa cero, uno o varios caracteres 

- el guión bajo (``_``) para representar un carácter. Estos signos se pueden utilizar por separado o juntos.

Es decir:

``‘%’ Coincidencia con cualquier número de caracteres, incluso ninguno.


``‘_’`` Coincidencia con un único carácter.

```
SELECT nombre/s de la/s columna/s FROM tablaOrigen WHERE condición de Búsqueda LIKE patrón de valores o cadena;
```

```sql
SELECT nombre, apellido FROM Alumnos WHERE nombre LIKE ‘s%’;
```

Esa consulta, lo que hace es traer todos los alumnos donde el nombre empiece con el carácter s.

### ¿NECESITAS UN EJEMPLO? 

Teniendo la siguiente tabla de alumnos: 

![image](https://user-images.githubusercontent.com/72580574/232346493-5587d36c-668d-473c-8e1c-683b6b8e7590.png)

![image](https://user-images.githubusercontent.com/72580574/232346500-5cdcc9a5-f25f-4e51-9910-596d65ad3902.png)

El resultado que mostraría sería:


![image](https://user-images.githubusercontent.com/72580574/232346556-9e33713e-3ea8-43fe-a3ab-b42d5813f0fa.png)

![image](https://user-images.githubusercontent.com/72580574/232346624-b397db58-c923-4cd3-8b5c-8aa7717742ba.png)


---

## ¿Querés saber más?

Ingresá a [https://www.w3schools.com/mysql/mysql_like.asp](https://www.w3schools.com/mysql/mysql_like.asp)



---

##  ¡MANOS A LA OBRA - Ejercicio #1

Veamos cómo ha quedado la tabla “superhéroes” que creaste anteriormente.
Para ello necesitarás una consulta de tipo SELECT.

- Realiza una consulta que devuelva todos los valores de la columna “nombre_real” de la tabla superhéroe.

- Realiza una consulta que devuelva todos los nombres reales de los personajes cuyo nombre empieza con “B”.

---

##  ¡MANOS A LA OBRA - Ejercicio #2

Dadas las siguientes sentencias, explica para cada una qué dato aparecerá como resultado:

A) 
```SQL
SELECT * FROM vehiculos WHERE codigo IN (1,2,3);
```

de la tabla vehículos, los registros que tengan 1, 2 o 3 en la columna código.



B) 
```SQL
SELECT * FROM herramientas WHERE nombre IN (‘Martillo’, ‘Destornillador');
```

de la tabla herramientas, los registros que tengan el termino martillo o el término destornillador en la columna nombre.

C) 
```SQL
SELECT * FROM herramientas WHERE nombre NOT IN (‘Martillo’, ‘Destornillador');
```

de la tabla herramientas, todos los registros que no tengan ni martillo ni destornillador en la columna nombre

D ) 
```SQL
SELECT * FROM productos WHERE nombre LIKE ‘%Electric%';
```

de la tabla productos, todos los registros que en la columna nombre tengan algún término que contenga Electric (el término puede estar rodeado de otros caracteres)


E ) 
```SQL
SELECT * FROM clientes WHERE mail LIKE '%\_%';
```

de la tabla clientes, todos los registros que tengan en la columna mail un guión bajo


F ) 
```SQL
SELECT * FROM articulos WHERE Nombre NOT LIKE '%TV%'
```

de la tabla artículos, todos los registros que en la columna nombre no tengan los carácteres TV 


G ) 
```SQL
SELECT * FROM clientes WHERE mail LIKE '_h%';
```

de la columna cliente todos los registros que en la columna mail tengan como 2do carácter una letra h.


---

4. **ORDER BY**: Esta cláusula  permitirá establecer la columna o columnas sobre las cuales las filas que se mostrarán de la consulta deberán ser ordenadas. Este orden puede ser ascendiente (se agrega la palabra AS) y descendiente (se agrega la palabra DESC al final).

### ¿NECESITAS UN EJEMPLO? 

Esta cláusula puede omitirse.

```
SELECT nombre/s de la/s columna/s FROM tablaOrigen ORDER BY columna ASC|DESC;
```

```sql
SELECT nombre, apellido FROM Alumno ORDER BY nombre ASC;
```

En este caso mostraría los resultados ordenados de manera ascendiente, según el nombre de los alumnos. 

Teniendo la siguiente tabla de alumnos: 

![image](https://user-images.githubusercontent.com/72580574/232346973-2bb89b5b-cabb-4e6c-8cbe-230ac3246b80.png)

El resultado que mostraría sería:

![image](https://user-images.githubusercontent.com/72580574/232346983-f6cd30bc-82bb-41ed-a73b-b37dda1c66b0.png)

---

## MANOS A LA OBRA! - EJERCICIO #3

Pongamos a prueba esta nueva cláusula: order by. 

Seguiremos trabajando con la tabla “superhéroe”. Realiza una consulta que devuelva todos los registros ordenados por “inteligencia”.


---

5. **GROUP BY**: Especifica una consulta sumaria. En vez de producir una fila de resultados por cada fila de datos de la base de datos. Esta consulta agrupa todas las filas similares y luego produce una fila sumaria de resultados para cada grupo de los nombres de columnas enunciados en esta cláusula. 

En otras palabras, esta cláusula permitirá agrupar un conjunto de columnas con valores repetidos y utilizar las funciones de agregación sobre aquellas con valores no repetidos. Esta cláusula puede omitirse.

```
SELECT nombre/s de la/s columna/s FROM tablaOrigen GROUP BY nombres de columna/s por la cual Agrupar;
```

---

## :star: ¿Qué son las funciones de agregación?

Función en la que los valores de varias filas se agrupan bajo un criterio para formar un valor único más significativo. 

En estas funciones se debe colocar: SELECT.

Existen 5 tipos de funciones de agregación, MAX(), MIN(), COUNT(), SUM(), AVG().

Veamos en profundidad cada uno

- **MAX ()**: Esta función retorna el valor más grande de una columna. 

```SELECT MAX(nombre de la columna) FROM tablaOrigen;```

Ejemplo:
```sql
SELECT MAX(salario) FROM Empleados;
```

### ¿NECESITAS UN EJEMPLO? 

Teniendo la siguiente tabla de empleados:

![image](https://user-images.githubusercontent.com/72580574/232347117-f6213c9e-7c8a-4a1f-9c15-a585da596d35.png)

![image](https://user-images.githubusercontent.com/72580574/232347124-55517459-6caa-4aa5-996f-0cc245653381.png)

El resultado que mostraría sería: **MAX(Salario) - 2000**


- **MIN()**: Esta función retorna el valor más chico de una columna.

```SELECT MIN (nombre de la columna) FROM tablaOrigen;```

```sql
SELECT MIN(salario) FROM Empleados;
```

Teniendo la siguiente tabla de empleados: 

![image](https://user-images.githubusercontent.com/72580574/232347162-0d774407-60f8-4802-9a8f-7645512e6649.png)

El resultado que mostraría sería: **MIN(Salario) - 1000**


- **AVG()**: Esta función retorna el promedio de una columna. 

```SELECT AVG(nombre de la columna) FROM tablaOrigen;```

```sql
SELECT AVG(salario) FROM Empleados;


Teniendo la siguiente tabla de empleados: 

![image](https://user-images.githubusercontent.com/72580574/232347189-92bdd9c2-56b6-4d70-b811-25e9cc8808d2.png)

El resultado que mostraría sería: **AVG(Salario) - 1325**

- **COUNT()**: Esta función retorna el número de filas de una columna.

```SELECT COUNT(nombre de la columna) FROM tablaOrigen;```

```sql
SELECT COUNT(Id) FROM Empleados;
```

Teniendo la siguiente tabla de empleados: 


![image](https://user-images.githubusercontent.com/72580574/232347220-ea7d736d-6d35-410b-8d0d-86e48ee04496.png)

El resultado que mostraría sería: **COUNT(Id) - 3***

En este caso ponemos el id, para saber cuántos empleados tenemos en la tabla empleados. 

También podemos usar el **COUNT(*)**. Este no requiere que la enviemos a una columna concreta y cuenta todas filas de una tabla, mostrando tanto los valores repetidos como los valores en null.

![image](https://user-images.githubusercontent.com/72580574/232347245-0a3f9aef-47a9-4dd5-a903-2062abe0993f.png)

El resultado que mostraría sería: **COUNT(Id) - 4**

Entonces, volviendo al Group By, vamos a utilizar esta sentencia junto con las funciones de agregación para agrupar los valores que devuelva dicha función. 

### ¿NECESITAS UN EJEMPLO? 

Existen dos tipos de GROUP BY. 

```sql
SELECT nombre, SUM(salario) FROM Empleados GROUP BY nombre;
```

Teniendo la siguiente tabla de empleados: 

![image](https://user-images.githubusercontent.com/72580574/232347287-6f7e2bf3-bf63-4770-8a40-271245c2e3a2.png)

El resultado que mostraría sería:


![image](https://user-images.githubusercontent.com/72580574/232347295-71628433-dd63-49bc-bf68-4925488bd137.png)


El resultado de la consulta muestra que agrupa todos los nombres repetidos bajo un solo nombre y el salario es la suma de los salarios de las filas que fueron agrupadas.

#### ¿NECESITAS UN EJEMPLO? 

```sql
SELECT COUNT(ID), pais FROM Personas GROUP BY pais;
```

Teniendo la siguiente tabla de personas:

![image](https://user-images.githubusercontent.com/72580574/232347324-a8fe2796-e9e8-4fa1-9c33-c71105b504a6.png)

El resultado que mostraría sería:


![image](https://user-images.githubusercontent.com/72580574/232347339-63809f0b-7e61-4f2e-9260-af12f3dd340a.png)


En la consulta hacemos un count del id de personas para saber cuántos hay, pero al agrupar el resultado por países, nos muestra cuántas personas hay en cada uno.


---

6. **HAVING()**: Esta cláusula le dice al SQL que incluya sólo ciertos grupos producidos por la cláusula GROUP BY en los resultados de la consulta.  Al igual que la cláusula WHERE, utiliza una condición de búsqueda para especificar los grupos deseados. La cláusula HAVING es la encargada de condicionar la selección de los grupos en base a los valores resultantes en las funciones agregadas utilizadas debidas que la cláusula WHERE condiciona solo para la selección de filas individuales. Esta cláusula puede omitirse.

#### ¿NECESITAS UN EJEMPLO? 

```SELECT nombre/s de la/s columna/s FROM tablaOrigen GROUP BY nombres de columnas por la cual Agrupar HAVING condiciónBúsqueda para Group By;```

```sql
SELECT COUNT(ID), pais FROM Personas GROUP BY Personas GROUP BY pais HAVING COUNT(ID) > 1;
```

Teniendo la siguiente tabla de personas: 

![image](https://user-images.githubusercontent.com/72580574/232347383-06cf4ef4-981c-412b-835a-e968f995b063.png)


El resultado que mostraría sería:

![image](https://user-images.githubusercontent.com/72580574/232347395-7cdd9bdb-41cb-4f46-b811-2ab5c36f76c1.png)

![image](https://user-images.githubusercontent.com/72580574/232347403-6d2bbb92-35e7-4af3-ae37-c3a8e3c9eeb6.png)


En la consulta hacemos un COUNT del ID de personas para saber cuántos hay, las agrupamos por países para que nos muestre cuantas personas hay en cada país. Pero, con el HAVING le decimos que nos muestre sólo los resultados donde el COUNT sea mayor a 1, o en otras palabras, mostramos los países que tienen más de una persona.


---

7. **AS()**: La sentencia AS, le da un alias a una o la columna de una tabla, un nombre temporal. El alias existe solo durante el momento de la consulta y se utiliza para darle a una columna un nombre más legible. El alias a asignar es lo que se escribe luego de "AS"

Por ejemplo:
```sql
SELECT person_id AS idPersona > idPersona es el alias que le estoy asignando a person_id
```

### ¿NECESITAS UN EJEMPLO? 

```sql
SELECT nombre/s de la/s columna/s AS alias FROM tablaOrigen;
```

```sql
SELECT nombre AS Nombre Alumno, apellido As Apellido Alumno FROM Alumnos;
```

Teniendo la siguiente tabla de alumnos: 

![image](https://user-images.githubusercontent.com/72580574/232347460-d8afb800-0868-4c00-a403-8c47059e3650.png)

El resultado que mostraría sería:

![image](https://user-images.githubusercontent.com/72580574/232347468-125e98f0-d8de-463c-bf23-43d9769bdc84.png)

Todas estas cláusulas / sentencias pueden ser usadas juntas, no es necesario que las usen separadas. 

```
SELECT nombres de las columnas AS Alias FROM tablaOrigen
WHERE condición de Búsqueda
GROUP BY nombres de columnas por la cual Agrupar
HAVING condiciónBúsqueda para Group By
ORDER BY nombre de columnas [ASC | DESC]
```

---

8. **ROUUND()**: La sentencia round se utiliza para redondear los decimales de un número que se pida en un  select.

### ¿NECESITAS UN EJEMPLO? 

```sql
SELECT AVG(salario) FROM Empleados;
```

![image](https://user-images.githubusercontent.com/72580574/232347531-cef648a0-2bd7-459c-bf81-5a41caac44e0.png)


```sql
SELECT ROUND(AVG(salario)) FROM Empleados;
```

![image](https://user-images.githubusercontent.com/72580574/232347538-898cede4-d6e0-4137-8a6d-4eee22ac3210.png)


---

9. **9. LIMIT**: La cláusula LIMIT se utiliza para establecer un límite al número de resultados devueltos por SQL.


### ¿NECESITAS UN EJEMPLO? 

```sql
SELECT nombres de las columnas FROM tablaOrigen LIMIT numero x;
```

```sql
SELECT nombre, apellido FROM Alumnos LIMIT 1;
```


Teniendo la siguiente tabla de alumnos: 

![image](https://user-images.githubusercontent.com/72580574/232347566-fd057873-39ac-46aa-9d6a-eca9b5e0a1df.png)


El resultado que mostraría sería:


![image](https://user-images.githubusercontent.com/72580574/232347578-ab39a674-26b7-4298-90e6-4e4ef521be54.png)


---

**TIP**: Puedes utilizar la cláusula limit (y quizás también combinarla con condiciones WHERE y ORDER BY) para limitar el número de resultados y visualizar exactamente lo que buscas cuando estés ejecutando consultas en bases de datos productivas. Asi colaboras con mantener la buena performance de la BD.

---

## ¡Hora de cerrar! 

¡Muy buen trabajo! Como mencionamos la guía fue muy larga, lo sabemos, quizás no alcanzaste a leer todo en este encuentro. Lo importante es el esfuerzo y la dedicación. ¡Adelante!

¡Llegó el momento de los pulsos. ¿Te gustaría recibir? Demuéstrales a tus compañeros qué estás presente para promover su aprendizaje y el tuyo también.


---
