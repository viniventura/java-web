package br.edu.infnet.jobfreela.model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.jobfreela.model.domain.JobFreelaRevisaoTexto;

@Repository
public interface JobFreelaRevTextoRepository extends CrudRepository<JobFreelaRevisaoTexto, Integer> {
	@Query("from JobFreelaRevisaoTexto j where j.usuario.id = :id")
	Collection<JobFreelaRevisaoTexto> findAll(Integer id, Sort by);
}