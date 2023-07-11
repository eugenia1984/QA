# :computer: ENUENTRO 17 - HERENCIA - PRACTICA

## :star: Ejercicios Herencia

### Ejercicio 1 - Clases Selladas, Finales y Non-sealed

En este ejercicio, se te pide que desarrolles una jerarquía de clases para representar varias figuras geométricas. Cada figura tiene propiedades y métodos específicos para calcular su área y perímetro. Las figuras a representar son: Círculo, Triángulo (Escaleno, Isósceles, Equilátero), y Paralelogramo (Cuadrado, Rectángulo, Rombo, Romboide).

Comienza creando una clase sellada abstracta FiguraGeometrica que tenga métodos abstractos para calcular el área y el perímetro y permita la herencia de las subclases Circulo, Triangulo y Paralelogramos. También agrega un método abstracto de definición que devuelva un String con la definición de cada figura.

Desarrolla las subclases que extienden de FiguraGeometrica y que implementen sus propios métodos para calcular el área y el perímetro, y añade las propiedades particulares de cada una, también crea los constructores para que se adapten a cada caso. Por ejemplo un cuadrado solo necesita un constructor que reciba el tamaño de un lado, pero el rectángulo necesita recibir por parámetro los dos lados:

- **Círculo**: (clase final) con propiedades para el radio. Implementa los métodos para calcular:

-Área: (π * radio^2).

-Circunferencia: (2 * π * radio).

-Diámetro:  (d = 2 * r).

- **Triángulo**:(clase sealed) clase abstracta con propiedades para los lados (a, b, c). Crea subclases para Escaleno, Isósceles y Equilátero, cada una con sus propios métodos para calcular el área y el perímetro.

---> Escaleno (todos los lados son diferentes):

-Semiperímetro (s = (a + b + c) / 2)

-Área (A = √(s * (s - a) * (s - b) * (s - c)))

-Perímetro (P = a + b + c)

----> Isósceles (dos lados iguales):

-El constructor puede recibir un lado a (que será igual al c) y un lado b (que sería la base).

-Método altura() : (h = √(a^2 - (b^2 / 4)))

-Área (A = (b * h) / 2)

-Perímetro (P = 2 * a + b)

------> Equilátero (todos los lados iguales):

-El constructor puede recibir un lado a (que será igual a b y c).

-Método altura(): (h = √(a^2 - (a/2)^2))

-Área: (A = (a * h) / 2)

-Perímetro: (P = 3 * a)

- **Paralelogramo**: (clase non-sealed) clase con propiedades para la base, la altura. Crea subclases para Cuadrado y Rectángulo.

- **Cuadrado**:

-Área (A = b^2)

-Perímetro (P = 4*b)

-Rectángulo:

-Área (A = b * h)

-Perímetro (P = 2 * (a + b))

Luego de testear cada una de las clases, debes aplicar el patrón de diseño Factory Method para crear las figuras a partir de un método que reciba el área y perímetro por parámetro y devuelva una instancia de tipo FiguraGeometrica, el único caso donde necesitaras un dato adicional es para crear el triángulo escaleno, para ese caso asigna un valor aleatorio a uno de los lados y calcula los otros dos a partir del mismo.

---
