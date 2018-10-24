package com.carritodecervezas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
public class CarritoDeCervezasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarritoDeCervezasApplication.class, args);
	}
	
	/*
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setConfigLocation(new ClassPathResource("hibernate.cfg.xml"));
		return sessionFactoryBean;
	}
	*/
}
