package com.empresa.service;

import java.util.List;
import java.util.Optional;

import com.empresa.entity.Usuario;


public interface UsuarioService {

	public abstract List<Usuario> listaUsuario();
	public abstract Usuario insertaActualizaUsuario(Usuario obj);
	public abstract Optional<Usuario> obtienePorId(int id);
	public abstract void eliminaUsuario(int id);
	public abstract Usuario listaUsuarioporEmail(String email);
	
	
}
