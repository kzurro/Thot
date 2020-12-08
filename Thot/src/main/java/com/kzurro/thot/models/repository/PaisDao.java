package com.kzurro.thot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.kzurro.thot.models.entity.Pais;

@RepositoryRestResource(path="paises", collectionResourceRel="paises", itemResourceRel="pais")
public interface PaisDao extends JpaRepository<Pais, LocalidadDao> {

}
