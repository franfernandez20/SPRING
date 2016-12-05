package com.bootH2.controllers;
/*---*/
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bootH2.entities.Cliente;

import com.bootH2.services.ClienteService;

@RestController
public class ClienteController {

	//@Autowired
	ClienteService repository;
	
	
		public static final Logger logger = Logger.getLogger(ClienteController.class);
	    
		@RequestMapping("/")
	    public String index(@RequestParam String name) {
	        
			logger.info("Recibida solicitud con parámetro name="+name);
	    	Cliente cliente=new Cliente();
	    	cliente.setApellidos(name);
	    	cliente.setName("pepito");
	    	repository.saveCliente(cliente);
	    	
	    	Iterable<Cliente> l =repository.listAllClientes();
	    	String salida = "Usuarios:\n";
	    	for (Cliente c:l){
	    		salida+= c +"\n";
	    		
	    	}return salida;
	    	
	    	//return "Greetings from Spring Boot!";
	    }
		
		@RequestMapping("/hello")
		public ModelAndView hello(){
			
			Cliente c = new Cliente("pedro", "apellido");
			return new ModelAndView("hello").addObject("name",c);		
		}
		
		@RequestMapping("/pb")
		public ModelAndView pb(){
			
			
			return new ModelAndView("index_template");
		}
		@RequestMapping("/home")
		public String home(){
			
			Cliente c = new Cliente("pedro", "apellido");
			ModelAndView mav = new ModelAndView();
			mav.setViewName("index.jsp");
			return "hello.html";		
		}
		@RequestMapping("uno.htm")
		public String uno(ModelMap modelo) {
			modelo.addAttribute("uno", "1");
			return "index.jsp";
		}
		
		/**@RequestMapping("/home")
		public ModelAndView prueba(HttpServletRequest request){
						
			ModelAndView mav = new ModelAndView();
			String id = request.getParameter("id");
			mav.addObject("id", id);
			mav.setViewName("hello");
			return mav;		
		}**/
		
	    @RequestMapping(value = "/clientes", method = RequestMethod.GET)
	    public Iterable<Cliente> getCliente() {
	    	
	    	return repository.listAllClientes();
	    }
	    @RequestMapping(value = "addCliente", method = RequestMethod.POST)
	    public ModelAndView form(@RequestParam("name") String name,
	    						@RequestParam ("apellido") String apellido)
	    {
	    	
	    	
	    	Cliente c = new Cliente(name,apellido);
	    	repository.saveCliente(c);
	    	
	    	return new ModelAndView("index_template");
	    }
	    @RequestMapping(value = "/a", method = RequestMethod.GET)
	    public String list(Model model){
	        model.addAttribute("products",repository.listAllClientes());
	        return "index_template";
	    }

	    
 
}
