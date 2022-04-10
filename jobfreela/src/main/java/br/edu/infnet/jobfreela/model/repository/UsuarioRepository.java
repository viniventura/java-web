package br.edu.infnet.jobfreela.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.jobfreela.model.domain.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

	@Query("from Usuario u where email = :email and senha = :senha")
	Usuario autenticar(String email, String senha);
}