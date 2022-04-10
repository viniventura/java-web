package br.edu.infnet.jobfreela.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.jobfreela.model.domain.Freelancer;

@Repository
public interface FreelancerRepository extends CrudRepository<Freelancer, Integer> {

}