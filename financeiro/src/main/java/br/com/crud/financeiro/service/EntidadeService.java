package br.com.crud.financeiro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.crud.financeiro.model.Entidade;
import br.com.crud.financeiro.repository.Entidades;

@Service
public class EntidadeService {
	@Autowired
	private Entidades entidades;
	
	public void salvar(Entidade entidade){
		entidades.save(entidade);
	}
}
