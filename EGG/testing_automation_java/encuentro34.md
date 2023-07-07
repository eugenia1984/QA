# :computer: ENCUENTRO 34 - Maven

---

## :computer: Introducción

**¡Hola! **

Hasta ahora, hemos explorado los conceptos fundamentales de este poderoso lenguaje de programación y hemos adquirido conocimientos sobre su sintaxis y estructuras básicas. Sin embargo, nuestro aprendizaje no se detiene aquí, ¡es hora de llevar nuestras habilidades al siguiente nivel!

Maven es una poderosa herramienta de gestión de proyectos que nos permitirá simplificar y automatizar el proceso de construcción, dependencias y despliegue de nuestras aplicaciones. A medida que profundizamos en Maven, descubriremos cómo organizar eficientemente nuestras dependencias, compilar y ejecutar nuestros proyectos, y crear paquetes distribuibles listos para su implementación.

Si en algún momento necesitas repasar un concepto o refrescar tus conocimientos sobre "Maven”, puedes acceder a él a través del siguiente enlace:

[👉Teoría Java Maven](https://drive.google.com/file/d/1gyKTum7Wfc03BPVMTwU8JcsieAkVtK6U/view)

**¡Comencemos!**🚀

---

##:computer: Instalación y configuración


Mira el siguiente video para instalar y configurar maven: [ver video](https://youtu.be/8nehArOyNT4)

---

## :computer: Práctica Maven

Nos adentraremos en los primeros ejercicios sobre Maven.

**¡Manos a la obra!**

1.  Crea tu primer proyecto Maven donde simplemente imprimas un saludo con tu nombre y edad a través de un método.

📹 Mira el siguiente video si necesitas ayuda para crear tu primer proyecto de maven: [ver video](https://youtu.be/9MHQbs1_slU)

2.  Utiliza el el proyecto Maven anterior y ejecuta los siguientes comandos:

“mvn clean”: Después de ejecutar este comando, debes notar que la carpeta target ha sido eliminada.

“mvn compile”: Después de ejecutar este comando, debes notar que la carpeta target/classes ha sido creada y contiene los archivos .class compilados a partir de tu código fuente.

“mvn package”: Después de ejecutar este comando, debes notar que el archivo JAR (o WAR, dependiendo de tu configuración) ha sido creado en la carpeta target.

“mvn install” : Después de ejecutar este comando, debes notar que el archivo JAR ha sido copiado en tu repositorio local de Maven, que generalmente se encuentra en tu directorio de inicio, en la carpeta C:/Users/TuUsuario/documents/.m2/repository.

📹 Mira este video para saber como hacer esto desde la interfaz de vs code: [ver video](https://youtu.be/nwJZm6Cveuc)

3. Crea un proyecto maven basado en el ejercicio de calificaciones pasando su lógica y test dentro de las carpetas correspondientes. Recuerda configurar el pom.xml correctamente y luego ejecuta el siguiente comando:

“mvn test”:  Después de ejecutar este comando, debes notar que se han generado informes de prueba en el directorio target/surefire-reports (si estás utilizando el plugin Surefire, que es el predeterminado para las pruebas).

Ejercicio de calificaciones: Escribir un programa con sus métodos correspondientes que solicite al usuario una puntuación entre 0 y 100. Luego, mostrar en pantalla la calificación correspondiente según la siguiente escala:

Si la puntuación está entre 90 y 100, muestra "A".

Si la puntuación está entre 80 y 89, muestra "B".

Si la puntuación está entre 70 y 79, muestra "C".

Si la puntuación está entre 60 y 69, muestra "D".

Si la puntuación es menor a 60, muestra "F".

📹 Mira el siguiente video si necesitas ayuda para agregar Junit 5 como dependencia en Maven:
[ver video](https://youtu.be/SL9ywcxVbKQ)

4. Crea un proyecto maven usando el ejercicio del cuatro en línea con sus métodos y test y agregale la característica de que ahora en lugar de poner una ficha  puedas girar el tablero, lo que hará que las fichas se re acomoden a causa de la gravedad (recuerda agregar los test de los métodos nuevos que crees). Por ejemplo, si nuestro tablero es el siguiente:


Y el próximo turno es del jugador, y decide girar el tablero hacia la derecha, automáticamente gana la partida porque forma una diagonal de cuatro en línea.

```
1 2 3 4 5 6
O O O O O O
J O O O O O
J O O O O O
C J O O O O
C C J C O O
C J J J O O
J C C C O O
```

```
1 2 3 4 5 6 7 
O O O O O O O
O O O O O O O
O O C O J C O
O O J O J C O
O O J O C J C
O J J C C C J
```



---
