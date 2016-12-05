package com.bootH2.utilities;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bootH2.entities.Cliente;
import com.bootH2.repositories.ClienteRepository;

@Component
public class DatabaseLoader {
	@Autowired
	private ClienteRepository repository;
	@PostConstruct
	private void initDatabase() {
		// Create
		repository.save(new Cliente("John", "Doe"));
		repository.save(new Cliente("Michael", "Smith"));
		// Update
		Cliente firstCustomet = repository.findAll().iterator().next();
		System.out.println(firstCustomet);
		firstCustomet.setName("Peter");
		
		repository.save(firstCustomet);
		// Read
		Iterable<Cliente> all = repository.findAll();
		for (Cliente customer : all) {
			System.out.println(customer);
		}
		// Delete
		long firstId = repository.findAll().iterator().next().getId();
		//repository.delete(firstId);
		System.out.println(repository.count());
 }
} 
