package br.edu.infnet.jobfreela.model.test;

import java.time.LocalDateTime;

import br.edu.infnet.jobfreela.model.domain.JobFreelaApp;

public class JobFreelaAppTeste {

	public static void main(String[] args) {
		
		JobFreelaApp jobFreelaApp1 = new JobFreelaApp(
				"App de delivery", 
				"Novo app para entrega de bens de consumo", 
				LocalDateTime.of(2022, 3, 12, 0, 0),  
				80);
		
		jobFreelaApp1.setPlataformasSuportadas(new String[] { "iOS", "Android" });
		jobFreelaApp1.setIntegracoesAPIs(new String[] { "Google", "Facebook", "LinkedIn" });
		jobFreelaApp1.setPartePronta(false);
		System.out.println(jobFreelaApp1);
		
		JobFreelaApp jobFreelaApp2 = new JobFreelaApp(
				"App de geolocalização", 
				"App para rastreamento de automóveis", 
				LocalDateTime.of(2022, 3, 12, 0, 0),  
				80);
		
		jobFreelaApp2.setPlataformasSuportadas(new String[] { "iOS" });
		jobFreelaApp2.setIntegracoesAPIs(new String[] { "Twitter" });
		jobFreelaApp2.setPartePronta(true);
		System.out.println("Valor hora do job freela: " + jobFreelaApp2.calcularValorHoraJobFreela());
	}

}
