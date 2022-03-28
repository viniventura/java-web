package br.edu.infnet.jobfreela.model.service;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.jobfreela.model.domain.JobFreelaRevisaoTexto;

@Service
public class JobFreelaRevTextoService {
	private static Map<Integer, JobFreelaRevisaoTexto> mapa = new HashMap<Integer, JobFreelaRevisaoTexto>();
	private static Integer key = 1;
	
	public Collection<JobFreelaRevisaoTexto> listar(){	
		return mapa.values();
	}

	public void cadastrar(JobFreelaRevisaoTexto job) {
		job.setId(key++);
		job.setDataPublicacao(LocalDateTime.now());
		mapa.put(job.getId(), job);
	}
	
	public void excluir(Integer idJob) {
		mapa.remove(idJob);
	}
	
	public JobFreelaRevisaoTexto obter(Integer idJob) {
		return mapa.get(idJob);
	}
}
