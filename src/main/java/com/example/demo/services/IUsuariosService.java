package com.example.demo.services;

import java.util.List;

import com.example.demo.usuarios.Usuarios;

public interface IUsuariosService {
	public List<Usuarios> findAll();
	public Usuarios save (Usuarios usuario);
	public Usuarios findById(Integer id);
	public void delete (Integer id);
	

}
