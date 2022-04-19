package br.edu.infnet.jobfreela.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.jobfreela.model.domain.JobFreela;
import br.edu.infnet.jobfreela.model.domain.Usuario;
import br.edu.infnet.jobfreela.model.repository.JobFreelaRepository;

@Service
public class JobFreelaService {
	@Autowired
	private JobFreelaRepository jobFreelaRepository;
	
	public Collection<JobFreela> listar(Usuario usuario) {	
		return (Collection<JobFreela>) jobFreelaRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "descricaoResumida"));
	}

	public void excluir(Integer idJob) {
		jobFreelaRepository.deleteById(idJob);
	}
	
	public Optional<JobFreela> obter(Integer idJob) {
		return jobFreelaRepository.findById(idJob);
	}
}