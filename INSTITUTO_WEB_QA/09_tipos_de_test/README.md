# :star: TIPOS DE TEST

---

## :book: TEMAS

- Clasificación de Pruebas de Testing de software

-  Documento Standard de Pruebas Funcionales

---

## :star: 1 - Clasificación de Pruebas de Testing de software

Funcionales, No Funcionales y otros..

### Clasificación de Pruebas de Testing de software

- **1 - Funcionales**: Se realiza la validación de las funciones del sistema, basándose en el requerimiento de las acciones a realizar. 

Las pruebas funcionales se centran en los requisitos empresariales de una aplicación. Solo verifican el resultado de una acción y no comprueban los estados intermedios del sistema al realizar dicha acción.

A veces, se confunden las pruebas de integración con las funcionales, ya que ambas requieren que varios componentes interactúen entre sí. La diferencia es que una prueba de integración puede simplemente verificar que puedes hacer consultas en la base de datos, mientras que una prueba funcional esperaría obtener un valor específico desde la base de datos, según dicten los requisitos del producto.

- **2 - No Funcionales**: Se analiza y testea el desempeño, escalabilidad, estabilidad y todo otro requerimiento no funcional.

- **3 - Caja Blanca**: Se analiza fallas de seguridad, flujo de valores, código interno y resultados informados por la base de datos. Generalmente realizado por programadores.

- **4 - Caja Negra**: Se realiza desde fuera del código, solamente se realiza pruebas de uso con valores válidos e inválidos. Se analizan los resultados que arroja el software.

- **5 - Regresión**: Se verifican que los cambios hechos anteriormente, por fallas informadas o por modificaciones del software, no hayan afectado funcionalidades preexistentes. Incluye cambios o nuevas características y fallas que implementen modificación de código.

- **6 - Pruebas unitarias**: Las pruebas unitarias son de muy bajo nivel y se realizan cerca de la fuente de la aplicación. Consisten en probar métodos y funciones individuales de las clases, componentes o módulos que usa tu software. En general, las pruebas unitarias son bastante baratas de automatizar y se pueden ejecutar rápidamente mediante un servidor de integración continua.

- **7 - Pruebas de integración**: Las pruebas de integración verifican que los distintos módulos o servicios utilizados por tu aplicación funcionan bien en conjunto. Por ejemplo, se puede probar la interacción con la base de datos o asegurarse de que los microservicios funcionan bien en conjunto y según lo esperado. Estos tipos de pruebas son más costosos de ejecutar, ya que requieren que varias partes de la aplicación estén en marcha.

- **8 - Pruebas integrales**: Las pruebas integrales replican el comportamiento de un usuario con el software en un entorno de aplicación completo. Además, verifican que diversos flujos de usuario funcionen según lo previsto, y pueden ser tan sencillos como cargar una página web o iniciar sesión, o mucho más complejos, como la verificación de notificaciones de correo electrónico, pagos en línea, etc.

Las pruebas integrales son muy útiles, pero son costosas de llevar a cabo y pueden resultar difíciles de mantener cuando están automatizadas. Se recomienda tener algunas pruebas integrales clave y depender más de pruebas de menor nivel (unitarias y de integración) para poder detectar rápidamente nuevos cambios.

- **9 - Pruebas de aceptación**: Las pruebas de aceptación son pruebas formales que verifican si un sistema satisface los requisitos empresariales. Requieren que se esté ejecutando toda la aplicación durante las pruebas y se centran en replicar las conductas de los usuarios. Sin embargo, también pueden ir más allá y medir el rendimiento del sistema y rechazar cambios si no se han cumplido determinados objetivos.

- **10 - Pruebas de rendimiento**: Las pruebas de rendimiento evalúan el rendimiento de un sistema con una carga de trabajo determinada. Ayudan a medir la fiabilidad, la velocidad, la escalabilidad y la capacidad de respuesta de una aplicación. Por ejemplo, una prueba de rendimiento puede analizar los tiempos de respuesta al ejecutar un gran número de solicitudes, o cómo se comporta el sistema con una cantidad significativa de datos. Puede determinar si una aplicación cumple con los requisitos de rendimiento, localizar cuellos de botella, medir la estabilidad durante los picos de tráfico y mucho más.

- **11 - Pruebas de humo**: Las pruebas de humo son pruebas básicas que sirven para comprobar el funcionamiento básico de la aplicación. Están concebidas para ejecutarse rápidamente, y su objetivo es ofrecerte la seguridad de que las principales funciones de tu sistema funcionan según lo previsto.

Las pruebas de humo pueden resultar útiles justo después de realizar una compilación nueva para decidir si se pueden ejecutar o no pruebas más caras, o inmediatamente después de una implementación para asegurarse de que la aplicación funciona correctamente en el entorno que se acaba de implementar.

---

## :star: 2  - Documento Standard de Pruebas Funcionales

16 Tips infaltables de Test para revisión


![image](https://user-images.githubusercontent.com/72580574/220204181-35fac8cf-e485-44d8-b184-90152513e018.png)

### 1 - Inputs de Texto:

1. Validación de caracteres:

-Verificar el tipo de caracteres aceptado.

-Debe aeceptar letras mayúsculas, minúsculas y números.

-Verificar el comportamiento ante el ingreso de caracteres especiales
(¡”#$%&/()=?)

-Verificar ingreso de caracteres de control. (entrer, Tab, Alt+ teclas de funcion...) 

-Verificar input combinado (ABCDEab#cde01234)

2. Validación de ancho de campo:

-Verificar el ancho de campo definido, ingresar el máximo posible

-Verificar el impacto en la tabla ante el ingreso del máximo posible

-No debe truncar la cadena ingresada

3. Verificar obligatoriedad del dato (según especificación de diseño):

-No debe aceptar nulos

### 2- Inputs numéricos:

1. Validación de caracteres:

-Verificar el tipo de caracteres aceptado

-Debe aceptar solo números

-Verificar input combinado (11133A45 ó 11333&22)

2. Validación de ancho de campo:

-Verificar el ancho de campo definido, ingresar el máximo posible

-Verificar el impacto en la tabla ante el ingreso del máximo posible

-No debe truncar la cadena ingresada

3. Validación de rangos numéricos:

-Verificar el ingreso de números negativos (según regla de negocio) 

-Verificar el ingreso de ceros (si corresponde)

-Verificar el ingreso de decimales (si corresponde)

4. Validación de reglas de negocio:

-Verificar ancho máximo permitido según tipo de dato

-DNI (8 dígitos)

-Teléfono (10 dígitos)

-Etc.

5. Verificar obligatoriedad del dato (según especificación de diseño): 

-No debe aceptar nulos

### 3- Inputs de fecha:

1. Validación de caracteres:

-Verificar el tipo de caracteres aceptado.

-Verificar input combinado (12-05-20A2 ó 12-0?-2002)

-Si fuera con formato predefinido debe aceptar solo números.

-Si no tuviera formato predefinido debe aceptar ‘/’ ó ‘-‘ y validar otro tipo de caracteres

2. Validación de ancho de campo:

-Verificar el ancho de campo definido (2,2,2 - 2,2,4 – 4,2,2) según formato 

-Verificar el impacto en la tabla ante el ingreso del máximo posible 

-No debe truncar la cadena ingresada

3. Validación de formato:

-Verificar máximos valores permitidos para día, mes y año

-Verificar formato d/m/a, a/m/d, m/d/a ó d-m-a, a-m-d, m-d-a

4. Validación de lógica:

-Verificar máxima cantidad de días permitida según mes (ej. Febrero solo 28) ∙ Si se tratara de un rango (desde-hasta): fecha inicial <= fecha final ∙ El año debe estar comprendido entre por ejemplo 1900 y 2100 (según regla de negocio)

-Validación de ingreso de fecha con valores:

i. Menor o igual a la minima

ii. Menor a la maxima

iii. Mayor o igual a la maxima

5. Verificar obligatoriedad del dato (según especificación de diseño): 

-No debe aceptar nulos

### 4- Inputs especiales (CUIT/CUIL):

4. Validación de caracteres:

-Verificar el tipo de caracteres aceptado.

-Verificar input combinado (20-253194R5-2 ó 2#-25316089-5)

-Si fuera con formato predefinido debe aceptar solo números.

-Si no tuviera formato predefinido debe aceptar ‘-’ y validar otro tipo de
caracteres

5. Validación de ancho de campo:

-Verificar el ancho de campo definido `<2dígitos>-<8dígitos>-<1dígito> `

-Verificar el impacto en la tabla

-No debe truncar la cadena ingresada

6. Validación de formato:

-Verificar valores permitidos (consultar composición de CUIT y CUIL) 

-Validar contra base externa de CUIT y/o CUIL (si hubiera)

7. Verificar obligatoriedad del dato (según especificación de diseño): 

-No debe aceptar nulos

### 5- Inputs de moneda:

1. Validación de caracteres:

-Verificar el tipo de caracteres aceptado.

-Verificar input combinado (2A0.35 ó 20.%0)

-Verificar el ingreso de importes negativos.

-Verificar el ingreso del valor neutro (cero).

-Si fuera con formato predefinido debe aceptar solo números. ∙ Si no tuviera formato predefinido debe aceptar ‘.,’ y validar otro tipo de caracteres

2. Validación de ancho de campo:

-Verificar el ancho de campo definido `<Entero>.,<Decimal>`

-Verificar el impacto en la tabla ante el ingreso del máximo posible 

-No debe truncar la cadena ingresada

3. Validación de formato:

-Verificar valores permitidos (según regla o lógica de negocio)

4. Verificar obligatoriedad del dato (según especificación de diseño): 

-No debe aceptar nulos

### 6- Combos o Matchcodes (listas de valores):

1. Verificar funcionalidad de la lista desplegable:

-Debe contener los datos requeridos

-Los datos deben ser seleccionables

-Debe ser posible modificar la selección realizada (antes de confirmar) 

-Verificar el tiempo de respuesta para la cantidad máxima permitida.

2. Verificar contenido de la lista contra tabla referida:

-Debe mostrar todos los datos de la tabla referida

-Si hubiera filtro de la tabla referida debe cumplirlo

-Si la hubiera referencia relacional deberá chequearse la relación en la BD 

-La información disponible en la lista debe ser consistente

-Si hubiera listas enlazadas y dependientes, chequear combinaciones

3. Validación de reglas de negocio:

-Si los valores fueran predeterminados (hardcode), chequear reglas 

-Si la selección debe validarse, chequear reglas

4. Verificar obligatoriedad del dato (según especificación de diseño): 

-No debe aceptar nulos

### 7- Marcas y opciones (option y check):

1. Verificar funcionalidad de marcas y opciones:

-Se debe poder marcar y desmarcar (antes de confirmar)

-En opciones únicas al marcar una debe desmarcar la otra

-En opciones múltiples se debe poder seleccionar una, alguna o todas 

-En largas listas de marcas u opciones deberían existir los botónes marcar todas y desmarcar todas

2. Verificar obligatoriedad del dato (según especificación de diseño): 

-No debe permitir la ausencia de selección o marca

### 8- Restricciones de edición:

1. Verificar edición de datos de control o auditoría

-No deben poder editarse datos de claves, números de registro, usuario de última modificación, fecha y hora de última modificación, secuenciadores, etc.

2. Verificar edición de datos no editables en modficación (según RN): 

-No debe permitir la edición de datos con restricción de modificación, por ejemplo CUIL o CUIT en una modificación de datos de afiliado o empresa

### 9- Etiquetas:

1. Verificar etiquetas de ventanas, campos, secciones, grillas, browsers, etc. 

-El texto de las etiquetas debe corresponderse con lo que referencia 

-El texto de las etiquetas no debería tener errores ortográficos o falta de espacios

-No deberían haber omisiones de letras o palabras en el texto de las etiquetas 

-Las etiquetas customizadas deberan estar en el idioma local. (ver especificación de diseño)

### 10- Grillas de consulta o resultado:

1. Verificar grillas o browsers de consulta o resultado:

-Los datos desplegados deben estar completos o con opción “ajustar” (fit) 

-Las columnas deben poseer etiquetas identificatorias

-Si la cantidad de datos supera el ancho o largo de la pantalla debe haber
scrollbars

-Deben estar habilitadas las teclas Up, Down, Av Pag, Re Pag, PgUp y PgDn 

-Verificar funciondes de “agregar/eliminar” datos a visualizar.

-Verificar funciones de ordenamiento. (odernamientos combinados) 

-Verificar la funcion de actualizacion del resultado de la búsqueda (Refresh).

### 11- Grabación, modificación o eliminación: (ABM)

1. Verificar grabación:

-Control de duplicados. Verificar alta de registros existentes

-Verificar la consistencia de los mensajes durante el proceso de alta. i.

-Debe solicitar la confirmación de la operación ii. Si se acepta la operación podría (opcional) informar el resultado iii. Si se cancela la operación debe regresar a la pantalla sin borrar los datos ingresados y habilitar la edición de los mismos

-Verificar el correcto impacto de datos en la base

2. Verificar modificación:

-Verificar modificación por registro ya existente (no debe permitirlo)

-Debe solicitar la confirmación de la operación

-Si se acepta la operación podría (opcional) informar el resultado

-Si se cancela la operación debe regresar a la pantalla sin borrar los datos ingresados y habilitar la edición de los mismos

3. Verificar eliminación:

-Debe solicitar la confirmación de la operación

-Si se acepta la operación podría (opcional) informar el resultado

-Si se cancela la operación debe regresar a la pantalla desde la cual se seleccionó el registro a eliminar

4. Verificar reglas de negocio para eliminación o modificación:

-Verificar obligatoriedad del campo motivo de baja (si lo solicitara)

-Verificar restricciones de negocio para eliminación o modificación (si hubiera)

### 12- Botones standard:

(Completar según funcionalidad de botonera en el sistema al cual se aplique)

### 13- Filtros o búsquedas:

1. Verificar funcionalidad filtro:

-Debe desplegar criterios de filtro disponibles

-Si posee criterios combinables se debe poder seleccionar uno, algunos o todos 

-Se debe poder especificar la prioridad de los filtros (según 1, luego 2, etc.) 

-Al confirmar el filtro debe acotar el lote según criterios seleccionados 

-Debe ser posible quitar todos los filtros o modificar criterios seleccionados

2. Validar filtro (según sea aplicable):


-Ingresar condiciones de búsqueda erróneas

-Ingresar condiciones de búsqueda inexistentes

-Realizar combinaciones de filtro inválidas

3. Verificar funcionalidad búsquedas:

-Debe desplegar criterios de búsqueda disponibles

-Debería ser capaz de tratar las búsquedas con comodines (% ó *)

-Si posee criterios combinables se debe poder buscar por uno, algunos o todos 

-Debería contar con opciones de agrupamiento (tipo ‘group by’ de sql) 

-Debería operar con operadores lógicos y relacionales

-Debería informar al usuario si la consulta no encontrara coincidencias

4. Validar búsquedas:

-Buscar caracteres inválidos (letras en un campo solo numérico por ejemplo) 

-Ingresar solo comodines (%), debe traer todos, idem sin criterio

-Combinar varios comodines (J%, Ju%n, Juan%, etc.)

-Generar criterios inválidos o ilógicos

### 14- Pantalla:

1. Verificar navegabilidad:

-Si la transacción pasara por varias pantallas la navegación debería estar orientada al negocio y a la facilidad de operación

-Verificar en todas las pantallas el “camino” próximo y anterior, debe poder regresar a la pantalla anterior, continúar con la siguiente, finalizar (cancelar) la transacción o confirmarla si se tratara de la última pantalla

-No deben surgir pantallas que no pertenezcan a la transacción tratada 

-Debe poder regresar normalmente de una pantalla de búsqueda o consulta, esto es, regresar al punto desde el cual se la invocara

-Si una pantalla de búsqueda o consulta tuviera opción de selección, el dato debería ingresar en el campo requerido, generalmente el campo desde el cual se la invocara

-Al regresar a las pantallas anteriores deben desplegarse los datos ya ingresados, no deberían eliminarse los datos de una pantalla al regresar a ella 

-Debe ser posible cancelar la transacción desde cualquier pantalla (inicial, intermedias, o final)

-Debe ser posible modificar cualquier dato de cualquier pantalla hasta la confirmación de la transacción (grabación)

2. Verificar orden de tabulación:

-Al presionar TAB debe ser posible navegar entre los objetos de la pantalla (tabular)

-La tabulación debe ser lógica, por ejemplo, sería incorrecto que al presionar TAB en el primer campo, situe el foco en el botón de confirmación cuando aún existen datos que completar, eleccionar, etc.

-La tabulación en cada pantalla y entre pantallas debe responder a la necesidad del negocio y/o comodidad del usuario

-Debe ser posible tabular en forma inversa con la combinación de teclas SHIFT+TAB, dicha tabulación inversa debe realizarla en el mismo orden hacia atrás, es decir, respetando la tabulación normal (hacia delante)

3. Verificar stándares de diseño de pantallas (si aplica):

-La disposición, cosmética y ordenamiento de los objetos en la pantalla, así como el orden de tabulación y la navegabilidad deben ajustarse al diseño standard definido para la aplicación que se testea 

### 15- Shortcuts (accesos directos):

1. Verificar shortcuts:

-Verificar la funcionalidad de todos los shortcuts desarrollados para la/s pantalla/s tratada/s, por ejemplo, si el botón Confirmar tuviera subrayada la C (Confirmar) implicará que es posible confirmar con la combinación de teclas ALT+C

-Verificar la funcionalidad de todos los shortcuts definidos para la selección deopciones de menú, generalmente, ALT+(letras)

### 16- Ayuda en línea:

1. Verificar cada acceso a información relevante de uso y/o guía informativa para el usuario
de las pantallas :

● Información Contenida

● Relación con el detalle

● Posibilidad de volver a la pantalla anterior

● Links a contenidos complementarios


---
