# :computer: ENCUENTRO 31

---

## Ejercicios Testing

Recuerda que el objetivo de estos ejercicios es que puedas crear la clase test de los ejercicios que ya realizamos.

### Juego Othello

Ejercicio anterior:

Te invitamos a crear un programa que te permita disfrutar del emocionante juego de Othello contra la computadora. En este juego, podrás enfrentarte al desafío de seguir las reglas del juego y utilizar métodos para imprimir el tablero en cada ronda. El objetivo en Othello es lograr tener más fichas de tu color en el tablero que tu oponente. Para lograrlo, deberás colocar tus fichas estratégicamente en el tablero, volteando las fichas del oponente y convirtiéndolas a tu color. Reglas del juego: El juego se desarrolla en un tablero cuadrado de 8x8, donde cada jugador tiene fichas de un color, generalmente blanco y negro.

```
- 1 2 3 4 5 6 7 8
1 O O O O O O O O
2 O O O O O O O O
3 O O O O O O O O
4 O O O O O O O O
5 O O O O O O O O
6 O O O O O O O O
7 O O O O O O O O
8 O O O O O O O O
```

El juego comienza con cuatro fichas en el centro del tablero: dos fichas blancas y dos fichas negras, colocadas en un patrón alternado.

```
- 1 2 3 4 5 6 7 8
1 O O O O O O O O
2 O O O O O O O O
3 O O O O O O O O
4 O O O B N O O O
5 O O O N B O O O
6 O O O O O O O O
7 O O O O O O O O
8 O O O O O O O O
```
En cada turno, los jugadores colocan una ficha de su color en una posición vacía del tablero, siempre y cuando encierren al menos una ficha del oponente entre la ficha colocada y otra ficha del mismo color. Esta captura se puede realizar en direcciones vertical, horizontal o diagonal. Todas las fichas del oponente atrapadas entre las fichas del jugador serán volteadas y convertidas al color del jugador.

Es importante destacar que si un jugador no tiene ninguna celda en la que pueda encerrar una ficha del oponente, perderá su turno.

El juego continúa alternando los turnos hasta que ningún jugador pueda realizar un movimiento válido o el tablero esté lleno. En ese momento, se cuentan las fichas de cada jugador y el que tenga más fichas de su color en el tablero será el ganador.

A continuación, te presentamos un ejemplo ilustrativo de una partida en la que juegan las fichas blancas. Observa el tablero donde se muestran las celdas válidas representadas por el símbolo  “O” (con fondo gris) , indicando los lugares en los que puedes colocar una ficha blanca estratégicamente:

![image](https://github.com/eugenia1984/QA/assets/72580574/baeaba08-ec60-4aca-9617-457a59e864c7)

Después de que el jugador coloca su ficha en la posición 3:6, el tablero se modifica de la siguiente manera:


![image](https://github.com/eugenia1984/QA/assets/72580574/ceb64d25-61cc-4897-bf7a-99066a5f0303)

Luego, es el turno de las fichas negras y solo tienen una opción válida para mover, por lo tanto, están obligados a realizarlo.

Clase de test: Crea una clase test para testear los métodos de este ejercicio.


---
