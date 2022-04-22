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
	
	<div class="container">
		<h2>Cadastro de Usuários</h2>
		
		<form action="/usuarios/cadastrar" method="post">
		
			<div class="form-group">
		      <label for="nome" class="mb-2">Nome:</label>
		      <input type="text" class="form-control" name="nome" placeholder="Entre com o nome" value="Dona Maria das Dores">
		    </div>
		    
			<div class="form-group">
	      		<label for="email" class="mb-2">E-mail:</label>
	      		<input type="email" class="form-control" name="email" placeholder="Entre com o e-mail" value="maria@maria.com">
	    	</div>
	    	
	    	<div class="form-group">
		      <label for="senha" class="mb-2">Senha:</label>
		      <input type="password" class="form-control" name="senha" placeholder="Entre com a senha" value="123">
		    </div>
	    	
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</body>
</html>