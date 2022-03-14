package br.edu.infnet.jobfreela.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FreelancerController {
	
	@GetMapping(value = "/freelancer")
	public String cadastro() {
		return "freelancer/cadastro";
	}
	
	@PostMapping(value = "/freelancer/incluir")
	public String incluir() {
		return "index";
	}
}
