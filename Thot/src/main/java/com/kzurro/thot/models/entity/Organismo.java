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
@Table(name = "ORGANISMOS")
public class Organismo extends NombrableIdentificableImpl {

	private String acronimo;

	private String entidad;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "pais_id")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Pais pais;

	public String getAcronimo() {
		return acronimo;
	}

	public String getEntidad() {
		return entidad;
	}

	public Pais getPais() {
		return pais;
	}

	protected void setAcronimo(String acronimo) {
		this.acronimo = acronimo;
	}

	protected void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	protected void setPais(Pais pais) {
		this.pais = pais;
	}

	public Organismo() {
		super();
	}

	public Organismo(String nombre) {
		super(nombre);
	}

	public Organismo(String acronimo, String entidad, Pais pais) {
		super();
		setAcronimo(acronimo);
		setEntidad(entidad);
		setPais(pais);
	}
	
	public Organismo(String nombre, String acronimo, String entidad, Pais pais) {
		this(nombre);
		setAcronimo(acronimo);
		setEntidad(entidad);
		setPais(pais);
	}

}
