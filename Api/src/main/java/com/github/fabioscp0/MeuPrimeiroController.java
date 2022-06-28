package com.github.fabioscp0;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.fabioscp0.modelo.Cliente;
import com.github.fabioscp0.service.AtivacaoClienteService;

@Controller
public class MeuPrimeiroController {
	
	private AtivacaoClienteService ativacaoClienteService;
	
	public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
		super();
		this.ativacaoClienteService = ativacaoClienteService;
	}

	@GetMapping("/Hello")
	@ResponseBody
	public String hello() {
		
		Cliente fabio = new Cliente("Fabio","fabio@teste.com","123456789");
		ativacaoClienteService.ativar(fabio);
		return "Hello!";
	}
}