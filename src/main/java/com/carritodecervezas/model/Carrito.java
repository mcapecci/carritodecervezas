package com.carritodecervezas.model;

import java.util.ArrayList;
import java.util.List;

public class Carrito {
	
	private long id;
	private List<ItemCarrito> items = new ArrayList<ItemCarrito>();
	
	public Carrito() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<ItemCarrito> getItems() {
		return items;
	}

	public void setItems(List<ItemCarrito> items) {
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
