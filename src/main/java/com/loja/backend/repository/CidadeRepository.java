package com.loja.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.backend.entity.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{
    
}

