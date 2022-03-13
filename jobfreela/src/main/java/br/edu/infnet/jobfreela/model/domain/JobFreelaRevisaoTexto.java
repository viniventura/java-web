package br.edu.infnet.jobfreela.model.domain;

import java.time.LocalDateTime;

public class JobFreelaRevisaoTexto extends JobFreela {
	private String idiomaTextoOrigem;
	private String idiomaTextoDestino;
	private int qtdMediaPalavras;
	
	private PrestacaoServicoFreela prestacaoServicoFreela;
	
	public JobFreelaRevisaoTexto(String descricaoResumida, String descricaoCompleta, 
			LocalDateTime dataPublicacao, float valorHora) {
		super(descricaoResumida, descricaoCompleta, dataPublicacao, valorHora);
	}
	
	@Override
	public float calcularValorHoraJobFreela() {
		return getValorHora() * 1.25f * (qtdMediaPalavras > 1000 ? 1.2f : 1);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(idiomaTextoOrigem);
		sb.append(";");
		sb.append(idiomaTextoDestino);
		sb.append(";");
		sb.append(qtdMediaPalavras);
		
		return sb.toString();
	}

	public String getIdiomaTextoOrigem() {
		return idiomaTextoOrigem;
	}

	public void setIdiomaTextoOrigem(String idiomaTextoOrigem) {
		this.idiomaTextoOrigem = idiomaTextoOrigem;
	}

	public String getIdiomaTextoDestino() {
		return idiomaTextoDestino;
	}

	public void setIdiomaTextoDestino(String idiomaTextoDestino) {
		this.idiomaTextoDestino = idiomaTextoDestino;
	}

	public int getQtdMediaPalavras() {
		return qtdMediaPalavras;
	}

	public void setQtdMediaPalavras(int qtdMediaPalavras) {
		this.qtdMediaPalavras = qtdMediaPalavras;
	}

	public PrestacaoServicoFreela getPrestacaoServicoFreela() {
		return prestacaoServicoFreela;
	}

	public void setPrestacaoServicoFreela(PrestacaoServicoFreela prestacaoServicoFreela) {
		this.prestacaoServicoFreela = prestacaoServicoFreela;
	}
}
