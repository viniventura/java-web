package br.edu.infnet.jobfreela;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.jobfreela.model.domain.Usuario;
import br.edu.infnet.jobfreela.model.service.UsuarioService;

@Component
public class UsuarioLoader implements ApplicationRunner {
	
	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Usuario usuario = new Usuario();
		usuario.setAdmin(true);
		usuario.setEmail("vini.ventura.ti@hotmail.com");
		usuario.setNome("Vinicius Santos Ventura");
		usuario.setSenha("123");
		usuarioService.incluir(usuario);
	}

}