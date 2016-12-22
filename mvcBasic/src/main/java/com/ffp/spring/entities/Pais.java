package com.ffp.spring.entities;

import java.util.List;

public class Pais {
	
	
	private Long idPais;
	
	private String nombre;
	
	
	private List<Provincia> listProvincia;
	
	
	
	
	//----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
	public Pais() {
		super();
		// TODO Auto-generated constructor stub
	}	
	public Pais(Long id) {
		super();
		this.idPais = id;
	}
	public Pais(String nombre) {
		super();
		this.nombre = nombre;
	}
	public Pais( String nombre, List<Provincia> lprovincia){
		
		this.nombre=nombre;
		this.listProvincia= lprovincia;
	}
	
	//----------------------------------------------------------------------
    // GETTERS & SETTERS 
    //----------------------------------------------------------------------

	public Long getId() {
		return idPais;
	}
	
	public void setId(Long id) {
		this.idPais = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public List<Provincia> getListProvincia() {
		return listProvincia;
	}
	
	public void setListProvincia(List<Provincia> listProvincia) {
		this.listProvincia = listProvincia;
	}
	@Override
	public String toString() {
		return "Pais [idPais=" + idPais + ", nombre=" + nombre + "]";
	}

}
