package br.edu.infnet.jobfreela.model.service;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.jobfreela.model.domain.JobFreelaApp;
import br.edu.infnet.jobfreela.model.repository.JobFreelaAppRepository;

@Service
public class JobFreelaAppService {
	@Autowired
	private JobFreelaAppRepository jobFreelaAppRepository;
	
	public Collection<JobFreelaApp> listar(){	
		return (Collection<JobFreelaApp>) jobFreelaAppRepository.findAll();
	}

	public void cadastrar(JobFreelaApp job) {
		job.setDataPublicacao(LocalDateTime.now());
		jobFreelaAppRepository.save(job);
	}
	
	public void excluir(Integer idJob) {
		jobFreelaAppRepository.deleteById(idJob);
	}
	
	public Optional<JobFreelaApp> obter(Integer idJob) {
		return jobFreelaAppRepository.findById(idJob);
	}
}
