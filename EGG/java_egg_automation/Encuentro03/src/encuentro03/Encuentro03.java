package encuentro03;

import java.util.Scanner;

public class Encuentro03 {

    public static void main(String[] args) {
        System.out.println("* * * * * * * * Desafio 1 * * * * * * * *");
        // Escribir un programa que use un operador ternario para determinar 
        // si un número es par o impar
        // 1- Solicitar al usuario que ingrese un número y guardarlo en una variable.
        // 2- Crear un programa que identifique si el número es par o impar.
        // 3 - Mostrar el resultado en la consola.
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero para ver si es PAR o IMPAR: ");
        int num1 = sc.nextInt();
        if(num1 % 2 == 0) {
            System.out.println("Es PAR");
        } else {
            System.out.println("Es IMPAR");
        }
        
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
