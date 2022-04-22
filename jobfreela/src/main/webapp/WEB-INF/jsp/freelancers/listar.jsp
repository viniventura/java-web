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
		<h2>Listar Freelancers</h2>
		<form action="/freelancers/cadastrar">
			<button type="submit" class="btn btn-primary">Novo Freelancer</button>
		</form>
	
		<c:if test="${not empty freelancers}">
			<p class="form-group">Listagem de Freelancers (${freelancers.size()}):</p>            
		  	<table class="table table-striped">
			    <thead>
			      <tr>
			      	<th>ID</th>
				  	<th>Nome</th>
				    <th>CPF</th>
				    <th>E-mail</th>
				    <th>Data de Nascimento</th>
			        <th>Ação</th>
			      </tr>
			    </thead>
			    <tbody>
			    	<c:forEach var="freelancer" items="${freelancers}">
				      <tr>
				      	<td>${freelancer.id}</td>
				        <td>${freelancer.nome}</td>
				        <td>${freelancer.cpf}</td>
				        <td>${freelancer.email}</td>
				        <td>
				        	<fmt:parseDate value="${freelancer.dataNascimento}" pattern="yyyy-MM-dd" var="parsedDataNascimento" type="both" />
							<fmt:formatDate pattern="dd/MM/yyyy" value="${parsedDataNascimento}" />
				        </td>
				        <td><a href="/freelancers/${freelancer.id}/excluir">Excluir</a></td>
				      </tr>
			      </c:forEach>
			    </tbody>
		  	</table>
		</c:if>
		
		<c:if test="${empty freelancers}">
	  		<p class="form-group">Nenhum registro localizado.</p>
	  	</c:if>
	</div>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</body>
</html>