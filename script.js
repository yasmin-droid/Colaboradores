function validarFormulario() {
  const nombre = document.getElementById('nombre').value.trim();
  const correo = document.getElementById('correo').value.trim();

  if (nombre === '' || correo === '') {
    alert('Por favor, completa todos los campos.');
    return false;
  }

  return true;
}