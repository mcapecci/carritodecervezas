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

import com.carritodecervezas.model.Cerveza;
import com.carritodecervezas.service.CervezaService;

@RestController
public class CervezaRestController {

	@Autowired
	private CervezaService service;
	
	@GetMapping("/cervezas")
	public List<Cerveza> getAllCervezas() {
		return service.getAllCervezas();
	}
	
	@GetMapping("/cervezas/{id}")
	public Cerveza getCerveza(@PathVariable long id) {
		Optional<Cerveza> cerveza = service.getCerveza(id);

		if (!cerveza.isPresent())
			throw new CervezaNotFoundException("id-" + id);

		return cerveza.get();
	}
	
	@DeleteMapping("/cervezas/{id}")
	public void deleteCerveza(@PathVariable long id) {
		service.deleteCerveza(id);
	}
	
	@PostMapping("/cervezas")
	public ResponseEntity<Object> createCerveza(@RequestBody Cerveza cerveza) {
		Cerveza savedCerveza = service.addCerveza(cerveza);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedCerveza.getId()).toUri();

		return ResponseEntity.created(location).build();

	}
	
	@PutMapping("/cervezas/{id}")
	public ResponseEntity<Object> updateCerveza(@RequestBody Cerveza cerveza, @PathVariable long id) {

		Optional<Cerveza> cervezaOptional = service.getCerveza(id);

		if (!cervezaOptional.isPresent())
			return ResponseEntity.notFound().build();

		cerveza.setId(id);
		
		service.addCerveza(cerveza);

		return ResponseEntity.noContent().build();
	}
}
