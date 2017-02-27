package br.edu.tglima.model.proventos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AvisoPrevio {

	/**
	 * Método responsável por calcular o valor do aviso prévio.
	 * 
	 * @param salario Referente ao valor do salário base do funcionário.
	 * @param qtdDias Referente há quantidade de dias que esse funcionário
	 * deve cumprir o aviso.
	 * @return Este método retorna um valor do tipo BigDecimal.
	 */
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
