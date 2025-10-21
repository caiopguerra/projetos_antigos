package br.com.api.g5.enums;

public enum UsuarioEnum {

	USUARIO_COMPRADOR("Tipo de usuario comprador", 1),
	USUARIO_VENDEDOR("Tipo de usuario vendedor", 2);
	
	private String descricao;
	private Integer id;
	
	private UsuarioEnum() {
		
	}
	
	private UsuarioEnum(String descricao, Integer id) {
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
