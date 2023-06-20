package encuentro02;

import java.util.Scanner;

public class Encuentro02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int numero;
        // 1 - Solicitar al usuario que ingrese su nombre, guardarlo en una 
        // variable e imprimir el dato.
        System.out.print("Por favor ingrese su nombre:");
        nombre = sc.nextLine();
        System.out.println("nombre ingresado = " + nombre);
         System.out.println("* * * * * Ejercicio 2 * * * * *");
        // 2 - Solicitar al usuario que ingrese un número, guardarlo en una 
        // variable e imprimir el dato.
        System.out.print("Por favor ingrese un número entero: ");
        numero = sc.nextInt();
        System.out.println("número ingresado = " + numero);
         System.out.println("* * * * * Ejercicio 3 * * * * *");
        // 3 - Solicitar al usuario su nombre, luego solicita su edad e 
        //imprime en pantalla un mensaje que diga 
        // “Su nombres es [nombre del usuario] y su edad es [edad del usuario]”.
        String nombre2;
        int edad;
        System.out.print("Por favor ingrese su nombre:");
        nombre2 = sc.nextLine();
        System.out.println("Su nombre es "+nombre2+".");
        System.out.print("Por favor ingrese su edad: ");
        edad = sc.nextInt();
        System.out.println("Y su edad es "+edad);
         System.out.println("* * * * * Ejercicio 4 * * * * *");
        // 4 - Dados dos números, realizar las 5 operaciones posibles 
        // en Java y mostrar el resultado en consola.
        int num1 = 4;
        int num2 = 2;
        System.out.println("La SUMA de: "+num1+" y "+num2+", es: "+num1+num2);
        System.out.println("La RESTA de: "+num1+" y "+num2+", es: "+(num1-num2));
        System.out.println("La MULTIPLICACION de: "+num1+" y "+num2+", es: "+num1*num2);
        System.out.println("La DIVISION de: "+num1+" y "+num2+", es: "+num1/num2);
        System.out.println("El MODULO de: "+num1+" y "+num2+", es: "+num1%num2);
         System.out.println("* * * * * Ejercicio 5 * * * * *");
        // 5 - Pedir al usuario que ingrese dos números, guardarlos en una 
        // variable, realizar la suma de los números y mostrar el resultado 
        //en la consola.
        System.out.print("Ingrese un primer numero: ");
        int num3 = sc.nextInt();
        System.out.print("Ingrese un segundo número: ");
        int num4 = sc.nextInt();
        System.out.println("La suma de :"+num3+" y "+num4+", es: "+ (num3+num4));
        // 6 - Pedir al usuario que introduzca dos números, y:
        // 1 - Comparar si número 1 es mayor a número 2.
        // 2 - Entender si número 1 es distinto a número 2.
        // 3 - Entender si número 1 es divisible por 2.
        System.out.println("* * * * * Ejercicio 6 * * * * *");
        System.out.print("Ingrese un primer numero: ");
        int num5 = sc.nextInt();
        System.out.print("Ingrese un segundo número: ");
        int num6 = sc.nextInt();
        boolean esMayor = num5>num6;
        boolean esDistinto = num5 != num6;
        boolean esDivisible = num5 % num6 == 0;
        System.out.println("Es "+num5+" mayor a "+num6+": "+ esMayor);
        System.out.println("Es "+num5+" distinto a "+num6+": "+ esDistinto);
        System.out.println("Es "+num5+" es divisible a "+num6+": "+ esDivisible);
        System.out.println("* * * * * * * * * Ejercicio 7 * * * * * * * * *");
        // 7 Pedir al usuario que ingrese 4 números y comparar:
        // 1 - Si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4.
        // 2 - Si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4.
         System.out.print("Ingrese un primer numero: ");
        int num7 = sc.nextInt();
        System.out.print("Ingrese un segundo número: ");
        int num8 = sc.nextInt();
         System.out.print("Ingrese un primer numero: ");
        int num9 = sc.nextInt();
        System.out.print("Ingrese un segundo número: ");
        int num10 = sc.nextInt();
        boolean condicion1 = (num7 >num8) && (num9 > num10);
        boolean condicion2 = (num7>num8) || (num9 > num10);
        System.out.println("¿El número 1 es mayor al número 2 y si el número 3 es mayor al número 4? "+condicion1);
        System.out.println("¿El número 1 es mayor al número 2 o si el número 3 es mayor al número 4? "+condicion2);
    }
}
