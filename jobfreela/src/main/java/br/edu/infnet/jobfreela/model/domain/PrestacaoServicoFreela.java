package br.edu.infnet.jobfreela.model.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PrestacaoServicoFreela {
	private Integer id;
	private String descricao;
	private LocalDateTime dataInicio;
	private LocalDateTime dataFim;
	private boolean emDia;
	
	private Freelancer freelancer;
	private JobFreela jobFreela;
	
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
}
