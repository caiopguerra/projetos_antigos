package br.com.api.g5.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.g5.domain.Produto;
import br.com.api.g5.services.EmailService;
import br.com.api.g5.services.ProdutoService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.mail.MessagingException;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	ProdutoService produtoService;

	@Autowired
	EmailService emailService;

	@GetMapping("/listarProdutos")
	public ResponseEntity<List<Produto>> listarProdutos(Pageable page) {
		return ResponseEntity.ok(produtoService.listarProdutos(page));
	}

	@GetMapping("/{produtoId}/buscarProduto")
	public ResponseEntity<Produto> buscarProdutoPorId(@PathVariable Long produtoId) {
		return ResponseEntity.ok(produtoService.buscarProdutoPorId(produtoId));
	}

	@PostMapping("/salvarProduto")
	@SecurityRequirement(name = "Bearer Auth")
	@PreAuthorize("hasRole('ADMIN')")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Produto> salvarProduto(@Valid @RequestParam String email, @Valid @RequestBody Produto produto)
			throws MessagingException {
		emailService.confirmacaoCadastroProduto(email, produto);
		return ResponseEntity.status(HttpStatus.CREATED).body(produtoService.salvarProduto(produto));
	}

	@DeleteMapping("/{produtoId}/excluirProduto")
	@SecurityRequirement(name = "Bearer Auth")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Void> excluirProduto(@Valid @PathVariable Long produtoId) {
		produtoService.excluirProduto(produtoId);
		return ResponseEntity.noContent().build();
	}

	@PutMapping("/{produtoId}/atualizarProduto")
	@SecurityRequirement(name = "Bearer Auth")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Produto> atualizarProduto(@Valid @PathVariable Long produtoId, Produto produtoAtualizado) {
		return ResponseEntity.ok(produtoService.atualizarProduto(produtoId, produtoAtualizado));
	}
}
