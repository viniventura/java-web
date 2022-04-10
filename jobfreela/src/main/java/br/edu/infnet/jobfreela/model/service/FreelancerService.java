package br.edu.infnet.jobfreela.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.jobfreela.model.domain.Freelancer;
import br.edu.infnet.jobfreela.model.repository.FreelancerRepository;

@Service
public class FreelancerService {
	
	@Autowired
	private FreelancerRepository freelancerRepository;
	
	public Collection<Freelancer> listar(){	
		return (Collection<Freelancer>) freelancerRepository.findAll();
	}

	public void cadastrar(Freelancer freelancer) {
		freelancerRepository.save(freelancer);
	}
	
	public void excluir(Integer idFreelancer) {
		freelancerRepository.deleteById(idFreelancer);
	}
	
	public Optional<Freelancer> obter(Integer idFreelancer) {
		return freelancerRepository.findById(idFreelancer);
	}
}