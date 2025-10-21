package br.com.api.g5.security.enums;

public enum RoleEnum {
	ROLE_USER("Role Usuário", 1), 
	ROLE_MODERATOR("Role Moderador", 2), 
	ROLE_ADMIN("Role Administrador", 3);

	private String tipo;
	private int codigo;

	private RoleEnum() {
	}

	private RoleEnum(String tipo, int codigo) {
		this.tipo = tipo;
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getTipo() {
		return tipo;
	}
}
