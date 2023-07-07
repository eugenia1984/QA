# :computer: ENCUENTRO 42

## Patrón experto
Juego del Ahorcado
Crea una versión simplificada del juego del Ahorcado, para ello, se requiere implementar las siguientes clases:

Clase JuegoAhorcado:

Atributos:

Un array de caracteres que representará la palabra a adivinar.

Un contador para llevar la cuenta de las letras encontradas.

Una variable para almacenar la cantidad máxima de jugadas permitidas.

Métodos:

Un constructor que reciba como parámetros la palabra a adivinar y la cantidad máxima de jugadas y por defecto la cantidad de palabras encontradas sea 0.

Getters y setters.

Clase JuegoAhorcadoServicio:

Esta clase será responsable de la lógica del juego.

Deberá implementar métodos para:

Inicializar el juego, creando una instancia de la clase JuegoAhorcado con una palabra aleatoria y una cantidad máxima de jugadas (ingresadas por el usuario).

Ejecutar el juego solicitando al usuario que ingrese una letra y verificando si está presente en la palabra e imprimiendo en pantalla como avanza el juego y cuantas oportunidades le queda.

Controlar el flujo del juego, mostrando el estado actual y verificando si el jugador ha ganado o perdido.

Clase MenuServicio:

Esta clase se encargará de mostrar un menú al jugador para comenzar a jugar o salir del juego.

Deberá implementar métodos para:

Mostrar el menú al usuario, ofreciendo las opciones de comenzar a jugar o salir.
