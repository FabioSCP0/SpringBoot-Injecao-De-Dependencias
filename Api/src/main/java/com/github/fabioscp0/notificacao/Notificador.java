package com.github.fabioscp0.notificacao;

import com.github.fabioscp0.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}