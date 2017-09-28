package br.com.crud.financeiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.crud.financeiro.model.Entidade;

@Repository
public interface Entidades extends JpaRepository<Entidade, Long> {
	
}
