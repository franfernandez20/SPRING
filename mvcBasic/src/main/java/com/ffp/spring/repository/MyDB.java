package com.ffp.spring.repository;

import java.util.ArrayList;
import java.util.List;

import com.ffp.spring.entities.*;

public class MyDB {
	
	List<Pais> tablaPais;
	List<Provincia> tablaProvincia;
	
	public MyDB(){
		
		List<Pais> lpais= new ArrayList<Pais>();
		List<Provincia> lprovincia = new ArrayList<Provincia>();
		List<Provincia> lpaux = new ArrayList<Provincia>();
		List<Provincia> lpaux0 = new ArrayList<Provincia>();
		
		
		Pais p1 = new Pais("Spain");
		Pais p2 = new Pais("Francia");
		
		Provincia provincia = new Provincia("madrid",p1);
    	Provincia provincia1 = new Provincia("valencia",p1);
    	Provincia provincia2 = new Provincia("andalucia",p1);

		Provincia provincia4 = new Provincia("paris",p2);
    	Provincia provincia5 = new Provincia("marsella",p2);
    	Provincia provincia6 = new Provincia("lyon",p2);
    	
    	lprovincia.add(provincia);
    	lprovincia.add(provincia1);
    	lprovincia.add(provincia2);
    	
    	
    	lprovincia.add(provincia4);
    	lprovincia.add(provincia5);
    	lprovincia.add(provincia6);
    	
    	lpaux0.add(provincia);
    	lpaux0.add(provincia1);
    	lpaux0.add(provincia2);
    	p1.setListProvincia(lpaux0);
    	
    	lpaux.add(provincia4);
    	lpaux.add(provincia5);
    	lpaux.add(provincia6);
    	p2.setListProvincia(lpaux); 
    	
    	
    	lpais.add(p1);
    	lpais.add(p2);
    	this.tablaPais= lpais;
    	this.tablaProvincia = lprovincia;
	}

	public List<Pais> getTablaPais() {
		return tablaPais;
	}

	public void setTablaPais(List<Pais> tablaPais) {
		this.tablaPais = tablaPais;
	}

	public List<Provincia> getTablaProvincia() {
		return tablaProvincia;
	}

	public void setTablaProvincia(List<Provincia> tablaProvincia) {
		this.tablaProvincia = tablaProvincia;
	}
	
	

}
