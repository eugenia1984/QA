# :star: CASOS DE PRUEBA
---

## :book: TEMAS

- Como registrar un caso de prueba

- Técnicas TDD y BDD

- Tips para crear buenos casos de pruebas

- El Método de Clases de equivalencia (CE) en test de Caja Negra

- Descripción en un caso de prueba

- Pruebas Exploratorias

- Clase 3 en Vivo. JAVA + JMeter performance - fuerza - stress en página web

---

## :star: 1 - Como registrar un caso de prueba

- Datos a incorporar 

- Forma de Escritura 

- Ejemplo Práctico

-> Para cada **requerimiento** deb haber un **Caso de prueba**.

La estructura/ el formato del CASO DE PRUEBA depende de la empresa. No hay algo definido.


- La **descripción** no es tan coloquial.

- **Pre condiciòn** valores de la prueba, acciones a ejecutar.

- Los **pasos** son descriptivos uno a uno.

![image](https://user-images.githubusercontent.com/72580574/220431052-940247dc-5622-4ec2-b2f9-d0f2404acc16.png)

- Hay que generar casos de pruebas que **apunten a loq ue puede fallar**.

---

## :star: 2 - Técnicas TDD y BDD

#### Modelos de Testing y creación de casos de prueba

Aunque TDD no fue creado para testing, es un sistema muy utilizada en este ámbito.

TDD es una **metodología de desarrollo** cuyo objetivo es **crear primero las pruebas** y **luego escribir el software** y luego **probar si el software está funcionando de acuerdo a esas pruebas "pre-planeadas"**.

**BDD** (**Behavior Driven Development**), también es una estrategia de desarrollo dirigido por comportamiento, que ha evolucionado desde **TDD** (**Test Driven Development**), y tampoco nació como una técnica de testing.

Tanto en TDD como en BDD, **las pruebas se deben definir antes del desarrollo**, aunque en BDD, las pruebas se centran en el usuario y el comportamiento del sistema como un conjunto, a diferencia del TDD que se centra en funcionalidades específicas del software.


##### ¿Qué enfoque de testing debo aplicar? ¿TDD o BDD?

Aunque TDD o BDD parecen muy similares, la principal diferencia entre ambas está en el alcance. 

**TDD** es una práctica de desarrollo, enfocada en **cómo revisar el sistema y cómo debería funcionar**.

Mientras que **BDD** es un enfoque de equipo que hace hincapié en **porqué debes revisar ese código** y **porqué se debería comportar de una forma u otra**.

**En TDD el tester escribe los tests mientras que en BDD el usuario final, junto al resto del equipo multidisciplinario, escriben los tests**.

---

## :star: 3 - Tips para crear buenos casos de pruebas

![image](https://user-images.githubusercontent.com/72580574/220201503-d49ce532-a300-4583-95d3-556c90b609fb.png)


---

## :star: 4 - El Método de Clases de equivalencia (CE) en test de Caja Negra


- Consiste en dividir los **valores de entrada** en clases de **datos** para derivar **casos de prueba**.

- Se asume que el resultado de una prueba con un valor representativo de cada CE equivale a realizar la misma prueba con cualquier otro valor de la CE.

- Pasos para diseñar casos de prueba:

1. Identificar **clases de equivalencia**.

2. Identificar los **casos de prueba**. Minimizando no casos de prueba, considerar tantas condiciones como sea posible. 

Pasos:

- Asignar a cada CE un representante único.

- Definir casos de prueba que cubran tantas CE válidas como sea posible. Repetir hasta que todas las CE estén cubiertas.

- Definir un caso de prueba para cubrir una única CE no válida. Repetir hasta que todas estén cubiertas.

![image](https://user-images.githubusercontent.com/72580574/220201644-45917d4e-d9f5-4d77-9d2b-14d4e32ccf29.png)


---

## :star: 5 - Descripción en un caso de prueba


La descripción en el paso de prueba como parte fundamental del  resultado de un buen testing

### Casos de Prueba:

**Descripción**:

Hace referencia a una descripción concisa explicando el propósito u objetivo del Caso de Prueba. También se utiliza para su identificación.

### Ejemplo:

**Descripción incorrecta**:

Ingresar el número de cuenta de un cliente existente como cuenta origen, un monto menor al saldo disponible y luego realizar una transferencia a una cuenta de un beneficiario de la misma moneda que la cuenta origen.

**Descripción correcta**:

**Sector**: Home Banking

**Acción**: Transferencia de fondos

**Primer Valor**: Cuenta origen = caja de ahorro en pesos numérico de 9 dígitos con 1 guión

**Segundo Valor**: Saldo > Monto a transferir (ambos, numéricos de 12 dígitos 10 enteros, con coma para separador y 2 decimales.)

**Tercer Valor**: Moneda de cuenta beneficiario = moneda cuenta origen. (ambos valores con formato numérico de 9 dígitos con 1 guión)

---

## :star: 6 - Pruebas Exploratorias

#### ¿Que son las pruebas exploratorias?

Es la **ejecución de pruebas que se implementa sin pasos de autor formales de prueba**. Es simplemente sentarse y utilizar el sistema intentando “explorar” las funcionalidades y su funcionamiento.

#### ¿Para que sirven?

Sirven para **revisar la calidad de un producto desde la perspectiva del usuario**.

Con la ayuda de comentarios visuales y herramientas de prueba colaborativas, todos los integrantes del equipo pueden participar en las pruebas exploratorias. Esto permite a los equipos implementar modificaciones y adaptarse a los cambios rápidamente, creando un flujo de trabajo ágil.

#### ¿Cuándo deberías usar pruebas exploratorias?

Las pruebas exploratorias son adecuadas para casos de prueba específicos, como cuando alguien necesita recopilar información rápidamente acerca de un producto o una aplicación y proporcionar feedback rápido.

#### ¿Cuándo no se deben usar pruebas exploratorias?

Las pruebas exploratorias no ofrecen una cobertura amplia, y los equipos no deben intentar realizarlas hasta tanto no se den por finalizadas las tareas más importantes del proyecto.

Las pruebas con un paso a paso predefinido son las recomendadas para pruebas basadas en un cumplimiento puntual, como por ejemplo, requerimientos legales del software o pautas de calidad establecidas por la organización. 


---

## :star: 7 - Clase 3 en Vivo. JAVA + JMeter performance - fuerza - stress en página web
