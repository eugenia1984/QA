const cuentas = (num1, num2) =>{
  const suma = num1+num2
  const resta = num1-num2
  const multiplicacion = num1*num2
  const division = (num1>0 && num2>0)? num1/num2: 0

  const obj = {
    numero1: num1,
    numero2: num2,
    suma,
    resta,
    multiplicacion,
    division
  }

  return obj
}

console.log('* * * * Ejercicio 5 * * * *')
console.log(cuentas(1,2))
console.log(cuentas(2,0))
console.log(cuentas(2,-1))
console.log(cuentas(-2,4))