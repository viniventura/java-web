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
		<h2>Cadastro de Jobs Freelancers de Revisão de Texto</h2>
		
		<form action="/jobs-freela-rev-texto/cadastrar" method="post">
		
			<div class="form-group">
		      <label for="descricaoResumida" class="mb-2">Descrição resumida:</label>
		      <input type="text" class="form-control" name="descricaoResumida" placeholder="Entre com a descrição resumida">
		    </div>
		    
		    <div class="form-group">
		      <label for="descricaoCompleta" class="mb-2">Descrição completa:</label>
		      <textarea class="form-control" name="descricaoCompleta" rows="3" placeholder="Entre com a descrição completa"></textarea>
		    </div>
		    
			<div class="form-group">
	      		<label for="valorHora" class="mb-2">Valor hora:</label>
	      		<input type="text" class="form-control" name="valorHora" placeholder="Entre com o valor hora a ser pago pelo job">
	    	</div>
			
			<div class="form-group">
		      <label for="idiomaTextoOrigem" class="mb-2">Idioma do texto de origem:</label>
		      <input type="text" class="form-control" name="idiomaTextoOrigem" placeholder="Entre com o idioma do texto de origem">
		    </div>
		    
		    <div class="form-group">
		      <label for="idiomaTextoDestino" class="mb-2">Idioma do texto de destino:</label>
		      <input type="text" class="form-control" name="idiomaTextoDestino" placeholder="Entre com o idioma do texto de destino">
		    </div>
		    
		    <div class="form-group">
		      <label for="qtdMediaPalavras" class="mb-2">Quantidade média de palavras:</label>
		      <input type="text" class="form-control" name="qtdMediaPalavras" placeholder="Entre com a quantidade média de palavras">
		    </div>
				
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</body>
</html>