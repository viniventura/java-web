package br.edu.infnet.jobfreela.model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.jobfreela.model.domain.JobFreelaWeb;

@Repository
public interface JobFreelaWebRepository extends CrudRepository<JobFreelaWeb, Integer> {
	@Query("from JobFreelaWeb j where j.usuario.id = :id")
	Collection<JobFreelaWeb> findAll(Integer id, Sort by);
}