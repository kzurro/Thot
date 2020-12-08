package com.kzurro.thot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.kzurro.thot.models.entity.TipoServicio;
@RepositoryRestResource(path="tipo-servicios", collectionResourceRel="tipo-servicios", itemResourceRel="tipo-servicio")
public interface TipoServicoDao extends JpaRepository<TipoServicio, LocalidadDao> {

}
