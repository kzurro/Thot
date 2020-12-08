package com.kzurro.thot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.kzurro.thot.models.entity.PersonaEspecializada;

@RepositoryRestResource(path="personas-especializadas", collectionResourceRel="personas-especializadas", itemResourceRel="persona-especializada")
public interface PersonaEspecializadaDao extends JpaRepository<PersonaEspecializada, LocalidadDao> {

}
