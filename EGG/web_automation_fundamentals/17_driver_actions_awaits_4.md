# :computer: Explicit Waits

## Algunas características de los Explicit Waits:

- No aplican a todos los elementos de la página web, solo a los específicos para los cuales están configurados.

- Permiten esperar hasta que se cumpla una cierta condición, como la visibilidad de un elemento o la actualización de un atributo.

- No se aplican a todo el script de automatización, solo donde los defines.

- Puedes especificar distintas condiciones y tiempos de espera para diferentes elementos o acciones.

- Aquí tienes un ejemplo de cómo aplicar un explicit wait:

```
WebDriver driver = new ChromeDriver(); driver.get("https://www.lapaginaquequieras.com"); WebDriverWait wait = new WebDriverWait(driver, 10); // Esperar hasta 10 segundos WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("unElemento"))); // Continuar con las acciones en el elemento...
```


En este ejemplo, el WebDriver esperará hasta 10 segundos para que el elemento con el ID "unElemento" sea visible. Si el elemento se vuelve visible antes de que transcurran los 10 segundos, el código continuará ejecutándose sin esperar todo el tiempo establecido. Si el elemento no se vuelve visible en 10 segundos, se lanzará una excepción de tiempo de espera (TimeoutException).

Las esperas explícitas son especialmente útiles cuando trabajas con elementos que pueden tardar en cargarse o cambiar de estado, y te permiten especificar condiciones complejas y tiempos de espera personalizados. A diferencia de las esperas implícitas, las explícitas solo se aplican a los elementos y condiciones específicas para los cuales están configuradas, lo que te brinda un mayor control sobre la sincronización de tu script.

---
