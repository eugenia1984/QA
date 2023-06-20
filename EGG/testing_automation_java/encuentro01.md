# <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> Primeros pasos con Java

## 9.1 - Primeros pasos con Java: Instalación de Java y setear ambiente de trabajo en visual / Programas y tipos de datos

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> Introducción

Hola! 👋 Te damos la bienvenida a “Introducción a la programación backend con Java”.

Durante esta etapa, exploraremos los fundamentos de la programación backend utilizando el lenguaje Java. Para ello, encontrarás una combinación de teoría y práctica para adquirir los conocimientos necesarios y fortalecer tus habilidades en el desarrollo de aplicaciones backend:

- **Parte teórica**: Nos adentraremos en los conceptos fundamentales que sustentan la programación backend. Veremos temas como la arquitectura cliente-servidor, el manejo de datos, creación de programas y mucho más. A través de explicaciones claras y ejemplos, construiremos una sólida base de conocimiento que sentará los cimientos para tus futuros proyectos.

Podrás acceder a la misma desde [estes enlace](https://assets.ctfassets.net/lg4qnzuw6s7g/6yWn6nRYBXYWUr6LcPtNYv/3d53d0f9c23d1582a4bdea1837e05c96/Teor__a_JAVA_1.pdf)

- **Parte práctica**: Aquí es donde pondrás en práctica todo lo que has leído en la parte teórica a través de emocionantes ejercicios y desafíos para consolidar tus habilidades. Desde la implementación de funcionalidades clave hasta la resolución de problemas complejos, te sumergirás en el mundo real de la programación backend.

💡 Recuerda que no estarás sol@ en este viaje de aprendizaje. Siempre puedes recurrir al material teórico como referencia, interactuar con tus compañer@s de la mesa de trabajo y solicitar la ayuda de nuestros mentores expertos. Estamos aquí para apoyarte en cada paso del camino y asegurarnos de que tengas una experiencia de aprendizaje enriquecedora.

**¡Comencemos!** 🚀

---

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> Instalación de Java y setear el ambiente de trabajo en visual


Para empezar este recorrido, empezaremos instalando el programa de Java y setearemos el ambiente de trabajo.

1. Para descargar Java (versión del openjdk provista por la Eclipse Foundation) de acuerdo a tu sistema operativo vas a poder ingresar al siguiente link: 👉https://adoptium.net/es/temurin/releases/?version=20   -> [ver video](https://youtu.be/gwFA2FX0zks)

💡Nosotros usaremos la versión 20 de Java que salió en marzo de 2023 porque sus mejoras aparecerán también en la versión 21 próxima a salir. Puedes saber más sobre el soporte de las versiones de java entrando al siguiente 👉link. 

2. Luego lo vamos a instalar y configurar las variables de entorno en Java: [ver el video](https://youtu.be/VV-gR7hEzwE)

💡Para chequear que todo esté correctamente instalado, puedes abrir la terminal en tu ordenador y colocar “java –version”

![image](https://github.com/eugenia1984/QA/assets/72580574/733fb079-3eba-44cf-902f-ef236cbb93a4)

3. Para finalizar con el seteo del ambiente de trabajo, vamos a abrir Visual Studio Code, iremos a la parte de Aplicaciones y haremos clic en instalar “Extension Pack for Java”. [ver el video](https://youtu.be/kaf1uFt6Vts)

Una vez completada esta instalación, hemos configurado nuestro entorno de trabajo y ¡está todo listo para comenzar a programar!

---

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/>  Programas y tipos de datos

Es hora de sumergirnos en una serie de ejercicios que nos permitirán aplicar de manera práctica los conceptos básicos de Java.

## <img width="40" height="40" src="https://img.icons8.com/plasticine/40/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> Imprimir en consola

El objetivo de los siguiente tres ejercicios es familiarizarse con la impresión en la consola utilizando Java. Nos permitirán practicar la sintaxis básica y comprender cómo mostrar información en la consola.

Para mayor contexto, te invitamos a ver [el siguiente video](https://youtu.be/5lgFT9zzZUg)

**¡Manos a la obra!**

1. Crear un programa que imprima "Hola Mundo" en la consola. 

2. Crear un programa que imprima "Mi nombre es [tu nombre]" en la consola. 

3. Crear un programa que imprima "Mi edad es [edad]" en la consola. 

💡A tener en cuenta:

Todo lo que aparezca entre [ ] indica que el contenido debe ser reemplazado. Por ejemplo:  "Mi nombre es [tu nombre]" = "Mi nombre es Alejandro".

Por el momento, todas las instrucciones que ejecutemos deben estar dentro del bloque de código "public static void main(String[] args) throws Exception { }".


![image](https://github.com/eugenia1984/QA/assets/72580574/a22c1f97-3ce0-4e40-8a27-63141c7b85a4)

```Java
package encuentro01;

public class Encuentro01 {

    public static void main(String[] args) {
        String name = "María Eugenia";
        int age = 38;
        // 1 - Crear un programa que imprima "Hola Mundo" en la consola.
        System.out.println("Hola mundo");
        // 2 - Crear un programa que imprima "Mi nombre es [tu nombre]" en la consola.
        System.out.println("Mi nombre es: " + name);
        // 3 - Crear un programa que imprima "Mi edad es [edad]" en la consola.
        System.out.println("Mi edad es: " + age);
    }  
}
```

![image](https://github.com/eugenia1984/QA/assets/72580574/72d0514d-7d17-4b36-87fc-ca7295baed86)


## <img width="40" height="40" src="https://img.icons8.com/plasticine/40/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> Variables y tipos de datos
 
El objetivo de los siguientes ejercicios es familiarizarnos con la declaración de variables y los diferentes tipos de datos en Java. A través de la creación de variables de distintos tipos, buscamos practicar la asignación de valores y la impresión de información en la consola. Al finalizar, esperamos lograr imprimir un mensaje personalizado que incluya el nombre y la edad almacenados en las variables correspondientes.

Para mayor contexto, te invitamos a ver el [siguiente video](https://youtu.be/vWMQdzA85lI)

¡Manos a la obra!

1. Crear una variable por cada uno de los siguientes tipos de dato:

a. boolean

b. char

c. String

d. Int

e. long

f. float

2. Imprimir en consola el contenido de al menos una de las variables que creamos en el paso anterior.

3. Declarar una variable para edad y otra para nombre e imprimir en pantalla un texto que diga “Mi nombre es [nombre], y tengo [edad] años”.

💡A tener en cuenta - Para concatenar un texto y una variable se usa el símbolo “+”. - Para conocer todos los tipos de datos, podrás revisar el apartado de “Variables y Tipos de datos” del 👉[material teórico](https://drive.google.com/file/d/1_p-ph7cgFDqv5sar1EQs56pZ22JeN5dr/view?usp=drive_link)



```Java
package encuentro01;

public class Encuentro01 {

    public static void main(String[] args) {
        boolean boleana = true;
        char caracter = 'a';
        String cadena = "Esta es una cadena de texto";
        int entero = 4;
        long numeroLong = 9_223_372_036_854_775_805L;
        float numeroFloat = 5.4f; 
        String nombre = "María Eugenia";
        int anios = 38;
        System.out.println("Mi nombre es "+nombre+", y tengo "+anios+" años.");
    }  
}
```

![image](https://github.com/eugenia1984/QA/assets/72580574/66febefe-b97e-4514-a36b-cd6000571237)

---
