package es.pildoras.SeguridadSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ElControlador {
	
	@GetMapping("/")
	public String muestraInicio() {
		return "Inicio";
	}
	
	//agregar Mapping a Administradores
	@GetMapping("/administradores")
	public String muestraAdministradores() {
		return "Administradores";
	}
	
	@GetMapping("/ayudantes")
	public String muestraAyudantes() {
		return "Ayudantes";
	}
	
	
}
