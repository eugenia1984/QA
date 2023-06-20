/*
 * Ejercicio de cálculo de descuento: 
 * Escribir un programa que solicite al usuario el precio de un producto y 
 * determine si tiene derecho a un descuento. Si el precio es mayor o igual a $100, 
 * aplicar un descuento del 10% y mostrar el nuevo precio. De lo contrario, 
 * mostrar el precio original sin descuento.
 */
package encuentro04trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejerccicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio;
        
        try {
            System.out.print("Ingrese el precio del producto: $");
            precio = sc.nextDouble();
            calcularPrecioFinal(precio);
        } catch (InputMismatchException e) {
            System.out.println("No ingresó un número entero"); 
        } catch(Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
    
    public static void calcularPrecioFinal(double precio) {
        if(precio >= 100) {
            precio = precio *0.9;
            System.out.println("Precio final: $ "+ precio);
        } else {
            System.out.println("Precio final: $ "+precio);
        }
    }
}
