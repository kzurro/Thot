package com.kzurro.thot.models.entity;

public interface Asignable <T extends Identificable>  extends NombrableIdentificable{
	
	public T getNombrableIdentificable();
	
	public void setNombrableIdentificable(T nombrableIdentificable);

}
