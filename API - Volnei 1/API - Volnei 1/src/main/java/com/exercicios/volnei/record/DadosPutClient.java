package com.exercicios.volnei.record;

import org.hibernate.annotations.NotFound;
import org.springframework.lang.NonNull;

public record DadosPutClient(
		@NonNull
		Long id,
		String firstName,
		String lastName) {

}
