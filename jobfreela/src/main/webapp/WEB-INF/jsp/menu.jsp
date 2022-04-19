<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" href="/">App de Gerenciamento de Jobs Freela</a>
	    </div>
	    <ul class="nav navbar-nav">
	      <li class="active"><a href="/">Home</a></li>
	      
	      <c:if test="${not empty usuarioLogado}">
	      	  <li><a href="/usuarios">Usuários</a></li>
	      	  <li><a href="/jobs-freela">Jobs Freela</a></li>
		      <li><a href="/jobs-freela-app">Jobs freelas de apps</a></li>
		      <li><a href="/jobs-freela-rev-texto">Jobs freelas de rev. de texto</a></li>
		      <li><a href="/jobs-freela-web">Jobs freelas web</a></li>
		      <li><a href="/freelancers">Freelancers</a></li>
		      <li><a href="/prestacoes-servico">Prest. de serviço freela</a></li>
	      </c:if>
	    </ul>
	    
	    <ul class="nav navbar-nav navbar-right">
	      <c:if test="${empty usuarioLogado}">
	      	<li><a href="/usuarios/cadastrar"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
	      	<li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
	      </c:if>
	      
	      <c:if test="${not empty usuarioLogado}">
	      	<li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Logout, ${usuarioLogado.nome}</a></li>
	      </c:if>
	    </ul>
	  </div>
	</nav>
