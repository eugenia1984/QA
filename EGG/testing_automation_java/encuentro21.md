# :computer: ENCUENTRO 21 - Métodos:  Ejercicios 

---

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> Ejercicios Métodos III

A continuación, aplicaremos el concepto de métodos a los ejercicios de la sección 4 para mejorar la organización y reutilización del código:

## ¡Manos a la obra!


---

## :computer: 1. Fibonacci y recursividad: 

Reorganiza el código extrayendo la lógica en métodos sin alterar su funcionamiento. Después, intenta modificar la lógica para resolverlo de forma recursiva. Si deseas comprender mejor qué es la recursividad y cómo funciona, puedes consultar el siguiente video:

---

## Ejercicio anterior

Crear un programa que solicite al usuario ingresar la posición de un número en la serie de Fibonacci y mostrar el valor correspondiente a esa posición. 

💡Recuerda que la serie de Fibonacci comienza con los siguientes valores:

```
Posición 0: 0
Posición 1: 1
Posición 2: 1
Posición 3: 2
Posición 4: 3
```

---

## :computer: 2. Factorial y recursividad: 

Crea un método llamado "factorial()" que tome un parámetro de tipo "int" y devuelva un valor entero que corresponda al cálculo del factorial del número proporcionado. Posteriormente, intenta modificar la lógica para resolverlo de manera recursiva.

## Ejercicio anterior

Escribir un programa que solicite al usuario un número y calcule su factorial utilizando un bucle do-while. 

💡 El factorial de un número es el producto de todos los números desde 1 hasta ese número. Te compartimos algunos ejemplos:

- El factorial de 3 es 1 * 2 * 3 = 6.

- El factorial de 5 es 1 * 2 * 3 * 4 * 5 = 120.

- El factorial de 7 es 1 * 2 * 3 * 4 * 5 * 6 * 7 = 5040.

---

## :computer: 3. Números primos y recursividad: 

Crea un método llamado "esPrimo()" que reciba por parámetro un "int" y devuelva un valor booleano que verifique si el número es primo o no. Luego, intenta modificar la lógica para resolverlo utilizando recursividad.

## Ejercicio anterior

Solicitar al usuario que introduzca un número y verificar si es primo utilizando un bucle do-while. 

💡 Un número es primo si solo tiene dos divisores: 1 y él mismo. 

Si el número no es primo, pedir al usuario que introduzca otro número hasta que introduzca un número primo.


---

## :computer: 4. Manipular oraciones:  

Crea un método para generar el menú y un método separado para resolver cada opción. Si es necesario, puedes crear más métodos adicionales.

## Ejercicio anterior

Escribir un programa en Java que permita al usuario realizar diversas operaciones con una oración. 

El programa debe cumplir con los siguientes requisitos:

1. Mostrar un menú de opciones al usuario donde podrá:

a) "Crear oración" o "Borrar oración": Si la oración está vacía, mostrar el mensaje "Crear oración". Si la oración tiene contenido, mostrar el mensaje "Borrar oración".

b) "Cantidad de caracteres de la oración": Calcular y mostrar la cantidad total de caracteres en la oración (incluyendo espacios).

c) "Cantidad de palabras de la oración": Calcular y mostrar la cantidad de palabras en la oración.

d) "Mostrar palabras ordenadas alfabéticamente": Mostrar las palabras de la oración ordenadas alfabéticamente.

e) "Ingresar un número y devolver la palabra correspondiente": Solicitar al usuario ingresar un número y mostrar la palabra correspondiente a esa posición en la oración. Si se ingresa un número fuera del rango de número de palabras (la primera palabra corresponde al número 1), mostrar el mensaje "Número inválido. Intente nuevamente".

f) "Buscar palabra dentro de la oración": Solicitar al usuario ingresar una palabra y verificar si esa palabra se encuentra en la oración. Mostrar un mensaje indicando si la palabra fue encontrada y la posición en la que se encuentra.

g) "Modificar palabra dentro de la oración": Solicitar al usuario ingresar la palabra que se quiere cambiar, mostrar un mensaje de error si no se encuentra y volver a solicitar la palabra. Si la palabra es correcta, solicitar una nueva palabra (o frase) y reemplazar la anterior. Mostrar la nueva oración modificada (recordar validar que solo contenga letras y espacios).

h) "Agregar contenido a la oración": Solicitar al usuario ingresar contenido y agregar ese contenido al final de la oración.

i) "Salir": Terminar el programa.

2. Después de realizar una operación, mostrar el menú de opciones nuevamente para que el usuario pueda elegir otra acción, excepto cuando elija "Salir".
3. 

---
