package br.edu.infnet.jobfreela.model.service;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.jobfreela.model.domain.PrestacaoServicoFreela;

@Service
public class PrestacaoServicoFreelaService {
	private static Map<Integer, PrestacaoServicoFreela> mapa = new HashMap<Integer, PrestacaoServicoFreela>();
	private static Integer key = 1;
	
	public Collection<PrestacaoServicoFreela> listar(){	
		return mapa.values();
	}

	public void cadastrar(PrestacaoServicoFreela prestacaoServico) {
		prestacaoServico.setId(key++);
		prestacaoServico.setDataInicio(LocalDateTime.now());
		mapa.put(prestacaoServico.getId(), prestacaoServico);
	}
	
	public void excluir(Integer idPrestacaoServico) {
		mapa.remove(idPrestacaoServico);
	}
	
	public PrestacaoServicoFreela obter(Integer idPrestacaoServico) {
		return mapa.get(idPrestacaoServico);
	}
}
