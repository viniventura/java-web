package br.edu.infnet.jobfreela.model.test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.jobfreela.model.domain.Freelancer;
import br.edu.infnet.jobfreela.model.domain.JobFreelaApp;
import br.edu.infnet.jobfreela.model.domain.PrestacaoServicoFreela;

public class PrestacaoServicoFreelaTeste {
	public static void main(String[] args) {
		Freelancer freelancer = 
				new Freelancer(
					"Vinicius", 
					"12345678901", 
					"vini.ventura.ti@hotmail.com", 
					LocalDateTime.of(1990, 5, 28, 0, 0)
		);
		
		JobFreelaApp jobFreelaApp = new JobFreelaApp(
				"App de delivery", 
				"Novo app para entrega de bens de consumo", 
				LocalDateTime.of(2022, 3, 12, 0, 0),  
				80);
		
		jobFreelaApp.setPlataformasSuportadas(new String[] { "iOS", "Android" });
		jobFreelaApp.setIntegracoesAPIs(new String[] { "Google", "Facebook", "LinkedIn" });
		jobFreelaApp.setPartePronta(false);
		
		PrestacaoServicoFreela prestacaoServico = new PrestacaoServicoFreela();
		prestacaoServico.setDescricao("Descrição da prestação de serviço 1");
		prestacaoServico.setDataFim(LocalDateTime.of(2022, 6, 30, 0, 0));
		prestacaoServico.setEmDia(true);
		
		prestacaoServico.setFreelancer(freelancer);
		prestacaoServico.setJobFreela(jobFreelaApp);
		
		System.out.println(prestacaoServico);
	}
}
