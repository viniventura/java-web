package br.edu.infnet.jobfreela.model.service;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.jobfreela.model.domain.JobFreelaRevisaoTexto;
import br.edu.infnet.jobfreela.model.repository.JobFreelaRevTextoRepository;

@Service
public class JobFreelaRevTextoService {
	@Autowired
	private JobFreelaRevTextoRepository jobFreelaRevTextoRepository;
	
	public Collection<JobFreelaRevisaoTexto> listar(){	
		return (Collection<JobFreelaRevisaoTexto>) jobFreelaRevTextoRepository.findAll();
	}

	public void cadastrar(JobFreelaRevisaoTexto job) {
		job.setDataPublicacao(LocalDateTime.now());
		jobFreelaRevTextoRepository.save(job);
	}
	
	public void excluir(Integer idJob) {
		jobFreelaRevTextoRepository.deleteById(idJob);
	}
	
	public Optional<JobFreelaRevisaoTexto> obter(Integer idJob) {
		return jobFreelaRevTextoRepository.findById(idJob);
	}
}