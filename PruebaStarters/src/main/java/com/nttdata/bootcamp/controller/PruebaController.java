package com.nttdata.bootcamp.controller;

// IMPORTS /
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.saludoidioma.domain.Saludo;

//import temperatura.Temperatura;

/**
 * Controlador de prueba de la aplicación
 */
@RestController
public class PruebaController {
	
	@Autowired
	private Saludo saludo;
	
	@Autowired
	private Temperatura temperatura;
	
	@GetMapping(path="/prueba")
	public String pruebaSaludo() {
		return saludo.mensajeSaludo();
	}
	
	@GetMapping(path="/grados")
	public String pruebaTemperatura() {
		return temperatura.unidades();
	}	
	
	@GetMapping(path="/helloWorld")
	public String helloWorld() {
		return "¡Hola mundo!";
	}	
	
}
