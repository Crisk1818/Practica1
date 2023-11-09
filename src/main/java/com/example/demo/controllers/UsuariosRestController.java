package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.IUsuariosService;
import com.example.demo.usuarios.Usuarios;

@RestController
@RequestMapping("/api")

public class UsuariosRestController {
	@Autowired
	private IUsuariosService usuarioservice;
	
	@GetMapping("/usuarios")
	public List<Usuarios> indext(){
		return usuarioservice.findAll();

	}
	
	@GetMapping("/usuarios/{id}")
	public Usuarios show(@PathVariable Integer id) {
		return usuarioservice.findById(id);
	}
	
	@PostMapping("/usuarios")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuarios create(@RequestBody Usuarios usuario) {
		return usuarioservice.save(usuario);
	}
	
	@PutMapping("/usuarios/{id}")
	public Usuarios update(@RequestBody Usuarios usuario,@PathVariable Integer id) {
		Usuarios usuarioactual = usuarioservice.findById(id);
		usuarioactual.setEdad(usuario.getEdad());
		usuarioactual.setNombre(usuario.getNombre());
		usuarioactual.setTelefono(usuario.getTelefono());
		return usuarioservice.save(usuarioactual);
			
	}
	
	@DeleteMapping("/usuarios/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		usuarioservice.delete(id);
		
	}
	
}
