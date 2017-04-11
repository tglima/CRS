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
 * @version 2017.04.11-1
 * @see Classe responsável pelos cálculos dos valores do aviso prévio.
 */
public class AvisoPrevio {
	
	/**
	 * Realiza o cálculo referente ao valor do aviso prévio.
	 * 
	 * @param salario Referente ao valor do salário base do funcionário.
	 * @param qtdDias Referente a quantidade de dias que esse funcionário
	 * deve cumprir o aviso.
	 * @return O valor do aviso prévio.
	 */
	public BigDecimal calcAvisoPrevio(BigDecimal salario, int qtdDias) {
		BigDecimal vlrAvisoP = new BigDecimal("0");
		
		if (qtdDias == 30) {
			vlrAvisoP = salario;
		} else {
			
			vlrAvisoP = new BigDecimal(qtdDias).multiply
			(salario.divide(new BigDecimal("30"), 2, RoundingMode.HALF_UP));

		}
		return vlrAvisoP;
		
	}	
	
	/**
	 * Realiza o cálculo do valor a ser descontado, caso o funcionário decida
	 * não cumprir o aviso prévio obrigatório.
	 * @param vlrAvisoP Refere-se ao valor correspondente do aviso prévio
	 * @return O valor a ser descontado do funcionário. 
	 */
	public BigDecimal descAvisoPrevio(BigDecimal vlrAvisoP){
		return new BigDecimal("-1").multiply(vlrAvisoP);
	}

}
