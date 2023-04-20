<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css">
    <title>Formulario de registro</title>
</head>
<body>

<form>
    <label for="name">Nombre:</label>
    <input type="text" id="name" name="name" placeholder="Ingrese su Nombre" required pattern="[A-Za-z]¨{2,40}"> <br>

    <label for="lastName">Apellido:</label>
    <input type="text" id="lastName" name="lastName" placeholder="Ingrese su apellido" required pattern="[A-Za-z]¨{2,40}"> <br>

    <label for="email">Correo:</label>
    <input type="email" id="email" name="email" placeholder="Ingrese su Correo"  required pattern="{60}"> <br>

    <label for="password">Contraseña:</label>
    <input type="password" id="password" name="password" placeholder="Ingrese su Contraseña" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,16}" > <br>

    <button type="submit">Enviar</button>
</form>

</body>
</html>