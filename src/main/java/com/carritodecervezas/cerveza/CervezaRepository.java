package com.carritodecervezas.cerveza;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CervezaRepository extends JpaRepository<Cerveza, Long>{

}
