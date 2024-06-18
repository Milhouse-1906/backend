package com.loja.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.backend.entity.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long> {

}
