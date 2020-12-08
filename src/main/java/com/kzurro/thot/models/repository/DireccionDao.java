package com.kzurro.thot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.kzurro.thot.models.entity.Direccion;

@RepositoryRestResource(path="direcciones", collectionResourceRel="direcciones", itemResourceRel="direccion")
public interface DireccionDao extends JpaRepository<Direccion, Long> {

}
