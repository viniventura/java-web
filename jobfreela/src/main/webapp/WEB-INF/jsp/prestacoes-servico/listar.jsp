<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
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
		<h2>Listar Prestações de Serviço Freela</h2>
		<form action="/prestacoes-servico/cadastrar">
			<button type="submit" class="btn btn-primary">Nova Prestação Serviço Freela</button>
		</form>
	
		<c:if test="${not empty prestacoesServico}">
			<p class="form-group">Listagem de Prestações de Serviço Freela (${prestacoesServico.size()}):</p>            
		  	<table class="table table-striped">
			    <thead>
			      <tr>
			      	<th>ID</th>
				  	<th>Descrição</th>
				    <th>Data Início</th>
				    <th>Data Fim</th>
			        <th>Em dia?</th>
			        <th>Freelancer</th>
			        <th>Job Freela</th>
			        <th>Ação</th>
			      </tr>
			    </thead>
			    <tbody>
			    	<c:forEach var="prestacaoServico" items="${prestacoesServico}">
				      <tr>
				      	<td>${prestacaoServico.id}</td>
				        <td>${prestacaoServico.descricao}</td>
				        <td>
				        	<fmt:parseDate value="${prestacaoServico.dataInicio}" pattern="yyyy-MM-dd" var="parsedDataInicio" type="both" />
							<fmt:formatDate pattern="dd/MM/yyyy" value="${parsedDataInicio}" />
				        </td>
				        <td>
				        	<fmt:parseDate value="${prestacaoServico.dataFim}" pattern="yyyy-MM-dd" var="parsedDataFim" type="both" />
							<fmt:formatDate pattern="dd/MM/yyyy" value="${parsedDataFim}" />
				        </td>
				        <td>${prestacaoServico.emDia ? "Sim" : "Não"}</td>
				        <td>${prestacaoServico.freelancer.nome}</td>
				        <td>${prestacaoServico.jobFreela.descricaoResumida}</td>
				        <td><a href="/prestacoes-servico/${prestacaoServico.id}/excluir">Excluir</a></td>
				      </tr>
			      </c:forEach>
			    </tbody>
		  	</table>
		</c:if>
		
		<c:if test="${empty prestacoesServico}">
	  		<p class="form-group">Nenhum registro localizado.</p>
	  	</c:if>
	</div>
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</body>
</html>