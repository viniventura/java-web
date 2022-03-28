package br.edu.infnet.jobfreela.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.jobfreela.model.domain.JobFreelaApp;
import br.edu.infnet.jobfreela.model.service.JobFreelaAppService;

@Controller
public class JobFreelaAppController {
	@Autowired
	private JobFreelaAppService jobFreelaService;
	
	@GetMapping(value = "/jobs-freela-app/cadastrar")
	public String getIncluir() {
		return "jobs-freela-app/cadastrar";
	}
	
	@GetMapping(value = "/jobs-freela-app")
	public String listar(Model model) {		
		model.addAttribute("jobsFreelaApp", jobFreelaService.listarJobsFreelaApp());	
		return "jobs-freela-app/listar";
	}
	
	@GetMapping(value = "/jobs-freela-app/{idJob}/excluir")
	public String excluir(@PathVariable Integer idJob) {
		jobFreelaService.excluir(idJob);
		return "redirect:/jobs-freela-app";
	}
	
	@PostMapping(value = "/jobs-freela-app/cadastrar")
	public String postIncluir(JobFreelaApp job) {
		jobFreelaService.cadastrar(job);
		return "redirect:/jobs-freela-app";
	}
}
