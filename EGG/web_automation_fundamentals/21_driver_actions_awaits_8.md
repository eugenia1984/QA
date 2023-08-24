# :computer: Métodos para Fluent Wait

## Métodos para Fluent Wait

Fluent Wait en Selenium permite una gran personalización a través de varios métodos que se pueden utilizar. A continuación, te muestro algunos de los métodos más comunes:

1. **withTimeout(Duration duration)**: Establece la cantidad máxima de tiempo para esperar una condición. La espera terminará y lanzará una excepción si la condición no se cumple dentro del período de tiempo especificado.

2. **pollingEvery(Duration duration)**: Establece la frecuencia con la que se debe verificar la condición. Por ejemplo, si la configuras en 500 milisegundos, la condición se verificará cada 500 milisegundos.

3. **ignoring(Class<? extends Throwable> exceptionType)**: Le dice a Fluent Wait que ignore ciertas excepciones mientras espera que se cumpla una condición. Esto es útil si esperas que una excepción ocurra comúnmente y no quieres que termine la espera.

4. **until(Function<? super T, V> isTrue)**: Este método acepta una instancia de Function que debe devolver un valor diferente de null o false si la condición se cumple. La espera continuará hasta que se cumpla esta condición o se alcance el tiempo máximo de espera.

5. **withMessage(String message)**: Este método permite establecer un mensaje personalizado que se incluirá en la excepción si se alcanza el tiempo de espera sin que se cumpla la condición.

6. **until(Predicate<T> isTrue)**: Similar a until(Function<? super T, V> isTrue), pero acepta un Predicate y continúa la espera hasta que el predicado devuelva true.

Aquí tienes un ejemplo que utiliza varios de estos métodos:

```
Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
.withTimeout(Duration.ofSeconds(30)) // Tiempo máximo de espera .pollingEvery(Duration.ofSeconds(5))
// Frecuencia de verificación
.ignoring(NoSuchElementException.class)
// Ignorar esta excepción
.withMessage("Elemento no encontrado en el tiempo especificado");
// Mensaje personalizado
WebElement element = wait.until(new Function<WebDriver, WebElement>() {
    public WebElement apply(WebDriver driver) {
         return driver.findElement(By.id("someElement"));
  }
});
```

---
