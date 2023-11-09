package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.usuarios.Usuarios;

public interface IUsuariosDao extends CrudRepository<Usuarios,Integer>{
	

}
