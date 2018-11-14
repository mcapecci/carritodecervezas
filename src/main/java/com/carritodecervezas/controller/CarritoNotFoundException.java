package com.carritodecervezas.controller;

@SuppressWarnings("serial")
public class CarritoNotFoundException extends RuntimeException {

	public CarritoNotFoundException(String exception) {
		super(exception);
	}

}
