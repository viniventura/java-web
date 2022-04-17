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
		<h2>Cadastro de Prestações de Serviço Freela</h2>
		
		<form action="/prestacoes-servico/cadastrar" method="post">
		
			<div class="mt-3 mb-3">
		      <label for="descricao" class="mb-2">Descrição:</label>
		      <input type="text" class="form-control" name="descricao" placeholder="Entre com a descrição">
		    </div>
	    	
	    	<div class="mt-3 mb-3">
	      		<label for="dataFim" class="mb-2">Data fim:</label>
	      		<input type="date" class="form-control" name="dataFim" placeholder="Entre com a data fim">
	    	</div>
		    
		    <div class="mt-3 mb-3 form-check">
			    <input type="checkbox" class="form-check-input" name="emDia" value="true">
			    <label class="form-check-label" for="emDia">Em dia?</label>
		  	</div>
		  	
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</body>
</html>