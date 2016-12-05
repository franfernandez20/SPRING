package com.bootH2.services;

import com.bootH2.entities.Cliente;

public interface ClienteService {
	
	Iterable<Cliente> listAllClientes();

	Cliente getClienteById(Long id);

	Cliente saveCliente(Cliente cliente);

	void deleteCliente(Long id);
	
	Boolean existCliente(Cliente cliente);

}
