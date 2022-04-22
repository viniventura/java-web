package br.edu.infnet.jobfreela.model.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Freelancer")
public class Freelancer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String cpf;
	private String email;
	private LocalDateTime dataNascimento;
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	@OneToOne(mappedBy = "jobFreela")
	private PrestacaoServicoFreela prestacaoServicoFreela;
	
	public Freelancer() {
	}
	
	public Freelancer(String nome, String cpf, String email, String dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.dataNascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("uuuu-MM-dd")).atStartOfDay();
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
		
		return sb.toString();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("uuuu-MM-dd")).atStartOfDay();
	}
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}