package com.ffp.spring.controllers;


import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ffp.spring.User;
import com.ffp.spring.entities.Pais;
import com.ffp.spring.entities.Provincia;
import com.ffp.spring.repository.MyDB;

/**
 * Handles requests for the application home page.
 */
@Controller
public class MenuController {
	
	MyDB mydb = new MyDB() ;
	private static final Logger logger = LoggerFactory.getLogger(MenuController.class);
	
	/**
	 * Muestra la lista de paises sacados de la clase MyDB
	 */
	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public String menu(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		 
		
		List<Pais> listaPais = mydb.getTablaPais();
		for (Pais pais : listaPais) {
			List<Provincia> laux = pais.getListProvincia();
			for (Provincia provincia : laux) {
				System.out.println(provincia);
				
			}
		}
		
		model.addAttribute("listaPais",listaPais);
				
		return "menu";
	}
	/**	  
	 * @param pais // Lo recibe desde la URL /spring/menuview?pais=X
	 * @return vista provincias. A la que se la ha pasado un lista de las 
	 * 							provincias obtenidas apartir del nombre del pais.
	 */
	@RequestMapping(value = "/menuview")
	public String menuView(@RequestParam(value="pais")String pais, Locale locale, Model model) {
		
		System.out.println("Acceso a menuView");
		Pais aux = null;
		List<Pais> lPais = mydb.getTablaPais();
		for (Pais pais1 : lPais) {
			if (pais1.getNombre().equals(pais))
				aux = pais1;
		}
		model.addAttribute("listaProvincia", aux.getListProvincia());
		
		
		return "provincias";
	}
	/**
	 * -----METODO DE PRUEBAS-----
	 * @param name -> Llega desde pruebas.jsp a traves de un metodo post.
	 * 				   @Requestaram(value=" name") lo recoge, name debe encajar con el nombre que 
	 * 					se le da en el jsp.
	 * 	jsp-->		<form action="recibir" method="post">Nombre:<input type="text" name="name">
	 * @return
	 */
	@RequestMapping(value = "/recibir", method=RequestMethod.POST)
	public String recibirPOST(@RequestParam(value="name")String name,
							  @RequestParam(value="lenguaje") String lenguaje,
							  @RequestParam(value="nivel") String nivel,
								Locale locale, Model model) {
		
		System.out.println("Acceso a  recibirPOST");
		
		model.addAttribute("enlace","Enlace desde recibir. "
								  + "Elemento name :"+name
								  +" Elemento lenguaje :"+lenguaje
								  +" Elemento nivel :"+nivel);
		
		
		return "provincias";
	}
	
	/**
	 * -----METODO DE PRUEBAS-----
	 * Metodo solo para entrar a la vista de pruebas
	 * la cual tiene los formularios para las pruebas
	 */
	@RequestMapping(value = "/*")
	public String pruebas(Locale locale, Model model) {
		
		System.out.println("Dentro pruebas");	
		
		return "pruebas";
	}
	
	
	/**
	 * -----METODO DE PRUEBAS-----
	 *  recibe peticion GET --> /pb?name=nombre
	 *	te envia a la pag provincias pasandole el string nombre a la vista 
	 */
	@RequestMapping(value = "/pb")
	public String pb(@RequestParam(value="name") String name, Locale locale, Model model) {
		
		System.out.println("Acceso a pb");
		
		model.addAttribute("enlace",name);
		
		
		return "provincias";
	}
	/**
	 * -----METODO DE PRUEBAS-----
	 *  recibe peticion GET --> /pb2/nombre
	 *	te envia a la pag provincias pasandole el string nombre a la vista 
	 *	mismo funcionamiento que el metodo anterior pero esta vez usando la anotacion @PathVariable
	 */
	@RequestMapping(value = "/pb2/{name}")
	public String pbVersion2(@PathVariable String name, Locale locale, Model model) {
		
		System.out.println("Acceso a  pbVersion2");
		
		model.addAttribute("enlace",name);
		
		
		return "provincias";
	}
	
	//----------------------------------------------------------------------------------------------------------------------//
	/**TRATAMIENTO USUARIO 
	 * TODO
	 * **/
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(Locale locale, Model model) {
		return "login";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String login(@Validated User user, Model model) {
		model.addAttribute("userName", user.getUserName());
		return "user";
	}
	
}
