package br.com.api.concessionaria.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.concessionaria.domain.Cliente;
import br.com.api.concessionaria.dto.ClienteContatoDTO;
import br.com.api.concessionaria.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	ClienteRepository clienteRepository;
	
	public List<Cliente> listarClientes() {
		return clienteRepository.findAll();
	}

	public Cliente buscarCliente(Long id) {
		return clienteRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Cliente não encontrado"));
	}

	public ClienteContatoDTO buscarClienteContato(Long id) {
		ClienteContatoDTO clienteContatoDTO = new ClienteContatoDTO();
		Cliente cliente = clienteRepository.findById(id)
				.orElseThrow(() -> new NoSuchElementException("Cliente não encontrado"));
		clienteContatoDTO.setNome(cliente.getNome());
		clienteContatoDTO.setEmail(cliente.getEmail());
		return clienteContatoDTO;
	}

	public Cliente criarCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	public Cliente atualizarCliente(Long id, Cliente clienteAtualizado) {
		Cliente cliente = buscarCliente(id);
		cliente.setNome(clienteAtualizado.getNome());
		cliente.setCpf(clienteAtualizado.getCpf());
		cliente.setEmail(clienteAtualizado.getEmail());
		return clienteRepository.save(cliente);
	}

	public void deletarCliente(Long id) {
		clienteRepository.deleteById(id);
	}
}