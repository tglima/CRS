package br.edu.tglima.model.proventos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Salario extends Provento implements ICaptura {
	
//	Atributos
	private BigDecimal salPropocional = new BigDecimal("-1");
	private BigDecimal decimo = new BigDecimal("-1");
	
	
//	Métodos Getter e Setter
	public BigDecimal getSalPropocional() {
		return salPropocional;
	}

	public void setSalPropocional(BigDecimal salPropocional) {
		this.salPropocional = salPropocional;
	}

	public BigDecimal getDecimo() {
		return decimo;
	}

	public void setDecimo(BigDecimal decimo) {
		this.decimo = decimo;
	}
	
	//	Método personalizado
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
	
	public BigDecimal calcSalPropor(int qtdDias) {
		if (qtdDias >= 30) {
			this.salPropocional = getValor();
		} else {
			this.salPropocional = new BigDecimal(qtdDias).multiply
									((getValor().divide(new BigDecimal("30"),
											2, RoundingMode.HALF_UP)));
		}
		return this.salPropocional;
	}
	
	
	public BigDecimal calcDecimo(int qtdMeses) {
		this.decimo = (getValor().divide(new BigDecimal("12"), 
					2, RoundingMode.HALF_UP).multiply(new BigDecimal(qtdMeses)));
		return this.decimo;
	}
}
