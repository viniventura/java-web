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
		<h2>Listar Jobs Freela de Apps</h2>
		<form action="/jobs-freela-app/cadastrar">
			<button type="submit" class="btn btn-primary mt-3">Novo Job Freela App</button>
		</form>
	
		<c:if test="${not empty jobsFreelaApp}">
			<p class="mt-3 mb-3">Listagem de Jobs Freela de Apps (${jobsFreelaApp.size()}):</p>            
		  	<table class="table table-striped">
			    <thead>
			      <tr>
			      	<th>ID</th>
				  	<th>Descrição Resumida</th>
				    <th>Data de Publicação</th>
				    <th>Valor Hora</th>
			        <th>Plataformas Suportadas</th>
			        <th>Integrações com APIs</th>
			        <th>Parte Pronta?</th>
			        <th>Ação</th>
			      </tr>
			    </thead>
			    <tbody>
			    	<c:forEach var="job" items="${jobsFreelaApp}">
				      <tr>
				      	<td>${job.id}</td>
				        <td>${job.descricaoResumida}</td>
				        <td>
				        	<fmt:parseDate value="${job.dataPublicacao}" pattern="yyyy-MM-dd" var="parsedDataPublicacao" type="both" />
							<fmt:formatDate pattern="dd/MM/yyyy" value="${parsedDataPublicacao}" />
				        </td>
				        <td>${job.valorHora}</td>
				        <td>${fn:join(job.plataformasSuportadas, ", ")}</td>
				        <td>${fn:join(job.integracoesAPIs, ", ")}</td>
				        <td>${job.partePronta ? "Sim" : "Não"}</td>
				        <td><a href="/jobs-freela-app/${job.id}/excluir">Excluir</a></td>
				      </tr>
			      </c:forEach>
			    </tbody>
		  	</table>
		</c:if>
		
		<c:if test="${empty jobsFreelaApp}">
	  		<p class="mt-3">Nenhum registro localizado.</p>
	  	</c:if>
	</div>
</body>
</html>