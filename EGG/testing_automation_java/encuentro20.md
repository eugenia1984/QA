# :computer: ENCUENTRO 20 - Métodos:  Ejercicios 

---

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> Ejercicios Métodos II

---

En los ejercicios que siguen solo se especificarán algunos métodos que tienes que crear. Te recomendamos que cuando observes que un código se repite crees un método y lo invoques en su lugar, por más que no se haya especificado la creación de ese método en el enunciado. 

💡Intenta identificar porciones de código que puedas extraer a un método y ponerle un nombre que resuma la tarea que realiza dicho código y así lograr que tu código sea más legible y entendible.

---

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> ¡Manos a la obra!

## :computer: 1. Es par: 

Reemplaza la lógica de pedir un número por un método llamado "solicitarNumero()" que no reciba parámetros y devuelva un entero. También reemplaza la condición del if por un método llamado "esPar()" que reciba por parámetro un entero y devuelva un booleano.

```Java
public static void main(String[] args) {
    Scanner pepe = new Scanner(System.in);
    Integer numero = null;
    System.out.println("Por favor ingrese un número:");
    do {
        try {
            numero = pepe.nextInt();
        } catch (Exception e) {
            pepe.nextLine();
            System.out.println("No ingresó un número, intente nuevamente:");
        }
    } while (numero == null);
    if (numero % 2 == 0) {
        System.out.println("El "+numero+" es par");
    }
}
```

---

## :computer: 2. Calculadora: 

Vuelve a realizar el ejercicio de la calculadora, pero esta vez crea un método llamado "menu()" que no reciba ningún parámetro y se encargue de generar la lógica de mostrar el menú de opciones y producir el bucle para seguir mostrando el menú hasta seleccionar la opción de "salir". Solicita dos números al usuario y realiza la operación matemática seleccionada, teniendo en cuenta las validaciones necesarias como la división por cero.


---

## :computer: 3. Ejercicio de calificación: 

Basándote en el siguiente ejercicio que ya has realizado, crea un método "obtenerNota()" que reciba por parámetro un "int" y devuelva un "String". El método debe utilizar la estructura de control "switch expression".

### Ejercicio anterior

Escribir un programa que solicite al usuario una puntuación entre 0 y 100. Luego, mostrar en pantalla la calificación correspondiente según la siguiente escala:

```
- Si la puntuación está entre 90 y 100, muestra "A".
- Si la puntuación está entre 80 y 89, muestra "B".
- Si la puntuación está entre 70 y 79, muestra "C".
- Si la puntuación está entre 60 y 69, muestra "D".
- Si la puntuación es menor a 60, muestra "F".
```

---

## :computer: 4. Figuras geométricas: 

Crea un un programa que calcule las áreas y los perímetros de un círculo, un triángulo o un paralelogramo. Debe tener dos menús: uno para elegir la figura geométrica y otro para elegir qué calcular. 

En cada opción se deben solicitar los datos necesarios para aplicar la fórmula correspondiente:

```
Perímetro del círculo = 2 * π * radio
Área del círculo = π * radio ^2 
Perímetro del triángulo =  a + b + c (donde a, b y c son las longitudes de los lados del triángulo)
Área del triángulo =  (base * altura) / 2
Perímetro del paralelogramo = 2* (a + b) (donde a y b son las longitudes de los lados adyacentes del paralelogramo)
Área del paralelogramo  = base * altura
```

---

## :computer: 5. Generación de números aleatorios: 

En base al ejercicio que ya has realizado, crea un método "numeroAleatorio()" que no requiera parámetros y devuelva un "int" dentro del rango especificado.

### Ejercicio anterior

Escribir un programa que genere y muestre en pantalla un número aleatorio en el rango del 1 al 100 utilizando el método random() de la clase Math. Puedes utilizar el método floor() para redondear el número aleatorio hacia abajo.

---

## :computer: 6. Validación de contraseña: 

En base al ejercicio que ya has realizado, crea un método "esSegura()" que reciba por parámetro un "String" y devuelva un booleano para comprobar que la contraseña cumple con los criterios establecidos. También, crea los métodos: "tieneLongitudCorrecta()", "tieneMayuscula()", "tieneMinuscula()", "tieneNumero()" y "tieneCaracterEspecial()", que reciban por parámetro un "String" y devuelvan un "booleano".

## Ejercicio anterior

### Ejercicio anterior: Escribir un programa que solicite al usuario que ingrese una contraseña y verifique si cumple con los siguientes criterios para considerarse segura:

```
- La contraseña debe tener al menos 8 caracteres.
- La contraseña debe contener al menos una letra mayúscula y una letra minúscula.
- La contraseña debe contener al menos un número.
- La contraseña debe contener al menos un carácter especial (por ejemplo, !, @, #, $).
```

El programa debe mostrar un mensaje indicando si la contraseña es segura o no, según los criterios establecidos. Puedes utilizar métodos de la clase String para verificar cada uno de los criterios.

Te compartimos un ejemplo de ejecución del programa:

```
Ingrese su contraseña: Abc123!@#
¡Contraseña segura! Cumple con todos los criterios.
```

Y aquí tienes otro ejemplo donde se muestra cómo manejar una contraseña no segura:

```
Ingrese su contraseña: password123
Contraseña no segura. Debe tener al menos una letra mayúscula y un carácter especial.
```

---

## :computer: 7. Adivinar el número: 

En base al ejercicio que ya has realizado, crea un método "numeroAleatorio()" que reciba por parámetro dos variables de tipo "int": un número máximo y un número mínimo. El método debe generar y devolver un número aleatorio dentro del rango especificado.

## Ejercicio anterior

Escribir un programa que genere un número aleatorio entre 1 y 100, y le pida al usuario adivinar ese número utilizando un bucle do-while. El programa debe mostrar un mensaje indicando si el número ingresado es mayor o menor que el número aleatorio, y continuar pidiendo al usuario que adivine hasta que lo haga correctamente.

----

## :computer: 8. Crear array aleatorio: 

Basándote en el ejercicio del punto 7 ("Adivinar el número"), crea un programa que te permita generar un array de tipo "int" de manera aleatoria. El programa debe solicitar al usuario el tamaño del array y el rango de números posibles para rellenarlo.


---

## :computer: 9. Imprimir array: 

Crea un programa que utilice un método "imprimirArray()" que se encargue de imprimir un array por consola. El método debe recibir como parámetro un arreglo de tipo "int" y no devolver nada. Luego, crea una sobrecarga del método para que acepte arrays de tipo String y arreglos bidimensionales de tipo "int" y de tipo "String".

---

## :computer: 10. Rellenar un arreglo de manera personalizada: 

Basándote en el ejercicio que ya has realizado, crea un método llamado "rellenarArray()" que recibirá como parámetro un arreglo de tipo "int" y no devolverá ningún valor. Este método contendrá la lógica necesaria para solicitar datos al usuario y completar el arreglo con ellos.

## Ejercicio anterior

Escribir un programa en Java que solicite al usuario un tamaño para un arreglo. Luego, debe pedirle que ingrese un número con el cual desea rellenar cierta parte del arreglo, seguido de un índice final. Esta parte del arreglo deberá ser rellenada con el número proporcionado hasta el índice ingresado por el usuario. Si el índice final ingresado no es el último índice del arreglo, el programa debe continuar pidiendo al usuario nuevos números para rellenar el arreglo, hasta que se haya proporcionado un número para cada posición. Asegúrese de validar lo siguiente:

- La primera vez que se pide al usuario un número para rellenar el arreglo, el índice inicial debe ser 0.

- El índice final siempre debe ser menor que el tamaño total del arreglo.

- Cada vez que se solicita un nuevo número para rellenar el arreglo, el índice inicial debe ser el índice inmediatamente siguiente al último índice final ingresado. El usuario solo deberá ingresar el nuevo índice final.

Por último el programa debe imprimir por consola el arreglo completo.

---
