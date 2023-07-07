# :computer: ENCUENTRO 43

## Patrón experto

### Asignador de butacas

Crea un proyecto para gestionar las entradas de un Cine.

Crea una clase Cine que tenga un arreglo de Sala y un nombre

Crea una clase Sala que tenga una matriz para representar las butacas, una película y un atributo asientosDisponibles que cuente cuantos asientos libres quedan.

Crea una clase Película con atributo nombre y edadMinima

Crea una clase Persona, que tenga nombre, edad y asiento (de tipo String)

Crea un MenuServicio para que las "personas" puedan interactuar con el "asignado de butacas del cine", te debe permitir solicitar un asiento o salir

Crea una clase CineServicio que se encargue de crear las salas

Crea un clase SalaServicio que tenga la lógica para ubicar a las personas en los asientos solicitados

Crea una clase PeliculaServicio que te permita crear películas.

Crea un PersonaServicio que te permita crear personas según los datos que ingrean estas

Debes validar que tu Cine solo acepte permita seleccionar cualquier película pero si se cumplen la condición del mínimo de edad de la persona que la solicita, y luego de que la persona elija su butaca mostrarle su posición en formato letra numero: "H23"

No debes poner como opciones del menú la creación de cine, películas o salas. Debes generar un método generarCine() dentro de CineServicio para crear el cine, las peliculas y las salas.
