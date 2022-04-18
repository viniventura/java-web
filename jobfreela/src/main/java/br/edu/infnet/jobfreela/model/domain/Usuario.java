package br.edu.infnet.jobfreela.model.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	private String senha;
	private boolean admin;
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<Freelancer> solicitantes;
	@OneToMany
	@JoinColumn(name = "idUsuario")
	private List<JobFreela> jobsFreelas;

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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public List<Freelancer> getSolicitantes() {
		return solicitantes;
	}
	public void setSolicitantes(List<Freelancer> solicitantes) {
		this.solicitantes = solicitantes;
	}
	public List<JobFreela> getJobsFreelas() {
		return jobsFreelas;
	}
	public void setJobsFreelas(List<JobFreela> jobsFreelas) {
		this.jobsFreelas = jobsFreelas;
	}
}
