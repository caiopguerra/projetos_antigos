package br.com.api.concessionaria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.concessionaria.domain.Cliente;
import br.com.api.concessionaria.dto.ClienteContatoDTO;
import br.com.api.concessionaria.services.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	ClienteService clienteService;

	ClienteContatoDTO clienteContatoDTO = new ClienteContatoDTO();

	@GetMapping("/listarClientes")
	public List<Cliente> listarClientes() {
		return clienteService.listarClientes();
	}

	@GetMapping("/{id}")
	public Cliente buscarCliente(@PathVariable Long id) {
		return clienteService.buscarCliente(id);
	}

	
	
	
	@GetMapping("/{id}/contato")
	public ClienteContatoDTO buscarClienteContato(@PathVariable Long id) {
		return clienteService.buscarClienteContato(id);
	}

	@PostMapping("/criarCliente")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente criarCliente(@Validated @RequestBody Cliente cliente) {
		return clienteService.criarCliente(cliente);
	}

	@PutMapping("/{id}")
	public Cliente atualizarCliente(@PathVariable Long id, @RequestBody Cliente clienteAtualizado) {
		return clienteService.atualizarCliente(id, clienteAtualizado);
	}

	@DeleteMapping("/{id}")
	public void deletarCliente(@PathVariable Long id) {
		clienteService.deletarCliente(id);
	}
}
