package com.kzurro.thot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.kzurro.thot.models.entity.Contacto;

@RepositoryRestResource(path="contactos", collectionResourceRel="contactos", itemResourceRel="contacto")
public interface ContactoDao extends JpaRepository<Contacto, Long> {

}
