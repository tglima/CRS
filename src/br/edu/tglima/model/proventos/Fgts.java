package br.edu.tglima.model.proventos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Fgts extends Provento implements ICaptura {

	
//	Atributos	
	private BigDecimal multa = new BigDecimal("-1");
	

//	Métodos Getters e Setters
	public BigDecimal getMulta() {
		return multa;
	}


	public void setMulta(BigDecimal multa) {
		this.multa = multa;
	}

	
//	Métodos personalizados.	

	@Override
	public BigDecimal capturarValor(String s) {
		BigDecimal valorCapturado = new BigDecimal("-1");
		s = s.replace(" ", "").replace(".", "").replace(",", ".").replace("R$", "");
		try {
			valorCapturado = new BigDecimal(s);
		} catch (Exception e) {
//			Tratamento de erros
		}
		return valorCapturado;
	}
	
	
	public BigDecimal calcSaldoFgts(BigDecimal salario, int totDiasTrab) {
		BigDecimal saldoFgts = new BigDecimal("-1");
		
        saldoFgts = new BigDecimal(totDiasTrab).multiply(new BigDecimal("0.08").
        multiply((salario.divide(new BigDecimal("30"), 2, RoundingMode.HALF_UP))));
		
		return saldoFgts;
	}
	
	
	
	public BigDecimal calcMulta(BigDecimal valorFgts) {		
		this.multa = valorFgts.multiply(new BigDecimal("0.40"));
		return this.multa;
	}
	
	

}
