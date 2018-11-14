package com.carritodecervezas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carritodecervezas.model.Carrito;

@Repository
public interface CarritoRepository extends JpaRepository<Carrito, Long>{

}
