<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registrar Cliente</title>
<!-- Agregar enlaces de Bootstrap -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/icons/bootstrap-icons.css"/>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

</head>
<body>
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-8">
                <h1 class="mb-4">Registrar Cliente</h1>
                
                <form:form method="post" modelAttribute="clienteBind" action="${pageContext.request.contextPath}/clientes/add" class="needs-validation" >
                     <div class="form-group">
                        <form:hidden path="id_cliente"/>
                    </div>
                    <div class="form-group">
                        <label for="cedula">Cédula:</label>
                        <form:input path="cedula" type="text" class="form-control"/>
                        <div class="invalid-feedback">
                            Por favor ingrese una cédula válida.
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="nombre">Nombre:</label>
                        <form:input path="nombre" type="text" class="form-control"/>
                        <div class="invalid-feedback">
                            Por favor ingrese un nombre válido.
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="apellido">Apellido:</label>
                        <form:input path="apellido" type="text" class="form-control"/>
                        <div class="invalid-feedback">
                            Por favor ingrese un apellido válido.
                        </div>
                    </div>
                    
                    <div class="form-group">
                        <label for="edad">Edad:</label>
                        <form:input path="edad" type="number" class="form-control"/>
                        <div class="invalid-feedback">
                            Por favor ingrese una edad válida.
						</div>
					</div>
					<div class="form-group">
					    <label for="fechaNacimiento">Fecha de nacimiento:</label>
					    <form:input path="fecha_nac" type="date" class="form-control" />
					    <div class="invalid-feedback">
					        Por favor ingrese una fecha de nacimiento válida.
					    </div>
					</div>
					<div class="form-group">
						<label for="Direccion">Dirección:</label>
						<form:input path="direccion" type="text" class="form-control"/>
						<div class="invalid-feedback">
							Por favor ingrese un email válido.
						</div>
					</div>	
					<div class="form-group">
						<label for="Telefono">Télefono:</label>
						<form:input path="telefono" type="text" class="form-control"/>
						<div class="invalid-feedback">
							Por favor ingrese un email válido.
						</div>
					</div>
					<div class="form-group">
						<label for="Correo">Email:</label>
						<form:input path="correo" type="email" class="form-control" />
						<div class="invalid-feedback">
							Por favor ingrese un email válido.
						</div>
					</div>
					<div class="form-group">
						<button type="submit" class="btn btn-primary">Registrar</button>
					</div>
				</form:form>
			</div>
		</div>
</div>

</body>
</html>