package br.com.api.concessionaria.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.concessionaria.domain.Cliente;

@Repository("cliente")
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}

