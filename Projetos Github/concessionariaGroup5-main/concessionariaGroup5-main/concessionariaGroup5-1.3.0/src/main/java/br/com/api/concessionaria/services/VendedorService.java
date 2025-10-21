package br.com.api.concessionaria.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.concessionaria.domain.Vendedor;
import br.com.api.concessionaria.repository.VendedorRepository;

@Service
public class VendedorService {

	@Autowired
	 VendedorRepository vendedorRepository;

    public List<Vendedor> listarVendedores() {
        return vendedorRepository.findAll();
    }
    
    public Vendedor buscarVendedor(Long id) {
        return vendedorRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Vendedor não encontrado"));
    }
    
    public Vendedor criarVendedor(Vendedor vendedor) {
        return vendedorRepository.save(vendedor);
    }
    
    public Vendedor atualizarVendedor(Long id, Vendedor vendedorAtualizado) {
        Vendedor vendedor = buscarVendedor(id);
        vendedor.setNome(vendedorAtualizado.getNome());
        return vendedorRepository.save(vendedor);
    }
    public void deletarVendedor(Long id) {
        vendedorRepository.deleteById(id);
    }
}
