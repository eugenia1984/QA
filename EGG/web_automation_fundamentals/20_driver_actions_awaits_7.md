# :computer: Fluent Waits

## Características de Fluent Wait

- **Personalización de Tiempo de Espera**: Puedes definir el tiempo máximo que deseas esperar una condición y la frecuencia con la que quieres verificar la condición.

- **Ignorar Excepciones Específicas**: Puedes configurarlo para ignorar excepciones específicas mientras espera que se cumpla una condición, como NoSuchElementException.

- **Función Personalizada**: Puedes utilizar una función lambda o una implementación de la interfaz Function para definir la condición de espera.

- **Aplicación en Elemento Específico**: A diferencia de la espera implícita, que se aplica a todo el controlador, Fluent Wait se puede aplicar a condiciones muy específicas.

---

## Ejemplo de Uso de Fluent Wait

Supongamos que quieres esperar a que aparezca un botón de inicio de sesión en una página web, y quieres verificar su presencia cada medio segundo durante un máximo de 10 segundos. Aquí tienes un código de ejemplo:

```
WebDriver driver = new ChromeDriver();
driver.get("https://www.example.com");
Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
// Tiempo máximo de espera
.pollingEvery(Duration.ofMillis(500)) // Frecuencia de verificación
.ignoring(NoSuchElementException.class); // Ignorar esta excepción durante la espera WebElement
loginButton = wait.until(new Function<WebDriver, WebElement>() {
   public WebElement apply(WebDriver driver) {
      return driver.findElement(By.id("loginButton"));
      // Condición de espera
  }
});
loginButton.click();
driver.quit();
````

En este ejemplo, si el elemento con el ID "loginButton" no está disponible de inmediato, WebDriver esperará hasta 10 segundos, verificando su presencia cada 500 milisegundos. Si el elemento se encuentra disponible antes de que transcurran los 10 segundos, el código continuará ejecutándose sin esperar todo el tiempo establecido.

---
