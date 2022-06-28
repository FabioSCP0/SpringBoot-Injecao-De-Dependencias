 package com.github.fabioscp0.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.github.fabioscp0.notificacao.NivelUrgencia;
import com.github.fabioscp0.notificacao.Notificador;
import com.github.fabioscp0.notificacao.NotificadorEmailMOCK;
import com.github.fabioscp0.notificacao.NotificadorSMS;
import com.github.fabioscp0.notificacao.TipoDoNotificador;

@Configuration
@Profile("development")
public class NotificacaoDevConfig {
	
    @Bean(initMethod = "init",destroyMethod = "destroy")
    @TipoDoNotificador(NivelUrgencia.URGENTE)
    Notificador NotificadorEmailMOCK() {
    	NotificadorEmailMOCK notificador = new NotificadorEmailMOCK();
        return notificador;
    }
    
    @Bean
    @TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
    Notificador notificarSMSMOCK() {
    	NotificadorSMS notificador = new NotificadorSMS();
        return notificador;        
    }
}
