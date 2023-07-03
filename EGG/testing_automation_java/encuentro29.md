# :computer: ENCUENTRO 29

---

## Ejercicios Testing - Buscaminas

Ejercicio anterior: Desarrolla el juego del buscaminas completo:

1. Crea la lógica para generar el mapa en el método "generarMapa()" el cual recibirá una matriz como parámetro y no retornará nada. En este método, no es necesario imprimir el mapa. Tu objetivo es asegurarte de que la matriz contenga celdas con "M" (representando las minas) y celdas con números (en formato de "String") que indiquen cuántas minas hay alrededor. En caso de que una celda no tenga minas adyacentes, puedes colocar una "O" o un "0".

2. Luego, debes crear un método llamado "empezarJuego()", que también recibirá como parámetro la matriz del mapa y no devolverá nada. Este método contendrá la lógica para crear una matriz de juego del mismo tamaño que el mapa, pero rellenada con "X". Además, imprimirá en pantalla la matriz para que el jugador pueda verla, junto con los números de fila y columna en los bordes para facilitar la identificación de las coordenadas.

3. A continuación, se deben solicitar unas coordenadas al jugador. Estas coordenadas se compararán con la matriz del mapa y, dependiendo del contenido de la celda, ocurrirá lo siguiente:

Si la celda contiene una mina, el juego imprimirá el mensaje "¡Has explotado una mina! ¡Perdiste!".

Si la celda contiene un número, se modificará la celda correspondiente en la matriz de juego, reemplazando la "X" por el número encontrado en la matriz del mapa. Luego, se imprimirá la matriz de juego en pantalla.

Si la celda contiene una "O", se modificará la matriz de juego y se sobrescribirán todas las "X" correspondientes. ❗Es importante destacar que, en el buscaminas, cuando se selecciona una celda vacía, esto revela todas las celdas vacías a su alrededor hasta encontrar celdas con números. Por ejemplo, si el jugador ingresa las coordenadas [03:09], se puede imprimir la siguiente matriz de juego:

![image](https://github.com/eugenia1984/QA/assets/72580574/804a8af0-daf3-4d03-a8dd-debb55b38e5f)


4. Después de imprimir la matriz, se debe verificar si las únicas "X" que quedan corresponden a las ubicaciones de las minas. Si es así, se imprimirá un mensaje que diga "Descubriste todas las celdas sin explotar una mina. ¡Felicitaciones!" y el juego terminará. Si aún quedan "X" por descubrir que no son minas, se volverá a solicitar coordenadas al jugador hasta que pierda o gane.

5. Una vez que hayas completado el desarrollo anterior, puedes agregar un menú de configuración previo para seleccionar el tamaño del mapa y la cantidad de minas que deseas. También agrega las opciones "Empezar juego" y "Salir" al menú.

- Clase de test: Crea una clase test para testear los métodos de este ejercicio.

---
