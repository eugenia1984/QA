# :computer: ENCUENTRO 52 - GENERICOS

## Introducción

Los genéricos son una característica que permite la creación de clases, interfaces y métodos que pueden trabajar con diferentes tipos de datos. Proporcionan una forma de parametrizar el código para que sea reutilizable y pueda adaptarse a diferentes tipos de datos sin tener que escribir implementaciones separadas para cada tipo. Los genéricos se introdujeron en Java a partir de la versión 5 (Java 5) con el objetivo de mejorar la seguridad de tipos y facilitar la reutilización del código. Con estos, es posible crear clases y métodos que pueden aceptar tipos específicos como parámetros y devolver resultados del mismo tipo. Esto permite escribir código más flexible y reduce la necesidad de conversiones de tipo manuales, lo que ayuda a prevenir errores en tiempo de ejecución. En resumen, los genéricos en Java son una característica que permite la parametrización del código para trabajar con diferentes tipos de datos de manera segura y reutilizable. Ayudan a mejorar la seguridad de tipos, facilitan la escritura de código más flexible y reducen la necesidad de conversiones de tipo manuales. Te dejamos a continuación la teoría sobre Genéricos. 

[👉 Teoría Genéricos](https://drive.google.com/file/d/19Vw3xlkUgEYgvOS85MYOF5d9UTRW_qvm/view)

---

## :star: Práctica Genéricos

Mira el siguiente vídeo si necesitas ayuda: [:tv: ver video](https://youtu.be/HDsDGMKQICQ)

---

## Ejercicio 1

Crea una clase Carta que reciba dos enums como genéricos. Un enum será para el valor que puede representar la carta, y otro enum es para el palo de la carta.

---

## Ejercicio 2

Crea una clase Lista que reciba un genérico que extienda de Object que tenga los siguientes 

Atributos

private T[] array;

Métodos:

void agregar(T objeto);

void eliminar(T objeto);

El método agregar debe verificar el tamaño del array, y si no tiene más espacio, debe crear un array nuevo con un espacio más con todos los elementos anteriores más el nuevo elemento a agregar

El método eliminar debe verificar el objeto existe en el array, si no existe no debe hacer nada, pero si existe debe asignar null en el lugar que ocupa dicho elemento en el array y luego debe crear un nuevo array eliminado es espacio vacío. Tendrás que dividir el array a ambos lados del null, y luego juntarlos los dos arrays resultantes en un solo.

---

## Ejercicio 3

Usa el ejercicio anterior pero esta vez “T” tiene que extender de persona. Debes agregar métodos que te permitan ordenar el array por cada propiedad de persona:

void ordenarPorNombre(Boolean ascendente)

void ordenarPorEdad(Boolean ascendente) 

Usa un comparator dentro de los métodos para poder hacerlo

---

## Ejercicio 4

Continúa con el ejercicio anterior, peor ahora agrega métodos que filtren por propiedad:

T[] filtrarPorNombre(String nombre)

T[] filtrarPorEdad(Integer mínimo, Integer máximo)

En este caso no debes filtrar el array original, debes crear una copia del mismo y filtrarlo para luego retornar el nuevo array filtrado.





---

