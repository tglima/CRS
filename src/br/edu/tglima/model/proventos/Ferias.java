package br.edu.tglima.model.proventos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ferias extends Provento {
	
//	Atributo
	private BigDecimal tercoFerias;
	
	
//	Construtor da Classe
	public Ferias(){
		this.tercoFerias = new BigDecimal("-1");
	}


//	Método Getter e Setter.
	public BigDecimal getTercoFerias() {
		return tercoFerias;
	}


	public void setTercoFerias(BigDecimal tercoFerias) {
		this.tercoFerias = tercoFerias;
	}
	
//	Métodos personalizados
	public BigDecimal calcValorFerias(BigDecimal salario, int totMesesAqs){
		BigDecimal valorFerias = new BigDecimal("-1");
		
		valorFerias = (salario.divide(new BigDecimal("12"), 2, RoundingMode.HALF_UP))
		.multiply(new BigDecimal(totMesesAqs));
		
		return valorFerias;
	}
	
	public BigDecimal calcTercoFerias(BigDecimal valorFerias){
		this.tercoFerias = valorFerias.divide
				(new BigDecimal("3"), 2, RoundingMode.HALF_UP);
		
		return this.tercoFerias;
		
	}
	

}
