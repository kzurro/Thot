package com.kzurro.thot.models.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Access(value = AccessType.FIELD)
@Table(name = "CATEGORIAS")
public class Categoria extends NombrableIdentificableImpl {

	
	
	
	private  String nivel;
		
		
	private String getNivel() {
		return nivel;
	}


	private void setNivel(String nivel) {
		this.nivel = nivel;
	}


	public Categoria() {
		super();
	}
	

	public Categoria(String nombre) {
		super(nombre);
		
	}

	public Categoria(String nombre, String nivel) {
		this(nombre);
		setNivel(nivel);
	}


	
	
	
}
