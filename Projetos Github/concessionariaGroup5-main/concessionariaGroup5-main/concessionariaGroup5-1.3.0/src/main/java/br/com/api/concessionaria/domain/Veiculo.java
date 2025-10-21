package br.com.api.concessionaria.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "veiculo")
public class Veiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vei_cd_id", nullable = false)
	private Long id;

	@Column(name = "vei_tx_marca", nullable = false)
	private String marca;

	@Column(name = "vei_tx_modelo", nullable = false)
	private String modelo;
	
	@ManyToOne
	@JoinColumn(name="fk_ven_cd_id")
	private Vendedor vendedorRel;
	
	public Veiculo() {

	}

	public Veiculo(Long id, String marca, String modelo) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
