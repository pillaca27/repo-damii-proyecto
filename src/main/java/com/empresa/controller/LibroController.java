package com.empresa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Libro;
import com.empresa.service.LibroServiceImpl;

@RestController
@RequestMapping("/rest/libro")
public class LibroController {
	
	@Autowired
	private LibroServiceImpl libroService;
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<List<Libro>> listar(){
		List<Libro> lista = libroService.listaLibro();
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public ResponseEntity<Libro> listarporid(@PathVariable("id") int id){
		Optional<Libro> optLibro = libroService.obtienePorId(id);
		if(optLibro.isPresent()) {
			return ResponseEntity.ok(optLibro.get());
		}else {
			return ResponseEntity.notFound().build();
		}
	}

	@PostMapping("/registrar")
	@ResponseBody
	public ResponseEntity<Libro> registrar(@RequestBody Libro bean) {
		return ResponseEntity.ok(libroService.insertaActualizaLibro(bean));
	}
	
	@DeleteMapping("/eliminar/{id}")
	@ResponseBody
	public ResponseEntity<Libro> eliminar(@PathVariable("id") int id) {
		Optional<Libro> optLibro = libroService.obtienePorId(id);
		if(optLibro.isPresent()) {
			libroService.eliminaLibro(id);
			return ResponseEntity.ok(optLibro.get());
		}else {
			return ResponseEntity.notFound().build();
		}
	}

}
