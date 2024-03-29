# :computer: ENCUENTRO 05 - String & Math

---

## :star: Try & Catch

El objetivo de los siguientes ejercicios es aprender a utilizar la estructura "try-catch" en Java. Exploraremos diferentes situaciones donde pueden ocurrir errores y aprenderemos a implementar bloques "try-catch" para capturar y manejar estas excepciones. Mejoraremos nuestra capacidad para controlar el flujo del programa y brindar una experiencia más robusta al usuario al anticiparnos y manejar posibles errores.

Para mayor contexto, te invitamos a ver el siguiente video: [video](https://youtu.be/T12arFsgo2c)

## ¡Manos a la obra!

## Ejercicio de división segura: 

Escribe un programa que solicite al usuario dos números enteros y realice la división del primer número entre el segundo número. Utiliza un bloque "try-catch" para manejar la excepción en caso de que se intente realizar una división por cero. En caso de que se produzca la excepción, muestra un mensaje adecuado en pantalla.

```Java
package encuentro05;

import java.util.InputMismatchException;
import java.util.Scanner;


public class DivisionSegura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numerador, divisor, resultado;
        try {
            System.out.print("Ingrese un primer numero: ");
            numerador = sc.nextDouble();
            System.out.print("Ingrese un segundo numero para dividirlo por el ingresado anteriormente: ");
            divisor = sc.nextDouble();
  
            if(divisor == 0) {
                System.out.println("No podemos dividir por cero");
            } else {
                resultado = numerador / divisor;
                System.out.println("resultado = " + resultado);
            }
        } catch(InputMismatchException e) {
            System.out.println("No ingresó un número entero");
        } catch(Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
```

## Ejercicio de conversión de cadena a entero: 

Escribe un programa que solicite al usuario una cadena de caracteres que represente un número entero. Utiliza el método Integer.parseInt() para convertir la cadena a un número entero. Utiliza un bloque "try-catch" para manejar la excepción en caso de que la cadena ingresada no pueda ser convertida a un número entero. En caso de que se produzca la excepción, muestra un mensaje adecuado en pantalla.

---

## :star:  Clase String

El objetivo de estos ejercicios es familiarizarse con la “clase String” en Java y aprender a utilizar algunos de sus métodos fundamentales. Estos conocimientos nos permitirán manipular y procesar eficientemente cadenas de texto en nuestros programas, brindando flexibilidad y versatilidad en el manejo de datos de texto.


Para mayor contexto, te invitamos a ver el siguiente video: [ver video](https://youtu.be/9WMRSlOGZoI)

## ¡Manos a la obra!

## Ejercicio de longitud de cadena: 

Escribir un programa que solicite al usuario una cadena de texto y muestre en pantalla la longitud de la cadena utilizando el método length() de la clase String.

```Java
package encuentro05;

import java.util.Scanner;

public class LongitudDeCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String textoIngresado;
        System.out.print("Ingresa una cadena de texto: ");
        textoIngresado = sc.nextLine();
        System.out.println("Ha ingresado: "+textoIngresado.length()+" caracteres.");
    }
}
```

## Ejercicio de concatenación de cadenas: 

Escribir un programa que solicite al usuario su nombre y apellido por separado, y luego muestre en pantalla el nombre completo utilizando el método concat() de la clase String.

```Java
package encuentro05;

import java.util.Scanner;

public class ConcatenacionCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, apellido;
        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese su apellido: ");
        apellido = sc.nextLine();
        System.out.println(nombre.concat(" " +apellido));
    }
}
```

## Ejercicio de extracción de subcadena: 

Escribir un programa que solicite al usuario una frase y dos números enteros, representando un índice inicial y un índice final. Utilizar el método substring() de la clase String para extraer la subcadena que se encuentra entre los índices ingresados por el usuario, y mostrar la subcadena resultante en pantalla.

```Java
package encuentro05;

import java.util.Scanner;

public class ExtraccionDeSubcadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase, subcadena;
        int indiceInicial, indiceFinal;
        System.out.print("Ingresa una frase: ");
        frase = sc.nextLine();
        System.out.print("Ingrese un número menor a ("+frase.length()+
                ") para empezar a cortar su frase ingresada: ");
        indiceInicial = sc.nextInt();
        System.out.print("Ingrese otro número menor a ("+frase.length()+
                ") para finalizar el corte de su grase ingresada: ");
        indiceFinal = sc.nextInt();
        subcadena = frase.substring(indiceInicial, indiceFinal);
        System.out.println("La frase cortada: "+subcadena);
    }
}
```

## Ejercicio de búsqueda de caracteres: 

Escribir un programa que solicite al usuario una palabra y un carácter, y determine si el carácter ingresado se encuentra en la palabra utilizando el método indexOf() de la clase String. Mostrar un mensaje adecuado en pantalla indicando si el carácter se encuentra o no en la palabra.

## Ejercicio de conversión de mayúsculas y minúsculas: 

Escribir un programa que solicite al usuario una cadena de texto y muestre en pantalla la misma cadena, pero con todos los caracteres en mayúsculas o minúsculas. Utilizar los métodos toUpperCase() y toLowerCase() de la clase String para realizar la conversión.

---

## :star: Clase Math

El objetivo de los siguientes ejercicios es practicar y aplicar los métodos de la “clase Math” en Java. Al completarlos, desarrollaremos habilidades en el uso de esta clase para realizar operaciones matemáticas en nuestros programas. [ver video](https://youtu.be/O4PLoC2Ik0c)

## ¡Manos a la obra!

## Ejercicio de cálculo del valor absoluto: 

Escribir un programa que solicite al usuario un número entero y muestre en pantalla su valor absoluto utilizando el método abs() de la clase Math.


```Java
package encuentro05;

import java.util.Scanner;

public class CalculoDeValorAbsoluto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroIngresado;
        System.out.println("Ingrese un número entero: ");
        numeroIngresado = sc.nextInt();
        System.out.println("Su valor absoluto es: " + Math.abs(numeroIngresado));
    }
}
```

## Ejercicio de redondeo de números: 

Escribir un programa que solicite al usuario un número decimal y muestre en pantalla su valor redondeado utilizando el método round() de la clase Math.

```Java
package encuentro05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RedondeoDeNumeros {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            double numeroIngresado;
            System.out.print("Ingrese un número decimal (usar la , como separador): ");
            numeroIngresado = sc.nextDouble();
            System.out.println("El número redondeado es: " + Math.round(numeroIngresado));
        } catch(InputMismatchException e) {
            System.out.println("Debe ingresar un número");
        }
    }
}
```

## Ejercicio de generación de números aleatorios: 

Escribir un programa que genere y muestre en pantalla un número aleatorio en el rango del 1 al 100 utilizando el método random() de la clase Math. Puedes utilizar el método floor() para redondear el número aleatorio hacia abajo.

```Java
package encuentro05;

import java.util.Scanner;

public class GeneracionNumerosAleatorios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroAleatorio =(int) (Math.random() * 100);
        System.out.println("numero aleatorio entre 1 y 100: " + numeroAleatorio);
    }
}
```

## Ejercicio de cálculo de potencia: 

Escribir un programa que solicite al usuario dos números enteros, representando la base y el exponente, y calcular el resultado de elevar la base al exponente utilizando el método pow() de la clase Math. Mostrar el resultado en pantalla.

## Ejercicio de cálculo de raíz cuadrada: 

Escribir un programa que solicite al usuario un número positivo y calcule su raíz cuadrada utilizando el método sqrt() de la clase Math. Si el número ingresado es negativo, mostrar un mensaje adecuado en pantalla.

---
