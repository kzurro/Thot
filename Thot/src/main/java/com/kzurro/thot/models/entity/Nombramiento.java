package com.kzurro.thot.models.entity;

import java.util.Calendar;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Access(value = AccessType.FIELD)
@Table(name = "NOMBRAMIENTOS")
public class Nombramiento implements Identificable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "servicio_id")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Servicio servicio;

	@Column(name = "inicio_servico")
	@Temporal(TemporalType.DATE)
	private Calendar fechaInicio;
	
	@Column(name = "fin_servicio")
	@Temporal(TemporalType.DATE)
	private Calendar fechaFin;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "nombrado_id")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private AsignableImpl asignable;
	
	
	
	public Servicio getServicio() {
		return servicio;
	}

	public Calendar getFechaInicio() {
		return fechaInicio;
	}

	public Calendar getFechaFin() {
		return fechaFin;
	}

	public AsignableImpl getAsiganble() {
		return asignable;
	}

	protected void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}

	protected void setFechaInicio(Calendar fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	protected void setFechaFin(Calendar fechaFin) {
		this.fechaFin = fechaFin;
	}

	protected void setAsiganble(AsignableImpl asiganble) {
		this.asignable = asiganble;
	}

	
	
	
	public Nombramiento() {
	}
	
	

	public Nombramiento(Long id, Servicio servicio, Calendar fechaInicio, Calendar fechaFin,
			AsignableImpl asignable) {
		this.id = id;
		this.servicio = servicio;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.asignable = asignable;
	}

	@Override
	public Long getId() {
		return this.id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

}
