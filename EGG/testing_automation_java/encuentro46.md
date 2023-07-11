# :computer: ENCUENTRO 46 - HERENCIA

## Introducción

La herencia es un concepto fundamental en la programación orientada a objetos y una característica clave del lenguaje de programación Java. Proporciona un mecanismo poderoso para la reutilización de código y la organización de clases de manera jerárquica.

En Java, la herencia permite que una clase adquiera propiedades y comportamientos de otra clase, conocida como la clase padre o superclase.

Una de las ventajas clave de la herencia es la capacidad de reutilizar código. Al definir una clase padre con funcionalidades comunes, es posible crear múltiples clases hijas que compartan esas características y, al mismo tiempo, agreguen sus propios atributos y métodos específicos. Esto promueve la modularidad y el mantenimiento del código, ya que los cambios realizados en la clase padre se reflejarán automáticamente en todas las clases hijas.

Además, la herencia permite una organización más clara y estructurada del código. Las clases hijas se pueden agrupar y clasificar según sus relaciones de herencia, lo que facilita la comprensión y el desarrollo del software. También es posible utilizar polimorfismo, que se basa en la herencia, para tratar objetos de diferentes clases de manera uniforme y dinámica.

En resumen, la herencia es una característica fundamental en Java que permite la reutilización de código, la organización jerárquica de clases y la aplicación de polimorfismo. Al comprender y utilizar adecuadamente la herencia, los programadores pueden escribir código más modular, eficiente y fácil de mantener.

Te dejamos a continuación la teoría sobre Herencias.

[👉 Teoría Herencias](https://drive.google.com/file/d/1cofQQq-fkjaxj-8hnobNMeEa9DI4RDso/view)


---

## :computer: Práctica Herencia

### Ejercicio 1 - Herencia simple

- Crea una superclase llamada Animal con características generales como nombre y edad, y métodos como comer y dormir. 

- Luego, crea dos subclases, Perro y Gato, que hereden de Animal. Cada subclase debe tener al menos una característica y un método únicos. Por ejemplo, Perro puede tener un método ladrar y Gato un método ronronear. 

-> Mira este video si necesitas ayuda: [:tv: ver video](https://youtu.be/0v8soAFKJhw)


### Ejercicio 2 - Sobrescritura de métodos

 Basándote en el ejercicio anterior, sobreescribe los métodos comer y dormir en las subclases Perro y Gato para que muestren comportamientos específicos de cada animal. 

- Por ejemplo, cuando un Perro coma, podría imprimir “El perro está comiendo croquetas” y cuando un Gato duerma, podría imprimir "El gato está durmiendo encima del sofá”. 

- Luego implementa el método equals y hashCode de la clase Perro, pero en la clase Gato no, y crea una clase Test para comprobar el comportamiento esperado del método equals para cada caso.

-> Mira este video si necesitas ayuda: [:tv: ver video](https://youtu.be/uhjeyx7eqz0)


### Ejercicio 3 - Uso de instanceof

- Crea una lista de Animal y agrega varias instancias de Perro y Gato. Luego, itera sobre esta lista y, usando el operador instanceof, verifica el tipo de cada objeto para invocar un método propio de la clase.

- Por ejemplo, si el objeto es una instancia de Perro, invoca el método ladrar().

-> Mira este video si necesitas ayuda: [:tv: ver video](https://youtu.be/hzmE3qm5ecE)



### Ejercicio 4 - Clases abstractas e interfaces

- Crea una clase abstracta llamada DispositivoElectronico que tenga variables para el nivel de batería y estado de encendido. 

- Esta clase también debe tener un método abstracto llamado encender y otro llamado usoIntesivo. 

- Luego, crea dos subclases Telefono y Computadora. Ambas deben implementar los métodos abstractos.

- En Telefono, el método encender debe verificar que el nivel de batería es mayor al 5% para encender el dispositivo, en la computadora con que sea mayor a cero se puede encender. Para el método usoIntensivo el teléfono gasta 4% cada vez que es invocado, y 6% para la computadora.

- Crea una clase Test para comprobar el correcto funcionamiento de los métodos.

-> Mira este video si necesitas ayuda: [:tv: ver video](https://youtu.be/IiUgHlGf_qA)


---

