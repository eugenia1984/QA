# Prácticas - Proyectos a realizar

## :book: Temas

- 1 - Buscar errores en E-Commerce

- 2 - Clase 5 en vivo. Bases de Datos y performance y stress con automatización

- 3 - Clase 6 en vivo. Testing en Bases de Datos NoSql y SQL API's AWS y Ubuntu Server. Performance y stress.

---

## :star:  1 - Buscar errores en E-Commerce

En [https://academybugs.com/](https://academybugs.com/) es una página para practicar la busqueda de errores, va mostrando 25 errores reales.

Esta bueno hacer el caso de prueba.

-> Hay un error en la suma:

![image](https://user-images.githubusercontent.com/72580574/221378203-be08ef6c-fd11-419d-a072-7dc4ddd6d670.png)


---

## :star:  2 - Clase 5 en vivo. Bases de Datos y performance y stress con automatización

Transmisión en vivo de Instituto Web. 

Fecha: 01/12/2022

En esta clase vemos como funciona una base de datos NoSQL Dynamo en Amazon AWS, sus diferencias y utilización en sistemas y realizaremos testing de fuerza, performance y stress sobre base de datos y servidores, configuraremos el tipo de herramienta a utilizar (JMeter), drivers de conexión y realizaremos comparaciones entre los resultados obtenidos.

En la clase anterior con **PHPMyAdmin** se creo una tabla en una base de datos

**AI** -> autoincremental, apra la PK.

![image](https://user-images.githubusercontent.com/72580574/221426244-34b24cc7-abfc-4d01-acb2-4155a9b1caa2.png)

Y puedo ver la tabla:

![image](https://user-images.githubusercontent.com/72580574/221426280-48e5ed15-033e-4c78-bc8a-51dff8c80872.png)


Inserto datos:

![image](https://user-images.githubusercontent.com/72580574/221426315-b0837fef-5262-4d14-bae3-2d2fc10b6a56.png)

![image](https://user-images.githubusercontent.com/72580574/221426326-fc2a25fb-da12-4113-a171-38be0af653ba.png)

![image](https://user-images.githubusercontent.com/72580574/221426347-da10ad39-6e62-46c0-85fe-a4b66a63dd72.png)

-> Es una tabla **SQL** de una **base de datos relacionales** -> **MySQL**
---

## AWS Amazon Web Service

Son los servidores de Amazon, hay una versión gratuita, la que usa en la clase, para ver un ejemplo de una **base de datos no relacional**, no tiene la estructura de la tabla, está **orientada a documentos**.

Soportan enorme cantidad de datos y enorme diversidad de datos. Se usa para BigData.

Elásticas en su estrucura, pero muy lentas en la búsqueda de datos (por eso no se usa en los bancos).

-> **DinamoDB** es la base de datos que usa Amazon

![image](https://user-images.githubusercontent.com/72580574/221426150-877894a6-b1e4-4865-937d-2493981afbaf.png)

En vez de BASE DE DATOS, se llaman **tablas**.

![image](https://user-images.githubusercontent.com/72580574/221426435-4d17a48f-3876-4f6d-9442-59810d6f0620.png)

![image](https://user-images.githubusercontent.com/72580574/221426454-9d6d4a1b-4623-420a-a422-f1a7c376baf2.png)

Se ve como una tabla, pero en realidad es un **JSON**:

![image](https://user-images.githubusercontent.com/72580574/221426512-9fab224c-deb6-4bc3-af2c-ed7f455e6a2e.png)


![image](https://user-images.githubusercontent.com/72580574/221426497-feb6d994-02e3-4bfd-a510-8ad7eda71e2b.png)

Y cada JSON puede tener distintos tipos de datos, por eso se diferencian de las tablas, que guardan los mismo datos.


Para decidir si se guarda en una base de datos relacional o no relacional hay que ver qué tipos de datos vamos a guardar(si van a ser estructurados o flexibles) y el tiempo de respuesta que necesito en la consulta.

---

## JMeter para hacer pruebas en ambas bases de datos

---

## :star:  3 - Clase 6 en vivo. Testing en Bases de Datos NoSql y SQL API's AWS y Ubuntu Server. Performance y stress.

---
