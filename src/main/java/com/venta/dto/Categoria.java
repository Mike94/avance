package com.venta.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 *  6 y 7 agregar entity y table
 * */

@Entity
@Table(name="categoria")
public class Categoria implements Serializable{
	/**
	 1. declarar atributos
	 2. agregar los getter y setters 
	 3. Agregar constructor con fields con todos los atributos
	 4. Agregar constructor con fields con el atributo id
	 5. Agregar constructor con fields con ningun atributo	 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private String denominacion;
	
	
	
	public Categoria(int id, String denominacion) {
		super();
		this.id = id;
		this.denominacion = denominacion;
	}
	
	public Categoria(int id) {
		super();
		this.id = id;
	}

	public Categoria() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDenominacion() {
		return denominacion;
	}
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
}
