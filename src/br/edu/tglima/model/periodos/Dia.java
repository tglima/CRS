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
package br.edu.tglima.model.periodos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Dia {
	/**
	 * Método responsável por calcular a diferença em dias entre
	 * duas datas fornecidas.
	 * 
	 * @param dateInicio Referente há data inicial.
	 * @param dateFim Referente há data final.
	 * @return Este método retornará uma valor do tipo inteiro.
	 */
    public int calcDiferDias(LocalDate dateInicio, LocalDate dateFim) {

        int diferencaEmDias = -1;

        try {
            long lngDiferencaEmDias = ChronoUnit.DAYS.between(dateInicio, dateFim);
            diferencaEmDias = (int) lngDiferencaEmDias;
        } catch (Exception e) {
        }

        return diferencaEmDias;
    }
    
    /**
     * Método responsável por calcular o total de dias que o funcionário
     * trabalhou na empresa.
     * 
     * @param dateInicio Referente há data de entrada do funcionário.
     * @param dateFim Referente há data de saída do funcionádio.
     * @return Este método retornarpa um valor tipo inteiro.
     */
    public int calcTotDiasTrab(LocalDate dateInicio, LocalDate dateFim) {

        int totalDiasTrabalhados = 0;

        totalDiasTrabalhados = calcDiferDias(dateInicio, dateFim);

        if (totalDiasTrabalhados <= 0) {
            totalDiasTrabalhados = 0;
        }

        return totalDiasTrabalhados;
    }
    
    /**
     * Método responsável por calcular o total de dias trabalhos no último mês
     * em que ele trabalhou na empresa.
     *  
     * @param dataSaida Referente há data em que o funcionário saiu da empresa.
     * @return Este método retorna um valor do tipo inteiro.
     */
    public int calcDiasTrabUltimoMes(LocalDate dataSaida) {
        int totalDiasTrabalhados = 0;

        int mesFim = dataSaida.getMonthValue();
        int anoFim = dataSaida.getYear();
        LocalDate primeiroDiaMes = LocalDate.of(anoFim, mesFim, 1);
        totalDiasTrabalhados = calcDiferDias(primeiroDiaMes, dataSaida);

        /*
         * Para que o valor do cálculo fique correto, devemos somar +1
         * na variável totalDiasTrabalhados. Veja o exemplo a seguir e
         * entenda o porque:
         * 
         * Supondo que a pessoa tenha saido no dia 10 de Agosto de 2000
         * Ao calcularmos a diferenca entre o dia 01 até o dia 10 o
         * resultado será 09, porém o valor correto seria 10 dias, é 
         * por isto que fazemos essa pequena soma no final.
         */
        
        totalDiasTrabalhados += 1;

        return totalDiasTrabalhados;

    }

    /**
     * 
     * Método responsável por calcular há quantidade de dias que o funcionário
     * deverá cumprir durante o aviso prévio.
     * 
     * @param dataEntrada Referente há data em que o funcionário entrou na empresa.
     * @param dataSaida Referente há data em que o funcionário deve sair da empresa.
     * @return Este método retorna um valor do tipo inteiro.
     */
    public int calcDiasAviso(LocalDate dataEntrada, LocalDate dataSaida) {

        int diasAviso = 30;
        int anosTrabalhados;

        /*
         * Primeiro calculamos a diferença entre anos da data entrada até
         * a data de saída.
         * O resultado desta operação será um valor do tipo long, que logo
         * em seguida vamos converter para o formato int.
         */
                
        long lngAnos = ChronoUnit.YEARS.between(dataEntrada, dataSaida);

        anosTrabalhados = (int) lngAnos;

        /*
         * Com o valor agora no formato inteiro, podemo aplicar a regra
         * de cálculo referente a legislação específica: 
         * LEI Nº 12.506, DE 11 DE OUTUBRO DE 2011.
         * http://www.planalto.gov.br/ccivil_03/_ato2011-2014/2011/lei/l12506.htm
         */
        
        
        if (anosTrabalhados <= 0) {
            return diasAviso;
        } else {
            if (anosTrabalhados >= 1 || anosTrabalhados <= 20) {
                diasAviso = diasAviso + (3 * anosTrabalhados);

            }
            if (anosTrabalhados >= 21) {
                diasAviso = 90;
            }

        }
        
        return diasAviso;
    }
	
}
