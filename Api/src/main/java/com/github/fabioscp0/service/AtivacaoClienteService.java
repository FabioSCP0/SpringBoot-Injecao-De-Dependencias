package com.github.fabioscp0.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.github.fabioscp0.modelo.Cliente;

@Component
public class AtivacaoClienteService {

	// COM PADRÃO OBSERVER //
	
	@Autowired
	private ApplicationEventPublisher eventPublisher;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
	}
	
	// ---------------------------------- //
	
	// SEM PADRÃO OBSERVER //
	/*
	 * private Notificador notificador;
	 * 
	 * @Autowired Define onde o Spring irá INJETAR A DEPENDENCIA
	 * 
	 * @Autowired(required = false)A DEPENDENCIA tambem pode ser OPCIONAL
	 * 
	 * 
	 * DESAMBIGUAÇÃO DE BEAN USANDO PRIMARY-ServiceConfig-
	 * 
	 * @TipoDoNotificador(NivelUrgencia.URGENTE) public
	 * AtivacaoClienteService(Notificador notificador) { super(); this.notificador =
	 * notificador; }
	 * 
	 * DESAMBIGUAÇÃO DE BEAN USANDO LIST-ServiceConfig2- private List<Notificador>
	 * notificadores;
	 * 
	 * public AtivacaoClienteService(List<Notificador> notificadores) { super();
	 * this.notificadores = notificadores;
	 * 
	 * }
	 * 
	 * public void ativar(Cliente cliente) { cliente.ativar();
	 * 
	 * if(notificadores!=null) { for (Notificador notificador : notificadores) {
	 * notificador.notificar(cliente, "Seu cadastro no sistema esta ativo"); } }
	 * else
	 * 
	 * notificador.notificar(cliente, "Seu cadastro no sistema está ativo"); }
	 * 
	 * @Autowired public void setNotificador(Notificador notificador) {
	 * this.notificador=notificador; }
	 */
	// ---------------------------------- //
}
