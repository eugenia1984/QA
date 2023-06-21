# :computer: ENCUENTRO 04 - Estructuras de control: If, If-else y Switch

## Introducción

Llegó el momento de adentrarnos en una emocionante serie de ejercicios que nos brindarán la oportunidad de aplicar de manera práctica las **estructuras de control** y las **clases fundamentales** de Java.

Durante la realización de los ejercicios es natural que puedan surgir dudas. Por ese motivo, **además de contar con tu mesa de trabajo como apoyo, recuerda que tienes a tu disposición el material teórico**. Si en algún momento necesitas repasar un concepto o recordar cómo utilizar una clase o método en particular, puedes acceder al mismo a través del siguiente enlace:

[👉Teoría Java II](https://github.com/eugenia1984/QA/blob/main/EGG/testing_automation_java/teoria2.md)

No dudes en aprovecharlo para afianzar tus conocimientos y tener una base sólida mientras avanzas en los desafíos de programación. 


---

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/>  Estructuras de control: If, If-else y Switch

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/>  If & If-else

El objetivo de los siguientes ejercicios es aplicar los conceptos de las estructuras de control "if" y "if-else" en Java. A través de una serie de ejercicios prácticos, donde abordaremos situaciones diferentes, aprenderemos a utilizar estas estructuras para tomar decisiones basadas en condiciones específicas.

Para mayor contexto, te invitamos a ver el siguiente video: [ver video](https://youtu.be/Mf-mc45qbSE) y [ver video](https://youtu.be/rKchWAH7_yE)


## ¡Manos a la obra!

- **Ejercicio de calificación**: Escribir un programa que solicite al usuario una puntuación entre 0 y 100. Luego, mostrar en pantalla la calificación correspondiente según la siguiente escala:

Si la puntuación está entre 90 y 100, muestra "A".

Si la puntuación está entre 80 y 89, muestra "B".

Si la puntuación está entre 70 y 79, muestra "C".

Si la puntuación está entre 60 y 69, muestra "D".

Si la puntuación es menor a 60, muestra "F".


```Java
package encuentro04;

import java.util.Scanner;

public class Encuentro04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int puntuacion;
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
    } 
}
```


## Mejorando usando TRY-CATCH y EXCEPTION:

```Java
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
```

---

- **Ejercicio de números positivos y negativos**: Escribir un programa que solicite al usuario un número y determine si es positivo, negativo o cero. Mostrar el resultado en pantalla.

```Java
package encuentro04;

import java.util.Scanner;

public class Encuentro04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
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
        } else if( num1 < 0) {
            System.out.println("Ingresó un número negativo.");
        } else {
            System.out.println("Ingresó un número positivo.");
        }
    } 
}
```

## Con try-catch y Exception

```Java
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
```

---

- **Ejercicio de divisibilidad**: Escribir un programa que solicite al usuario un número y determine si es divisible por 5 y por 3, por ninguno de los dos o por ambos. Mostrar el resultado en pantalla.

```Java
package encuentro04;

import java.util.Scanner;

public class Encuentro04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
    } 
}
```

## Mejorado con try-catch, exception y usando una función

```Java
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
```

---

- **Ejercicio de verificación de contraseña**: Escribir un programa que solicite al usuario una contraseña y verifique si coincide con una contraseña predefinida. Si la contraseña ingresada es correcta, mostrar un mensaje de "Acceso concedido". De lo contrario, mostrar un mensaje de "Acceso denegado".

```Java
package encuentro04;

import java.util.Scanner;

public class Encuentro04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
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
    } 
}
```

## Mejorado con try, catch, Exception y funcion

```Java
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
```

---

- **Ejercicio de cálculo de descuento**: Escribir un programa que solicite al usuario el precio de un producto y determine si tiene derecho a un descuento. Si el precio es mayor o igual a $100, aplicar un descuento del 10% y mostrar el nuevo precio. De lo contrario, mostrar el precio original sin descuento.

```Java
package encuentro04;

import java.util.Scanner;

public class Encuentro04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        
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
    } 
}
```

## Mejorado con try, catch, exception y funcion

```Java
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
```

---

## <img width="40" height="40" src="https://img.icons8.com/plasticine/40/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/>  Switch

El objetivo de estos otros ejercicios es aplicar la estructura de control "switch" en Java. Aprenderemos a utilizar esta estructura para realizar diferentes acciones en función de múltiples casos, y mejoraremos nuestra capacidad para tomar decisiones más complejas y resolver problemas de manera eficiente.

Para mayor contexto, te invitamos a ver el siguiente video: [ver video](https://youtu.be/uVuFODP9j2k)


## <img width="40" height="40" src="https://img.icons8.com/plasticine/40/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/>  ¡Manos a la obra!

- **Ejercicio de días de la semana**: Escribir un programa que solicite al usuario un número del 1 al 7, representando un día de la semana, y muestre en pantalla el nombre correspondiente a ese día. Utilizar la estructura "switch" para implementar este programa.

```Java
package encuentro04;

import java.util.Scanner;

public class Encuentro04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
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
    } 
}
```


## Con try-catch, exception y funcion

```Java
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
```


---

- **Ejercicio de conversión de calificaciones**: Escribir un programa que solicite al usuario una calificación numérica del 1 al 5 y muestre en pantalla la calificación correspondiente en letras, utilizando la siguiente escala:

1: "Muy deficiente"

2: "Deficiente"

3: "Suficiente"

4: "Notable"

5: "Sobresaliente". Utilizar la estructura "switch" para implementar este programa.

```Java
package encuentro04;

import java.util.Scanner;

public class Encuentro04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
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
        
    } 
}

```


## Mejorado

```Java
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

```

---

- **Ejercicio de selección de figura geométrica**: Escribir un programa que solicite al usuario un número del 1 al 3 para seleccionar una figura geométrica (1: círculo, 2: cuadrado, 3: triángulo). Luego, mostrar en pantalla el área correspondiente a la figura seleccionada. Utilizar la estructura "switch" para implementar este programa.

```Java
package encuentro04;

import java.util.Scanner;

public class Encuentro04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
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
    } 
}
```

- **Ejercicio de verificación de día hábil**: Escribir un programa que solicite al usuario un número del 1 al 7, representando un día de la semana, y determine si es un día hábil o un día no hábil. Mostrar el resultado en pantalla.  Considerar que los días hábiles son del 1 al 5 (de lunes a viernes), y utilizar la estructura "switch" para implementar este programa.


```Java
package encuentro04;

import java.util.Scanner;

public class Encuentro04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
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
    } 
}

```

- **Ejercicio de selección de opción**: Escribir un programa que muestre un menú con las siguientes opciones:

Opción 1: "Guardar"

Opción 2: "Cargar"

Opción 3: "Salir"  Solicitar al usuario que ingrese un número del 1 al 3 para seleccionar una opción. Utilizar la estructura "switch" para implementar este programa y mostrar en pantalla el mensaje correspondiente a la opción seleccionada.

```Java
package encuentro04;

import java.util.Scanner;

public class Encuentro04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
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
```
---
