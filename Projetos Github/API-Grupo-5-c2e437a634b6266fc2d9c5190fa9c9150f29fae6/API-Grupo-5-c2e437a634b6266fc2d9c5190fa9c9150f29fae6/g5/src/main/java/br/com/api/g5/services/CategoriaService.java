package br.com.api.g5.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.g5.domain.Categoria;
import br.com.api.g5.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	CategoriaRepository categoriaRepository;

	public List<Categoria> listarCategorias() {
		return categoriaRepository.findAll();
	}

	public Categoria buscarCategoriaPorId(Long categoriaId) {
		return categoriaRepository.findById(categoriaId)
				.orElseThrow(() -> new NoSuchElementException("Categoria não encontrado."));
	}

	public Categoria salvarCategoria(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}

	public void excluirCategoria(Long categoriaId) {
		categoriaRepository.deleteById(categoriaId);
	}

	public Categoria atualizarCategoria(Long categoriaId, Categoria categoriaAtualizado) {
		categoriaRepository.findById(categoriaId);
		categoriaAtualizado.setCategoriaId(categoriaId);
		return categoriaRepository.save(categoriaAtualizado);
	}
}
