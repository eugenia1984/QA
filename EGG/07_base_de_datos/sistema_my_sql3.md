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
