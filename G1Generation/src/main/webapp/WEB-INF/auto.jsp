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
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
            crossorigin="anonymous">
</head>
<body>
<h1>Hola</h1>
<h2>
    <div>
        <%--@elvariable id="auto" type="Auto"--%>
        <form:form action="/auto/guardar" method="post" modelAttribute="auto">
            <form:label path="marca" class="form-label">Marca:</form:label>
            <form:input type="text" class="form-control" path="marca"/>
            <br>
            <form:label path="modelo" class="form-label">Modelo:</form:label>
            <form:input type="text" class="form-control" path="modelo"/>
            <br>
            <form:label path="color" class="form-label">Color:</form:label>
            <form:input type="text" class="form-control" path="color"/>
            <br>
            <form:label path="cilindrada" class="form-label">Cilindrada:</form:label>
            <form:input type="text" class="form-control" path="cilindrada"/>
            <br>
            <input type="submit" value="Guardar Auto">
            <br>
            <button type="submit" class="btn btn-outline-primary">Guardar Auto</button>
        </form:form>
    </div>
</h2>
</body>
</html>
