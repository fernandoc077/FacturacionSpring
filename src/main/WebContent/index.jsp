<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.jsp.PageContext" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/icons/bootstrap-icons.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

<title>Sistema de Facturacion</title>
</head>
<body>
		<div class="container">
		  <h1>Practicas Ismac </h1>
		</div>
		<div class="btn-group center" role="group">
		  <a href="${pageContext.request.contextPath}/clientes/listadoClientes" class="btn btn-primary">Clientes</a>
		  <a href="${pageContext.request.contextPath}/productos" class="btn btn-primary">Productos</a>
		  <a href="${pageContext.request.contextPath}/Acerca de" class="btn btn-primary">Acerca de</a>
		</div>
		
<!-- 		<iframe title="PRACTICA" width="1140" height="541.25" src="https://app.powerbi.com/reportEmbed?reportId=fa37c182-bab3-4035-9fb7-a979d9147a0d&autoAuth=true&ctid=5489579d-44b5-4792-af49-e9be4633a3d5" frameborder="0" allowFullScreen="true"></iframe> -->
		
	
</body>
</html>