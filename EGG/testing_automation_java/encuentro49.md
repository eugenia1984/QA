# :computer: ENCUENTRO 49 - INTERFACE

## Introducción

Las interfaces son una parte fundamental de la programación orientada a objetos en Java. Son un mecanismo poderoso que permite la definición de contratos y la especificación de comportamientos que deben implementar las clases.

En Java, una interfaz se define utilizando la palabra clave "interface".  A diferencia de las clases, una interfaz no puede contener variables de instancia ni implementar métodos con cuerpo. En su lugar, se utiliza para definir métodos y constantes abstractas que las clases que implementan la interfaz deben proporcionar.

Las interfaces en Java se utilizan para establecer una relación de "contrato" entre las clases. Una clase que implementa una interfaz debe proporcionar implementaciones concretas de todos los métodos declarados en la interfaz. Esto asegura que la clase cumpla con el contrato establecido por la interfaz y proporcione los comportamientos esperados.

Una ventaja clave de las interfaces es la capacidad de lograr la abstracción y el polimorfismo en Java. Al definir una interfaz, podemos separar la definición del comportamiento de su implementación real. Esto permite que múltiples clases implementen la misma interfaz, lo que facilita la modularidad, el intercambio de implementaciones y la reutilización de código.

Otro beneficio de las interfaces es que permiten establecer una relación de tipo entre clases que no están relacionadas por la jerarquía de herencia. Esto significa que una clase puede implementar múltiples interfaces, lo que brinda flexibilidad y la capacidad de cumplir con múltiples contratos a la vez.

En resumen, las interfaces en Java son una herramienta esencial para establecer contratos y definir comportamientos esperados en la programación orientada a objetos. Proporcionan abstracción, polimorfismo y una forma de establecer relaciones de tipo entre clases. Al comprender y utilizar adecuadamente las interfaces, los programadores pueden escribir código más modular, flexible y fácilmente mantenible.

Te dejamos a continuación la teoría sobre Herencias.

[👉 Teoría Interfaces](https://drive.google.com/file/d/19INpq7BPKfb9j-GBoZOrDVRd2Ebirrm8/view)

---


##  Ejercicio interfaces

Si en algún momento necesitas ayuda puedes mirar los siguientes videos:


[:tv: video - Declaracion](https://youtu.be/y2bq3kiAU1M)

[:tv: video -  clases anonimas](https://youtu.be/0AKWjR6cYKQ)

[:tv: video - interfaces funcionales lambdas](https://youtu.be/TMrsy6ay3bM)

[:tv: video - comparator](https://youtu.be/nqHUoLuyHkM)

---

## Calculadora de Servicio

Crea un proyecto donde crees una interfaz llamada CalculadoraServicio que tenga los siguientes métodos abstractos: 

- Integersuma(Integer num1, Integer num2)

- Integerresta(Integer num1, Integer num2)

- Integermultiplicacion(Integer num1, Integer num2)

- Double division(Integer dividendo, Integer divisor)

Y luego crea dos implementaciones, una CalculadoraSimple, y otra CalculadoraTrigonometrica a la cual debes aregar los siguientes metodos:

- Double seno(Double angulo): Recibe un ángulo en radianes y devuelve el seno del ángulo.

- Double coseno(Double angulo): Recibe un ángulo en radianes y devuelve el coseno del ángulo.

- Double tangente(Double angulo): Recibe un ángulo en radianes y devuelve la tangente del ángulo.

## Menu de Servicio

Crea un proyecto donde tengas una interfaz MenuServicio y tres implementaciones:

- La interfaz debe tener los siguientes métodos:

-void imprimirTitulo(): Debe imprimir el nombre del menú.

-void imprimirOpciones(); Imprime las opciones del menú

-Integer obtenerOpcion(); Tendrá la lógica para pedir al usuario la opción

-void seleccionarOpcion(Integer opcion): Tendrá la lógica para derivar la ejecucación de una accion en base a la opcion que recibe por parametro.

-Boolean validarSalida(Integer opcion); Tendrá la lógica de validar si la opcion es de salida o no para terminar el bucle y salir del menú.

-void saludo(); Debe imprimir un saludo luego de cerrar el menú.

-default void iniciar(): Será un método por default, es decir, estará implementado en la interfaz, que tiene que tener la lógica donde se invoque a los métodos anteriores.

- Implementación MenuGeneralServicio: Este menú debe implementar la interfaz MenuServicio y debe tener la lógica para seleccionar un menú secundario.

- Implementación MenuOpcionesNumericasServicio: Este menú debe implementar la interfaz MenuServicio y mostrar las opciones con números.

- Implementación MenuOpcionesLetrasServicio: Este menú debe implementar la interfaz MenuServicio y debe tener la lógica para mostrar y seleccionar las opciones con letras. Tienes que respetar el contrato de los metodos de la interfaz, para el método ObtenerOpcion pedir al usuario una letra pero luego convertirla a Integer para respetar el contrato.

- La implementación MenuGeneralServicio debe tener un array de MenuServicio para poder luego mostrarlos como opciones.

Las opciones de los menús secundarios pueden ser inventadas.

### Menú General

Une el proyecto del primer ejercicio con el del segundo para tener un menú general donde poder seleccionar la calculadora que quieres usar y dos menús secundarios, uno para permitir seleccionar al usuario cada una de las opciones de cálculo que brinda cada CalculadoraServicio. Recuerda que el menú secundario debe tener como atributo a la interfaz y recibir por parámetro, en el constructor, la implementación concreta de una CalculadoraServicio.


---

### Calculadora 2

Basate en el ejercicio anterior para aplicar el patrón decorator sobre CalculadoraTrigonometrica para tener una calculadora que en lugar de recibir ángulos en radianes reciba ángulos en grados:

- Crea una interfaz CalculadoraTrigonometrica que extienda de la interfaz CalculadoraServicio donde agregues los métodos de la clase CalculadoraTrigonometrica.

- Modifica el nombre de la clase CalculadoraTrigonometrica a CalculadoraTrigonometricaImpl y que implementa la interfaz CalculadoraTrigonometrica.

- Crea la interfaz decoradora GradosARadianes que extienda de la interfaz CalculadoraTrigonometrica y tenga un método gradosARadianes(Double grados)

- Crea una clase CalculadoraTrigonometricaGrados que implemente la interfaz RadianesAGrados:

-Esta es la clase decoradora, por lo tanto, tiene que tener como atributo una CalculadoraTrigonometrica, e implementar CalculadoraTrigonometricaGrados

-Implementa el método gradosARadianes()

-Implementa los métodos de CalculadoraTrigonometrica donde invocaras el método gradosARadianes(grados) para luego pasar el resultado a calculadoraTrigonometrica. Seno(radianes) o el método que corresponda.

Ahora puedes crear una instancia del decorador y pasarlo a una tercera de instancia de un menú secundario para que el usuario pueda terner la opcion de tener una calculadora trigonometrica que acepte ángulos en grados.


---
