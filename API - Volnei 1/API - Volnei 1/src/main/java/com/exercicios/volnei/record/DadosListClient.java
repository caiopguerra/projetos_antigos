package com.exercicios.volnei.record;

import java.util.UUID;

import com.exercicios.volnei.model.Client;

public record DadosListClient(Long id ,String firstName, String lastName) {

	public DadosListClient(Client client) {
		this(client.getId(), client.getfirstName(), client.getlastName());
	}
}
