<%--
  Created by IntelliJ IDEA.
  User: Francisco Cid
  Date: 13-06-2022
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Registro</title>
</head>
<body>
<div>
    <!--el form se usa para pasar info desde la vista hasta una url(action)-->
    <!--el metodo GET es por default, los parametros se ven en la ruta-->
    <!--El metodo POST los parametros no se ven, van ocultos -->
    <form action="/registro/usuario" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre">
        <br>
        <label for="apellido">Apellido:</label>
        <input type="text" id="apellido" name="apellido">
        <br>
        <label for="edad">Edad:</label>
        <input type="number" id="edad" name="edad">
        <br>
        <input type="submit" value="Registrar"> <!-- Submit para envio de informacion-->
        <input type="button" value="Enviar">
    </form>
</div>
</body>
</html>
