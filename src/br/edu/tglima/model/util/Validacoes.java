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
package br.edu.tglima.model.util;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Thiago Lima
 * @see Classe que contém os todos métodos de validações usados no programa.
 */
public class Validacoes {
	
	/**
	 * Verifica se o conteúdo da variável não está vazio.
	 * 
	 * @param date Data que desejamos testar.
	 * @return Se a váriavel do tipo LocalDate está ou não vazia.
	 */
	public boolean validarData(LocalDate date) {
		
		return date != null;
		
		/*if (date == null) {
			return false;
		} else {
			return true;
		}*/
		
	}
	
	/**
	 * Verifica a diferença entre duas datas, se a diferença entre a data1 e a
	 * data2 for um valor menor ou igual a zero, o retorno será false.
	 * @param dataInicial ou data1, será usada como parâmetro de inicio.
	 * @param dataFinal ou data2, será usada como parâmetro final.
	 * @return Verdadeiro se a diferença entre as duas datas for um valor
	 * maior que 0. Falso se a diferença entre elas for menor que 1.
	 */
	public boolean verificarDiferDatas(LocalDate dataInicial, LocalDate dataFinal){
		CalcPeriodos CP = new CalcPeriodos();
		int difEntreDatas = CP.calcDiferDias(dataInicial, dataFinal);
			
		return difEntreDatas > 0;
		
/*		if (difEntreDatas <= 0) {
			return false;
			
		} else {

			return true;
		}*/		
	}
	
	/**
	 * Verifica se a data de entrada do funcionário, foi posterior ao inicio da
	 * CLT (10/11/1943). 
	 * @param dataEntrada Referente a data de admissão do funcionário.
	 * @return verdadeiro se a data for posterior a CLT, ou falso se a data
	 * for inferior.
	 */
	public boolean valDataMin(LocalDate dataEntrada){
		
		LocalDate inicioClt = LocalDate.of(1943, 11, 10);
		
		return verificarDiferDatas(inicioClt, dataEntrada);
				
	}
	
	/**
	 * Verifica se a data de saída do funcionário foi anterior a data
	 * limite (01/01/2060). 
	 * @param dataSaida Referente a data de saída do funcionário.
	 * @return verdeiro se a data de saída for anterior a data limite,
	 * ou falso se ela for posterior.
	 */
	public boolean valDataMax(LocalDate dataSaida){
		
		LocalDate dataLimite = LocalDate.of(2060, 01, 01);
		
		return verificarDiferDatas(dataSaida, dataLimite);

	}

	/**
	 * Verifica se o valor informado como salário é maior ou igual a 1.
	 * @param valor Referente ao valor informado como salário.
	 * @return Verdadeiro se o valor for maior ou igual a 1, falso se for
	 * qualquer valor menor.
	 */
	public boolean valSalMin(BigDecimal valor) {
		return valor.compareTo(new BigDecimal("1")) >= 0;
		
/*		if (valor.compareTo(new BigDecimal("1")) < 0) {
			return false;
		} else {
			return true;
		}*/
		
	}

	/**
	 * Verifica se o valor informado como salário é inferior ao valor limite
	 * (59.999,00).
	 * @param valor Referente ao valor informado como salário.
	 * @return Verdadeiro se o valor informado for menor que o limite. Falso 
	 * para qualquer valor superior ao limite.
	 */
	public boolean valSalMax(BigDecimal valor){
		
		return valor.compareTo(new BigDecimal("60000")) < 0;
		
/*		if (valor.compareTo(new BigDecimal("59999")) > 0) {
			return false;
		} else {
			return true;
		}*/
		
		
	}

	/**
	 * Verifica se o valor informado como Saldo do Fgts é inferior a 0.
	 * @param valor Referente ao valor informado como Saldo do FGTS.
	 * @return Verdadeiro se o valor for igual ou superior a 0. Falso para
	 * qualquer valor inferior.
	 */
	public boolean valFgts(BigDecimal valor) {
		
		return valor.compareTo(new BigDecimal("0")) > 0;
		
		/*if (valor.compareTo(new BigDecimal("0")) < 0) {
			return false;
		} else {
			return true;
		}*/
		
	}
	
	
	
}
	