package com.carritodecervezas.model;

public class Cerveza {
	private long id;
	private String nombre;
	private Tipo tipo;
	private int abv;
	private int ibu;
	private double precio;
	private boolean nacional;
	private int stock;

	@Override
	public String toString() {
		return String.format("Cerveza [nombre=%s,precio=%s]", nombre, precio);
	}
	
	public Cerveza() {
		super();
	}

	public Cerveza(long id, String nombre, Tipo tipo, double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.setPrecio(precio);
	}
	
	public Cerveza(long id, String nombre, Tipo tipo) {
		this(id, nombre, tipo, 0.0);
	}
	
	public Cerveza(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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

	public int getAbv() {
		return abv;
	}

	public void setAbv(int abv) {
		this.abv = abv;
	}

	public int getIbu() {
		return ibu;
	}

	public void setIbu(int ibu) {
		this.ibu = ibu;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean getNacional() {
		return nacional;
	}

	public void setNacional(boolean nacional) {
		this.nacional = nacional;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}
