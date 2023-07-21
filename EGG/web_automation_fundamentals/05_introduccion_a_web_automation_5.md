# :computer: Introducción a Selenium

¡Excelente! Ya tienes tu espacio de trabajo configurado y estás listo para comenzar a probar sitios web.

En grupo, **miren el siguiente [video](https://youtu.be/eISATKwvlS0)** que abordará:

- Cómo funciona Selenium

- Cómo nos ahorra tiempo al automatizar acciones en los navegadores

- Cómo se crean pruebas sencillas

❗En el video verás cuáles son las funciones generales de Selenium con un sitio web como Wikipedia. Observarán que existen diversas maneras que instalar drivers y que se ejemplifica el uso de la herramienta utilizando acciones como findElement.

🧠 Concéntrate en entender el objetivo de Selenium y cómo éste interactúa con los navegadores. En este momento, no necesitas replicar lo que ves en el video, iremos paso a paso comprendiendo las diferentes acciones que puedes realizar con la herramienta e iremos profundizando a lo largo del curso.

---

## :computer: Práctica I - Fundamental


## 🎯 Este ejercicio es de tipo fundamental, esto quiere decir que es lo mínimo que necesitas resolver hoy para asegurar la comprensión del tema.

---

## Ejercicio 1: Abrir el navegador y navegar hacia una página web

El primer paso en la automatización de la web es simplemente abrir una página web. Para este ejercicio, escribe un script que abra el navegador Chrome y vaya a la página principal de Google (u otra que prefieras).

🔑 A partir del minuto 2:24 en el video que has visto anteriormente tendrás una guía para poder lograrlo.

🔑 Recurso necesario a partir de ahora: esta es la [documentación oficial de Selenium](https://www.selenium.dev/documentation/webdriver/getting_started/). Puedes buscar los comandos/acciones que necesites para resolver los ejercicios siguientes desde la lupa de este sitio web.

## ¿Observas algo distinto en el video?

En este caso, la persona está instalando un driver para Chrome, pero nosotros esto lo hemos hecho en la configuración anterior. Por esto, para abrir e ir hacia una página web, debes reemplazar la totalidad de las líneas de código que comienzan (e incluyen) String y System.setProperty del video:


![image](https://github.com/eugenia1984/QA/assets/72580574/40c7eb59-5f1a-4a8e-92bf-080d10e3a1e2)

Por lo siguiente:

```
WebDriverManager.chromedriver().setup();
```

El resto de las acciones puedes ejecutarlas de la misma forma que ves en el video. 😉

---

## :computer: Práctica II - Fundamental


## 🎯 Este ejercicio es de tipo fundamental, esto quiere decir que es lo mínimo que necesitas resolver hoy para asegurar la comprensión del tema.

---

## Ejercicio 2: Manipular la ventana del navegador

Ahora que sabemos cómo abrir una página web, podemos empezar a interactuar con la ventana del navegador.

Para este ejercicio, escribe un script que abra la página principal de Google, maximice la ventana del navegador y luego cierre el navegador.

🔑 Prueba buscar la acciones que necesitas luego de escribir driver. usando palabras claves como "window" o "maximize". ¡Sólo mediante la práctica y experimentación podrás ganar experiencia y velocidad en los comandos!

---
