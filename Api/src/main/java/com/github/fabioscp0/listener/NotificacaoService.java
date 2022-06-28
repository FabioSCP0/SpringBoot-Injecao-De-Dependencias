package com.github.fabioscp0.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.github.fabioscp0.notificacao.NivelUrgencia;
import com.github.fabioscp0.notificacao.Notificador;
import com.github.fabioscp0.notificacao.TipoDoNotificador;
import com.github.fabioscp0.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {
	
	@TipoDoNotificador(NivelUrgencia.URGENTE)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void ClienteAtivadoListener(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(),"Seu cadastro no sistema está ativo");
	}
}
