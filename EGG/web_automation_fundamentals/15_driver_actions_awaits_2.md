# :star: Implicit Waits

## Algunas características de los Implicit Waits:

1. Aplican para todos los elementos de la página web.

2. Le indica al WebDriver que tiene que esperar X tiempo antes de ejecutar el próximo comando.

3. Una vez que está configurado, aplica para todo el script de automation.

4. El implicit wait le indica al WebDriver que espere una cantidad determinada de tiempo antes de lanzar una excepción de "Elemento no encontrado" (NoSuchElementException) si el elemento no está disponible inmediatamente.

---

Es decir, si el elemento que nosotros estamos buscando NO está disponible (no cargó) en la cantidad de tiempo que nosotros indicamos, entonces tendremos el mensaje de NoSuchElementException.

---

Para aplicar un implicit wait, debemos agregarlo de esta manera:

```
WebDriver driver = new ChromeDriver(); // Establecer la espera implícita de 10 segundos driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); driver.get("https://www.lapaginaquequieras.com"); WebElement element = driver.findElement(By.id("unElemento")); // Continuar con las acciones en el elemento...
```

En este ejemplo, si el elemento con el ID "unElemento" no está disponible de inmediato, el WebDriver esperará hasta 10 segundos para que aparezca. Si el elemento se encuentra disponible antes de que transcurran los 10 segundos, el código continuará ejecutándose sin esperar todo el tiempo establecido.

---
