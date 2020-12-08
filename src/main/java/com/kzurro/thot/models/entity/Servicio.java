package com.kzurro.thot.models.entity;

import java.time.Instant;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Access(value = AccessType.FIELD)
@Table(name = "SERVICIOS")
public class Servicio extends NombrableIdentificableImpl {
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tipo_servicio_id")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private TipoServicio tipoServico;
	
	String hola;
	private Instant duracion;
	
	@Column(name="genera_descanso")
	private boolean generaDescanso;

	public TipoServicio getTipoServico() {
		return tipoServico;
	}

	public Instant getDuracion() {
		return duracion;
	}

	public boolean isGeneraDescanso() {
		return generaDescanso;
	}

	protected void setTipoServico(TipoServicio tipoServico) {
		this.tipoServico = tipoServico;
	}

	protected void setDuracion(Instant duracion) {
		this.duracion = duracion;
	}

	protected void setGeneraDescanso(boolean generaDescanso) {
		this.generaDescanso = generaDescanso;
	}

	public Servicio() {
		super();
	}

	public Servicio(String nombre) {
		super(nombre);
	}

	public Servicio(TipoServicio tipoServico, Instant duracion, boolean generaDescanso) {
		super();
		this.tipoServico = tipoServico;
		this.duracion = duracion;
		this.generaDescanso = generaDescanso;
	}
	
	public Servicio(String nombre, TipoServicio tipoServico, Instant duracion, boolean generaDescanso) {
		super(nombre);
		this.tipoServico = tipoServico;
		this.duracion = duracion;
		this.generaDescanso = generaDescanso;
	}
	
	

}
