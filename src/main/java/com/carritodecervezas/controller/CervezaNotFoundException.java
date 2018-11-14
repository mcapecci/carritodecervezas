package com.carritodecervezas.controller;

@SuppressWarnings("serial")
public class CervezaNotFoundException extends RuntimeException {

	public CervezaNotFoundException(String exception) {
		super(exception);
	}

}
