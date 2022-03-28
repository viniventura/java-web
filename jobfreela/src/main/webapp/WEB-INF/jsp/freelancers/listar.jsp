<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
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
		<h2>Listar Freelancers</h2>
		<form action="/freelancers/cadastrar">
			<button type="submit" class="btn btn-primary mt-3">Novo Freelancer</button>
		</form>
	
		<c:if test="${not empty freelancers}">
			<p class="mt-3 mb-3">Listagem de Freelancers (${freelancers.size()}):</p>            
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
	  		<p class="mt-3">Nenhum registro localizado.</p>
	  	</c:if>
	</div>
</body>
</html>