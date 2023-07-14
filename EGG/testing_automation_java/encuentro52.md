# :computer: ENCUENTRO 52 - EXCEPCIONES

## :computer: Introducción

Las excepciones son la forma que tiene JAVA de detectar algún fallo o situación anómala al momento de ejecutar un programa. Lo que hacen es indicar que se ha producido un error durante la ejecución del programa. Algunos ejemplos pueden ser, querer dividir un número por cero, quedarse sin memoria, intentar abrir un archivo que no existe, entre otras. Entender el manejo de excepciones hará que logremos que nuestros programas funcionen de manera correcta y brindar también la mejor experiencia posible a los usuarios. Te dejamos a continuación la teoría sobre Excepciones. 

[👉 Teoría Excepciones](https://drive.google.com/file/d/1Tblky3_uhEtb3sGaWt43jZheCB_Zm6E2/view)

---

## :computer: Páctica excepciones


## Ejercicio 1

Modifica el ejercicio de administrar personas de la sección de interfaces para que el método encargado de ejecutar la opción de ordenar por una propiedad invoque un método llamado obtenerPropiedad() que solicite la propiedad por la cual se desea ordenar.

 El método obtenerPropiedad() debe validar que se ingrese el nombre de una propiedad del objeto, si el String ingresado por el usuario no corresponde a una propiedad, el método debe lanzar una excepción que deberá ser controlada por el método que lo invocó.

💡Nota: Puedes usar assertThrows(Exception.class, Executable) en tus test para validar que un método lanza una excepción. El parámetro Executable es una expresión lambda donde puedes invocar el método que quieres probar.

Mira el siguiente video si necesitas ayuda: [:tv: ver video](https://youtu.be/eOrZdCkn_Q8)

---

## Ejercicio 2

Basándote en el ejercicio anterior, crea una excepción personalizada para remplazar la excepción genérica que usaste en el ejercicio anterior.

Mira el siguiente video si necesitas ayuda: [:tv: ver video](https://youtu.be/xhWTmVIo9-Y)

---

## Ejercicio 3

Modifica el ejercicio anterior para que tu excepción personalizada sea no marcada, y quita el throws de la firma del método, luego comprueba que funcione correctamente.

Mira el siguiente video si necesitas ayuda: [:tv: ver video]([)](https://youtu.be/xEiq4ZHBvAI)

---

## Ejercicio 4

Crea una clase con un método main que invoque a un método que solicite al usuario un nombre y luego lo imprima por pantalla con un saludo. 

Utiliza el bloque finally para cerrar el Scanner luego de utilizarlo.

Mira el siguiente video si necesitas ayuda: [:tv: ver video](https://youtu.be/OtBCwLyP2eA)

---
