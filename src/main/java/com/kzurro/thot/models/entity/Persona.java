package com.kzurro.thot.models.entity;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@MappedSuperclass
public abstract class Persona extends AsignableImpl {

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "categoria_id")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Categoria categoria;

	private String nif;

	private String apellido1;

	private String apellido2;

	
	public Categoria getCategoria() {
		return categoria;
	}

	public String getNif() {
		return nif;
	}

	public String getApellido1() {
		return apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	
	protected void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	protected void setNif(String nif) {
		this.nif = nif;
	}

	protected void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	protected void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	

	public Persona() {
		super();

	}

	public Persona(String nombre, Destino destino, Contacto contacto) {
		super(nombre, destino, contacto);
	}

	public Persona(Categoria categoria, String nif, String apellido1, String apellido2) {
		super();
		setCategoria(categoria);
		setNif(nif);
		setApellido1(apellido1);
		setApellido2(apellido2);
	}

	public Persona(String nombre, Destino destino, Contacto contacto,Categoria categoria, String nif, String apellido1, String apellido2) {
		this(nombre, destino, contacto);
		setCategoria(categoria);
		setNif(nif);
		setApellido1(apellido1);
		setApellido2(apellido2);
	}

	

}
