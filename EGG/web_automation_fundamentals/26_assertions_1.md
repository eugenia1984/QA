# :computer: Assertions 1

## Introducción a Assertions

Una "assertion" (afirmación en español) es una declaración en programación que permite verificar si una condición particular es verdadera o falsa. Si la afirmación se evalúa como verdadera, el programa continúa su ejecución normalmente. Si se evalúa como falsa, el programa generalmente arroja una excepción y se detiene, o bien maneja el fallo de alguna otra manera. Por ejemplo, en el contexto de pruebas automatizadas, las afirmaciones se utilizan para validar si una operación en un navegador web se ha realizado correctamente. Si estás comprobando que un texto específico está presente en una página web, puedes usar una afirmación para comparar el texto esperado con el texto real en la página. En Java, un ejemplo de una afirmación en un marco de pruebas como JUnit podría ser: assertEquals("Texto esperado", elementoWeb.getText());

Si el texto del elementoWeb no coincide con "Texto esperado", esta afirmación fallará, y la prueba se marcará como fallida. Mira este video para conocer más sobre Assertions

[:tv: Assertions | Test Automation Principles and Web Automated testing | V5 | Egg](https://www.youtube.com/watch?v=AvawUJni9Xs)

---


## Tipos de Assertions


En el contexto de las pruebas en Java, se suelen distinguir dos tipos de afirmaciones: Hard Assertions y Soft Assertions. Estos términos se refieren a cómo se maneja una afirmación fallida. Hard Assertions

Estas son las afirmaciones tradicionales y se encuentran en la mayoría de los frameworks de pruebas como JUnit. Si una Hard Assertion falla, la ejecución de la prueba se detiene inmediatamente, y el código siguiente en esa prueba no se ejecutará. Esto significa que si tienes múltiples afirmaciones en tu prueba y la primera falla, las siguientes no se evaluarán. Ejemplo en JUnit: 

``
assertEquals(5, suma(2, 3)); // Si falla aquí, la prueba se detiene assertTrue(isElementPresent(elemento));
``

## Soft Assertions

A diferencia de las Hard Assertions, las Soft Assertions no detienen la ejecución de la prueba si una afirmación falla. Esto es útil si deseas que una prueba continúe incluso si una de las condiciones intermedias no se cumple, lo que te permite recopilar información sobre múltiples fallas en una sola ejecución de la prueba.

En JUnit, no hay una clase SoftAssert integrada, pero aún puedes lograr un comportamiento similar a las Soft Assertions usando otras estrategias, como recolectar errores en una lista y luego verificarlos todos al final.

Ejemplo en JUnit:

```Java
import static org.junit.jupiter.api.Assertions.assertEquals; 
import org.junit.jupiter.api.Test; 
import java.util.ArrayList; 
import java.util.List;

public class MySoftAssertTest { @Test public void testWithSoftAssertions() { 
     List<Throwable> errors = new ArrayList<>(); 
     try { 
       assertEquals(5, suma(2, 2)); // Si falla aquí, se añade a errores 
    } catch (Throwable t) { 
      errors.add(t); 
    }

    try { 
      assertEquals("Texto esperado", "Texto actual"); // Si falla aquí, se añade a errores 
    } catch (Throwable t) { 
       errors.add(t); 
    } // Lanza todas las afirmaciones fallidas al final 
    
    if (!errors.isEmpty()) {
           errors.forEach(error -> System.err.println(error.getMessage()));
           throw errors.get(0); // Lanza la primera excepción para marcar la prueba como fallida
    }
}
// Método auxiliar para el ejemplo
private int suma(int a, int b) { return a + b; } }
```

---

## Métodos para Assertions

Ahora que sabemos cómo comprobar un valor que determinamos, necesitamos conocer qué tipos de verificaciones podemos hacer. Esto es:

```Java
Assert.tipodeverificacionquequiero(esperado, real)
```

Dentro de los métodos que podemos usar en reemplazo de "tipodeverificacionquequiero", tenemos:
 
1. assertEquals(expected, actual): Comprueba si dos valores son iguales.

2. assertNotEquals(expected, actual): Comprueba si dos valores no son iguales.

3. assertTrue(condition): Comprueba si una condición es verdadera.

4. assertFalse(condition): Comprueba si una condición es falsa.

5. assertNull(value): Comprueba si un objeto es nulo.

6. assertNotNull(value): Comprueba si un objeto no es nulo.

7. assertSame(expected, actual): Comprueba si dos referencias de objetos apuntan al mismo objeto.

8. assertNotSame(expected, actual): Comprueba si dos referencias de objetos no apuntan al mismo objeto.

9. assertArrayEquals(expectedArray, actualArray): Comprueba si dos matrices son iguales en términos de longitud y contenido.

10. assertIterableEquals(expectedIterable, actualIterable): Comprueba si dos iterables son iguales.
   
11. assertThrows(expectedType, executable): Comprueba si una excepción del tipo esperado es lanzada por el código ejecutable.

12. fail(): Utilizado para marcar una prueba como fallida manualmente.

Ejemplo de una prueba con Selenium que utiliza una afirmación (assertion) para verificar el título de una página web. Supongamos que quieres comprobar que el título de la página de inicio de Google es correcto. 

```Java
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitleTest {
  @Test public void testGoogleTitle() {
    // Inicializar el navegador Chrome
    WebDriver driver = new ChromeDriver();
    // Ir a la página de inicio de Google
     driver.get("https://www.google.com");
     // Obtener el título de la página
     String title = driver.getTitle();
    // Asegurar que el título sea el esperado
    assertEquals("Google", title);
   // Cerrar el navegador driver.quit();
  }
}
```

En este ejemplo, la prueba abrirá Chrome, navegará hasta la página de inicio de Google, y luego utilizará assertEquals para asegurarse de que el título de la página es "Google". Si el título es correcto, la prueba pasará. Si el título es cualquier otra cosa, la prueba fallará y JUnit mostrará un mensaje indicando la discrepancia entre el valor esperado ("Google") y el valor real.


---
