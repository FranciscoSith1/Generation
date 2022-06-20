<%--
  Created by IntelliJ IDEA.
  User: Francisco Cid
  Date: 16-06-2022
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tabla de Usuarios</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
            crossorigin="anonymous">
</head>
<body>
<div class="container">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Nombre</th>
            <th scope="col">Apellido</th>
            <th scope="col">Edad</th>
            <th scope="col">Password</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="auto" items="${autosCapturados}">
            <tr>
                <th scope="row">${auto.id}</th>
                <td>${auto.marca}</td>
                <td>${auto.modelo}</td>
                <td>${auto.color}</td>
                <td>${auto.cilindrada}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
