package com.loja.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.backend.entity.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long>{
    
}