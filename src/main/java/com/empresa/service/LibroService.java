package com.empresa.service;

import java.util.List;
import java.util.Optional;

import com.empresa.entity.Libro;

public interface LibroService {

	public abstract List<Libro> listaLibro();
	public abstract Libro insertaActualizaLibro(Libro obj);
	public abstract Optional<Libro> obtienePorId(int id);
	public abstract void eliminaLibro(int id);
}
