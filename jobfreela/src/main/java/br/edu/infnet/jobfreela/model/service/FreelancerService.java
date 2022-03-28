package br.edu.infnet.jobfreela.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.jobfreela.model.domain.Freelancer;

@Service
public class FreelancerService {
	private static Map<Integer, Freelancer> mapa = new HashMap<Integer, Freelancer>();
	private static Integer key = 1;
	
	public Collection<Freelancer> listar(){	
		return mapa.values();
	}

	public void cadastrar(Freelancer freelancer) {
		freelancer.setId(key++);
		mapa.put(freelancer.getId(), freelancer);
	}
	
	public void excluir(Integer idFreelancer) {
		mapa.remove(idFreelancer);
	}
	
	public Freelancer obter(Integer idFreelancer) {
		return mapa.get(idFreelancer);
	}
}
