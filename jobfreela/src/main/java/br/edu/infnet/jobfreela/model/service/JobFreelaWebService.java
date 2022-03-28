package br.edu.infnet.jobfreela.model.service;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.jobfreela.model.domain.JobFreelaWeb;

@Service
public class JobFreelaWebService {
	private static Map<Integer, JobFreelaWeb> mapa = new HashMap<Integer, JobFreelaWeb>();
	private static Integer key = 1;
	
	public Collection<JobFreelaWeb> listar(){	
		return mapa.values();
	}

	public void cadastrar(JobFreelaWeb job) {
		job.setId(key++);
		job.setDataPublicacao(LocalDateTime.now());
		mapa.put(job.getId(), job);
	}
	
	public void excluir(Integer idJob) {
		mapa.remove(idJob);
	}
	
	public JobFreelaWeb obter(Integer idJob) {
		return mapa.get(idJob);
	}
}
