# :computer: ENCUENTRO 3 - DESAFIOS EN JAVA

---

En esta sección, te enfrentarás a emocionantes desafíos que te ayudarán a fortalecer tus habilidades y poner en práctica los conceptos aprendidos hasta ahora. A través de estos desafíos, podrás aplicar tus conocimientos para resolver problemas y desarrollar programas funcionales. 

¡Ponte a prueba y demuestra tu destreza en Java! 💪

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> 
 Desafío I

El objetivo de este desafío es escribir un programa que use un operador ternario para determinar si un número es par o impar.

Te invitamos a ver el siguiente video para observar cómo funciona el programa: [ver video](https://youtu.be/V1p2J0Oaoi0)

Vas a tener que:

Solicitar al usuario que ingrese un número y guardarlo en una variable.

Crear un programa que identifique si el número es par o impar.

Mostrar el resultado en la consola.



```Java
package encuentro03;

import java.util.Scanner;

public class Encuentro03 {

    public static void main(String[] args) {
        System.out.println("* * * * * * * * Desafio 1 * * * * * * * *");
        // Escribir un programa que use un operador ternario para determinar si un número es par o impar
        // Solicitar al usuario que ingrese un número y guardarlo en una variable.
        // Crear un programa que identifique si el número es par o impar.
        // Mostrar el resultado en la consola.
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero para ver si es PAR o IMPAR: ");
        int num1 = sc.nextInt();
        boolean esPar = num1 % 2 == 0;
        System.out.println("¿El número ingresado es par? "+esPar);
    } 
}
```

![image](https://github.com/eugenia1984/QA/assets/72580574/71f9c094-c3ed-499a-9f95-1d31915fc13f)

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> Desafío II

El objetivo de este desafío es crear una calculadora básica en Java que pueda realizar operaciones aritméticas simples, como suma, resta, multiplicación y división. 

Te invitamos a ver el siguiente video para observar cómo funciona el programa: [ver video](https://youtu.be/PNAKgyrsoU8)

Vas a tener que:

1. Recibir dos números del usuario.

2. Declarar variables para almacenar los números y el resultado de la operación.

3. Permitir al usuario elegir qué operación quiere realizar.

4. Mostrar el resultado de la operación en la consola.

---

---
