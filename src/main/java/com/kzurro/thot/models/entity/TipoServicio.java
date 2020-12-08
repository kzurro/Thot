package com.kzurro.thot.models.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Access(value = AccessType.FIELD)
@Table(name = "TIPOS_SERVICIOS")
public class TipoServicio extends NombrableIdentificableImpl {

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "tipo_servicio_realizadores", joinColumns = @JoinColumn(name = "tipo_servicio_id"), inverseJoinColumns = @JoinColumn(name = "realizador_id"), uniqueConstraints = {
			@UniqueConstraint(columnNames = { "tipo_servicio_id", "realizador_id" }) })
	private List<Categoria> realizadores;

	public List<Categoria> getRealizadores() {
		return realizadores;
	}

	protected void setRealizadores(List<Categoria> realizadores) {
		if (this.realizadores == null) {
			this.realizadores = new ArrayList<>();
			this.realizadores.addAll(realizadores);
		} else {
			this.realizadores.addAll(realizadores);
		}
	}

	public TipoServicio() {
		super();
	}

	public TipoServicio(String nombre) {
		super(nombre);
	}

	public TipoServicio(List<Categoria> realizadores) {
		super();
		setRealizadores(realizadores);
	}
	
	public TipoServicio(String nombre, List<Categoria> realizadores) {
		this(nombre);
		setRealizadores(realizadores);
	}
	

}
