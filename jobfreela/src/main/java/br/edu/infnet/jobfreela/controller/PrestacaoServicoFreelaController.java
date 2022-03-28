package br.edu.infnet.jobfreela.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.jobfreela.model.domain.PrestacaoServicoFreela;
import br.edu.infnet.jobfreela.model.service.PrestacaoServicoFreelaService;


@Controller
public class PrestacaoServicoFreelaController {
	@Autowired
	private PrestacaoServicoFreelaService prestacaoServicoService;
	
	@GetMapping(value = "/prestacoes-servico/cadastrar")
	public String getIncluir() {
		return "prestacoes-servico/cadastrar";
	}
	
	@GetMapping(value = "/prestacoes-servico")
	public String listar(Model model) {		
		model.addAttribute("prestacoesServico", prestacaoServicoService.listar());	
		return "prestacoes-servico/listar";
	}
	
	@GetMapping(value = "/prestacoes-servico/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		prestacaoServicoService.excluir(id);
		return "redirect:/prestacoes-servico";
	}
	
	@PostMapping(value = "/prestacoes-servico/cadastrar")
	public String postIncluir(PrestacaoServicoFreela prestacaoServico) {
		prestacaoServicoService.cadastrar(prestacaoServico);
		return "redirect:/prestacoes-servico";
	}
}