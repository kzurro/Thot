package com.kzurro.thot.models.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.TableGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class AsignableImpl implements Asignable<Identificable> {

	@TableGenerator(name = "ASIGNABLE_GEN", table = "ID_ASIGNABLE", pkColumnName = "GEN_ASIGANBLE", valueColumnName = "GEN_VALUE", allocationSize = 1)
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "ASIGNABLE_GEN")
	private Long id;

	private String nombre;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "destino_id")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Destino destino;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinColumn(name = "contacto_id")
	@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" }, allowSetters = true)
	private Contacto contacto;

	public Contacto getContacto() {
		return this.contacto;
	}

	protected void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

	protected Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}

	public AsignableImpl() {

	}

	public AsignableImpl(String nombre, Destino destino, Contacto contacto) {
		super();
		setNombre(nombre);
		setDestino(destino);
		setContacto(contacto);
	}

	@Override
	public Identificable getNombrableIdentificable() {
		return getContacto();
	}

	@Override
	public void setNombrableIdentificable(Identificable nombrableIdentificable) {
		}

	@Override
	public Long getId() {
		return this.id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;

	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

}
