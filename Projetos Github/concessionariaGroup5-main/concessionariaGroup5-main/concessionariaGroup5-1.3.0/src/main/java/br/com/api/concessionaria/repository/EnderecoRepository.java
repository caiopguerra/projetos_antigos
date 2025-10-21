package br.com.api.concessionaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.concessionaria.domain.Endereco;

@Repository("endereco")
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}