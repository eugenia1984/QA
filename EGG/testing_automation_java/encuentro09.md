# :computer: ENCUENTRO 09 - BUCLES Y ARRAYS - DESAFIOS

---

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> Clase “Arrays”

El objetivo de los siguientes ejercicios es seguir practicando el uso de la clase "Arrays" en Java y familiarizarte con los métodos disponibles para manipular arreglos. Te ayudarán a mejorar tus habilidades en el manejo de arreglos y a comprender cómo utilizar los diferentes métodos de la clase "Arrays".

Te volvemos a dejar el video de la clase Arrays por si necesitas repasarlo: [ver video](https://youtu.be/rqtopP_05K0)

---

## 1 - Ordenar en forma descendente: 

Escribir un programa que ordene un arreglo de enteros en forma descendente utilizando el método Arrays.sort(). Y los imprima ordenados en la consola.

## 2 - Búsqueda binaria: 

Escribir un programa que realice una búsqueda binaria en un arreglo ordenado de enteros utilizando el método Arrays.binarySearch(). El programa debe imprimir el índice del valor buscado si está presente en el arreglo.

## 3 - Comparar arreglos: 

Escribir un programa que compare dos arreglos de enteros utilizando el método Arrays.equals(). El programa debe imprimir si los arreglos son iguales o no.

## 4 - Copiar parte de un arreglo: 

Crear un programa en Java que declare y muestre un arreglo de enteros junto con sus indices. Luego, el programa debe solicitar al usuario dos índices: un índice inicial y un índice final. Con estos dos índices, el programa debe copiar la parte del arreglo original comprendida entre estos dos índices (inclusive) en un nuevo arreglo utilizando el método Arrays.copyOfRange(). Asegúrese de incluir validaciones para confirmar que el índice inicial es menor que el índice final y que ambos índices estén dentro del rango válido del arreglo original. Finalmente, el programa debe imprimir el nuevo arreglo por consola.

## 5  - Rellenar un arreglo: 

Escribir un programa que solicite al usuario el tamaño para un arreglo y un entero con el cual quiera rellanarlo, crear el arreglo y usar Arrays.fill(). Luego, imprime el arreglo resultante.

## 6 - Rellenar un arreglo de manera personalizada: 

Escribir un programa en Java que solicite al usuario un tamaño para un arreglo. Luego, debe pedirle que ingrese un número con el cual desea rellenar cierta parte del arreglo, seguido de un índice final. Esta parte del arreglo deberá ser rellenada con el número proporcionado hasta el indice ingresado por el usuario. Si el índice final ingresado no es el último índice del arreglo, el programa debe continuar pidiendo al usuario nuevos números para rellenar el arreglo, hasta que se haya proporcionado un número para cada posición. Asegúrese de validar lo siguiente:

- La primera vez que se pide al usuario un número para rellenar el arreglo, el índice inicial debe ser 0.

- El índice final siempre debe ser menor que el tamaño total del arreglo.

- Cada vez que se solicita un nuevo número para rellenar el arreglo, el índice inicial debe ser el índice inmediatamente siguiente al último índice final ingresado. El usuario solo deberá ingresar el nuevo índice final.

Por último el programa debe imprimir por consola el arreglo completo.




---

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> Clase Envoltura “Wrappers”

El objetivo de los siguientes ejercicios es practicar el uso de las clases de envoltura “Wrappers” en Java y familiarizarte con las operaciones que puedes realizar con números enteros utilizando estas clases. te ayudarán a comprender cómo convertir entre cadenas y números enteros, realizar comparaciones y obtener el valor máximo utilizando las clases de envoltura Integer y Long.

Para mayor contexto, te invitamos a ver el siguiente video: [ver video](https://youtu.be/1g3QewjrcHU)

---


## ¡Manos a la obra!

## 1 - Suma de números: 

Pide al usuario que ingrese un string que represente un entero, y luego un string que represente un doble. Convierte cada cadena al tipo de dato correspondiente usando los métodos valueOf, suma sus valores e imprímelos por consola.

## 2 - Conversión de cadena a número: 

Escribir un programa que lea un dato tipo cadena pero que represente un número entero como entrada utilizando la clase Scanner, y luego convierta la cadena en un número entero utilizando la clase de envoltura Integer.

## 3 -  Verificar si una cadena contiene solo letras: 

Pide al usuario que ingrese una cadena. Crea un bucle que recorra cada carácter en la cadena y use Character.isLetter() para verificar si todos los caracteres son letras. Muestra un mensaje al usuario indicando si la cadena contiene solo letras o no.

##  4 - Cuenta espacios en blanco en una cadena: 

Pide al usuario que ingrese una cadena. Crea un bucle que recorra cada carácter en la cadena y use Character.isWhitespace() para contar el número de espacios en blanco en la cadena. Muestra el recuento al usuario.

## 5 - Verificar si una cadena representa un número válido: 

Pide al usuario que ingrese una cadena. Intenta convertir la cadena a un doble usando Double.valueOf(). Si la cadena no representa un número válido, Double.valueOf() lanzará una excepción. Atrapa esta excepción y muestra un mensaje al usuario indicando que la entrada no es un número válido.

## 6 - Cuenta dígitos en un número: 

Pide al usuario que ingrese un número. Convierte el número a una cadena y luego utiliza un bucle y Character.isDigit() para contar el número de dígitos en el número.

---

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> Desafíos

A continuación, te encontrarás con dos desafíos que te permitirán unificar múltiples conceptos de programación en Java, incluyendo el uso de arrays, bucles for, while, do-while, clase Arrays y envoltura (wrappers).

**¡Muchos éxito!**

## 1 - Generador de contraseñas

Desarrollar un programa en Java que genere una contraseña aleatoria. Esta contraseña estará compuesta por una mezcla de letras mayúsculas, letras minúsculas y dígitos. La contraseña deberá ser almacenada en un arreglo de Character.

- Para la generación de la contraseña, utilice un bucle for que repita la operación tantas veces como la longitud de la contraseña que haya especificado el usuario.

- Para comprobar que la contraseña generada contiene al menos una letra mayúscula, una letra minúscula y un dígito, utilice bucles do-while y while con los métodos isUpperCase, isLowerCase y isDigit de la clase Character.

- Finalmente, convierta el arreglo de caracteres en un String con un for  y luego imprima la contraseña generada en la consola.

Nota: Recuerda que los char tienen una representación numerica y puedes castear un entero a char “char letra = (char) 45;” aqui tienes un link con la tabla ASCII de conversion

**¡A disfrutar resolviendo este desafío!** 🚀


## 2 - Estadísticas de calificaciones

Desarrollar un programa en Java que genere un arreglo de calificaciones de manera aleatoria.

Estas calificaciones se deben almacenar en un arreglo de Strings.

Una vez generado el arreglo, el programa debe generar 3 arreglos nuevos,  separando las calificaciones entre desaprobado (< 4), aprobado (>= 4), y excelente (>=10).

Necesitaras convertir los Strings a double para lograrlo.

Luego debes calcular el promedio del arreglo original y de cada uno de los nuevos arreglos.

Por ultimo imprime los resultado en consola.

¡Que te diviertas resolviendo este desafío! 🙌


---

---
