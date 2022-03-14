package br.edu.infnet.jobfreela.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobFreelaRevTextoController {

	@GetMapping(value = "/job-freela-rev-texto")
	public String cadastro() {
		return "job-freela-rev-texto/cadastro";
	}
	
	@PostMapping(value = "/job-freela-rev-texto/incluir")
	public String incluir() {
		return "index";
	}
}
