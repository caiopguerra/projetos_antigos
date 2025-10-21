package br.com.api.g5.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
//import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "endereco")
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "end_cd_enderecoId")
	private Long enderecoId;
	
//	@NotBlank(message= "Não é permitido campos vazios ou nulos, preencha corretamente todos os campos.")
	@Column(name = "end_tx_cep")
	private String cep;
	
//	@NotBlank(message= "Não é permitido campos vazios ou nulos, preencha corretamente todos os campos.")
	@Column(name = "end_tx_logradouro")
	private String logradouro;
	
//	@NotBlank(message= "Não é permitido campos vazios ou nulos, preencha corretamente todos os campos.")
	@Column(name = "end_tx_complemento")
	private String complemento;
	
//	@NotBlank(message= "Não é permitido campos vazios ou nulos, preencha corretamente todos os campos.")
	@Column(name = "end_tx_bairro")
	private String bairro;
	
//	@NotBlank(message= "Não é permitido campos vazios ou nulos, preencha corretamente todos os campos.")
	@Column(name = "end_tx_localidade")
	private String localidade;
	
//	@NotBlank(message= "Não é permitido campos vazios ou nulos, preencha corretamente todos os campos.")
	@Column(name = "end_tx_uf")
	private String uf;
	
	@OneToMany(mappedBy = "enderecoRelacionamento")
	private List<Usuario> usuarios;

	public Endereco() {

	}

	public Endereco(Long enderecoId, String cep, String logradouro, String complemento, String bairro, String localidade, String uf) {
		this.enderecoId = enderecoId;
		this.cep = cep;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
	}

	public Long getEnderecoId() {
		return enderecoId;
	}

	public void setEnderecoId(Long enderecoId) {
		this.enderecoId = enderecoId;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
}