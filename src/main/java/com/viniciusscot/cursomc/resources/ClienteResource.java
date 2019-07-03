package com.viniciusscot.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viniciusscot.cursomc.domain.Cliente;
import com.viniciusscot.cursomc.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {

	@Autowired
	private ClienteService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Cliente> find(@PathVariable Integer id) {

		Cliente obj = service.find(id);

		return ResponseEntity.ok().body(obj);
	}

}
