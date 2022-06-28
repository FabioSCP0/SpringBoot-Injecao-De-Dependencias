package com.github.fabioscp0.notificacao;

import com.github.fabioscp0.modelo.Cliente;

public class NotificadorSMS implements Notificador{
	
	public NotificadorSMS() {
		super();
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s por SMS através do telefone %s: %s\n", cliente.getNome(), cliente.getTelefone(),mensagem);
	}
	
}
