package br.edu.tglima.controller;

import java.math.BigDecimal;
import java.time.LocalDate;

import br.edu.tglima.model.periodos.*;
import br.edu.tglima.model.proventos.*;

public class ControllerSecundario {
	
	private Data data = new Data();
	private Dia dia = new Dia();
	private Mes mes = new Mes();
	private Salario salario = new Salario();
	private Ferias ferias = new Ferias();
	private AvisoPrevio aviso = new AvisoPrevio();
	private Fgts fgts = new Fgts();
	
	
	protected LocalDate capturarData(String str){
		return this.data.convertToDate(str);	
	}
	
	protected BigDecimal convertToBD(String str){
		return this.salario.capturarValor(str);
	}
	
/* Métodos responsáveis por válidar os dados fornecidos pelo usuário.*/
	
	protected boolean validarData(LocalDate date) {
		if (date == null) {
			return false;
		} else {
			return true;
		}
	}
	
	protected boolean verificarDiferDatas(LocalDate dateInicio, LocalDate dateFim){
		int difEntreDatas = dia.calcDiferDias(dateInicio, dateFim);
		
		if (difEntreDatas <= 0) {
			return false;
			
		} else {

			return true;
		}		
	}

	protected boolean validarSalario(BigDecimal valor){
		if ( valor.compareTo(new BigDecimal("449") ) < 0){
			
			return false;
			
		} else {
			
			return true;

		}
		
	}
	
	protected boolean validarFgts(BigDecimal valor){
		if ( valor.compareTo(new BigDecimal("0") ) < 0){
			
			return false;
			
		} else {
			
			return true;

		}
		
	}
	
}
