# :star2: ENCUENTRO 6 / 17

---

![image](https://user-images.githubusercontent.com/72580574/215346170-fc77bea8-f403-449d-9ff7-804bd6e28225.png)

---
# :star: INTRODUCCION (5min)

**¡Te damos la bienvenida a tu primer ejercicio integrador!**

**Check de 1 minuto**: ¿Cómo llegas al encuentro de hoy? Ya se cumple una semana desde tu inicio. ¡Estás cerca de cumplir con un tercio del programa de Introducción! El 80% de las personas que llegan hasta hoy completan el programa, así que estamos seguros de que serás parte de nuestros próximos graduados. 

**¡Demos comienzo a la actividad del día de hoy!**

---

## PRESENTACION DEL EQUIPO (5min)

La pregunta que nos hacemos hoy: ¿Cómo realizamos un ejercicio integrador de conocimiento si contamos con las respuestas y conocimientos de nuestro equipo?
Este escenario es el más parecido al mundo profesional real. Cuando te desempeñes como tester tendrás a tu cargo una tarea. Eres responsable de lograrla, pero eso no significa que debas hacerlo sin ayuda o sin preguntar aquello que no sabes.

Hagan un acuerdo como equipo hoy sobre cómo usarán el tiempo. Nuestras sugerencias de tiempo seguirán estando presentes, para que sepan aproximadamente cuánto tiempo tienen para resolver cada desafío. Pero serán ustedes quienes definan cuándo y cómo utilizarán el tiempo individual y el tiempo en equipo. 

### ¿Objetivos?

Que cada miembro del equipo hoy pueda descubrir qué sabe y ya puede resolver en forma individual.
Que cada miembro del equipo pueda descubrir qué elementos todavía necesitan ser consolidados.

Transferir lo aprendido a situaciones novedosas. Hemos incluido -dentro de los desafíos- preguntas que exceden lo aprendido en estas sesiones. Esto es adrede y tiene como objetivo presentar casos lo más parecidos a la vida real de un tester, en la que no hay un “profesor” que solo te asigna tareas que “sabes hacer.”

¡Les deseamos un excelente y desafiante encuentro!	

---

## :star: INSTRUCCIONES PARA REALIZAR EL EJERCICIO INTEGRADOR


Si eres de las personas para quienes la sola idea de examen te trae recuerdos de la escuela o te causa emociones negativas, no te preocupes. Estamos aquí para ayudarte a cambiar eso. 

¿Cómo?

Con algunas afirmaciones para que puedas explorar:

- Las evaluaciones son una instancia para tí, en la que puedes sentir orgullo por todo lo que has aprendido.

- Puedes usar Google, a tu equipo, tus apuntes, materiales de estudio. No estamos para hacerte preguntas capciosas para ver si recuerdas ese caso que nunca ocurre. 
Estamos para desarrollar tu aprendizaje.

- Te hacemos una recomendación muy enfática: intenta resolver los desafíos en forma individual primero. La única persona que se debe preocupar por tu aprendizaje eres tú. Y eres quien puede lograrlo.

Volvemos a repetir las sugerencias para hoy (1):

- Acuerden como equipo sobre cómo usar el tiempo.

- Definan en qué momento van a reagruparse para conversar las posibles soluciones y/o para darse feedback entre ustedes.


(1) La repetición es buena. Nos ayuda a recordar. Si no, intenta cantar cualquier canción infantil que sigues recordando por el resto de tu vida. Perdón si ya la estás tarareando… :-)

---


## :star: ENTRANDO EN CALOR (25min )

Observa el siguiente esquema. Corresponde a un sistema de información de un Supermercado:

![image](https://user-images.githubusercontent.com/72580574/215346516-6c3a8973-2f55-4473-a4fd-9a84c1ec212c.png)

- (**A**) En primer lugar, identifica por qué las flechas en rojo indican datos de entrada y las azules datos de salida. Redacta o anota un breve ejemplo para cada una. Asegúrate de que el ejemplo explique el flujo de datos que has elegido. 
Aquí va un ejemplo: “El stock máximo es un dato que el administrador ingresa de antemano para regular la cantidad de unidades de cada producto que puede alojar.”

En el caso de los datos de salida, ten en cuenta los procesos que dieron origen a esos datos. 



----> FLECHAS ROJAS (Datos de entrada)

1- El stock máximo de cada producto es un dato que el administrador ingresa de antemano para regular la cantidad de unidades de cada producto que puede alojar

2- La cantidad de productos vendidos es el dato que el cajero ingresa al sistema luego de realizar una venta

3- Stock en almacenes es el dato el cual el encargado de reposición de stock ingresa al sistema para saber que cantidad hay disponible de cada producto actualmente.

4- Precio de productos es el dato que el administrador ingresa a cada producto registrado en el sistema, para poder realizar los cálculos de venta total.

5- Fecha del dia es el dato necesario para registrar las transacciones realizadas durante ese día (Compras y ventas)

6- Proveedor de cada producto son los datos que el administrador ingresa para que el encargado de reposición realice los pedidos a los proveedores correspondientes.

----> FLECHAS AZULES (Salidas)

1- Proveedores con más ventas será el resultado que se calcula luego de realizar el pedido a los proveedores.

2- Pedidos para stock será el dato que se almacena luego de realizar un pedido a un proveedor 

3- Pagos a proveedores es el dato que se calcula luego de tener todos los reportes del pago semanal.

4- Productos más vendidos es el dato que resulta de calcular con las ventas registradas de cada día, cuál fue el producto que más se vendió 

5- Productos menos vendidos es el dato que resulta de calcular con las ventas registradas de cada día, cuál fue el producto que menos se vendió 

6- Ranking de productos es el dato que resulta de calcular con las ventas registradas de cada día, el orden de los productos que más se vendieron


- (**B**) Arma un diagrama de uso utilizando UML. Puedes hacerlo utilizando alguna de estas herramientas (Excalidraw, Draw) o la herramienta que te sea más cómoda. Recuerda incluir los roles que descubras (cliente, administrador…?) 

![image](https://user-images.githubusercontent.com/72580574/215211792-cdfd9851-7b66-4108-b580-7ec55fddddc6.png)


Dentro de “Control Producto”, se realiza:

- Dar de alta un producto
- Cambiar el precio del mismo
- Eliminar un producto de la lista

Dentro de “Control Stock”, se realiza:

- Ingresar Stock Máximo

- Realizar los ajustes de Stock en almacén


#### ¡Tip para realizar este ejercicio!

Si tienes muchas dudas sobre cómo realizar el diagrama UML, abre desde Draw este documento:  
TemplateUML (Descargarlo previamente)

Y ubica los Roles y Operaciones en su lugar.


---

![image](https://user-images.githubusercontent.com/72580574/215212623-b6e57563-97bc-4085-acec-f4063250600a.png)


---

![image](https://user-images.githubusercontent.com/72580574/215212880-93e93c22-bd3b-4599-a6bd-a8d3a4a28e8f.png)

![image](https://user-images.githubusercontent.com/72580574/215212974-2a49c656-b2e3-4bef-8202-43dfdb32a0d6.png)


![image](https://user-images.githubusercontent.com/72580574/215213094-48b30174-a0a5-4ed2-bf51-7d1e83e8bbcd.png)


---

## 7 

![image](https://user-images.githubusercontent.com/72580574/215213333-da356bf3-05e8-4a57-b2c1-90cae4eb5d98.png)

---
