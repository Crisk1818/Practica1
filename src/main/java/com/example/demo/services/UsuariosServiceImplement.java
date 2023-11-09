package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.IUsuariosDao;
import com.example.demo.usuarios.Usuarios;

@Service
public class UsuariosServiceImplement implements IUsuariosService {

	@Autowired
	private IUsuariosDao UsuariosDao; 
	@Override
	@Transactional (readOnly = true)
	public List<Usuarios> findAll() {
		// TODO Auto-generated method stub
		return (List<Usuarios>) UsuariosDao.findAll();
	}
	@Override
	@Transactional 
	public Usuarios save(Usuarios usuario) {
		// TODO Auto-generated method stub
		return UsuariosDao.save(usuario);
	}
	@Override
	@Transactional (readOnly = true)
	public Usuarios findById(Integer id) {
		// TODO Auto-generated method stub
		return UsuariosDao.findById(id).orElse(null);
		
	}
	@Override
	@Transactional 
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		UsuariosDao.deleteById(id);
		
		
	}

}
