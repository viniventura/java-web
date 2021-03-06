package br.edu.infnet.jobfreela.model.service;

import java.time.LocalDateTime;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.edu.infnet.jobfreela.model.domain.JobFreelaWeb;
import br.edu.infnet.jobfreela.model.domain.Usuario;
import br.edu.infnet.jobfreela.model.repository.JobFreelaWebRepository;

@Service
public class JobFreelaWebService {
	@Autowired
	private JobFreelaWebRepository jobFreelaWebRepository;
	
	public Collection<JobFreelaWeb> listar(Usuario usuario){	
		return (Collection<JobFreelaWeb>) jobFreelaWebRepository.findAll(usuario.getId(), Sort.by(Sort.Direction.ASC, "descricaoResumida"));
	}

	public void cadastrar(JobFreelaWeb job) {
		job.setDataPublicacao(LocalDateTime.now());
		jobFreelaWebRepository.save(job);
	}
	
	public void excluir(Integer idJob) {
		jobFreelaWebRepository.deleteById(idJob);
	}
	
	public JobFreelaWeb obter(Integer idJob) {
		return jobFreelaWebRepository.findById(idJob).orElse(null);
	}
}