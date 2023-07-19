# :computer: ENCUENTRO 64

## Ejercicios Collections

---

## Ejercicio 1

Estás trabajando en un módulo de una aplicación de carreras. La aplicación tiene como objetivo registrar automáticamente a las personas que cruzan la línea de meta. Tu tarea específica es desarrollar el módulo para las carreras grupales.

En una carrera grupal, cada equipo tiene varios corredores, pero solo queremos registrar al primer corredor de cada equipo que cruce la línea de meta. Los corredores posteriores del mismo equipo no deben aparecer en el registro. El sistema te proporcionará un objeto Corredor y la Carrera que está terminando, tú debes crear el método que registra al corredor manera adecuada.

Además, se requiere una funcionalidad para descalificar equipos. Por tanto, debes desarrollar un método que acepte el nombre de un equipo y elimine el registro del corredor de ese equipo de la colección.

Para este propósito, debes crear dos clases principales: Carrera y Corredor.

La clase Carrera debe contener:

Un LocalDateTime que marque el inicio de la carrera.

Una lista de todos los corredores anotados.

La clase Corredor debe tener las siguientes propiedades:

- Nombre del corredor

- Nombre del equipo

- Duración: Indica el tiempo que el corredor tardó en completar la carrera.

La duración de la carrera para cada corredor se calcula al momento del registro final. Esta duración debe calcularse utilizando el LocalDateTime de inicio de la carrera. Para lograr esto recuerda que el método que registra a los corredores deberá recibir por parámetro un objeto Corredor y un objeto Carrera.

Requisitos adicionales:


- Crea un método para generar una carrera con varios equipos y corredores de manera aleatoria.

---

## Ejercicio 2

Estás trabajando en un proyecto para desarrollar un sistema de votación para las elecciones de un centro de estudiantes. 

Las votaciones y debates de candidatos se hacen durante una semana por la web y se puede volver a votar para cambiar el voto si uno así lo prefiere.

El equipo de desarrollo te pidió crear un método que reciba un identificador de un estudiante y un candidato y lo guardes en una estructura de datos que los relacione a ambos, pero que no permita que haya identificadores de estudiantes duplicados, es decir, un candidato puede ser votado por múltiples estudiantes, pero un estudiante solo puede votar a un candidato.

Cuando un estudiante vuelve a votar, es decir, cuando recibes un identificador de estudiante que ya existe en tu estructura, solo tienes que reemplazar al candidato que habías votado antes.


---
