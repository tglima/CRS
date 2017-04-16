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
 * @see Classe responsável pelos cálculos dos valores referentes as férias.
 */
public class Ferias {
	
	
	/**
	 * Calcula o valor correspondente ao período
	 * aquisitivo de férias.
	 * 
	 * @param salario Referente ao salário base do Funcionário
	 * @param totMesesAqs Referente há quantidade de meses que o
	 * funcionário acumulou durante o período em que esteve na empresa.
	 * @return Este método retorna um valor do tipo BigDecimal.
	 */
	public BigDecimal calcValorFerias(BigDecimal salario, int totMesesAqs){
		
/*		Quebrei o cálculo em 3 linhas apenas para ter uma melhor visualização.*/		
		BigDecimal vlrFerias = (salario.divide(
				new BigDecimal("12"), 2, RoundingMode.HALF_UP))
						.multiply(new BigDecimal(totMesesAqs));
		
		return vlrFerias;
	}
	
	/**
	 * Calcula a fração correspondente a 1/3 das Férias.
	 * 
	 * @param valorFerias Referente ao valor que será pago pelas
	 *  férias.
	 * @return O valor correspondente a 1/3 do valor sobre as férias.
	 */
	public BigDecimal calcTercoFerias(BigDecimal vlrFerias){
		
/*		Quebrei o cálculo em 2 linhas apenas para ter uma melhor visualização.*/		
		BigDecimal vlrTercoFerias = vlrFerias.divide
				(new BigDecimal("3"), 2, RoundingMode.HALF_UP);
		
		return vlrTercoFerias;
		
	}
	/**
	 * Determina o valor corresponde a uma ferias vencidas.
	 * @param salario Referente ao salário base do funcionário.
	 * @param object Referente se o funcionário possui ou não algum periodo
	 * de férias vencidas.
	 * @return	O valor a receber correspondente a uma férias vencida.
	 */
	public BigDecimal calcVlrFeriasVenc(BigDecimal salario, Boolean object){
		if (object) {
			return salario;
		} else {
			return new BigDecimal("0");
		}
	}
	
	/**
	 * Calcula fração correspondente a 1/3 do valor das férias vencidas.
	 * @param vlrFeriasVenc Referente ao valor a receber pela quantidade de 
	 * férias vencidas.
	 * @param object Referente se o funcionário possui ou não algum periodo
	 * de férias vencidas.
	 * @return O valor correspondente a 1/3 do valor sobre as férias vencidas.
	 */
	public BigDecimal calcVlrTerFeriasV(BigDecimal vlrFeriasVenc, Boolean object){
		if (object) {
			return calcTercoFerias(vlrFeriasVenc);
		} else {
			return new BigDecimal("0");

		}
		
	}
	
	/**
	 * De acordo com a opção vinda do object, ele determina a quantidade de
	 * férias vencidas que o funcionário têm.
	 * @param object Responsável por trazer a informação se o funcionário tem
	 * ou não férias vencidas.
	 * @return Quantidade de férias vencidas.
	 */
	public int definirTotFeriasVenc(Boolean object){
		if (object) {
			return 1;
		} else {
			return 0;
		}
		
	}
		
	

}


