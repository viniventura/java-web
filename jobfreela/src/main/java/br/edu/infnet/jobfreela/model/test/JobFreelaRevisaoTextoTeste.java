package br.edu.infnet.jobfreela.model.test;

import java.time.LocalDateTime;

import br.edu.infnet.jobfreela.model.domain.JobFreelaRevisaoTexto;

public class JobFreelaRevisaoTextoTeste {

	public static void main(String[] args) {
		
		JobFreelaRevisaoTexto jobFreelaRevTexto1 = new JobFreelaRevisaoTexto(
				"Tradução de monografia", 
				"Tradução de monografia de português para o inglês", 
				LocalDateTime.of(2022, 3, 12, 0, 0),  
				50);
		
		jobFreelaRevTexto1.setIdiomaTextoOrigem("Português");
		jobFreelaRevTexto1.setIdiomaTextoDestino("Inglês");
		jobFreelaRevTexto1.setQtdMediaPalavras(2000);
		System.out.println(jobFreelaRevTexto1);
		
		JobFreelaRevisaoTexto jobFreelaRevTexto2 = new JobFreelaRevisaoTexto(
				"Revisão de texto", 
				"Revisão de texto para manchete jornalística", 
				LocalDateTime.of(2022, 3, 12, 0, 0),  
				30);
		
		jobFreelaRevTexto2.setIdiomaTextoOrigem("Português");
		jobFreelaRevTexto2.setIdiomaTextoDestino("Português");
		jobFreelaRevTexto2.setQtdMediaPalavras(700);
		System.out.println("Valor hora do job freela: " + jobFreelaRevTexto2.calcularValorHoraJobFreela());

	}

}
