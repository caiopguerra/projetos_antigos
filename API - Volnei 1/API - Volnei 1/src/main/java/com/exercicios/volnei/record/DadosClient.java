package com.exercicios.volnei.record;

import com.exercicios.volnei.model.Client;

public record DadosClient(String firstName, String lastName) {

	public DadosClient(Client client) {
		this(client.getfirstName(), client.getlastName());
	}

}
