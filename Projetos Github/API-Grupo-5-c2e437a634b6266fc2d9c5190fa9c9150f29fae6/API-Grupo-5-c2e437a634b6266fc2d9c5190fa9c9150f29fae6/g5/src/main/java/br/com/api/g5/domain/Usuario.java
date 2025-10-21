package br.com.api.g5.domain;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.api.g5.security.domain.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
//import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usu_cd_usuarioId")
	private Long usuarioId;

//	@NotBlank
	@Column(name = "usu_tx_nome")
	private String nome;

//	@NotBlank
	@Size(min = 11, max = 11, message = "O número de telefone deve conter 11 dígitos!")
	@Column(name = "usu_tx_telefone")
	private String telefone;

//	@NotBlank
//	@Email(message = "O campo 'email' deve ser um endereço de e-mail válido!")
	@Column(name = "usu_tx_email")
	private String email;

//	@NotBlank
//	@CPF(message = "O campo 'cpf' deve ser um número de CPF válido!")
	@Column(name = "usu_tx_cpf")
	private String cpf;

//	@NotBlank
	@Column(name = "usu_bl_comprador")
	private Boolean comprador;

//	@NotBlank
	@Column(name = "usu_bl_vendedor")
	private Boolean vendedor;

//	@NotBlank
	@Column(name = "usu_dt_dataNascimento")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataNascimento;

	@OneToOne
	@JoinColumn(name = "fk_user_cd_id")
	private User userRelacionamento;

	@ManyToOne
	@JoinColumn(name = "fk_end_cd_enderecoId")
	private Endereco enderecoRelacionamento;

	@OneToMany(mappedBy = "usuarioRelacionamento")
	private List<Produto> produtos;

	@OneToMany(mappedBy = "usuarioRelacionamento")
	private List<Pedido> pedidos;

//	@OneToMany(mappedBy = "usuarioRelacionamento")
//	private List<Fotografia> fotografias;

	public Usuario() {

	}

	public Usuario(Long usuarioId, String nome, String telefone,
			String email, String cpf, Boolean comprador, Boolean vendedor, LocalDate dataNascimento) {
		this.usuarioId = usuarioId;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.cpf = cpf;
		this.comprador = comprador;
		this.vendedor = vendedor;
		this.dataNascimento = dataNascimento;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
}
