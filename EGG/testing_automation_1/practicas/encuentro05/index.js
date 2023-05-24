const d = document
// Encuentra al elemento HTML (boton) por su ID
const myBtn = d.getElementById('miBoton')

// Funcion que se ejeutara cuando se haga click en el boton
function handleClick() {
  alert('Hola, hiciste click en el botón')
}

// Añadimos el oyente de eventos que 'escuche' el evento 'click'
myBtn.addEventListener('click', handleClick)

/**** Ejercicio de formulario ****/
// Agregar un oyente de eventos al formulario para manejar el evento “submit”
const form = d.getElementById('myForm');


// Función de validación que verifique los criterios deseados
const validateEmail = (email) => {
  const regex =  /^[^\s@]+@[^\s@]+\.[^\s@]{2,7}$/
  return regex.test(email)
}

const validateForm = () => {
  const emailInput = d.getElementById('email');
  const email = emailInput.value;
  if (!validateEmail(email)) {
    alert('Por favor ingrese un correo electrónico válido.');
  } else {
    alert('Correo electrónico enviado correctamente.');
  }
}

form.addEventListener('submit', function(event) {
  //  Evitar que el form se envíe de la manera predeterminada, para validar antes de enviar los datos
  event.preventDefault()
  validateForm()
});

