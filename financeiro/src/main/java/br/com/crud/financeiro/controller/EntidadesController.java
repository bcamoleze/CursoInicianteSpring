package br.com.crud.financeiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.crud.financeiro.model.Entidade;
import br.com.crud.financeiro.service.EntidadeService;

@Controller
@RequestMapping(value = "/entidades")
public class EntidadesController {
	
	private static final String INDEX = "entidade/CadastrarEntidade";
	
	@Autowired
	private EntidadeService es;
	
	@RequestMapping(value = "/novo")
	private String novo(){
		return INDEX;
	}
	
	@RequestMapping( value="/novo", method = RequestMethod.POST )
	private String salvar(Entidade entidade){
		System.out.println("Entidade: " + entidade.toString());
		es.salvar(entidade);
		return novo();
	}
}

