package br.edu.infnet.jobfreela.model.test;

import java.time.LocalDateTime;

import br.edu.infnet.jobfreela.model.domain.Freelancer;
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
		
		PrestacaoServicoFreela prestacaoServico = new PrestacaoServicoFreela();
		prestacaoServico.setDescricao("Descrição da prestação de serviço");
		prestacaoServico.setEmDia(true);
		
		prestacaoServico.setFreelancer(freelancer);
		prestacaoServico.setJobFreela(null);
		
		System.out.println(prestacaoServico);
	}
}
