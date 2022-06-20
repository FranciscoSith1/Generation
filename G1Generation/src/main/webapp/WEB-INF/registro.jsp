<%--
  Created by IntelliJ IDEA.
  User: Francisco Cid
  Date: 13-06-2022
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registro</title>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
            crossorigin="anonymous">
</head>
<body>
<div>
    <%--@elvariable id="usuario" type="com.generation.models.Usuario"--%>
    <c:if test="${msgError != null}">
        <c:out value="${msgError}"></c:out>
    </c:if>
    <form:form action="/registro/usuario" method="post" modelAttribute="usuario">
        <form:label path="nombre" class="form-label">Nombre:</form:label>
        <form:input type="text" class="form-control" path="nombre"/>
        <br>
        <form:label path="apellido" class="form-label">Apellido:</form:label>
        <form:input type="text" class="form-control" path="apellido"/>
        <br>
        <form:label path="edad" class="form-label">Edad:</form:label>
        <form:input type="number" class="form-control" path="edad"/>
        <br>
        <form:label path="password" class="form-label">Password:</form:label>
        <form:input type="password" class="form-control" path="password"/>
        <input type="submit" value="Registrar">
        <button type="submit" class="btn btn-outline-primary">Registrar</button>
    </form:form>
</div>
</body>
</html>
