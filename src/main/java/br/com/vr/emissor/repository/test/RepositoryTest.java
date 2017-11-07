package br.com.vr.emissor.repository.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.com.vr.emissor.domain.Emissor;
import br.com.vr.emissor.repository.EmissorRepository;

@Component
public class RepositoryTest implements ApplicationRunner{
	
	@Autowired
	private EmissorRepository emissorRepository;

	@Override
	public void run(ApplicationArguments arg0) throws Exception {
		Emissor emissor = Emissor.builder()
		.cnpj("02535864000133")
		.codigoEmissorCartao19("1")
		.descricao("VR Benefícios")
		.emailAlertaContato("xxx@smartnet.com.br")
		.flagSite(false)
		.nome("VR PARTICIPACOES S/A")
		.setIdCadastroEmpresa("")
		.siglaId("VRPAT")
		.ultimaNotaDebito(10L)
		.build();
		
		emissorRepository.saveAndFlush(emissor);
		
	}
	
	

}
