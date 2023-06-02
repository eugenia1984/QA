let personas = [
  { nombre: 'Analia', edad: 20, ciudad: 'San Isidro' },
  { nombre: 'Sol', edad: 28, ciudad: 'Salta' },
  { nombre: 'Martín', edad: 34, ciudad: 'San Rafael' }
]

const crearMensajesDePresentacion = (personas) => {
  let mensajes = []
  personas.forEach((persona) => {
    const mensaje = `Mi nombre es ${persona.nombre}, tengo ${persona.edad} años y vivo en ${persona.ciudad}.`
    mensajes.push(mensaje)
  })
  return mensajes
}

const mensajeAMostrar = crearMensajesDePresentacion(personas)
console.log('* * * * Ejercicio 6 * * * *')
mensajeAMostrar.map(mensaje => console.log(mensaje))