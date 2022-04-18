package br.edu.infnet.jobfreela.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.jobfreela.model.domain.JobFreelaApp;

@Repository
public interface JobFreelaAppRepository extends CrudRepository<JobFreelaApp, Integer> {
	
}