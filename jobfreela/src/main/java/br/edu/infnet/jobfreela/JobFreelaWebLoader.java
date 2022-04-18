package br.edu.infnet.jobfreela;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.jobfreela.model.domain.JobFreelaWeb;
import br.edu.infnet.jobfreela.model.domain.Usuario;
import br.edu.infnet.jobfreela.model.service.JobFreelaWebService;

@Order(5)
@Component
public class JobFreelaWebLoader implements ApplicationRunner {
	
	@Autowired
	private JobFreelaWebService jobFreelaWebService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		JobFreelaWeb jobFreelaWeb = new JobFreelaWeb(
				"E-commerce", 
				"E-commerce para venda de produtos de papelaria", 
				LocalDateTime.of(2022, 3, 12, 0, 0),  
				50);
		
		jobFreelaWeb.setBrowsersSuportados(new String[] { "Chrome", "Opera" });
		jobFreelaWeb.setIntegracoesAPIs(new String[] { "Google" });
		jobFreelaWeb.setSiteResponsivo(true);
		jobFreelaWeb.setPartePronta(false);
		jobFreelaWeb.setUsuario(usuario);
		
		jobFreelaWebService.cadastrar(jobFreelaWeb);
	}
}