package com.loja.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.backend.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

	Pessoa findByEmail(String email);

}