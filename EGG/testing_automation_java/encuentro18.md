# 💻 ENCUENTRO 16 - PRACTICA 3 - MATRICES

---

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> Ejercicios Matrices V

## Solucionador de Sudoku

El objetivo de este ejercicio es desarrollar un programa que pueda verificar si un número dado es una solución posible para una casilla en un juego de Sudoku. 

El juego de Sudoku se representa en un tablero de 9x9 celdas, dividido en 9 bloques de 3x3 celdas. El desafío del juego consiste en completar todas las celdas vacías del tablero de manera que cada fila, columna y bloque contenga todos los números del 1 al 9 exactamente una vez. 

En este caso, tu programa no debe resolver automáticamente el juego, sino permitir al usuario elegir una casilla y luego ingresar un número para calcular si esa opción es válida para la casilla seleccionada.

A continuación, te proporcionamos un juego de Sudoku que puedes utilizar como base:

```Java
int[][] sudoku = {
        {0, 4, 5,  0, 2, 0,  1, 7, 0},
        {7, 2, 6,  0, 5, 0,  9, 0, 3},
        {0, 9, 1,  0, 7, 3,  6, 0, 2},

        {4, 0, 9,  0, 0, 5,  2, 0, 0},
        {1, 0, 0,  7, 0, 0,  0, 9, 0},
        {5, 0, 8,  2, 1, 0,  4, 0, 0},

        {9, 1, 0,  0, 0, 8,  0, 0, 4},
        {0, 8, 0,  0, 4, 2,  5, 0, 0},
        {2, 0, 4,  0, 9, 7,  3, 0, 0}
};
```

## ¡Manos a la obra!

Tu programa debe tener un menú con las siguientes opciones:

1.  Mostrar sudoku: Imprime por consola la cuadrícula del Sudoku.

2. Probar valor: Permite al usuario ingresar las coordenadas de una celda (verificando su validez) y luego solicitar un número para validar.

Para que el número sea válido, debe cumplir con las siguientes condiciones simultáneamente:

Debe que ser un número entre 1 y 9.

No debe existir ese número en la fila de la celda objetivo.

No debe existir ese número en la columna de la celda objetivo.

No debe existir ese número en el bloque 3x3 de la celda objetivo.

Si el valor es válido, el programa debe imprimir: 

“El número ”+valor+” es una solución posible para la celda [”+i+”,”+j+”]”

Si el valor es inválido, el programa debe imprimir:

 “El número ”+valor+” no es una solución posible para la celda [”+i+”,”+j+”]”.

---

A continuación, te mostramos las soluciones posibles de algunas celdas para que puedas verificar el correcto funcionamiento de tu programa:

```
Celda [0,0]: 3
Cleda [2,0]: 8
Celda [0,3]: 6, 8 y 9
Celda [0,5]: 6 y 9
```

Una vez que hayas comprobado que las características mencionadas anteriormente funcionan correctamente, puedes mejorar el programa con las siguientes opciones adicionales:

3. Sobreescribir borrador: Permite ingresar un valor en una celda de una matriz "borrador" basada en una copia del Sudoku original. 

Si la celda que se desea cambiar ya tiene un valor en la matriz original del Sudoku, se debe mostrar un mensaje de error indicando que la celda no se puede modificar. 

Si la celda se puede modificar, se debe verificar si ese valor es válido en esta nueva matriz e imprimir un mensaje indicando si la modificación fue exitosa o no.

4. Mostrar Borrador y Sudoku: Imprime por consola tanto la matriz "borrador" como el Sudoku original

5. Resetear Borrador: Restablece la matriz "borrador" para que vuelva a tener los mismos valores que el Sudoku original.

6. Mostrar Valores Posibles de una Celda: Permite ingresar las coordenadas de una celda e imprime por pantalla los valores posibles tanto en la matriz "borrador" como en el Sudoku original:

“Borrador: soluciones posibles para la celda [“+i+”, ”+j+”]: ”+solucionesBorrador

“Sudoku: soluciones posibles para la celda [“+i+”, ”+j+”]: ”+solucionesSudoku

Si la matriz borrador no admite valores posibles para una celda se de mostrar el siguiente mensaje: “La configuración actual del borrador no admite soluciones posibles para la celda [“+i+”, ”+j+”]” “Sudoku: soluciones posibles para la celda [“+i+”, ”+j+”]: ”+solucionesSudoku

---
