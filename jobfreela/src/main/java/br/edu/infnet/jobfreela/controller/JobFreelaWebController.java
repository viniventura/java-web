package br.edu.infnet.jobfreela.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JobFreelaWebController {

	@GetMapping(value = "/job-freela-web")
	public String cadastro() {
		return "job-freela-web/cadastro";
	}
	
	@PostMapping(value = "/job-freela-web/incluir")
	public String incluir() {
		return "index";
	}
}
