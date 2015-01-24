<!doctype html>
<html lang="es">
<head>
<meta charset="UTF-8">
<title>En la Web de KAAF</title>

<link rel="stylesheet" href="/Agenda/resources/css/cssLayout.css">
<link rel="stylesheet"
	href="/Agenda/resources/css/cssComponente.css">
<link rel="stylesheet"
	href="/Agenda/resources/css/jquery-ui.min.css">

<script src="/Agenda/resources/js/jquery-2.1.3.min.js"></script>
<script src="/Agenda/resources/js/jquery-ui.min.js"></script>
</head>
<body>
	<header>
		<nav class="menu">
			<ul>
				<li><a href="#">Inicio</a></li>
				<li><a href="#">Registrar datos en el sistema</a></li>
				<li><a href="#">Ver los datos registrados</a></li>
			</ul>
		</nav>
	</header>
	<section>
		<form id="frmInsertarUsuario" action="/Agenda/ServletUsuarioInsertar"
			method="post">
			<h2>Insertar Usuario</h2>
			<label for="txtNombre" class="label">Nombre:</label> <input
				type="text" id="txtNombre" name="txtNombre" class="text"> <br />

			<label for="txtApellido" class="label">Apellido:</label> <input
				type="text" id="txtApellido" name="txtApellido" class="text">
			<br /> <label for="dateFechaNacimiento" class="label">Nombre:</label>
			<input type="date" id="dateFechaNacimiento"
				name="dateFechaNacimiento" class="text"> <br /> <label
				for="txtCorreoElectronico" class="label">Correo Electronico:</label>
			<input type="text" id="txtCorreoElectronico"
				name="txtCorreoElectronico" class="text"> <br /> <label
				for="txtPassword" class="label">Password:</label> <input
				type="password" id="txtPassword" name="txtPassword" class="password">
			<br />
			<input type="submit" value="Insertar" class="button">

		</form>

	</section>
</body>

</html>