package br.edu.tglima.model.proventos;

import java.math.BigDecimal;

public abstract class Provento {
	
//	Atributos
	private BigDecimal valor;
	
//	Método Construtor.
	public Provento(){
		this.valor = new BigDecimal("-1");
	}
	
	
//	Métodos Getter e Setter
	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	

}
