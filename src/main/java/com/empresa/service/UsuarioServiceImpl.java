package com.empresa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Usuario;
import com.empresa.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository usuarioDao;

	@Override
	public List<Usuario> listaUsuario() {
		return usuarioDao.findAll();
	}

	@Override
	public Usuario insertaActualizaUsuario(Usuario obj) {
		return usuarioDao.save(obj);
	}

	@Override
	public Optional<Usuario> obtienePorId(int id) {
		return usuarioDao.findById(id);
	}

	@Override
	public void eliminaUsuario(int id) {
		usuarioDao.deleteById(id);
	}

	@Override
	public Usuario listaUsuarioporEmail(String email) {
		return usuarioDao.findByUsuario(email);
	}
	
	
}
