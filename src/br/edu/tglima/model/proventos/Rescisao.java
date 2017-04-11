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
package br.edu.tglima.model.proventos;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Thiago Lima de Sousa
 * @version 2017.04.10-1
 * @see Classe responsável por armazenar os valores e dados durante a execução
 * do programa. Ela também é responsável por realizar a rescisão de acordo com
 * as opções obtidas da view.
 */
public class Rescisao {
	
	
/*	Atributos da classe														*/
	
//	Atributos relativos a datas e períodos.
	private LocalDate dataEntrada, dataSaida;
	private int totDiasTrab, totDiasTrabUltMes, totMesesTrabUltAno,totDiasAviso, 
	totMesesAqFerias, totFeriasVenc;

	
//	Atributos relativos a valores a receber ou a pagar.
	private BigDecimal salario, ultSalario, vlrDecimo, vlrFerias, vlrTercoFerias,
	vlrFeriasVenc, vlrTerFeriasV, vlrAvisoP, vlrTotVenc, saldoFgts, 
	vlrMulta, vlrTotFgts;
	
//	Atributo relativo a disponibilidade de saque do FGTS.
	private boolean receberFgts;

	
public LocalDate getDataEntrada() {
		return dataEntrada;
	}


	public void setDataEntrada(LocalDate dataEntrada) {
		this.dataEntrada = dataEntrada;
	}


	public LocalDate getDataSaida() {
		return dataSaida;
	}


	public void setDataSaida(LocalDate dataSaida) {
		this.dataSaida = dataSaida;
	}


	public int getTotDiasTrab() {
		return totDiasTrab;
	}


	public void setTotDiasTrab(int totDiasTrab) {
		this.totDiasTrab = totDiasTrab;
	}


	public int getTotDiasTrabUltMes() {
		return totDiasTrabUltMes;
	}


	public void setTotDiasTrabUltMes(int totDiasTrabUltMes) {
		this.totDiasTrabUltMes = totDiasTrabUltMes;
	}


	public int getTotMesesTrabUltAno() {
		return totMesesTrabUltAno;
	}


	public void setTotMesesTrabUltAno(int totMesesTrabUltAno) {
		this.totMesesTrabUltAno = totMesesTrabUltAno;
	}


	public int getTotDiasAviso() {
		return totDiasAviso;
	}


	public void setTotDiasAviso(int totDiasAviso) {
		this.totDiasAviso = totDiasAviso;
	}


	public int getTotMesesAqFerias() {
		return totMesesAqFerias;
	}


	public void setTotMesesAqFerias(int totMesesAqFerias) {
		this.totMesesAqFerias = totMesesAqFerias;
	}


	public int getTotFeriasVenc() {
		return totFeriasVenc;
	}


	public void setTotFeriasVenc(int totFeriasVenc) {
		this.totFeriasVenc = totFeriasVenc;
	}


	public BigDecimal getSalario() {
		return salario;
	}


	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}


	public BigDecimal getUltSalario() {
		return ultSalario;
	}


	public void setUltSalario(BigDecimal ultSalario) {
		this.ultSalario = ultSalario;
	}


	public BigDecimal getVlrDecimo() {
		return vlrDecimo;
	}


	public void setVlrDecimo(BigDecimal vlrDecimo) {
		this.vlrDecimo = vlrDecimo;
	}


	public BigDecimal getVlrFerias() {
		return vlrFerias;
	}


	public void setVlrFerias(BigDecimal vlrFerias) {
		this.vlrFerias = vlrFerias;
	}


	public BigDecimal getVlrTercoFerias() {
		return vlrTercoFerias;
	}


	public void setVlrTercoFerias(BigDecimal vlrTercoFerias) {
		this.vlrTercoFerias = vlrTercoFerias;
	}


	public BigDecimal getVlrFeriasVenc() {
		return vlrFeriasVenc;
	}


	public void setVlrFeriasVenc(BigDecimal vlrFeriasVenc) {
		this.vlrFeriasVenc = vlrFeriasVenc;
	}


	public BigDecimal getVlrTerFeriasV() {
		return vlrTerFeriasV;
	}


	public void setVlrTerFeriasV(BigDecimal vlrTerFeriasV) {
		this.vlrTerFeriasV = vlrTerFeriasV;
	}


	public BigDecimal getVlrAvisoP() {
		return vlrAvisoP;
	}


	public void setVlrAvisoP(BigDecimal vlrAvisoP) {
		this.vlrAvisoP = vlrAvisoP;
	}


	public BigDecimal getVlrTotVenc() {
		return vlrTotVenc;
	}


	public void setVlrTotVenc(BigDecimal vlrTotVenc) {
		this.vlrTotVenc = vlrTotVenc;
	}


	public BigDecimal getSaldoFgts() {
		return saldoFgts;
	}


	public void setSaldoFgts(BigDecimal saldoFgts) {
		this.saldoFgts = saldoFgts;
	}


	public BigDecimal getVlrMulta() {
		return vlrMulta;
	}


	public void setVlrMulta(BigDecimal vlrMulta) {
		this.vlrMulta = vlrMulta;
	}


	public BigDecimal getVlrTotFgts() {
		return vlrTotFgts;
	}


	public void setVlrTotFgts(BigDecimal vlrTotFgts) {
		this.vlrTotFgts = vlrTotFgts;
	}
	
	public Boolean getReceberFgts() {
		return receberFgts;
	}


	public BigDecimal somarTodosVencimentos(){
		return this.ultSalario.add(this.vlrDecimo).add(this.vlrFerias).
				add(this.vlrTercoFerias).add(this.vlrFeriasVenc).
					add(this.vlrTerFeriasV).add(this.vlrAvisoP);
	}

	
	private void rescDemissao(){
		this.totDiasAviso = 30;
		this.receberFgts = false;
		this.vlrMulta = new BigDecimal("0");
	};

	
	private void rescFimContrato(){
		this.totDiasAviso = 0;
		this.receberFgts = true;
		this.vlrMulta = new BigDecimal("0");
	};

	
	private void rescSemJustaCausa(){
		this.receberFgts = true;
	};

	
	private void rescPorJustaCausa(){
		this.receberFgts = false;
		this.vlrDecimo = new BigDecimal("0");
		this.vlrFerias = new BigDecimal("0");
		this.vlrTercoFerias = new BigDecimal("0");
		this.vlrMulta = new BigDecimal("0");
	};

	
	private void rescFalecimento(){
		rescFimContrato();
	};
	
	
	public void realizarRescisao(String motivoRes){
		switch (motivoRes) {
		case "Pedido de demissão":
			rescDemissao();
			break;
			
		case "Fim do Contrato de Trabalho":
			rescFimContrato();
			break;
			
		case "Demissão sem justa causa":
			rescSemJustaCausa();
			break;
			
		case "Demissão por Justa Causa":
			rescPorJustaCausa();
			break;
			
		case "Falecimento":
			rescFalecimento();
			break;
		}
	}

	
	
	
	
	
	
}
