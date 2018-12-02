package com.carritodecervezas;

import java.util.HashSet;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.carritodecervezas.model.*;
import com.carritodecervezas.repository.*;

@SpringBootApplication
public class CarritoDeCervezasApplication implements CommandLineRunner{
	
	@Autowired
	private CerveceriaRepository cerveceriaRepository;
	@Autowired
	private CervezaRepository cervezaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CarritoDeCervezasApplication.class, args);
	}
	
	
	@Override
    public void run(String... args) throws Exception { 
		//clearData();
    	saveData();
    	showData();
    }
    
    @Transactional
    private void clearData(){
    	cerveceriaRepository.deleteAll();
    }
    
    @Transactional
    private void saveData(){
    	Cerveceria cerveceria = new Cerveceria("Capecci Cerveceria");
    	
    	Cerveza c1 = new Cerveza("Cerveza 1", Tipo.ALE, (double)120);
		Cerveza c2 = new Cerveza("Cerveza 2", Tipo.LAGER, (double)130);
		Cerveza c3 = new Cerveza("Cerveza 3", Tipo.LAGER, (double)115);
		
		Carrito carrito1 = new Carrito();
		ItemCarrito ic1 = new ItemCarrito(3, c1);
		ItemCarrito ic2 = new ItemCarrito(4, c2);
		ItemCarrito ic3 = new ItemCarrito(1, c3);
		carrito1.addItem(ic1);
		carrito1.addItem(ic2);
		carrito1.addItem(ic3);;
		
		Carrito carrito2 = new Carrito();
		ItemCarrito ic4 = new ItemCarrito(2, c1);
		carrito2.addItem(ic4);
		
		cerveceria.setCarritos(new HashSet<Carrito>() {{
			add(carrito1);
			add(carrito2);
		}});
		
		cerveceria.setCervezas(new HashSet<Cerveza>() {{
			add(c1);
			add(c2);
			add(c3);
		}});
		
		cerveceriaRepository.save(cerveceria);
	
    }
    
    @Transactional
    private void showData(){
    	//Get All Data
    	List<Cerveceria> cerveceriaList = cerveceriaRepository.findAll();
        List<Cerveza> cervezaList = cervezaRepository.findAll();
         
        System.out.println("===================Cerveceria List:==================");
        cerveceriaList.forEach(System.out::println);
         
        System.out.println("===================Cerveza List:==================");
        cervezaList.forEach(System.out::println);
    }

}
