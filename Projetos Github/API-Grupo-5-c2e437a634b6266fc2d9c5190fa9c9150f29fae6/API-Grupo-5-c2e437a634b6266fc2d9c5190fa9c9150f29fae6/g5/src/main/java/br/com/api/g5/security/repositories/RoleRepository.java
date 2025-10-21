package br.com.api.g5.security.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.g5.security.domain.Role;
import br.com.api.g5.security.enums.RoleEnum;

// É uma classe responsável por armazenar e recuperar informações sobre os papéis no sistema.
@Repository("role")
public interface RoleRepository extends JpaRepository<Role, Integer> {
	Optional<Role> findByName(RoleEnum name);
}