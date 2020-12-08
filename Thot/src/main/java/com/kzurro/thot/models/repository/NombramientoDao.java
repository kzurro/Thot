package com.kzurro.thot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.kzurro.thot.models.entity.Nombramiento;

@RepositoryRestResource(path="nombramientos", collectionResourceRel="nombramientos", itemResourceRel="nombramiento")
public interface NombramientoDao extends JpaRepository<Nombramiento, LocalidadDao> {

}
