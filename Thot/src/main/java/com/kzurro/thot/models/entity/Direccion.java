package com.kzurro.thot.models.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Access(value = AccessType.FIELD)
@Table(name = "DIRECCIONES")
public class Direccion extends NombrableIdentificableImpl {
	
	
	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_via")
	private TipoVia via;
	
	private String numero;
	
	@Column(name = "codigo_postal")
	private int codigoPostal;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "localidad_id")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Localidad localidad;
	
	
	public TipoVia getVia() {
		return via;
	}

	public String getNumero() {
		return numero;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	

	protected void setVia(TipoVia via) {
		this.via = via;
	}

	protected void setNumero(String numero) {
		this.numero = numero;
	}

	protected void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	protected void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	

	public Direccion() {
		super();
		
	}

	public Direccion(String nombre) {
		super(nombre);
		
	}

	public Direccion(TipoVia via, String numero, int codigoPostal, Localidad localidad) {
		this();
		setVia(via);
		setNumero(numero);
		setCodigoPostal(codigoPostal);
		setLocalidad(localidad);
		
	}
	
	public Direccion(String nombre, TipoVia via, String numero, int codigoPostal, Localidad localidad) {
		this(nombre);
		setVia(via);
		setNumero(numero);
		setCodigoPostal(codigoPostal);
		setLocalidad(localidad);
		
	}
	
	
	

}
