package br.com.vr.emissor.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Emissor {
	
	@Id
	private String siglaId;
	
	private String nome;
	private boolean flagSite;
	private String codigoEmissorCartao19;
	private String descricao;
	private String emailAlertaContato;
	private String setIdCadastroEmpresa;
	private String cnpj;
	private Long ultimaNotaDebito;

	

}
