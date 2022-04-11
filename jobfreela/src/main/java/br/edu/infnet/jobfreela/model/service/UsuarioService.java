package br.edu.infnet.jobfreela.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.jobfreela.model.domain.Usuario;
import br.edu.infnet.jobfreela.model.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario validar(String email, String senha) {
		return usuarioRepository.autenticar(email, senha);
	}
	
	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
}