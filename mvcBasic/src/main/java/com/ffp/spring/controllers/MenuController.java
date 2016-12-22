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
	 * Simply selects the home view to render by returning its name.
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
		
		
		
		
		//model.addAttribute("listPais",mydb.getTablaPais());
		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
		
		return "menu";
	}
	
	@RequestMapping(value = "/menuview")
	public String menuView(@RequestParam(value="pais")String pais, Locale locale, Model model) {
		
		System.out.println("Dentro menuView");
		Pais aux = null;
		List<Pais> lPais = mydb.getTablaPais();
		for (Pais pais1 : lPais) {
			if (pais1.getNombre().equals(pais))
				aux = pais1;
		}
		model.addAttribute("listaProvincia", aux.getListProvincia());
		
		
		return "provincias";
	}
	
	@RequestMapping(value = "/recibir", method=RequestMethod.POST, params={"lenguaje=Java"})
	public String recibir( Locale locale, Model model) {
		
		System.out.println("Dentro pruebas");
		
		model.addAttribute("enlace","enlace OK");
		
		
		return "provincias";
	}
	@RequestMapping(value = "/pb")
	public String pb(@RequestParam(value="name") String name, Locale locale, Model model) {
		
		System.out.println("Dentro pb");
		
		model.addAttribute("enlace",name);
		
		
		return "provincias";
	}
	
	
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
