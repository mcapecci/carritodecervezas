package com.carritodecervezas.model;

import java.util.HashSet;
import java.util.Set;

public class Cerveceria {

	private long id;
	private String nombre;	
	protected Set<Carrito> carritos = new HashSet<Carrito>();
	protected Set<Cerveza> cervezas = new HashSet<Cerveza>();
	
	public Cerveceria() {
	}

	public Cerveceria(long id, String nombre){
		this.setId(id);
    	this.setNombre(nombre);
    }
	
	public Cerveceria(String nombre){
    	this.setNombre(nombre);
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

	public void agregarCarrito(Carrito carrito){
		this.getCarritos().add(carrito);
	}
	public void agregarCerveza(Cerveza cerveza){
		this.getCervezas().add(cerveza);
	}

	public Set<Carrito> getCarritos() {
		return carritos;
	}

	public void setCarritos(Set<Carrito> carritos) {
		this.carritos = carritos;
	}

	public Set<Cerveza> getCervezas() {
		return cervezas;
	}

	public void setCervezas(Set<Cerveza> cervezas) {
		this.cervezas = cervezas;
	}

	@Override
	public String toString() {
		return "Cerveceria [id=" + id + ", nombre=" + nombre + "]";
	}
}
