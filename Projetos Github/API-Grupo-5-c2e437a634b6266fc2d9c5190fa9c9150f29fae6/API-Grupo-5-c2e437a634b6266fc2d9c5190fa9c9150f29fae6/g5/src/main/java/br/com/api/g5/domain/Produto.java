package br.com.api.g5.domain;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
//import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prod_cd_produtoId")
	private Long produtoId;

	@Column(name = "prod_int_codigoProduto")
	private Integer codigoProduto;

//	@NotBlank(message= "Não é permitido campos vazios ou nulos, preencha corretamente todos os campos.")
	@Column(name = "prod_tx_nome")
	private String nome;

//	@NotBlank(message= "Não é permitido campos vazios ou nulos, preencha corretamente todos os campos.")
	@Column(name = "prod_tx_descricao")
	private String descricao;

	@Column(name = "prod_int_quantidadeEstoque")
	private Integer quantidadeEstoque;

	@Column(name = "prod_dt_dataFabricacao")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataFabricacao;

	@Column(name = "prod_nm_valorUnitario")
	private Double valorUnitario;

	@ManyToOne
	@JoinColumn(name = "fk_cat_cd_categoriaId")
	private Categoria categoriaRelacionamento;

	@ManyToOne
	@JoinColumn(name = "fk_usu_cd_usuarioId")
	private Usuario usuarioRelacionamento;

//	@OneToMany(mappedBy="produtoRelacionamento")
//	private List<Fotografia> fotografias;

	@ManyToMany(mappedBy = "produtos")
	private List<Pedido> pedidos;

	public Produto() {

	}

	public Produto(Long produtoId, Integer codigoProduto, String nome, String descricao, Integer quantidadeEstoque,
			LocalDate dataFabricacao, Double valorUnitario) {
		super();
		this.produtoId = produtoId;
		this.codigoProduto = codigoProduto;
		this.nome = nome;
		this.descricao = descricao;
		this.quantidadeEstoque = quantidadeEstoque;
		this.dataFabricacao = dataFabricacao;
		this.valorUnitario = valorUnitario;
	}

	public Long getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(Long produtoId) {
		this.produtoId = produtoId;
	}

	public Integer getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(Integer codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(Integer quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public LocalDate getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
}
