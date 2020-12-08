package com.kzurro.thot.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.kzurro.thot.models.entity.Categoria;

@RepositoryRestResource(path="categorias", collectionResourceRel="categorias", itemResourceRel="categoria")
public interface CategoriaDao extends JpaRepository<Categoria, LocalidadDao> {

}
