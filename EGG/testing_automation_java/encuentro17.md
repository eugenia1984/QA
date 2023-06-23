# 💻 ENCUENTRO 17 - PRACTICA 3 - MATRICES

---

## <img width="60" height="60" src="https://img.icons8.com/plasticine/60/java-coffee-cup-logo.png" alt="java-coffee-cup-logo"/> Ejercicios Matrices IV

## Laberintos

El objetivo de este ejercicio es desarrollar un programa que resuelva laberintos con la salida siempre ubicada en el lado derecho. 

En la representación de los laberintos, los "1" representan paredes, los "0" representan pasillos, la "X" representa tu ubicación actual, los "-" representan las ubicaciones ya visitadas y la "S" representa la salida.

El programa debe actualizar y mostrar en la consola la matriz cada vez que se mueva la "X" a la siguiente posición. El programa debe terminar cuando, después de mover la "X", el siguiente casillero sea la letra "S".

### ¡Manos a la obra!

El primer laberinto a resolver es el siguiente:

```Java
String[][] laberinto1 = {
{"1", "1", "1", "1", "1"},
{"1", "X", "0", "0", "S"},
{"1", "1", "1", "1", "1"},
};
```

Una vez que logres resolver un laberinto puedes intentar resolver el siguiente, tal vez la lógica que diseñaste no logre resolver los nuevos laberintos, en ese caso debes modificarla, pero la nueva lógica debe poder resolver los laberintos anteriores. 

Después de resolver el primer laberinto, puedes desafiarte a resolver los siguientes. 

💡Es posible que la lógica que hayas diseñado no sea suficiente para resolver los nuevos laberintos, por lo que deberás realizar modificaciones. Sin embargo, es importante asegurarse de que la nueva lógica sea capaz de resolver los laberintos anteriores que ya habías resuelto exitosamente. 

Aquí te compartimos el resto de los laberintos:


---

### Laberinto 2

```Java
String[][] laberinto2 = {
{"1", "1", "1", "1", "1"},
{"1", "X", "0", "1", "1"},
{"1", "0", "0", "0", "S"},
{"1", "1", "1", "1", "1"},
};
```

---

### Laberinto 3

```Java
String[][] laberinto3 = {
{"1", "1", "1", "1", "1", "1"},
{"1", "X", "0", "1", "0", "1"},
{"1", "0", "0", "0", "0", "1"},
{"1", "0", "0", "1", "0", "1"},
{"1", "0", "0", "1", "0", "S"},
{"1", "1", "1", "1", "1", "1"},
};
```

---

### Laberinto 4

```Java
String[][] laberinto4 = {
{"1", "1", "1", "1", "1", "1", "1", "1"},
{"1", "X", "0", "1", "0", "0", "0", "1"},
{"1", "0", "0", "0", "0", "1", "0", "1"},
{"1", "0", "0", "1", "0", "1", "0", "1"},
{"1", "0", "0", "1", "0", "1", "0", "S"},
{"1", "1", "1", "1", "1", "1", "1", "1"},
};
```

---


### Laberinto 5


```Java
String[][] laberinto5 = {
{"1", "1", "1", "1", "1", "1", "1", "1"},
{"1", "X", "0", "0", "0", "0", "0", "1"},
{"1", "1", "1", "0", "1", "1", "1", "1"},
{"1", "0", "0", "0", "0", "0", "0", "1"},
{"1", "0", "1", "1", "1", "1", "1", "1"},
{"1", "0", "0", "0", "0", "0", "0", "1"},
{"1", "1", "1", "1", "1", "0", "1", "1"},
{"1", "0", "0", "0", "0", "0", "0", "S"},
{"1", "0", "0", "0", "0", "0", "1", "1"},
{"1", "0", "0", "0", "0", "0", "0", "1"},
{"1", "1", "1", "1", "1", "1", "1", "1"},
};
```


---

### Laberinto 6


```Java
{
{"1", "1", "1", "1", "1", "1", "1", "1"},
{"1", "X", "0", "0", "0", "0", "0", "1"},
{"1", "1", "1", "0", "1", "1", "1", "1"},
{"1", "0", "0", "0", "0", "0", "0", "1"},
{"1", "0", "1", "1", "1", "1", "1", "1"},
{"1", "0", "0", "0", "0", "0", "0", "1"},
{"1", "1", "1", "0", "0", "1", "1", "1"},
{"1", "0", "0", "0", "1", "0", "0", "S"},
{"1", "0", "0", "0", "0", "0", "1", "1"},
{"1", "0", "0", "0", "0", "0", "0", "1"},
{"1", "1", "1", "1", "1", "1", "1", "1"},
};
```


💡Para probar todos los laberintos con la misma lógica, puedes usar un arreglo de tres dimensiones. Aquí te compartimos cómo sería la lógica:

```java
public static void main(String[] args) {
        String[][][] laberintos = {
            //laberinto 1
            {
                {"1", "1", "1", "1", "1"},
                {"1", "X", "0", "0", "S"},
                {"1", "1", "1", "1", "1"},
            },
            //laberinto 2
            {
                {"1", "1", "1", "1", "1"},
                {"1", "X", "0", "1", "1"},
                {"1", "0", "0", "0", "S"},
                {"1", "1", "1", "1", "1"},
            }
            //laberinto 3
            //laberinto 4 ...
        };
        for (int i = 0; i < laberintos.length; i++) {
            System.out.println("\nLaberinto "+(i+1));
            String[][] laberinto = laberintos[i];
            //La misma lógica para resolver todos los laberintos
        }
}
```

Si has logrado resolver los laberintos anteriores rápidamente, te invitamos a desafiarte resolviendo los siguientes (si no has tenido un progreso rápido, te recomendamos avanzar directamente a la siguiente sección):

---

### Laberinto 7


```Java
{
{"1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"},
{"1", "X", "0", "0", "0", "0", "0", "1", "1", "1", "1", "1", "1", "1", "1"},
{"1", "1", "1", "0", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"},
{"1", "0", "0", "0", "0", "0", "0", "1", "1", "1", "1", "1", "1", "1", "1"},
{"1", "0", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"},
{"1", "0", "0", "0", "0", "0", "0", "1", "1", "1", "1", "1", "1", "1", "1"},
{"1", "1", "1", "0", "0", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"},
{"1", "0", "0", "0", "1", "0", "0", "0", "0", "0", "0", "0", "0", "0", "1"},
{"1", "0", "0", "0", "0", "0", "1", "1", "1", "1", "0", "1", "1", "1", "1"},
{"1", "0", "0", "0", "0", "0", "0", "1", "0", "0", "0", "0", "0", "0", "1"},
{"1", "1", "1", "1", "1", "1", "1", "1", "0", "1", "1", "1", "1", "1", "1"},
{"1", "1", "1", "1", "1", "1", "1", "1", "0", "0", "0", "0", "0", "0", "1"},
{"1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "0", "0", "1", "1", "1"},
{"1", "1", "1", "1", "1", "1", "1", "1", "0", "0", "0", "1", "0", "0", "S"},
{"1", "1", "1", "1", "1", "1", "1", "1", "0", "0", "0", "0", "0", "1", "1"},
{"1", "1", "1", "1", "1", "1", "1", "1", "0", "0", "0", "0", "0", "0", "1"},
{"1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"}
};
```

---

### Laberinto 8

```Java
{
{"1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"},
{"1", "X", "0", "0", "0", "0", "0", "1", "1", "1", "1", "1", "1", "1", "1"},
{"1", "1", "1", "0", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"},
{"1", "0", "0", "0", "0", "0", "0", "1", "1", "1", "1", "0", "0", "0", "1"},
{"1", "0", "1", "1", "1", "1", "1", "1", "1", "1", "1", "0", "1", "0", "1"},
{"1", "0", "0", "0", "0", "0", "0", "1", "1", "1", "1", "0", "0", "0", "1"},
{"1", "1", "1", "0", "0", "1", "1", "1", "1", "1", "1", "1", "1", "0", "1"},
{"1", "0", "0", "0", "1", "0", "0", "0", "0", "0", "0", "0", "0", "0", "1"},
{"1", "0", "0", "0", "0", "0", "1", "1", "1", "1", "0", "1", "1", "1", "1"},
{"1", "0", "0", "0", "0", "0", "0", "1", "0", "0", "0", "0", "0", "0", "1"},
{"1", "1", "1", "1", "1", "1", "1", "1", "0", "1", "1", "1", "1", "1", "1"},
{"1", "0", "0", "0", "1", "0", "0", "1", "0", "0", "0", "0", "0", "0", "1"},
{"1", "0", "1", "0", "0", "0", "1", "1", "1", "1", "0", "0", "1", "1", "1"},
{"1", "0", "1", "0", "1", "0", "0", "1", "0", "0", "0", "1", "0", "0", "S"},
{"1", "0", "1", "0", "0", "0", "0", "1", "0", "0", "0", "0", "0", "1", "1"},
{"1", "0", "1", "1", "1", "1", "1", "1", "0", "0", "0", "0", "0", "0", "1"},
{"1", "0", "0", "0", "0", "0", "0", "0", "0", "1", "1", "1", "1", "1", "1"},
{"1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"}
};
```


---
