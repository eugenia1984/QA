# :star: ENCUENTRO 4 / 20 - Clasificación de pruebas

---

## :star: Introducción

## ⏰ 10 minutos

**¡Te damos la bienvenida a tu cuarto encuentro de trabajo!**

Seguramente conoces la dinámica de trabajo, es aquella que te permite presentarte y conocer gente increíble. Juntos construyen una gran red de profesionales dispuestos a colaborar.

Al finalizar, brinda tus pulsos a quien haya colaborado con tu aprendizaje individual y grupal. También puedes recibir tus pulsos guiando y acompañando a tus compañeros de equipo.  ¡Adelante!

**¡Demos comienzo a la actividad del día de hoy!**

## Presentación del equipo:

Toma tan solo unos minutos y cambia la experiencia de todo el equipo. Indica tu nombre y de dónde vienes. Les dejamos una pregunta para abrir la sesión:

## ¿Por qué el área de QA está creciendo velozmente? 

Utilicen unos 10 minutos para compartir estas breves presentaciones. 
¿Opinan todos de la misma manera?


---

## :book: MATERIAL DE LECTURA

## Nivel de pruebas
Las pruebas se clasifican en niveles de acuerdo a la complejidad o al  desarrollo o que se desean cubrir. Implementar pruebas - desde niveles básicos (componentes pequeños en el código) hasta los niveles altos 
(implementación de un sistema) tiene por objeto prevenir el arrastre de los defectos.

Los niveles típicos son:

- Pruebas unitarias o de componentes (unit testing / component testing)

- Pruebas de integración (integration testing)

- Pruebas de sistema (system testing)

- Pruebas de aceptación (acceptance testing)

Veamos cada uno en profundidad.

1. :star: **Pruebas unitarias o de componentes (unit testing / component testing)**

Este tipo de pruebas suelen ser creadas por los desarrolladores en paralelo con el desarrollo del código para la funcionalidad en la que se esté trabajando en ese momento.
Las pruebas unitarias tienen como objetivo verificar que un componente o unidad específica dentro del código, funcione de manera correcta. 

El componente bajo test puede ser tanto funcional como no funcional.
 
Una prueba unitaria podría crearse para validar que cierto método específico en el código devuelve un valor “X”. 

Los insumo para las pruebas unitarias son: 
-el detalle del diseño
-las especificaciones del componente bajo prueba (en caso de que existan)
-el mismo código escrito. 

En general este tipo de pruebas se automatizan y conforman luego,  las pruebas de regresión. 

2. :star: **Pruebas de integración (integration testing^^

Este tipo de pruebas son creadas por los desarrolladores con foco en probar las interfaces y la interacción e integración entre los distintos componentes del sistema. 

Las pruebas de integración se podrían clasificar en:

- Pruebas de integración de componentes (component integration testing): son aquellas pruebas de interacciones e interfaces entre componentes integrados.

- Pruebas de integración de sistema (system integration testing): son aquellas pruebas de interacciones e interfaces entre sistemas, paquetes, microservicios y con sistemas externos.
 
En este nivel los objetos de prueba podrían ser: subsistemas, bases de datos, infraestructura, interfaces, APIs (application program interfaces) y microservicios. 

Estas pruebas también se automatizan y se agregan a las pruebas de regresión.

