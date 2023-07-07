#  💻 ENCUENTRO 36 - Maven



## Testing Automation Y Performance Turno Noche

### Práctica Maven - Cubo rubik rotaciones

Utiliza el ejercicio anterior del rubik como dependencia y agrega métodos para realizar las rotaciones de un cubo rubik de 2x2 (Recuerda crear los test correspondientes). 

Revisa que siempre que haces una rotación cuatro caras intercambian elementos entre sí, una cara rota sobre sí misma y otra cara no se modifica:

Cuando la cara rubik[0]/Blue rota sobre sí misma en sentido antihorario:

1- B[0][0] pasa a B[1][0], B[1][0] pasa a B[1][1], B[1][1] pasa a B[0][1] y B[0][0] pasa a B[0][0].

2- Fila W[0] pasa a fila R[0], fila R[0] pasa a fila Y[0], fila O[0] pasa a fila W[0].

3- Fila 1 de W, R, Y y O no se modifican.

4- Cara rubik[5]/Green no se modifica.

Cuando la cara rubik[1]/White rota sobre sí misma en sentido antihorario:

1- W[0][0] pasa a W[1][0], W[1][0] pasa a W[1][1], W[1][1] pasa a W[0][1] y W[0][0] pasa a W[0][0].

2- Fila G[0] pasa a columna R[0], columna R[0] pasa a fila B[1], fila B[1] pasa a columna O[1], columna O[1] pasa a fila G[0].

3- Las filas G[1], B[0] y las columnas R[1],  O[0] no se modifican.

4- Cara rubik[3]/Orange no se modifica.

En los dos ejemplos anteriores si se rota en sentido contrario (horario) los puntos 3 y 4 se mantienen igual y la lógica de los puntos 1 y 2 va en sentido contrario.

---
