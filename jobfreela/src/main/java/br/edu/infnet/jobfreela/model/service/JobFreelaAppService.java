package br.edu.infnet.jobfreela.model.service;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.jobfreela.model.domain.JobFreelaApp;

@Service
public class JobFreelaAppService {
	private static Map<Integer, JobFreelaApp> mapa = new HashMap<Integer, JobFreelaApp>();
	private static Integer key = 1;
	
	public Collection<JobFreelaApp> listarJobsFreelaApp(){	
		return mapa.values();
	}

	public void cadastrar(JobFreelaApp job) {
		job.setId(key++);
		job.setDataPublicacao(LocalDateTime.now());
		mapa.put(job.getId(), job);
	}
	
	public void excluir(Integer idJob) {
		mapa.remove(idJob);
	}
	
	public JobFreelaApp obter(Integer idJob) {
		return mapa.get(idJob);
	}
}
