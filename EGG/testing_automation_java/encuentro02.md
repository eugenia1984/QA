# :computer: ENCUENTRO 2 - SCANNER, OPERACIONES Y OPERADORES

---

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/>  Scanner

El objetivo del siguiente ejercicio es utilizar la clase Scanner de Java para interactuar con el usuario y solicitarle datos de entrada. A través de la lectura de datos ingresados por el usuario, se practica la asignación de valores a variables y la impresión de información en la consola.

Para mayor contexto, te invitamos a ver el siguiente video: [ver video](https://youtu.be/KFRtT8ibhLo)

## ¡Manos a la obra!

1. Solicitar al usuario que ingrese su nombre, guardarlo en una variable e imprimir el dato. 

2. Solicitar al usuario que ingrese un número, guardarlo en una variable e imprimir el dato. 

3. Solicitar al usuario su nombre, luego solicita su edad e imprime en pantalla un mensaje que diga “Su nombres es [nombre del usuario] y su edad es [edad del usuario]”.



![image](https://github.com/eugenia1984/QA/assets/72580574/bb651913-fafe-4c99-a4fe-fe8f8568ce2e)

---

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/>   Operaciones

El objetivo del siguiente ejercicio es practicar el uso de operaciones aritméticas en Java. A través de la realización de diversas operaciones entre números, se busca reforzar el conocimiento sobre las operaciones básicas disponibles en el lenguaje, como la suma (+), resta (-), multiplicación (*), división (/) y módulo (%). Se realizarán operaciones tanto con valores predeterminados como con valores ingresados por el usuario. 

Para mayor contexto, te invitamos a ver el siguiente video: [ver video](https://youtu.be/l1ieLWz4rnQ)

¡Manos a la obra!

1. Dados dos números, realizar las 5 operaciones posibles en Java y mostrar el resultado en consola. 

2. Pedir al usuario que ingrese dos números, guardarlos en una variable, realizar la suma de los números y mostrar el resultado en la consola.


![image](https://github.com/eugenia1984/QA/assets/72580574/6c229032-4161-4f28-a82c-5735ef835850)

```Java
package encuentro02;

import java.util.Scanner;

public class Encuentro02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 4 - Dados dos números, realizar las 5 operaciones posibles en Java y mostrar el resultado en consola.
        int num1 = 4;
        int num2 = 2;
        System.out.println("La SUMA de: "+num1+" y "+num2+", es: "+num1+num2);
        System.out.println("La RESTA de: "+num1+" y "+num2+", es: "+(num1-num2));
        System.out.println("La MULTIPLICACION de: "+num1+" y "+num2+", es: "+num1*num2);
        System.out.println("La DIVISION de: "+num1+" y "+num2+", es: "+num1/num2);
        System.out.println("El MODULO de: "+num1+" y "+num2+", es: "+num1%num2);
        // 5 - Pedir al usuario que ingrese dos números, guardarlos en una variable, realizar la suma de los números y 
        // mostrar el resultado en la consola.
        System.out.print("Ingrese un primer numero: ");
        int num3 = sc.nextInt();
        System.out.print("Ingrese un segundo número: ");
        int num4 = sc.nextInt();
        System.out.println("La suma de :"+num3+" y "+num4+", es: "+ (num3+num4));
    }
}
```

---

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/>  Operadores

El objetivo de este otro ejercicio es practicar el uso de operadores de comparación y lógicos en Java. A través de la interacción con el usuario, se buscará comparar dos números ingresados y evaluar diversas condiciones utilizando operadores como mayor que, distinto que y divisible por dos. Se espera comprender el funcionamiento y la sintaxis de estos operadores, así como su aplicación en la lógica de programación. Además, se realizarán comparaciones adicionales utilizando operadores lógicos para evaluar condiciones combinadas. Al finalizar el ejercicio, se podrá determinar si se cumplen ciertas condiciones lógicas establecidas.

Para mayor contexto, te invitamos a ver el siguiente video: [ver vide](https://youtu.be/TvEDlFam_IY)

**¡Manos a la obra!**

1. Pedir al usuario que introduzca dos números, y: 

- 1 - Comparar si número 1 es mayor a número 2.

- 2 - Entender si número 1 es distinto a número 2.

- 3 - Entender si número 1 es divisible por 2.

💡Los operadores de comparación más utilizados en Java son: igualdad (==), distinto que (!=), mayor que (>), menor que (<), mayor o igual que (>=), menor o igual que (<=).



```Java
package encuentro02;

import java.util.Scanner;

public class Encuentro02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 6 - Pedir al usuario que introduzca dos números, y:
        // 1 - Comparar si número 1 es mayor a número 2.
        // 2 - Entender si número 1 es distinto a número 2.
        // 3 - Entender si número 1 es divisible por 2.
        System.out.println("* * * * * Ejercicio 6 * * * * *");
        System.out.print("Ingrese un primer numero: ");
        int num5 = sc.nextInt();
        System.out.print("Ingrese un segundo número: ");
        int num6 = sc.nextInt();
        boolean esMayor = num5>num6;
        boolean esDistinto = num5 != num6;
        boolean esDivisible = num5 % num6 == 0;
        System.out.println("Es "+num5+" mayor a "+num6+": "+ esMayor);
        System.out.println("Es "+num5+" distinto a "+num6+": "+ esDistinto);
         System.out.println("Es "+num5+" es divisible a "+num6+": "+ esDivisible);
    }
}

```


![image](https://github.com/eugenia1984/QA/assets/72580574/64a3e065-cc02-4072-846e-ed928d4791e4)


1. Pedir al usuario que ingrese 4 números y comparar:

- 1 - Si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4.

- 2 - Si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4.

💡Los operadores lógicos más utilizados en Java son: AND (&&), OR (||), siendo AND = y  / OR = o.

---
