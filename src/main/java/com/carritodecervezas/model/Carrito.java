package com.carritodecervezas.model;

import java.util.Collection;
import java.util.HashSet;

public class Carrito {
	
	private long id;
	private Collection<ItemCarrito> items = new HashSet<ItemCarrito>();
	
	public Carrito() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Collection<ItemCarrito> getItems() {
		return items;
	}

	public void setItems(Collection<ItemCarrito> items) {
		this.items = items;
	}

	public boolean addItem(ItemCarrito item){
		if (!items.contains(item)){
			items.add(item);
			return true;
		}
		System.out.println("El ítem ya existe");
		return false;
	}

	public boolean removeItem(ItemCarrito item) {
		if (items.contains(item)){
			items.remove(item);
			return true;
		}
		System.out.println("El ítem no existe");
		return false;
	}

	public double getSubtotal() {
		return items.stream().mapToDouble(i -> i.getCerveza().getPrecio()).sum();
	}
}
