package com.kzurro.thot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.kzurro.thot.models.entity.PersonaJerarquizada;

@RepositoryRestResource(path="personas-jerarquizadas", collectionResourceRel="personas-jerarquizadas", itemResourceRel="persona-jerarquizada")
public interface PersonaJerarquizadaDao extends JpaRepository<PersonaJerarquizada, LocalidadDao> {

}
