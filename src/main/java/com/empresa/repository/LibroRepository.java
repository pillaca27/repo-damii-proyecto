package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer>{
 
}
