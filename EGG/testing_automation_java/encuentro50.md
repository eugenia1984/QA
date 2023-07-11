# :computer: ENCUENTRO 50

## :star: Ejercicio interfaces


### Ejercicio 1

Básate en el ejercicio de Administrar Personas de la sección 11.1, pero esta vez utiliza la interfaz Comparator para poder realizar los ordenamientos:

### Ejercicio anterior: Proyecto para administrar personas

Crea un proyecto para administrar personas y países usando el patrón experto. Las personas deben tener nombre, edad y país, y los países tienen que tener nombre. La relación debe ser de agregación y debes darles las siguientes opciones al usuario:

- Crear Persona: Esta opción te permitirá crear una nueva persona. Deberás pedir al usuario el nombre, la edad y mostrar la lista de países disponibles para que el usuario elija uno, si no hay países disponibles permítele al usuario crear uno para asignarse a la persona.

- Crear País: Esta opción te permitirá crear un nuevo país. Deberás pedir al usuario el nombre del país.

- Mostrar lista de personas: Esta opción mostrará en formato tabla la lista de personas

- Mostrar lista de países: Esta opción mostrará en formato tabla la lista de equipos.

- Cuando se muestre la lista de personas o países se deben mostrar las siguientes opciones según corresponda:

-Filtrar: Con esta opción debes usar un arreglo distinto al base de la clase correspondiente para poder almacenar los objetos filtrados. Además de mostrar opciones para filtrar por propiedad debes agregar una opción para aplicar un segundo filtro

-Ordenar: Con esta opción debes usar el arreglo que usas para filtrar, permitir seleccionar la propiedad por la cual se va a ordenar y aplicar un algoritmo de ordenamiento. (Luego de ordenar y filtrar siempre vuelve a mostrar la lista resultante)

-Seleccionar Persona: Con esta opción el usuario debe  seleccionar una persona y luego mostrar un submenú con estas opciones:

```
-Ver detalles.
-Cambiar nombre.
-Cambiar edad.
-Reasignar país.
-Regresar al menú principal.
```

- Seleccionar País: Con esta opción el usuario debe seleccionar un país y luego mostrar un submenú con estas opciones:

-Ver detalles.

-Cambiar nombre: Debes asegurarte que cambie el nombre de la instancia de país que pertenece a cada persona también.

-Mostrar personas del país.

-Regresar al menú principal.

- Regresar al menú principal.

- Salir: Esta opción termina la ejecución del programa

--- 
