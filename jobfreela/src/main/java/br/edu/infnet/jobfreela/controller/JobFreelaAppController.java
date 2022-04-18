package br.edu.infnet.jobfreela.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.jobfreela.model.domain.JobFreelaApp;
import br.edu.infnet.jobfreela.model.domain.Usuario;
import br.edu.infnet.jobfreela.model.service.JobFreelaAppService;

@Controller
public class JobFreelaAppController {
	@Autowired
	private JobFreelaAppService jobFreelaAppService;
	
	@GetMapping(value = "/jobs-freela-app/cadastrar")
	public String getIncluir() {
		return "jobs-freela-app/cadastrar";
	}
	
	@GetMapping(value = "/jobs-freela-app")
	public String listar(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {		
		model.addAttribute("jobsFreelaApp", jobFreelaAppService.listar(usuario));	
		return "jobs-freela-app/listar";
	}
	
	@GetMapping(value = "/jobs-freela-app/{idJob}/excluir")
	public String excluir(@PathVariable Integer idJob) {
		jobFreelaAppService.excluir(idJob);
		return "redirect:/jobs-freela-app";
	}
	
	@PostMapping(value = "/jobs-freela-app/cadastrar")
	public String postIncluir(JobFreelaApp job, @SessionAttribute("usuarioLogado") Usuario usuario) {
		job.setUsuario(usuario);
		jobFreelaAppService.cadastrar(job);
		return "redirect:/jobs-freela-app";
	}
}
