# :computer: ENCUENTRO 26 - PRACTICA TESTING

---

## :star: Ejercicios Testing

En esta ocasión, continuaremos familiarizándonos con el proceso de testing en Java a través de los siguientes ejercicios:

---

## 1. Figuras geométricas: 

- Ejercicio anterior: Crea un un programa que calcule las áreas y los perímetros de un círculo, un triángulo o un paralelogramo. Debe tener dos menús: uno para elegir la figura geométrica y otro para elegir qué calcular. 

En cada opción se deben solicitar los datos necesarios para aplicar la fórmula correspondiente:

- Perímetro del círculo = 2 * π * radio

- Área del círculo = π * radio ^2 

- Perímetro del triángulo =  a + b + c (donde a, b y c son las longitudes de los lados del triángulo)

- Área del triángulo =  (base * altura) / 2

- Perímetro del paralelogramo = 2* (a + b) (donde a y b son las longitudes de los lados adyacentes del paralelogramo)

- Área del paralelogramo  = base * altura

- Clase de test: Crea una clase test para testear este ejercicio.


---


## 2. Generación de números aleatorios:

- Ejercicio anterior: Escribir un programa que genere y muestre en pantalla un número aleatorio en el rango del 1 al 100 utilizando el método random() de la clase Math. Puedes utilizar el método floor() para redondear el número aleatorio hacia abajo.

Crea un método "numeroAleatorio()" que no requiera parámetros y devuelva un "int" dentro del rango especificado.

- Clase de test: Crea una clase test para testear este ejercicio. 

---

## 3. Validación de contraseña:

- Ejercicio anterior: Escribir un programa que solicite al usuario que ingrese una contraseña y verifique si cumple con los siguientes criterios para considerarse segura:

- La contraseña debe tener al menos 8 caracteres.

- La contraseña debe contener al menos una letra mayúscula y una letra minúscula.

- La contraseña debe contener al menos un número.

- La contraseña debe contener al menos un carácter especial (por ejemplo, !, @, #, $).

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
Crea un método "esSegura()" que reciba por parámetro un "String" y devuelva un booleano para comprobar que la contraseña cumple con los criterios establecidos. También, crea los métodos: "tieneLongitudCorrecta()", "tieneMayuscula()", "tieneMinuscula()", "tieneNumero()" y "tieneCaracterEspecial()", que reciban por parámetro un "String" y devuelvan un "booleano".
```

- Clase de test: Crea una clase test para testear este ejercicio.

---

## 4. Adivinar el número:

- Ejercicio anterior: Escribir un programa que genere un número aleatorio entre 1 y 100, y le pida al usuario adivinar ese número utilizando un bucle do-while. El programa debe mostrar un mensaje indicando si el número ingresado es mayor o menor que el número aleatorio, y continuar pidiendo al usuario que adivine hasta que lo haga correctamente. Crea un método "numeroAleatorio()" que reciba por parámetro dos variables de tipo "int": un número máximo y un número mínimo. El método debe generar y devolver un número aleatorio dentro del rango especificado.

- Clase de test: Crea una clase test para testear este ejercicio.

💡En este caso, en lugar de verificar un número específico, debes asegurarte de que el número generado se encuentre dentro del rango especificado en el método.

Te recomendamos ver el siguiente video que te mostrará cómo realizar pruebas repetidas a un método: [ver video](https://youtu.be/K37RirX3CVc)


---
