package com.carritodecervezas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carritodecervezas.model.Cerveza;
import com.carritodecervezas.repository.CervezaRepository;

@Service
public class CervezaService {
	
	@Autowired
	private CervezaRepository repository;
	
   public List<Cerveza> getAllCervezas(){
	   return repository.findAll();
    }

    public Optional<Cerveza> getCerveza(long id){
    	return repository.findById(id);
    }

    public Cerveza addCerveza(Cerveza Cerveza){
        return repository.save(Cerveza);
    }

    public void updateCerveza(long id, Cerveza Cerveza){
        repository.save(Cerveza);
    }

    public void deleteCerveza(long id){
		repository.deleteById(id);
    }
}
