package br.edu.infnet.jobfreela.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.jobfreela.model.domain.Usuario;
import br.edu.infnet.jobfreela.model.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value = "/usuarios/cadastrar")
	public String getIncluir() {
		return "usuarios/cadastrar";
	}
	
	@GetMapping(value = "/usuarios")
	public String listar(Model model) {		
		model.addAttribute("usuarios", usuarioService.listar());	
		return "usuarios/listar";
	}
	
	@PostMapping(value = "/usuarios/cadastrar")
	public String postIncluir(Usuario usuario) {
		usuarioService.incluir(usuario);
		return "redirect:/";
	}
	
	@GetMapping(value = "/usuarios/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		usuarioService.excluir(id);
		return "redirect:/usuarios";
	}
}