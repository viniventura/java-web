package br.edu.infnet.jobfreela.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class JobFreela {
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

	public String getDescricaoResumida() {
		return descricaoResumida;
	}

	public String getDescricaoCompleta() {
		return descricaoCompleta;
	}

	public LocalDateTime getDataPublicacao() {
		return dataPublicacao;
	}

	public float getValorHora() {
		return valorHora;
	}
}
