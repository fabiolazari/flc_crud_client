package com.devsuperior.flc.flc_crud_client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.flc.flc_crud_client.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
