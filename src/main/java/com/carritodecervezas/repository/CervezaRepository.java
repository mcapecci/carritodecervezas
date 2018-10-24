package com.carritodecervezas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carritodecervezas.model.Cerveza;

@Repository
public interface CervezaRepository extends JpaRepository<Cerveza, Long>{

}
