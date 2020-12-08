package com.kzurro.thot.models.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Access(value = AccessType.FIELD)
@Table(name = "LOCALIDADES")
public class Localidad extends NombrableIdentificableImpl {

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "pais_id")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Pais pais;

	public Pais getPais() {
		return pais;
	}

	protected void setPais(Pais pais) {
		this.pais = pais;
	}

	public Localidad() {
		super();

	}

	public Localidad(String nombre) {
		super(nombre);

	}

	public Localidad(Pais pais) {
		super();
		setPais(pais);
	}

	public Localidad(String nombre, Pais pais) {
		this(nombre);
		setPais(pais);
	}

}
