package com.exercicios.volnei.controller;


import java.util.List;

import javax.transaction.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exercicios.volnei.record.DadosClient;
import com.exercicios.volnei.record.DadosListClient;
import com.exercicios.volnei.service.ClientService;

@RestController
@RequestMapping("clientes")
public class ExerciciosController {

	private final ClientService service;

    public ExerciciosController(ClientService service) {
		this.service = service;
     
	}
	
	@GetMapping("/get")
	public List<DadosListClient> listar () {
		return service.findAllClients();
        }
	
	@PostMapping("/post")
	@Transactional
	public void cadastrar (@RequestBody DadosClient dados) {
	  service.createClient(dados);
	}
	
	@PutMapping("/{id}")
    @Transactional
	public void atualizar (@RequestBody DadosClient dados, @PathVariable Long id) {
        service.updateClient(dados, id);
	}
	
	@DeleteMapping("/{id}")
	@Transactional
	public void deletar (@PathVariable Long id) {
		service.deleteClient(id);
	}
}
