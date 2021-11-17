package com.empresa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Libro;
import com.empresa.repository.LibroRepository;

@Service
public class LibroServiceImpl implements LibroService{

	@Autowired
	private LibroRepository libroDao;
	
	@Override
	public List<Libro> listaLibro() {

		return libroDao.findAll();
	}

	@Override
	public Libro insertaActualizaLibro(Libro obj) {

		return libroDao.save(obj);
	}

	@Override
	public Optional<Libro> obtienePorId(int id) {

		return libroDao.findById(id);
	}

	@Override
	public void eliminaLibro(int id) {
		libroDao.deleteById(id);
	}

	
}
