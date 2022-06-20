<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Francisco Cid Segovia</title>
</head>
<body>
<h1>Hola <c:out value="${Nombres}"></c:out> <c:out value="${apellidos}" ></c:out></h1>
<h2> <c:out value="${Edad}"></c:out> </h2>
<br>
<p> <c:out value= "${usuario.nombre} ${usuario.apellido} ${usuario.getEdad()}"></c:out> </p>
</body>
</html>