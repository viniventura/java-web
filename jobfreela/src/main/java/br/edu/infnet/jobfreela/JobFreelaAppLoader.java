package br.edu.infnet.jobfreela;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.jobfreela.model.domain.JobFreelaApp;
import br.edu.infnet.jobfreela.model.domain.Usuario;
import br.edu.infnet.jobfreela.model.service.JobFreelaAppService;

@Order(3)
@Component
public class JobFreelaAppLoader implements ApplicationRunner {
	
	@Autowired
	private JobFreelaAppService jobFreelaAppService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		JobFreelaApp jobFreelaApp = new JobFreelaApp(
				"App de delivery", 
				"Novo app para entrega de bens de consumo", 
				LocalDateTime.of(2022, 3, 12, 0, 0),  
				80);
		
		jobFreelaApp.setPlataformasSuportadas(new String[] { "iOS", "Android" });
		jobFreelaApp.setIntegracoesAPIs(new String[] { "Google", "Facebook", "LinkedIn" });
		jobFreelaApp.setPartePronta(false);
		jobFreelaApp.setUsuario(usuario);
		
		jobFreelaAppService.cadastrar(jobFreelaApp);
	}
}