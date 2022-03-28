<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt">
<head>
<meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Sistema de Gerenciamento de Jobs Freela</title>
</head>
<body>
	<div class="container mt-3">
		<h2>Cadastro de Jobs Freelancers de Revisão de Texto</h2>
		
		<form action="/jobs-freela-rev-texto/cadastrar" method="post">
		
			<div class="mt-3 mb-3">
		      <label for="descricaoResumida" class="mb-2">Descrição resumida:</label>
		      <input type="text" class="form-control" name="descricaoResumida" placeholder="Entre com a descrição resumida">
		    </div>
		    
		    <div class="mt-3 mb-3">
		      <label for="descricaoCompleta" class="mb-2">Descrição completa:</label>
		      <textarea class="form-control" name="descricaoCompleta" rows="3" placeholder="Entre com a descrição completa"></textarea>
		    </div>
		    
			<div class="mt-3 mb-3">
	      		<label for="valorHora" class="mb-2">Valor hora:</label>
	      		<input type="text" class="form-control" name="valorHora" placeholder="Entre com o valor hora a ser pago pelo job">
	    	</div>
			
			<div class="mt-3 mb-3">
		      <label for="idiomaTextoOrigem" class="mb-2">Idioma do texto de origem:</label>
		      <input type="text" class="form-control" name="idiomaTextoOrigem" placeholder="Entre com o idioma do texto de origem">
		    </div>
		    
		    <div class="mt-3 mb-3">
		      <label for="idiomaTextoDestino" class="mb-2">Idioma do texto de destino:</label>
		      <input type="text" class="form-control" name="idiomaTextoDestino" placeholder="Entre com o idioma do texto de destino">
		    </div>
		    
		    <div class="mt-3 mb-3">
		      <label for="qtdMediaPalavras" class="mb-2">Quantidade média de palavras:</label>
		      <input type="text" class="form-control" name="qtdMediaPalavras" placeholder="Entre com a quantidade média de palavras">
		    </div>
				
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>