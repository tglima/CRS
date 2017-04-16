/*******************************************************************************
 *   License
 *   Copyright 2017 Thiago Lima de Sousa <thg.limadesousa@gmail.com>
 *  
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *  
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *  
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
package br.edu.tglima.model.proventos;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Thiago Lima de Sousa
 * @see Classe responsável pelo cálculo do último salário do funcionário.
 *
 */
public class Salario {
	
/**	
 * 	Realiza o calculo proporcional do último salário que o funcionário irá
 *  receber, levando em conta o total de dias trabalhados no mês e o salário
 *  base do mesmo. 
 *  
 *  @param qtdDias Referente ao total de dias trabalhados no último mês.
 *  @param salario Referente ao salário base do funcionário.
 *  
 */
	public BigDecimal calcUltSal(int qtdDias, BigDecimal salario) {
		BigDecimal salarioFinal = new BigDecimal("0");
		
		if (qtdDias >= 30) {
			salarioFinal = salario;
		} else {
			salarioFinal = new BigDecimal(qtdDias).multiply
			((salario.divide(new BigDecimal("30"),
					2, RoundingMode.HALF_UP)));
		}
		
		return salarioFinal;

	}
	
	
}
