/*******************************************************************************
 * /* License
 *  * Copyright 2017 Thiago Lima de Sousa <thg.limadesousa@gmail.com>
 *  *
 *  * This program is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * This program is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *  */ 
 *******************************************************************************/
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
