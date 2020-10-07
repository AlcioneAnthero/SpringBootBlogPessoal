package com.blogPessoalAlcione.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.blogPessoalAlcione.model.Tema;

@Repository
@EnableJpaRepositories
public interface TemaRepository extends JpaRepository<Tema, Long> {

	public List <Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
}
