# :star: RESULTADOS DE UNA PRUEBA

---

## :book: TEMAS

- Informes de Resultados de un Test Case

- ¿ Es un defecto? ¿ Es una falla? ¿ Es un Error?

- Entrevista a un QA

- Clase 4 en vivo. Bases de Datos y revisión en Testing Manual

---

## :star: 1 - Informes de Resultados de un Test Case

### ¿Como informar el resultado de un caso de prueba?

Me copio tal cual el **Caso de prueba**, borro algunas cosas y dejo:

- Nro.

- datos de entrada

- resultado esperado


Agrego una nueva columna con **Resultado**, el lo pone con fondo verde y le escribe Ok. Si el resultado hubiera fallado, entonces le pone fondo rojo, le escribe NO PASO y en **resultado obtenido** aclara que es lo que falló. 

En el caso del test que falló se devuelve, los devs vuelven a trabajar para solucionarlo, y luego nos va a volver como otro nuevo test case a ejecutar, a estos se los llama **test de regresión**.  Por eso es importante que lso test case sean **re utilizables**

Se puede agregar un video de la pantalla con le paso a paso de la prueba, o agregar imagen.


-> saco: pre condición, ruta de navegación, requerimiento.

-> Hay empresas que tiene sus sistemas para volcar los test cases.

---

## :star: 2 - ¿ Es un defecto? ¿ Es una falla? ¿ Es un Error?

Para algunos conceptos, nada mejor que un ejemplo

### Error – Defecto – Falla.

Te lo explico con una calculadora

**Error**, se refiere a la diferencia entre la salida actual de un software y la correcta. También puede ser una acción que introduce en el software un defecto o falla .

Por ejemplo, al hacer: 2+2 = 5

![image](https://user-images.githubusercontent.com/72580574/220203596-8f71ffa2-59bb-46d8-9b05-e0310f702803.png)


**Defecto**, es una condición que causa que un software falle al realizar una función requerida (muchas veces usado como sinónimo de bug).

Por ejemplo, al hacer: 2+2 = arroja un error

![image](https://user-images.githubusercontent.com/72580574/220203642-41233bda-c83c-44d1-9c08-6d893dc3c569.png)


---

## :star: 3 - Entrevista a un QA

- ¿Cuáles son los principales retos de las pruebas de software?

Poder asegurar lo más temprano posible la calidad de loq eu uno está entregando.

El 55% de defectos se introducen en los requerimientos.

Es mucho más alto encontrar el error ya en producción, es ,ejor hacerlo en la etapa de los **requerimientos**

- ¿Qué buenas prácticas de testing considera que deben adoptar las organizaciones?

Abordar el testing desde los requerimientos, desde el comienzo. Cuando el usuario se quiere asegurar la calidad del producto: 

-que el software tenga lo que queria  (que el software le sirva al usuario)

-que lo que haga el software lo haga bien(sea robusto)

El tester **Valida los requerimientos**, con sus test cases puede encontrar los huecos en los requerimientos, y le avisa a los desarrolladores apra que lo mejore, a los usuarios para tener la aceptacion de usuario más fácil y rápida.

- ¿Qué recomendaciones puede dar sobre el diseño de pruebas?

Tratar de hacer casos de prueba lo más objetivo, pequeño, autocontenido, que permita a cualquier persona entender que se está probando. Que solo tenga un punto de verificación(id, objetivo a probar, priorización, resultado esperado con los puntos de verificación(2 o 3 máximo), etc).

- ¿Qué retos pueden resolver a través de herramientas o automatización de pruebas?

-GESTION DE LA PRUEBA: desarrolla los casos de prueba y reporta los defectos.

-AUTOMATIZACION DE PRUEBAS / ROBOTS: ayudan a hacer regresiones automáticas, para cuando un software entra en mantenimiento. Es un script de prueba, se debe ejecutar aal menos 12 veces para amortizar su costo

-HERRAMIENTAS DE STRESS TEST: medir la performance de algunas transacciones del software, para hacer concurrencia o pruebas de volumen y estress. Poder probar los requerimientos no funcionales dle software.

- ¿Además del conocimeinto técnico para la ejecución de pruebas, que otros conocimientos son necesarios para armar un área de pruebas?

-GESTION Y METODOLOGIA DE PRUEBAS: como es la gestion hacia adentro del testing factory y tambien hacia afuera

-SKILLS FUNCIONALES:   que conozcan del negocio y de la aplicación como el analista funcional.

-SKILL TECNICO: un desarrolaldor aplicando su conocimeinto para hacer pruebas.

-PRUEBAS DE ESTRESS TEST: debe tener el conocimeinto de un arquitecto, apra encontrar el cuello de botella

- ¿Pueden las pruebas garantizar el cumplimeinto de los objetivos de negocio?¿Cómo?

Un codigo de mala calidad pierde la confianza dle usuario y o siguen con los sistemas obsoletos(pierden en mercado) o tiene tanta desconfianza que tardan tanto en testear que cuando se utiliza ya es viejo.

Buscar defectos dentro del software ayuda en proyectos con presupuestos acotados, ayuda a bajar costos.

- ¿Cuál es el perfil de una persona encargada del área de testing?

-Fuerte PERFIL DE GESTION, un PM orientado a control y calidad de software

-ANALISTA de QA, perfil similar a un analista funcional. Debe ser creativo para pensar como probar el software y destructivo para asegurarnos que el software no haga lo que no debe hacer.

- TECNICOS que sepan de arquitectura y programar, para las pruebas de estress y automatización.

-Para los que recién comienzan que sea METODOLOGICO, BUENA CONCENTRACION, que siga la ejecución y ENCUENTRE DEFECTOS, poder determinar cuando el resultado esperado es distinto la resultado obtenido.

---

## :star: 4 - Clase 4 en vivo. Bases de Datos y revisión en Testing Manual

Relación conceptual, vemos a la base de datos, como una lanilla de excell, que tiene las columnas y las filas.

En la *base de datos** los **datos** se cargan en **tablas**.

Se va definiendo el tio de datos que guarda en cada columno, por ejemplo antes en CP era de Numeros Enteros y ahora es VARCHAR, ya que tiene numeros y letras. Otra cosa que varía es la cantida de caracteres.

EN la CAJA BLANCA se hace consultas a la base de datos, asi se ve si algo eliminado efectivamente se limino de la base de datos.

- **BASE DE DATOS RELACIONAL SQL**: son la de las tablas, **SQL**, **MySQL**, **MariaDB**, **Postgress**, **SQLServer**. Tienen una estructura rìgida, se guardan en tablas. Se usan para bancos, sistema de sueldos, de stock.

- **BASE DE DATOS NO RELACIONALES NOSQL**: son las de documentos, como **MongoDB**, no tienen una estructura rígida, se pueden guardar distintos datos. Son más lentas.

Muestra con BASE DE DATOS RELACIONAL en HOSTINGER, que tiene la opción de CREAR UNA BASE DE DATOS. Va a crear en PHPMyAdmin.

![image](https://user-images.githubusercontent.com/72580574/221376753-dd4a82c8-336d-4901-9830-3672d2aa3c18.png)

-> Nueva -> creo la tabla:

![image](https://user-images.githubusercontent.com/72580574/221376794-2c8c7647-89dc-4b24-8ccf-631cb3c9a536.png)

Completo...


... nombre de la tabla

... cada renglon sera una columna de la tabla, en general la primera es : **id**(el identificador numérico de cada fila).

-> En tl tipo va el TIPO de dato: INT(entero), VARCHAR(String), TEXT, DATE

-> En longitudValores: hay que ver bien que numero ponerle, no es bueno ocupar mucho espacio, es mejor poner la cantidad que se va a necesita no demás. Por ejemplo si tengo **Edad** es un **INT** y le pongo 3 ya que mucho más de 100 no voy a tener.

-> Si le hago click en **guardar** me crea la tabla:

![image](https://user-images.githubusercontent.com/72580574/221376940-9f77004b-b525-4b0b-9b4f-e12af0c931ef.png)


-> En **EXAMINAR** veo la información de la tabla, y en este lado le puedo **insertar datos**, le voy a ir creando los registros


![image](https://user-images.githubusercontent.com/72580574/221376981-70d25495-f070-4415-b9e4-41e791924f8b.png)

Si ahora voy de nuevo en examinar veo los datos, entonces por ejemplo si doy de alto a un nuevo usuario, lo testeo y luego lo veo aca en al base de datos. Asi me aseguro que se guarda todo bien, no se cortan datos. Siempre se trabaja en un **ambiente de testing**, no se modifica en el **ambiente productivo**.


Uno de los est más importantes es ver que tengo en el sistema, que me permite y la base de datos, si tnego un maximo de caracteres, deben coincidir.

**PK** -> Primary Key(Clave primaria), por que se me va a ir ordenando.

- En la parte gráfica, arriba tengo como sería la consulta SQL:

![image](https://user-images.githubusercontent.com/72580574/221377555-45e40aba-ab7f-41bd-a102-985341a40aec.png)

![image](https://user-images.githubusercontent.com/72580574/221377570-e704e130-08a9-4b8a-b74d-940e78ebdeb8.png)


---
