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
		<h2>Listar Prestações de Serviço Freela</h2>
		<form action="/prestacoes-servico/cadastrar">
			<button type="submit" class="btn btn-primary mt-3">Nova Prestação Serviço Freela</button>
		</form>
	
		<c:if test="${not empty prestacoesServico}">
			<p class="mt-3 mb-3">Listagem de Prestações de Serviço Freela (${prestacoesServico.size()}):</p>            
		  	<table class="table table-striped">
			    <thead>
			      <tr>
			      	<th>ID</th>
				  	<th>Descrição</th>
				    <th>Data Início</th>
				    <th>Data Fim</th>
			        <th>Em dia?</th>
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
				        <td><a href="/prestacoes-servico/${prestacaoServico.id}/excluir">Excluir</a></td>
				      </tr>
			      </c:forEach>
			    </tbody>
		  	</table>
		</c:if>
		
		<c:if test="${empty prestacoesServico}">
	  		<p class="mt-3">Nenhum registro localizado.</p>
	  	</c:if>
	</div>
</body>
</html>