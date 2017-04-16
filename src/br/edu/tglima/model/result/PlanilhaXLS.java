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

import java.io.File;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;

/**
 * 
 * @author Thiago Lima de Sousa
 * @see Classe responsável por gerar o arquivo XLS e persistir ele disco rígido
 * do usuário.
 */
public class PlanilhaXLS {	
	/* Atributo Especial				*/	
	private HSSFWorkbook workbook = new HSSFWorkbook();

	/*Atributo recebido*/
	private Resultados rst;
	
	/*Contrutor da classe*/
	public PlanilhaXLS(Resultados rst) {
		this.rst = rst;
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
			
			/*Verificamos se já existe um arquivo com esse "nome".
			Caso ele exista, ele será removido e o novo arquivo será gerado.*/
			if (workbook.getNumberOfSheets() > 0) {
				workbook.removeSheetAt(0);
			}
			
				
			HSSFSheet sheet = workbook.createSheet("Valores Exportados");
	

/*			Criando as linhas. --------------------------------------------- */
	       
	        HSSFRow header1 =   sheet.createRow((short)0);
	        HSSFRow linha02 =   sheet.createRow((short)1);
	        HSSFRow linha03 =   sheet.createRow((short)2);
	        HSSFRow linha04 =   sheet.createRow((short)3);
	        HSSFRow linha05 =   sheet.createRow((short)4);
	        
	        HSSFRow header2 =   sheet.createRow((short)7); 
	        HSSFRow linha09 =   sheet.createRow((short)8);  
	        HSSFRow linha10 =   sheet.createRow((short)9);
	        HSSFRow linha11 =   sheet.createRow((short)10);                 
	        HSSFRow linha12 =   sheet.createRow((short)11);                 
	        HSSFRow linha13 =   sheet.createRow((short)12);                 
	        HSSFRow linha14 =   sheet.createRow((short)13);                
	        HSSFRow linha15 =   sheet.createRow((short)14);                
	        HSSFRow linha17 =   sheet.createRow((short)16);
	        
	        HSSFRow header3 =   sheet.createRow((short)19);
	        HSSFRow linha21 =   sheet.createRow((short)20); 
	        HSSFRow linha22 =   sheet.createRow((short)21); 
	        HSSFRow linha23 =   sheet.createRow((short)22); 
	        HSSFRow linha25 =   sheet.createRow((short)24); 
	        
//  ------------------------------------------------------------------------ //
	        
	        
/*			Mesclando as células. ------------------------------------------ */
	        
	        sheet.addMergedRegion(new CellRangeAddress(0,0,0,2));
	        sheet.addMergedRegion(new CellRangeAddress(7,7,0,2));
	        sheet.addMergedRegion(new CellRangeAddress(19,19,0,2));
	        
//  ------------------------------------------------------------------------ //
	        
	        
/*			Definindo a largura das colunas. ------------------------------- */	        
	        
	        sheet.setColumnWidth(0, 12000);
	        sheet.setColumnWidth(1, 5200);
	        sheet.setColumnWidth(2, 6500);
	        
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
	        header1.createCell(0).setCellValue("Dados Fornecidos");
	        
	        //Colunas da linha 2
	        linha02.createCell(0).setCellValue("Data de Entrada");
	        linha02.createCell(2).setCellValue(this.rst.getDataEntrada()); 

	        //Colunas da Linha 3
	        linha03.createCell(0).setCellValue("Data de Saída");	        
	        linha03.createCell(2).setCellValue(this.rst.getDataSaida()); 
	        
	        //Colunas da Linha 4
	        linha04.createCell(0).setCellValue("Salário Informado");
	        linha04.createCell(2).setCellValue(this.rst.getSalario());
	        
	        //Colunas da Linha 5
	        linha05.createCell(0).setCellValue("Motivo da Saída");
	        linha05.createCell(2).setCellValue(this.rst.getMotivoRes());
	        
	        //Colunas da linha 8
	        header2.createCell(0).setCellValue("Rescisão");
	        
	        //Colunas da linha 9
	        linha09.createCell(0).setCellValue("Item");
	        linha09.createCell(1).setCellValue("Referência");
	        linha09.createCell(2).setCellValue("Valor");

	        //Colunas da Linha 10
	        linha10.createCell(0).setCellValue("Saldo Salário");
	        linha10.createCell(1).setCellValue(this.rst.getTotDiasTrabUltMes());
	        linha10.createCell(2).setCellValue(this.rst.getUltSalario());
	        
	        //Colunas da Linha 11
	        linha11.createCell(0).setCellValue("13º Proporcional");
	        linha11.createCell(1).setCellValue(this.rst.getTotMesesTrabUltAno());
	        linha11.createCell(2).setCellValue(this.rst.getVlrDecimo());
	        
	        //Colunas da Linha 12
	        linha12.createCell(0).setCellValue("Férias Proporcional");
	        linha12.createCell(1).setCellValue(this.rst.getTotMesesAqFerias());
	        linha12.createCell(2).setCellValue(this.rst.getVlrFerias());
	        
	        //Colunas da Linha 13
	        linha13.createCell(0).setCellValue("1/3 Férias Proporcional");
	        linha13.createCell(1).setCellValue("-");
	        linha13.createCell(2).setCellValue(this.rst.getVlrTercoFerias());
	        
	        //Colunas da Linha 14
	        linha14.createCell(0).setCellValue("Férias Vencidas");                
	        linha14.createCell(1).setCellValue(this.rst.getTotFeriasVenc() );                
	        linha14.createCell(2).setCellValue(this.rst.getVlrFeriasVenc());                
	        
	        //Colunas da linha 15
	        linha15.createCell(0).setCellValue("Aviso Prévio"); 
	        linha15.createCell(1).setCellValue(this.rst.getTotDiasAviso()); 
	        linha15.createCell(2).setCellValue(this.rst.getVlrAvisoP()); 
	        
	        //Colunas da linha 17
	        linha17.createCell(0).setCellValue("Valor Total"); 
	        linha17.createCell(1).setCellValue("-"); 
	        linha17.createCell(2).setCellValue(this.rst.getVlrTotVenc()); 
	        
	        //Colunas da Linha 20
	        header3.createCell(0).setCellValue("FGTS");
	        
	        //Colunas da Linha 21
	        linha21.createCell(0).setCellValue("Valores do FGTS estarão disponíveis para saque?" );
	        linha21.createCell(2).setCellValue(this.rst.getReceberFgts());

	        //Colunas da Linha 22
	        linha22.createCell(0).setCellValue("Saldo FGTS");
	        linha22.createCell(2).setCellValue(this.rst.getSaldoFgts());
	        
	        //Colunas da Linha 23
	        linha23.createCell(0).setCellValue("Multa de 40%");
	        linha23.createCell(2).setCellValue(this.rst.getVlrMulta());
	        
	        //Colunas da Linha 25
	        linha25.createCell(0).setCellValue("Valor total");
	        linha25.createCell(2).setCellValue(this.rst.getVlrTotFgts());
	        

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
	        
	        cell = header3.getCell(0);
	        cell.setCellStyle(headerStyle);
	        header3.setRowStyle(headerStyle);
	        header3.setHeightInPoints(30);
	        
	        linha02.getCell(2).setCellStyle(cellCentered);

	        linha03.getCell(2).setCellStyle(cellCentered);
	        
	        linha04.getCell(2).setCellStyle(cellCentered);
	        
	        linha05.getCell(2).setCellStyle(cellCentered);
	        
	        linha09.getCell(1).setCellStyle(cellCentered);
	        linha09.getCell(2).setCellStyle(cellCentered);
	        
	        linha10.getCell(1).setCellStyle(cellCentered);
	        linha10.getCell(2).setCellStyle(cellCentered);
	      
	        linha11.getCell(1).setCellStyle(cellCentered);
	        linha11.getCell(2).setCellStyle(cellCentered);
	        
	        linha12.getCell(1).setCellStyle(cellCentered);
	        linha12.getCell(2).setCellStyle(cellCentered);
	        
	        linha13.getCell(1).setCellStyle(cellCentered);
	        linha13.getCell(2).setCellStyle(cellCentered);
	        
	        linha14.getCell(1).setCellStyle(cellCentered);
	        linha14.getCell(2).setCellStyle(cellCentered);

	        linha15.getCell(1).setCellStyle(cellCentered);
	        linha15.getCell(2).setCellStyle(cellCentered);
	        
	        linha17.getCell(0).setCellStyle(cellFontBold);
	        linha17.getCell(1).setCellStyle(cellCentered);
	        linha17.getCell(2).setCellStyle(cellResulted);
	        
	        linha21.getCell(2).setCellStyle(cellCentered);
	        
	        linha22.getCell(2).setCellStyle(cellCentered);

	        linha23.getCell(2).setCellStyle(cellCentered);
	        
	        linha25.getCell(0).setCellStyle(cellFontBold);
	        linha25.getCell(2).setCellStyle(cellResulted);
	        
//  ------------------------------------------------------------------------ //	        


/*			Escrever, salvar e fechar o arquivo ---------------------------- */	   
	        
	        
	        workbook.write(arquivo); // Escrevendo no arquivo.
	        
	        workbook.close(); // Salvando e fechando o arquivo.
	       
	        return true; 
			
		} catch (Exception e) {
			
    		System.err.println("Não foi possível gerar seu arquivo!"
    		+ " \n" + e.getLocalizedMessage());
    		
			return false;
			
		}
		
	}

}
