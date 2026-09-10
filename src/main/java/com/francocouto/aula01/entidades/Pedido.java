package com.francocouto.aula01.entidades;

public class Pedido {

	private Integer codigo;
	private Double valor;
	private Double desconto;
	
	public Pedido () {
		
	}
	
	public Pedido(Integer codigo, Double basico, Double disconto) {
		super();
		this.codigo = codigo;
		this.valor = basico;
		this.desconto = disconto;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Double getvalor() {
		return valor;
	}

	public void setvalor(Double basico) {
		this.valor = basico;
	}

	public Double getDisconto() {
		return desconto;
	}

	public void setDisconto(Double disconto) {
		this.desconto = disconto;
	}
	
	
}
