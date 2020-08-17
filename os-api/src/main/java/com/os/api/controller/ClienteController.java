package com.os.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.os.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		 Cliente cliente1 = new Cliente();
		 cliente1.setId(1L);
		 cliente1.setNome("Joao");
		 cliente1.setEmail("joao@joao.com");
		 cliente1.setTelefone("997749254");
		 
		 Cliente cliente2 = new Cliente();
		 cliente2.setId(2L);
		 cliente2.setNome("Joao2");
		 cliente2.setEmail("joao2@joao.com");
		 cliente2.setTelefone("94549254");
		
		return Arrays.asList(cliente1, cliente2);
		
	}
	

}
