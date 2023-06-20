# :computer: Estructuras de control: try-catch Class String y Math

---

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> Introducción

Llegó el momento de adentrarnos en una emocionante serie de ejercicios que nos brindarán la oportunidad de aplicar de manera práctica las **estructuras de control** y las **clases fundamentales** de Java.

Durante la realización de los ejercicios es natural que puedan surgir dudas. Por ese motivo, **además de contar con tu mesa de trabajo como apoyo, recuerda que tienes a tu disposición el material teórico**. Si en algún momento necesitas repasar un concepto o recordar cómo utilizar una clase o método en particular, puedes acceder al mismo a través del siguiente enlace:

[👉Teoría Java II](https://github.com/eugenia1984/QA/blob/main/EGG/testing_automation_java/teoria2.md)

No dudes en aprovecharlo para afianzar tus conocimientos y tener una base sólida mientras avanzas en los desafíos de programación. 


---

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/>  Estructuras de control: If, If-else y Switch

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/>  If & If-else

El objetivo de los siguientes ejercicios es aplicar los conceptos de las estructuras de control "if" y "if-else" en Java. A través de una serie de ejercicios prácticos, donde abordaremos situaciones diferentes, aprenderemos a utilizar estas estructuras para tomar decisiones basadas en condiciones específicas.

Para mayor contexto, te invitamos a ver el siguiente video: [ver video](https://youtu.be/Mf-mc45qbSE) y [ver video](https://youtu.be/rKchWAH7_yE)


## ¡Manos a la obra!

- **Ejercicio de calificación**: Escribir un programa que solicite al usuario una puntuación entre 0 y 100. Luego, mostrar en pantalla la calificación correspondiente según la siguiente escala:

Si la puntuación está entre 90 y 100, muestra "A".

Si la puntuación está entre 80 y 89, muestra "B".

Si la puntuación está entre 70 y 79, muestra "C".

Si la puntuación está entre 60 y 69, muestra "D".

Si la puntuación es menor a 60, muestra "F".


```Java
package encuentro04;

import java.util.Scanner;

public class Encuentro04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int puntuacion;
        System.out.println("* * * * * * * * Ejercicio 1 * * * * * * *");
        /*
        Ejercicio de calificación: 
        Escribir un programa que solicite al usuario una puntuación 
        entre 0 y 100. 
        Luego, mostrar en pantalla la calificación correspondiente 
        según la siguiente escala:
        -Si la puntuación está entre 90 y 100, muestra "A".
        -Si la puntuación está entre 80 y 89, muestra "B".
        -Si la puntuación está entre 70 y 79, muestra "C".
        -Si la puntuación está entre 60 y 69, muestra "D".
        -Si la puntuación es menor a 60, muestra "F".
        */
        do {
            System.out.print("Ingrese su puntuación: ");
            puntuacion = sc.nextInt();  
        } while(puntuacion <0 || puntuacion > 100);
        
        if(puntuacion<=100 && puntuacion >= 90) {
            System.out.println("Calificación: A");
        } else if (puntuacion<= 80 && puntuacion >= 89) { 
            System.out.println("Calificación: B");
        } else if (puntuacion<= 70 && puntuacion >= 79) { 
            System.out.println("Calificación: C");
        } else if (puntuacion<= 60 && puntuacion >= 69) { 
            System.out.println("Calificación: D");
        } else {
            System.out.println("Calificación: F");
        }
    } 
}
```

- **Ejercicio de números positivos y negativos**: Escribir un programa que solicite al usuario un número y determine si es positivo, negativo o cero. Mostrar el resultado en pantalla.

```Java
package encuentro04;

import java.util.Scanner;

public class Encuentro04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        System.out.println("* * * * * * * * Ejercicio 2 * * * * * * *");
        /*
        Ejercicio de números positivos y negativos: Escribir un programa que 
        solicite al usuario un número y determine si es positivo, negativo o cero. 
        Mostrar el resultado en pantalla.
        */
        int num1;
        System.out.println("Ingrese un número entero para decirle si es positivo, negativo o cero: ");
        num1 = sc.nextInt();
        if(num1 == 0) {
            System.out.println("Ingresó 0.");
        } else if( num1 > 0) {
            System.out.println("Ingresó un número negativo.");
        } else {
            System.out.println("Ingresó un número positivo.");
        }
    } 
}

```

- **Ejercicio de divisibilidad**: Escribir un programa que solicite al usuario un número y determine si es divisible por 5 y por 3, por ninguno de los dos o por ambos. Mostrar el resultado en pantalla.

```Java
package encuentro04;

import java.util.Scanner;

public class Encuentro04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("* * * * * * * * Ejercicio 3 * * * * * * *");
        /*
        Ejercicio de divisibilidad: Escribir un programa que solicite al usuario 
        un número y determine si es divisible por 5 y por 3, por ninguno de los 
        dos o por ambos. Mostrar el resultado en pantalla.
        */
        int num3;
        System.out.println("Ingrese un número para ver si es divisible por 5 y 3 o por ninguno de los dos: ");
        num3 = sc.nextInt();
        if (num3 % 5 == 0 && num3 % 3 == 0) {
            System.out.println(num3+" es divisible por 3 y 5.");
        }
        if (num3 % 5 != 0 && num3 % 3 != 0) {
            System.out.println(num3+" NO es divisible por 3 y 5.");
        }
    } 
}

```

- **Ejercicio de verificación de contraseña**: Escribir un programa que solicite al usuario una contraseña y verifique si coincide con una contraseña predefinida. Si la contraseña ingresada es correcta, mostrar un mensaje de "Acceso concedido". De lo contrario, mostrar un mensaje de "Acceso denegado".

```Java
package encuentro04;

import java.util.Scanner;

public class Encuentro04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.println("* * * * * * * * Ejercicio 4 * * * * * * *");
        /*
        Ejercicio de verificación de contraseña: Escribir un programa que solicite 
        al usuario una contraseña y verifique si coincide con una contraseña predefinida. 
        Si la contraseña ingresada es correcta, mostrar un mensaje de "Acceso concedido". 
        De lo contrario, mostrar un mensaje de "Acceso denegado".
        */
        String pass = "HolaMundo";
        String passIngresado;
        System.out.println("Ingrese la contraseña: ");
        passIngresado = sc.nextLine();
        if(passIngresado.equals(pass)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
    } 
}
```

- **Ejercicio de cálculo de descuento**: Escribir un programa que solicite al usuario el precio de un producto y determine si tiene derecho a un descuento. Si el precio es mayor o igual a $100, aplicar un descuento del 10% y mostrar el nuevo precio. De lo contrario, mostrar el precio original sin descuento.

```Java
package encuentro04;

import java.util.Scanner;

public class Encuentro04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        
        System.out.println("* * * * * * * * Ejercicio 5 * * * * * * *");
        /*
        Ejercicio de cálculo de descuento: Escribir un programa que solicite al 
        usuario el precio de un producto y determine si tiene derecho a un descuento. 
        Si el precio es mayor o igual a $100, aplicar un descuento del 10% y 
        mostrar el nuevo precio. De lo contrario, mostrar el precio original 
        sin descuento.
        */
        double precio;
        double precioFinal;
        System.out.print("Ingrese el precio del producto: $");
        precio = sc.nextDouble();
        if(precio >= 100) {
            precioFinal = precio *0.9;
            System.out.println("Precio final: $ "+ precioFinal);
        } else {
            System.out.println("Precio final: $ "+precio);
        }
    } 
}

```

---

## <img width="40" height="40" src="https://img.icons8.com/plasticine/40/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/>  Switch

El objetivo de estos otros ejercicios es aplicar la estructura de control "switch" en Java. Aprenderemos a utilizar esta estructura para realizar diferentes acciones en función de múltiples casos, y mejoraremos nuestra capacidad para tomar decisiones más complejas y resolver problemas de manera eficiente.

Para mayor contexto, te invitamos a ver el siguiente video: [ver video](https://youtu.be/uVuFODP9j2k)


## <img width="40" height="40" src="https://img.icons8.com/plasticine/40/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/>  ¡Manos a la obra!

- **Ejercicio de días de la semana**: Escribir un programa que solicite al usuario un número del 1 al 7, representando un día de la semana, y muestre en pantalla el nombre correspondiente a ese día. Utilizar la estructura "switch" para implementar este programa.

```Java
package encuentro04;

import java.util.Scanner;

public class Encuentro04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("* * * * * * * * Ejercicio 6 * * * * * * *");
        /*
        Ejercicio de días de la semana: Escribir un programa que solicite al 
        usuario un número del 1 al 7, representando un día de la semana, 
        y muestre en pantalla el nombre correspondiente a ese día. 
        Utilizar la estructura "switch" para implementar este programa.
        */
        String dia;
        int diaElegido;
        System.out.println("Ingrese un número del 1 al 7 para decirle que día de la semana es: ");
        diaElegido = sc.nextInt();
        if(diaElegido > 7 || diaElegido < 1) {
            System.out.println("Debería elegir entre 1 al 7.");
        } else {
            switch(diaElegido) {
                case 1:
                    System.out.println("1 - Lunes.");
                    break;
                case 2:
                    System.out.println("2 - Martes.");
                    break;
                case 3:
                    System.out.println("3 - Miércoles.");
                    break;
                case 4:
                    System.out.println("4 - Jueves.");
                    break;
                case 5:
                    System.out.println("5 - Viernes.");
                    break;
                case 6:
                    System.out.println("6 - Sábado.");
                    break;
                case 7:
                    System.out.println("7 - Domingo.");
                    break;
                default:
                    System.out.println("Opción erronea.");
                    break;
            }
        }
    } 
}
```

- **Ejercicio de conversión de calificaciones**: Escribir un programa que solicite al usuario una calificación numérica del 1 al 5 y muestre en pantalla la calificación correspondiente en letras, utilizando la siguiente escala:

1: "Muy deficiente"

2: "Deficiente"

3: "Suficiente"

4: "Notable"

5: "Sobresaliente". Utilizar la estructura "switch" para implementar este programa.

- **Ejercicio de selección de figura geométrica**: Escribir un programa que solicite al usuario un número del 1 al 3 para seleccionar una figura geométrica (1: círculo, 2: cuadrado, 3: triángulo). Luego, mostrar en pantalla el área correspondiente a la figura seleccionada. Utilizar la estructura "switch" para implementar este programa.

- **Ejercicio de verificación de día hábil**: Escribir un programa que solicite al usuario un número del 1 al 7, representando un día de la semana, y determine si es un día hábil o un día no hábil. Mostrar el resultado en pantalla.  Considerar que los días hábiles son del 1 al 5 (de lunes a viernes), y utilizar la estructura "switch" para implementar este programa.

- **Ejercicio de selección de opción**: Escribir un programa que muestre un menú con las siguientes opciones:

Opción 1: "Guardar"

Opción 2: "Cargar"

Opción 3: "Salir"  Solicitar al usuario que ingrese un número del 1 al 3 para seleccionar una opción. Utilizar la estructura "switch" para implementar este programa y mostrar en pantalla el mensaje correspondiente a la opción seleccionada.

---
