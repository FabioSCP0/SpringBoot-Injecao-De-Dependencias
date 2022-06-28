package com.github.fabioscp0.service;

import com.github.fabioscp0.modelo.Cliente;

//PADRÃO OBSERVER
public class ClienteAtivadoEvent {
	
	private Cliente cliente;

	public ClienteAtivadoEvent(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
}
