/*
 * Ejercicio de divisibilidad: 
 * Escribir un programa que solicite al usuario un número y determine si 
 * es divisible por 5 y por 3, por ninguno de los dos o por ambos. 
 * Mostrar el resultado en pantalla.
 */
package encuentro04trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        
        try {
           System.out.print("Ingrese un número para ver si es divisible por 5 y 3 o por ninguno de los dos: ");
           num = sc.nextInt();
           esDivisible(num);
        } catch (InputMismatchException e) {
            System.out.println("No ingresó un número entero"); 
        } catch(Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    public static void esDivisible(int num) {
        if (num % 5 == 0 && num % 3 == 0) {
            System.out.println(num+" es divisible por 3 y 5.");
        } else if (num % 5 != 0 && num % 3 != 0) {
            System.out.println(num+" NO es divisible por 3 y 5.");
        } else {
            System.out.println("Puede llegar a ser divisible por 3 ó 5");
        }
    }
}
