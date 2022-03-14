package br.edu.infnet.jobfreela.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PrestacaoServicoFreelaController {
	@GetMapping(value = "/prestacao-servico")
	public String cadastro() {
		return "prestacao-servico/cadastro";
	}
	
	@PostMapping(value = "/prestacao-servico/incluir")
	public String incluir() {
		return "index";
	}
}
