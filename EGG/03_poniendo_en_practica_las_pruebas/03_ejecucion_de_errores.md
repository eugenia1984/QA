# :star2: 3.3 - Ejecución de Errores

---


MODULO 3 - ENCUENTRO 16 / 17

---

## :book: MATERIAL DE LECTURA :book: 

Una vez que hemos aprendido cómo funcionan los procedimientos y ciclos de prueba, al ejecutar las pruebas deberemos reportar los errores encontrados. A continuación, analizaremos cómo encontrar errores y cómo reportarlos efectivamente para lograr su resolución, y así, aportar como tester, calidad al producto.

## Proceso de gestión de defectos

La gestión de defectos es un proceso sistemático para identificar y corregir errores. Un ciclo de 
gestión de defectos contiene las siguientes etapas:

![image](https://user-images.githubusercontent.com/72580574/218184193-b0b3344e-da2c-4836-89ee-dd83d6ba6f92.png)


1. **DESCUBRIMIENTO**

En la fase de descubrimiento, los equipos de proyecto tienen que descubrir tantos defectos como sea posible, antes de que el cliente final pueda descubrirlos. Se dice que se descubre un defecto y se acepta el cambio de estado cuando los desarrolladores lo reconocen y lo aceptan.

![image](https://user-images.githubusercontent.com/72580574/218184291-38d3a706-cdd5-4347-90bd-33dad415c9f5.png)


2. **CATEGORIZACIÓN**

La categorización de defectos ayuda a los desarrolladores de software a priorizar sus tareas. Eso significa que este tipo de prioridad ayuda a los desarrolladores a corregir primero aquellos defectos que son muy cruciales.

**¿Necesitas recordar cómo categorizamos errores?** Puedes volver a revisar el material aquí [QA E5- Casos de estudio](https://docs.google.com/document/d/1jNrJZsp_LuP2n_aDCcdkugo14vuSmXYU/edit?usp=sharing&ouid=100957054197686802986&rtpof=true&sd=true)

3. **RESOLUCIÓN**

La resolución de defectos en las pruebas de software es un proceso paso a paso para corregir los defectos. El proceso de resolución de defectos comienza con la asignación de defectos a los desarrolladores, luego los desarrolladores programan el defecto para que se solucione según la prioridad, luego se solucionan los defectos y finalmente los desarrolladores envían un informe de resolución al administrador de pruebas. Este proceso ayuda a corregir y rastrear defectos fácilmente.

Puedes seguir los siguientes pasos para corregir el defecto:

![image](https://user-images.githubusercontent.com/72580574/218184634-8cbce01e-f6e5-49a0-8a87-ab76baf8b9a6.png)

Imagen 16.3: Pasos para la resolución de defectos. Fuente: elaboración propia

- **Asignación**: asignada a un desarrollador u otro técnico para que la corrija y cambie el estado a Respondiendo.

- **Calendarizar el arreglo**: el lado del desarrollador se hace cargo de esta fase. Crearán un cronograma para corregir estos defectos, dependiendo de la prioridad del defecto.

- **Arreglar el defecto**: mientras el equipo de desarrollo está reparando los defectos, el administrador de pruebas realiza un seguimiento del proceso de reparación del defecto en comparación con el cronograma anterior.

- **Reportar la solución**: obtenga un informe de la resolución de los desarrolladores cuando se solucionen los defectos.

4. **VERIFICACIÓN**

Después de que el equipo de desarrollo soluciona e informa el defecto, el equipo de prueba verifica que los defectos se hayan resuelto realmente.

5. **CIERRE**

Una vez que se ha resuelto y verificado un defecto, el estado del defecto cambia a cerrado. De lo contrario, debe enviar un aviso al desarrollo para verificar el defecto nuevamente.

-> ¡Pro tip alert! Existen​ organizaciones internacionales como IEEE e ISO han publicado estándares para la documentación de pruebas de software.

Buscalas en google si quieres ser un experto documentando 🤓

O revisa este documento: [¿Cómo encontrar Un Error En La Aplicación](https://docs.google.com/document/d/1Fy2TeLoLa8nSlqRpkqWW44vli2ig_iRM462Ee883t4Q/edit?usp=sharing)


---

#### ¿Cómo encontrar un error en la aplicación?


Actualmente existe una serie de estándares de prueba de software llamado ISO/IEC/IEEE 29119 por las organizaciones que lo soportan. Su propósito es definir un conjunto de estándares acordado internacionalmente para la prueba de software que puede ser utilizado por cualquier organización al realizar cualquier forma de prueba de software.

Hay muchos otros estándares y decidir cual seguir es un desafío del equipo de testing.

Encontrar errores tan sutiles es el trabajo más desafiante y le brinda la satisfacción de su trabajo. Además, debe ser recompensado por las personas mayores. Tratar de descubrir los errores ocultos en el sistema que pueden ocurrir en condiciones especiales y que causan un impacto poderoso en el sistema. Puede encontrar un error de este tipo con algunos consejos y trucos.

Aquí están estos consejos:

1. Comprenda en profundidad toda la aplicación o el módulo antes de comenzar la prueba.

2. Prepare buenos casos de prueba antes de comenzar con las pruebas. Me refiero a dar énfasis a los casos de prueba funcionales, que incluyen el mayor riesgo de la aplicación.

3. Cree suficientes datos de prueba antes de las pruebas. Este conjunto de datos incluye las condiciones del caso de prueba y también los registros de la base de datos si va a probar una aplicación relacionada con la base de datos.

4. Realice pruebas repetidas con diferentes entornos de prueba.

5. Trate de averiguar el patrón resultante y luego compare sus resultados con esos patrones.

6. Cuando creas que has completado la mayoría de las condiciones de la prueba y cuando creas que estás un poco cansado, haz algunas pruebas de mono.

7. Use su patrón de datos de prueba anterior para analizar el conjunto actual de pruebas.

8. Pruebe algunos casos de prueba estándar para los que encontró los errores en alguna aplicación diferente. Al igual que si está probando el cuadro de texto de entrada, intente insertar algunas etiquetas HTML como entradas y vea la salida en la página de visualización.

9 . El último y mejor truco es esforzarse mucho para encontrar el error. ¡Como si estuviera probando solo para romper la aplicación!


---
