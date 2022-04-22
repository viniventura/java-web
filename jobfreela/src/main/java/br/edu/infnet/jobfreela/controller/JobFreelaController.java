package br.edu.infnet.jobfreela.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.jobfreela.model.domain.Usuario;
import br.edu.infnet.jobfreela.model.service.JobFreelaService;

@Controller
public class JobFreelaController {
	@Autowired
	private JobFreelaService jobFreelaService;

	
	@GetMapping(value = "/jobs-freela")
	public String listar(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {		
		model.addAttribute("jobsFreela", jobFreelaService.listar(usuario));	
		return "jobs-freela/listar";
	}
	
	@GetMapping(value = "/jobs-freela/{idJob}/excluir")
	public String excluir(@PathVariable Integer idJob) {
		jobFreelaService.excluir(idJob);
		return "redirect:/jobs-freela";
	}
}