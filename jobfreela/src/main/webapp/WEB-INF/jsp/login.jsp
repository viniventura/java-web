<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
  <h2>Autenticação</h2>
  
  <c:if test="${not empty msgErroLogin}">
	  <div class="alert alert-warning">
	    <strong>Problemas na autenticação!</strong> ${msgErroLogin}
	  </div>
  </c:if>
  
  <form action="/login" method="post">
    <div class="mb-3 mt-3">
      <label for="email">Email:</label>
      <input type="email" class="form-control" placeholder="Informe o seu e-mail" name="email">
    </div>
    
    <div class="mb-3">
      <label for="senha">Password:</label>
      <input type="password" class="form-control" placeholder="Informe a sua senha" name="senha">
    </div>
    
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>
</body>
</html>