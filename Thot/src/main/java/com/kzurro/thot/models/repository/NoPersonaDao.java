package com.kzurro.thot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.kzurro.thot.models.entity.NoPersona;

@RepositoryRestResource(path="no-personas", collectionResourceRel="no-personas", itemResourceRel="no-persona")
public interface NoPersonaDao extends JpaRepository<NoPersona, LocalidadDao> {

}
