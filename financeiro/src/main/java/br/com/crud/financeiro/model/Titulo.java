package br.com.crud.financeiro.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="tab_titulos")
public class Titulo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	//Já carrega as entidades do titulo
	@ManyToOne(fetch = FetchType.LAZY) 
	@JoinColumn(name="entidadeID")
	private Entidade entidade;
	
	
	private Date dataDeEmissao;
	private Date dataDeValidade; 
	private Date dataDoPagamento;
	private BigDecimal valor;
	private BigDecimal valorPago;
	private BigDecimal valorOriginal;
	
	@Enumerated(EnumType.STRING)
	private Situacao situacao;
	
	@Enumerated(EnumType.STRING)
	private Tipo tipo;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipoPagamentoID")
	private TipoPagamento tipoPagamento;
	
	public Situacao getSituacao() {
		return situacao;
	}
	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}
	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public Entidade getEntidade() {
		return entidade;
	}
	public void setEntidade(Entidade entidade) {
		this.entidade = entidade;
	}
	public Date getDataDeEmissao() {
		return dataDeEmissao;
	}
	public void setDataDeEmissao(Date dataDeEmissao) {
		this.dataDeEmissao = dataDeEmissao;
	}
	public Date getDataDeValidade() {
		return dataDeValidade;
	}
	public void setDataDeValidade(Date dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}
	public Date getDataDoPagamento() {
		return dataDoPagamento;
	}
	public void setDataDoPagamento(Date dataDoPagamento) {
		this.dataDoPagamento = dataDoPagamento;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public BigDecimal getValorPago() {
		return valorPago;
	}
	public void setValorPago(BigDecimal valorPago) {
		this.valorPago = valorPago;
	}
	public BigDecimal getValorOriginal() {
		return valorOriginal;
	}
	public void setValorOriginal(BigDecimal valorOriginal) {
		this.valorOriginal = valorOriginal;
	}
	
	

}


