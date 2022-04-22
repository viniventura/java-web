<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
		<h2>Listar Usuários</h2>

		<c:if test="${not empty usuarios}">
			<p class="form-group">Listagem de Usuários (${usuarios.size()}):</p>            
		  	<table class="table table-striped">
			    <thead>
			      <tr>
			      	<th>ID</th>
				  	<th>Nome</th>
				    <th>E-mail</th>
			        <th>Freelancers</th>
			        <th>Jobs Freela</th>
			        <th>Prestações de Serviço</th>
			        <c:if test="${usuarioLogado.admin}">
			        	<th>Ação</th>
			        </c:if>
			      </tr>
			    </thead>
			    <tbody>
			    	<c:forEach var="usuario" items="${usuarios}">
				      <tr>
				      	<td>${usuario.id}</td>
				        <td>${usuario.nome}</td>
				        <td>${usuario.email}</td>
				        <td>${usuario.freelancers.size()}</td>
				        <td>${usuario.jobsFreela.size()}</td>
				        <td>${usuario.prestacoesServicoFreela.size()}</td>
				        <c:if test="${usuarioLogado.admin}">
				        	<td><a href="/usuarios/${usuario.id}/excluir">Excluir</a></td>
				        </c:if>
				      </tr>
			      </c:forEach>
			    </tbody>
		  	</table>
		</c:if>
		
		<c:if test="${empty usuarios}">
	  		<p class="form-group">Nenhum registro localizado.</p>
	  	</c:if>
	</div>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</body>
</html>