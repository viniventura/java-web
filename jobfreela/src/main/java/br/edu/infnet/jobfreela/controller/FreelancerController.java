package br.edu.infnet.jobfreela.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.jobfreela.model.domain.Freelancer;
import br.edu.infnet.jobfreela.model.domain.Usuario;
import br.edu.infnet.jobfreela.model.service.FreelancerService;

@Controller
public class FreelancerController {
	@Autowired
	private FreelancerService freelancerService;
	
	@GetMapping(value = "/freelancers/cadastrar")
	public String getIncluir() {
		return "freelancers/cadastrar";
	}
	
	@GetMapping(value = "/freelancers")
	public String listar(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {		
		model.addAttribute("freelancers", freelancerService.listar(usuario));	
		return "freelancers/listar";
	}
	
	@GetMapping(value = "/freelancers/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		freelancerService.excluir(id);
		return "redirect:/freelancers";
	}
	
	@PostMapping(value = "/freelancers/cadastrar")
	public String postIncluir(Freelancer freelancer, @SessionAttribute("usuarioLogado") Usuario usuario) {
		freelancer.setUsuario(usuario);
		freelancerService.cadastrar(freelancer);
		return "redirect:/freelancers";
	}
}
