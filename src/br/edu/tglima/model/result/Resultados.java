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
package br.edu.tglima.model.result;

/**
 * 
 * @author Thiago Lima
 * @version 2017.04.10-1
 * @see Classe responsável por armazenar diversos dados obtidos durante
 * a execução do programa. Todos estes dados são guardados no formato String, 
 * facilitando sua reutilização posteriormente.
 */
public class Resultados {
	
/*	Atributos da Classe														*/
	private String dataEntrada, dataSaida, salario, ultSalario, totDiasTrab,
	totDiasTrabUltMes, totMesesTrabUltAno, totDiasAviso, totMesesAqFerias,
	totFeriasVenc, vlrDecimo, vlrFerias, vlrTercoFerias, vlrFeriasVenc, 
	vlrTerFeriasV, vlrAvisoP, vlrTotVenc, saldoFgts, vlrMulta, vlrTotFgts,
	motivoRes, receberFgts;

	public String getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getDataSaida() {
		return dataSaida;
	}

	public void setDataSaida(String dataSaida) {
		this.dataSaida = dataSaida;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getUltSalario() {
		return ultSalario;
	}

	public void setUltSalario(String ultSalario) {
		this.ultSalario = ultSalario;
	}

	public String getTotDiasTrab() {
		return totDiasTrab;
	}

	public void setTotDiasTrab(String totDiasTrab) {
		this.totDiasTrab = totDiasTrab;
	}

	public String getTotDiasTrabUltMes() {
		return totDiasTrabUltMes;
	}

	public void setTotDiasTrabUltMes(String totDiasTrabUltMes) {
		this.totDiasTrabUltMes = totDiasTrabUltMes;
	}

	public String getTotMesesTrabUltAno() {
		return totMesesTrabUltAno;
	}

	public void setTotMesesTrabUltAno(String totMesesTrabUltAno) {
		this.totMesesTrabUltAno = totMesesTrabUltAno;
	}

	public String getTotDiasAviso() {
		return totDiasAviso;
	}

	public void setTotDiasAviso(String totDiasAviso) {
		this.totDiasAviso = totDiasAviso;
	}

	public String getTotMesesAqFerias() {
		return totMesesAqFerias;
	}

	public void setTotMesesAqFerias(String totMesesAqFerias) {
		this.totMesesAqFerias = totMesesAqFerias;
	}

	public String getTotFeriasVenc() {
		return totFeriasVenc;
	}

	public void setTotFeriasVenc(String totFeriasVenc) {
		this.totFeriasVenc = totFeriasVenc;
	}

	public String getVlrDecimo() {
		return vlrDecimo;
	}

	public void setVlrDecimo(String vlrDecimo) {
		this.vlrDecimo = vlrDecimo;
	}

	public String getVlrFerias() {
		return vlrFerias;
	}

	public void setVlrFerias(String vlrFerias) {
		this.vlrFerias = vlrFerias;
	}

	public String getVlrTercoFerias() {
		return vlrTercoFerias;
	}

	public void setVlrTercoFerias(String vlrTercoFerias) {
		this.vlrTercoFerias = vlrTercoFerias;
	}

	public String getVlrFeriasVenc() {
		return vlrFeriasVenc;
	}

	public void setVlrFeriasVenc(String vlrFeriasVenc) {
		this.vlrFeriasVenc = vlrFeriasVenc;
	}

	public String getVlrTerFeriasV() {
		return vlrTerFeriasV;
	}

	public void setVlrTerFeriasV(String vlrTerFeriasV) {
		this.vlrTerFeriasV = vlrTerFeriasV;
	}

	public String getVlrAvisoP() {
		return vlrAvisoP;
	}

	public void setVlrAvisoP(String vlrAvisoP) {
		this.vlrAvisoP = vlrAvisoP;
	}

	public String getVlrTotVenc() {
		return vlrTotVenc;
	}

	public void setVlrTotVenc(String vlrTotVenc) {
		this.vlrTotVenc = vlrTotVenc;
	}

	public String getSaldoFgts() {
		return saldoFgts;
	}

	public void setSaldoFgts(String saldoFgts) {
		this.saldoFgts = saldoFgts;
	}

	public String getVlrMulta() {
		return vlrMulta;
	}

	public void setVlrMulta(String vlrMulta) {
		this.vlrMulta = vlrMulta;
	}

	public String getVlrTotFgts() {
		return vlrTotFgts;
	}

	public void setVlrTotFgts(String vlrTotFgts) {
		this.vlrTotFgts = vlrTotFgts;
	}

	public String getMotivoRes() {
		return motivoRes;
	}

	public void setMotivoRes(String motivoSaida) {
		this.motivoRes = motivoSaida;
	}

	public String getReceberFgts() {
		return receberFgts;
	}

	public void setReceberFgts(Boolean condicao) {
		if (condicao) {
			this.receberFgts = "Sim";
		} else {
			this.receberFgts = "Não";
		}
		
	}
	
	
}
