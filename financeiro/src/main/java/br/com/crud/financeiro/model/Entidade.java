package br.com.crud.financeiro.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tab_entidades")
public class Entidade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(length = 60)
	private String nome;
	
	@Column(length = 20)
	private String cpfCnpj;
	
	@Column(length = 100)
	private String endereco;
	
	@Column(length = 30)
	private String cidade;
	
	@Column(length = 30)
	private String bairro;
	
	@Column(length = 2)
	private String estado;
	
	@Column(length = 20)
	private String telefone;
	
	@Column(length = 100)
	private String email;
	
	// O nome em mappedBy deve ser o mesmo nome do objeto
	// na entidade (classe) relacionada
	@OneToMany(mappedBy = "entidade", orphanRemoval = true) //orphanRemoval = true Não pode ter títulos sem entidade 
	private List<Titulo> titulos = new ArrayList<>();
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Entidade [codigo=" + codigo + ", nome=" + nome + ", cpfCnpj=" + cpfCnpj + ", endereco=" + endereco
				+ ", cidade=" + cidade + ", bairro=" + bairro + ", estado=" + estado + ", telefone=" + telefone
				+ ", email=" + email + "]";
	}
	
	
	
}
