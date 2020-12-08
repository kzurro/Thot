package com.kzurro.thot.models.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Access(value = AccessType.FIELD)
@Table(name = "PERSONA_ESPECIALIZADA")
public class PersonaEspecializada extends Persona {
	
	private String especialidad;

	public String getEspecialidad() {
		return especialidad;
	}

	protected void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public PersonaEspecializada() {
		super();
	}

	public PersonaEspecializada(Categoria categoria, String nif, String apellido1, String apellido2) {
		super(categoria, nif, apellido1, apellido2);
	}

	public PersonaEspecializada(String nombre, Destino destino, Contacto contacto, Categoria categoria, String nif,
			String apellido1, String apellido2) {
		super(nombre, destino, contacto, categoria, nif, apellido1, apellido2);
	}

	public PersonaEspecializada(String nombre, Destino destino, Contacto contacto) {
		super(nombre, destino, contacto);
	}

	public PersonaEspecializada(String especialidad) {
		super();
		setEspecialidad(especialidad);
	}

	public PersonaEspecializada(String nombre, Destino destino, Contacto contacto, Categoria categoria, String nif,
			String apellido1, String apellido2,String especialidad) {
		this(nombre, destino, contacto, categoria, nif, apellido1, apellido2);
		setEspecialidad(especialidad);
	}
	

	
	
	

}
