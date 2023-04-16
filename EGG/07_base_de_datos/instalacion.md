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

-[:tv: Insertar, Modificar y Eliminar  | Programación | Base de datos | V2 | Egg Educación](https://www.youtube.com/watch?v=Sa7f59JjKP4&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw&index=2)

- [:tv: Select. From. Where | Programación | Base de datos | V3 | Egg Educación](https://www.youtube.com/watch?v=bLocGDEEs0I&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw&index=3)

- [:tv: Tablas relacionadas | Programación | Base de datos | V4 | Egg Educación](https://www.youtube.com/watch?v=IiJk53KWJZc&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw&index=4)

- [:tv: Join avanzados | Programación | Base de datos | V5 | Egg Educación](https://www.youtube.com/watch?v=5XAkfs3K5ZI&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw&index=5)

- [:tv: Order by. Group by. Having | Programación | Base de datos | V6 | Egg Educación](https://www.youtube.com/watch?v=XE-vi6mNcuY&list=PLgwlfcqa5h3wm7w2RoYIQnLL4qD6odOyw&index=6)




