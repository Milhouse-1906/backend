package com.loja.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.backend.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    
}