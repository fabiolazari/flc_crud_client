package com.devsuperior.flc.flc_crud_client.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.flc.flc_crud_client.entities.Client;
import com.devsuperior.flc.flc_crud_client.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	public List<Client> findAll() {
		return repository.findAll();
	}
}
