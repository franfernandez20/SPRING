package com.bootH2.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
		
		private String name;
		private String apellidos;
		
		
		
		
		public Cliente() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Cliente(String name, String apellidos) {
			super();
			this.name = name;
			this.apellidos = apellidos;
		}
		@Override
		public String toString() {
			return "Cliente [name=" + name + ", apellidos=" + apellidos + "]";
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getApellidos() {
			return apellidos;
		}
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		public long getId() {			
			return this.id;
		}
		
}
