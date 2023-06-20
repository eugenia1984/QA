/*
 * Ejercicio de números positivos y negativos: 
 * Escribir un programa que solicite al usuario un número y determine si 
 * es positivo, negativo o cero. Mostrar el resultado en pantalla.
 */
package encuentro04trycatch;

import java.util.*;

public class Ejercicio02 {
    public static void main(String[] args) {;
        Scanner sc = new Scanner(System.in);
        int num;
        
        try {
            System.out.print("Ingrese un número entero para decirle si es positivo, negativo o cero: ");
            num = sc.nextInt();
            esPositivoNegativoOCero(num);
        } catch (InputMismatchException e) {
            System.out.println("No ingresó un número entero"); 
        } catch(Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    // Dado un numero
    // informo por teclado si es: cero, negativo o positivo
    public static void esPositivoNegativoOCero(int num) {
        if(num == 0) {
            System.out.println("Ingresó 0.");
        } else if( num < 0) {
            System.out.println("Ingresó un número negativo.");
        } else {
            System.out.println("Ingresó un número positivo.");
        }
    }
}
