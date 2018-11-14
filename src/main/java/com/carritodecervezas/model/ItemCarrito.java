package com.carritodecervezas.model;

public class ItemCarrito {

	private long id;
	private int cantidad;
	private Cerveza cerveza;
	private Carrito carrito;
	
	public ItemCarrito() {
		super();
	}

	public ItemCarrito(int cantidad, Cerveza cerveza) {
		super();
		this.cantidad = cantidad;
		this.cerveza = cerveza;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Cerveza getCerveza() {
		return cerveza;
	}

	public void setCerveza(Cerveza cerveza) {
		this.cerveza = cerveza;
	}

	public Carrito getCarrito() {
		return carrito;
	}

	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}
	
	
		
}
