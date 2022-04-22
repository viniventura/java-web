package br.edu.infnet.jobfreela.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.jobfreela.model.domain.JobFreela;
import br.edu.infnet.jobfreela.model.domain.PrestacaoServicoFreela;
import br.edu.infnet.jobfreela.model.domain.Usuario;
import br.edu.infnet.jobfreela.model.service.FreelancerService;
import br.edu.infnet.jobfreela.model.service.JobFreelaService;
import br.edu.infnet.jobfreela.model.service.PrestacaoServicoFreelaService;


@Controller
public class PrestacaoServicoFreelaController {
	@Autowired
	private PrestacaoServicoFreelaService prestacaoServicoService;
	
	@Autowired
	private FreelancerService freelancerService;
	
	@Autowired
	private JobFreelaService jobFreelaService;
	
	@GetMapping(value = "/prestacoes-servico/cadastrar")
	public String getIncluir(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {	
		model.addAttribute("freelancers", freelancerService.listar(usuario));
		model.addAttribute("jobsFreela", jobFreelaService.listar(usuario));
		return "prestacoes-servico/cadastrar";
	}
	
	@GetMapping(value = "/prestacoes-servico")
	public String listar(Model model, @SessionAttribute("usuarioLogado") Usuario usuario) {		
		model.addAttribute("prestacoesServico", prestacaoServicoService.listar(usuario));	
		return "prestacoes-servico/listar";
	}
	
	@GetMapping(value = "/prestacoes-servico/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		prestacaoServicoService.excluir(id);
		return "redirect:/prestacoes-servico";
	}
	
	@PostMapping(value = "/prestacoes-servico/cadastrar")
	public String postIncluir(PrestacaoServicoFreela prestacaoServico, @RequestParam String idJobFreela, @SessionAttribute("usuarioLogado") Usuario usuario) {
		prestacaoServico.setUsuario(usuario);
		JobFreela jobFreela = jobFreelaService.obter(Integer.valueOf(idJobFreela));
		prestacaoServico.setJobFreela(jobFreela);
		prestacaoServicoService.cadastrar(prestacaoServico);
		return "redirect:/prestacoes-servico";
	}
}