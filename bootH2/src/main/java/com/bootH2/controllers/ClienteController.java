package com.bootH2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bootH2.entities.Cliente;
import com.bootH2.repositories.ClienteRepository;

@RestController
public class ClienteController {

	@Autowired
	ClienteRepository repository;
	
	    
	    @RequestMapping("/")
	    public String index() {
	        
	    	Cliente cliente=new Cliente();
	    	cliente.setApellidos("pepez");
	    	cliente.setName("pepito");
	    	repository.save(cliente);
	    	
	    	List<Cliente> l =repository.selectAll();
	    	String salida = "Usuarios:\n";
	    	for (Cliente c:l){
	    		salida+= c +"\n";
	    		
	    	}return salida;
	    	
	    	//return "Greetings from Spring Boot!";
	    }
	    
}
