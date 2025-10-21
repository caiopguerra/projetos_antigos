package br.com.api.concessionaria.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cli_cd_id", nullable = false)
	private Long id;

	@Column(name = "cli_tx_nome", nullable = false)
	private String nome;

	@Size(min = 14, max = 14, message = "CPF inválido! Insira um valor de 14 dígitos.")
	@Column(name = "cli_tx_cpf", nullable = false)
	private String cpf;

	@NotBlank
	@Column(name = "cli_tx_email", nullable = false)
	private String email;

	public Cliente() {
		
	}

	public Cliente(Long id, String nome, @Size(min = 14, max = 14) String cpf, String email) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
