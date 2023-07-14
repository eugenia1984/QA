# :computer: ENCUENTRO 54

## Práctica Genéricos

---

### Ejercicio 1

Utiliza el ejercicio de la sección de Herencias (creador de barajas), pero esta vez aplica genéricos para crear la baraja. Ahora puedes crear una clase baraja genérica que reciba los enums directamente a la hora de construirla, y la cantidad de cartas la puedes recibir por parámetro en el constructor también. Lo mismo puedes aplicar para las cartas y crear una Carta genérica.

### Ejercicio anterior - Creador de Barajas

Crea un proyecto para poder crear la baraja de cartas española, inglesa y alemana. Tendrás que usar clases personalizadas, servicios, asociación de clases, enums, herencia, el patrón experto y el factory method.

Las barajas tienen propiedades en común:

-Cantidad de cartas: Integer

-Palos: array de String

-Cartas: array de Carta

Las cartas también tienen propiedades en común:

-Valor: Integer

-Palo: String

La clase Carta debe tener subclases correspondientes a cada tipo de mazo, y deben tener dos propiedades específicas que serán un valorEnum y un paloEnum, ambas de tipo Enum. 

Para la baraja española tendrás un enum PaloEspanola que tendra las constantes COPA, ORO, BASTO, ESPADA, para la baraja inglesa las constantes serán CORAZONES, PICAS, DIAMANTE, TREBOL

El "valorEnum" de la baraja española podría ser de tipo "ValorEspanola" y tener constantes como UNO, DOS … SIETE, SOTA, CABALLO, REY.

El constructor de las subclases de "Carta" recibirá como parámetros "valorEnum" y "paloEnum". Utilizaremos las propiedades de los enums para llamar al constructor de la superclase, pasando el valor y el palo correspondiente.

La clase Baraja debe tener subclases correspondientes a cada tipo de mazo, y deben tener dos propiedades específicas que serán un valoresEnum y un palosEnum (Ambos son un array de constantes), ambas de tipo Enum.

El array de Cartas que se recibe por parámetro en el constructor debe ser del tipo específico para ese tipo de mazo.

El constructor de las subclases de "Baraja" recibirá como parámetros "valoresEnum" y "palosEnum". Utilizaremos el método "values()" de los enums para obtener el array de constantes y luego convertiremos ese array a un String utilizando "Arrays.toString(palosEnum)". Luego, utilizaremos el método "split()" para convertir el String en un array que podamos pasar al constructor de la superclase y asignar los valores al atributo "palos".

Ahora, vamos a combinar el patrón experto y el factory method para crear las clases servicio. Crearemos una clase abstracta que nos permitirá implementar el método "crearBaraja()". En las subclases de la clase abstracta de MazoServicio implementaremos la lógica para instanciar las cartas y crear el mazo correspondiente.

Te dejo la información necesaria para hacer el ejercicio para que no tengas que buscarla:

### Baraja española:

Cantidad de cartas: 42 (incluyendo los dos comodines)

Valores: UNO, Dos, Tres, Cuatro, Cinco, Seis, Siete, Ocho, Nueve, Sota, Caballo, Rey, Comodín

Palos: Copas, Oros, Bastos, Espadas.

### Baraja inglesa:

Cantidad de cartas: 54 (incluyendo los dos comodines).

Valores: As, Dos, Tres, Cuatro, Cinco, Seis, Siete, Ocho, Nueve, Diez, Jota, Reina, Rey, Comodín 

Palos: Corazones, Picas, Diamantes, Tréboles.

### Baraja Alemana:

Cantidad de cartas: 36 (sin comodines).

Valores: As, Seis, Siete, Ocho, Nueve, Diez, Campesino, Dama, Rey

Palos: Corazones, Campanas, Hojas, Bellotas.

📍Recuerda realizar los test correspondientes.
