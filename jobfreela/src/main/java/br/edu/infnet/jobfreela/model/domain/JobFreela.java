package br.edu.infnet.jobfreela.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class JobFreela {
	private Integer id;
	private String descricaoResumida;
	private String descricaoCompleta;
	private LocalDateTime dataPublicacao;
	private float valorHora;
	
	public JobFreela(String descricaoResumida, String descricaoCompleta, 
			LocalDateTime dataPublicacao, float valorHora) {
		this.descricaoResumida = descricaoResumida;
		this.descricaoCompleta = descricaoCompleta;
		this.dataPublicacao = dataPublicacao;
		this.valorHora = valorHora;
	}
	
	public abstract float calcularValorHoraJobFreela();
	
	@Override
	public String toString() {
		DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		StringBuilder sb = new StringBuilder();
		sb.append(descricaoResumida);
		sb.append(";");
		sb.append(descricaoCompleta);
		sb.append(";");
		sb.append(dataPublicacao.format(dateTimeFormat));
		sb.append(";");
		sb.append(valorHora);
		sb.append(";");
		sb.append(calcularValorHoraJobFreela());
		
		return sb.toString();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricaoResumida() {
		return descricaoResumida;
	}

	public void setDescricaoResumida(String descricaoResumida) {
		this.descricaoResumida = descricaoResumida;
	}

	public String getDescricaoCompleta() {
		return descricaoCompleta;
	}

	public void setDescricaoCompleta(String descricaoCompleta) {
		this.descricaoCompleta = descricaoCompleta;
	}

	public LocalDateTime getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(LocalDateTime dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
}
