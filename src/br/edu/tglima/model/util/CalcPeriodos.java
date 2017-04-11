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

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


/**
 * @author Thiago Lima
 * @version 2017.04.09-1
 * @see Classe responsável por calcular períodos de tempos específicos.
 */
public class CalcPeriodos {
	
	/**
	 * Calcula a diferença em dias entre duas datas fornecidas.
	 * 
	 * @param dateInicial Referente a data inicial.
	 * @param dateFinal Referente a data final.
	 * @return A diferença entre as duas datas fornecidas.
	 */
    public int calcDiferDias(LocalDate dataInicial, LocalDate dataFinal) {

 /*		Como o resultado da operação abaixo seria um dado do tipo Long, faço
  * 	um cast e transformo ele em Int*/
        int diferencaEmDias = (int) ChronoUnit.DAYS.between
        								(dataInicial, dataFinal);
        
        return diferencaEmDias;
    }
	
    
	/**
	 * Calcula o total de dias trabalhados do funcionário.
	 * 
	 * @param dataEntrada Referente a data de admissão do funcionário
	 * @param dataSaida Referente ao último dia trabalhado do funcionário.
	 * @return O total de dias que o funcionário trabalhou.
	 */
	public int calcTotalDiasTrab(LocalDate dataEntrada, LocalDate dataSaida){
		
        int totDiasTrab = calcDiferDias(dataEntrada, dataSaida);
        
        if (totDiasTrab <= 0) {
            return 0;
        } else {
        	return totDiasTrab;
		}
	}
	
	
    /**
     * Calcula o total de dias trabalhos no último mês
     *  
     * @param dataSaida Referente ao último dia trabalhado do funcionário.
     * @return O total de dias trabalhados no último mês.
     */
    public int calcDiasTrabUltimoMes(LocalDate dataSaida) {
        int totDiasTrabUltMes = 0;

        int mesFim = dataSaida.getMonthValue();
        int anoFim = dataSaida.getYear();
        LocalDate primeiroDiaMes = LocalDate.of(anoFim, mesFim, 1);
        totDiasTrabUltMes = calcDiferDias(primeiroDiaMes, dataSaida);

        /*		Acrescento mais um dia na váriavel, isto é aplicado para que a contagem
         * 		de dias fique correta.  Por exemplo: Se funcionário trabalhou do dia 01
         * 		até o dia 05, o totalDiasTrabalhados seria de 04 dias, sendo o correto
         *		seriam 05 (Dia 01, Dia 02, Dia 03, Dia 04 e Dia 05)*/
        totDiasTrabUltMes += 1;

        return totDiasTrabUltMes;

    }

    
    /**
     * Calcula o total de dias que o funcionário deverá crumpri durante o aviso
     * 
	 * @param dataEntrada Referente a data de admissão do funcionário.
	 * @param dataSaida Referente ao último dia trabalhado do funcionário.
     * @return Total de dias referente ao aviso prévio.
     */
    public int calcDiasAviso(LocalDate dataEntrada, LocalDate dataSaida) {

        int totDiasAviso = 30;

/*
 * 		Primeiro calculamos a diferença entre anos da data entrada até
 * 		a data de saída.
 * 		Como o resultado da operação abaixo seria um dado do tipo Long, faço
 * 		um cast e transformo ele em Int.
 */
        int anosTrabalhados = (int) ChronoUnit.YEARS.between
        									(dataEntrada, dataSaida);

/*
 * 		Com esse resultado em mãos, aplicamos a regra de cálculo, referente a
 * 		legislação específica: LEI Nº 12.506, DE 11 DE OUTUBRO DE 2011.
 * 		http://www.planalto.gov.br/ccivil_03/_ato2011-2014/2011/lei/l12506.htm
 */
        
        if (anosTrabalhados <= 0) {
            return totDiasAviso;
        } else {
            if (anosTrabalhados >= 1 || anosTrabalhados <= 20) {
                totDiasAviso = totDiasAviso + (3 * anosTrabalhados);

            }
            if (anosTrabalhados >= 21) {
                totDiasAviso = 90;
            }

        }
        
        return totDiasAviso;
    }
    
    
	/**
	 * Calcula o total de meses trabalhados no último ano do funcionário.
	 * 
	 * @param dataEntrada Referente a data de admissão do funcionário.
	 * @param dataSaida Referente ao último dia trabalhado do funcionário.
	 * @return O total de meses trabalhados no último ano.
	 */
    public int calcMesesTrabUltimoAno(LocalDate dataEntrada, LocalDate dataSaida) {

        int totMesesTrabUltAno;

        int mesInicio = dataEntrada.getMonthValue();
        int anoInicio = dataEntrada.getYear();

        int diaFim = dataSaida.getDayOfMonth();
        int mesFim = dataSaida.getMonthValue();
        int anoFim = dataSaida.getYear();

        if (anoInicio == anoFim) {

            if (mesInicio == mesFim) {
            	
                int totalDiasTrabalhados = calcDiferDias(dataEntrada, dataSaida);

                totalDiasTrabalhados = totalDiasTrabalhados + 1;

                if (totalDiasTrabalhados > 14) {
                    mesFim = mesFim + 1;
                }

                totMesesTrabUltAno = mesFim - mesInicio;
                return totMesesTrabUltAno;

            } else {

                LocalDate mesPosteriorInicio = LocalDate.of(anoInicio, mesInicio + 1, 01);
                int totalDiastrabalhadosMesInicio = calcDiferDias(dataEntrada, mesPosteriorInicio);

                if (totalDiastrabalhadosMesInicio < 15) {
                    mesInicio = mesInicio + 1;
                }

                int mesPosteriorFim = mesFim + 1;
                if (mesPosteriorFim == 13) {
                    LocalDate mesAnteriorFim = LocalDate.of(anoFim, 11, 30);
                    int totalDiasTrabalhadosMesFim = calcDiferDias(mesAnteriorFim, dataSaida);
                    if (totalDiasTrabalhadosMesFim > 14) {
                        mesFim = mesPosteriorFim;
                    }
                } else {
                    LocalDate dataSuperiorFim = LocalDate.of(anoFim, mesPosteriorFim, 01);
                    int totalDiasTrabalhadosMesFim = calcDiferDias(dataSaida, dataSuperiorFim); 
                    if (totalDiasTrabalhadosMesFim > 14) {
                        mesFim = mesFim + 1;
                    }
                }

                totMesesTrabUltAno = mesFim - mesInicio;
                return totMesesTrabUltAno;

            }

        } else {
            if (diaFim > 14) {
                mesFim = mesFim + 1;

            } else {
            }

            mesInicio = 1;
            totMesesTrabUltAno = mesFim - mesInicio;
            return totMesesTrabUltAno;

        }

    }

    
    /**
     * Calcula diferença em meses entre duas datas fornecidas.
     * 
	 * @param dataEntrada Referente a data de admissão do funcionário.
	 * @param dataSaida Referente ao último dia trabalhado do funcionário.
     * @return A diferença de meses entre duas datas fornecidas.
     */
    public int calcDiferMeses(LocalDate dataEntrada, LocalDate dataSaida) {

/*		Como o resultado da operação abaixo seria um dado do tipo Long, faço
 * 		um cast e transformo ele em Int.    	
 */
        int diferencaMeses = (int) ChronoUnit.MONTHS.between
        										(dataEntrada, dataSaida);

        return diferencaMeses;
    }

    
    /**
     * Calcula a quantidade de meses aquisitivos de férias durante o périodo
     * em que o funcionário trabalhou na empresa.
     * 
     * O método foi desenvolvido para que ele não acumule periodos maiores
     * que 12 meses. Isso porque a cada 12 meses acumulado o usuário já 
     * habilita 1 período de férias.
     * 
     * Sendo assim, caso o usuário tenha conquistado 14 meses aquisitivos
     * o sistema irá retornar o valor 2, isso porque quando ele encerrou o
     * prazo dos 12 meses o sistema recomeçou sua contagem. Da mesma forma
     * que, supondo que ele tenha ficado 24 meses e + 2 dias, o sistema
     * irá retornar o valor 0.
     * 
     * 
	 * @param dataEntrada Referente a data de entrada do funcionário na empresa.
	 * @param dataSaida Referente a data de saída do funcionário na empresa.
     * @return A quantidade de meses aquisitivos de férias.
     */
    public int calcMesesAqFerias(LocalDate dataEntrada, LocalDate dataSaida) {

        int diaInicio = dataEntrada.getDayOfMonth();
        int mesInicio = dataEntrada.getMonthValue();
        int mesFim = dataSaida.getMonthValue();
        int anoFim = dataSaida.getYear();

        int totMesesAqFerias = 0;

        int diferencaMeses = calcDiferMeses(dataEntrada, dataSaida);

        LocalDate diaReferencia = LocalDate.of(anoFim, mesFim, diaInicio);

        int diasAposPeriodo = calcDiferDias(diaReferencia, dataSaida);
        diasAposPeriodo++;

        if (diasAposPeriodo > 14) {
            diferencaMeses = diferencaMeses + 1;
        }

        if (diferencaMeses > 12) {

            LocalDate inicioUltimoAnoAqs = LocalDate.of((anoFim - 1), mesInicio, diaInicio);
            totMesesAqFerias = calcDiferMeses(inicioUltimoAnoAqs, dataSaida);
            diasAposPeriodo =  calcDiferDias(diaReferencia, dataSaida);
            diasAposPeriodo++;

            if (diasAposPeriodo > 14) {
                totMesesAqFerias = totMesesAqFerias + 1;
            }

            if (totMesesAqFerias > 12) {
                inicioUltimoAnoAqs = LocalDate.of((anoFim), mesInicio, diaInicio);
                totMesesAqFerias = calcDiferMeses(inicioUltimoAnoAqs, dataSaida);
            }

            return totMesesAqFerias;

        } else {

            totMesesAqFerias = diferencaMeses;
            return totMesesAqFerias;

        }
    }
    
}
