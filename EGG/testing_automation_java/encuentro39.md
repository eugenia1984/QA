# :computer: ENCUENTRO 39

## Testing Automation Y Performance Turno Noche

### Práctica POO - Sistema de gestión 

Implementa un sistema de gestión de empleados que permita al usuario interactuar a través de un menú con las siguientes opciones:

Crear un nuevo empleado: Debes solicitar al usuario todos los detalles del empleado (nombre, edad, salario, departamento).

Mostrar todos los empleados: Muestra un resumen de la información de todos los empleados en formato tabla, la primera columna debe ser el número de fila de la tabla.

Filtrar empleados: Proporciona sub-opciones para permitir al usuario filtrar la lista de empleados por nombre, edad, salario o departamento (edad y salario debe permitirte ingresar dos valores para el mínimo y máximo).

Ordenar empleados: Proporciona sub-opciones para permitir al usuario ordenar la lista de empleados por nombre, edad, salario o departamento. Deberás implementar métodos de ordenación utilizando algún algoritmo de ordenación como el de la burbuja.

Limpiar filtros y ordenamientos: Debes volver a mostrar el arreglo de Empleados por defecto.

Incrementar salario: Solicita al usuario el nombre del empleado y el porcentaje de incremento del salario. Luego, usa el método incrementarSalario(double porcentaje) para incrementar el salario del empleado correspondiente.

Salir del programa.

💡 TIP: para el desarrollo del sistema, debes crear una clase Empleado con los atributos privados: nombre, edad, salario y departamento. Asegúrate de incluir métodos getter y setter para cada atributo. Te recomendamos que uses un arreglo de Empleados en la clase ejecutable base, y otro arreglo para aplicar los filtros y ordenamientos de forma tal que no pierdas la información.
