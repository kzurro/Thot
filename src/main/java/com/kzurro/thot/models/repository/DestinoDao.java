package com.kzurro.thot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.kzurro.thot.models.entity.Destino;

@RepositoryRestResource(path="destinos", collectionResourceRel="destinos", itemResourceRel="destino")
public interface DestinoDao extends JpaRepository<Destino, Long> {

}
