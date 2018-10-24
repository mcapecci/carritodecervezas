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
import com.carritodecervezas.repository.CervezaRepository;

@RestController
public class CervezaResource {

	@Autowired
	private CervezaRepository cervezaRepository;

	@GetMapping("/cervezas")
	public List<Cerveza> retrieveAllCervezas() {
		return cervezaRepository.findAll();
	}
	
	@GetMapping("/cervezas/{id}")
	public Cerveza retrieveCerveza(@PathVariable long id) {
		Optional<Cerveza> cerveza = cervezaRepository.findById(id);

		if (!cerveza.isPresent())
			throw new CervezaNotFoundException("id-" + id);

		return cerveza.get();
	}

	@DeleteMapping("/cervezas/{id}")
	public void deleteCerveza(@PathVariable long id) {
		cervezaRepository.deleteById(id);
	}

	@PostMapping("/cervezas")
	public ResponseEntity<Object> createCerveza(@RequestBody Cerveza cerveza) {
		Cerveza savedCerveza = cervezaRepository.save(cerveza);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedCerveza.getId()).toUri();

		return ResponseEntity.created(location).build();

	}
	
	@PutMapping("/cervezas/{id}")
	public ResponseEntity<Object> updateCerveza(@RequestBody Cerveza cerveza, @PathVariable long id) {

		Optional<Cerveza> cervezaOptional = cervezaRepository.findById(id);

		if (!cervezaOptional.isPresent())
			return ResponseEntity.notFound().build();

		cerveza.setId(id);
		
		cervezaRepository.save(cerveza);

		return ResponseEntity.noContent().build();
	}
}
