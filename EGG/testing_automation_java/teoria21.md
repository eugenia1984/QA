# :computer: TEORIA 21 - COLLECTIONS

## ¡Hola! 👋 Te damos la bienvenida a Collections

Imagina que estás trabajando en un proyecto que tiene que procesar, almacenar
y manipular grandes cantidades de datos. Podrías, por supuesto, intentar
manejar estos datos usando arrays y estructuras de datos básicas, pero pronto
te encontrarás con varias limitaciones. Los arrays tienen un tamaño fijo, por lo
que no puedes agregar o eliminar elementos de manera eficiente. Además,
trabajar con datos en arrays puede volverse complicado, especialmente si
necesitas realizar operaciones como ordenar los datos, buscar un elemento o
eliminar duplicados. También, tendrías que implementar estas estructuras de
datos y algoritmos desde cero, lo cual puede ser muy tedioso y propenso a
errores.

Además, si estás trabajando en un equipo, otros miembros del equipo podrían no
estar familiarizados con las estructuras de datos personalizadas que has creado.
Esto podría dar lugar a problemas de compatibilidad y comprensión del código.
Afortunadamente, existe una solución, y es el Java Collections Framework.

¡Que comience el viaje! 🚀

---

### Java Collections Framework

El framework de colecciones de Java es una abstracción de alto nivel que
establece un marco de trabajo común y proporciona una serie de clases,
interfaces y enums predefinidos para representar y manipular colecciones.
Una colección es simplemente un objeto que agrupa múltiples elementos en una
única unidad para luego poder recuperarlos y manipularlos.

Este Framework de Colecciones proporciona implementaciones de alta calidad y
alto rendimiento de estructuras de datos y algoritmos útiles, vamos a conocerlos.

### Herencia e interfaces del Framework de Colecciones

Vamos a iniciar nuestra exploración del Framework de Colecciones de Java por
su jerarquía de interfaces. Estas interfaces definen diferentes tipos de colecciones
que representan distintas estructuras de datos y forman el fundamento del
Framework de Colecciones de Java. Podemos observar la estructura de esa
jerarquía en el siguiente gráfico.



![image](https://github.com/eugenia1984/QA/assets/72580574/04d1ec45-4831-4514-bea3-826fc20266ff)

Existen dos árboles de interfaces, uno que comienza con la interfaz Collection e
incluye Set, SortedSet, List, Queue y Deque, y el otro que comienza con Map e
incluye SortedMap.

Las colecciones en Java trabajan con genéricos, lo que significa que debemos
especificar el tipo de dato que contendrá la colección al declararla. Además, es
importante que los objetos personalizados que utilicemos en las colecciones
implementen los métodos hashCode() y equals(). Al implementar estos métodos
en nuestros objetos personalizados, aseguramos que las colecciones puedan
realizar búsquedas, comparaciones y eliminaciones correctamente.

📍No necesitas leer detenidamente toda la guía, te recomiendo que la primera
vez que la leas, prestes atención a las notas e introducciones de cada interfaz y
clase y no te centres tanto en los métodos. Al final de la misma tendrás un breve
resumen de los aspectos más importantes que necesitas saber. Luego de la
primera lectura puedes interiorizarte más en lo que hacen los métodos.

---

## :computer: Collection

La interfaz raíz en la jerarquía de colecciones. El JDK no proporciona
implementaciones directas de esta interfaz: proporciona implementaciones de
subinterfaces más específicas como Set y List. Esta interfaz se utiliza cuando se
desea la máxima generalidad.

##  Métodos:

Los métodos marcados con "operación opcional” implican que son opcionales y
que las clases que implementan esta interfaz pueden implementar sus métodos
lanzando una excepción UnsupportedOperationException.

📍Esto puede suceder en implementaciones personalizadas, las creadas por
Java no lanzan esas excepciones.

○ boolean add(E e): Asegura que esta colección contenga el
elemento especificado (operación opcional).

💡 El boolean devuelve true si la colección se modificó para
agregar el nuevo objeto.

○ boolean addAll(Collection<? extends E> c): Agrega todos los
elementos de la colección especificada a esta colección (operación
opcional).

○ void clear(): Elimina todos los elementos de esta colección
dejándola vacía (operación opcional).

○ boolean contains(Object o): Devuelve true si esta colección
contiene el elemento especificado.

○ boolean containsAll(Collection<?> c): Devuelve true si esta
colección contiene todos los elementos de la colección
especificada.

○ boolean equals(Object o): Compara el objeto especificado con esta
colección para determinar si son iguales.

○ int hashCode(): Devuelve el valor del código hash para esta
colección.

○ boolean isEmpty(): Devuelve true si esta colección no contiene
elementos.

○ Iterator<E> iterator(): Devuelve un iterador sobre los elementos de
esta colección.

💡 Al final de los métodos de Collection explicaremos que es un
Iterator y para que sirve.

○ boolean remove(Object o): Elimina una única instancia del
elemento especificado de esta colección, si está presente
(operación opcional).

○ boolean removeAll(Collection<?> c): Elimina todos los elementos de
esta colección que también están contenidos en la colección
especificada (operación opcional).

○ boolean retainAll(Collection<?> c): Retiene sólo los elementos de
esta colección que están contenidos en la colección especificada
(operación opcional).

○ int size(): Devuelve el número de elementos en esta colección.

○ Object[] toArray(): Devuelve un arreglo que contiene todos los
elementos de esta colección.

○ <T> T[] toArray(T[] a): Devuelve un arreglo que contiene todos los
elementos de esta colección; el tipo de tiempo de ejecución del
arreglo devuelto es el del arreglo especificado.

💡 Hacer toArray(new Object[x]) es idéntico a toArray().



---

## :computer: Iterator

Un Iterator es una interfaz en Java que proporciona una forma de iterar y recorrer
los elementos de una colección de forma secuencial.

## Métodos:

○ boolean hasNext(): Devuelve true si la iteración tiene más
elementos para recorrer.

○ E next(): Devuelve el siguiente elemento en la iteración.

○ default void remove(): Elimina de la colección subyacente el último
elemento devuelto por este iterador (operación opcional).

Un Iterator se utiliza en contraposición a los bucles fori o foreach cuando se
necesita eliminar o agregar elementos durante la iteración.

```java
Collection<String> coleccion = new ArrayList<>();
coleccion.add("elemento1");
coleccion.add("elemento2");
coleccion.add("elemento3");
Iterator<String> iterator = coleccion.iterator();
while (iterator.hasNext()) {
  String elemento = iterator.next();
  if (elemento.equals("elemento2")) {
    iterator.remove(); // Elimina el elemento correctamente
  }
}
```

La razón es porque se puede producir una excepción
ConcurrentModificationException. Esta excepción se lanza cuando la colección se
modifica estructuralmente (por ejemplo, al agregar o eliminar elementos)
mientras se está iterando sobre ella.

```java
Collection<String> coleccion = new ArrayList<>();
coleccion.add("elemento1");
coleccion.add("elemento2");
coleccion.add("elemento3");
for (String elemento : coleccion) {
  if (elemento.equals("elemento2")) {
    coleccion.remove(elemento);
   // Esto lanzaría ConcurrentModificationException
}
```

---

## Colecciones de vista

Las colecciones de vista son una forma de ver o acceder a los elementos de una
colección existente sin tener que copiarlos y almacenarlos por separado. Estas

colecciones no almacenan elementos por sí mismas, sino que dependen de una
colección de respaldo (también conocida como "backing collection") para
almacenar los elementos reales. Por ejemplo el método subList() genera una
vista de una lista original que representa una sublista de sus elementos. Esta
vista permite acceder y realizar modificaciones en la sublista, y los cambios se
reflejarán en la lista original y viceversa.

---

## :computer:  List

La interfaz List en Java representa una colección ordenada secuencialmente que
permite duplicados y proporciona un acceso basado en índices a sus elementos.

💡 Al igual que los arrays su índice comienza en 0.

📍Hereda todos los métodos vistos en Collection.

##  Métodos propios:

○ void add(int index, E element): Inserta el elemento especificado en
la posición indicada en esta lista.

○ boolean addAll(int index, Collection<? extends E> c): Inserta todos
los elementos de la colección especificada en esta lista en la
posición especificada (operación opcional).

○ E get(int index): Devuelve el elemento en la posición especificada de
esta lista.

○ int indexOf(Object o): Devuelve el índice de la primera ocurrencia
del elemento especificado en esta lista, o -1 si esta lista no contiene
el elemento.

○ int lastIndexOf(Object o): Devuelve el índice de la última ocurrencia
del elemento especificado en esta lista, o -1 si esta lista no contiene
el elemento.

○ ListIterator<E> listIterator(): Devuelve un iterador de lista sobre los
elementos de esta lista.

💡 Al final de los métodos de List explicaremos que es un ListIterator
y para qué sirve.

○ ListIterator<E> listIterator(int index): Devuelve un iterador de lista
sobre los elementos de esta lista, comenzando en la posición
especificada en la lista.

○ E remove(int index): Elimina el elemento en la posición especificada
de esta lista (operación opcional).

○ E set(int index, E element): Reemplaza el elemento en la posición
especificada de esta lista con el elemento especificado (operación
opcional).

○ default void sort(Comparator<? super E> c): Ordena esta lista de
acuerdo con el orden inducido por el comparador especificado.

○ List<E> subList(int fromIndex, int toIndex): Devuelve una vista de la
porción de esta lista entre el índice fromIndex (inclusive) y el índice
toIndex (exclusivo).

---

## :computer: ListIterator

Un ListIterator en Java es una interfaz que extiende la interfaz Iterator y
proporciona funcionalidades adicionales específicas para las listas. Un ListIterator
permite iterar sobre los elementos de una lista en ambas direcciones (hacia
adelante y hacia atrás), y además de eliminar elementos permite agregar y
reemplazar.

📍Hereda todos los métodos vistos en Iterator.

## Métodos propios:

○ void add(E e): Inserta el elemento especificado en la lista.

○ boolean hasPrevious(): Devuelve true si este iterador de lista tiene
más elementos al recorrer la lista en la dirección hacia atrás.

○ int nextIndex(): Devuelve el índice del elemento que sería devuelto
por una llamada posterior a next().

○ E previous(): Devuelve el elemento anterior en la lista y mueve la
posición del cursor hacia atrás.

○ int previousIndex(): Devuelve el índice del elemento que sería
devuelto por una llamada posterior a previous().

○ void set(E e): Reemplaza el último elemento devuelto por next() o
previous() con el elemento especificado (operación opcional).

---


## :computer: Implementaciones de List


##  ArrayList

La clase ArrayList es una implementación de la interfaz List en Java que ofrece un
almacenamiento dinámico de elementos en un array y ofrece métodos para
aumentar manualmente la capacidad cuando sea necesario.

Tiene un tiempo constante (O(1)) para operaciones como obtener el tamaño,
verificar si está vacío, acceder a elementos por posición y realizar iteraciones.
Agregar elementos también es eficiente, con un tiempo constante amortizado
(O(1)) en promedio.

Otras operaciones, como eliminar elementos o buscar, tienen un tiempo lineal
(O(n)), pero el factor constante es bajo en comparación con otras
implementaciones.

💡 O(n) y O(1) son términos en notación Big O que describen la complejidad de
tiempo de ejecución de una operación en relación con el tamaño de los datos de
entrada. Encontrarás más información sobre el significado de cada término al
final de la guía.

📍Hereda todos los métodos de Collection y List.

## Métodos propios:

void ensureCapacity(int minCapacity): Aumenta la capacidad de
esta instancia de ArrayList, si es necesario, para asegurarse de que
pueda contener al menos el número de elementos especificado por
el argumento de capacidad mínima.

○ void trimToSize(): Ajusta la capacidad de esta instancia de ArrayList
para que sea igual al tamaño actual de la lista.

LinkedList
LinkedList ofrece un almacenamiento dinámico de elementos en una estructura
de lista enlazada.
A diferencia de ArrayList, que utiliza un array interno para almacenar los
elementos, LinkedList utiliza nodos enlazados para mantener la secuencia de
elementos.
A continuación, se presenta una comparación entre LinkedList y ArrayList basada
en la explicación anterior:
Tiempo de acceso: Tanto LinkedList como ArrayList ofrecen un tiempo constante
(O(1)) para acceder a elementos por posición, obtener el tamaño y verificar si
está vacío.
Tiempo de inserción y eliminación: En LinkedList, la inserción de elementos en
cualquier posición tiene un tiempo constante (O(1)), ya que solo se requiere
ajustar los enlaces entre los nodos. En ArrayList, la inserción en posiciones
intermedias tiene un tiempo lineal (O(n)) debido a la necesidad de desplazar
elementos para hacer espacio.
Uso de memoria: LinkedList utiliza más memoria que ArrayList, ya que cada
elemento está contenido en un nodo enlazado que también almacena
referencias a los nodos adyacentes.
📍Hereda todos los métodos de Collection y List y además de las interfaces
Queue y Deque. En este caso agregaremos las heredadas por estas últimas dos
interfaces para que puedas apreciar mejor la diferencia con ArrayList.
- Métodos propios:
○ void addFirst(E e): Inserta el elemento especificado al principio de
esta lista.
○ void addLast(E e): Agrega el elemento especificado al final de esta
lista.

○ Iterator<E> descendingIterator(): Devuelve un iterador sobre los
elementos de esta Deque en orden secuencial inverso.
○ E element(): Obtiene, pero no elimina, el primer elemento de esta
lista.
○ E getFirst(): Devuelve el primer elemento de esta lista.
○ E getLast(): Devuelve el último elemento de esta lista.
○ boolean offer(E e): Añade el elemento especificado como último
elemento de esta lista.
○ boolean offerFirst(E e): Inserta el elemento especificado al principio
de esta lista.
○ boolean offerLast(E e): Inserta el elemento especificado al final de
esta lista.
○ E peek(): Obtiene, pero no elimina, el primer elemento de esta lista, o
devuelve null si esta lista está vacía.
○ E peekFirst(): Obtiene, pero no elimina, el primer elemento de esta
lista, o devuelve null si esta lista está vacía.
○ E peekLast(): Obtiene, pero no elimina, el último elemento de esta
lista, o devuelve null si esta lista está vacía.
○ E poll(): Obtiene y elimina el primer elemento de esta lista, o
devuelve null si esta lista está vacía.
○ E pollFirst(): Obtiene y elimina el primer elemento de esta lista, o
devuelve null si esta lista está vacía.
○ E pollLast(): Obtiene y elimina el último elemento de esta lista, o
devuelve null si esta lista está vacía.
○ E pop(): Extrae el primer elemento de la pila representada por esta
lista.
○ void push(E e): Inserta en primer lugar al elemento en la pila
representada por esta lista.

○ E remove(): Obtiene y elimina el primer elemento de esta lista.
○ E removeFirst(): Elimina y devuelve el primer elemento de esta lista.
○ boolean removeFirstOccurrence(Object o): Elimina la primera
aparición del elemento especificado en esta lista (al recorrer la lista
de cabeza a cola).
○ E removeLast(): Elimina y devuelve el último elemento de esta lista.
○ boolean removeLastOccurrence(Object o): Elimina la última
aparición del elemento especificado en esta lista (al recorrer la lista
de cabeza a cola).

Los métodos que hacen lo mismo en la clase LinkedList son:
● addFirst(E e), offerFirst(E e) y push().
● addLast(E e) y offerLast(E e).
● element() y getFirst().
● peek() y peekFirst().
● poll() y pollFirst().
● remove(), removeFirst() y pop().
La duplicación de métodos con nombres diferentes que realizan la misma
operación es una decisión de diseño deliberada para ofrecer flexibilidad y
coherencia en el uso de la clase LinkedList para adaptarse a sus distintos usos.
Los nombres de los métodos en LinkedList están relacionados con los conceptos
de pilas FIFO (First-In-First-Out) y colas LIFO (Last-In-First-Out), que se refieren a
las políticas de ordenamiento utilizadas en diferentes estructuras de datos.
addFirst(E e) y removeFirst(): Estos métodos se refieren a la operación de agregar
y eliminar un elemento en el primer lugar de la lista, respectivamente. Estos
métodos siguen la política LIFO, ya que el primer elemento agregado será el
primero en ser eliminado.
addLast(E e) y removeLast(): Estos métodos se refieren a la operación de agregar
y eliminar un elemento en el último lugar de la lista, respectivamente. Estos
métodos también siguen la política FIFO, ya que el último elemento agregado
será el último en ser eliminado.

push(E e) y pop(): Estos métodos son equivalentes a addFirst(E e) y removeFirst(),
respectivamente. La elección de los nombres push y pop proviene de la analogía
con una pila (stack) en la que se utilizan estas operaciones. En una pila, el
elemento más reciente se coloca en la parte superior y se puede eliminar ese
elemento de inmediato, lo que corresponde a la política LIFO.
La elección de los nombres de los métodos en LinkedList se basa en la intención
de proporcionar una semántica clara y concisa para las operaciones que se
realizan en una lista enlazada, así como establecer analogías con estructuras de
datos populares como pilas y colas. Esto facilita el uso de LinkedList en diferentes
contextos y mejora la comprensión de su funcionalidad.
Set
Un Set es una colección que no permite elementos duplicados. Esto se define por
la semántica del método add en un Set, que devuelve false si el elemento ya está
presente en el conjunto y no se agrega..
Aunque los conjuntos no permiten elementos duplicados, cada elemento en sí
puede ser único según su propio criterio de igualdad, que se define mediante los
métodos equals y hashCode del objeto. Dos objetos distintos pueden
considerarse iguales si su implementación de equals lo define así, incluso si
contienen valores diferentes en sus atributos.
📍Hereda todos los métodos de Collection, no tiene métodos propios.
Implementaciones de Set
HashSet
HashSet utiliza una estructura de datos llamada "hash table" para almacenar y
administrar elementos únicos. Una hash table es una estructura de datos que
utiliza una función de hash para asignar claves a ubicaciones en una tabla, lo
que permite un acceso rápido y eficiente a los elementos. Pero produce que no
se pueda garantizar un orden específico de los elementos.
En términos de notación Big O, las operaciones en un HashSet tienen los
siguientes tiempos de ejecución:

● La inserción, la búsqueda y eliminación: tienen una complejidad promedio
de O(1), lo que significa que el tiempo de ejecución es constante y no
depende del tamaño del conjunto.
● Las operaciones de iteración, como forEach o iterator, tienen una
complejidad de O(n), ya que deben recorrer todos los elementos del
conjunto.
📍Hereda todos los métodos de Collection y Set
● Métodos propios estáticos:
○ HashSet<T> newHashSet(int numeroElementos) Crea un nuevo
HashSet vacío adecuado para el número previsto de elementos.
💡El método newHashSet() es útil para crear un HashSet con una
capacidad inicial optimizada en función del número esperado de
elementos, mejorando el rendimiento en la gestión del conjunto.

LinkedHashSet
LinkedHashSet combina las características de un conjunto HashSet y una lista
enlazada. Al igual que HashSet, LinkedHashSet no permite elementos duplicados
y ofrece un tiempo constante (O(1)) para operaciones como la inserción,
eliminación y búsqueda de elementos.
La principal diferencia entre LinkedHashSet y HashSet radica en el orden de
iteración de los elementos. Mientras que HashSet no garantiza un orden
específico de los elementos, LinkedHashSet mantiene el orden de inserción, lo que
significa que los elementos se iteran en el mismo orden en que se agregaron al
conjunto.
📍Hereda todos los métodos de Collection y Set
● Métodos propios estáticos:
○ LinkedHashSet<T>newLinkedHashSet(int numElements) Crea un
nuevo LinkedHashSet vacío adecuado para el número previsto de
elementos.

💡El método newLinkedHashSet() es útil para crear un HashSet con
una capacidad inicial optimizada en función del número esperado
de elementos, mejorando el rendimiento en la gestión del conjunto.

TreeSet
TreeSet es una implementación de la interfaz SortedSet en Java que almacena
elementos en un árbol de búsqueda balanceado esto significa que a diferencia
de HashSet y LinkedHashSet, TreeSet mantiene los elementos ordenados de
acuerdo con su valor, lo que permite una iteración en un orden ascendente o
descendente.
Al insertar elementos en un TreeSet, se utiliza una función de ordenamiento para
determinar la posición correcta en el árbol. Esto permite que los elementos se
almacenen en un orden de forma natural (si implementan la interfaz
Comparable) o en un orden especificado por un comparador personalizado.
Debido a su estructura de árbol de búsqueda balanceado, las operaciones de
inserción, eliminación y búsqueda en TreeSet tienen un rendimiento logarítmico
(O(log n)). Esto significa que a medida que el conjunto crece, el tiempo de
ejecución de estas operaciones aumenta de manera más lenta en comparación
con un conjunto no ordenado.
Es importante tener en cuenta que TreeSet tiene un rendimiento ligeramente
inferior en comparación con HashSet y LinkedHashSet para operaciones como la
inserción y la eliminación, debido a la necesidad de mantener la estructura de
árbol balanceado. Sin embargo, para aplicaciones que requieren un orden
específico de los elementos, TreeSet es la opción preferida.
📍Hereda todos los métodos de Collection, Set, SortedSet y NavigableSet
● Métodos propios:
○ E ceiling(E e): Devuelve el elemento más pequeño en este conjunto
que es mayor o igual al elemento dado, o null si no existe dicho
elemento.

○ Comparator<? super E> comparator(): Devuelve el comparador
utilizado para ordenar los elementos en este conjunto, o null si este
conjunto utiliza solo la interfaz Comparable.
○ Iterator<E> descendingIterator(): Devuelve un iterador sobre los
elementos de este conjunto en orden descendente.
○ NavigableSet<E> descendingSet(): Devuelve una vista en orden
inverso de los elementos contenidos en este conjunto.
💡Recuerda, explicamos lo que son las colecciones de vista en el
apartado de Collection.
○ E first(): Devuelve el primer (más bajo) elemento actualmente en
este conjunto.
○ E floor(E e): Devuelve el elemento más grande en este conjunto que
es menor o igual al elemento dado, o null si no existe dicho
elemento.
○ SortedSet<E> headSet(E toElement): Devuelve una vista de la
porción de este conjunto cuyos elementos son estrictamente
menores que toElement.
○ NavigableSet<E> headSet(E toElement, boolean inclusive): Devuelve
una vista de la porción de este conjunto cuyos elementos son
menores que (o iguales a, si inclusive es true) toElement.
○ E higher(E e): Devuelve el elemento más pequeño en este conjunto
que es estrictamente mayor que el elemento dado, o null si no existe
dicho elemento.
○ E last(): Devuelve el último (más alto) elemento actualmente en
este conjunto.
○ E lower(E e): Devuelve el elemento más grande en este conjunto que
es estrictamente menor que el elemento dado, o null si no existe
dicho elemento.
○ E pollFirst(): Recupera y elimina el primer (más bajo) elemento, o
devuelve null si este conjunto está vacío.

○ E pollLast(): Recupera y elimina el último (más alto) elemento, o
devuelve null si este conjunto está vacío.
○ NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E
toElement, boolean toInclusive): Devuelve una vista de la porción de
este conjunto cuyos elementos van desde fromElement hasta
toElement.
○ SortedSet<E> subSet(E fromElement, E toElement): Devuelve una
vista de la porción de este conjunto cuyos elementos van desde
fromElement (inclusive) hasta toElement (exclusivo).
○ SortedSet<E> tailSet(E fromElement): Devuelve una vista de la
porción de este conjunto cuyos elementos son mayores o iguales a
fromElement.
○ NavigableSet<E> tailSet(E fromElement, boolean inclusive):
Devuelve una vista de la porción de este conjunto cuyos elementos
son mayores que (o iguales a, si inclusive es true) fromElement.

Queue
Una Queue (cola) es una interfaz en Java que representa una estructura de
datos en la cual los elementos se insertan al final y se eliminan del principio,
siguiendo el principio de First-In-First-Out (FIFO). En otras palabras, el primer
elemento en entrar es el primero en salir.
La interfaz Queue define una serie de métodos para manipular la cola, como
agregar elementos al final de la cola, obtener y eliminar el elemento en el
principio de la cola, y verificar si la cola está vacía, entre otros.
📍Hereda todos los métodos de Collection
● Métodos propios:
○ add(E e): Inserta el elemento especificado en esta cola si es posible
hacerlo de inmediato sin violar las restricciones de capacidad,
devolviendo true en caso de éxito y lanzando una
IllegalStateException si no hay espacio disponible actualmente.

○ E element(): Obtiene, pero no elimina, la cabeza de esta cola.
○ boolean offer(E e): Inserta el elemento especificado en esta cola si
es posible hacerlo de inmediato sin violar las restricciones de
capacidad.
○ E peek(): Obtiene, pero no elimina, la cabeza de esta cola, o
devuelve null si esta cola está vacía.
○ E poll(): Obtiene y elimina la cabeza de esta cola, o devuelve null si
esta cola está vacía.
○ E remove(): Obtiene y elimina la cabeza de esta cola.

Implementaciones de Queue
PriorityQueue
La clase PriorityQueue es una implementación de una cola de prioridad. Una cola
de prioridad es una estructura de datos en la que los elementos se ordenan
según su prioridad y se accede a ellos en función de esa prioridad.
La prioridad se determina utilizando el orden natural de los elementos (si
implementan la interfaz Comparable) o utilizando un comparador personalizado
proporcionado durante la creación de la cola.
📍Hereda todos los métodos de Collection y Queue
● Métodos propios:
○ Comparator<? super E> comparator(): Devuelve el comparador
utilizado para ordenar los elementos en esta cola, o null si esta cola
utiliza solo la interfaz Comparable.

Deque
La interfaz Deque, abreviatura de "double-ended queue" (cola de doble extremo),
es una subinterfaz de la interfaz Queue en Java que define una cola que permite
la inserción y eliminación de elementos tanto al principio como al final de la cola.
Esto proporciona flexibilidad en la manipulación de los elementos de la cola.

📍Hereda todos los métodos de Collection y Queue
● Métodos propios:
○ E ceiling(E e): Devuelve el elemento más pequeño en este conjunto
que es mayor o igual al elemento dado, o null si no existe dicho
elemento.
○ void addFirst(E e): Inserta el elemento especificado al principio de
esta deque si es posible hacerlo inmediatamente sin violar las
restricciones de capacidad, lanzando una IllegalStateException si
actualmente no hay espacio disponible.
○ void addLast(E e): Inserta el elemento especificado al final de esta
deque si es posible hacerlo inmediatamente sin violar las
restricciones de capacidad, lanzando una IllegalStateException si
actualmente no hay espacio disponible.
○ Iterator<E> descendingIterator(): Devuelve un iterador sobre los
elementos de esta deque en orden secuencial inverso.
○ E getFirst(): Obtiene, pero no elimina, el primer elemento de esta
deque.
○ E getLast(): Obtiene, pero no elimina, el último elemento de esta
deque.
○ boolean offerFirst(E e): Inserta el elemento especificado al principio
de esta deque a menos que viole las restricciones de capacidad.
○ boolean offerLast(E e): Inserta el elemento especificado al final de
esta deque a menos que viole las restricciones de capacidad.
○ E peekFirst(): Obtiene, pero no elimina, el primer elemento de esta
deque, o devuelve null si esta deque está vacía.
○ E peekLast(): Obtiene, pero no elimina, el último elemento de esta
deque, o devuelve null si esta deque está vacía.
○ E pollFirst(): Obtiene y elimina el primer elemento de esta deque, o
devuelve null si esta deque está vacía.

○ E pollLast(): Obtiene y elimina el último elemento de esta deque, o
devuelve null si esta deque está vacía.
○ E pop(): Extrae un elemento de la pila representada por esta deque.
○ void push(E e): Inserta un elemento en la parte superior de la pila
representada por esta deque (es decir, al principio de esta deque) si
es posible hacerlo inmediatamente sin violar las restricciones de
capacidad, lanzando una IllegalStateException si actualmente no
hay espacio disponible.
○ E removeFirst(): Obtiene y elimina el primer elemento de esta deque.
○ boolean removeFirstOccurrence(Object o): Elimina la primera
aparición del elemento especificado de esta deque.
○ E removeLast(): Obtiene y elimina el último elemento de esta deque.
○ boolean removeLastOccurrence(Object o): Elimina la última
aparición del elemento especificado de esta deque.

Implementaciones de Deque
ArrayDeque es una implementación de la interfaz Deque en Java que utiliza un
arreglo dinámico para almacenar los elementos de la cola.
ArrayDeque
📍Hereda todos los métodos de Collection, Queue y Deque
Map
La interfaz Map en Java representa una colección de pares clave-valor, donde
cada elemento está asociado a una clave única. Permite almacenar y manipular
datos en forma de entradas que consisten en una clave y su correspondiente
valor.
📍No hereda de la Interfaz Collection
● Métodos propios:

○ void clear(): Elimina todos los mapeos de este mapa (operación
opcional).
○ boolean containsKey(Object key): Devuelve true si este mapa
contiene un mapeo para la clave especificada.
○ boolean containsValue(Object value): Devuelve true si este mapa
mapea una o más claves al valor especificado.
○ Set<Map.Entry<K, V>> entrySet(): Devuelve una vista Set de los
mapeos contenidos en este mapa.
○ boolean equals(Object o): Compara el objeto especificado con este
mapa para verificar la igualdad.
○ V get(Object key): Devuelve el valor al que está mapeada la clave
especificada, o null si este mapa no contiene un mapeo para la
clave.
○ default V getOrDefault(Object key, V defaultValue): Devuelve el valor
al que está mapeada la clave especificada, o defaultValue si este
mapa no contiene un mapeo para la clave.
○ int hashCode(): Devuelve el valor del código hash para este mapa.
○ boolean isEmpty(): Devuelve true si este mapa no contiene mapeos
clave-valor.
○ Set<K> keySet(): Devuelve una vista Set de las claves contenidas en
este mapa.
○ V put(K key, V value): Asocia el valor especificado con la clave
especificada en este mapa (operación opcional).
○ void putAll(Map<? extends K, ? extends V> m): Copia todos los
mapeos desde el mapa especificado a este mapa (operación
opcional).
○ default V putIfAbsent(K key, V value): Si la clave especificada no
está asociada actualmente con un valor (o está mapeada a null), la
asocia con el valor dado y devuelve null, de lo contrario devuelve el
valor actual.

○ V remove(Object key): Elimina el mapeo para una clave de este
mapa si está presente (operación opcional).
○ default boolean remove(Object key, Object value): Elimina la
entrada para la clave especificada solo si está mapeada
actualmente al valor especificado.
○ default V replace(K key, V value): Reemplaza la entrada para la
clave especificada solo si está actualmente mapeada a algún valor.
○ default boolean replace(K key, V oldValue, V newValue): Reemplaza
la entrada para la clave especificada solo si está actualmente
mapeada al valor especificado.
○ default void replaceAll(BiFunction<? super K, ? super V, ? extends V>
function): Reemplaza el valor de cada entrada con el resultado de
invocar la función dada en esa entrada hasta que se hayan
procesado todas las entradas o la función arroje una excepción.
○ int size(): Devuelve el número de mapeos clave-valor en este mapa.
○ Collection<V> values(): Devuelve una vista Collection de los valores
contenidos en este mapa.
Implementaciones de Map
HashMap
HashMap utiliza una estructura de datos de tabla hash para almacenar los
elementos. Cada elemento se almacena en una ubicación de la tabla hash
calculada mediante la función de hash de la clave. Esto permite un acceso
rápido a los elementos en tiempo constante (O(1)) en promedio.
📍Hereda todos los métodos de Map
● Métodos propios estáticos:
○ HashMap<K, V> newHashMap(int numMappings): Crea un nuevo
HashMap vacío adecuado para el número esperado de mapeos.

LinkedHashMap
La principal diferencia entre LinkedHashMap y HashMap es que LinkedHashMap
mantiene un orden predecible de iteración basado en el orden de inserción de
los elementos. Esto significa que cuando se itera sobre un LinkedHashMap, los
elementos se devuelven en el mismo orden en el que se insertaron.
📍Hereda todos los métodos de Map
● Métodos propios estáticos:
○ HashMap<K, V> newHashMap(int numMappings): Crea un nuevo
HashMap vacío adecuado para el número esperado de mapeos.

TreeMap
TreeMap es una implementación de la interfaz Map en Java que mantiene los
elementos ordenados según el orden natural de sus claves (si implementan la
interfaz Comparable) o utilizando un comparador personalizado. Internamente,
utiliza un árbol rojo-negro para almacenar los elementos.
TreeMap es eficiente para operaciones de inserción, eliminación y búsqueda
basadas en las claves, pero puede ser menos eficiente para realizar búsquedas
basadas en valores o para verificar si un valor específico está presente.
📍Hereda todos los métodos de Map, SortedMap y NavigableMap
● Métodos propios estáticos:
○ Map.Entry<K,V> ceilingEntry(K key): Devuelve una entrada de
clave-valor asociada con la clave más pequeña mayor o igual a la
clave dada, o null si no hay tal clave.
○ K ceilingKey(K key): Devuelve la clave más pequeña mayor o igual a
la clave dada, o null si no hay tal clave.
○ Comparator<? super K> comparator(): Devuelve el comparador
utilizado para ordenar las claves en este mapa, o null si este mapa
utiliza el orden natural de sus claves.
○ NavigableSet<K> descendingKeySet(): Devuelve una vista ordenada
en orden inverso de las claves contenidas en este mapa.

○ NavigableMap<K,V> descendingMap(): Devuelve una vista en orden
inverso de las asignaciones contenidas en este mapa.
○ Map.Entry<K,V> firstEntry(): Devuelve una asignación de clave-valor
asociada con la clave más pequeña en este mapa, o null si el mapa
está vacío.
○ K firstKey(): Devuelve la primera clave (la más baja) actualmente
en este mapa.
○ Map.Entry<K,V> floorEntry(K key): Devuelve una asignación de
clave-valor asociada con la clave más grande menor o igual a la
clave dada, o null si no hay tal clave.
○ K floorKey(K key): Devuelve la clave más grande menor o igual a la
clave dada, o null si no hay tal clave.
○ SortedMap<K,V> headMap(K toKey): Devuelve una vista de la
porción de este mapa cuyas claves son estrictamente menores que
toKey.
○ NavigableMap<K,V> headMap(K toKey, boolean inclusive): Devuelve
una vista de la porción de este mapa cuyas claves son menores que
(o iguales a, si inclusive es true) toKey.
○ Map.Entry<K,V> higherEntry(K key): Devuelve una asignación de
clave-valor asociada con la clave estrictamente mayor que la clave
dada, o null si no hay tal clave.
○ K higherKey(K key): Devuelve la clave estrictamente mayor que la
clave dada, o null si no hay tal clave.
○ Set<K> keySet(): Devuelve una vista de conjunto de las claves
contenidas en este mapa.
○ Map.Entry<K,V> lastEntry(): Devuelve una asignación de clave-valor
asociada con la clave más grande en este mapa, o null si el mapa
está vacío.
○ K lastKey(): Devuelve la última clave (la más alta) actualmente en
este mapa.

○ Map.Entry<K,V> lowerEntry(K key): Devuelve una asignación de
clave-valor asociada con la clave estrictamente menor que la clave
dada, o null si no hay tal clave.
○ K lowerKey(K key): Devuelve la clave más grande estrictamente
menor que la clave dada, o null si no hay tal clave.
○ V merge(K key, V value, BiFunction<? super V,? super V,? extends V>
remappingFunction): Si la clave especificada no está asociada con
un valor o está asociada con null, la asocia con el valor no nulo
dado.
○ NavigableSet<K> navigableKeySet(): Devuelve una vista de
conjunto navegable de las claves contenidas en este mapa.
○ Map.Entry<K,V> pollFirstEntry(): Elimina y devuelve una asignación
de clave-valor asociada con la clave más pequeña en este mapa, o
null si el mapa está vacío.
○ Map.Entry<K,V> pollLastEntry(): Elimina y devuelve una asignación
de clave-valor asociada con la clave más grande en este mapa, o
null si el mapa está vacío.
○ NavigableMap<K,V> subMap(K fromKey, boolean fromInclusive, K
toKey, boolean toInclusive): Devuelve una vista de la porción de este
mapa cuyas claves van desde fromKey hasta toKey.
○ SortedMap<K,V> subMap(K fromKey, K toKey): Devuelve una vista de
la porción de este mapa cuyas claves van desde fromKey
(inclusive) hasta toKey (exclusivo).
○ SortedMap<K,V> tailMap(K fromKey): Devuelve una vista de la
porción de este mapa cuyas claves son mayores o iguales que
fromKey.
○ NavigableMap<K,V> tailMap(K fromKey, boolean inclusive):
Devuelve una vista de la porción de este mapa cuyas claves son
mayores que (o iguales a, si inclusive es true) fromKey.
○ Collection<V> values(): Devuelve una vista de colección de los
valores contenidos en este mapa.

Clases de utilidad
Las clases de utilidad Collections y Arrays en Java proporcionan funcionalidades
adicionales y métodos estáticos para trabajar con colecciones y matrices de
manera más conveniente y eficiente. Estas clases ofrecen una serie de métodos
para realizar diversas operaciones comunes, como ordenar, buscar, manipular y
transformar elementos en colecciones y matrices.
Collections
La clase Collections se enfoca en proporcionar métodos para trabajar con
colecciones, como List, Set y Map. Ofrece métodos para ordenar, buscar, mezclar,
invertir, copiar, llenar y otras operaciones en colecciones. También proporciona
métodos para crear colecciones inmutables, sincronizadas y envueltas en otras
estructuras de datos.
● Métodos propios estáticos:
○ boolean addAll(Collection<? super T> c, T... elements): Agrega todos
los elementos especificados a la colección especificada.
○ Queue<T> asLifoQueue(Deque<T> deque): Devuelve una vista de
una Deque como una cola de último en entrar, primero en salir (Lifo).
○ int binarySearch(List<? extends Comparable<? super T>> list, T key):
Busca el objeto especificado en la lista especificada utilizando el
algoritmo de búsqueda binaria.
○ int binarySearch(List<? extends T> list, T key, Comparator<? super T>
c): Busca el objeto especificado en la lista especificada utilizando el
algoritmo de búsqueda binaria.
○ void copy(List<? super T> dest, List<? extends T> src): Copia todos
los elementos de una lista en otra lista.
○ boolean disjoint(Collection<?> c1, Collection<?> c2): Devuelve true si
las dos colecciones especificadas no tienen elementos en común.

○ Enumeration<T> enumeration(Collection<T> c): Devuelve una
enumeración sobre la colección especificada.
○ void fill(List<? super T> list, T obj): Reemplaza todos los elementos de
la lista especificada con el elemento especificado.
○ int frequency(Collection<?> c, Object o): Devuelve el número de
elementos en la colección especificada que son iguales al objeto
especificado.
○ int indexOfSubList(List<?> source, List<?> target): Devuelve la
posición de inicio de la primera ocurrencia de la lista objetivo
especificada dentro de la lista de origen especificada, o -1 si no hay
tal ocurrencia.
○ int lastIndexOfSubList(List<?> source, List<?> target): Devuelve la
posición de inicio de la última ocurrencia de la lista objetivo
especificada dentro de la lista de origen especificada, o -1 si no hay
tal ocurrencia.
○ ArrayList<T> list(Enumeration<T> e): Devuelve una lista de matrices
que contiene los elementos devueltos por la enumeración
especificada en el orden en que son devueltos por la enumeración.
○ T max(Collection<? extends T> coll): Devuelve el elemento máximo
de la colección dada, según el orden natural de sus elementos.
○ T max(Collection<? extends T> coll, Comparator<? super T> comp):
Devuelve el elemento máximo de la colección dada, según el orden
especificado por el comparador.
○ T min(Collection<? extends T> coll): Devuelve el elemento mínimo
de la colección dada, según el orden natural de sus elementos.
○ T min(Collection<? extends T> coll, Comparator<? super T> comp):
Devuelve el elemento mínimo de la colección dada, según el orden
especificado por el comparador.
○ List<T> nCopies(int n, T o): Devuelve una lista inmutable que
consiste en n copias del objeto especificado.

○ Set<E> newSetFromMap(Map<E,Boolean> map): Devuelve un
conjunto respaldado por el mapa especificado.
○ boolean replaceAll(List<T> list, T oldVal, T newVal): Reemplaza todas
las ocurrencias de un valor especificado en una lista con otro valor.
○ void reverse(List<?> list): Invierte el orden de los elementos en la
lista especificada.
○ Comparator<T> reverseOrder(): Devuelve un comparador que
impone el orden inverso del orden natural en una colección de
objetos que implementan la interfaz Comparable.
○ Comparator<T> reverseOrder(Comparator<T> cmp): Devuelve un
comparador que impone el orden inverso del comparador
especificado.
○ void rotate(List<?> list, int distance): Rota los elementos en la lista
especificada según la distancia especificada.
○ void shuffle(List<?> list): Permuta aleatoriamente la lista
especificada utilizando una fuente de aleatoriedad predeterminada.
○ void shuffle(List<?> list, Random rnd): Permuta aleatoriamente la
lista especificada utilizando la fuente de aleatoriedad especificada.
○ void sort(List<T> list): Ordena la lista especificada en orden
ascendente, según el orden natural de sus elementos.
○ void sort(List<T> list, Comparator<? super T> c): Ordena la lista
especificada según el orden especificado por el comparador.
○ void swap(List<?> list, int i, int j): Intercambia los elementos en las
posiciones especificadas de la lista especificada.
○ métodos que devuelven colecciones inmodificables vacías
○ métodos que devuelven colecciones inmodificables con un solo
elemento
○ métodos que devuelven colecciones sincronizadas
○ métodos que devuelven colecciones inmodificables

Arrays
La clase Arrays se centra en trabajar con matrices. Proporciona métodos para
ordenar, buscar, comparar, rellenar, copiar y manipular elementos en matrices.
También ofrece métodos para convertir matrices en listas y viceversa. Ya la
hemos utilizado al principio del curso, ahora conocerás más métodos útiles.
📍En los métodos siguientes se utiliza la palabra primitivo para referirse a que
existen sobrecargas del método para cada primitivo: boolean, byte, short, int,
long, char, float, double
● Métodos propios estáticos:
○ <T> List<T> asList(T... a): Devuelve una lista de tamaño fijo
respaldada por el arreglo especificado.
List<String> list = Arrays.asList("Pepe", "Lolo", "Elias");
💡La lista no puede cambiar de tamaño, si usas su método add()
lanzará un error.
○ int binarySearch(primitivo[] a, primitivo key): Busca el valor
especificado en el arreglo de primitivos especificado utilizando el
algoritmo de búsqueda binaria.
○ int binarySearch(primitivo[] a, int fromIndex, int toIndex, primitivo
key): Busca un rango del arreglo de primitivos especificado para
encontrar el valor especificado utilizando el algoritmo de búsqueda
binaria.
○ int binarySearch(T[] a, int fromIndex, int toIndex, T key,
Comparator<? super T> c): Busca un rango del arreglo especificado
para encontrar el objeto especificado utilizando el algoritmo de
búsqueda binaria.
○ int binarySearch(T[] a, T key, Comparator<? super T> c): Busca el
objeto especificado en el arreglo especificado utilizando el
algoritmo de búsqueda binaria.

○ int compare(primitivo[] a, primitivo[] b): Compara dos arreglos de
primitivos lexicográficamente.
○ int compare(primitivo[] a, int aFromIndex, int aToIndex, primitivo[]
b, int bFromIndex, int bToIndex): Compara dos arreglos de primitivos
lexicográficamente en los rangos especificados.
○ int compare(T[] a, int aFromIndex, int aToIndex, T[] b, int
bFromIndex, int bToIndex): Compara dos arreglos de objetos
lexicográficamente en los rangos especificados.
○ int compare(T[] a, int aFromIndex, int aToIndex, T[] b, int
bFromIndex, int bToIndex, Comparator<? super T> cmp): Compara
dos arreglos de objetos lexicográficamente en los rangos
especificados.
○ int compare(T[] a, T[] b): Compara dos arreglos de objetos
lexicográficamente, dentro de elementos comparables.
○ int compare(T[] a, T[] b, Comparator<? super T> cmp): Compara
dos arreglos de objetos lexicográficamente utilizando un
comparador especificado.
○ int compareUnsigned(int[] a, int[] b): Compara dos arreglos de
enteros lexicográficamente, tratando numéricamente a los
elementos como sin signo.
○ int compareUnsigned(int[] a, int aFromIndex, int aToIndex, int[] b,
int bFromIndex, int bToIndex): Compara dos arreglos de enteros
lexicográficamente en los rangos especificados, tratando
numéricamente a los elementos como sin signo.
○ primitivo[] copyOf(primitivo[] original, int newLength): Copia el
arreglo especificado, truncando o rellenando con ceros (si es
necesario) para que la copia tenga la longitud especificada.
○ T[] copyOf(T[] original, int newLength): Copia el arreglo
especificado, truncando o rellenando con nulos (si es necesario)
para que la copia tenga la longitud especificada.

○ T[] copyOf(U[] original, int newLength, Class<? extends T[]>
newType): Copia el arreglo especificado, truncando o rellenando
con nulos (si es necesario) para que la copia tenga la longitud
especificada.
○ primitivo[] copyOfRange(primitivo[] original, int from, int to): Copia
el rango especificado del arreglo especificado en un nuevo arreglo.
○ T[] copyOfRange(T[] original, int from, int to): Copia el rango
especificado del arreglo especificado en un nuevo arreglo.
○ T[] copyOfRange(U[] original, int from, int to, Class<? extends T[]>
newType): Copia el rango especificado del arreglo especificado en
un nuevo arreglo.
○ boolean deepEquals(Object[] a1, Object[] a2): Devuelve true si los
dos arreglos especificados son profundamente iguales entre sí.
○ int deepHashCode(Object[] a): Devuelve un código hash basado en
el "contenido profundo" del arreglo especificado.
○ String deepToString(Object[] a): Devuelve una representación en
forma de cadena del "contenido profundo" del arreglo especificado.
○ boolean equals(primitivo[] a, primitivo[] a2): Devuelve true si los
dos arreglos de primitivos especificados son iguales entre sí.
○ boolean equals(primitivo[] a, int aFromIndex, int aToIndex,
primitivo[] b, int bFromIndex, int bToIndex): Devuelve true si los dos
arreglos de primitivos especificados, en los rangos especificados,
son iguales entre sí.
○ boolean equals(Object[] a, int aFromIndex, int aToIndex, Object[] b,
int bFromIndex, int bToIndex): Devuelve true si los dos arreglos de
objetos especificados, en los rangos especificados, son iguales entre
sí.
○ boolean equals(Object[] a, Object[] a2): Devuelve true si los dos
arreglos de objetos especificados son iguales entre sí.

○ boolean equals(T[] a, int aFromIndex, int aToIndex, T[] b, int
bFromIndex, int bToIndex, Comparator<? super T> cmp): Devuelve
true si los dos arreglos de objetos especificados, en los rangos
especificados, son iguales entre sí.
○ boolean equals(T[] a, T[] a2, Comparator<? super T> cmp):
Devuelve true si los dos arreglos de objetos especificados son
iguales entre sí.
○ void fill(primitivo[] a, primitivo val): Asigna el valor de primitivo
especificado a cada elemento del arreglo de primitivos
especificado.
○ void fill(primitivo[] a, int fromIndex, int toIndex, primitivo val): Asigna
el valor de primitivo especificado a cada elemento del rango
especificado del arreglo de primitivos especificado.
○ void fill(Object[] a, int fromIndex, int toIndex, Object val): Asigna la
referencia de objeto especificada a cada elemento del rango
especificado del arreglo de objetos especificado.
○ void fill(Object[] a, Object val): Asigna la referencia de objeto
especificada a cada elemento del arreglo de objetos especificado.
○ int hashCode(primitivo[] a): Devuelve un código hash basado en el
contenido del arreglo especificado.
○ int hashCode(Object[] a): Devuelve un código hash basado en el
contenido del arreglo especificado.
○ int mismatch(primitivo[] a, primitivo[] b): Encuentra y devuelve el
índice de la primera diferencia entre dos arreglos de primitivos, de lo
contrario devuelve -1 si no se encuentra ninguna diferencia.
○ int mismatch(primitivo[] a, int aFromIndex, int aToIndex, primitivo[]
b, int bFromIndex, int bToIndex): Encuentra y devuelve el índice
relativo de la primera diferencia entre dos arreglos de primitivos en
los rangos especificados, de lo contrario devuelve -1 si no se
encuentra ninguna diferencia.

○ int mismatch(Object[] a, int aFromIndex, int aToIndex, Object[] b,
int bFromIndex, int bToIndex): Encuentra y devuelve el índice relativo
de la primera diferencia entre dos arreglos de objetos en los rangos
especificados, de lo contrario devuelve -1 si no se encuentra
ninguna diferencia.
○ int mismatch(Object[] a, Object[] b): Encuentra y devuelve el índice
de la primera diferencia entre dos arreglos de objetos, de lo
contrario devuelve -1 si no se encuentra ninguna diferencia.
○ int mismatch(T[] a, int aFromIndex, int aToIndex, T[] b, int
bFromIndex, int bToIndex, Comparator<? super T> cmp): Encuentra y
devuelve el índice relativo de la primera diferencia entre dos
arreglos de objetos en los rangos especificados, de lo contrario
devuelve -1 si no se encuentra ninguna diferencia.
○ int mismatch(T[] a, T[] b, Comparator<? super T> cmp): Encuentra
y devuelve el índice de la primera diferencia entre dos arreglos de
objetos, de lo contrario devuelve -1 si no se encuentra ninguna
diferencia.
○ void setAll(double[] array, IntToDoubleFunction generator):
Establece todos los elementos del arreglo especificado utilizando la
función generadora proporcionada para calcular cada elemento.
(Explicar qué es un generador y dar un ejemplo)
○ void setAll(int[] array, IntUnaryOperator generator): Establece todos
los elementos del arreglo especificado utilizando la función
generadora proporcionada para calcular cada elemento.
○ void setAll(long[] array, IntToLongFunction generator): Establece
todos los elementos del arreglo especificado utilizando la función
generadora proporcionada para calcular cada elemento.
○ void setAll(T[] array, IntFunction<? extends T> generator): Establece
todos los elementos del arreglo especificado utilizando la función
generadora proporcionada para calcular cada elemento.
○ void sort(primitivo[] a): Ordena el arreglo especificado en orden
numérico ascendente.

○ void sort(primitivo[] a, int fromIndex, int toIndex): Ordena el rango
especificado del arreglo en orden ascendente.
○ void sort(Object[] a): Ordena el arreglo de objetos especificado en
orden ascendente, según el orden natural de sus elementos.
○ void sort(Object[] a, int fromIndex, int toIndex): Ordena el rango
especificado del arreglo de objetos especificado en orden
ascendente, según el orden natural de sus elementos.
○ void sort(T[] a, int fromIndex, int toIndex, Comparator<? super T> c):
Ordena el rango especificado del arreglo de objetos especificado
según el orden especificado por el comparador.
○ void sort(T[] a, Comparator<? super T> c): Ordena el arreglo de
objetos especificado según el orden especificado por el
comparador.
○ String toString(primitivo[] a): Devuelve una representación en
forma de cadena del contenido del arreglo especificado.
○ String toString(Object[] a): Devuelve una representación en forma
de cadena del contenido del arreglo especificado.
Los siguientes métodos tienen las mismas sobrecargas que los
anteriores pero tienen usos más avanzados que no abordaremos.
○ parallelPrefix()
○ parallelSetAll()
○ parallelSort()
○ splitIterator()
○ stream()

Resumen de los aspectos más importantes
Este apartado será bien corto porque la idea es dejar claro las ideas principales,
la mayor parte de esta guía son referencias a los métodos que puedes usar con
cada clase, pero la idea principal es que sepas cuando usar cada estructura

El ArrayList es la estructura por default que siempre usarás cuando quieras usar
una colección de elementos
HashSet siempre que necesites evitar datos duplicados en tu colección.
HashMap cuando necesites representar estructuras que tienen una clave y un
valor.
El resto de las implementaciones solo las necesitarás en casos muy específicos:
LinkedList si necesitas modificar de lugar muchas veces tus elementos dentro de
la colección, o si necesitas representar una estructura LIFO o FIFO.
LinkedHashSet y LinkedHashMap cuando necesites tener un orden secuencial
para elementos que no se puedan duplicar o estructuras de datos de clave valor.
TreeSet, TreeMap o PriorityQueue cuando necesites que a medida que ingreses
nuevos elementos, estos se mantengan ordenados bajo algún criterio que
quieras.
Notación de Big O
La notación Big O es una forma de describir el rendimiento y la complejidad de un
algoritmo. En particular, la notación Big O describe el peor caso de rendimiento
de un algoritmo en términos de tiempo de ejecución o espacio requerido.
Esto es importante para las estructuras de datos en el Java Collections
Framework, porque estas estructuras de datos son implementaciones de
algoritmos, y la elección de la estructura de datos correcta puede tener un gran
impacto en el rendimiento de tu programa, especialmente si estás trabajando
con grandes cantidades de datos.
O(1): Este es el tiempo de ejecución constante. Significa que la operación siempre
toma el mismo tiempo, independientemente del tamaño del conjunto de datos.
Un ejemplo de una operación O(1) sería acceder a un elemento de una matriz o
lista enlazada por su índice.

O(log n): Este es el tiempo de ejecución logarítmico. Significa que el tiempo de
ejecución aumenta logarítmicamente con el tamaño del conjunto de datos. Un
algoritmo con complejidad O(log n) es muy eficiente, ya que el tiempo de

ejecución no aumenta linealmente con el tamaño del conjunto de datos, sino que
se incrementa de manera mucho más lenta. Un ejemplo típico de este
comportamiento son los algoritmos de búsqueda binaria.
O(n): Este es el tiempo de ejecución lineal. Significa que el tiempo de ejecución
aumenta linealmente con el tamaño del conjunto de datos. Por ejemplo, si
necesitas recorrer todos los elementos de una lista, el tiempo de ejecución será
O(n).
O(n log n): Este es el tiempo de ejecución logarítmico-lineal. En comparación con
O(1), O(log n) y O(n), esta es la complejidad de tiempo más "costosa" o "lenta". Sin
embargo, todavía es mucho más eficiente que otras complejidades de tiempo,
como O(n^2) o O(2^n), que a menudo se encuentran en algoritmos menos
eficientes. Los algoritmos de ordenación eficientes como Mergesort, Heapsort y
Quicksort son muy utilizados y, a pesar de su complejidad O(n log n), son muy
eficientes para manejar grandes conjuntos de datos debido a la relativamente
lenta tasa de crecimiento de la función logarítmica.
El orden de eficiencia de los términos mencionados, desde el más eficiente al
menos eficiente, sería: O(1), O(log n), O(n), O(n log n).

Comparación de rendimiento entre casos de uso e
implementaciones
Esta tabla muestra la eficiencia en términos de notación Big O para varias
operaciones comunes en diferentes implementaciones de las Colecciones de
Java. Tené en cuenta que "n" es el número de elementos en la colección.

👉 Link a tabla
Donde:
"-": Esta notación se usa para indicar que un caso de uso dado no es aplicable o
no es relevante para la estructura de datos en cuestión. Por ejemplo, no se
espera que las operaciones de inserción o eliminación en un lugar específico se
realicen en una estructura de datos Set, ya que Set no mantiene ningún orden
específico de sus elementos.

"Sí" / "No": Estos términos se usan para indicar si una estructura de datos dada
admite una característica o no. Por ejemplo, en la columna "Nulabilidad", "Sí"
significa que la estructura de datos permite elementos nulos, mientras que "No"
significa que no los permite.
1, 2, 1.5, etc.: Estos números se usan para representar una medida relativa del uso
de memoria de las distintas estructuras de datos. El número "1" se asigna a la
estructura de datos que se considera que tiene el uso de memoria más eficiente,
y los otros números representan el uso de memoria relativo en comparación con
esta. Por ejemplo, si una estructura de datos tiene asignado el número "2", esto
significa que se considera que usa aproximadamente el doble de memoria que
la estructura de datos que tiene asignado el número "1".
El cálculo de uso de la memoria es estimativo. Algunas estructuras de datos,
como ArrayList e IdentityHashMap, tienden a usar menos memoria porque tienen
implementaciones más simples y almacenan menos metadatos para cada
elemento. Otras estructuras de datos, como LinkedList y LinkedHashMap, tienden
a usar más memoria porque almacenan metadatos adicionales (como enlaces
a elementos adyacentes) para cada elemento.
