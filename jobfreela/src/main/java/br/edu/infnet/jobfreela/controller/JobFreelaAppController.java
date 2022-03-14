package br.edu.infnet.jobfreela.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobFreelaAppController {
	
	@GetMapping(value = "/job-freela-app")
	public String cadastro() {
		return "job-freela-app/cadastro";
	}
	
	@PostMapping(value = "/job-freela-app/incluir")
	public String incluir() {
		return "index";
	}
}
