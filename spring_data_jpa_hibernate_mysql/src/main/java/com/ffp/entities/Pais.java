package com.ffp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pais", schema = "prueba" ) 
public class Pais {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nombre;
	private String nacionalidad;
	private String  idioma ;
	
	
	
	
	public Pais(Long id) {
		super();
		this.id = id;
	}
	public Pais() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pais(String nombre, String nacionalidad, String idioma) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.idioma = idioma;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setAnacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	} 
	
	

}
