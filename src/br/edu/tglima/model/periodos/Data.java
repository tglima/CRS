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
package br.edu.tglima.model.periodos;

import java.time.LocalDate;

public class Data {
		

	/**
	 * Método responsável por fazer o tratamento e conversão
	 * da data obtida da view.
	 * 
	 *  @param s Referente há data digitada pelo usuário na view.
	 *  @return Este método retorna um valor do tipo LocalDate
	 *  no seguinte formato AAAA-MM-DD.
	 */
	public LocalDate capData(String s) {
		LocalDate date = null;
		
		
		/*
		 * Com a ajuda do replace, removemos qualquer espaço em branco
		 * que o usuário tenha informado no campo de data. 
		 */
		
		s = s.replace(" ", "");
		
		/*
		 * Se o campo estiver correto, ele deve possuir exatos 10 caracteres,
		 * qualquer coisa diferente disto, significa que a data informada é 
		 * inválida.
		 * 
		 */
		
		if (s.length() == 10) {
			
			/*
			 * Com a ajuda de um vetor, quebramos a String em 3 partes.
			 * Depois remontamos ela no formato correto (AAAA-MM-DD),
			 * para em seguida ser convertida no formato LocalDate
			 */
			String[] dataVetor = s.split("/");
			String strData = dataVetor[2] + "-" + dataVetor[1] + "-"+ dataVetor[0];			
			
			try {
				date = LocalDate.parse(strData);
			} catch (Exception e) {
			}
				
			
		} 
		
		return date;
	}
	
	/**
	 * Método responsável por testar um valor do tipo LocalDate
	 * 
	 * @param date Referente há data que desejamos testar.
	 * @return Este método retorna um valor do tipo booleano.
	 */
	public boolean validarData(LocalDate date) {
		if (date == null) {
			return false;
		} else {
			return true;
		}
	}
	
}
