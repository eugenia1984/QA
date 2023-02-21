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


En esta clase vemos como medir el rendimiento y la capacidad de respuesta de una página web. Instalación de JAVA + JMeter para hacer pruebas de performance - fuerza - stress en una página web

- **Pruebas de fuerza y estress**: utilizadas para BASE DE DATOS y en PÁGINAS WEBS.


:computer: Links útiles

1.[{Anotaciones, servidores, usuarios y claves de lo visto en la clase](https://docs.google.com/document/d/1Gvef4I9CTXyrwdDvRnyDI3zN8VLqv440xS3at3VNRCM/edit?usp=share_link)

### Páginas a Testear:

1- km44.com.ar

2- km44server.com.ar


### Instalaciones:

#### JAVA
1- Probar si tengo instalado JAVA.

En CMD, probar con: ```java –version```

Descargar de: https://www.java.com/es/download/

#### JMeter

descargar de: https://jmeter.apache.org/download_jmeter.cgi


#### Base de Datos

https://auth-db645.hstgr.io/   

- **Estructuradas**: MySQL / MariaDB / Postgre / Oracle / Microsoft SQL Server / Access

- **NoSQL** :  MongoDB / DynamoDB / 

```
Usuario: u770586196_testing
Clave: Testing2022
```

### Servidor:

MySql: http://190.114.255.191/phpmyadmin

Usuario: testing

Clave: institutoweb


2. [Archivo de la Prueba de Performance de una página web en JMeter](https://drive.google.com/file/d/1E1fdTBY44z9T1K1oWVQJIhmQYygc2K9z/view?usp=share_link)

```XML
<?xml version="1.0" encoding="UTF-8"?>
<jmeterTestPlan version="1.2" properties="5.0" jmeter="5.5">
  <hashTree>
    <TestPlan guiclass="TestPlanGui" testclass="TestPlan" testname="Plan de Pruebas" enabled="true">
      <stringProp name="TestPlan.comments"></stringProp>
      <boolProp name="TestPlan.functional_mode">false</boolProp>
      <boolProp name="TestPlan.tearDown_on_shutdown">true</boolProp>
      <boolProp name="TestPlan.serialize_threadgroups">false</boolProp>
      <elementProp name="TestPlan.user_defined_variables" elementType="Arguments" guiclass="ArgumentsPanel" testclass="Arguments" testname="Variables definidas por el Usuario" enabled="true">
        <collectionProp name="Arguments.arguments"/>
      </elementProp>
      <stringProp name="TestPlan.user_define_classpath"></stringProp>
    </TestPlan>
    <hashTree>
      <JDBCDataSource guiclass="TestBeanGUI" testclass="JDBCDataSource" testname="Configuración de la Conexión JDBC" enabled="true">
        <boolProp name="autocommit">true</boolProp>
        <stringProp name="checkQuery"></stringProp>
        <stringProp name="connectionAge">5000</stringProp>
        <stringProp name="connectionProperties"></stringProp>
        <stringProp name="dataSource">OpenCloud</stringProp>
        <stringProp name="dbUrl">jdbc:mysql://190.114.255.191:3306/testing?characterEncoding=utf8</stringProp>
        <stringProp name="driver">com.mysql.jdbc.Driver</stringProp>
        <stringProp name="initQuery"></stringProp>
        <boolProp name="keepAlive">true</boolProp>
        <stringProp name="password">institutoweb</stringProp>
        <stringProp name="poolMax">0</stringProp>
        <boolProp name="preinit">false</boolProp>
        <stringProp name="timeout">10000</stringProp>
        <stringProp name="transactionIsolation">DEFAULT</stringProp>
        <stringProp name="trimInterval">60000</stringProp>
        <stringProp name="username">testing</stringProp>
      </JDBCDataSource>
      <hashTree/>
      <ThreadGroup guiclass="ThreadGroupGui" testclass="ThreadGroup" testname="Grupo de Hilos" enabled="true">
        <stringProp name="ThreadGroup.on_sample_error">continue</stringProp>
        <elementProp name="ThreadGroup.main_controller" elementType="LoopController" guiclass="LoopControlPanel" testclass="LoopController" testname="Controlador Bucle" enabled="true">
          <boolProp name="LoopController.continue_forever">false</boolProp>
          <stringProp name="LoopController.loops">1</stringProp>
        </elementProp>
        <stringProp name="ThreadGroup.num_threads">1</stringProp>
        <stringProp name="ThreadGroup.ramp_time">1</stringProp>
        <boolProp name="ThreadGroup.scheduler">false</boolProp>
        <stringProp name="ThreadGroup.duration"></stringProp>
        <stringProp name="ThreadGroup.delay"></stringProp>
        <boolProp name="ThreadGroup.same_user_on_next_iteration">true</boolProp>
      </ThreadGroup>
      <hashTree>
        <JDBCSampler guiclass="TestBeanGUI" testclass="JDBCSampler" testname="Petición JDBC" enabled="true">
          <stringProp name="dataSource">OpenCloud</stringProp>
          <stringProp name="query">select * from personas</stringProp>
          <stringProp name="queryArguments"></stringProp>
          <stringProp name="queryArgumentsTypes"></stringProp>
          <stringProp name="queryTimeout"></stringProp>
          <stringProp name="queryType">Select Statement</stringProp>
          <stringProp name="resultSetHandler">Store as String</stringProp>
          <stringProp name="resultSetMaxRows"></stringProp>
          <stringProp name="resultVariable"></stringProp>
          <stringProp name="variableNames"></stringProp>
        </JDBCSampler>
        <hashTree/>
      </hashTree>
      <ResultCollector guiclass="ViewResultsFullVisualizer" testclass="ResultCollector" testname="Ver Árbol de Resultados" enabled="true">
        <boolProp name="ResultCollector.error_logging">false</boolProp>
        <objProp>
          <name>saveConfig</name>
          <value class="SampleSaveConfiguration">
            <time>true</time>
            <latency>true</latency>
            <timestamp>true</timestamp>
            <success>true</success>
            <label>true</label>
            <code>true</code>
            <message>true</message>
            <threadName>true</threadName>
            <dataType>true</dataType>
            <encoding>false</encoding>
            <assertions>true</assertions>
            <subresults>true</subresults>
            <responseData>false</responseData>
            <samplerData>false</samplerData>
            <xml>false</xml>
            <fieldNames>true</fieldNames>
            <responseHeaders>false</responseHeaders>
            <requestHeaders>false</requestHeaders>
            <responseDataOnError>false</responseDataOnError>
            <saveAssertionResultsFailureMessage>true</saveAssertionResultsFailureMessage>
            <assertionsResultsToSave>0</assertionsResultsToSave>
            <bytes>true</bytes>
            <sentBytes>true</sentBytes>
            <url>true</url>
            <threadCounts>true</threadCounts>
            <idleTime>true</idleTime>
            <connectTime>true</connectTime>
          </value>
        </objProp>
        <stringProp name="filename"></stringProp>
      </ResultCollector>
      <hashTree/>
      <ResultCollector guiclass="SummaryReport" testclass="ResultCollector" testname="Reporte resumen" enabled="true">
        <boolProp name="ResultCollector.error_logging">false</boolProp>
        <objProp>
          <name>saveConfig</name>
          <value class="SampleSaveConfiguration">
            <time>true</time>
            <latency>true</latency>
            <timestamp>true</timestamp>
            <success>true</success>
            <label>true</label>
            <code>true</code>
            <message>true</message>
            <threadName>true</threadName>
            <dataType>true</dataType>
            <encoding>false</encoding>
            <assertions>true</assertions>
            <subresults>true</subresults>
            <responseData>false</responseData>
            <samplerData>false</samplerData>
            <xml>false</xml>
            <fieldNames>true</fieldNames>
            <responseHeaders>false</responseHeaders>
            <requestHeaders>false</requestHeaders>
            <responseDataOnError>false</responseDataOnError>
            <saveAssertionResultsFailureMessage>true</saveAssertionResultsFailureMessage>
            <assertionsResultsToSave>0</assertionsResultsToSave>
            <bytes>true</bytes>
            <sentBytes>true</sentBytes>
            <url>true</url>
            <threadCounts>true</threadCounts>
            <idleTime>true</idleTime>
            <connectTime>true</connectTime>
          </value>
        </objProp>
        <stringProp name="filename"></stringProp>
      </ResultCollector>
      <hashTree/>
    </hashTree>
  </hashTree>
</jmeterTestPlan>
```

3. [Driver de Conexión a la base de datos MySql desde JMeter](https://drive.google.com/file/d/1CZF3WZr9bb7z_mvW5o8X83DqzMcI-kru/view?usp=share_link)


4. [Archivo de la Prueba JMeter Performance y Stress en Bases de Datos](https://drive.google.com/file/d/1M3DZSRetuTYG9pTff7h_MuTCq2NjMIro/view?usp=share_link)


---
