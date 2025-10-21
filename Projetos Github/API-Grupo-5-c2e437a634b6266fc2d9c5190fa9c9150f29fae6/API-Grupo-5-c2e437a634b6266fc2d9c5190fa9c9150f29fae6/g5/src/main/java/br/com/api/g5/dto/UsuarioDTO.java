package br.com.api.g5.dto;

import java.time.LocalDate;

public class UsuarioDTO {
	private Long usuarioId;
	private String nome;
	private String telefone;
	private String cpf;
	private Boolean comprador;
	private Boolean vendedor;
	private LocalDate dataNascimento;
	private String username;
	private String email;
	private String password;
	private String cep;
	private String complemento;

	public UsuarioDTO() {

	}

	public UsuarioDTO(Long usuarioId, String nome, String telefone, String cpf, Boolean comprador, Boolean vendedor,
			LocalDate dataNascimento, String username, String email, String password, String cep, String complemento) {
		this.usuarioId = usuarioId;
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.comprador = comprador;
		this.vendedor = vendedor;
		this.dataNascimento = dataNascimento;
		this.username = username;
		this.email = email;
		this.password = password;
		this.cep = cep;
		this.complemento = complemento;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Boolean getComprador() {
		return comprador;
	}

	public void setComprador(Boolean comprador) {
		this.comprador = comprador;
	}

	public Boolean getVendedor() {
		return vendedor;
	}

	public void setVendedor(Boolean vendedor) {
		this.vendedor = vendedor;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}
