package com.example.Parqueadero.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/park")
public class ParqueaderoController {
	

		
	@GetMapping("/get")
	public String getEstado(){
		return null;
	}
	
//	@PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE)

	
	
	

}
