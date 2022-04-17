package br.edu.infnet.jobfreela.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.jobfreela.model.domain.Usuario;
import br.edu.infnet.jobfreela.model.service.UsuarioService;

@SessionAttributes("usuarioLogado")
@Controller
public class AcessoController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value="/")
	public String index() {
		return "index";
	}
	
	@GetMapping(value="/login")
	public String login() {
		return "login";
	}
	
	@GetMapping(value="/logout")
	public String logout(HttpSession session, SessionStatus status) {
		status.setComplete();
		session.removeAttribute("usuarioLogado");
		return "redirect:/";
	}
	
	@PostMapping(value="/login")
	public String postLogin(Model model, @RequestParam String email, @RequestParam String senha) {
		
		Usuario usuario = usuarioService.validar(email, senha);
		
		if (usuario != null) {
			model.addAttribute("usuarioLogado", usuario);
			return "index";
		}
		
		String msgErroLogin = "E-mail e/ou senha inválido(s).";
		model.addAttribute("msgErroLogin", msgErroLogin);
		
		return "login";
	}
}