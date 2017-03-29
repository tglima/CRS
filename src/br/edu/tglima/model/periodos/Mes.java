package br.edu.tglima.model.periodos;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Mes extends Dia {

	/**
	 * Método responsável por calcular o total de meses trabalhados no
	 * último ano do funcionário.
	 * 
	 * @param dataEntrada Referente a data de entrada do funcionário na empresa.
	 * @param dataSaida Referente a data de saída do funcionário na empresa.
	 * @return Este método retorna um valor do tipo inteiro.
	 */
    public int calcMesesTrabUltimoAno(LocalDate dataEntrada, LocalDate dataSaida) {

        int totalMeses;

        // int diaInicio = dataEntrada.getDayOfMonth();
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

                totalMeses = mesFim - mesInicio;
                return totalMeses;

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

                totalMeses = mesFim - mesInicio;
                return totalMeses;

            }

        } else {
            if (diaFim > 14) {
                mesFim = mesFim + 1;

            } else {
            }

            mesInicio = 1;
            totalMeses = mesFim - mesInicio;
            return totalMeses;

        }

    }
	
    /**
     * Método responsável por calcular a diferença em meses entre duas
     *  datas fornecidas.
     * 
	 * @param dataEntrada Referente a data de entrada do funcionário na empresa.
	 * @param dataSaida Referente a data de saída do funcionário na empresa.
     * @return Este método retorna um valor do tipo inteiro.
     */
    public int calcDiferMeses(LocalDate dataEntrada, LocalDate dataSaida) {
        int diferencaMeses = 0;

        long lngDiferencaEmMeses = ChronoUnit.MONTHS.between(dataEntrada, dataSaida);

        diferencaMeses = (int) lngDiferencaEmMeses;

        return diferencaMeses;
    }

    /**
     * Método responsável por calcular há quantidade de meses aquisitivos de
     * férias do funcionário durante o périodo em que ele trabalhou na empresa.
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
     * @return Este método retorna um valor do tipo inteiro.
     */
    public int calcMesesAqFerias(LocalDate dataEntrada, LocalDate dataSaida) {

        int diaInicio = dataEntrada.getDayOfMonth();
        int mesInicio = dataEntrada.getMonthValue();
        int mesFim = dataSaida.getMonthValue();
        int anoFim = dataSaida.getYear();

        int totalMesesAqFerias = 0;

        int diferencaMeses = calcDiferMeses(dataEntrada, dataSaida);

        LocalDate diaReferencia = LocalDate.of(anoFim, mesFim, diaInicio);

        int diasAposPeriodo = calcDiferDias(diaReferencia, dataSaida);
        diasAposPeriodo++;

        if (diasAposPeriodo > 14) {
            diferencaMeses = diferencaMeses + 1;
        }

        if (diferencaMeses > 12) {

            LocalDate inicioUltimoAnoAqs = LocalDate.of((anoFim - 1), mesInicio, diaInicio);
            totalMesesAqFerias = calcDiferMeses(inicioUltimoAnoAqs, dataSaida);
            diasAposPeriodo =  calcDiferDias(diaReferencia, dataSaida);
            diasAposPeriodo++;

            if (diasAposPeriodo > 14) {
                totalMesesAqFerias = totalMesesAqFerias + 1;
            }

            if (totalMesesAqFerias > 12) {
                inicioUltimoAnoAqs = LocalDate.of((anoFim), mesInicio, diaInicio);
                totalMesesAqFerias = calcDiferMeses(inicioUltimoAnoAqs, dataSaida);
            }

            return totalMesesAqFerias;

        } else {

            totalMesesAqFerias = diferencaMeses;
            return totalMesesAqFerias;

        }
    }
    
}
