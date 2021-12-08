package br.org.generation.famarciadobem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.famarciadobem.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
	
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
	}


