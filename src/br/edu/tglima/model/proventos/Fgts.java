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

public class Fgts implements ICaptura {

	/**
	 * Método responsável por fazer o tratamento e conversão
	 * do valor obtido da view.
	 *  @param s Referente ao valor digitado pelo usuário na view.
	 *  @return Este método retorna um valor do tipo BigDecimal.
	 */
	@Override
	public BigDecimal capturarValor(String s) {
		BigDecimal valorCapturado = new BigDecimal("-1");
		try {
		s = s.replace(" ", "").replace(".", "").replace(",", ".").replace("R$", "");
			valorCapturado = new BigDecimal(s);
		} catch (Exception e) {
			
		}
		return valorCapturado;
	}
	
	/**
	 * Método responsável por calcular o saldo correspondente ao FGTS
	 * que o funcionário acumulou durante o período em que
	 * o funcionário trabalhou na empresa. 
	 * 
	 * @param salario Referente ao sálario base informado.
	 * @param totDiasTrab Referente ao total de dias que o funcionário
	 * trabalhou.
	 * @return Este método retorna um valor do tipo BigDecimal.
	 */
	public BigDecimal calcSaldoFgts(BigDecimal salario, int totDiasTrab) {
		BigDecimal saldoFgts = new BigDecimal("-1");
		
        saldoFgts = new BigDecimal(totDiasTrab).multiply(new BigDecimal("0.08").
        multiply((salario.divide(new BigDecimal("30"), 2, RoundingMode.HALF_UP))));
		
		return saldoFgts;
	}
	
	/**
	 * Método responsável por cálcular o valor da multa de 40%
	 * sobre o valor do FGTS obtido durante o período em que
	 * o funcionário trabalhou na empresa.
	 * 
	 * @param valorFgts Referente ao valor do FGTS do funcionário.
	 * @return Este método retorna um valor do tipo BigDecimal.
	 */
	public BigDecimal calcMulta(BigDecimal valorFgts) {
		BigDecimal multa = new BigDecimal("-1");
		multa = valorFgts.multiply(new BigDecimal("0.40"));
		return multa;
	}
	
}
