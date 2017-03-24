package br.edu.tglima.model.persistencia;

import java.io.File;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;

public class PlanilhaXLS {
	
/*	Atributos da Classe				*/
	
	private String qtdDiasTrabUltMes, salarioFinal, mesesDecimo,
	valorDecimo, mesesAqFerias, valorFerias, valorTercoFerias, 
	qtdFeriasVenc, valorFeriasVenc, qtdDiasAviso, valorAviso,
	totVencimento, receberFgts, saldoFgts, multaFgts, totSomaFgts;

/* Atributo Especial				*/	
	private HSSFWorkbook workbook = new HSSFWorkbook();
	
	
/*	Métodos Setters da classe		*/	
	public void setQtdDiasTrabUltMes(String qtdDiasTrabUltMes) {
		this.qtdDiasTrabUltMes = qtdDiasTrabUltMes;
	}

	public void setSalarioFinal(String salarioFinal) {
		this.salarioFinal = salarioFinal;
	}

	public void setMesesDecimo(String mesesDecimo) {
		this.mesesDecimo = mesesDecimo;
	}

	public void setValorDecimo(String valorDecimo) {
		this.valorDecimo = valorDecimo;
	}

	public void setMesesAqFerias(String mesesAqFerias) {
		this.mesesAqFerias = mesesAqFerias;
	}

	public void setValorFerias(String valorFerias) {
		this.valorFerias = valorFerias;
	}

	public void setValorTercoFerias(String valorTercoFerias) {
		this.valorTercoFerias = valorTercoFerias;
	}

	public void setQtdFeriasVenc(String qtdFeriasVenc) {
		this.qtdFeriasVenc = qtdFeriasVenc;
	}

	public void setValorFeriasVenc(String valorFeriasVenc) {
		this.valorFeriasVenc = valorFeriasVenc;
	}

	public void setQtdDiasAviso(String qtdDiasAviso) {
		this.qtdDiasAviso = qtdDiasAviso;
	}

	public void setValorAviso(String valorAviso) {
		this.valorAviso = valorAviso;
	}

	public void setTotVencimento(String totVencimento) {
		this.totVencimento = totVencimento;
	}

	public void setReceberFgts(String receberFgts) {
		this.receberFgts = receberFgts;
	}

	public void setSaldoFgts(String saldoFgts) {
		this.saldoFgts = saldoFgts;
	}

	public void setMultaFgts(String multaFgts) {
		this.multaFgts = multaFgts;
	}

	public void setTotSomaFgts(String totSomaFgts) {
		this.totSomaFgts = totSomaFgts;
	}

	public void setWorkbook(HSSFWorkbook workbook) {
		this.workbook = workbook;
	}

	
	/**
	 * Método responsável por gerar a planilha XLS.
	 * 
	 * 
	 * @param arquivo Referente ao local e nome do arquivo.
	 * @return Retorno do tipo Boolean, indicando se o arquivo foi gerado
	 * com sucesso, ou não.
	 */
	public boolean gerarPlanilha(File arquivo){
		
		try {

			HSSFSheet sheet = workbook.createSheet("Valores Exportados");
			

/*			Criando as linhas. --------------------------------------------- */
	       
	        HSSFRow header1 =   sheet.createRow((short)0);
	        HSSFRow linha02 =   sheet.createRow((short)1);
	        HSSFRow linha03 =   sheet.createRow((short)2);
	        HSSFRow linha04 =   sheet.createRow((short)3);
	        HSSFRow linha05 =   sheet.createRow((short)4); 
	        HSSFRow linha06 =   sheet.createRow((short)5); 
	        HSSFRow linha07 =   sheet.createRow((short)6);  
	        HSSFRow linha08 =   sheet.createRow((short)7); 
	        HSSFRow linha10 =   sheet.createRow((short)9);
	        HSSFRow header2 =   sheet.createRow((short)11); 
	        HSSFRow linha13 =   sheet.createRow((short)12);                 
	        HSSFRow linha14 =   sheet.createRow((short)13);                
	        HSSFRow linha15 =   sheet.createRow((short)14);                
	        HSSFRow linha17 =   sheet.createRow((short)16);
	        
//  ------------------------------------------------------------------------ //
	        
	        
/*			Mesclando as células. ------------------------------------------ */
	        
	        sheet.addMergedRegion(new CellRangeAddress(0,0,0,2));
	        sheet.addMergedRegion(new CellRangeAddress(11,11,0,2));
	        
//  ------------------------------------------------------------------------ //
	        
	        
/*			Definindo a largura das colunas. ------------------------------- */	        
	        
	        sheet.setColumnWidth(0, 14000);
	        sheet.setColumnWidth(1, 5200);
	        sheet.setColumnWidth(2, 6000);
	        
//  ------------------------------------------------------------------------ //
	        
	        
/*			Definindo os estilos das células. ------------------------------ */	        
	        
	        CellStyle headerStyle = workbook.createCellStyle();
	        Font headerFont = workbook.createFont();
	        headerFont.setFontHeightInPoints((short) 20);
	        headerStyle.setFont(headerFont); 
	        headerStyle.setAlignment(HorizontalAlignment.CENTER);

	        CellStyle cellCentered = workbook.createCellStyle();
	        cellCentered.setAlignment(HorizontalAlignment.CENTER);
	        
	        CellStyle cellFontBold = workbook.createCellStyle();
	        Font fontBold = workbook.createFont();
	        fontBold.setBold(true);
	        cellFontBold.setFont(fontBold);
	        
	        CellStyle cellResulted = workbook.createCellStyle();
	        Font resultFont = workbook.createFont();
	        resultFont.setBold(true);
	        cellResulted.setFont(resultFont);
	        cellResulted.setAlignment(HorizontalAlignment.CENTER);
	        
	        Cell cell;
	        
//  ------------------------------------------------------------------------ //

	        
/*			Criando as Colunas da Tabela ----------------------------------- */
	        
	        //Colunas da linha 1
	        header1.createCell(0).setCellValue("Rescisão");
	        
	        //Colunas da linha 2
	        linha02.createCell(0).setCellValue("Item");
	        linha02.createCell(1).setCellValue("Referência");
	        linha02.createCell(2).setCellValue("Valor");

	        //Colunas da Linha 3
	        linha03.createCell(0).setCellValue("Saldo Salário");
	        linha03.createCell(1).setCellValue(this.qtdDiasTrabUltMes);
	        linha03.createCell(2).setCellValue(this.salarioFinal);
	        
	        //Colunas da Linha 4
	        linha04.createCell(0).setCellValue("13º Proporcional");
	        linha04.createCell(1).setCellValue(this.mesesDecimo);
	        linha04.createCell(2).setCellValue(this.valorDecimo);
	        
	        //Colunas da Linha 5              
	        linha05.createCell(0).setCellValue("Férias Proporcional");
	        linha05.createCell(1).setCellValue(this.mesesAqFerias);
	        linha05.createCell(2).setCellValue(this.valorFerias);
	        
	        //Colunas da Linha 6
	        linha06.createCell(0).setCellValue("1/3 Férias Proporcional");
	        linha06.createCell(1).setCellValue("-");
	        linha06.createCell(2).setCellValue(this.valorTercoFerias);
	        
	        //Colunas da Linha 7
	        linha07.createCell(0).setCellValue("Férias Vencidas");                
	        linha07.createCell(1).setCellValue(this.qtdFeriasVenc );                
	        linha07.createCell(2).setCellValue(this.valorFeriasVenc);                
	        
	        //Colunas da linha 8                
	        linha08.createCell(0).setCellValue("Aviso Prévio"); 
	        linha08.createCell(1).setCellValue(this.qtdDiasAviso); 
	        linha08.createCell(2).setCellValue(this.valorAviso); 
	        
	        //Colunas da Linha 10
	        linha10.createCell(0).setCellValue("Valor Total"); 
	        linha10.createCell(1).setCellValue("-"); 
	        linha10.createCell(2).setCellValue(this.totVencimento); 
	        
	        //Colunas da Linha 11
	        header2.createCell(0).setCellValue("FGTS");
	        
	        //Colunas da linha 13
	        linha13.createCell(0).setCellValue("Valores do FGTS estarão disponíveis para saque?" );
	        linha13.createCell(2).setCellValue(this.receberFgts);
	        
	        //Colunas da linha 14
	        linha14.createCell(0).setCellValue("Saldo FGTS");
	        linha14.createCell(2).setCellValue(this.saldoFgts);
	        
	        //Colunas da Linha 15
	        linha15.createCell(0).setCellValue("Multa de 40%");
	        linha15.createCell(2).setCellValue(this.multaFgts);
	        
	        //Colunas da Linha 17
	        linha17.createCell(0).setCellValue("Valor total");
	        linha17.createCell(2).setCellValue(this.totSomaFgts);

//  ------------------------------------------------------------------------ //  
	        

/*			Aplicando os estilos nas células ------------------------------- */	   
    
	        cell = header1.getCell(0);
	        cell.setCellStyle(headerStyle);                
	        header1.setRowStyle(headerStyle);
	        header1.setHeightInPoints(30);
	        
	        cell = header2.getCell(0);
	        cell.setCellStyle(headerStyle);
	        header2.setRowStyle(headerStyle);
	        header2.setHeightInPoints(30);
	        
	        linha02.getCell(1).setCellStyle(cellCentered);
	        linha02.getCell(2).setCellStyle(cellCentered);

	        linha03.getCell(1).setCellStyle(cellCentered);
	        linha03.getCell(2).setCellStyle(cellCentered);
	        
	        linha04.getCell(1).setCellStyle(cellCentered);
	        linha04.getCell(2).setCellStyle(cellCentered);
	        
	        linha05.getCell(1).setCellStyle(cellCentered);
	        linha05.getCell(2).setCellStyle(cellCentered);
	        
	        linha06.getCell(1).setCellStyle(cellCentered);
	        linha06.getCell(2).setCellStyle(cellCentered);
	        
	        linha07.getCell(1).setCellStyle(cellCentered);
	        linha07.getCell(2).setCellStyle(cellCentered);
	        
	        linha08.getCell(1).setCellStyle(cellCentered);
	        linha08.getCell(2).setCellStyle(cellCentered);

	        linha10.getCell(0).setCellStyle(cellFontBold);
	        linha10.getCell(1).setCellStyle(cellCentered);
	        linha10.getCell(2).setCellStyle(cellResulted);
	        
	        linha13.getCell(2).setCellStyle(cellCentered);
	        
	        linha14.getCell(2).setCellStyle(cellCentered);

	        linha15.getCell(2).setCellStyle(cellCentered);
	        
	        linha17.getCell(0).setCellStyle(cellFontBold);
	        linha17.getCell(2).setCellStyle(cellResulted);
	        
//  ------------------------------------------------------------------------ //	        


/*			Escrever, salvar e fechar o arquivo ---------------------------- */	   
	        
	        
	        workbook.write(arquivo); // Escrevendo no arquivo.
	        
	        workbook.close(); // Salvando e fechando o arquivo.
	       

	        
	        return true; 
			
		} catch (Exception e) {
			
    		System.err.println("Não foi possível gerar seu arquivo!"
    				+ " \n" + e.getMessage());
    		
			return false;
			
		}
		
	}

}
