package br.edu.tglima.model.periodos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Dia {
	
    public int calcDiferDias(LocalDate dateInicio, LocalDate dateFim) {

        int diferencaEmDias = -1;

        try {
            long lngDiferencaEmDias = ChronoUnit.DAYS.between(dateInicio, dateFim);
            diferencaEmDias = (int) lngDiferencaEmDias;
        } catch (Exception e) {
        }

        return diferencaEmDias;
    }
    
    public int calcTotDiasTrab(LocalDate dateInicio, LocalDate dateFim) {

        int totalDiasTrabalhados = 0;

        totalDiasTrabalhados = calcDiferDias(dateInicio, dateFim);

        if (totalDiasTrabalhados <= 0) {
            totalDiasTrabalhados = 0;
        }

        return totalDiasTrabalhados;
    }
    
    /**
     * Este método deve receber um valor do tipo LocalDate,
     * que será referente há data de saída do usuário.
     * O método retornará um valor inteiro que será referente
     * ao total de dias trabalhados pelo usuário no último mês.
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
     * Este método deve receber dois valores do tipo LocalDate,
     * eles serão referentes há data de entrada e data de saída
     * do usuário, para que o método funcione corretamente, eles
     * precisam ser passados na respectiva ordem: entrada - saída.
     * 
     * O método retornará um valor inteiro, que será referente
     * ao total de dias no aviso prévio do usuário.
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
