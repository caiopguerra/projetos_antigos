//package br.com.api.g5.domain;
//
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.Lob;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.Table;
////import jakarta.validation.constraints.NotBlank;
//
//@Entity
//@Table(name = "fotografia")
//public class Fotografia {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "foto_cd_fotografiaId")
//	private Long fotografiaId;
//
//
//	@Lob
//	@Column(name = "foto_tx_dados")
//	private byte[] dados;
//
////	@NotBlank(message= "Não é permitido campos vazios ou nulos, preencha corretamente todos os campos.")
//	@Column(name = "foto_tx_tipo")
//	private String tipo;
//
////	@NotBlank(message= "Não é permitido campos vazios ou nulos, preencha corretamente todos os campos.")
//	@Column(name = "foto_tx_nome")
//	private String nome;
//
//	@ManyToOne
//	@JoinColumn(name = "fk_prod_cd_produtoId")
//	private Produto produtoRelacionamento;
//
//	@ManyToOne
//	@JoinColumn(name = "fk_usu_cd_usuarioId")
//	private Usuario usuarioRelacionamento;
//
//	public Fotografia() {
//
//	}
//
//	public Fotografia(Long fotografiaId, byte[] dados, String tipo, String nome) {
//		super();
//		this.fotografiaId = fotografiaId;
//		this.dados = dados;
//		this.tipo = tipo;
//		this.nome = nome;
//	}
//
//	public Long getFotografiaId() {
//		return fotografiaId;
//	}
//
//	public void setFotografiaId(Long fotografiaId) {
//		this.fotografiaId = fotografiaId;
//	}
//
//	public byte[] getDados() {
//		return dados;
//	}
//
//	public void setDados(byte[] dados) {
//		this.dados = dados;
//	}
//
//	public String getTipo() {
//		return tipo;
//	}
//
//	public void setTipo(String tipo) {
//		this.tipo = tipo;
//	}
//
//	public String getNome() {
//		return nome;
//	}
//
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//
//}
