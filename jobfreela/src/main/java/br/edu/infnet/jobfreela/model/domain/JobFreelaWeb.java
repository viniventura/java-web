package br.edu.infnet.jobfreela.model.domain;

import java.time.LocalDateTime;

public class JobFreelaWeb extends JobFreela {
	private String[] browsersSuportados;
	private String[] integracoesAPIs;
	private boolean siteResponsivo;
	private boolean partePronta;
	
	private PrestacaoServicoFreela prestacaoServicoFreela;
	
	public JobFreelaWeb(String descricaoResumida, String descricaoCompleta, LocalDateTime dataPublicacao,
			float valorHora) {
		super(descricaoResumida, descricaoCompleta, dataPublicacao, valorHora);
	}
	
	@Override
	public float calcularValorHoraJobFreela() {
		float valorAdicionalCrossBrowser = 1;
		
		if (browsersSuportados != null)
			valorAdicionalCrossBrowser += 0.1f * browsersSuportados.length;

		return getValorHora() * 1.3f * (siteResponsivo ? 1.5f : 1) * valorAdicionalCrossBrowser;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.toString());
		sb.append(";");
		sb.append(String.join(", ", browsersSuportados));
		sb.append(";");
		sb.append(String.join(", ", integracoesAPIs));
		sb.append(";");
		sb.append(siteResponsivo ? "site responsivo" : "site não responsivo");
		sb.append(";");
		sb.append(partePronta ? "uma parte está pronta" : "nada pronto");
		
		return sb.toString();
	}

	public String[] getBrowsersSuportados() {
		return browsersSuportados;
	}

	public void setBrowsersSuportados(String[] browsersSuportados) {
		this.browsersSuportados = browsersSuportados;
	}

	public String[] getIntegracoesAPIs() {
		return integracoesAPIs;
	}

	public void setIntegracoesAPIs(String[] integracoesAPIs) {
		this.integracoesAPIs = integracoesAPIs;
	}

	public boolean isSiteResponsivo() {
		return siteResponsivo;
	}

	public void setSiteResponsivo(boolean siteResponsivo) {
		this.siteResponsivo = siteResponsivo;
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
