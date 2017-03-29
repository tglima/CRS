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
