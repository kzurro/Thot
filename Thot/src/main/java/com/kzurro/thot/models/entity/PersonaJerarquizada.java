package com.kzurro.thot.models.entity;

import java.util.Calendar;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Access(value = AccessType.FIELD)
@Table(name = "PERSONA_JERARQUIZADA")
public class PersonaJerarquizada extends Persona {
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "empleo_id")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Categoria empleo;
	
	private Long escalafon;
	
	@Column(name = "inicio_servico")
	@Temporal(TemporalType.DATE)
	private Calendar fechaAntiguedad;

	public Categoria getEmpleo() {
		return empleo;
	}

	public Long getEscalafon() {
		return escalafon;
	}

	public Calendar getFechaAntiguedad() {
		return fechaAntiguedad;
	}

	protected void setEmpleo(Categoria empleo) {
		this.empleo = empleo;
	}

	protected void setEscalafon(Long escalafon) {
		this.escalafon = escalafon;
	}

	protected void setFechaAntiguedad(Calendar fechaAntiguedad) {
		this.fechaAntiguedad = fechaAntiguedad;
	}

	public PersonaJerarquizada() {
		super();
		
	}

	

	public PersonaJerarquizada(Categoria categoria, String nif, String apellido1, String apellido2) {
		super(categoria, nif, apellido1, apellido2);
		
	}

	public PersonaJerarquizada(String nombre, Destino destino, Contacto contacto, Categoria categoria, String nif,
			String apellido1, String apellido2) {
		super(nombre, destino, contacto, categoria, nif, apellido1, apellido2);
		
	}

	public PersonaJerarquizada(String nombre, Destino destino, Contacto contacto) {
		super(nombre, destino, contacto);
		
	}

	public PersonaJerarquizada(Categoria empleo, Long escalafon, Calendar fechaAntiguedad) {
		super();
		setEmpleo(empleo);
		setEscalafon(escalafon);
		setFechaAntiguedad(fechaAntiguedad);
	}
	
	public PersonaJerarquizada(String nombre, Destino destino, Contacto contacto, Categoria categoria, String nif,
			String apellido1, String apellido2,Categoria empleo, Long escalafon, Calendar fechaAntiguedad) {
		this(nombre, destino, contacto, categoria, nif, apellido1, apellido2);
		setEmpleo(empleo);
		setEscalafon(escalafon);
		setFechaAntiguedad(fechaAntiguedad);
	}
	

}
