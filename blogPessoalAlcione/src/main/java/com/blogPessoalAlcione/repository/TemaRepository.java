package com.blogPessoalAlcione.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogPessoalAlcione.model.Tema;


public interface TemaRepository extends JpaRepository<Tema, Long> {

	public List <Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
}
