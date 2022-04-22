package br.edu.infnet.jobfreela.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.jobfreela.model.domain.PrestacaoServicoFreela;
import br.edu.infnet.jobfreela.model.domain.Usuario;
import br.edu.infnet.jobfreela.model.repository.PrestacaoServicoFreelaRepository;

@Service
public class PrestacaoServicoFreelaService {
	@Autowired
	private PrestacaoServicoFreelaRepository prestacaoServicoFreelaRepository;
	
	public Collection<PrestacaoServicoFreela> listar(Usuario usuario) {
		return prestacaoServicoFreelaRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "dataInicio"));
	}
	
	public Collection<PrestacaoServicoFreela> listar() {
		return prestacaoServicoFreelaRepository.findAll(Sort.by(Sort.Direction.ASC, "dataInicio"));
	}
	
	public void cadastrar(PrestacaoServicoFreela prestacaoServicoFreela) {
		prestacaoServicoFreelaRepository.save(prestacaoServicoFreela);
	}
	
	public void excluir(Integer idPrestacaoServicoFreela) {
		prestacaoServicoFreelaRepository.deleteById(idPrestacaoServicoFreela);
	}
	
	public PrestacaoServicoFreela obter(Integer idPrestacaoServicoFreela) {
		return prestacaoServicoFreelaRepository.findById(idPrestacaoServicoFreela).orElse(null);
	}
}