# :computer: ENCUENTRO 30

---

## Ejercicios Testing - Juego de "4 en línea"

Ejercicio anterior:

El objetivo del juego de "4 en línea" es ser el primero en conectar cuatro fichas del mismo color en línea vertical, horizontal o diagonal en un tablero de seis filas por siete columnas. En nuestro caso, utilizaremos las letras "J" para representar al jugador y "C" para representar a la computadora. Para desarrollar este juego, debes crear los métodos necesarios para generar la matriz y replicar la lógica del juego.  Además, deberás imprimir el tablero en pantalla, incluyendo un borde superior con los números de las columnas. La primera ficha de la computadora deberá ser colocada en la columna central.
```
1 2 3 4 5 6 7 
O O O O O O O
O O O O O O O
O O O O O O O
O O O O O O O
O O O O O O O
O O O C O O O
```

💡Recuerda que en el juego de "4 en línea", el tablero se coloca perpendicular al piso, y las fichas caen ocupando la fila más baja disponible hasta toparse con otra ficha.

A continuación, se solicitará al jugador que elija en qué columna desea colocar su ficha, y se actualizará la matriz de juego en consecuencia.

Después de cada movimiento, se verificará si las fichas del jugador o de la computadora forman una línea de 4 en línea, ya sea en posición horizontal, vertical o diagonal:

Si se encuentra una línea de cuatro, se mostrará un mensaje de victoria para el jugador correspondiente. 

En caso contrario, el juego continuará hasta que uno de los dos jugadores gane o ya no haya más espacios disponibles en el tablero, en cuyo caso se imprimirá un mensaje de empate.

Durante el turno de la computadora, deberás implementar la siguiente lógica: primero, se debe detectar si en el próximo turno alguno de los dos jugadores tiene la oportunidad de hacer un cuatro en línea:

En caso afirmativo, la computadora deberá colocar su ficha en la columna correspondiente para ganar o evitar que el jugador gane. 

Si no se detecta una oportunidad de victoria inmediata, la computadora deberá analizar cuál es la línea propia más cercana a completarse y colocar su ficha en la columna correspondiente.


- Clase de test: Crea una clase test para testear los métodos de este ejercicio.


---
