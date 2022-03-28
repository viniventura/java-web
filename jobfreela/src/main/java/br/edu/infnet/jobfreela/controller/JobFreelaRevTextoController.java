package br.edu.infnet.jobfreela.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.jobfreela.model.domain.JobFreelaRevisaoTexto;
import br.edu.infnet.jobfreela.model.service.JobFreelaRevTextoService;

@Controller
public class JobFreelaRevTextoController {
	@Autowired
	private JobFreelaRevTextoService jobFreelaRevTextoService;
	
	@GetMapping(value = "/jobs-freela-rev-texto/cadastrar")
	public String getIncluir() {
		return "jobs-freela-rev-texto/cadastrar";
	}
	
	@GetMapping(value = "/jobs-freela-rev-texto")
	public String listar(Model model) {		
		model.addAttribute("jobsFreelaRevTexto", jobFreelaRevTextoService.listar());	
		return "jobs-freela-rev-texto/listar";
	}
	
	@GetMapping(value = "/jobs-freela-rev-texto/{idJob}/excluir")
	public String excluir(@PathVariable Integer idJob) {
		jobFreelaRevTextoService.excluir(idJob);
		return "redirect:/jobs-freela-rev-texto";
	}
	
	@PostMapping(value = "/jobs-freela-rev-texto/cadastrar")
	public String postIncluir(JobFreelaRevisaoTexto job) {
		jobFreelaRevTextoService.cadastrar(job);
		return "redirect:/jobs-freela-rev-texto";
	}
}
