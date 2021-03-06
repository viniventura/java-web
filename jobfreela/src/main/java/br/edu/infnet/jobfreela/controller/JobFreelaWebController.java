package br.edu.infnet.jobfreela.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.jobfreela.model.domain.JobFreelaWeb;
import br.edu.infnet.jobfreela.model.domain.Usuario;
import br.edu.infnet.jobfreela.model.service.JobFreelaWebService;

@Controller
public class JobFreelaWebController {
	@Autowired
	private JobFreelaWebService jobFreelaWebService;
	
	@GetMapping(value = "/jobs-freela-web/cadastrar")
	public String getIncluir() {
		return "jobs-freela-web/cadastrar";
	}
	
	@GetMapping(value = "/jobs-freela-web")
	public String listar(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {		
		model.addAttribute("jobsFreelaWeb", jobFreelaWebService.listar(usuario));	
		return "jobs-freela-web/listar";
	}
	
	@GetMapping(value = "/jobs-freela-web/{idJob}/excluir")
	public String excluir(@PathVariable Integer idJob) {
		jobFreelaWebService.excluir(idJob);
		return "redirect:/jobs-freela-web";
	}
	
	@PostMapping(value = "/jobs-freela-web/cadastrar")
	public String postIncluir(JobFreelaWeb job, @SessionAttribute("usuarioLogado") Usuario usuario) {
		job.setUsuario(usuario);
		jobFreelaWebService.cadastrar(job);
		return "redirect:/jobs-freela-web";
	}
}
