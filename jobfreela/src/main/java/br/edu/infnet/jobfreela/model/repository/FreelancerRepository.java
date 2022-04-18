package br.edu.infnet.jobfreela.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.jobfreela.model.domain.Freelancer;

@Repository
public interface FreelancerRepository extends CrudRepository<Freelancer, Integer> {
	@Query("from Freelancer f where f.usuario.id = :id")
	List<Freelancer> findAll(Integer id, Sort by);
}