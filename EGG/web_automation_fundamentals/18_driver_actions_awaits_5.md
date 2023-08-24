# :computer: Expected Conditions

---

Habrás notado que el wait en este caso tiene la sintaxis: Espera N segundos + hasta que + ocurra algo

---

Este "ocurra algo" es lo que en el código anterior vemos como ExpectedConditions.ALGO

### Aquí te compartimos una serie de métodos que definen ese "algo", junto con su descripción:

Las condiciones esperadas (ExpectedConditions) en Selenium son una serie de métodos predefinidos utilizados junto con WebDriverWait para esperar a que ocurra una cierta condición antes de continuar con la ejecución del script. Hay varias condiciones esperadas disponibles que puedes usar, dependiendo de lo que necesites en tu caso de prueba:

1. ``elementToBeClickable(By locator)``

: Espera hasta que un elemento sea clickeable.

2. ``elementToBeClickable(WebElement element)``

: Espera hasta que un elemento específico sea clickeable.

3. ``elementToBeSelected(By locator)``

: Espera hasta que un elemento sea seleccionado.

4. ``elementToBeSelected(WebElement element)``

: Espera hasta que un elemento específico sea seleccionado.

5. ``frameToBeAvailableAndSwitchToIt(By locator)``

: Espera hasta que esté disponible un marco (frame) y cambia a él.

6. ``invisibilityOf(WebElement element)``

: Espera hasta que un elemento específico sea invisible.

7. ``invisibilityOfElementLocated(By locator)``

: Espera hasta que un elemento sea invisible.

8. ``presenceOfAllElementsLocatedBy(By locator)``

: Espera hasta que estén presentes todos los elementos encontrados por el localizador.

9. ``presenceOfElementLocated(By locator)``

: Espera hasta que un elemento esté presente en el DOM.

10. ``stalenessOf(WebElement element)``


: Espera hasta que un elemento específico ya no esté presente en el DOM.

11. ``textToBePresentInElement(By locator, String text)``

: Espera hasta que el texto especificado esté presente en el elemento encontrado por el localizador.

12. ``textToBePresentInElementLocated(By locator, String text)``

: Espera hasta que el texto especificado esté presente en el elemento especificado por el localizador.

13. ``textToBePresentInElementValue(By locator, String text)``

: Espera hasta que el texto especificado esté presente en el valor del atributo del elemento encontrado por el localizador.

14. ``visibilityOf(WebElement element)``

: Espera hasta que un elemento específico sea visible.

15. ``visibilityOfAllElements(List<WebElement> elements)``

: Espera hasta que todos los elementos en la lista estén visibles.

16. ``visibilityOfAllElementsLocatedBy(By locator)``

: Espera hasta que todos los elementos encontrados por el localizador estén visibles.

17. ``visibilityOfElementLocated(By locator)``

: Espera hasta que un elemento esté visible.

Estas condiciones esperadas ofrecen una gran flexibilidad y permiten manejar una variedad de situaciones en las que podrías necesitar esperar a que algo ocurra en tu página antes de continuar.

---
