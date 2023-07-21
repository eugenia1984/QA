# ¡Hola! 👋

A continuación abordaremos cómo podemos realizar pruebas automáticas en sitios web utilizando Selenium como framework para ello.

En este encuentro veremos cómo agregar la dependencia de Selenium a Visual Studio Code y cómo automatizar la apertura, el cierre, la navegación y manipulación de una ventana del navegador. En encuentros posteriores, veremos cómo interactuar con los elementos de los sitios que estemos testeando.

¡Comencemos!

Verás que los ejercicios están marcados como fundamentales y perfeccionamiento. Concéntrate en lograr la resolución de los fundamentales para asegurar la comprensión de los conceptos abordados. Una vez completos, puedes abordar los de perfeccionamiento.

---

## :computer: Configuración de Selenium en Visual Studio Code

## Para agregar Selenium a Visual Studio Code, debes hacer lo siguiente:

1. Crea un proyecto nuevo de JAVA en Maven.

2. En la sección <dependencies> de tu archivo pom.xml agrega los siguientes códigos:


![image](https://github.com/eugenia1984/QA/assets/72580574/07c2bbbf-a16a-44e0-bfd6-26ea9351b75a)

```
<dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>3.141.59</version>
    </dependency>
<dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>5.0.3</version>
            <scope>test</scope>
        </dependency>
```

Después de agregar esta dependencia a tu archivo pom.xml, Maven debería descargar automáticamente la biblioteca de Selenium y sus dependencias.

3. Guarda los cambios en tu archivo pom.xml

A partir de este momento, en tu archivo .java deberías ver lo siguiente

![image](https://github.com/eugenia1984/QA/assets/72580574/65f1e37e-3888-4b9b-b13d-a49efef0758e)

En el caso que no puedas ver la clase correctamente, haz click derecho en el código y elige "Add Missing Imports" 👇

💾 Para que valides que tu archivo .xml y .java han sido creados correctamente, te compartimos [un ejemplo de cada uno](https://drive.google.com/drive/folders/1PWNvk_nqWyuo33D0fxl_xZJwLb9nRYIN) para que descargues y compares.


Con esto, ya tienes instalado Selenium en Visual Studio Code y estás listo para empezar a escribir tus scripts de prueba. En la siguiente sección, veremos en detalle cómo funciona Selenium.

🤔 ¿Te ha sonado familiar lo que acabas de hacer? Eso es porque ya hemos visto Maven en unidades anteriores lo que nos ha permite hoy comprender cómo se automatizan pruebas. Las clases de este proyecto se han creado automáticamente bajo ApplicationTest como recordamos en [este video](https://youtu.be/9MHQbs1_slU).


---
