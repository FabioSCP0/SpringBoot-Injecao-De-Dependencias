 package com.github.fabioscp0.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.github.fabioscp0.notificacao.NivelUrgencia;
import com.github.fabioscp0.notificacao.Notificador;
import com.github.fabioscp0.notificacao.NotificadorEmail;
import com.github.fabioscp0.notificacao.NotificadorSMS;
import com.github.fabioscp0.notificacao.TipoDoNotificador;

@Configuration
@Profile(value = {"production","default"})
public class NotificacaoProdConfig {
	
    @Bean
    @TipoDoNotificador(NivelUrgencia.URGENTE)
   
    Notificador notificarEmail() {
    	NotificadorEmail notificador = new NotificadorEmail();
        notificador.setCaixaAlta(true);
        return notificador;
    }
    
    @Bean
    @TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
    Notificador notificarSMS() {
    	NotificadorSMS notificador = new NotificadorSMS();
        return notificador;        
    }
    
}
