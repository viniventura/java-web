package br.edu.infnet.jobfreela;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.jobfreela.model.domain.Freelancer;
import br.edu.infnet.jobfreela.model.domain.Usuario;
import br.edu.infnet.jobfreela.model.service.FreelancerService;

@Order(2)
@Component
public class FreelancerLoader implements ApplicationRunner {
	
	@Autowired
	private FreelancerService freelancerService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Usuario usuario = new Usuario();
		usuario.setId(1);
		
		Freelancer freelancer = 
				new Freelancer(
					"Vinicius Santos Ventura", 
					"12345678901", 
					"vini.ventura.ti@hotmail.com", 
					"1990-05-28"
		);
		freelancer.setUsuario(usuario);
		
		freelancerService.cadastrar(freelancer);
	}
}