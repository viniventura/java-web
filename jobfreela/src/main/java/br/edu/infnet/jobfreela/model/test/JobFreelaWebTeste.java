package br.edu.infnet.jobfreela.model.test;

import java.time.LocalDateTime;

import br.edu.infnet.jobfreela.model.domain.JobFreelaWeb;

public class JobFreelaWebTeste {

	public static void main(String[] args) {
		
		JobFreelaWeb jobFreelaWeb1 = new JobFreelaWeb(
				"E-commerce", 
				"E-commerce para venda de produtos de papelaria", 
				LocalDateTime.of(2022, 3, 12, 0, 0),  
				50);
		
		jobFreelaWeb1.setBrowsersSuportados(new String[] { "Chrome", "Opera" });
		jobFreelaWeb1.setIntegracoesAPIs(new String[] { "Google" });
		jobFreelaWeb1.setSiteResponsivo(true);
		jobFreelaWeb1.setPartePronta(false);
		System.out.println(jobFreelaWeb1);
		
		JobFreelaWeb jobFreelaWeb2 = new JobFreelaWeb(
				"Sistema de gerenciamento de pedidos", 
				"Sistema para gerenciamento de pedidos de lanchonete", 
				LocalDateTime.of(2022, 3, 12, 0, 0),  
				60);
		
		jobFreelaWeb2.setBrowsersSuportados(new String[] { "Chrome", "Firefox", "Microsoft Edge" });
		jobFreelaWeb2.setIntegracoesAPIs(null);
		jobFreelaWeb2.setSiteResponsivo(false);
		jobFreelaWeb2.setPartePronta(true);
		System.out.println("Valor hora do job freela: " + jobFreelaWeb2.calcularValorHoraJobFreela());
	}

}
