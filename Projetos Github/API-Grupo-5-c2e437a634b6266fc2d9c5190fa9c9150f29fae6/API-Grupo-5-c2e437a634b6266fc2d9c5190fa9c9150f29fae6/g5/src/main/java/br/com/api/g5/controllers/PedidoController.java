package br.com.api.g5.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.g5.domain.Pedido;
import br.com.api.g5.services.PedidoService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;

	@GetMapping("/listarPedidos")
	public ResponseEntity<List<Pedido>> listarPedidos() {
		return ResponseEntity.ok(pedidoService.ListarPedidos());
	}

	@GetMapping("/{pedidoId}/buscarPedido")
	public ResponseEntity<Pedido> buscarPedidoPorId(@PathVariable Long pedidoId) {
		return ResponseEntity.ok(pedidoService.buscarPedidoPorId(pedidoId));
	}

	@PostMapping("/salvarPedido")
	@ResponseStatus(HttpStatus.CREATED) 
	public ResponseEntity<Pedido> salvarPedido(@Valid @RequestBody Pedido pedido) {
		return ResponseEntity.status(HttpStatus.CREATED).body(pedidoService.salvarPedido(pedido));
	}

	@DeleteMapping("/{pedidoId}/excluirPedido")
	public ResponseEntity<Void> excluirPedido(@Valid @PathVariable Long pedidoId) {
		pedidoService.excluirPedido(pedidoId);
		return ResponseEntity.noContent().build();
	}
	@PutMapping("/{pedidoId}/atualizarPedido")
	public ResponseEntity<Pedido> atualizarPedido(@Valid @PathVariable Long pedidoId, Pedido pedidoAtualizado) {
		return ResponseEntity.ok(pedidoService.atualizarPedido(pedidoId, pedidoAtualizado));		
	}
}
