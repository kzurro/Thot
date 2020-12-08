package com.kzurro.thot.models.entity;

import javax.persistence.Access;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Access(value = AccessType.FIELD)
@Table(name = "CONTACTOS")
public class Contacto extends NombrableIdentificableImpl {

	private String telefono;

	private String mail;

	public String getTelefono() {
		return telefono;
	}

	public String getMail() {
		return mail;
	}

	protected void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	protected void setMail(String mail) {
		this.mail = mail;
	}

	protected Contacto() {
		super();
	}

	public Contacto(String nombre) {
		super(nombre);
	}

	public Contacto(String telefono, String mail) {
		super();
		this.telefono = telefono;
		this.mail = mail;

	}

	public Contacto(String nombre, String telefono, String mail) {
		super(nombre);
		this.telefono = telefono;
		this.mail = mail;
	}

}
