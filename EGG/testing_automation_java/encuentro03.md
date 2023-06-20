# :computer: ENCUENTRO 3 - DESAFIOS EN JAVA

---

En esta sección, te enfrentarás a emocionantes desafíos que te ayudarán a fortalecer tus habilidades y poner en práctica los conceptos aprendidos hasta ahora. A través de estos desafíos, podrás aplicar tus conocimientos para resolver problemas y desarrollar programas funcionales. 

¡Ponte a prueba y demuestra tu destreza en Java! 💪

## <img width="40" height="40" src="https://img.icons8.com/plasticine/40/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> Desafío I

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

## <img width="40" height="40" src="https://img.icons8.com/plasticine/40/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> Desafío II

El objetivo de este desafío es crear una calculadora básica en Java que pueda realizar operaciones aritméticas simples, como suma, resta, multiplicación y división. 

Te invitamos a ver el siguiente video para observar cómo funciona el programa: [ver video](https://youtu.be/PNAKgyrsoU8)

Vas a tener que:

1. Recibir dos números del usuario.

2. Declarar variables para almacenar los números y el resultado de la operación.

3. Permitir al usuario elegir qué operación quiere realizar.

4. Mostrar el resultado de la operación en la consola.


```Java
package encuentro03;

import java.util.Scanner;

public class Encuentro03 {

    public static void main(String[] args) {        
        System.out.println("* * * * * * * * Desafio 2 * * * * * * * *");
        // Crear una calculadora básica en Java que pueda realizar operaciones aritmética
        // 1 - Recibir dos números del usuario.
        // 2 - Declarar variables para almacenar los números y el resultado de la operación.
        // 3 - Permitir al usuario elegir qué operación quiere realizar.
        // 4 - Mostrar el resultado de la operación en la consola.
        int num2, num3, opcion;
        double resultado;
        System.out.print("Ingrese un primer número entero: ");
        num2 = sc.nextInt();
        System.out.print("Ingrese un segundo número entero: ");
        num3 = sc.nextInt();
        do {
            System.out.print("Ingresa un número con la opción de la operación a relizar.");
            System.out.println("\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir");
            opcion = sc.nextInt();
        } while (opcion < 0 || opcion > 4);
        
        switch(opcion) {
            case 1: // sumar
                resultado = num2+num3;
                System.out.println("La SUMA de: "+num2+" y "+num3+" es: "+resultado);
                break;
            case 2: // restar    
                resultado = num2-num3;
                System.out.println("La RESTA de: "+num2+" y "+num3+" es: "+resultado);
                break;
            case 3: // multiplicar
                resultado = num2*num3;
                System.out.println("La MULTIPLICACIÓN de: "+num2+" y "+num3+" es: "+resultado);
                break;
            case 4: // dividir
                if(num3 == 0 || num3 < 0) {
                    System.out.println("No podemos dividir por cero o por un número negativo.");
                } else {
                    resultado = num2/num3;
                    System.out.println("La DIVISIÓN de: "+num2+" y "+num3+" es: "+resultado);
                }
                break;
            default:
                System.out.println("Debe elegir una opicón entre 1, 2, 3 ó 4.");
                break;
        }
    }
}
```

![image](https://github.com/eugenia1984/QA/assets/72580574/9f6e66ee-54c5-4b6e-b1dc-4dfbabfad413)


---
