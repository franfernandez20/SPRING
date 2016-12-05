package com.bootH2.services;

import java.util.Iterator;


import org.springframework.beans.factory.annotation.Autowired;

import com.bootH2.entities.Cliente;
import com.bootH2.repositories.ClienteRepository;

public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository repository;
	
	@Override
	public Iterable<Cliente> listAllClientes() {
		
		return repository.findAll();
	}

	@Override
	public Cliente getClienteById(Long id) {
		
		return repository.findOne(id);
	}

	@Override
	public Cliente saveCliente(Cliente cliente) {
		
		
		return repository.save(cliente);
	}

	@Override
	public void deleteCliente(Long id) {
		
		if (id!=null)
			repository.delete(id);
		
	}

	@Override
	public Boolean existCliente(Cliente cliente) {
		
		Boolean exist = false;
		
		Iterator<Cliente> it = repository.findAll().iterator();
		while(it.hasNext()){
			if(it.equals(cliente))
				exist = true;
		}
		
		return exist;
	}

}
