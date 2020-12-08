package com.kzurro.thot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.kzurro.thot.models.entity.Organismo;

@RepositoryRestResource(path="ornanismos", collectionResourceRel="organismos", itemResourceRel="organismo")
public interface OrganismoDao extends JpaRepository<Organismo, LocalidadDao> {

}
