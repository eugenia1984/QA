# :star2: 2.1 - Plan de prueba I

---

MODULO 2 - ENCUENTRO 7 / 17

---

##  Conceptos clave en el encuentro de hoy

- Procesos de Prueba

- Análisis de Requerimientos

- Matriz de Trazabilidad de Requerimientos

- Análisis de Automatización

- Tipos de requisitos

---

¡Ya hemos llegado al comienzo del módulo 2! A partir de ahora ya no tendrás marcado el uso de los tiempos ya que has adquirido progresivamente la suficiente autonomía como para administrarlo tú mismo. Por supuesto que podrás ir conversando con tu equipo para ver qué tal vienen a medida que vayan avanzando con el contenido de hoy.

Podrás notar que las guías comienzan a tener más páginas de aquí en adelante. ¡Ten calma! Ya eres un experto gestionando los tiempos. Además, encontrarás que a veces hacemos breves repasos de temas ya vistos y que los tópicos y ejercicios están acompañados de imágenes. Te proponemos no ver la cantidad de páginas si es algo que suele inquietarte un poco.

Hacia el final de esta guía, te encontrarás con un formulario que te llevará aproximadamente 20 minutos. Guárdate un espacio para completarlo. Este mismo formulario es un Check de conocimiento que te permitirá saber qué tal vienes hasta aquí y es el mismo que seguramente has visto antes de ingresar a esta guía.


---

## INTRODUCCION

Ya has tenido una introducción al mundo del testing. Así como has visto el ciclo de vida de producción de software, estaremos viendo las etapas del Ciclo de Vida del Testing (STLC). A partir de esta guía profundizaremos sobre cada etapa.

---

## :book: MATERIAL DE LECTURA 


### Procesos de prueba

Como has estado aprendiendo, no existe un único proceso para realizar pruebas. Sin embargo, podemos tener en cuenta una serie de actividades que son comunes a todos estos procesos. Estas actividades ayudan a que el Testing alcance los objetivos establecidos. 

Debemos tener en cuenta que un proceso de pruebas se ve afectado por una gran cantidad de factores internos y externos que deberemos tener en cuenta a la hora de planificar. Nombraremos algunos a continuación, pero deberás tener presente que ninguna lista es exhaustiva y que dependerá de cada proceso o entorno en que se aplique.

#### Factores que pueden afectar el ciclo de pruebas: 

- Modelo de Ciclo de vida del desarrollo del Software y metodologías del proyecto en uso(1).

- Niveles y tipos de pruebas considerados.

- Riesgos del producto y del proyecto.

- Restricciones operativas del entorno (económicos, financieros, contractuales, temporales, etc).

- Políticas o estándares requeridos. 

Teniendo esto en cuenta, sabremos que cada proceso de prueba será único y diferente del resto, pero dentro de estas actividades comunes, podemos identificar una serie de etapas a transitar en orden. 

(1) Puede ser que estés en un contexto de desarrollo ágil de software pero también existen contextos más tradicionales, o waterfall que siguen procesos más delimitados. 


#### Pasos comunes a los procesos de prueba

- 1 - Análisis de requerimientos

- 2 - Planificación

- 3 - Diseño y análisis 

- 4 - Implementación – Configuración del entorno

- 5 - Ejecución

- 6 - Actividades de cierre

- 7 - Control y monitoreo


Iremos desarrollando estos pasos a lo largo de las siguientes guías(2).

(2) ¿Tienes espacio para ver un video de 8 minutos? [Haz clic aquí](https://www.youtube.com/watch?v=suLnoy9-ueA) para ver cuál puede ser el desempeño profesional de un QA funcional junior.

---

## :star: 1 - Análisis de requerimientos

Hasta el encuentro de hoy, estuvimos viendo los requerimientos como una categoría amplia en la que incluimos “todo lo que puede pedirse al momento de iniciar un proyecto de software.” 

Ahora estamos en condiciones de ser más precisos y definir al requisito de software como una descripción detallada del sistema en implementación. Los requerimientos describen el uso práctico del producto o servicio, la condición o la capacidad a la que debe ajustarse un sistema. Los requisitos pueden variar desde declaraciones abstractas de alto nivel de servicios o restricciones del sistema hasta especificaciones funcionales matemáticas detalladas. 

¿Qué es el análisis de requisitos? Es el proceso por el que se determinan las expectativas del usuario para un sistema en consideración. El resultado de este análisis debe ser cuantificable y detallado.

- Sirve como base para los planes de prueba y el plan del proyecto.

- Sirve como un acuerdo entre el desarrollador y el cliente.

- Es un proceso que permite aclarar los requisitos declarados y no declarados

- Sirve para validar el requisito de integridad, falta de ambigüedad y viabilidad.

![image](https://user-images.githubusercontent.com/72580574/215608475-da89717e-048d-46ff-9b44-7b9298f4b218.png)


Imagen 7.1: El impacto de un error en el análisis de requerimientos. Fuente: Foundations of software testing de Dorothy Graham, Rex Black, Erik Van Veenendaal e Isabel Evans.
En la imagen 7.2 se muestra la consecuencia de un análisis deficiente de los requisitos y su impacto en el ciclo de vida del desarrollo del software.


---
