# :computer: ENCUENTRO 27

---

## Ejercicios Testing

Resolvamos los siguientes ejercicios para continuar practicando el proceso de testing en Java: 

## 1. Fibonacci y recursividad:

- Ejercicio anterior: Crear un programa que solicite al usuario ingresar la posición de un número en la serie de Fibonacci y mostrar el valor correspondiente a esa posición. 

💡Recuerda que la serie de Fibonacci comienza con los siguientes valores:

```
Posición 0: 0
Posición 1: 1
Posición 2: 1
Posición 3: 2
Posición 4: 3
```

Reorganiza el código extrayendo la lógica en métodos sin alterar su funcionamiento. Después, intenta modificar la lógica para resolverlo de forma recursiva. 

- Clase de test: Crea una clase test para testear los métodos de este ejercicio.

---

## 2.  Factorial y recursividad: 

- Ejercicio anterior: Escribir un programa que solicite al usuario un número y calcule su factorial utilizando un bucle do-while. 

💡 El factorial de un número es el producto de todos los números desde 1 hasta ese número. Te compartimos algunos ejemplos:

- El factorial de 3 es 1 * 2 * 3 = 6.

- El factorial de 5 es 1 * 2 * 3 * 4 * 5 = 120.

- El factorial de 7 es 1 * 2 * 3 * 4 * 5 * 6 * 7 = 5040.

- Crea un método llamado "factorial()" que tome un parámetro de tipo "int" y devuelva un valor entero que corresponda al cálculo del factorial del número proporcionado. Posteriormente, intenta modificar la lógica para resolverlo de manera recursiva.

- Clase de test: Crea una clase test para testear los métodos de este ejercicio.

---

## 3. Números primos y recursividad:

- Ejercicio anterior: Solicitar al usuario que introduzca un número y verificar si es primo utilizando un bucle do-while. 

💡 Un número es primo si solo tiene dos divisores: 1 y él mismo. 

- Si el número no es primo, pedir al usuario que introduzca otro número hasta que introduzca un número primo.

- Crea un método llamado "esPrimo()" que reciba por parámetro un "int" y devuelva un valor booleano que verifique si el número es primo o no. Luego, intenta modificar la lógica para resolverlo utilizando recursividad.

- Clase de test: Crea una clase test para testear los métodos de este ejercicio.

---

## 4. Manipular oraciones:

- Ejercicio anterior: Escribir un programa en Java que permita al usuario realizar diversas operaciones con una oración. 

- El programa debe cumplir con los siguientes requisitos:

-Mostrar un menú de opciones al usuario donde podrá:

a) "Crear oración" o "Borrar oración": Si la oración está vacía, mostrar el mensaje "Crear oración". Si la oración tiene contenido, mostrar el mensaje "Borrar oración".

b) "Cantidad de caracteres de la oración": Calcular y mostrar la cantidad total de caracteres en la oración (incluyendo espacios).

c) "Cantidad de palabras de la oración": Calcular y mostrar la cantidad de palabras en la oración.

d) "Mostrar palabras ordenadas alfabéticamente": Mostrar las palabras de la oración ordenadas alfabéticamente.

e) "Ingresar un número y devolver la palabra correspondiente": Solicitar al usuario ingresar un número y mostrar la palabra correspondiente a esa posición en la oración. Si se ingresa un número fuera del rango de número de palabras (la primera palabra corresponde al número 1), mostrar el mensaje "Número inválido. Intente nuevamente".

f) "Buscar palabra dentro de la oración": Solicitar al usuario ingresar una palabra y verificar si esa palabra se encuentra en la oración. Mostrar un mensaje indicando si la palabra fue encontrada y la posición en la que se encuentra.

g) "Modificar palabra dentro de la oración": Solicitar al usuario ingresar la palabra que se quiere cambiar, mostrar un mensaje de error si no se encuentra y volver a solicitar la palabra. Si la palabra es correcta, solicitar una nueva palabra (o frase) y reemplazar la anterior. Mostrar la nueva oración modificada (recordar validar que solo contenga letras y espacios).

h) "Agregar contenido a la oración": Solicitar al usuario ingresar contenido y agregar ese contenido al final de la oración.

i) "Salir": Terminar el programa.

-Después de realizar una operación, mostrar el menú de opciones nuevamente para que el usuario pueda elegir otra acción, excepto cuando elija "Salir".

- Crea un método para generar el menú y un método separado para resolver cada opción. Si es necesario, puedes crear más métodos adicionales.

- Clase de test: Crea una clase test para testear los métodos de este ejercicio.

---
