/*
 *  Ejercicio de días de la semana: 
 * Escribir un programa que solicite al usuario un número del 1 al 7, 
 * representando un día de la semana, y muestre en pantalla el nombre 
 * correspondiente a ese día. 
 * Utilizar la estructura "switch" para implementar este programa.
 */
package encuentro04trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia;
        int diaElegido;
        
        try {
            System.out.println("Ingrese un número del 1 al 7 para decirle que día de la semana es: ");
            diaElegido = sc.nextInt();
             if(diaElegido > 7 || diaElegido < 1) {
                System.out.println("Debería elegir entre 1 al 7.");
            } else {
                mostrarDia(diaElegido);
            }
        } catch (InputMismatchException e) {
            System.out.println("No ingresó un número entero"); 
        } catch(Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    public static void mostrarDia(int diaElegido) {
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
