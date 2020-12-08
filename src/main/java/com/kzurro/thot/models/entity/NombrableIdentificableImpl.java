package com.kzurro.thot.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.TableGenerator;
import javax.validation.constraints.NotEmpty;

/**
 * @author kzurro
 * 
 * @see <a href=
 *      "https://riptutorial.com/es/jpa/example/21628/tabla-por-estrategia-de-herencia-de-clase-concreta-">
 *      Ver </a>
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class NombrableIdentificableImpl implements NombrableIdentificable {

	@TableGenerator(name = "NOMBRABLE_IDENTIFICABLE_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "NOMBRABLE_IDENTIFICABLE_GEN")
	private Long id;

	@NotEmpty(message = "No puede estar vacio")
	private String nombre;

	@Override
	public String getNombre() {

		return this.nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;

	}

	public NombrableIdentificableImpl() {
	}

	public NombrableIdentificableImpl(String nombre) {
		this.nombre = nombre;
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
