package encuentro04;

import java.util.Scanner;

public class Encuentro04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("* * * * * * * * Ejercicio 1 * * * * * * *");
        /*
        Ejercicio de calificación: 
        Escribir un programa que solicite al usuario una puntuación 
        entre 0 y 100. 
        Luego, mostrar en pantalla la calificación correspondiente 
        según la siguiente escala:
        -Si la puntuación está entre 90 y 100, muestra "A".
        -Si la puntuación está entre 80 y 89, muestra "B".
        -Si la puntuación está entre 70 y 79, muestra "C".
        -Si la puntuación está entre 60 y 69, muestra "D".
        -Si la puntuación es menor a 60, muestra "F".
        */
        int puntuacion;
        do {
            System.out.print("Ingrese su puntuación: ");
            puntuacion = sc.nextInt();  
        } while(puntuacion <0 || puntuacion > 100);
        
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
    
        
        System.out.println("* * * * * * * * Ejercicio 2 * * * * * * *");
        /*
        Ejercicio de números positivos y negativos: Escribir un programa que 
        solicite al usuario un número y determine si es positivo, negativo o cero. 
        Mostrar el resultado en pantalla.
        */
        int num1;
        System.out.println("Ingrese un número entero para decirle si es positivo, negativo o cero: ");
        num1 = sc.nextInt();
        if(num1 == 0) {
            System.out.println("Ingresó 0.");
        } else if( num1 > 0) {
            System.out.println("Ingresó un número negativo.");
        } else {
            System.out.println("Ingresó un número positivo.");
        }
        
        System.out.println("* * * * * * * * Ejercicio 3 * * * * * * *");
        /*
        Ejercicio de divisibilidad: Escribir un programa que solicite al usuario 
        un número y determine si es divisible por 5 y por 3, por ninguno de los 
        dos o por ambos. Mostrar el resultado en pantalla.
        */
        int num3;
        System.out.println("Ingrese un número para ver si es divisible por 5 y 3 o por ninguno de los dos: ");
        num3 = sc.nextInt();
        if (num3 % 5 == 0 && num3 % 3 == 0) {
            System.out.println(num3+" es divisible por 3 y 5.");
        }
        if (num3 % 5 != 0 && num3 % 3 != 0) {
            System.out.println(num3+" NO es divisible por 3 y 5.");
        }
        
        
        System.out.println("* * * * * * * * Ejercicio 4 * * * * * * *");
        /*
        Ejercicio de verificación de contraseña: Escribir un programa que solicite 
        al usuario una contraseña y verifique si coincide con una contraseña predefinida. 
        Si la contraseña ingresada es correcta, mostrar un mensaje de "Acceso concedido". 
        De lo contrario, mostrar un mensaje de "Acceso denegado".
        */
        String pass = "HolaMundo";
        String passIngresado;
        System.out.println("Ingrese la contraseña: ");
        passIngresado = sc.nextLine();
        if(passIngresado.equals(pass)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
        
        
        System.out.println("* * * * * * * * Ejercicio 5 * * * * * * *");
        /*
        Ejercicio de cálculo de descuento: Escribir un programa que solicite al 
        usuario el precio de un producto y determine si tiene derecho a un descuento. 
        Si el precio es mayor o igual a $100, aplicar un descuento del 10% y 
        mostrar el nuevo precio. De lo contrario, mostrar el precio original 
        sin descuento.
        */
        double precio;
        double precioFinal;
        System.out.print("Ingrese el precio del producto: $");
        precio = sc.nextDouble();
        if(precio >= 100) {
            precioFinal = precio *0.9;
            System.out.println("Precio final: $ "+ precioFinal);
        } else {
            System.out.println("Precio final: $ "+precio);
        }
        
        System.out.println("* * * * * * * * Ejercicio 6 * * * * * * *");
        /*
        Ejercicio de días de la semana: Escribir un programa que solicite al 
        usuario un número del 1 al 7, representando un día de la semana, 
        y muestre en pantalla el nombre correspondiente a ese día. 
        Utilizar la estructura "switch" para implementar este programa.
        */
        String dia;
        int diaElegido;
        System.out.println("Ingrese un número del 1 al 7 para decirle que día de la semana es: ");
        diaElegido = sc.nextInt();
        if(diaElegido > 7 || diaElegido < 1) {
            System.out.println("Debería elegir entre 1 al 7.");
        } else {
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
        System.out.println("* * * * * * * * Ejercicio 7 * * * * * * *");
        /*
        Ejercicio de conversión de calificaciones: Escribir un programa que 
        solicite al usuario una calificación numérica del 1 al 5 y muestre 
        en pantalla la calificación correspondiente en letras, 
        utilizando la siguiente escala:
        1: "Muy deficiente"
        2: "Deficiente"
        3: "Suficiente"
        4: "Notable"
        5: "Sobresaliente". Utilizar la estructura "switch" para implementar este programa.
        */
        int calificacionAConvertir;
        do {
            System.out.println("Ingrese la caliicación (1/5): ");
            calificacionAConvertir = sc.nextInt();
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
        } while (calificacionAConvertir <0 || calificacionAConvertir > 5);
        
        System.out.println("* * * * * * * * Ejercicio 8 * * * * * * *");
        /*
        Ejercicio de selección de figura geométrica: Escribir un programa que 
        solicite al usuario un número del 1 al 3 para seleccionar una figura 
        geométrica (1: círculo, 2: cuadrado, 3: triángulo). 
        Luego, mostrar en pantalla el área correspondiente a la figura seleccionada. 
        Utilizar la estructura "switch" para implementar este programa.
        */
        int eleccionFigura;
        double area;
        do {
            System.out.println("Inserte un número para elegir la figura geometrica: "+
                    "1-circulo / 2-cuadrado / 3-triangulo");
            eleccionFigura = sc.nextInt();
        } while (eleccionFigura<0 || eleccionFigura >3);
        switch(eleccionFigura) {
            case 1: // circulo
                double radio;
                System.out.println("Ingrese el RADIO del círculo: ");
                radio = sc.nextDouble();
                area = Math.sqrt(Math.PI * radio);
                System.out.println("El área del círculo es: " + area);
                break;
            case 2: // cuadrado
                double lado;
                System.out.println("Ingrese el LADO del cuadrado: ");
                lado = sc.nextDouble();
                area = lado * lado;
                System.out.println("El area del cuadrado es: " + area);
                break;
            case 3: // triangulo
                double base, altura;
                System.out.println("Ingresa la BASE del triángulo: ");
                base = sc.nextDouble();
                System.out.println("Ingresa la ALTURA del triángulo: ");
                altura = sc.nextDouble();
                area = (base * altura) / 2;
                System.out.println("El área del triángulo es: "+area);
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
        System.out.println("* * * * * * * * Ejercicio 9 * * * * * * *");
        /*
        Ejercicio de verificación de día hábil: Escribir un programa que solicite 
        al usuario un número del 1 al 7, representando un día de la semana, 
        y determine si es un día hábil o un día no hábil. Mostrar el resultado
        en pantalla. Considerar que los días hábiles son del 1 al 5 (de lunes a viernes), 
        y utilizar la estructura "switch" para implementar este programa.
        */
         int diaSeleccionado;
        do {
            System.out.println("Ingrese un número del 1 al 7, donde 1 es Lunes, 2 es Martes,"+
                    " ,..., 7 es Domingo, para decirle si es día hábilo no: ");
            diaSeleccionado = sc.nextInt();
            switch(diaSeleccionado) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Es día HÁBIL");
                    break;
                case 6:
                case 7:
                    System.out.println("Es FIN DE SEMANA");
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        } while (diaSeleccionado<0 || diaSeleccionado>7);
        
        System.out.println("* * * * * * * * Ejercicio 10 * * * * * * *");
        /*
        Ejercicio de selección de opción: Escribir un programa que muestre un menú 
        con las siguientes opciones:
        Opción 1: "Guardar"
        Opción 2: "Cargar"
        Opción 3: "Salir" Solicitar al usuario que ingrese un número del 1 al 3 
        para seleccionar una opción. Utilizar la estructura "switch" para 
        implementar este programa y mostrar en pantalla el mensaje correspondiente 
        a la opción seleccionada.
        */
        int seleccionIngresada2;
        do {
            System.out.println("Ingrese: \n1 - Guardar\n2 - Cargar\n3 - Salir");
            seleccionIngresada2 = sc.nextInt();
            switch(seleccionIngresada2) {
                case 1:
                    System.out.println("GUARDAR");
                    break;
                case 2:
                    System.out.println("CARGAR");
                    break;
                case 3:
                    System.out.println("SALIR");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while(seleccionIngresada2<1 || seleccionIngresada2>3);
     
    } 
}
