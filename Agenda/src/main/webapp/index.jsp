<!doctype html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<title>En la Web de KAAF</title>
	
	<link rel="stylesheet" href="/Agenda/resources/css/cssLayout.css">
	<link rel="stylesheet" href="/Agenda/resources/css/cssComponente.css">
	<link rel="stylesheet" href="/Agenda/resources/css/jquery-ui.min.css">
	
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
		<label class="label">Este es mi label</label>
		<input type="text" class="text" id="txt1">
		<br>
		
		<label class="label">Este es mi label</label>
		<input type="password" class="password">
		<br>
		
		<label class="label">Este es mi label</label>
		<textarea class="textArea"></textarea>
		<br>
		
		<label class="label">Este es mi label</label>
		<select class="select">
			<option>Item 1</option>
		</select>
		<br>
		
		<label class="label">Este es mi label</label>
		<table class="table">
			<thead>
				<tr>
					<td>Cabecera 1</td>
					<td>Cabecera 2</td>
					<td>Cabecera 3</td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Item 1</td>
					<td>Item 2</td>
					<td>Item 3</td>
				</tr>
				<tr>
					<td>Item 1</td>
					<td>Item 2</td>
					<td>Item 3</td>
				</tr>
			</tbody>
		</table>
		<br>
		
		<input type="button" value="Este es un botón" class="button" onclick="prueba();">
		<div id="divDialogo">Dialogo</div>
	</section>
</body>
<script>
	function prueba()
	{
		alert($('#txt1').val());
		$('#divDialogo').dialog();
	}
</script>
</html>
