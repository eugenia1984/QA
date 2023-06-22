# :computer: ENCUENTRO 13 - PRACTICA 2 - MATRICES

---

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> Introducción

Es hora de sumergirnos en el universo de las matrices en Java.

A medida que avanzamos en estos ejercicios, es natural que surjan interrogantes o que desees repasar ciertos conceptos. Por ese motivo, además de contar con tu mesa de trabajo como apoyo, recuerda que tienes a tu disposición el material teórico. Si en algún momento necesitas repasar un concepto refrescar tus conocimientos sobre el manejo de matrices en Java, puedes acceder al mismo a través del siguiente enlace:

[👉Teoría Java V](https://drive.google.com/file/d/1VXlBfcUvSsUrbLvMlz1zur_I4rvy5elg/view)

No dudes en aprovecharlo para afianzar tus conocimientos y tener una base sólida mientras avanzas en los desafíos de programación. 

¡Comencemos! 🚀




---

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> Matrices


El objetivo del siguiente ejercicio es practicar el uso de matrices en Java y familiarizarte con diferentes operaciones que se pueden realizar sobre ellas. A través de la implementación de diversos programas, podrás mejorar tus habilidades en el manejo de matrices y comprender cómo utilizar diferentes métodos para manipular sus elementos.

Antes de avanzar con el mismo, te invitamos a ver los siguientes videos: [VIDEO 1](https://youtu.be/aQUhx1VIHkc) Y [VIDEO 2](https://youtu.be/YOrFxRUsYs0)


## Ahora sí, ¡manos a la obra!

Deberás escribir diferentes programas para:

### 1. Matriz de elementos: 

Crea una matriz de 3x3 con enteros y muestra su contenido por consola en formato de matriz. Luego, muestra el mismo contenido en formato de arreglo. Por ejemplo:

Matriz original:

```
[5, 3, 2]
[8, 1, 5]
```

Arreglo:

```
[5] [3] [2]
[8] [1] [5]
```

---

### 2. Suma de los elementos de una matriz: 

Calcula e imprime la suma de todos los elementos de la matriz.

---

### 3. Encontrar el número más grande y más pequeño en una matriz: 

Encuentra y muestra el número más grande y más pequeño en una matriz.

---

### 4. Contar los números pares e impares en una matriz: 

Cuenta y muestra cuántos números pares e impares hay en una matriz.

---

### 5. Imprimir una matriz en orden inverso: 

Imprime los elementos de una matriz en orden inverso.

Por ejemplo:

```
[5, 3, 2] [6, 5, 9]
[8, 1, 5] →   [5, 1, 8]
[9, 5, 6]   [2, 3, 5]
```

### 6. Transposición de matrices: 

Imprime por consola la transposición de una matriz. La transposición es una nueva matriz donde las filas de la matriz original se convierten en columnas y viceversa.

Por ejemplo:
```
[1, 2, 3] [1, 4, 7]
[4, 5, 6] → [2, 5, 8]
[7, 8 ,9] [3, 6 , 9]
```

---

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> Matrices


El objetivo del siguiente ejercicio es practicar el uso de matrices y arrays en Java. A través de diferentes programas, te familiarizarás con las operaciones que se pueden realizar con matrices, como la suma y multiplicación, y también aprenderás a utilizar los arrays para almacenar y manipular los elementos de las matrices. 

## ¡Manos a la obra!

## Deberás crear diferentes programas para:

### 1. Sumar dos matrices de la misma dimensión: 

La suma de dos matrices se realiza sumando cada elemento correspondiente en las dos matrices. Por ejemplo, si tienes dos matrices A y B, el elemento en la primera fila y la primera columna de la matriz sumada C sería la suma del elemento en la primera fila y la primera columna de A y el mismo elemento de B.

```
[1,  2, 3] [10,  20, 30]  [11,   22, 33]
[4, 5, 6]  + [40, 50, 60] = [44, 55, 66]
[7, 8, 9] [70, 80, 90] [77,  88, 99]
```

---

### 2. Multiplicar dos matrices: 

La multiplicación de matrices es un poco más complicada que la suma. Para multiplicar dos matrices, necesitas seguir estos pasos para cada elemento de la matriz resultante:

Multiplica cada elemento de una fila de la primera matriz por el elemento correspondiente de una columna de la segunda matriz.

Suma todos esos productos.

Ese es el valor del elemento en la fila y columna correspondientes de la matriz resultante.

Por ejemplo:
```
[1, 2] [5, 6] [(1*5 + 2*7),  (1*6 + 2*8)] [19, 22]
[3, 4] [7, 8] [(3*5 + 4*7), (3*6 + 4*8)] [43, 50]
```

---

## 3. Encontrar el elemento máximo y mínimo en una matriz.


---

### 4. Matriz espiralada: 

Pedir al usuario dos números para crear una matriz “tamaño1 x tamaño2” y luego rellenarla de forma espiralada en sentido horario, comenzando desde (0,0). Por ejemplo, una matriz 3x4 se llenaría de la siguiente manera:
```
[1, 2, 3, 4]
[10, 11 , 12 ,5]
[9, 8, 7, 6]
```

---

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> Matrices

A continuación, te encontrarás con tres desafíos que te permitirán poner en práctica diferentes conceptos de programación en Java relacionados con matrices y arrays. Estos desafíos involucran el uso de bucles for, while, do-while, la clase Arrays y envoltura (wrappers). 

**¡Mucho éxito!** 🚀

## Matriz de nombres y puntajes 

Crear un programa que tenga una matriz de nombres, puntajes y cursos de estudiantes. 

Los usuarios deberían poder ver el siguiente menú:

1. **Mostrar estudiantes**: Esta opción muestra por pantalla la lista de estudiantes junto con su nombre, puntaje y curso.

2. **Agregar estudiante**: Permite al usuario ingresar un nuevo estudiante proporcionando su nombre, puntaje y curso como strings. Se realiza una validación para asegurar que el puntaje sea un string válido convertible a Double y esté dentro del rango de 0.00 a 10.00.

3. **Mostrar promedio general**: Calcula y muestra el promedio general de todos los estudiantes.

4. **Mostrar promedio por curso**: Calcula y muestra el promedio de los puntajes en cada curso.

5. **Mostrar cantidad de estudiantes por curso**: Calcula y muestra la cantidad de estudiantes en cada curso.

6. **“Salir”**: Esta opción permite terminar el programa.

Después de cada selección, se muestra nuevamente el menú para que el usuario pueda realizar más acciones, excepto en el caso de seleccionar "Salir". 

---

## Buscaminas

Escribir un programa que implemente el clásico juego del Buscaminas. A continuación, se detalla el funcionamiento del programa:

1. **Generar mapa**: El programa crea una matriz aleatoria que representa el mapa del buscaminas. En esta matriz, se colocan de manera aleatoria las minas ("M") y las celdas sin minas ("O").

2. **Imprimir mapa**: El programa muestra por consola el mapa generado, mostrando las minas y las celdas sin minas.

3. **Calcular el número de minas**: El programa modifica el mapa para calcular el número de minas que hay alrededor de cada celda. En las celdas sin minas, se muestra el número de minas circundantes.

---

### Matriz mágica

Escribir un programa que determine si una matriz es una matriz mágica. 

💡En matemáticas, una matriz mágica es una matriz cuadrada de números enteros donde los números no se repiten y la suma de los números en cada fila, columna y ambas diagonales principales es igual. 

En este caso, se utilizará una matriz de tamaño 3x3, con números enteros del 1 al 9.

Aquí te compartimos dos ejemplos de matrices mágicas para verificar el algoritmo:

- Matriz 1:
```
8 1 6
3 5 7
4 9 2
```

- Matriz 2:

```
2 7 6
9 5 1
4 3 8
```

El programa verificará si cada matriz cumple con las condiciones de una matriz mágica.

---

