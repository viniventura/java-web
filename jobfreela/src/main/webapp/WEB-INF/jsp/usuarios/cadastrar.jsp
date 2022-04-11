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
		<h2>Cadastro de Usuários</h2>
		
		<form action="/usuarios/cadastrar" method="post">
		
			<div class="mt-3 mb-3">
		      <label for="nome" class="mb-2">Nome:</label>
		      <input type="text" class="form-control" name="nome" placeholder="Entre com o nome" value="Dona Maria das Dores">
		    </div>
		    
			<div class="mt-3 mb-3">
	      		<label for="email" class="mb-2">E-mail:</label>
	      		<input type="email" class="form-control" name="email" placeholder="Entre com o e-mail" value="maria@maria.com">
	    	</div>
	    	
	    	<div class="mt-3 mb-3">
		      <label for="senha" class="mb-2">Senha:</label>
		      <input type="password" class="form-control" name="senha" placeholder="Entre com a senha" value="123">
		    </div>
	    	
			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
	</div>
</body>
</html>