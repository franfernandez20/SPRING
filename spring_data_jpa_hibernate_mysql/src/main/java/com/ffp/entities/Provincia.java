package com.ffp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="provincia", schema = "prueba" ) 
public class Provincia {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProvincia;
	
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name="idPais", referencedColumnName="idPais")
	private Pais pais;

	
	
	//----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------	
	public Provincia(String nombre, Pais pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
	}
	public Provincia() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//----------------------------------------------------------------------
    // GETTERS & SETTERS 
    //----------------------------------------------------------------------
	
	public Long getIdProvincia() {
		return idProvincia;
	}
	public void setIdProvincia(Long idProvincia) {
		this.idProvincia = idProvincia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
//	public Pais getPais() {
//		return pais;
//	}
//	public void setPais(Pais pais) {
//		this.pais = pais;
//	}
	@Override
	public String toString() {
		return "Provincia [idProvincia=" + idProvincia + ", nombre=" + nombre + ", pais=" + pais + "]";
	}
	

	
}
