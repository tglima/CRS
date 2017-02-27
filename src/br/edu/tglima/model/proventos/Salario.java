package br.edu.tglima.model.proventos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Salario implements ICaptura {
	
	/**
	 * Método responsável por fazer o tratamento e conversão
	 * do valor obtido da view.
	 * 
	 *  @param s Referente ao valor digitado pelo usuário na view.
	 *  @return Este método retorna um valor do tipo BigDecimal.
	 *  
	 */
	@Override
	public BigDecimal capturarValor(String s) {
		BigDecimal valorCapturado = new BigDecimal("-1"); 
        s = s.replace(" ", "").replace(".", "").replace(",", ".").replace("R$", "");

        try {
            valorCapturado = new BigDecimal(s);
        } catch (Exception e) {
        }
        return valorCapturado; 
	}
	
	/**
	 * Este método realiza o cálculo referente ao último sálario que
	 * que o funcionário vai receber de acordo com a quantida de dias
	 * que ele trabalhou no último mês.
	 * 
	 * @param qtdDias Referente há quantidade de dias trabalhados no
	 * último mês.
	 * @param salario Referente ao valor do salário base.
	 * @return 
	 */
	public BigDecimal calcUltSal(int qtdDias, BigDecimal salario) {
		BigDecimal salarioFinal = new BigDecimal("-1");
		
		
		if (qtdDias >= 30) {
			salarioFinal = salario;
		} else {
			salarioFinal = new BigDecimal(qtdDias).multiply
			((salario.divide(new BigDecimal("30"),
					2, RoundingMode.HALF_UP)));
		}
		
		return salarioFinal;
	}
	
	/**
	 * Este método realiza o cálculo referente ao valor do décimo
	 * terceiro salário.
	 * 
	 * @param qtdMeses Referente há quantidade de meses trabalhados
	 * no último ano do funcionário.
	 * @param salário Referente ao valo do salário base.
	 * @return
	 */
	public BigDecimal calcDecimo(int qtdMeses, BigDecimal salario) {
		BigDecimal decimo;
		decimo = (salario.divide(new BigDecimal("12"), 
					2, RoundingMode.HALF_UP).multiply(new BigDecimal(qtdMeses)));
		return decimo;
	}
}
