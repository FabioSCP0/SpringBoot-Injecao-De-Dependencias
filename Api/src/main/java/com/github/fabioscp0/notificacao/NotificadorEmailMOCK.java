package com.github.fabioscp0.notificacao;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.fabioscp0.modelo.Cliente;

public class NotificadorEmailMOCK implements Notificador{
	
	@Autowired
	private NotificadorProperties properties;
	
	public NotificadorEmailMOCK() {
		super();
		System.out.println("Mock");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		  System.out.println("Host: "+properties.getHostServidor());
		  System.out.println("Porta: "+properties.getPortaServidor());
		 
		
		System.out.printf("MOCK: Notificando %s através do email %s: %s\n",
				cliente.getNome(), cliente.getEmail(),mensagem);
	}

	
	public void init() {
		System.out.println("INIT");
	}
	
	public void destroy() {
		System.out.println("DESTROY");
	}
}
