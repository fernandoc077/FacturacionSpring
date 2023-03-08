<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Clientes</title>
    <!-- Referencias a archivos de recursos -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-3.6.3.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
    <!-- Referencia a la librería Font Awesome -->
	<script src="https://kit.fontawesome.com/136d2c5ad1.js" crossorigin="anonymous"></script>
</head>
<body>
		<div class="row">
	        <div class="col text-center">
				<h1 style="text-align: center;"><i class="fas fa-users text-success me-2"></i>CLIENTES</h1>
	        
	        </div>
         </div>
<div class="container position-relative">
    
   
    <div class="row mb-4">
        <div class="col">
            <div class="float-end">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/clientes/addForm">Agregar Cliente</a>
        </div>
            <table class="table table-striped table-hover">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Cédula</th>
                        <th>Nombre</th>
                        <th>Apellido</th>
                        <th>Edad</th>
                        <th>Fecha de Nacimiento</th>
                        <th>Dirección</th>
                        <th>Teléfono</th>
                        <th>E-mail</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="cliente" items="${keyClientes}" varStatus="status">
                        <tr class="table-${status.index % 2 == 0 ? 'primary' : 'info'}">
                            <td>${cliente.id_cliente}</td>
                            <td>${cliente.cedula}</td>
                            <td>${cliente.nombre}</td>
                            <td>${cliente.apellido}</td>
                            <td>${cliente.edad}</td>
                            <td>${cliente.fecha_nac}</td>
                            <td>${cliente.direccion}</td>
                            <td>${cliente.telefono}</td>
                            <td>${cliente.correo}</td>
                            <td>
                                <div class="btn-group" role="group">
                                       <button type="button" class="btn btn-success" onclick="window.location.href='${pageContext.request.contextPath}/clientes/findOne?id_cliente=${cliente.id_cliente}&opcion=0'">Editar</button>
                                    <button type="button" class="btn btn-danger" onclick="window.location.href='${pageContext.request.contextPath}/clientes/findOne?id_cliente=${cliente.id_cliente}&opcion=1'">Eliminar</button>
                                </div>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>


