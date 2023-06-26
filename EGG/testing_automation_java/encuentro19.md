# :computer: ENCUENTRO 19 - Métodos: Introducción / Ejercicios métodos 1

---

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> Introducción

Llegó el momento de adentrarnos en el mundo de los métodos en Java.

A medida que avanzamos en estos ejercicios, es natural que surjan preguntas o que desees repasar ciertos conceptos. Por esa razón, además de contar con tu mesa de trabajo como apoyo, recuerda que cuentas con el material teórico a tu disposición. Si en algún momento necesitas repasar un concepto o refrescar tus conocimientos sobre el uso de métodos en Java, puedes acceder a él a través del siguiente enlace:

[👉Teoría Java VI](https://drive.google.com/file/d/1vufoL7tv_QmDQqcSz-s0o0q1qRK4tNDj/view)

Aprovecha esta oportunidad para fortalecer tus conocimientos y construir una base sólida a medida que te enfrentas a los desafíos de programación.

¡Vamos a empezar! 🚀

[:tv: -> Cómo declarar un método](https://www.youtube.com/watch?v=tgL8vcq052E)

---

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> Ejercicios Métodos I

A continuación, utilizaremos los ejercicios que ya has resuelto anteriormente como base, pero esta vez vamos a aplicar el uso de métodos en su resolución. 

¡Manos a la obra!

---

1. Imprimir nombre: Crea un método que reciba por parámetro un nombre y luego imprima el mensaje "Mi nombre es [nombre]".

```Java
public static void main(String[] args) {
    System.out.println("Mi nombre es Elias");
}
```

---

2. Imprimir nombre y edad: Crea un método que reciba por parámetro el nombre y la edad, y luego imprima el mensaje "Me llamo [nombre] y tengo [edad] años".

```Java
public static void main(String[] args) {
    Scanner pepe = new Scanner(System.in);
    System.out.println("Por favor ingrese un nombre:");
    String nombre = pepe.nextLine();
    System.out.println("Por favor ingrese una edad:");
    int edad = pepe.nextInt();
    System.out.println("Me llamo "+nombre+" y tengo "+edad+" años");
}
```

---

3. Obtener datos: Crea dos métodos para obtener el nombre y la edad, respectivamente. Ambos métodos deben recibir por parámetro una variable de tipo "Scanner".

```Java
public static void main(String[] args) {
    Scanner pepe = new Scanner(System.in);
    System.out.println("Por favor ingrese un nombre:");
    String nombre = pepe.nextLine();
    System.out.println("Por favor ingrese una edad:");
    int edad = pepe.nextInt();
    imprimirNombreYEdad(nombre, edad);
}
```


4. Usar una variable global: Modifica los métodos "obtenerNombre()" y "obtenerEdad()" para que no necesiten recibir el Scanner por parámetro. En su lugar, utiliza una variable global para acceder al Scanner y obtener los datos necesarios.

```Java
public static void main(String[] args) {
    Scanner pepe = new Scanner(System.in);
    String nombre = obtenerNombre(pepe);
    int edad = obtenerEdad(pepe);
    imprimirNombreYEdad(nombre, edad);
}
```

---

Mira el siguiente video si necesitas ayuda: [video](https://youtu.be/JMk9Kn8Axis)

---


