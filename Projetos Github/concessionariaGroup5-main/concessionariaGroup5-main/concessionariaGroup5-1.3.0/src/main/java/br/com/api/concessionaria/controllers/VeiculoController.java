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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.concessionaria.domain.Veiculo;
import br.com.api.concessionaria.services.EmailService;
import br.com.api.concessionaria.services.VeiculoService;
import jakarta.mail.MessagingException;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
	@Autowired
	EmailService emailService;
	
	@Autowired 
	VeiculoService veiculoService;
    
    @GetMapping("/listarVeiculos")
    public List<Veiculo> listarVeiculos() {
        return veiculoService.listarVeiculos();
    }

    @GetMapping("/{id}")
    public Veiculo buscarVeiculo(@PathVariable Long id) {
        return veiculoService.buscarVeiculo(id);
    }

    @PostMapping("/criarVeiculo")
    public Veiculo criarVeiculo(@RequestParam String email, @RequestBody Veiculo veiculo) throws MessagingException{
    	emailService.envioEmailCadastroVeiculo(email, veiculo);
        return veiculoService.criarVeiculo(veiculo);
    }

    @PutMapping("/{id}")
    public Veiculo atualizarVeiculo(@PathVariable Long id, @RequestBody Veiculo veiculoAtualizado) {
        return veiculoService.atualizarVeiculo(id, veiculoAtualizado);
    }

    @DeleteMapping("/{id}")
    public void deletarVeiculo(@PathVariable Long id) {
        veiculoService.deletarVeiculo(id);
    }
}





