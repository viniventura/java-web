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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PrestacaoServicoFreela")
public class PrestacaoServicoFreela {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String descricao;
	private LocalDateTime dataInicio;
	private LocalDateTime dataFim;
	private boolean emDia;
	
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "idJobFreela")
	private JobFreela jobFreela;
	
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "idFreelancer")
	private Freelancer freelancer;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	public PrestacaoServicoFreela() {
		this.dataInicio = LocalDateTime.now();
	}
			
	public PrestacaoServicoFreela(String dataFim) {
		this.dataInicio = LocalDateTime.now();
		this.dataFim =  LocalDate.parse(dataFim, DateTimeFormatter.ofPattern("uuuu-MM-dd")).atStartOfDay();
	}

	@Override
	public String toString() {
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
				
		return String.format("%s;%s;%s;%s", 
				descricao, 
				dataInicio.format(dateTimeFormat), 
				dataFim != null ? dataFim.format(dateTimeFormat) : "nulo",
				emDia ? "em dia": "atrasado"
		);
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDateTime getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDateTime getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = LocalDate.parse(dataFim, DateTimeFormatter.ofPattern("uuuu-MM-dd")).atStartOfDay();
	}
	
	public boolean isEmDia() {
		return emDia;
	}

	public void setEmDia(boolean emDia) {
		this.emDia = emDia;
	}

	public Freelancer getFreelancer() {
		return freelancer;
	}

	public void setFreelancer(Freelancer freelancer) {
		this.freelancer = freelancer;
	}

	public JobFreela getJobFreela() {
		return jobFreela;
	}

	public void setJobFreela(JobFreela jobFreela) {
		this.jobFreela = jobFreela;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}