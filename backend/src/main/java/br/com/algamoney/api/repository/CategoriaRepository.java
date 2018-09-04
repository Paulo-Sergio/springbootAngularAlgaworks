package br.com.algamoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.algamoney.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}