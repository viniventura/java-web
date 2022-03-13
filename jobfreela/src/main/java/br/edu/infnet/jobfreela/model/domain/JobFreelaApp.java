package br.edu.infnet.jobfreela.model.domain;

import java.time.LocalDateTime;

public class JobFreelaApp extends JobFreela {
	private String[] plataformasSuportadas;
	private String[] integracoesAPIs;
	private boolean	partePronta;
	
	private PrestacaoServicoFreela prestacaoServicoFreela;
	
	public JobFreelaApp(String descricaoResumida, String descricaoCompleta, LocalDateTime dataPublicacao,
			float valorHora) {
		super(descricaoResumida, descricaoCompleta, dataPublicacao, valorHora);
	}

	@Override
	public float calcularValorHoraJobFreela() {
		float valorAdicionalMultiplataforma = 1;
		
		if (plataformasSuportadas != null)
			valorAdicionalMultiplataforma = plataformasSuportadas.length;
			
		return getValorHora() * 1.5f * valorAdicionalMultiplataforma;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(String.join(", ", plataformasSuportadas));
		sb.append(";");
		sb.append(String.join(", ", integracoesAPIs));
		sb.append(";");
		sb.append(partePronta ? "uma parte está pronta" : "nada pronto");
		
		return sb.toString();
	}

	public String[] getPlataformasSuportadas() {
		return plataformasSuportadas;
	}

	public void setPlataformasSuportadas(String[] plataformasSuportadas) {
		this.plataformasSuportadas = plataformasSuportadas;
	}

	public String[] getIntegracoesAPIs() {
		return integracoesAPIs;
	}

	public void setIntegracoesAPIs(String[] integracoesAPIs) {
		this.integracoesAPIs = integracoesAPIs;
	}

	public boolean isPartePronta() {
		return partePronta;
	}

	public void setPartePronta(boolean partePronta) {
		this.partePronta = partePronta;
	}

	public PrestacaoServicoFreela getPrestacaoServicoFreela() {
		return prestacaoServicoFreela;
	}

	public void setPrestacaoServicoFreela(PrestacaoServicoFreela prestacaoServicoFreela) {
		this.prestacaoServicoFreela = prestacaoServicoFreela;
	}
}