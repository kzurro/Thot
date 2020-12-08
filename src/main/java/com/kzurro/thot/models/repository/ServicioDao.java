package com.kzurro.thot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.kzurro.thot.models.entity.Servicio;

@RepositoryRestResource(path="servicios", collectionResourceRel="servicios", itemResourceRel="servicio")
public interface ServicioDao extends JpaRepository<Servicio, LocalidadDao> {

}
