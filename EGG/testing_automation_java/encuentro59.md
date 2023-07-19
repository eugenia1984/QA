# :computer: ENCUENTRO 59

## Práctica Time API V

### Ejercicio Programas

- Gestor de Programación de Televisión: Desarrolla una aplicación que permita a los administradores de un canal de televisión crear y gestionar una grilla de programas. Cada programa tiene una hora de inicio y fin en UTC, un nombre y una descripción.

- Crear programas: Al crear un programa, los administradores deben ingresar la hora de inicio en UTC, la duración en minutos, un nombre y una descripción. La aplicación debe calcular la hora de fin según la duración ingresada. Y debe validar que no se superpongan los horarios con estos programas, en tal caso debe pedirle de vuelta información con la sugerencia de horarios e intervalos disponibles.


---
Ver programas: Los administradores deben poder ver una lista de todos los programas ordenados por hora de inicio. Para cada programa, la aplicación debe mostrar el nombre, la descripción, la hora de inicio y fin en tiempo UTC, y la duración del programa (calculada con Duration.between).

Hora de transmisión del programa en diferentes zonas horarias: Los administradores deben poder seleccionar un programa y ver la hora de transmisión del programa en diferentes zonas horarias. La aplicación debe mostrar la hora de inicio y fin del programa en todas las zonas horarias de los países de Sudamérica, en la Costa Este(Nueva York) y Oeste (Los Angeles) de Estados Unidos, en España, Alemania, Sudáfrica, Israel, Hong Kong, Japón, Australia y Nueva Zelanda.
