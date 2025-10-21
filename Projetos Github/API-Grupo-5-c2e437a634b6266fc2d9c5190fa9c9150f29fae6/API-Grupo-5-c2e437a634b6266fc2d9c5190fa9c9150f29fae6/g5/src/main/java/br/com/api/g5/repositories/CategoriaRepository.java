package br.com.api.g5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.g5.domain.Categoria;

@Repository("categoria")
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
}