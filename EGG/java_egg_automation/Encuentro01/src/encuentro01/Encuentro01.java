package encuentro01;

public class Encuentro01 {

    public static void main(String[] args) {
        String name = "María Eugenia";
        int age = 38;
        // 1 - Crear un programa que imprima "Hola Mundo" en la consola.
        System.out.println("Hola mundo");
        // 2 - Crear un programa que imprima "Mi nombre es [tu nombre]" en la consola.
        System.out.println("Mi nombre es: " + name);
        // 3 - Crear un programa que imprima "Mi edad es [edad]" en la consola.
        System.out.println("Mi edad es: " + age);
        /****** VARIABLES ******/
        // Crear una variable por cada uno de los siguientes tipos de dato:
        // a. boolean, b. char, c. String, d. Int, e. long, f. float
        // Imprimir en consola el contenido de al menos una de las variables que
        // creamos en el paso anterior.
        // Declarar una variable para edad y otra para nombre e imprimir en
        // pantalla un texto que diga “Mi nombre es [nombre], y tengo [edad] años”.
        boolean boleana = true;
        char caracter = 'a';
        String cadena = "Esta es una cadena de texto";
        int entero = 4;
        long numeroLong = 9_223_372_036_854_775_805L;
        float numeroFloat = 5.4f; 
        String nombre = "María Eugenia";
        int anios = 38;
        System.out.println("Mi nombre es "+nombre+", y tengo "+anios+" años.");
    }  
}
