package com.exercicios.volnei.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.exercicios.volnei.model.Client;
import com.exercicios.volnei.record.DadosClient;
import com.exercicios.volnei.record.DadosListClient;
import com.exercicios.volnei.record.DadosPutClient;
import com.exercicios.volnei.repository.clientRepository;
@Service
public class ClientService {

	 private final clientRepository repository;

	    public ClientService(clientRepository repository) {
	        this.repository = repository;
	    }

	    // POST
	    public DadosClient createClient(DadosClient newClient) { 
	        Client toSaveClient = new Client(newClient);
	        toSaveClient.setfirstName(newClient.firstName());
	        toSaveClient.setLast_name(newClient.lastName());
	        Client savedClient = repository.save(toSaveClient);
	        DadosClient dados = new DadosClient(savedClient);
	        return dados;
	    }

//	     GET
	    public List<DadosListClient> findAllClients() {
	        List<Client> clients = repository.findAll();
	        return converterListClientToListClientDto(clients);
	    }
	    
	    // PUT
	    public DadosPutClient updateClient(DadosClient newClient, Long id) {
	    	Client updatedClient = new Client(newClient);
	    	Client toUpdateClient = repository.findById(id).get();

	   		 if (newClient.firstName() != null) {
	   	            toUpdateClient.firstName = newClient.firstName();
	   	        }
	   		
	   		 if (newClient.lastName() != null) {
	   	            toUpdateClient.lastName = newClient.lastName();
	   	        }
	    	
	    	DadosPutClient dados = new DadosPutClient(id, updatedClient.getfirstName(),
	        updatedClient.getlastName());
	    	return dados;
	    }
	    
	    // DELETE
	    public void deleteClient(Long id) {
	    	repository.deleteById(id); 	
	    }
	    

	    // UTIL
	    private List<DadosListClient> converterListClientToListClientDto(List<Client> clients) {

	        List<DadosListClient> dtos = new ArrayList<>();

	        for(Client client: clients) {
	            DadosListClient clientDTO =  new DadosListClient(client);
	            dtos.add(clientDTO);
	        }
	        return dtos;
	    }
	
}
