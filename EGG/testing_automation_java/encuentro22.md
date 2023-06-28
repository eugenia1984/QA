# :computer: ENCUENTRO 22 - Métodos:  Ejercicios  / Debugger

---

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> Sudoku plus

En este desafío, te invitamos a mejorar el código del ejercicio de Sudoku que ya has resuelto. El objetivo es utilizar métodos para aumentar la legibilidad de tu código y hacerlo más eficiente. 

Una vez que hayas verificado que el código sigue funcionando correctamente, podrás explorar una interesante característica: encontrar los valores posibles de una celda. Aprovechando esta funcionalidad, tendrás que desarrollar un método que resuelva automáticamente un Sudoku. 


```
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

💡Si te encuentras enfrentando dificultades para diseñar la lógica adecuada, puedes seguir la siguiente estrategia como guía: primero, crea una matriz tridimensional llamada "valoresPosibles" con dimensiones de 9x9x9. El primer índice representa las filas, el segundo las columnas y el tercero contiene un array (arreglo) de los posibles valores para cada celda. Por ejemplo, "valoresPosibles[0][0]" contendría un array de los valores posibles para la celda "sudoku[0][0]".


Inicialmente, se recorre el tablero del Sudoku y se completan los valores en la matriz tridimensional. Si una celda en el tablero ya tiene un valor predefinido (diferente de cero), se almacena un array de ceros en la misma posición de la matriz tridimensional, indicando que no hay valores posibles para esa celda debido a que ya está predefinida. Por ejemplo, si la posición "sudoku[0][1]" tiene un valor distinto de cero, se asignaría un array de ceros a "valoresPosibles[0][1]".

En el caso de que una celda en el tablero tenga un valor de cero, lo cual indica que está vacía, se deben calcular los posibles valores para esa celda y asignarlos al array correspondiente en la matriz tridimensional. Por ejemplo:

Si la celda [2][0] tiene un valor de cero, se calculan los posibles valores y se asignan al array "valoresPosibles[2][0]". Si el único valor posible es 8, entonces "valoresPosibles[2][0][0]" contendrá el valor 8 y el resto del array estará compuesto por ceros.

En el caso de la posición sudoku[0][5], los valores posibles son 6 y 9, por lo tanto, "valoresPosibles[5][0][0]" será 6, "valoresPosibles[5][0][1]" será 9, y el resto del array "valoresPosibles[5][0]" estará compuesto por ceros.

Una vez que se ha completado la matriz tridimensional con los posibles valores, se comienza a llenar un borrador utilizando los valores predefinidos del tablero y aquellos valores posibles que tengan una única opción. El borrador se utiliza para almacenar el progreso de la solución y, al principio, es una copia de la matriz "sudoku".

Luego, se crea una nueva matriz tridimensional llamada "valoresPosiblesBorrador" basada en el borrador actual. Esta matriz se utiliza para recalcular los posibles valores, teniendo en cuenta los valores fijos y parciales del borrador. Se repite este proceso de cálculo de posibles valores y actualización del borrador hasta que ya no queden celdas con un solo valor posible.

Si en algún momento ya no se encuentran celdas con un solo valor posible y quedan únicamente celdas con múltiples valores, se procede de la siguiente manera: se elige la primera celda y se selecciona el primer valor posible para esa celda. Si esta elección lleva a un punto en el que ya no hay valores posibles para completar el borrador, se retrocede al punto anterior y se elige otro valor posible para esa celda. Este proceso se realiza utilizando una matriz de cuatro dimensiones llamada "bifurcaciones", la cual almacena copias de la matriz de tres dimensiones "valoresPosiblesBorrador" cada vez que ya no quedan celdas con un solo valor posible. Se continúa probando diferentes valores y realizando cálculos hasta encontrar la solución correcta o determinar que se tomó el camino equivocado. En caso de tomar el camino equivocado, se recupera el último "valoresPosiblesBorrador" guardado a través de la matriz "bifurcaciones" y se continúa desde allí.

Al crear las "bifurcaciones" por primera vez, la estructura se establece de la siguiente manera: "bifurcaciones[cantidadDeCeldasQueQuedanPorResolver][9][9][9]". En "bifurcaciones[0]" se encuentra una copia de "valoresPosiblesBorrador" (recordando que debe ser un nuevo objeto) sin el valor posible que se va a probar.

Durante el proceso de prueba con el "valoresPosiblesBorrador" seleccionado, si nuevamente solo quedan múltiples valores posibles, se coloca una copia de "valoresPosiblesBorrador" sin el valor seleccionado en "bifurcaciones[1]", y se continúa con esta lógica hasta encontrar que la solución es correcta o determinar que se tomó el camino equivocado debido a la imposibilidad de completar el sudoku.

En caso de tomar el camino equivocado, se toma la última copia de "bifurcaciones" y se continúa realizando cálculos a partir de allí. Para determinar cuál es la última copia de "bifurcaciones", se busca el array de tres dimensiones dentro de "bifurcaciones" que esté lleno de ceros (por defecto "bifurcaciones[][][][]" está rellena de ceros). Al encontrarlo, se identifica que el elemento anterior es el "valoresPosiblesBorrador" necesario.

Por ejemplo, si se encuentra que "bifurcaciones[5]" tiene un array de tres dimensiones lleno de ceros, se utiliza "bifurcaciones[4]" para generar un nuevo "valoresPosiblesBorrador" que se utilizará para seguir buscando la solución. Luego, se modifica "bifurcaciones[4]" para eliminar el valor posible que se va a probar. En caso de que el valor a probar sea el último valor para esa celda, se llena "bifurcaciones[4]" de ceros, de modo que en la próxima búsqueda del último "valoresPosiblesBorrador" guardado, se obtenga "bifurcaciones[3]".

---
