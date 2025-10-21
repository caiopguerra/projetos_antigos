package br.com.api.concessionaria.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.concessionaria.domain.Vendedor;

@Repository("vendedor")
public interface VendedorRepository extends JpaRepository<Vendedor, Long> {

}
