package br.edu.infnet.jobfreela.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.jobfreela.model.domain.JobFreelaRevisaoTexto;

@Repository
public interface JobFreelaRevTextoRepository extends CrudRepository<JobFreelaRevisaoTexto, Integer> {

}