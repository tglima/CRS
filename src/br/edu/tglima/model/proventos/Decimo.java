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
 * 
 * @author Thiago Lima de Sousa
 * @version 2017.04.09-1
 * @see Classe responsável pelo cálculo do valor do décimo terceiro salário.
 */
public class Decimo {
	
	/**
	 * Realiza o cálculo referente ao valor do décimo terceiro salário.
	 * 
	 * @param qtdMeses Referente há quantidade de meses trabalhados
	 * no último ano do funcionário.
	 * @param salário Referente ao valor do salário base do funcionário.
	 * @return
	 */
	public BigDecimal calcDecimo(int qtdMeses, BigDecimal salario) {
		BigDecimal vlrDecimo = (salario.divide(new BigDecimal("12"), 
					2, RoundingMode.HALF_UP).multiply(new BigDecimal(qtdMeses)));
		return vlrDecimo;
	}
	
	

}
