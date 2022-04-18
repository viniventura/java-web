package br.edu.infnet.jobfreela.model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.jobfreela.model.domain.JobFreelaApp;

@Repository
public interface JobFreelaAppRepository extends CrudRepository<JobFreelaApp, Integer> {
	@Query("from JobFreelaApp j where j.usuario.id = :id")
	Collection<JobFreelaApp> findAll(Integer id, Sort by);
}