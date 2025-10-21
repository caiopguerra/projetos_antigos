package br.com.api.g5.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cat_cd_categoriaId")
	private Long categoriaId;
	
	@NotBlank(message= "Não é permitido campos vazios ou nulos, preencha corretamente todos os campos.")
	@Column(name="cat_tx_nome")
	private String nome;
	
	@Column(name="cat_tx_descricao")
	private String descricao;
	
	@OneToMany(mappedBy = "categoriaRelacionamento")
	private List <Produto> produtos;

	public Categoria() {

	}

	public Categoria(Long categoriaId, String nome, String descricao) {
		this.categoriaId = categoriaId;
		this.nome = nome;
		this.descricao = descricao;
	}

	public Long getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(Long categoriaId) {
		this.categoriaId = categoriaId;
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
}
	
	
	
