# :computer: ENCUENTRO 44

## Introducción

Nos sumergiremos en el mundo de los enums y descubriremos cómo pueden mejorar nuestras habilidades de programación. Aprenderemos cómo declarar y utilizar enums en Java, y exploraremos sus aplicaciones prácticas en la creación de programas más robustos y legibles. Los enums proporcionan una manera elegante y segura de representar un conjunto limitado de opciones posibles. Nos permiten definir nuestras propias clases de enumeración, donde cada valor está predefinido y es único dentro del conjunto. Esto evita errores comunes al utilizar constantes o cadenas de caracteres que pueden ser propensos a errores de escritura o asignación incorrecta. Te dejamos a continuación la teoría sobre Enums. 

[👉 Teoría Enums](https://drive.google.com/file/d/1FeKWYN9hK3Z2ZIxnMVUCU4n-YpMDfldp/view)

---

## Práctica Enums

📍Recuerda crear los test de tus clases

Crea un enum llamado "DiaSemana" que represente los días de la semana. Define las constantes correspondientes a los días: LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO y DOMINGO. 

Luego en la clase Application que crea un método llamado imprimirDiaLaboral() que tome como parámetro una constante de DiaSemana y devuelva un String que diga “Es día de semana” o “Es día laboral”.

Mira este video si necesitas ayuda: [ver video](https://youtu.be/s6IHu2PgRGE)

---


### Enum Color

Crea un enum llamado "Color" que represente los colores primarios: ROJO, VERDE y AZUL. Cada constante del enum debe tener una propiedad adicional llamada "valorHexadecimal" que represente el valor hexadecimal del color. Luego, crea una clase llamada "ConvertidorColor" que tenga un método llamado "convertirHexadecimal" que tome como parámetro un valor hexadecimal y devuelva el color correspondiente del enum.

Mira este video si necesitas ayuda: [ver video](https://youtu.be/I3hsvn1uJOw)

---

### Aplicación de gestión de pedidos

Crea una aplicación de gestión de pedidos utilizando el patrón experto. Para ello, se requiere implementar un Enum llamado EstadoPedido que represente los posibles estados de un pedido. Los estados posibles son "pendiente", "en proceso", "enviado" y "entregado".

Crea el modelo Pedido que contenga los siguientes atributos: número de pedido, cliente, lista de productos y estado del pedido. El estado del pedido debe ser una constante de la enumeración "EstadoPedido". La lista de productos debe ser un array de Strings

Crea la clase PedidoServicio que se encargue de gestionar los pedidos. Esta clase debe tener métodos para crear un nuevo pedido, actualizar el estado de un pedido existente, buscar pedidos por estado, y obtener la lista completa de pedidos y realizar filtros sobre la misma.

Crea la clase MenuServicio para interactuar con el usuario al inicio de la aplicación. El menú debe mostrar opciones para que el usuario pueda crear un nuevo pedido, actualizar el estado de un pedido, buscar pedidos por estado, mostrar lista de pedidos (también poder filtrarlos) y salir de la aplicación.



