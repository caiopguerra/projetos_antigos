package br.com.api.g5.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.g5.domain.Categoria;
import br.com.api.g5.services.CategoriaService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;

	@GetMapping("/listarCategorias")
	public ResponseEntity<List<Categoria>> listarCategorias() {
		return ResponseEntity.ok(categoriaService.listarCategorias());
	}

	@GetMapping("/{categoriaId}/buscarCategoria")
	public ResponseEntity<Categoria> buscarCategoriaPorId(@PathVariable Long categoriaId) {
		return ResponseEntity.ok(categoriaService.buscarCategoriaPorId(categoriaId));
	}
	
	@PostMapping("/salvarCategoria")
	@SecurityRequirement(name = "Bearer Auth")
	@PreAuthorize("hasRole('ADMIN')")
	@ResponseStatus(HttpStatus.CREATED) 
	public ResponseEntity<Categoria> salvarCategoria(@Valid  @RequestBody Categoria categoria) {
		return ResponseEntity.status(HttpStatus.CREATED).body(categoriaService.salvarCategoria(categoria));
	}

	@DeleteMapping("/{categoriaId}/excluirCategoria")
	@SecurityRequirement(name = "Bearer Auth")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Void> excluirCategoria(@Valid @PathVariable Long categoriaId) {
		categoriaService.excluirCategoria(categoriaId);
		return ResponseEntity.noContent().build();
	}

	@PutMapping("/{categoriaId}/atualizarCategoria")
	@SecurityRequirement(name = "Bearer Auth")
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<Categoria> atualizarCategoria(@Valid @PathVariable Long categoriaId, Categoria categoriaAtualizado) {
		return ResponseEntity.ok(categoriaService.atualizarCategoria(categoriaId, categoriaAtualizado));
	}
}
