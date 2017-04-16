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
 * @see Classe responsável pelos cálculos dos valores do FGTS.
 */
public class Fgts {
	
	/**
	 * Calcula o saldo correspondente ao FGTS acumulado durante o período em que
	 * o funcionário trabalhou na empresa. 
	 * 
	 * @param salario Referente ao sálario base informado.
	 * @param totDiasTrab Referente ao total de dias que o funcionário
	 * trabalhou.
	 * @return Este método retorna um valor do tipo BigDecimal.
	 */
	public BigDecimal calcSaldoFgts(BigDecimal salario, int totDiasTrab) {
/*		Quebrei o cálculo em 3 linhas apenas para melhorar a visualização, 
 * 		mas considere tudo uma única linha.*/
		BigDecimal saldoFgts = new BigDecimal(totDiasTrab).multiply(
				new BigDecimal("0.08").multiply((salario.divide(
						new BigDecimal("30"), 2, RoundingMode.HALF_UP))));
		
		return saldoFgts;
	}	
	

	/**
	 * Calcula o valor da multa de 40% sobre o valor do FGTS
	 * 
	 * @param valorFgts Referente ao valor do FGTS do funcionário.
	 * @return O valor correspondente aos 40% da multa, sobre o valor do FGTS.
	 */
	public BigDecimal calcMulta(BigDecimal valorFgts) {
		return valorFgts.multiply(new BigDecimal("0.40"));
	}

	
	/**
	 * Realiza a soma dos valores Saldo do FGTS e da Multa de 40%.
	 * @param saldoFgts Referente ao valor do FGTS do funcionário.
	 * @param valorMulta Referente ao valor da multa de 40%.
	 * @return A soma dos 2 valores.
	 */
	public BigDecimal somarMultaeFgts(BigDecimal saldoFgts, BigDecimal valorMulta){
		return saldoFgts.add(valorMulta);
	}
	
}
