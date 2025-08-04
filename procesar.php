<?php
if ($_SERVER["REQUEST_METHOD"] === "POST") {
  $nombre = htmlspecialchars($_POST["nombre"]);
  $correo = htmlspecialchars($_POST["correo"]);

  echo "<h1>Gracias por tu mensaje</h1>";
  echo "<p>Nombre: $nombre</p>";
  echo "<p>Correo: $correo</p>";
} else {
  echo "<p>Acceso no permitido.</p>";
}
?>