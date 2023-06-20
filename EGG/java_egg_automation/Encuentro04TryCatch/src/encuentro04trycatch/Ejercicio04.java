/*
 * Ejercicio de verificación de contraseña: 
 * Escribir un programa que solicite al usuario una contraseña y verifique si 
 * coincide con una contraseña predefinida. Si la contraseña ingresada es correcta, 
 * mostrar un mensaje de "Acceso concedido".  De lo contrario, 
 * mostrar un mensaje de "Acceso denegado".
 */
package encuentro04trycatch;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = "HolaMundo";
        String passIngresado;
        
        try {
            System.out.print("Ingrese la contraseña para ingresar: ");
            passIngresado = sc.nextLine();
            corroborarContrasenia(passIngresado, pass);
        } catch(Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    public static void corroborarContrasenia(String pass1, String pass2) {
         if(pass1.equals(pass2)) {
                System.out.println("Acceso concedido");
            } else {
                System.out.println("Acceso denegado");
            }
    }  
}
