package com.bootH2.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bootH2.entities.Cliente;




public interface ClienteRepository extends CrudRepository<Cliente, Long>{
	
	//List<Cliente> findByName(String name);
	
	
	/**Utilizando una query accede directamente a la base de datos haciendo esa consulta*/ 
	@Query(value="SELECT * FROM CLIENTE", nativeQuery = true)
	List<Cliente> selectAll();

}
