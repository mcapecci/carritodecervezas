package com.carritodecervezas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carritodecervezas.model.Cerveceria;

@Repository
public interface CerveceriaRepository extends JpaRepository<Cerveceria, Long>{

}
