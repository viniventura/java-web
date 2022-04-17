<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<title>Sistema de Gerenciamento de Jobs Freela</title>
</head>
<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	
	<div class="container mt-3">
		<h2>Cadastro de Freelancers</h2>
		
		<form action="/freelancers/cadastrar" method="post">
		
			<div class="mt-3 mb-3">
		      <label for="nome" class="mb-2">Nome:</label>
		      <input type="text" class="form-control" name="nome" placeholder="Entre com o nome" value="Vinicius Santos Ventura">
		    </div>
		    
		    <div class="mt-3 mb-3">
		      <label for="cpf" class="mb-2">CPF:</label>
		      <input type="text" class="form-control" name="cpf" placeholder="Entre com o CPF" value="12345678901">
		    </div>
		    
			<div class="mt-3 mb-3">
	      		<label for="email" class="mb-2">E-mail:</label>
	      		<input type="email" class="form-control" name="email" placeholder="Entre com o e-mail" value="vini.ventura.ti@hotmail.com">
	    	</div>
	    	
	    	<div class="mt-3 mb-3">
	      		<label for="dataNascimento" class="mb-2">Data de nascimento:</label>
	      		<input type="date" class="form-control" name="dataNascimento" placeholder="Entre com a data de nascimento" value="1990-05-28">
	    	</div>
	    	
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</body>
</html>