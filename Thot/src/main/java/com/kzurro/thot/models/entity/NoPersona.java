package com.kzurro.thot.models.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Access(value = AccessType.FIELD)
@Table(name = "NO_PERSONAS")
public class NoPersona extends AsignableImpl {
	
	private String identificador;
	
	private Estado estado;

	public String getIdentificador() {
		return identificador;
	}

	public Estado getEstado() {
		return estado;
	}

	protected void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	protected void setEstado(Estado estado) {
		this.estado = estado;
	}

	public NoPersona() {
		super();
	}

	public NoPersona(String nombre, Destino destino, Contacto contacto) {
		super(nombre, destino, contacto);
	}

	public NoPersona(String identificador, Estado estado) {
		super();
		setIdentificador(identificador);
		setEstado(estado);
	}
	
	public NoPersona(String nombre, Destino destino, Contacto contacto, String identificador, Estado estado) {
		this(nombre, destino, contacto);
		setIdentificador(identificador);
		setEstado(estado);
	}
	
	

}
