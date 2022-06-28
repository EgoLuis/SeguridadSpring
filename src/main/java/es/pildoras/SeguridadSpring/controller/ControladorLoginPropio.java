package es.pildoras.SeguridadSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class ControladorLoginPropio {

	@GetMapping("/miFormularioLogin")
	public String muestraLoginPropio() {
		return "login_nuevo";
	}
	
}
