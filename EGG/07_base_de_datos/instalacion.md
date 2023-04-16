# :star: MODULO 4 - Instalación

---

ENCUENTRO 11 / 20

---

## ¡Te damos la bienvenida a tu onceavo encuentro de trabajo!

Damos inicio a un nuevo módulo. Durante este y los próximos encuentros profundizaremos en una herramienta fundamental para los tester manuales: base de datos. Presten mucha atención, cooperen entre ustedes y recuerden que pueden solicitar ayuda de los mentores.

---

## :book: MATERIAL DE LECTURA 

### Introducción

Para el manejo de base de datos, utilizaremos un programa y lenguaje nuevo, llamado SQL. Como todo cambio, puede ser un poco duro al comienzo pero a medida que vayamos transitando la guía notarán cómo se familiarizan con el entorno y el desafío se vuelve cada vez más interesante. 

Respeten sus tiempos y tengan presente que todo aprendizaje lleva un proceso. 


---

## :stars: Primer desafío

El primer desafío de esta Guía es instalar el programa con el que vamos a trabajar. Tómate el tiempo necesario, para realizar las instalaciones de MySQL Server y MySQL Workbench correctamente.

### Instalaciones - Tutoriales instalación MySQL

A través de este instructivo realizaremos la instalación del software necesario para trabajar en el módulo de Bases de Datos con MySQL.

1. En el aula virtual encontrarás enlaces que te llevarán a realizar la descarga del instalador de MySQL. Elige el compatible con tu sistema operativo e inicia la descarga.

2. A través de este instalador realizaremos las respectivas instalaciones de:

a. Servidor (Server) MySQL.

b. Conectores (Connector) MySQL: J y OBDC .

c. Aplicación (Application) Workbench.

#### ¿Como iniciar la instalacion?

Primero localiza el archivo descargado y ábrelo. Al ejecutar el instalador seguramente se nos solicite otorgar permisos de administrador para que se pueda instalar el programa.
Deberemos decir que sí. A continuación, se nos desplegará la siguiente ventana, donde seleccionaremos “Custom”.

![image](https://user-images.githubusercontent.com/72580574/232261574-048e490f-be76-4220-b5aa-4b79ee146ac2.png)


A continuación, veremos la siguiente ventana, donde deberás expandir las opciones seleccionar el producto, y hacer click en la flechita que se verá de color verde. En total instalaremos cuatro productos:

 MySQL server

 MySQL Workbench

 Connector/ODBC

 Connector/J

![image](https://user-images.githubusercontent.com/72580574/232261586-4c59e48c-54fa-4ed1-9ef3-b68c339818fb.png)

Al finalizar la selección, debería verse de la siguiente manera:


![image](https://user-images.githubusercontent.com/72580574/232261600-1f98d9f4-8e19-4d73-8280-0b167a1a6a78.png)

Una vez elegidos los productos, deberemos completar la instalación aceptando los pasos.

![image](https://user-images.githubusercontent.com/72580574/232261608-5c91440c-aa08-4b0f-b693-be530527699d.png)

Nota: Si se te solicita instalar un programa llamado: “Microsoft Visual C++” acepta. Es un
software necesario para continuar la instalación.

![image](https://user-images.githubusercontent.com/72580574/232261611-f73c2c5f-0783-455f-a2a5-081e19f17308.png)

### ¿COMO CONFIGURAR EL SERVIDOR?

Al terminar lo instalado anteriormente, te encontrarás con la  siguiente ventana, donde deberemos realizar un paso más: configurar el servidor. Haz click en “Reconfigure” y termina la instalación.

![image](https://user-images.githubusercontent.com/72580574/232261624-40dbb12b-1f10-4070-8286-e03a87c671af.png)

IMPORTANTE: Cuando se instale el servidor y pida poner usuario y contraseña, ingrese root como usuario y root como contraseña.


![image](https://user-images.githubusercontent.com/72580574/232261633-7c7fbf62-4418-4f55-a035-dabd2c281ed0.png)

![image](https://user-images.githubusercontent.com/72580574/232261643-006b9032-e1f6-4271-b495-ee3a59ea01bf.png)

Nota: Si no te permite realizar la instalación en el puerto 3306, instalalo en el puerto 3307. Puede que lo tengas ocupado.


![image](https://user-images.githubusercontent.com/72580574/232261653-896f4ecd-df21-4e8a-ad64-143fc6fe8d5b.png)

![image](https://user-images.githubusercontent.com/72580574/232261656-9bdd2261-ad66-4132-9f15-1af634650885.png)

![image](https://user-images.githubusercontent.com/72580574/232261676-95f3729d-af96-47f3-8042-13aa45842ec9.png)


RECUERDA: Las credenciales deben ser User: root , Password: root.

---
---

## Instaladores


A continuación, te proponemos que puedas ver los videos sobre Base de Datos - MySQL. Revisarlos completo te llevará como mínimo una hora del encuentro en vivo. Si quieres o necesitas volver a revisar algún video, puede llevarte algo más de tiempo.

Si quieres ver la lista de reproducción, puedes verla [desde aquí](https://youtube.com/playlist?list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw).

Si prefieres ver cada video, haz click a continuación en cada uno de ellos:

- [:tv: Introducción Base de Datos | Programación | Base de datos | V1 | Egg Educación](https://www.youtube.com/watch?v=Thq0vO9v_80&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw)

- [:tv: Insertar, Modificar y Eliminar  | Programación | Base de datos | V2 | Egg Educación](https://www.youtube.com/watch?v=Sa7f59JjKP4&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw&index=2)

- [:tv: Select. From. Where | Programación | Base de datos | V3 | Egg Educación](https://www.youtube.com/watch?v=bLocGDEEs0I&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw&index=3)

- [:tv: Tablas relacionadas | Programación | Base de datos | V4 | Egg Educación](https://www.youtube.com/watch?v=IiJk53KWJZc&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw&index=4)

- [:tv: Join avanzados | Programación | Base de datos | V5 | Egg Educación](https://www.youtube.com/watch?v=5XAkfs3K5ZI&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw&index=5)

- [:tv: Order by. Group by. Having | Programación | Base de datos | V6 | Egg Educación](https://www.youtube.com/watch?v=XE-vi6mNcuY&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw&index=6)

- Otra herramienta que vas a necesitar van a ser los Scripts: [jardineria.sql](https://github.com/eugenia1984/QA/blob/main/EGG/07_base_de_datos/jardineria.sql), [nba.sql](https://github.com/eugenia1984/QA/blob/main/EGG/07_base_de_datos/nba.sql), [personal_insert.sql](https://github.com/eugenia1984/QA/blob/main/EGG/07_base_de_datos/personal_inserts.sql), [superheroes.sql](https://github.com/eugenia1984/QA/blob/main/EGG/07_base_de_datos/superheroes.sql) y [tienda.sql](https://github.com/eugenia1984/QA/blob/main/EGG/07_base_de_datos/tienda.sql)

Este archivo consta de una serie de consultas para iniciar una base de datos, insertar información y crear sus tablas. De esta manera cuando ejecutemos todas las consultas del script, tendremos la base de datos creada, con tablas y en ocasiones con datos.

---
---

## :star: ¿Cómo abrir un script en mysql workbench?

Para abrir un script, debemos ingresar a Workbench y hacer click en el siguiente icono 

![image](https://user-images.githubusercontent.com/72580574/232261918-c660f353-45ac-4a41-b8f2-c0d8a27b6bd9.png)

Esto nos va a permitir elegir un script dentro de nuestra computadora 

![image](https://user-images.githubusercontent.com/72580574/232261921-d6a9291c-8bd2-4f4a-884c-5b0b31cb4a53.png)

Elegimos el script que nos solicita la guía y le daremos doble click. 
Supongamos que abrimos el script superhéroes.sql. Veremos lo lo siguiente: 


![image](https://user-images.githubusercontent.com/72580574/232261929-7324ff7c-f1f1-4860-b477-b161a72e0c64.png)

Esta serie de consultas, sirven para crear la base de datos y las tablas. Más adelante verán cómo tendrán que ejecutar todas esas consultas en orden para que se cree la base de datos de manera correcta.


## :star:  ¿Cómo ejecutamos una consulta?

Para ejecutar una consulta tenemos varias opciones, en Workbench vamos a encontrar dos rayitos arriba de las consultas. Estos son los que nos permiten ejecutar las consultas.

![image](https://user-images.githubusercontent.com/72580574/232261941-e31f2a1b-4e5e-4f18-81dc-2ae444f99e67.png)

- El de la izquierda o el que no posee cursor, ejecuta todas las consultas o todas las consultas seleccionadas.

- El de la derecha o el que tiene cursor ejecuta la consulta que tenga el cursor del mouse. Por lo ende,nos deja ejecutar de a una consulta a la vez.

Ya que debemos ejecutar todas las consultas en orden para que se genere correctamente la base de datos, la mejor opción es siempre el rayo de la izquierda. Para no ir de una en una y olvidarnos de alguna y tener que tirar toda la base de datos si se genera mal. 

Pero, cuando estemos trabajando en la guía y queramos probar una consulta que hemos hecho, lo mejor es el rayo de la derecha. 

###  Shortcuts

- El **rayo de la derecha** se puede hacer en el teclado con **Control + Shift + Enter** en Windows y **Shitft + Comando + Enter** en Mac.

- El **rayo de la izquierda** se puede hacer en el teclado con **Control + Enter** en Windows y **Comando + Enter** en Mac


---

### En este módulo aprenderás lo siguiente:

- Conocer el nuevo IDE.

- Comprender qué es una base de datos y cómo se conforma.

- Poder crear, eliminar y modificar una base de datos.

- Comprender el concepto de filas y columnas en las bases de datos.

- Poder realizar consultas a la base de datos y extraer información específica.

- Entender las relaciones entre tablas y los elementos que involucran.

- Realizar consultas multitablas.


---
---

## :book: MATERIAL DE LECTURA ¿Qué es una Base de Datos?

Una base de datos es un conjunto de datos organizados y estructurados según un determinado modelo de información (lógica de negocio) que refleja la relación entre ellos. Tiene una estructura independiente del programa por el que se accede.

Debido al desarrollo tecnológico, actualmente la mayoría de las bases de datos existen en formato digital.

La información estructurada o datos, se modelan típicamente en filas y columnas en una serie de tablas. Esto permite que el procesamiento y la consulta de los datos sean eficientes. De este modo, se puede acceder, administrar, modificar, actualizar, controlar y organizar fácilmente cada campo de datos. 
 
Las bases de datos requieren de un lenguaje de consulta para recibir instrucciones sobre cómo operar. 

**¡Atención! Un lenguaje de consulta no es un lenguaje de programación.**

Es importante que distingamos las diferencias entre ambos, seguramente al avanzar en el encuentro lo comprendas mejor.

Entonces podemos decir que las bases de datos relacionales son compatibles con el lenguaje de consulta estructurado (SQL) para operar sobre bases de datos.


###  ¿Qué es un Sistema de Gestión de Base de Datos (DBMS)?

Un sistema de gestión de base de datos (DBMS - DataBase Management System) es un software con el que se administra y gestiona la información que incluye una base de datos. 

Un DBMS permite administrar todo acceso a la base de datos, pues tiene el objetivo de servir de interfaz entre esta, el usuario y las aplicaciones.

Entre sus funciones se encuentra la de almacenar la información y modificar datos. Asimismo, el gestor de base de datos también se ocupa de realizar consultas de una forma sistemática permitiendo a los usuarios recuperar, actualizar y administrar cómo se organiza y optimiza la información.

#### ¿NECESITAS UN EJEMPLO? 

Algunos ejemplos de software de bases de datos o DBMS populares incluyen MySQL, Microsoft Access, Microsoft SQL Server, FileMaker Pro, Oracle Database, PostgreSQL, SQLite y dBASE.

**Spoiler Alert**: vamos a utilizar el software de bases de datos MySQL

## ¿Cuál es la diferencia entre una base de datos y una hoja de cálculo?

Las bases de datos y las hojas de cálculo (como Microsoft Excel) son dos formas convenientes de almacenar información.

Las principales diferencias son:

- **Cómo se almacenan y manipulan los datos**: Las bases de datos emplean una unidad lógica que relaciona los datos haciendo más eficiente su uso y almacenamiento.

- **Quién puede acceder a los datos**: Las bases de datos permiten acceder y consultar los datos de forma rápida y segura utilizando una lógica y un lenguaje altamente complejos con usuarios simultáneamente.

- **Cuántos datos se pueden almacenar**: Las hojas de cálculo se diseñaron originalmente para un usuario, y sus características así lo reflejan. Son muy buenas para uno solo o un pequeño grupo que no requiere manipular una gran cantidad de datos. Las bases de datos, por otro lado, están diseñadas para contener colecciones mucho más grandes de información organizada. En ocasiones, cantidades masivas. 


### Las bases de datos permiten transacciones ACID.

ACID es la sigla que significa Atomicity, Consistency, Isolation, Durability o, en español, Atomicidad, Consistencia, Aislamiento y Durabilidad.
En informática, ACID es un conjunto de características o propiedades que garantizan que las transacciones en una base de datos sean fiables.

**Secretos de la industria**: En el contexto de bases de datos, una transacción es una única operación sobre los datos.

###  Ventajas ACID

- **Atomicidad**: cualquier cambio de estado que produce una transacción es atómico. Ocurren o no ocurre. 
Esta propiedad asegura que ninguna operación quede en el sistema a medias. 

- **Consistencia**: Asegura que una transacción no romperá con la integridad de una base de datos. Respeta todas sus reglas y directrices. 

- **Aislamiento**: Asegura que las transacciones no se afectarán entre sí. Dos o más transacciones sobre los mismos datos no deberían generar un problema. 

- **Durabilidad**: Persistencia de una transacción. Una vez que la transacción quedó aceptada no puede deshacerse, aunque falle el sistema. 

###  ¿Por qué usar una base de datos en lugar de una hoja de cálculo ?

- **Mayor independencia**: Los datos son independientes de las aplicaciones que los usan, así como de los usuarios.

- **Mayor disponibilidad**: Se facilita el acceso a los datos desde contextos, aplicaciones y medios distintos, haciéndolos útiles para un mayor número de usuarios.

- **Mayor seguridad (protección de los datos)**: Resulta más fácil replicar una base de datos para mantener una copia de seguridad que hacerlo con un conjunto de ficheros almacenados de forma no estructurada. Además, al estar centralizado el acceso a los datos, existe una verdadera sincronización de todo el trabajo que se haya podido hacer sobre estos (modificaciones), con lo que esa copia de seguridad servirá a todos los usuarios.

- **Menor redundancia**: Un mismo dato no se encuentra almacenado en múltiples archivos o con múltiples esquemas distintos, sino en una única instancia en la base de datos. Esto redunda en menor volumen de datos y mayor rapidez de acceso.

- **Mayor eficiencia** en la captura, codificación y entrada de datos.


---



Ánimo, sabemos que hasta acá leiste mucha información que requiere organización y tiempo de procesamiento. No desesperes. Vuelve a leer e intenta evocar y comentar con tus palabras aquello que estuvimos trabajando. Cuanto más veces hagas este ejercicio, más cerca estarás de haber incorporado todos los contenidos, es decir de aprender.

¡Es una muy buena técnica de estudio!



---

## :star: Clasificación de las bases de datos

Hay muchos tipos de bases de datos.

Cuál utilizar dependerá de cómo la organización pretenda utilizar los datos.

### Bases de datos relacionales

Los elementos de una base de datos relacional se organizan como un conjunto de tablas con columnas y filas. La tecnología de base de datos relacional proporciona la manera más eficiente y flexible de acceder a información estructurada. En la actualidad es el tipo de base de datos más utilizada 

*Nota*: Este es el tipo de base de datos que trabajaremos y sobre el cuál profundizaremos.

### Bases de datos orientadas a objetos

La información en una base de datos orientada a objetos se representa en forma de objetos, como en la programación orientada a objetos.  

Además, se almacenan datos complejos y relaciones entre datos directamente, sin asignar filas ni columnas. No es un tipo de bases de datos muy utilizado en la actualidad debido a que no hay criterios claros de estandarización y existe poca documentación sobre los proyectos en los que se han implementado.

### Bases de datos  NoSQL

Una NoSQL (Not Only SQL), o una base de datos no relacional, permite que los datos no estructurados y semiestructurados se almacenen y manipulen, a diferencia de una base de datos relacional, que define cómo deben componerse todos los datos insertados en la misma.

Las bases de datos NoSQL se hicieron populares a medida que las aplicaciones web se hacían más comunes y complejas.


---
---

##  ¡Hora de cerrar! 

¡Han dado lo mejor! Revisa si las instalaciones que hiciste están correctas: consulta, llama al mentor, coopera con tus compañeros. Se vienen más ejercicios y necesitas afianzar todo los contenidos que mencionamos aquí.

¡Llegó el momento de los pulsos. ¿Te gustaría recibir? Demuéstrales a tus compañeros qué estás presente para promover su aprendizaje y el tuyo también.


---
---

