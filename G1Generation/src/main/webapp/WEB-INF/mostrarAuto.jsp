<%--
  Created by IntelliJ IDEA.
  User: Francisco Cid
  Date: 16-06-2022
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Auto</title>
</head>
<body>
<h1>Hola</h1>
<h2>
    <div>
        <!-- RECORRIENDO EL ARREGLO DE AUTOS -->
        <c:forEach var="auto" items="${autosCapturados}">
            <p>${auto.marca} ${auto.modelo} ${auto.cilindrada} ${auto.color}</p>
            <br>
        </c:forEach>
    </div>
</h2>
</body>
</html>
