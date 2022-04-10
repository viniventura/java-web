package br.edu.infnet.jobfreela.model.test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.jobfreela.model.domain.Freelancer;
import br.edu.infnet.jobfreela.model.domain.JobFreelaApp;
import br.edu.infnet.jobfreela.model.domain.JobFreelaRevisaoTexto;
import br.edu.infnet.jobfreela.model.domain.JobFreelaWeb;
import br.edu.infnet.jobfreela.model.domain.PrestacaoServicoFreela;

public class FreelancerTeste {

	public static void main(String[] args) {
		
		JobFreelaApp jobFreelaApp = new JobFreelaApp(
				"App de delivery", 
				"Novo app para entrega de bens de consumo", 
				LocalDateTime.of(2022, 3, 12, 0, 0),  
				80);
		
		jobFreelaApp.setPlataformasSuportadas(new String[] { "iOS", "Android" });
		jobFreelaApp.setIntegracoesAPIs(new String[] { "Google", "Facebook", "LinkedIn" });
		jobFreelaApp.setPartePronta(false);
		
		JobFreelaRevisaoTexto jobFreelaRevTexto = new JobFreelaRevisaoTexto(
				"Tradução de monografia", 
				"Tradução de monografia de português para o inglês", 
				LocalDateTime.of(2022, 3, 12, 0, 0),  
				50);
		
		jobFreelaRevTexto.setIdiomaTextoOrigem("Português");
		jobFreelaRevTexto.setIdiomaTextoDestino("Inglês");
		jobFreelaRevTexto.setQtdMediaPalavras(2000);
		
		JobFreelaWeb jobFreelaWeb = new JobFreelaWeb(
				"E-commerce", 
				"E-commerce para venda de produtos de papelaria", 
				LocalDateTime.of(2022, 3, 12, 0, 0),  
				50);
		
		jobFreelaWeb.setBrowsersSuportados(new String[] { "Chrome", "Opera" });
		jobFreelaWeb.setIntegracoesAPIs(new String[] { "Google" });
		jobFreelaWeb.setSiteResponsivo(true);
		jobFreelaWeb.setPartePronta(false);
		
		Freelancer freelancer = 
				new Freelancer(
					"Vinicius", 
					"12345678901", 
					"vini.ventura.ti@hotmail.com", 
					"28/05/1990"
		);
		
		PrestacaoServicoFreela prestacaoServico1 = new PrestacaoServicoFreela("31/12/2022");
		prestacaoServico1.setDescricao("Descrição da prestação de serviço 1");
		prestacaoServico1.setEmDia(true);
		prestacaoServico1.setFreelancer(freelancer);
		prestacaoServico1.setJobFreela(jobFreelaApp);
		
		PrestacaoServicoFreela prestacaoServico2 = new PrestacaoServicoFreela("31/12/2022");
		prestacaoServico2.setDescricao("Descrição da prestação de serviço 2");
		prestacaoServico2.setEmDia(false);
		prestacaoServico2.setFreelancer(freelancer);
		prestacaoServico2.setJobFreela(jobFreelaRevTexto);
		
		PrestacaoServicoFreela prestacaoServico3 = new PrestacaoServicoFreela("31/12/2022");
		prestacaoServico3.setDescricao("Descrição da prestação de serviço 3");
		prestacaoServico3.setEmDia(true);
		prestacaoServico3.setFreelancer(freelancer);
		prestacaoServico3.setJobFreela(jobFreelaWeb);
		
		List<PrestacaoServicoFreela> servicosFreela = new ArrayList<PrestacaoServicoFreela>();
		servicosFreela.add(prestacaoServico1);
		servicosFreela.add(prestacaoServico2);
		servicosFreela.add(prestacaoServico3);
		
		//freelancer.setServicosFreela(servicosFreela);
		
		System.out.println(freelancer);
	}

}
