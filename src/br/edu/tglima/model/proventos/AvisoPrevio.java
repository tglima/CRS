package br.edu.tglima.model.proventos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AvisoPrevio extends Provento {

//	Método personalizado da classe
	public BigDecimal calcAvisoPrevio(BigDecimal salario, int qtdDias) {
		BigDecimal valorAviso = new BigDecimal("-1");
		
		if (qtdDias == 30) {
			valorAviso = salario;
		} else {
			
			valorAviso = new BigDecimal(qtdDias).multiply
			(salario.divide(new BigDecimal("30"), 2, RoundingMode.HALF_UP));

		}
		return valorAviso;
		
	}
	
	
	
}
