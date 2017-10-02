package br.com.crud.financeiro.controller;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.crud.financeiro.model.Entidade;
import br.com.crud.financeiro.repository.Entidades;
import br.com.crud.financeiro.service.EntidadeService;

@Controller
@RequestMapping(value = "/entidades")
public class EntidadesController {
	
	private static final String INDEX = "entidade/CadastrarEntidade";
	
	@Autowired
	private EntidadeService es;
	
	@Autowired
	private Entidades entidades;
	
	@RequestMapping(value = "/novo")
	private String novo(Entidade entidade){
		return INDEX;
	}
	
	@RequestMapping( value="/novo", method = RequestMethod.POST )
	private String salvar(@Valid Entidade entidade, BindingResult result){
		if ( result.hasErrors() ) {
			//TODO: Futuramente mostrar mensagem de erro
			return novo(entidade);
		}
		
		System.out.println("Entidade: " + entidade.toString());
		es.salvar(entidade);
		return "redirect:/entidades/novo";
	}
	
	@RequestMapping
	public String pesquisar(Entidade entidade , Model model){
		String nome = entidade.getNome() == null ? "%" : entidade.getNome();
		model.addAttribute("entidades", entidades.findByNomeContainingIgnoreCase(nome));
		return "entidade/PesquisaEntidade";
	}

	@RequestMapping("/{codigo}")
	public ModelAndView editar(@PathVariable("codigo") Entidade entidade){
		ModelAndView mv = new ModelAndView(INDEX);
		mv.addObject(entidade);
		return mv;
	}

}




