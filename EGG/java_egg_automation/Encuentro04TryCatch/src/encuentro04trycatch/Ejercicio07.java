/*
 *  Ejercicio de conversión de calificaciones: 
 * Escribir un programa que solicite al usuario una calificación numérica del 
 * 1 al 5 y muestre en pantalla la calificación correspondiente en letras, 
 * utilizando la siguiente escala:
 * 1: "Muy deficiente"
 * 2: "Deficiente"
 * 3: "Suficiente"
 * 4: "Notable"
 * 5: "Sobresaliente". Utilizar la estructura "switch" para implementar este programa.
 */
package encuentro04trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author juan
 */
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int calificacionAConvertir;
        try {
            do {
                System.out.println("Ingrese la caliicación (1/5): ");
                calificacionAConvertir = sc.nextInt();
                convertirCalificacion(calificacionAConvertir);
            } while (calificacionAConvertir <0 || calificacionAConvertir > 5);
        } catch (InputMismatchException e) {
            System.out.println("No ingresó un número entero"); 
        } catch(Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    public static void convertirCalificacion(int calificacionAConvertir) {
        switch(calificacionAConvertir) {
            case 1:
                System.out.println("Muy deficiente");
                break;
            case 2:
                System.out.println("Deficiente");
                break;
            case 3:
                System.out.println("Suficiente");
                break;
            case 4:
                System.out.println("Notable");
                break;
            case 5:
                System.out.println("Sobresaliente");
                break;
            default:
                System.out.println("Opción invalida");
        }
    }
}
