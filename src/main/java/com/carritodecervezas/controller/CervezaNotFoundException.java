package com.carritodecervezas.controller;

public class CervezaNotFoundException extends RuntimeException {

	public CervezaNotFoundException(String exception) {
		super(exception);
	}

}
