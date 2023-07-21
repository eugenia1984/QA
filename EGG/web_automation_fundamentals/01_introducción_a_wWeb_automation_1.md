# ¡Hola! 👋

Te damos la bienvenida al módulo de **Automation Testing**, un espacio de aprendizaje **co-creado con Globant**, líder en la industria digital. Este módulo te proporcionará un profundo conocimiento de las pruebas automatizadas, esencial en el ciclo de vida de desarrollo del software.

Aprovecha esta oportunidad de aprender directamente de los líderes en el campo, mejorando tus habilidades y elevando tu perfil profesional. La colaboración con Globant no solo garantiza la relevancia y actualidad de los contenidos, sino que también ofrece prácticas reales de la industria, mejorando tus oportunidades de trabajo en el ámbito tecnológico.

¿Comenzamos? 💪

---

## :computer: Objetivos del encuentro


- El objetivo de este encuentro es discutir los puntos clave relacionados con la automatización de pruebas y establecer criterios claros para determinar cuándo es una buena idea automatizar y cuándo no.

- Se abordará la importancia de establecer objetivos claros para los casos de prueba manuales y automatizados, y cómo cada enfoque puede contribuir a la calidad del software.


En nuestro desafío, compuesto por 3 partes, **veremos cómo generar casos de pruebas, los entornos en los que sucederán y qué partes deberán ser automatizadas y cuáles no**.


- Verás que los ejercicios están marcados como **fundamentales** y **perfeccionamiento**. Concéntrate en lograr la resolución de los fundamentales para asegurar la comprensión de los conceptos abordados. Una vez completos, puedes abordar los de perfeccionamiento.

---

## :computer: Debate I

💬 A partir del siguiente video, en sus mesas, discutan los siguientes tópicos: [:tv: ver video](https://youtu.be/tHQsf-XcNjk)



👉 1. ¿Cuándo es un buen momento automatizar una prueba?


👉 2. ¿Cuándo es preferible testear de forma manual?


👉 3. ¿Cuáles son las ventajas y desventajas de testear manualmente?


👉 4. Tomen el ejemplo de una plataforma que todos en el grupo conozcan (Netflix, Spotify, etc.). Piensen lo siguiente: ¿qué funciones creen que son automatizadas y cuáles manuales?


---

### Transcripción del video


Hola a todos! Bienvenidos voy a introducirlos en la **automatización de pruebas**, en este curso vamos a ver todas las bases que vas a necesitar para empezar a trabajar en automatización.

En este módulo vamos a trabajar con:

- ¿qué son las pruebas de automatización?

- ¿cuándo utilizar las pruebas de automatización?

- ¿cuál es la diferencia entre manual y automatización?

Así que vamos a empezar a trabajar sobre **¿qué son las pruebas de automatización?**. En una etapa de desarrollo necesitamos averiguar si el software es correcto, si funciona como se espera, es con los criterios de aceptación que lo que hacemos es simular esas interacciones de usuario que un manual, por ejemplo:

- si necesitamos hacer clic en un botón

- si necesitamos ver si un texto está presente

- otro tipo de elemento como seleccionar desplegables

- podemos desplazarnos en la aplicación

Así que eso es lo que hacemos en estos navegadores, por ejemplo Chorem, Safari, Opera, o Cromiun, simulamos todas esas acciones dentro de ese navegador así que es importante
decir que la automatización no reemplaza las pruebas manuales, porque es importante que sepamos que el alcance de automatización no es siempre el mismo que tenemos en las pruebas manuales ejemplo, si tenemos 10 casos de prueba automatizados que no es el alcance completo para nuestra aplicacion asi que podemos encontrar errores en automatizacion pero tambien podemos encontrarlos en en las pruebas manuales.

La idea cuando automatizamos es que los manuales pueden aplicar sus esfuerzo haciendo otra prueba extensiva casos o pruebas por ejemplo exploratorias, pruebas de casos extremos, no tienen que preocuparse por el humo o la regresiones cuando están probando porque esa parte estará automatizada con el equipo de automatización.

Otra cosa es la idea de automatización, es cuando tenemos grandes aplicaciones, si tenemos miles de casos no será más fácil para los manuales ejecutar todos esos casos de prueba asi que en automatizacion simplemente pulsamos ejecutar y el manuales pueden dedicar su tiempo a seguir haciendo otro tipo de pruebas.

Es importante tener automatización en nuestro equipo y dar tiempo a los manuales para revisar las aplicación de otra manera sin pasar demasiado tiempo en el humo o la regresión o el más importante es casos.

¿Cuando es una buena idea automatizar? Cuando estamos aplicando automatización es importante saber qué tipo de casos deberíamos hacer, por ejemplo: la aplicación ya es estable tiene la etapa de desarrollo y es ya la característica se ha hecho hasta algún punto no va a ser perfecta nosotros pero es estable.

Para al menos las pruebas STAR con automatización que somos no sabemos que esa aplicación no va a cambiar
cada dos días cada día o cada semana
va a tener pequeños cambios o
mejoras en ella cuando tengamos un conjunto de
casos de prueba
hay casos de prueba que fueron creados
y sólo se ejecutaron una vez para evitar
esos casos de prueba que tenemos que automatizar
esos casos de prueba que tenemos que ejecutar
cada vez que vamos a

para hacer una versión
los casos de prueba que hay que ejecutar en
ese tiempo
son los casos de prueba que queremos
automatizar
um otros casos de prueba que deberiamos
cargador hecho es cuando tenemos múltiples
datos por ejemplo estamos probando uh login
un login fallido tenemos tres tipos de
emails incorrectos
y eso será uh
tedioso
um prueba porque tienes que añadir conjunto que
datos una y otra vez con
automatización sólo tienes que pasar todos los datos
que necesites y se ejecutará
automáticamente y tendrás el mismo
resultados de ejecución
um cuando estamos uh conectando con
bases de datos AWS Services
servicios externos o información al
sistema
también una prueba de estrés o de carga que es
prueba de rendimiento
esos son los casos de prueba que es un
buena idea automatizar para tener en nuestro
alcance
y cuando tenemos varios entornos
imaginemos que tenemos
fase de desarrollo QA demo uat producción
y tenemos que ejecutar cien pruebas
en cada uno de esos entornos
nos llevará mucho tiempo intentar
ejecutar esos casos de prueba en todos esos
entornos, así que en automatización
hacemos clic en ejecutar en QA en el escenario en uit y
que tendrá los mismos resultados o
podemos pulgar errores que también es una buena
oportunidad de encontrar errores
es una buena idea automatizar
um como puedes ver tenemos
um un alcance muy grande así que podemos empezar
a priorizar qué deberíamos empezar y
eso es parte del plan de automatización así que no
preocuparse por eso
así que uno no es una buena idea para automatizar

por ejemplo cuando hacemos usabilidad
pruebas, por ejemplo
que este casos haga clic 100 veces cientos
de veces en el botón clic clic clic
clic clic clic clic eso no es buena idea
que podría romper la automatización completa y
no tendrás el resultado que esperas.
que estás esperando así que esos casos de uso es
mejor atenerse a los manuales
um hay casos que sólo se ejecutarán
una vez
como te decía la automatización es para
esos casos de prueba que tienes que ejecutar
una y otra vez si tenemos
un caso de prueba que sólo tenemos que ejecutarlo
una vez al año
para eso es mejor tener el manual
manual y no perder el tiempo.
haciendo algo que no va a ser
necesario con frecuencia
aplicaciones inestables asi que
si tengo una aplicación que es
se cambia todos los días va a ser
difícil de automatizar y aún más difícil de
mantener así que tengo que hacer un refactor
hoy y mañana y pasado
semana porque tienen que mantener
cambiando todo dentro de él
y por último, pero no mejor, tenemos
esos casos de disco que cambian el resultado
así que tengo en este caso que
la primera vez me tira
un resultado pero luego lo vuelvo a ejecutar y me
obtuve un resultado diferente y luego lo ejecuto
otra vez tengo un resultado diferente y el
aplicación debería devolver ese tipo de
resultados diferentes así que es muy difícil
controlar y manejar este tipo de pruebas
por lo que no es buena idea
automatizar esos casos y ahora estamos
vamos a pasar con un manual versus
pruebas automatizadas
No estoy diciendo que no debamos tener

uno u otro probador de mamíferos y
testers de automatización tiene su propio objetivo
lograr en el proyecto asi que
no tengas solo uno en tu equipo intenta
tener ambos
es importante saber que el
beneficios de la automatización son a largo plazo
no verás esos beneficios de inmediato
porque lleva tiempo automatizar
tener una buena cobertura en tu ámbito pero
una vez que la tengas, verás los
diferencia en el cambio de tiempo y
y empezarás a tener el retorno de
de la inversión.
um manual versus automatizado manual
prueba
el éxito de eso
resultado del caso de prueba
depende de lo experto que sea
manual porque si tenemos un junior que
Junior Mayo
olvida algunas cosas puede que no uh
ejecutadas como se supone que deben ser ejecutadas
o no conoce el negocio para ejecutar
correctamente
pero la automatizacion no depende de
ejecutor si tienes un buen caso de prueba a
bien estructurado este caso con todos los
aserciones que necesitas todas las
información los pasos bien estructurados
que este caso no tenga huecos
en él debería tener
um siempre el mismo resultado
en manual es difícil documentarte
tienes que grabar la pantalla obtener capturas de pantalla
uploaded to the
a la donde la prueba uh
es una tienda por ejemplo asi que
este
añade más tiempo al proceso de ejecución
la documentación
en lugar de automatización es
autodocumentada porque si la ejecutas
y tienes logs en este caso en
tu ejecución verás lo que está pasando
en esos registros se pueden subir a
el caso de prueba uh
normalmente tenemos

herramientas de informes donde se puede ver lo que
lo que estaba pasando se puede ver un
capturas de pantalla videos si tiene para
ejemplo con una forma de dispositivo tan
ya estará documentado y podrás
tendrá que hacer un extra
para tener eso en tu caso de prueba en para
ejemplo si no lo tienes si escuchaste tu
casos de prueba en jira en X rail
lo tendrás ahí
nuestro manual es difícil de mantener actualizado
estos casos porque si los desarrolladores
cambian el título y solías decir ve
a la página dashboarder y el
dashboard no se llama dashboard
ya es como la página de inicio tienes que
cambiar eso
pero en automatización es Auto actualizado
porque
usted no está recibiendo los elementos por el
texto sino por un localizador
por otro identificador así que no necesitarás
cambiar esa parte y sigue yendo
ejecutar obviamente tenemos que hacer algunos
refactorizaciones cuando
algo cambie dentro del
página pero seguirás teniendo el
ejecución y se seguirá ejecutando manualmente
testing es más lento es tedioso porque
por ejemplo haciendo un login
e ir a alguna parte te puede llevar
manualmente un minuto
genial perfecto
ese es un caso de prueba el más pequeño
la automatización es super rápida porque
la automatización puede llevar cinco segundos
el mismo proceso que el manual
un minuto
y si
multiplicas ese tiempo
obtendrás mucho tiempo en manual a
manual puede tardar tres días ejecutando cualquier
humo o regresión cuando la automatización puede
tardar 30 minutos
así que
es más rápida
un manual no es reutilizable una vez

ejecute su caso de prueba cargue su
pruebas uh todo lo que este caso
mejor no puedes reutilizarlo si tienes
ejecutarlo de nuevo solo tienes que hacer
todo ese trabajo de nuevo
subir paso a paso haciendo todo
en lugar de la automatización que acabo de hacer clic
reintentar y ya está que este caso
se ejecuta de nuevo
así que esos son los
los beneficios la diferencia entre ellos
No digo que manualmente no sea importante
lo manual es muy importante para el proceso
pueden dedicar su tiempo a hacer otra
que la automatización no puede hacer
o es
demasiado esfuerzo
y eso es todo gracias esto esto es
todo para el módulo para el
introducción hasta la próxima
