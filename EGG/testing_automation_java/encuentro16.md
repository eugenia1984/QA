# :computer: ENCUENTRO 16 - PRACTICA 3 - MATRICES

---

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> Ejercicios Matrices III

Antes de avanzar, te pedimos que por favor respondas a una breve encuesta con el objetivo de mejorar la calidad del curso:


¡Tu opinión es muy importante para nosotros!

---

En esta oportunidad, continuaremos explorando el mundo de las matrices y abordaremos desafíos más avanzados. Prepárate para seguir mejorando tus habilidades y enfrentar nuevos desafíos. 

¡Comencemos! 🚀


---

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> Batalla Naval

El objetivo del siguiente ejercicio es poner en práctica tus habilidades de programación mientras te enfrentas a la tarea de hundir los barcos enemigos. Deberás crear un programa que simule el emocionante juego de la Batalla Naval contra la computadora.

## ¡Manos a la obra!

1. El primer paso consiste en generar dos matrices de tamaño 4x4: "Computadora" y "Jugador". Estas matrices se llenarán de forma aleatoria con símbolos. Los símbolos "~" representarán espacios vacíos, mientras que los símbolos "=" simbolizarán los barcos enemigos. Cada matriz deberá contener cinco barcos. 

Por ejemplo:

``~ ~ ~ ~ = ~ ~ = ~ ~ = ~ ~ = ~ =``

2. El jugador deberá ingresar las coordenadas de fila y columna que desea atacar en el mapa de la computadora.

3. El programa imprimirá en la consola la matriz de la computadora sin revelar la ubicación exacta de los barcos enemigos, utilizando el símbolo "~". Además, se colocará una "X" en las coordenadas ingresadas por el jugador. Si el ataque fue exitoso, en lugar de la "X" se mostrará una "A".

Ejemplo de resultado:

``~ X ~ ~ ~ ~ ~ A ~ X A ~ ~ ~ ~ ~``

4. Luego, el programa seleccionará de forma aleatoria las coordenadas para que la computadora ataque al jugador.

5. Se imprimirá en pantalla el mapa del jugador, revelando los barcos enemigos representados por el símbolo "=" en su ubicación correspondiente. Al igual que antes, se colocará una "X" en las coordenadas atacadas por la computadora, o una "A" si el ataque fue certero.

Ejemplo de resultado:

 ~ ~ ~ ~
 A X ~ =
 X ~ = X
 ~ = ~ A
6. Los pasos 2 al 5 se repetirán hasta que uno de los dos mapas tenga cinco "A" en lugar de los cinco "=" originales. En ese caso, se imprimirán ambos mapas y se declarará al ganador de la partida.

7. Una vez completado el punto 6, puedes mejorar el juego agregando referencias de coordenadas al mapa impreso. Utiliza letras para representar las filas y números para las columnas, de manera que sea más fácil para el jugador identificar las coordenadas de ataque.

Ejemplo:
```
-  1 2 3 4
A| ~ ~ ~ ~
B| = ~ ~ A
C| ~ X = ~
D| ~ = ~ =
```

El jugador podrá ingresar las coordenadas en formato de cadena, por ejemplo, "B2", y el programa deberá traducirlas a [1, 1]. De la misma manera, cuando la computadora imprima las coordenadas de ataque, estas deberán aparecer en formato de texto, como "B2".

8. Como siguiente paso opcional, puedes aumentar el tamaño del mapa a 10x10. Además, cuando el ataque del jugador esté a una celda de distancia de un "=" enemigo, el programa puede imprimir "¡Casi me das!" en la consola. Si el ataque se encuentra a dos celdas de distancia, se mostrará el mensaje "Estuvo cerca". Y si el ataque está a tres celdas de distancia, el programa imprimirá "Sigue intentándolo".

💡Recuerda que el jugador sigue ingresando las coordenadas en formato de cadena, por ejemplo, "B2", y el programa se encarga de realizar la traducción a la notación de coordenadas [1, 1]. De igual manera, cuando la computadora imprime las coordenadas de su ataque, estas aparecen en formato de texto, como "B2".


---
