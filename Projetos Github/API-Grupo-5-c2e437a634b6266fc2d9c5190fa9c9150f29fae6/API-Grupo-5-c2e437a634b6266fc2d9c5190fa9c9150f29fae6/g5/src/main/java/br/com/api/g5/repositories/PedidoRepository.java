package br.com.api.g5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.g5.domain.Pedido;

@Repository("pedido")
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	
}