<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/icons/bootstrap-icons.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>

    <title>Eliminar Clientes</title>
</head>
<body>
    <div class="container d-flex justify-content-center align-items-center vh-100">
        <div class="card">
            <div class="card-body">
                <form:form action="del" modelAttribute="clienteBind" method="GET">
                    <form:hidden path="id_cliente" />
                    <div class="text-center">
                        <p class="lead mb-4">
                            ¿Estás seguro de que deseas eliminar al cliente ${clienteBind.nombre}?
                        </p>
                        <button type="submit" class="btn btn-danger mx-3">
                            <i class="bi bi-trash"></i> Eliminar
                        </button>
                        <button type="button" class="btn btn-primary mx-3" onclick="window.location.href='${pageContext.request.contextPath}/clientes/listadoClientes'">
                            <i class="bi bi-arrow-left"></i> Volver
                        </button>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</body>
</html>
