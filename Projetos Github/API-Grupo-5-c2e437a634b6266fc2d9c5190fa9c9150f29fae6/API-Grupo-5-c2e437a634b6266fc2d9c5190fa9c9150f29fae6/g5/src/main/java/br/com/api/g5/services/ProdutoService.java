package br.com.api.g5.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.api.g5.domain.Produto;
import br.com.api.g5.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	ProdutoRepository produtoRepository;

	public List<Produto> listarProdutos(Pageable page) {
		return produtoRepository.findAll(page).getContent();
	}

	public Produto buscarProdutoPorId(Long produtoId) {
		return produtoRepository.findById(produtoId).orElseThrow(() -> new NoSuchElementException("Produto não encontrado."));

	}

	public Produto salvarProduto(Produto produto) {
		return produtoRepository.save(produto);
	}

	public void excluirProduto(Long produtoId) {
		produtoRepository.deleteById(produtoId);
	}
	
	public Produto atualizarProduto(Long produtoId, Produto produtoAtualizado) {
		produtoRepository.findById(produtoId);
		produtoAtualizado.setProdutoId(produtoId);
		return produtoRepository.save(produtoAtualizado);
	}
}
