package br.edu.infnet.jobfreela.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Freelancer {
	private String nome;
	private String cpf;
	private String email;
	private LocalDateTime dataNascimento;
	
	private List<PrestacaoServicoFreela> servicosFreela;
	
	public Freelancer(String nome, String cpf, String email, LocalDateTime dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString() {
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");
		sb.append(cpf);
		sb.append(";");
		sb.append(email);
		sb.append(";");
		sb.append(dataNascimento.format(dateTimeFormat));
		sb.append(";");
		sb.append(servicosFreela.size());
		
		return sb.toString();
	}
	
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEmail() {
		return email;
	}

	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}

	public List<PrestacaoServicoFreela> getServicosFreela() {
		return servicosFreela;
	}
	
	public void setServicosFreela(List<PrestacaoServicoFreela> servicosFreela) {
		this.servicosFreela = servicosFreela;
	}
}
