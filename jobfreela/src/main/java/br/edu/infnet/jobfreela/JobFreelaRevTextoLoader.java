package br.edu.infnet.jobfreela;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.jobfreela.model.domain.JobFreelaRevisaoTexto;
import br.edu.infnet.jobfreela.model.domain.Usuario;
import br.edu.infnet.jobfreela.model.service.JobFreelaRevTextoService;

@Order(4)
@Component
public class JobFreelaRevTextoLoader implements ApplicationRunner {
	
	@Autowired
	private JobFreelaRevTextoService jobFreelaRevTextoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		JobFreelaRevisaoTexto jobFreelaRevTexto = new JobFreelaRevisaoTexto(
				"Tradução de monografia", 
				"Tradução de monografia de português para o inglês", 
				LocalDateTime.of(2022, 3, 12, 0, 0),  
				50);
		
		jobFreelaRevTexto.setIdiomaTextoOrigem("Português");
		jobFreelaRevTexto.setIdiomaTextoDestino("Inglês");
		jobFreelaRevTexto.setQtdMediaPalavras(2000);
		jobFreelaRevTexto.setUsuario(usuario);
		
		jobFreelaRevTextoService.cadastrar(jobFreelaRevTexto);
	}
}