# :star: MODULO 4 -  BASE DE DATOS - SISTEMA MYSQL |V

---

## ¡Te damos la bienvenida al encuentro de trabajo N°16y17!

Esta es la última guía del módulo 4. Seguimos analizando características del sistema MySQL. ¿Ya se presentaron? ¡Siempre es buena idea comenzar así!
Presta atención que esta guía durará dos encuentros e incluirá teoría, ejemplos, ejercicios y un checkpoint final.

---

## :book: MATERIAL DE LECTURA - Consultas Multitablas

Como mencionamos previamente, trabajamos con base de datos relacionales. Esto significa que tenemos tablas relacionadas entre sí. Y dentro de esas tablas, tenemos filas relacionadas con filas de otras tablas.
Pero ¿cómo hacemos para traer la información de una tabla y la información de aquella a con la que está relacionada? Una sentencia muy útil para unificar información de tablas relacionales es el JOIN.

1. **SQL JOIN**: La sentencia JOIN, se usa para combinar data o filas de dos o más tablas que tengan un campo en común entre ellas. Usualmente es la llave foránea. 

Los diferentes tipos de JOIN son:


- 1.1 - **INNER JOIN**: El INNER JOIN selecciona todas las filas que tengan un valor en común con la/s tabla/s. Si hay una fila, que no tiene un valor en común con otra tabla no la trae.

![image](https://user-images.githubusercontent.com/72580574/232347773-94d05e14-8eb3-4ff2-8379-758054dc7e05.png)

![image](https://user-images.githubusercontent.com/72580574/232347782-e4195ebe-2f7d-4dc1-92b4-7e459c8582bf.png)

### ¿NECESITAS UN EJEMPLO? 

```SELECT nombre/s de la/s columna/s FROM tabla1 INNER JOIN tabla2 ON tabla1.nombre_columna = tabla2.nombre_columna;
```

```sql
SELECT Nombre, Nombre_curso FROM Profesores INNER JOIN Cursos ON Profesores.Id = Cursos.Id_profesor;
```

Teniendo la siguiente tabla de profesores:

![image](https://user-images.githubusercontent.com/72580574/232347834-ed0ad881-e8ed-482a-aca6-b1934930733b.png)

Teniendo la siguiente tabla de Cursos: 

![image](https://user-images.githubusercontent.com/72580574/232347845-f47aad5a-7812-4443-b602-f1b248f91c40.png)

El resultado que mostraría sería:


![image](https://user-images.githubusercontent.com/72580574/232347854-e7bb037c-2a1c-45c2-8754-f8bb51bd509d.png)


Gracias al INNER JOIN, podemos mostrar todos los nombres de los profesores, junto al curso a cargo. Solemos decir que “es el profesor de x curso, porque tienen asignado su id en la tabla curso.” Y como usamos el INNER JOIN, solo mostramos los profesores que tenían su id en la tabla curso. Esto se debe a la condición que comentamos anteriormente,  en el ON, donde mencionamos que el valor a chequear por posible coincidencia era el id en la tabla profesor y el id_profesor en la tabla curso.

- 1.2 - **LEFT JOIN**: La sentencia LEFT JOIN retorna todos los registros de la tabla de la izquierda (tabla1) y todos los registros con coincidencia de la tabla de la derecha (tabla2). Si no existe ninguna coincidencia para alguna de las filas de la tabla de la izquierda, de igual forma todos los resultados de la primera tabla se muestran.


![image](https://user-images.githubusercontent.com/72580574/232347882-585ceeea-556f-482a-bed9-e06628218cd8.png)


####  ¿NECESITAS UN EJEMPLO? 

```
SELECT nombre/s de la/s columna/s FROM tabla1 LEFT JOIN tabla2 ON tabla1.nombre_columna = tabla2.nombre_columna;
```

```sql
SELECT Nombre, Nombre_curso FROM Profesores LEFT JOIN Cursos ON Profesores.Id = Cursos.Id_profesor;
```


Teniendo la siguiente tabla de profesores:

![image](https://user-images.githubusercontent.com/72580574/232347901-b5db3941-365c-493b-9aed-424d34e9e10b.png)

Teniendo la siguiente tabla de Cursos: 

![image](https://user-images.githubusercontent.com/72580574/232347910-b67e7cec-bcfe-4ae4-b803-14226eadef60.png)

El resultado que mostraría sería:

![image](https://user-images.githubusercontent.com/72580574/232347941-6f460bac-7a66-45d5-9f3b-2f83abc38f74.png)

Si nos fijamos en el resultado de la consulta, podemos ver que trajo todas las filas de la tabla de la izquierda, sin importar si las filas tenían coincidencia o no.

- 1.3 - **RIGHT JOIN**: Esta sentencia es parecida a la anterior, pero le da prioridad a la tabla de la derecha. 

![image](https://user-images.githubusercontent.com/72580574/232347970-87bde20d-6ce1-4c9c-96a9-3bdd638b615d.png)

```
SELECT nombre/s de la/s columna/s FROM tabla1 RIGHT JOIN tabla2 ON tabla1.nombre_columna = tabla2.nombre_columna;
```

```sql
SELECT Nombre, Nombre_curso FROM Profesores RIGHT JOIN Cursos ON Profesores.Id = Cursos.Id_profesor;
```

### ¿NECESITAS UN EJEMPLO? 

Teniendo la siguiente tabla de profesores:

![image](https://user-images.githubusercontent.com/72580574/232347998-79393e7a-19ee-4d6c-8634-77156262c564.png)

Teniendo la siguiente tabla de Cursos:

![image](https://user-images.githubusercontent.com/72580574/232348018-b7ff0ecf-08cd-4061-ac25-4c8863375915.png)

El resultado que mostraría sería:


![image](https://user-images.githubusercontent.com/72580574/232348031-f0fce6cd-4892-4140-b33c-e251bab22244.png)


![image](https://user-images.githubusercontent.com/72580574/232348039-c57416dc-ffad-48d6-bf3c-c54347340114.png)

Si nos fijamos en el resultado de la consulta, podemos ver que trajo todas las filas de la tabla de la derecha, sin importar si las filas tenían coincidencia o no.

---

## :star: Subconsultas

Una subconsulta en SQL consiste en utilizar los resultados de una consulta dentro de otra, la cual se considera la principal. Esta posibilidad fue la razón original para la palabra “estructurada” en el nombre Lenguaje de Consultas Estructuradas (Structured Query Language, SQL).

Anteriormente hemos utilizado la cláusula WHERE para seleccionar los datos que deseábamos comparando un valor de una columna con una constante, o un grupo de ellas. Si los valores de dichas constantes son desconocidos, normalmente por proceder de la aplicación de funciones a determinadas columnas de la tabla, tendremos que utilizar subconsultas. Por ejemplo, queremos saber la lista de empleados cuyo salario supere el salario medio. 
En primer lugar, tendríamos que averiguar el importe del salario medio: 


### ¿NECESITAS UN EJEMPLO? 


```sql
SELECT AVG(salario) “Salario Medio” FROM Empleados;
```

![image](https://user-images.githubusercontent.com/72580574/232348068-b64f32a4-3ad5-4a1e-ae41-55e84e410639.png)


Ahora que sabemos el dato podríamos usarlo para la consulta: 

```sql
SELECT nombre, salario FROM Empleados WHERE > 256666,67;
```

![image](https://user-images.githubusercontent.com/72580574/232348084-ed98e125-ba6a-41dc-88e1-fe649b8f3a4c.png)

Esto estaría bien, pero, es porque primero buscamos el dato en una consulta y una vez que lo conseguimos, realizamos la consulta propiamente dicha.
Pero, lo mejor sería que en lugar de hacer dos consultas usemos una subconsulta, para que al mismo tiempo que averiguamos el salario medio, se calcule cuáles son los empleados que tienen un sueldo mayor a ese salario.

```sql
SELECT nombre, salario FROM Empleados WHERE > (SELECT AVG(salario) FROM Empleados);
```

![image](https://user-images.githubusercontent.com/72580574/232348101-a155316f-3863-406a-a690-7c9d8084fafc.png)

Esto nos daría el mismo resultado, pero sin la necesidad de hacer dos consultas . En estos casos  usaríamos una subconsulta, ya que  no sabíamos el salario medio antes de hacer la consulta.


---

## ✋ ¡MANOS A LA OBRA 

Para la realización de los ejercicios que se describen a continuación, es necesario descargar el archivo scriptsBD.zip que contiene algunos scripts con las bases de datos sobre las cuales trabajaremos.


## Ejercicio #1

Abrir el script llamado “personal” y ejecutarlo de modo tal que se cree la base de datos “personal”, se creen las tablas y se inserten todos los datos en ellas. Debe observarse tal cual muestra la imagen: 


![image](https://user-images.githubusercontent.com/72580574/232348148-c456f971-c878-44ca-b323-faa5c0a4237f.png)


A continuación, realizar las siguientes consultas sobre la base de datos personal:

1. Obtener los datos completos de los empleados.

2. Obtener los datos completos de los departamentos.

3. Listar el nombre de los departamentos.

4. Obtener el nombre y salario de todos los empleados.

5. Listar todas las comisiones.

6. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.

7. Obtener los datos de los empleados vendedores, ordenados por nombre alfabéticamente.

8. Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a mayor.

9.Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las respectivas tablas de empleados.

10.Listar los salarios y comisiones de los empleados del departamento 2000, ordenado por comisión de menor a mayor.

11. Obtener el valor total a pagar que resulta de sumar el salario y la comisión de los empleados del departamento 3000 una bonificación de 500, en orden alfabético del empleado.

12. Muestra los empleados cuyo nombre empiece con la letra J.

13. Listar el salario, la comisión, el salario total (salario + comisión) y nombre de aquellos empleados que tienen comisión superior a 1000.

14. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen comisión.

15. Obtener la lista de los empleados que ganan una comisión superior a su sueldo.

16. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo.

17. Hallar los empleados cuyo nombre no contiene la cadena “MA”

18. Obtener los nombres de los departamentos que sean “Ventas” ni “Investigación” ni Mantenimiento.

19. Obtener los nombres de los departamentos que no sean “Ventas” ni “Investigación” ni Mantenimiento.

20. Mostrar el salario más alto de la empresa.

21. Mostrar el nombre del último empleado de la lista por orden alfabético.

22. Hallar el salario más alto, el más bajo y la diferencia entre ellos.

23. Hallar el salario promedio por departamento.

## Consultas con Having 

1. Hallar los departamentos que tienen más de tres empleados y mostrar el número de empleados de esos departamentos.

2. Mostrar el código y nombre de cada jefe, junto al número de empleados que dirige. Solo los que tengan más de dos empleados (2 incluido).

3. Hallar los departamentos que no tienen empleados


## Consulta con Subconsulta

1. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la empresa. Ordenarlo por departamento.

**SUPER TIP** 😀 ¿Necesitas descanso? Recreate y muévete un poco… Tómate un descanso para continuar practicando con el próximo ejercicio.

---

## ✋ MANOS A LA OBRA! -  Ejercicio #2

Abrir el script de la base de datos llamada “tienda.sql” y ejecutarlo para crear sus tablas e insertar datos en las mismas. A continuación, generar el modelo de entidad relación. Deberán obtener un diagrama de entidad relación igual al que se muestra a continuación: 

![image](https://user-images.githubusercontent.com/72580574/232348559-242b79d5-3ad8-44c6-8d57-cd2097779673.png)


A continuación, se deben realizar las siguientes consultas sobre la base de datos:

1. Lista el nombre de todos los productos que hay en la tabla producto.

2. Lista los nombres y los precios de todos los productos de la tabla producto.

3. Lista todas las columnas de la tabla producto.

4. Lista los nombres y los precios de todos los productos de la tabla producto, redondeando el valor del precio.

5. Lista el código de los fabricantes que tienen productos en la tabla producto.

6. Lista el código de los fabricantes que tienen productos en la tabla producto, sin mostrar los repetidos.

7. Lista los nombres de los fabricantes ordenados de forma ascendente.

8. Lista los nombres de los productos ordenados en primer lugar por el nombre de forma ascendente y en segundo lugar por el precio de forma descendente.

9. Devuelve una lista con las 5 primeras filas de la tabla fabricante.

10. Lista el nombre y el precio del producto más barato. (Utilice solamente las cláusulas ORDER BY y LIMIT)

11. Lista el nombre y el precio del producto más caro. (Utilice solamente las cláusulas ORDER BY y LIMIT)


12. Lista el nombre de los productos que tienen un precio menor o igual a $120.

13. Lista todos los productos que tengan un precio entre $60 y $200. Utilizando el operador BETWEEN.

14. Lista todos los productos donde el código de fabricante sea 1, 3 o 5. Utilizando el operador IN.

15. Devuelve una lista con el nombre de todos los productos que contienen la cadena Portátil en el nombre.

## Consultas Multitabla 

1. Devuelve una lista con el código del producto, nombre del producto, código del fabricante y nombre del fabricante, de todos los productos de la base de datos.

2. Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos los productos de la base de datos. Ordene el resultado por el nombre del fabricante, por orden alfabético.

3. Devuelve el nombre del producto, su precio y el nombre de su fabricante, del producto más barato. 

4. Devuelve una lista de todos los productos del fabricante Lenovo.

5. Devuelve una lista de todos los productos del fabricante Crucial que tengan un precio mayor que $200.

6.Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packard. Utilizando el operador IN.

7. Devuelve un listado con el nombre de producto, precio y nombre de fabricante, de todos los productos que tengan un precio mayor o igual a $180. Ordene el resultado en primer lugar por el precio (en orden descendente) y en segundo lugar por el nombre (en orden ascendente)

## Consultas Multitabla 

1. Resuelva todas las consultas utilizando las cláusulas LEFT JOIN y RIGHT JOIN.

2. Devuelve un listado de todos los fabricantes que existen en la base de datos, junto con los productos que tiene cada uno de ellos. El listado deberá mostrar también aquellos fabricantes que no tienen productos asociados.

3. Devuelve un listado donde sólo aparezcan aquellos fabricantes que no tienen ningún producto asociado.

## Subconsultas (En la cláusula WHERE)

#### Con operadores básicos de comparación

1. Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER JOIN).

2. Devuelve todos los datos de los productos que tienen el mismo precio que el producto más caro del fabricante Lenovo. (Sin utilizar INNER JOIN).

3. Lista el nombre del producto más caro del fabricante Lenovo.

4. Lista todos los productos del fabricante Asus que tienen un precio superior al precio medio de todos sus productos.

#### Subconsultas con IN y NOT IN

1. Devuelve los nombres de los fabricantes que tienen productos asociados. (Utilizando IN o NOT IN).

2. Devuelve los nombres de los fabricantes que no tienen productos asociados. (Utilizando IN o NOT IN).

#### Subconsultas (En la cláusula HAVING)

1. Devuelve un listado con todos los nombres de los fabricantes que tienen el mismo número de productos que el fabricante Lenovo.

---

## Extra Credits

¿Preparado para unos ejercicios más? Inténtalo 💪

Pueden realizarse cuando hayas terminado la guía y te sientas seguro sobre lo estudiado. Si ya terminaste la guía y te queda tiempo libre recordá que la prioridad es ayudar a los compañeros de equipo.

---

## ✋ MANOS A LA OBRA! - Ejercicio #3

Abrir el script de la base de datos llamada “nba.sql” y ejecutarlo para crear todas las tablas e insertar datos en las mismas. A continuación, generar el modelo de entidad relación. Deberá obtener un diagrama de entidad relación igual al que se muestra a continuación: 

![image](https://user-images.githubusercontent.com/72580574/232348781-9b65480c-136f-4278-983e-23dd0b6b24f2.png)


A continuación, se deben realizar las siguientes consultas sobre la base de datos:

1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.

2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras, ordenados por nombre alfabéticamente.

3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.

4. Mostrar el nombre de los equipos del este (East).

5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.

6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.

7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.

8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.

9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.

10. Mostrar el número de puntos de cada jugador en toda su carrera.

11. Mostrar el número de jugadores de cada equipo.

12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.

13. Mostrar la media de puntos en partidos de los equipos de la división Pacific.

14. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.

15. Mostrar la media de puntos en partidos de los equipos de la división Pacific.

16. Mostrar los puntos de cada equipo en los partidos, tanto de local como de visitante. 

17. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null.

---


## ✋ MANOS A LA OBRA! - Ejercicio #4

Abrir el script de la base de datos llamada “jardineria.sql” y ejecutarlo para crear todas las tablas e insertar datos en las mismas. Deberá obtener un diagrama de entidad relación igual al que se muestra a continuación: 


![image](https://user-images.githubusercontent.com/72580574/232348875-ee7d8e77-d65c-447a-8f1a-3a7badbe7c2f.png)


A continuación, se deben realizar las siguientes consultas sobre la base de datos:

## Consultas sobre una tabla

1. Devuelve un listado con el código de oficina y la ciudad donde hay oficinas.

2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España.

3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un código de jefe igual a 7.

4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa.

5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean representantes de ventas.

6. Devuelve un listado con el nombre de los todos los clientes españoles.

7. Devuelve un listado con los distintos estados por los que puede pasar un pedido.

8. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago en 2008. Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan repetidos. Resuelva la consulta:

-Utilizando la función YEAR de MySQL.

-Utilizando la función DATE_FORMAT de MySQL.

-Sin utilizar ninguna de las funciones anteriores.

9. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega de los pedidos que no han sido entregados a tiempo.

10. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega de los pedidos cuya fecha de entrega ha sido al menos dos días antes de la fecha esperada.

11. Utilizando la función ADDDATE de MySQL.

12. Utilizando la función DATEDIFF de MySQL.

13. Devuelve un listado de todos los pedidos que fueron rechazados en 2009.

14. Devuelve un listado de todos los pedidos que han sido entregados en el mes de enero de cualquier año.

15. Devuelve un listado con todos los pagos que se realizaron en el año 2008 mediante Paypal. Ordene el resultado de mayor a menor.

16. Devuelve un listado con todas las formas de pago que aparecen en la tabla pago. Tenga en cuenta que no deben aparecer formas de pago repetidas.

17. Devuelve un listado con todos los productos que pertenecen a la gama Ornamentales y que tienen más de 100 unidades en stock. El listado deberá estar ordenado por su precio de venta, mostrando en primer lugar los de mayor precio.

18. Devuelve un listado con todos los clientes que sean de la ciudad de Madrid y cuyo representante de ventas tenga el código de empleado 11 o 30.

## Consultas multitabla (Composición interna). Las consultas se deben resolver con INNER JOIN.

1. Obtén un listado con el nombre de cada cliente y el nombre y apellido de su representante de ventas.

2. Muestra el nombre de los clientes que hayan realizado pagos junto con el nombre de sus representantes de ventas.

3. Muestra el nombre de los clientes que no hayan realizado pagos junto con el nombre de sus representantes de ventas.

4. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.

5. Devuelve el nombre de los clientes que no hayan hecho pagos y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.

6. Lista la dirección de las oficinas que tengan clientes en Fuenlabrada.

7. Devuelve el nombre de los clientes y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
Devuelve un listado con el nombre de los empleados junto con el nombre de sus jefes.

8. Devuelve el nombre de los clientes a los que no se les ha entregado a tiempo un pedido.

9. Devuelve un listado de las diferentes gamas de producto que ha comprado cada cliente.

## Consultas multitabla (Composición externa). Resuelva todas las consultas utilizando las cláusulas LEFT JOIN, RIGHT JOIN, JOIN.

1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.

2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pedido.

3. Devuelve un listado que muestre los clientes que no han realizado ningún pago y los que no han realizado ningún pedido.

4. Devuelve un listado que muestre solamente los empleados que no tienen una oficina asociada.

5. Devuelve un listado que muestre solamente los empleados que no tienen un cliente asociado.

6. Devuelve un listado que muestre los empleados que no tienen una oficina asociada y los que no tienen un cliente asociado.

7. Devuelve un listado de los productos que nunca han aparecido en un pedido.

8. Devuelve las oficinas donde no trabajan ninguno de los empleados que hayan sido los representantes de ventas de algún cliente que haya realizado la compra de algún producto de la gama Frutales.

9. Devuelve un listado con los clientes que han realizado algún pedido, pero no han realizado ningún pago.

10. Devuelve un listado con los datos de los empleados que no tienen clientes asociados y el nombre de su jefe asociado.


## Consultas resumen

1. ¿Cuántos empleados hay en la compañía?

2. ¿Cuántos clientes tiene cada país?

3. ¿Cuál fue el pago medio en 2009?

4. ¿Cuántos pedidos hay en cada estado? Ordena el resultado de forma descendente por el número de pedidos.

5. Calcula el precio de venta del producto más caro y más barato en una misma consulta.

6. Calcula el número de clientes que tiene la empresa.

7. ¿Cuántos clientes tiene la ciudad de Madrid?

8. ¿Calcula cuántos clientes tiene cada una de las ciudades que empiezan por M?

9. Devuelve el nombre de los representantes de ventas y el número de clientes al que atiende cada uno.

10. Calcula el número de clientes que no tiene asignado representante de ventas.

11. Calcula la fecha del primer y último pago realizado por cada uno de los clientes. El listado deberá mostrar el nombre y los apellidos de cada cliente.

12. Calcula el número de productos diferentes que hay en cada uno de los pedidos.

13. Calcula la suma de la cantidad total de todos los productos que aparecen en cada uno de los pedidos.

14. Devuelve un listado de los 20 productos más vendidos y el número total de unidades que se han vendido de cada uno. El listado deberá estar ordenado por el número total de unidades vendidas.

15. La facturación que ha tenido la empresa en toda la historia, indicando la base imponible, el IVA y el total facturado. La base imponible se calcula sumando el coste del producto por el número de unidades vendidas de la tabla detalle_pedido. El IVA es el 21 % de la base imponible, y el total la suma de los dos campos anteriores.

16. La misma información que en la pregunta anterior, pero agrupada por código de producto.

17. La misma información que en la pregunta anterior, pero agrupada por código de producto filtrada por los códigos que empiecen por OR.

18. Lista las ventas totales de los productos que hayan facturado más de 3000 euros. Se mostrará el nombre, unidades vendidas, total facturado y total facturado con impuestos (21% IVA)

## Subconsultas con operadores básicos de comparación

1. Devuelve el nombre del cliente con mayor límite de crédito.

2. Devuelve el nombre del producto que tenga el precio de venta más caro.

3. Devuelve el nombre del producto del que se han vendido más unidades. (Tenga en cuenta que tendrá que calcular cuál es el número total de unidades que se han vendido de cada producto a partir de los datos de la tabla detalle_pedido. Una vez que sepa cuál es el código del producto, puede obtener su nombre fácilmente.)

4. Los clientes cuyo límite de crédito sea mayor que los pagos que haya realizado. (Sin utilizar INNER JOIN).

5. Devuelve el producto que más unidades tiene en stock.

6. Devuelve el producto que menos unidades tiene en stock.

7. Devuelve el nombre, los apellidos y el email de los empleados que están a cargo de Alberto Soria.

### Subconsultas con ALL y ANY

1. Devuelve el nombre del cliente con mayor límite de crédito.

2. Devuelve el nombre del producto que tenga el precio de venta más caro.

3. Devuelve el producto que menos unidades tiene en stock.


### Subconsultas con IN y NOT IN

1. Devuelve el nombre, apellido1 y cargo de los empleados que no representen a ningún cliente.

2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.

3. Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago.

4. Devuelve un listado de los productos que nunca han aparecido en un pedido.

5. Devuelve el nombre, apellidos, puesto y teléfono de la oficina de aquellos empleados que no sean representante de ventas de ningún cliente.


### Subconsultas con EXISTS y NOT EXISTS

1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.

2. Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago.

3. Devuelve un listado de los productos que nunca han aparecido en un pedido.

4. Devuelve un listado de los productos que han aparecido en un pedido alguna vez.

---

## Para curiosos…

¿Quieres volverte un experto? ¡Aquí te presentamos un último ejercicio! 👇

## Ejercicio #5

Importar el script de la base de datos llamada “pokemondb.sql” y ejecutarlo para crear todas las tablas e insertar los registros en las mismas. A continuación, generar el modelo de entidad relación y reorganizar las tablas para mayor claridad de sus relaciones. Deberá obtener un diagrama de entidad de relación similar al que se muestra a continuación: 

![image](https://user-images.githubusercontent.com/72580574/232349170-524e3423-59cf-43be-b72e-19b923955bbb.png)

A continuación, se deben realizar las siguientes consultas:

1. Mostrar el nombre de todos los pokemon.

2. Mostrar los pokemon que pesen menos de 10k.

3. Mostrar los pokemon de tipo agua.

4. Mostrar los pokemon de tipo agua, fuego o tierra ordenados por tipo.

5. Mostrar los pokemon que son de tipo fuego y volador.

6. Mostrar los pokemon con una estadística base de ps mayor que 200.

7. Mostrar los datos (nombre, peso, altura) de la prevolución de Arbok.

8. Mostrar aquellos pokemon que evolucionan por intercambio. 

9. Mostrar el nombre del movimiento con más prioridad.

10. Mostrar el pokemon más pesado.

11. Mostrar el nombre y tipo del ataque con más potencia.

12. Mostrar el número de movimientos de cada tipo.

13. Mostrar todos los movimientos que puedan envenenar.

14. Mostrar todos los movimientos que causan daño, ordenados alfabéticamente por nombre.

15. Mostrar todos los movimientos que aprende pikachu.

16. Mostrar todos los movimientos que aprende pikachu por MT (tipo de aprendizaje).

17. Mostrar todos los movimientos de tipo normal que aprende pikachu por nivel.

18. Mostrar todos los movimientos de efecto secundario cuya probabilidad sea mayor al 30%.

19. Mostrar todos los pokemon que evolucionan por piedra. 

20. Mostrar todos los pokemon que no pueden evolucionar. 

21. Mostrar la cantidad de los pokemon de cada tipo. 

---

## Antes de terminar…

### Checkpoint

¿Cómo has llegado hasta aquí? Responde el siguiente cuestionario te llevará no más de 15 minutos. https://forms.gle/eAgMjLjtjFNcTeoA6

---

## ¡Hora de cerrar! 

Has finalizado el módulo 4 correspondiente al análisis del sistema MySQL. Felicitaciones por el esfuerzo, la dedicación y el esmero. ¡Ha sido increíble!

¡Llegó el momento de los pulsos. ¿Te gustaría recibir? Demuéstrales a tus compañeros qué estás presente para promover su aprendizaje y el tuyo también.

---
