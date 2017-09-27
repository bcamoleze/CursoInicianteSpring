package br.com.crud.financeiro.model;

public enum Tipo {
	ENTRADA("Entrada"),
	SAIDA("Saida");
	
	private String descricao;
	
	private Tipo(String descricao) {
		this.descricao = descricao;		
	}
	
	public String getDescricao() {
		return descricao;
	}
}

