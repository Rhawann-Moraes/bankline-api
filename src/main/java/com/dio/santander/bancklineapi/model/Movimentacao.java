package com.dio.santander.bancklineapi.model;

public class Movimentacao {
	private Integer id;
	private LocalDatetime dataHora;
	private String descricao;
	private Double valor;
	private MovimentacaoTipo tipo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDatetime getDataHora() {
		return dataHora;
	}
	public void setDataHora(LocalDatetime dataHora) {
		this.dataHora = dataHora;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public MovimentacaoTipo getTipo() {
		return tipo;
	}
	public void setTipo(MovimentacaoTipo tipo) {
		this.tipo = tipo;
	}
	
}
