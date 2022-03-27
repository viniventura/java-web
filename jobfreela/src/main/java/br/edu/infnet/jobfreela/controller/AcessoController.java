package br.edu.infnet.jobfreela.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AcessoController {
	
	@GetMapping(value="/")
	public String login() {
		return "login";
	}
	
	@PostMapping(value="/login")
	public String postLogin(Model model, @RequestParam String email, @RequestParam String senha) {
		if (email.equalsIgnoreCase(senha)) {
			return "index";
		}
		
		String msgErroLogin = "E-mail e/ou senha inválido(s).";
		model.addAttribute("msgErroLogin", msgErroLogin);
		
		return "login";
	}
}