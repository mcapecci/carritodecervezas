package com.carritodecervezas.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.carritodecervezas.model.Carrito;
import com.carritodecervezas.service.CarritoService;

@RestController
public class CarritoRestController {

	@Autowired
	private CarritoService service;

	@GetMapping("/carrito/{id}")
	public Carrito getCarrito(@PathVariable long id) {
		Optional<Carrito> carrito = service.getCarrito(id);

		if (!carrito.isPresent())
			throw new CarritoNotFoundException("id-" + id);

		return carrito.get();
	}
	
	@PutMapping("/carrito/{id}")
	public ResponseEntity<Object> addItems(@RequestBody Carrito carrito, @PathVariable long id) {

		Optional<Carrito> carritoOptional = service.getCarrito(id);

		if (!carritoOptional.isPresent())
			return ResponseEntity.notFound().build();

		carrito.getItems();
		/*
		carrito.setId(id);
		
		carritoRepository.save(carrito);
		*/
		return ResponseEntity.noContent().build();
		
	}
	/*
	@GetMapping("/carritos")
	public List<Carrito> retrieveAllCarritos() {
		return carritoRepository.findAll();
	}
	
	@GetMapping("/carritos/{id}")
	public Carrito retrieveCarrito(@PathVariable long id) {
		Optional<Carrito> carrito = carritoRepository.findById(id);

		if (!carrito.isPresent())
			throw new CarritoNotFoundException("id-" + id);

		return carrito.get();
	}

	@DeleteMapping("/carritos/{id}")
	public void deleteCarrito(@PathVariable long id) {
		carritoRepository.deleteById(id);
	}

	@PostMapping("/carritos")
	public ResponseEntity<Object> createCarrito(@RequestBody Carrito carrito) {
		Carrito savedCarrito = carritoRepository.save(carrito);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedCarrito.getId()).toUri();

		return ResponseEntity.created(location).build();

	}
	
	@PutMapping("/carritos/{id}")
	public ResponseEntity<Object> updateCarrito(@RequestBody Carrito carrito, @PathVariable long id) {

		Optional<Carrito> carritoOptional = carritoRepository.findById(id);

		if (!carritoOptional.isPresent())
			return ResponseEntity.notFound().build();

		carrito.setId(id);
		
		carritoRepository.save(carrito);

		return ResponseEntity.noContent().build();
	}
	*/
}
