package com.github.fabioscp0.notificacao;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.fabioscp0.modelo.Cliente;

public class NotificadorEmail implements Notificador{

	private boolean caixaAlta;
	
	@Autowired
	private NotificadorProperties properties;
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if(this.caixaAlta) mensagem = mensagem.toUpperCase();
		System.out.println("Host: "+properties.getHostServidor());
		System.out.println("Porta: "+properties.getPortaServidor());
		
		System.out.printf("Notificando %s através do email %s: %s\n",
				cliente.getNome(), cliente.getEmail(),mensagem);
	}
	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	} 

}
