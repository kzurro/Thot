package com.kzurro.thot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.kzurro.thot.models.entity.Localidad;

@RepositoryRestResource(path="localidades", collectionResourceRel="localidades", itemResourceRel="localidad")
public interface LocalidadDao extends JpaRepository<Localidad, Long> {

}
