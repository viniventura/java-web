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

	<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" href="/">App de Gerenciamento de Jobs Freela</a>
	    </div>
	    <ul class="nav navbar-nav">
	      <li class="active"><a href="/">Home</a></li>
	      
	      <c:if test="${not empty usuarioLogado}">
		      <li><a href="/jobs-freela-app">Cadastrar jobs freelas de apps</a></li>
		      <li><a href="/jobs-freela-rev-texto">Cadastrar freelas de rev.de texto</a></li>
		      <li><a href="/jobs-freela-web">Cadastrar freelas web</a></li>
		      <li><a href="/freelancers">Cadastrar freelancers</a></li>
		      <li><a href="/prestacoes-servico">Cadastrar prest. de serviço freela</a></li>
	      </c:if>
	    </ul>
	    
	    <ul class="nav navbar-nav navbar-right">
	      <c:if test="${empty usuarioLogado}">
	      	<li><a href="/usuarios/cadastrar"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
	      	<li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
	      </c:if>
	      
	      <c:if test="${not empty usuarioLogado}">
	      	<li><a href="#"><span class="glyphicon glyphicon-log-out"></span> Logout, ${usuarioLogado.nome}</a></li>
	      </c:if>
	    </ul>
	  </div>
	</nav>
  
	<div class="container">
		<h4>App de Gestão de Trabalhos Freelancer</h4>
		<p>Olá!!</p>
	</div>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</body>
</html>