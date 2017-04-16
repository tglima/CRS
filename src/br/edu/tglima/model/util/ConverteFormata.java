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
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

/**
 * @author Thiago Lima de Sousa
 * @version 2017.04.09-1
 * @see Classe responsável pelas formatações e conversões usadas no aplicativo.
 */
public class ConverteFormata {
	
	
	/**
	 * Realiza o tratamento e conversão de uma string para o formato
	 * LocalDate.
	 * 
	 *  @param dtDigitada Referente a data informada pelo usuário na view.
	 *  @return Retornará um valor do tipo LocalDate no seguinte 
	 *  formato AAAA-MM-DD.
	 */
	public LocalDate cvtStrToDate(String dtDigitada) {
		LocalDate date = null;
		
		
		/*
		 * Com a ajuda do replace, removemos qualquer espaço em branco
		 * que o usuário tenha informado no campo de data. 
		 */
		
		String strDate = dtDigitada.replace(" ", "");
		
		/*
		 * Se o campo estiver correto, ele deve possuir exatos 10 caracteres,
		 * qualquer coisa diferente disto, significa que a data informada é 
		 * inválida.
		 */
		
		if (strDate.length() == 10) {
			
			/*
			 * Com a ajuda de um vetor, quebramos a String em 3 partes.
			 * Depois remontamos ela no formato correto (AAAA-MM-DD),
			 * para em seguida ser convertida no formato LocalDate
			 */
			String[] dataVetor = strDate.split("/");
			String strData = dataVetor[2] + "-" + dataVetor[1] + "-"+ dataVetor[0];			
			
			try {
				date = LocalDate.parse(strData);
			} catch (Exception error) {
				System.err.println("Não foi possível converter o valor "
						+ "informado para o tipo LocalDate!\n"
						+ error.getMessage());
			}
			
		} 
		
		return date;
	}	

	/**
	 * Realilza o tratamento e conversão de uma string para o formato
	 * BigDecimal.
	 * 
	 *  @param vlrDigitado Referente ao valor informado pelo usuário na view.
	 *  @return O valor convertido em BigDecimal.
	 */
	public BigDecimal cvtStrToBigDecimal(String vlrDigitado) {
		BigDecimal vlrInformado = new BigDecimal("0"); 
		
		String vlr = vlrDigitado.replace(" ", "").replace(".", "")
				.replace(",", ".").replace("R$", "");
		
        try {
            vlrInformado = new BigDecimal(vlr);
        } catch (Exception error) {
			System.err.println("Não foi possível converter o valor informado." 
					+ "\n" + error.getMessage());
        }
        
        return vlrInformado; 
	}
	
	/**
	 * Realiza a formatação da string recebida para que ela represente
	 * visualmente um valor monetário.
	 * @param valorDigitado Referente a string que se deseja formatar.
	 * @return Uma nova string com a devida formatação aplicada.
	 */
	public String formatStrVlrMonetario(String valorDigitado){
		Locale ptBr = new Locale("pt", "BR");
	    NumberFormat df = NumberFormat.getCurrencyInstance(ptBr); 
	    
	    String vlrFormatado = null;
	    
	    
	    try {
	    	BigDecimal vlr = cvtStrToBigDecimal(valorDigitado);
	    	vlrFormatado = df.format(vlr);
			
		} catch (Exception error) {
			System.err.println("Não foi possível converter o valor "
					+ "informado para a formatação adequada\n"
					+ error.getMessage());
		}
	    
		
		return  vlrFormatado;
	}

	/**
	 * Realiza a conversão de um valor BigDecimal para o formato String.
	 * A String será formatada como se fosse um valor númerico.
	 * @param valor Referente ao valor que se deseja converter.
	 * @return String formatada como se fosse um valor númerico.
	 */
    public String cvtBigToStrSemFM(BigDecimal valor){
	    NumberFormat df = new DecimalFormat("#,##0.00");

    	return df.format(valor);
    }
    
    /**
     * Realiza a conversão de um valor BigDecimal para o formato String.
     * A String será formatada como se fosse um valor <b>monetário</b>. 
     * @param valor Referente ao valor que se deseja converter.
     * @return String formatada como se fosse valor <b>monetário</b>
     */
    public String cvtBigToStrComFM(BigDecimal valor){
		Locale ptBr = new Locale("pt", "BR");
	    NumberFormat df = NumberFormat.getCurrencyInstance(ptBr); 
	    return df.format(valor);
	    
    }
    /**
     * Converte um valor do tipo inteiro para o formato String.
     * @param n Referente ao valor que se deseja converter.
     * @return O resultado da conversão no formato de String.
     */
    public String cvtIntToStr(int n){
    	return String.valueOf(n);
    	
    }
    
    
    
}
