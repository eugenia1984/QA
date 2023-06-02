const invertirString = (texto) => {
  let textoSeparado = texto.split('')
  let textoInvertido = textoSeparado.reverse()
  let textoInvertidoUnido = textoInvertido.join('')

  return textoInvertidoUnido
}

const textoinvertido1 = invertirString('hola')
const textoinvertido2 = invertirString('AloHa')
console.log('* * * * Ejercicio 4 * * * *')
console.log(`'hola' invertido: ${textoinvertido1} y 'AloHa' invertido: ${textoinvertido2}`)