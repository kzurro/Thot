package com.kzurro.thot.models.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Access(value = AccessType.FIELD)
@Table(name = "DESTINOS")
public class Destino extends NombrableIdentificableImpl {
	
	@OneToOne(fetch=FetchType.EAGER, cascade= CascadeType.MERGE)
	@JoinColumn(name="direccion_id")
	@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" }, allowSetters = true)
	private Direccion direccion;
	
	private String departamento;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "organismo_id")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Organismo organismo;
	
	
	public Direccion getDireccion() {
		return direccion;
	}

	public String getDepartamento() {
		return departamento;
	}

	public Organismo getOrganismo() {
		return organismo;
	}

	

	protected void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	protected void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	protected void setOrganismo(Organismo organismo) {
		this.organismo = organismo;
	}

	
	public Destino() {
		super();
		}

	public Destino(String nombre) {
		super(nombre);
	}

	public Destino(Direccion direccion, String departamento, Organismo organismo) {
		this();
		setDireccion(direccion);
		setDepartamento(departamento);
		setOrganismo(organismo);
		
	}
	
	public Destino(String nombre, Direccion direccion, String departamento, Organismo organismo, Localidad localidad) {
		this(nombre);
		setDireccion(direccion);
		setDepartamento(departamento);
		setOrganismo(organismo);
	}
	
	
	

}
