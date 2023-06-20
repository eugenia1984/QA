/*
 * Ejercicio de calificación: 
 * Escribir un programa que solicite al usuario una puntuación entre 0 y 100. 
 * Luego, mostrar en pantalla la calificación correspondiente según la siguiente escala:
 * -Si la puntuación está entre 90 y 100, muestra "A".
 * -Si la puntuación está entre 80 y 89, muestra "B".
 * -Si la puntuación está entre 70 y 79, muestra "C".
 * -Si la puntuación está entre 60 y 69, muestra "D".
 * -Si la puntuación es menor a 60, muestra "F".
 */
package encuentro04trycatch;

import java.util.*;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int puntuacion = 0;
        
        try {
            do {
                System.out.print("Ingrese su puntuación (entre 1 a 100): ");
                puntuacion = sc.nextInt();  
            } while(puntuacion <0 || puntuacion > 100);
        
            convertirCalificacion(puntuacion);
        } catch (InputMismatchException e)  { // Si ingreso otra cosa que no sea numero
            System.out.println("No ingresó un número entero");   
        } catch(Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    // En base a la puntuacion recibida lo cambio a calificacion de letras
    // A -> 90-100
    // B -> 80 - 89
    // C -> 70 - 79
    // D -> 60 - 69
    // F -> 1 - 59
    public static void convertirCalificacion(int puntuacion) {
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
