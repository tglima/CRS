package br.edu.tglima;

//import br.edu.tglima.model.periodos.Data;
import br.edu.tglima.view.FramePrincipal;
import br.edu.tglima.controller.*;

/**
 * @author tglima Thiago Lima de Sousa
 */

public class StartApplication {

	public static void main(String[] args) {
				
        FramePrincipal framePrincipal = new FramePrincipal();
        new ControllerPrincipal(framePrincipal);
        framePrincipal.setVisible(true);
		

		
		
/*			Salario salario = new Salario();
			Fgts fgts = new Fgts();
			Ferias ferias = new Ferias();
			Data dtEntrada = new Data();
			Data dtSaida = new Data();

			
//			Bloco referente há classe salario.
			salario.setValor(salario.capturarValor("R$ 900,00"));
			salario.setSalPropocional(salario.calcSalPropor(10));
			salario.setDecimo(salario.calcDecimo(3));
			
			System.out.println("Salario informado: R$ " +salario.getValor());
			System.out.println("Salário proporcional: R$ " + salario.getSalPropocional());
			System.out.println("Décimo Terceiro salário R$ " + salario.getDecimo());


//			Bloco Referente há classe Ferias
			ferias.setValor(ferias.calcValorFerias(salario.getValor(), 12));
			ferias.setTercoFerias(ferias.calcTercoFerias(ferias.getValor()));

			System.out.println("Valor referente as Ferias: R$ " + ferias.getValor());
			System.out.println("Valor referente ao terço das Ferias: R$ " +  ferias.getTercoFerias());
			
//			Bloco referente há classe Fgts
			fgts.setValor(fgts.capturarValor("R$ 600,00"));
			fgts.setValor(fgts.calcSaldoFgts(salario.getValor(), 365));
			fgts.setMulta(fgts.calcMulta(fgts.getValor()));
			
			System.out.println("FGTS informado: R$ " + fgts.getValor());
			System.out.println("A multa correspondente ao valor: R$ " + fgts.getMulta());
			
			
			
//			Bloco referente há classe Data
			
			dtEntrada.setData(dtEntrada.capturarData("01/12/2000"));
			System.out.println("A data de entrada informada é : " + dtEntrada.getData());
			
			dtSaida.setData(dtSaida.capturarData("31/03/2002"));
			System.out.println("A data de saída informada é : " + dtSaida.getData());
*/			
	
			
			
	}

}
