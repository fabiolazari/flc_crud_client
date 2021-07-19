package com.devsuperior.flc.flc_crud_client.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.flc.flc_crud_client.dto.ClientDTO;
import com.devsuperior.flc.flc_crud_client.entities.Client;
import com.devsuperior.flc.flc_crud_client.repositories.ClientRepository;
import com.devsuperior.flc.flc_crud_client.services.exceptions.EntityNotFoundException;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll() {
		List<Client> list = repository.findAll();
		return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public ClientDTO findById(Long id) {
		Optional<Client> obj = repository.findById(id);
		Client entity = obj.orElseThrow(() -> new EntityNotFoundException("Entidade não encontrada!"));
		return new ClientDTO(entity);
	}
}
