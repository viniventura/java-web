package br.edu.infnet.jobfreela.model.repository;

import java.util.Collection;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.jobfreela.model.domain.PrestacaoServicoFreela;

@Repository
public interface PrestacaoServicoFreelaRepository extends CrudRepository<PrestacaoServicoFreela, Integer> {
	@Query("from PrestacaoServicoFreela p where p.usuario.id = :id")
	Collection<PrestacaoServicoFreela> findAll(Integer id, Sort by);

	Collection<PrestacaoServicoFreela> findAll(Sort by);
}