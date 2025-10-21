package br.com.api.g5.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.g5.domain.Endereco;
import br.com.api.g5.repositories.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	EnderecoRepository enderecoRepository;
	
	public List<Endereco> listarEndereco(){
		return enderecoRepository.findAll();
	}
	
	public Endereco buscarEnderecoPorId(Long enderecoId){
		return enderecoRepository.findById(enderecoId).orElseThrow(() -> new NoSuchElementException("Endereço não encontrado!"));
	} 
	
	public Endereco salvarEndereco(Endereco endereco){
		return enderecoRepository.save(endereco);
	}
	
	public void excluirEndereco(Long enderecoId){
		enderecoRepository.deleteById(enderecoId);
	}
}
