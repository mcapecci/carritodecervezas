package com.carritodecervezas.cerveza;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cerveza {
	@Id
	@GeneratedValue
	private Long id;
	private String nombre;
	
	public Cerveza() {
		super();
	}

	public Cerveza(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public Cerveza(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return String.format("Cerveza [nombre=%s]", nombre);
	}

}
