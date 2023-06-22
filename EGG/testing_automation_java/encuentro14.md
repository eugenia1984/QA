# :computer: ENCUENTRO 14 - PRACTICA 2 - MATRICES

---

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> Matrices

### ¡Manos a la obra!

Deberás crear diferentes programas para:

## 1. Sumar dos matrices de la misma dimensión: 

La suma de dos matrices se realiza sumando cada elemento correspondiente en las dos matrices. Por ejemplo, si tienes dos matrices A y B, el elemento en la primera fila y la primera columna de la matriz sumada C sería la suma del elemento en la primera fila y la primera columna de A y el mismo elemento de B.

```
[1,  2, 3] [10,  20, 30]  [11,   22, 33]
[4, 5, 6]  + [40, 50, 60] = [44, 55, 66]
[7, 8, 9] [70, 80, 90] [77,  88, 99]
```

---

## 2. Multiplicar dos matrices: 

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

## 4. Matriz espiralada: 

Pedir al usuario dos números para crear una matriz “tamaño1 x tamaño2” y luego rellenarla de forma espiralada en sentido horario, comenzando desde (0,0). Por ejemplo, una matriz 3x4 se llenaría de la siguiente manera:

```
[1, 2, 3, 4]
[10, 11 , 12 ,5]
[9, 8, 7, 6]
```

---
