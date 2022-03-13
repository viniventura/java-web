package br.edu.infnet.jobfreela.model.test;

import br.edu.infnet.jobfreela.model.domain.JobFreelaWeb;

import java.time.LocalDateTime;

import br.edu.infnet.jobfreela.model.domain.JobFreelaApp;
import br.edu.infnet.jobfreela.model.domain.JobFreelaRevisaoTexto;

public class JobFreelaTeste {
	
	public static void main(String[] args) {
		JobFreelaWeb jobFreelaWeb = new JobFreelaWeb(
				"Site web", 
				"Manutenção site web em Wordpress", 
				LocalDateTime.of(2022, 3, 13, 0, 0), 
				50);
		jobFreelaWeb.setBrowsersSuportados(new String[] { "Chrome", "Opera" });
		jobFreelaWeb.setIntegracoesAPIs(new String[] { "Google" });
		jobFreelaWeb.setSiteResponsivo(true);
		jobFreelaWeb.setPartePronta(false);
		System.out.println(jobFreelaWeb);
		
		JobFreelaApp jobFreelaApp = new JobFreelaApp(
				"App de delivery", 
				"Novo app para entrega de bens de consumo", 
				LocalDateTime.of(2022, 3, 12, 0, 0),  
				80);
		jobFreelaApp.setPlataformasSuportadas(new String[] { "iOS", "Android" });
		jobFreelaApp.setIntegracoesAPIs(new String[] { "Google", "Facebook", "LinkedIn" });
		jobFreelaApp.setPartePronta(false);
		System.out.println(jobFreelaApp);
		
		JobFreelaRevisaoTexto jobFreelaRevTexto = new JobFreelaRevisaoTexto(
				"Revisão de texto", 
				"Revisão de trecho de monografia",
				LocalDateTime.of(2022, 3, 11, 0, 0),  
				30);
		jobFreelaRevTexto.setIdiomaTextoOrigem("Português");
		jobFreelaRevTexto.setIdiomaTextoDestino("Inglês");
		jobFreelaRevTexto.setQtdMediaPalavras(2000);
		System.out.println(jobFreelaRevTexto);
	}
}
