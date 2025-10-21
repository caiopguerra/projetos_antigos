package br.com.api.g5.enums;

public enum CategoriaEnum {

	CATEGORIA_INFORMATICA("Departamento de informatica", 1),
	CATEGORIA_ELETRODOMESTICOS("Departamento de eletrodomesticos", 2),
	CATEGORIA_CAMA_MESA_BANHO("Departamento de cama, mesa e bamho", 3),
	CATEGORIA_MOVEIS_DECORACAO("Departamento de decorações", 4), 
	CATEGORIA_LIVROS("Departamento de livros", 5);

	private String descricao;
	private Integer id;

	private CategoriaEnum() {
		
	}

	private CategoriaEnum(String descricao, Integer id) {
		this.descricao = descricao;
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
