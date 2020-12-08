package com.kzurro.thot.models.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Access(value = AccessType.FIELD)
@Table(name = "PAISES")
public class Pais extends NombrableIdentificableImpl {
	
	@Column(name = "alfa_2")
	private String codigoAlfa2;
	
	@Column(name = "alfa_3")
	private String codigoAlfa3;
	
	@Column(name = "codigo_numerico")
	private int codigoNumerico;

	public String getCodigoAlfa2() {
		return codigoAlfa2;
	}

	public String getCodigoAlfa3() {
		return codigoAlfa3;
	}

	public int getCodigoNumerico() {
		return codigoNumerico;
	}

	protected void setCodigoAlfa2(String codigoAlfa2) {
		this.codigoAlfa2 = codigoAlfa2;
	}

	protected void setCodigoAlfa3(String codigoAlfa3) {
		this.codigoAlfa3 = codigoAlfa3;
	}

	protected void setCodigoNumerico(int codigoNumerico) {
		this.codigoNumerico = codigoNumerico;
	}

	public Pais() {
		super();
		
	}

	public Pais(String nombre) {
		super(nombre);
	}
	
	public Pais(String nombre, String codigoAlfa2) {
		super(nombre);
		setCodigoAlfa2(codigoAlfa2);
		
	}
	
	public Pais(String nombre, int codigoNumerico) {
		super(nombre);
		setCodigoNumerico(codigoNumerico);
	}

	public Pais(String codigoAlfa2, String codigoAlfa3, int codigoNumerico) {
		super();
		setCodigoAlfa2(codigoAlfa2);
		setCodigoAlfa3(codigoAlfa3);
		setCodigoNumerico(codigoNumerico);
	}
	
	public Pais(String nombre, String codigoAlfa2, String codigoAlfa3, int codigoNumerico) {
		super(nombre);
		setCodigoAlfa2(codigoAlfa2);
		setCodigoAlfa3(codigoAlfa3);
		setCodigoNumerico(codigoNumerico);
	}

	
}
