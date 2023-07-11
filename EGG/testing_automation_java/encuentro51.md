# :computer: ENCUENTRO 51 - INTERFACES - PRACTICA

## Ejercicio interfaces

### Ejercicio 1

Basate en el ejercicio de la sección 8.1 del juego de 4 en línea, pero aplica interfaces para crear un Servicio para cada variante del juego. 

- Crea una interfaz basada en los métodos que necesita el servicio del juego original para ejecutarlo. 

- Implementa la interfaz para que se pueda jugar al juego original.

- Luego crea una segunda implementación de la interfaz para jugar a la variante de poder girar el tablero.

-Por último, utiliza el sistema de menús creado en secciones anteriores para elegir qué modo de juego jugar


### Ejercicio anterior

Crea un proyecto maven usando el ejercicio del cuatro en línea con sus métodos y test y agregale la característica de que ahora en lugar de poner una ficha puedas girar el tablero, lo que hará que las fichas se re acomoden a causa de la gravedad (recuerda agregar los test de los métodos nuevos que crees). Por ejemplo, si nuestro tablero es el siguiente:

```
1 2 3 4 5 6 7 
O O O O O O O
O O O O O O O
O O C O J C O
O O J O J C O
O O J O C J C
O J J C C C J
```

Y el próximo turno es del jugador, y decide girar el tablero hacia la derecha, automáticamente gana la partida porque forma una diagonal de cuatro en línea

```
1 2 3 4 5 6
O O O O O O
J O O O O O
J O O O O O
C J O O O O
C C J C O O
C J J J O O
J C C C O O
```


---
