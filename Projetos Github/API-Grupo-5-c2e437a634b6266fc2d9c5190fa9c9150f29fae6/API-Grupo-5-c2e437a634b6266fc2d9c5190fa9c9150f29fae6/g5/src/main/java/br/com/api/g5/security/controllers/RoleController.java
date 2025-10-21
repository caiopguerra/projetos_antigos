package br.com.api.g5.security.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.g5.security.domain.Role;
import br.com.api.g5.security.services.RoleService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/roles")

// É uma classe que controla as ações relacionadas a papéis (ou funções) em um sistema.
public class RoleController {
	@Autowired
	RoleService roleService; 
/*injeção do service*/
	
	@PostMapping
	public ResponseEntity<Role> save(@RequestBody Role role) {
		Role newRole = roleService.save(role);
		if(newRole != null)
			return new ResponseEntity<>(newRole, HttpStatus.CREATED);
		else
			return new ResponseEntity<>(newRole, HttpStatus.BAD_REQUEST);

/*O método save mapeia a requisição HTTP POST e salva a Role no banco de dados usando 
o RoleService. Se a operação for bem-sucedida, retorna um ResponseEntity com o código 201 
e o objeto Role salvo. Caso contrário, retorna um ResponseEntity com o código 400 e o objeto 
nulo indicando falha na operação.

Resumindo, o método save trata a requisição POST, realiza o salvamento da Role e retorna uma 
resposta com o resultado da operação, indicando sucesso ou falha.*/
	}

}