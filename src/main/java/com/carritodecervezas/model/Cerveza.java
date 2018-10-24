package com.carritodecervezas.model;

public class Cerveza {
	private Long id;
	private String nombre;
	private Tipo tipo;
	private Double precio;
	
	

	@Override
	public String toString() {
		return String.format("Cerveza [nombre=%s,precio=%s]", nombre, precio);
	}
	
	public Cerveza() {
		super();
	}

	public Cerveza(Long id, String nombre, Tipo tipo, Double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.setPrecio(precio);
	}
	
	public Cerveza(Long id, String nombre, Tipo tipo) {
		this(id, nombre, tipo, 0.0);
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

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
}
