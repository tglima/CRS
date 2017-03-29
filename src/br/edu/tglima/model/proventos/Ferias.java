package br.edu.tglima.model.proventos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ferias {
		
	/**
	 * Método responsável por calcular o valor correspondente ao período
	 * aquisitivo de férias.
	 * 
	 * @param salario Referente ao salário base do Funcionário
	 * @param totMesesAqs Referente há quantidade de meses que o
	 * funcionário acumulou durante o período em que esteve na empresa.
	 * @return Este método retorna um valor do tipo BigDecimal.
	 */
	public BigDecimal calcValorFerias(BigDecimal salario, int totMesesAqs){
		BigDecimal valorFerias = new BigDecimal("-1");
		
		valorFerias = (salario.divide(new BigDecimal("12"), 2, RoundingMode.HALF_UP))
		.multiply(new BigDecimal(totMesesAqs));
		
		return valorFerias;
	}
	
	
	/**
	 * Método responsável por calcular a fração correspondente há
	 * 1/3 das Férias.
	 * 
	 * @param valorFerias Referente ao valor que será pago pelas
	 *  férias.
	 * @return Este método retorna um valor do tipo BigDecimal.
	 */
	public BigDecimal calcTercoFerias(BigDecimal valorFerias){
		BigDecimal tercoFerias = new BigDecimal("-1");
		tercoFerias = valorFerias.divide
				(new BigDecimal("3"), 2, RoundingMode.HALF_UP);
		
		return tercoFerias;
		
	}
	

}
