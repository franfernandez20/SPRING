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
		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}
		/* (non-Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Cliente other = (Cliente) obj;
			if (apellidos == null) {
				if (other.apellidos != null)
					return false;
			} else if (!apellidos.equals(other.apellidos))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		
}
