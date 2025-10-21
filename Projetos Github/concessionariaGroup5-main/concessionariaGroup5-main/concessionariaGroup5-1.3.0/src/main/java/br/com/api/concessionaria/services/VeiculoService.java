package br.com.api.concessionaria.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.concessionaria.domain.Veiculo;
import br.com.api.concessionaria.repository.VeiculoRepository;
import jakarta.mail.MessagingException;

@Service
public class VeiculoService {
	@Autowired
	 VeiculoRepository veiculoRepository;

    public List<Veiculo> listarVeiculos() {
        return veiculoRepository.findAll();
    }
    
    public Veiculo buscarVeiculo(Long id) {
        return veiculoRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Veículo não encontrado"));
    }
    
    public Veiculo criarVeiculo(Veiculo veiculo) throws MessagingException {
        return veiculoRepository.save(veiculo);
    }
    
    public Veiculo atualizarVeiculo(Long id, Veiculo veiculoAtualizado) {
        Veiculo veiculo = buscarVeiculo(id);
        veiculo.setMarca(veiculoAtualizado.getMarca());
        veiculo.setModelo(veiculoAtualizado.getModelo());
        return veiculoRepository.save(veiculo);
    }
    
    public void deletarVeiculo(Long id) {
        veiculoRepository.deleteById(id);
    }
}








