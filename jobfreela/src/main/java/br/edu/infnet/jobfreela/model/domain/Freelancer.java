package br.edu.infnet.jobfreela.model.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Freelancer {
	String nome;
	String cpf;
	String email;
	LocalDateTime dataNascimento;
	
	private List<PrestacaoServicoFreela> servicosFreela;
}
