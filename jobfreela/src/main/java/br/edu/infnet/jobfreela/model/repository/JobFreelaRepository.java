package br.edu.infnet.jobfreela.model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.jobfreela.model.domain.JobFreela;

@Repository
public interface JobFreelaRepository extends CrudRepository<JobFreela, Integer> {
	@Query("from JobFreela j where j.usuario.id = :id")
	Collection<JobFreela> findAll(Integer id, Sort by);
}