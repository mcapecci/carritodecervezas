package com.carritodecervezas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carritodecervezas.model.Carrito;
import com.carritodecervezas.repository.CarritoRepository;

@Service
public class CarritoService {
	@Autowired
	private CarritoRepository repository;
	
    public List<Carrito> getAllCarritos(){
	   return repository.findAll();
    }

    public Optional<Carrito> getCarrito(long id) {
		return repository.findById(id);
	}
   
    public Carrito addCarrito(Carrito Carrito){
        return repository.save(Carrito);
    }

    public void updateCarrito(long id, Carrito Carrito){
        repository.save(Carrito);
    }

    public void deleteCarrito(long id){
		repository.deleteById(id);
    }
}
