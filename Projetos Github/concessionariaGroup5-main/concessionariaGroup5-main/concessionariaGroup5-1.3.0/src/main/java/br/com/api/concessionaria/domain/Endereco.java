package br.com.api.concessionaria.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="endereco")
public class Endereco {
	
	@Id
	@Column(name="end_cd_id")
	private Integer enderecoid;
	
	@Column(name="end_tx_cep")
	private String cep;
	
	@Column(name="end_tx_logradouro")
	private String logradouro;
	
	@Column(name="end_tx_bairro")
	private String bairro;
	
	@Column(name="end_tx_localidade")
	private String localidade;
	
	@Column(name="end_tx_uf")
	private String uf;
	
	@Column(name="end_tx_numero")
	private String numero;

	public Endereco() {
	}

	public Endereco(Integer enderecoid, String cep, String logradouro, String bairro, String localidade, String uf,
			String numero) {
		super();
		this.enderecoid = enderecoid;
		this.cep = cep;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.localidade = localidade;
		this.uf = uf;
		this.numero = numero;
	}

	public Integer getEnderecoid() {
		return enderecoid;
	}

	public void setEnderecoid(Integer enderecoid) {
		this.enderecoid = enderecoid;
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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
}

