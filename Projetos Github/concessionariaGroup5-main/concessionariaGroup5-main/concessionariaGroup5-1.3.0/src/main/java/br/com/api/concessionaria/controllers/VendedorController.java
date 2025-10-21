package br.com.api.concessionaria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.concessionaria.domain.Vendedor;
import br.com.api.concessionaria.services.VendedorService;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {
	
	@Autowired
	VendedorService vendedorService;

	@GetMapping("/listarVendedores")
	public List<Vendedor> listarVendedores() {
		return vendedorService.listarVendedores();
	}

	@GetMapping("/{id}")
	public Vendedor buscarVendedor(@PathVariable Long id) {
		return vendedorService.buscarVendedor(id);
	}

	@PostMapping("/criarVendedor")
	public Vendedor criarVendedor(@RequestBody Vendedor vendedor) {
		return vendedorService.criarVendedor(vendedor);
	}

	@PutMapping("/{id}")
	public Vendedor atualizarVendedor(@PathVariable Long id, @RequestBody Vendedor vendedorAtualizado) {
		return vendedorService.atualizarVendedor(id, vendedorAtualizado);
	}

	@DeleteMapping("/{id}")
	public void deletarVendedor(@PathVariable Long id) {
		vendedorService.deletarVendedor(id);
	}
}
