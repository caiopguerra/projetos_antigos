package br.com.api.concessionaria.repository;
import org.springframework.stereotype.Repository;

import br.com.api.concessionaria.domain.Veiculo;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository("veiculo")
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
}
