package br.com.alura.forum.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public enum StatusTopico {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	NAO_RESPONDIDO,
	NAO_SOLUCIONADO,
	SOLUCIONADO,
	FECHADO;

}
