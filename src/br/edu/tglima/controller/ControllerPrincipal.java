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
package br.edu.tglima.controller;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.LineBorder;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import br.edu.tglima.model.proventos.*;
import br.edu.tglima.model.result.*;
import br.edu.tglima.model.util.*;
import br.edu.tglima.view.*;

public class ControllerPrincipal {
	private FramePrincipal gui;
	private DialogSobre dialog;
	private ConverteFormata cvt = new ConverteFormata();
	private CalcPeriodos cp = new CalcPeriodos();
	private Rescisao res = new Rescisao();
	private Resultados rst = new Resultados();


	
/*	Método construtor da classe												*/
	public ControllerPrincipal(FramePrincipal gui, DialogSobre dialog) {
		
		this.gui = gui;
		this.dialog = dialog;
		
		//Listeners do FramePrincipal
		
        this.gui.getjMenuItem1().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                mostrarTelaLimitacoes();
            }
        });
		
        this.gui.getjMenuItem2().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                mostrarTelaTermos();
            }
        });
		
        this.gui.getjMenuItem3().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                mostrarTelaSobre();
            }
        });
		
        this.gui.getDataSaidaFmt().addFocusListener(new FocusAdapter() {
        	
			@Override
			public void focusLost(FocusEvent e) {
				jFormattedTextField2FocusLost();
				
			}
		});

        this.gui.getSalarioFmt().addFocusListener(new FocusAdapter() {
            @Override
			public void focusLost(FocusEvent e) {
                jFormattedTextField3FocusLost();
            }

        });
        
        this.gui.getSaldoFgtsFmt().addFocusListener(new FocusAdapter() {
            @Override
			public void focusLost(FocusEvent e) {
                jFormattedTextField4FocusLost();
            }

        });
		
        this.gui.getjRadioButton3().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				actionRadioButtonFgts();
			}
		});
        
        this.gui.getjRadioButton4().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				actionRadioButtonFgts();
			}
		});
                
        this.gui.getComboMotivoSaida().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jComboBox1ActionPerformed();
			}
		});
		
		this.gui.getBtnCalcular().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
            	eventBtnCalcular();
            }
        });
		
		this.gui.getBtnExportar().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
            	exportarPlanilha();
            }
        });

		this.gui.getBtnVoltar1().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                voltarInicio();
            }
        });

		this.gui.getBtnVoltar2().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                voltarInicio();
            }
        });
		
		this.gui.getBtnVoltar3().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                voltarInicio();
            }
        });

		
		/*Responsável por processar o link do jTextPane2*/
		this.gui.getjTextPane2().addHyperlinkListener(new HyperlinkListener(){

			@Override
			public void hyperlinkUpdate(HyperlinkEvent e) {
				abrirlink(e);
			}
		});

		
		//Listeners da Janela Sobre		
		
		/*Responsável pelo botão fechar*/
		this.dialog.getBtnFechar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fecharTelaSobre();				
			}
		});
				
		/*Responsável por processar os links do jTextPane3*/
		this.dialog.getjTextPane3().addHyperlinkListener(new HyperlinkListener() {
			
			@Override
			public void hyperlinkUpdate(HyperlinkEvent e) {
				abrirlink(e);
			}
		});
		        
        
        
        
        
/*	Fim do contrutor da classe												*/
        
	}

//	------------------------------------------------------------------------ //    

	
/*	Métodos responsáveis por navegar entre as telas do programa	   			*/
	
    private void mostrarTelaLimitacoes() {                                           
        CardLayout cl = (CardLayout) gui.getjPanel1().getLayout();
        cl.show(gui.getjPanel1(), "card4");

    }                                          

    
    private void mostrarTelaTermos() {                                           
        CardLayout cl = (CardLayout) gui.getjPanel1().getLayout();
        cl.show(gui.getjPanel1(), "card3");
    }                                         

    
	private void mostrarTelaResultado(){
        CardLayout cl = (CardLayout) gui.getjPanel1().getLayout();
        cl.show(gui.getjPanel1(), "card2");
	}
    
	
    private void mostrarTelaSobre() {
		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		dialog.setVisible(true);
		dialog.setLocationRelativeTo(null);
    }   

    
    private void fecharTelaSobre(){
    	dialog.setVisible(false);
    }

    
    private void voltarInicio() {                                         
        CardLayout cl = (CardLayout) gui.getjPanel1().getLayout();
        cl.show(gui.getjPanel1(), "card1");
    } 
    
//	------------------------------------------------------------------------ //    
    
    
/*	Método responsável por lançar o Browser, quando o usuário clicar no link*/    
    
    private void abrirlink(HyperlinkEvent e){
		if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
			
			try {
				Desktop.getDesktop().browse(e.getURL().toURI());
			} catch (Exception error) {
				System.err.println("Não foi possível lançar o navegador!" 
						+ "\n" + error.getMessage());
			}
		}	
    }
    
//	------------------------------------------------------------------------ //    

    
/*	Métodos responsáveis pelas escolhas feitas com os radio buttons 		*/    
    
    private void actionRadioButtonFgts() {                                              
        if (gui.getjRadioButton3().isSelected()) {
            gui.getSaldoFgtsFmt().setEnabled(true);
            gui.getLblInformeFgts().setEnabled(true);
        }else {
            gui.getSaldoFgtsFmt().setEnabled(false);
            gui.getLblInformeFgts().setEnabled(false);
		}
        
        
    }   
	  
	
//	------------------------------------------------------------------------ //    

    
/*	Método responsável por desativar o ComboAvisoPrevio quando necessário */
	private void jComboBox1ActionPerformed() {
		if (gui.getComboMotivoSaida().getSelectedItem().equals("Falecimento")
				|| gui.getComboMotivoSaida().getSelectedItem().equals("Fim do Contrato de Trabalho")) {
			gui.getLblAvisoPrevio().setEnabled(false);
			gui.getComboAvisoPrevio().setEnabled(false);
		} else {
			gui.getLblAvisoPrevio().setEnabled(true);
			gui.getComboAvisoPrevio().setEnabled(true);
		}

	}

//	------------------------------------------------------------------------ //    

	
/*	Método responsável por controlar os campos de férias vencidas */
	
	private void jFormattedTextField2FocusLost(){
		obterDatas();
		
		try {
			
			calcTotDiasTrab();
			
			int difDatas = this.res.getTotDiasTrab();
			if (difDatas > 365) {

				gui.getLblFeriasVencidas().setEnabled(true);
				gui.getjRadioButton1().setEnabled(true);
				gui.getjRadioButton2().setEnabled(true);

			} else {

				gui.getLblFeriasVencidas().setEnabled(false);
				gui.getjRadioButton1().setEnabled(false);
				gui.getjRadioButton2().setEnabled(false);
				gui.getjRadioButton2().setSelected(true);

			}

		} catch (Exception error){
			System.err.println("Erro ao calcular a diferença entre as datas"
					+ " de entrada e saída!"
					+ error.getMessage());}

	}
	
//	------------------------------------------------------------------------ //    

		
/* 	Métodos resposáveis por capturar e tratar os valores informados  */
	
	private void jFormattedTextField3FocusLost() {			
		String vlrDigitado = gui.getSalarioFmt().getText();
		vlrDigitado = cvt.formatStrVlrMonetario(vlrDigitado);
		gui.getSalarioFmt().setText(vlrDigitado);
	}
	
    private void jFormattedTextField4FocusLost() {
    	String strFgtsFormatado;
    	strFgtsFormatado = cvt.formatStrVlrMonetario(gui.getSaldoFgtsFmt().getText());
    	gui.getSaldoFgtsFmt().setText(strFgtsFormatado);

    }
    


//	------------------------------------------------------------------------ //    
    
    
/*	Métodos executados ao pressionar o botão calcular					*/    

    private void eventBtnCalcular(){
    	System.out.println("Botão calcular foi pressionado");
    	
    	/*
    	 * Primeiro vamos obter os dados obrigátorios, começaremos
    	 * com as datas, o salário e por fim o saldo do FGTS.
    	 */
    	
    	obterDatas();
    	obterSalario();
    	carregarVlrFgts();
    	
    	/*
    	 * Validamos esses dados e se tudo deu certo continuámos.
    	 */
    	
    	if (validarCamposDigitados()) {
    		
			calcTotDiasTrabUltMes();
			calcTotMesesTrabUlAno();
			calcTotDiasAviso();
			calcTotMesesAqFerias();
			calcUltSalario();
			calcDecimo();
			carregarVlrsFerias();
			carregarVlrAvisoP();
			carregarVlrMultaFgts();
			calcVlrTotFgts();
			realizarRescisao();
			calcTotVencimento();
			exibirResultadoNaTela();
			
		}
    }
    
//	------------------------------------------------------------------------ //


/*	Métodos que definirão os principais atributos da classe Rescisão.	*/    
    
    private void obterDatas(){
    	this.res.setDataEntrada(cvt.cvtStrToDate(gui.getDataEntradaFmt().getText()));
    	this.res.setDataSaida(cvt.cvtStrToDate(gui.getDataSaidaFmt().getText()));
    }

    
    private void calcTotDiasTrab(){
    	this.res.setTotDiasTrab(this.cp.calcTotalDiasTrab(
    			this.res.getDataEntrada(), this.res.getDataSaida()));
    }    

    
    private void calcTotDiasTrabUltMes(){
    	this.res.setTotDiasTrabUltMes(this.cp.calcDiasTrabUltimoMes(
    			this.res.getDataSaida()));
    }

    
    private void calcTotMesesTrabUlAno(){
    	this.res.setTotMesesTrabUltAno(this.cp.calcMesesTrabUltimoAno(
    			this.res.getDataEntrada(), this.res.getDataSaida()));
    }

    
    private void calcTotDiasAviso(){
    	this.res.setTotDiasAviso(this.cp.calcDiasAviso(
    			this.res.getDataEntrada(), this.res.getDataSaida()));
    }

    
    private void calcTotMesesAqFerias(){
    	this.res.setTotMesesAqFerias(cp.calcMesesAqFerias(
    			this.res.getDataEntrada(), this.res.getDataSaida()));
    }

    
    private void obterSalario(){
    	this.res.setSalario(cvt.cvtStrToBigDecimal(gui.getSalarioFmt().getText()));
    }

    
    private void calcUltSalario(){
    	Salario slr = new Salario();
    	
    	this.res.setUltSalario(slr.calcUltSal(
    			this.res.getTotDiasTrabUltMes(), this.res.getSalario()));
    }

    
    private void calcDecimo(){
    	Decimo decimo = new Decimo();
    	
    	this.res.setVlrDecimo(decimo.calcDecimo(
    			this.res.getTotMesesTrabUltAno(), this.res.getSalario()));
    }

    
    private void carregarVlrsFerias(){
    	Ferias fr = new Ferias();
    	Boolean object = gui.getjRadioButton1().isSelected();
    	
    	this.res.setVlrFerias(fr.calcValorFerias(
    			this.res.getSalario(), this.res.getTotMesesAqFerias()));

    	this.res.setVlrTercoFerias(fr.calcTercoFerias(
    			this.res.getVlrFerias()));
    	
    	this.res.setVlrFeriasVenc(fr.calcVlrFeriasVenc(
    			this.res.getSalario(), object));
    	
    	this.res.setVlrTerFeriasV(fr.calcVlrTerFeriasV(
    			this.res.getVlrFeriasVenc(), object));
    	
    	this.res.setTotFeriasVenc(fr.definirTotFeriasVenc(object));
    }

    
    private void carregarVlrAvisoP(){
    	AvisoPrevio ap = new AvisoPrevio();
    	
//    	Primeiro calculamos e definimos o total de dias de aviso prévio
    	this.res.setTotDiasAviso(this.cp.calcDiasAviso(
    			this.res.getDataEntrada(), this.res.getDataSaida()));
    	
//		Calculamos quanto seria o valor do aviso pŕevio
    	this.res.setVlrAvisoP(ap.calcAvisoPrevio(this.res.getSalario(), 
				this.res.getTotDiasAviso()));
    	
    	String opAviso = (String) gui.getComboAvisoPrevio().getSelectedItem();
    	
//    	De acordo com a opção feita na view é aplicado uma das regras abaixo:
    	switch(opAviso){
    	case "Trabalhado":
    		this.res.setVlrAvisoP(cvt.cvtStrToBigDecimal("0"));
    		break;
    	case "Indenizado pela empresa":
    		//Não precisa ser feito nada aqui
    		break;
    	case "Descontado do funcionário":
    		this.res.setVlrAvisoP(ap.descAvisoPrevio(this.res.getVlrAvisoP()));
    		break;
    	default:
    		this.res.setVlrAvisoP(cvt.cvtStrToBigDecimal("0"));
    		this.res.setTotDiasAviso(0);
    		break;
    	}
    	
    	
    }

    
    private void carregarVlrFgts(){
    	boolean object = gui.getjRadioButton3().isSelected();
    	
    	if (object) {
        	this.res.setSaldoFgts(cvt.cvtStrToBigDecimal(gui.getSaldoFgtsFmt().getText()));

		} else {
			
	    	Fgts fgts = new Fgts();
	    	this.res.setSaldoFgts(fgts.calcSaldoFgts(this.res.getSalario(), 
	    			this.res.getTotDiasTrab()));
		}
    	
    }

    
    private void carregarVlrMultaFgts(){
    	Fgts fgts = new Fgts();
    	
    	String motivoRes = (String) gui.getComboMotivoSaida().getSelectedItem();
    	
    	if ("Demissão sem justa causa".equals(motivoRes)) {
    		this.res.setVlrMulta(fgts.calcMulta(this.res.getSaldoFgts()));
		} else {
			this.res.setVlrMulta(cvt.cvtStrToBigDecimal("0"));
		}
    	
    	
    }

    
    private void calcVlrTotFgts(){
    	Fgts fgts = new Fgts();
    	this.res.setVlrTotFgts(fgts.somarMultaeFgts(
    			this.res.getSaldoFgts(), this.res.getVlrMulta()));
    }
    
    
    private void calcTotVencimento() {
    	this.res.setVlrTotVenc(res.somarTodosVencimentos());
	}

    
    private void realizarRescisao(){
    	String motivoRes = (String) gui.getComboMotivoSaida().getSelectedItem();
    	res.realizarRescisao(motivoRes);
    	
    }

//	------------------------------------------------------------------------ //    

    
/*	Método responsável pelas validações dos campos digitáveis				*/   
    
    private boolean validarCamposDigitados(){
    	Validacoes vld = new Validacoes();
    	String msgErro;
    	if (!vld.validarData(this.res.getDataEntrada())) {
    		System.err.println("Data de entrada inválida!");
    		msgErro = "Data de entrada inválida!"
					+ "\nInforme a data no seguinte formato: dd/mm/aaaa";
			exibirErro(msgErro);
			destacarCampo(this.gui.getDataEntradaFmt());
			return false;    
		}
    	
    	else if (!vld.validarData(this.res.getDataSaida())) {
    		System.err.println("Data de saída inválida!");
    		msgErro = "Data de saída inválida!"
					+ "\nInforme a data no seguinte formato: dd/mm/aaaa";
			exibirErro(msgErro);
			destacarCampo(this.gui.getDataSaidaFmt());
			return false;    
		}
    	
    	else if(!vld.verificarDiferDatas(this.res.getDataEntrada(), this.res.getDataSaida())){
			System.err.println("A data de saída é inferior a data de entrada!");
			msgErro = "A data de saída é inferior a data de entrada!";
			exibirErro(msgErro);
			destacarCampo(this.gui.getDataSaidaFmt());
			return false;    
    	}
    	
    	else if(!vld.valDataMin(this.res.getDataEntrada())){
    		System.err.println("Data de entrada inválida!");
			msgErro = "Data de entrada inválida!"
					+ "\nInforme datas superiores há 10/11/1943";
			exibirErro(msgErro);
			destacarCampo(this.gui.getDataEntradaFmt());
			return false;    		
    	}
    	
    	else if(!vld.valDataMax(this.res.getDataSaida())){
    		System.err.println("Data de saída inválida!");
			msgErro = "Data de saída inválida!"
					+ "\nInforme datas inferiores há 01/01/2060";
			exibirErro(msgErro);
			destacarCampo(this.gui.getDataSaidaFmt());
    		return false;
    	}
    	
    	else if(!vld.valSalMin(this.res.getSalario())){
    		System.err.println("O valor informado como salário é inválido!");
			msgErro = "O valor informado como salário é inválido!\n";
			exibirErro(msgErro);
			destacarCampo(this.gui.getSalarioFmt());
    		return false;
    	}
    	
    	else if(!vld.valSalMax(this.res.getSalario())){
    		System.err.println("O valor informado como salário é inválido!");
			msgErro = "O valor informado como salário é inválido!\n"
					+ "Use valores inferiores há R$ 60.000,00.";
			exibirErro(msgErro);
			destacarCampo(this.gui.getSalarioFmt());
			return false;
    	}
    	
    	
    	else if(!vld.valFgts(this.res.getSaldoFgts())){
			System.err.println("O saldo informado como fgts é inválido!");
			msgErro = "O saldo informado como fgts é inválido!";
			exibirErro(msgErro);
			destacarCampo(this.gui.getSaldoFgtsFmt());
    		return false;
    	}
    	
    	else {
    		return true;
		}
    }

    
    
//	------------------------------------------------------------------------ //	
    
    
/*	Métodos responsáveis por exibir mensagens de erros e alertas ao usuário	*/   
    
	private void exibirErro(String msgErro){
		
		final ImageIcon errorIcon = new ImageIcon(getClass().getResource(
				"/br/edu/tglima/resource/imgs/error-48.png"));
		JOptionPane.showMessageDialog(null, msgErro, "Ocorreu um erro", 
				JOptionPane.ERROR_MESSAGE, errorIcon);

	}

	
	private void exibirAlerta(String msgAlerta){
		
		final ImageIcon AlertIcon = new ImageIcon(getClass().getResource(
				"/br/edu/tglima/resource/imgs/alert-48.png"));
		JOptionPane.showMessageDialog(null, msgAlerta, "Informação",
				JOptionPane.INFORMATION_MESSAGE, AlertIcon);
	}
	

	  
	  private void destacarCampo(JFormattedTextField field) {
		  final int timerDelay = 500;
		  final int totalTime = 2000;
		  
		  final int totalCount = totalTime / timerDelay;
		  Timer timer = new Timer(timerDelay, new ActionListener(){
		    int count = 0;

		    public void actionPerformed(ActionEvent evt) {
		      if (count % 2 == 0) {
		        field.setBorder(new LineBorder(Color.RED, 2, true));
		        field.requestFocus();
		      } else {
			        field.setBorder(new LineBorder(Color.GRAY, 1, false));
		        if (count >= totalCount) { 
		          ((Timer)evt.getSource()).stop();
		        }
		      }
		      count++;
		    }
		  });
		  timer.start();
		}
	
	
	
	
	
//	------------------------------------------------------------------------ //
	
	
	
/*																			*/	

	private void carregarResultados(){
		ConverteFormata cvt = new ConverteFormata();
		String motivoRes = (String) gui.getComboMotivoSaida().getSelectedItem();
		
/*		Converteremos todos os valores e informações para o formato String
		para que depois possamos exibi-los ou exportá-los de acordo com a 
		nossa necessidade.*/
		
		this.rst.setDataEntrada(gui.getDataEntradaFmt().getText());
		this.rst.setDataSaida(gui.getDataSaidaFmt().getText());
		this.rst.setSalario(cvt.cvtBigToStrComFM(this.res.getSalario()));
		this.rst.setUltSalario(cvt.cvtBigToStrComFM(this.res.getUltSalario()));
		this.rst.setTotDiasTrab(cvt.cvtIntToStr(this.res.getTotDiasTrab()) + " dias.");
		this.rst.setTotDiasTrabUltMes(cvt.cvtIntToStr(this.res.getTotDiasTrabUltMes()) + " dias.");
		this.rst.setTotMesesTrabUltAno(cvt.cvtIntToStr(this.res.getTotMesesTrabUltAno()) + "/12");
		this.rst.setTotDiasAviso(cvt.cvtIntToStr(this.res.getTotDiasAviso()) + " dias.");
		this.rst.setTotMesesAqFerias(cvt.cvtIntToStr(this.res.getTotMesesAqFerias()) + "/12");
		this.rst.setTotFeriasVenc(cvt.cvtIntToStr(this.res.getTotFeriasVenc()));
		this.rst.setVlrDecimo(cvt.cvtBigToStrComFM(this.res.getVlrDecimo()));
		this.rst.setVlrFerias(cvt.cvtBigToStrComFM(this.res.getVlrFerias()));
		this.rst.setVlrTercoFerias(cvt.cvtBigToStrComFM(this.res.getVlrTercoFerias()));
		this.rst.setVlrFeriasVenc(cvt.cvtBigToStrComFM(this.res.getVlrFeriasVenc()));
		this.rst.setVlrTerFeriasV(cvt.cvtBigToStrComFM(this.res.getVlrTerFeriasV()));
		
		this.rst.setVlrAvisoP("R$ " + cvt.cvtBigToStrSemFM(this.res.getVlrAvisoP())); //Atenção esta linha pode dar erro.
		this.rst.setVlrTotVenc("R$ " + cvt.cvtBigToStrSemFM(res.getVlrTotVenc()));   //Atenção esta linha pode dar erro.
		
		
		this.rst.setSaldoFgts(cvt.cvtBigToStrComFM(this.res.getSaldoFgts()));
		this.rst.setVlrMulta(cvt.cvtBigToStrComFM(this.res.getVlrMulta()));
		this.rst.setVlrTotFgts(cvt.cvtBigToStrComFM(this.res.getVlrTotFgts()));
		this.rst.setReceberFgts(this.res.getReceberFgts());
		this.rst.setMotivoRes(motivoRes);
		
		
	}
	
//	------------------------------------------------------------------------ //	
	
	
/*	Métodos responsáveis por exibir os valores na tela resultado			*/	
	
	private DefaultTableModel CriarTabela1(){
    	// Modelo padrão para definição da Jtable1
    	DefaultTableModel tabela1 = new DefaultTableModel() {
    		private static final long serialVersionUID = 1L;



			// Método resṕonsável por bloquear a edição das células
    		@Override
			public boolean isCellEditable(int linha, int coluna) {
    			return false;
    		}
    	};
    	
    	
        /*Bloco com definições e valores específicos da tabela de rescisão*/
    	gui.getTblRescisao().setModel(tabela1);
        tabela1.addColumn("Item");
        tabela1.addColumn("Referência");
        tabela1.addColumn("Valor");
               
        gui.getTblRescisao().getColumnModel().getColumn(0).setResizable(false);
        gui.getTblRescisao().getColumnModel().getColumn(0).setPreferredWidth(250);
        
        gui.getTblRescisao().getColumnModel().getColumn(1).setResizable(false);        
        gui.getTblRescisao().getColumnModel().getColumn(1).setPreferredWidth(100);
                
        gui.getTblRescisao().getColumnModel().getColumn(2).setResizable(false);
        gui.getTblRescisao().getColumnModel().getColumn(2).setPreferredWidth(135);
        /*Fim do bloco*/
    	
    	return tabela1;
	}

	
	private DefaultTableModel CriarTabela2(){
		DefaultTableModel tabela2 = new DefaultTableModel() {
    		private static final long serialVersionUID = 1L;
    		
    		@Override
			public boolean isCellEditable(int linha, int coluna) {
    			return false;
    		}
    	};
    	
    	
        /*Bloco com definições e valores específicos da tabela do FGTS*/
        gui.getTblFGTS().setModel(tabela2);
        tabela2.addColumn(null);
        tabela2.addColumn(null);
        
        gui.getTblFGTS().getColumnModel().getColumn(0).setResizable(false);
        gui.getTblFGTS().getColumnModel().getColumn(0).setPreferredWidth(350);
        
        gui.getTblFGTS().getColumnModel().getColumn(1).setResizable(false);
        gui.getTblFGTS().getColumnModel().getColumn(1).setPreferredWidth(135);
        /*Fim do bloco */
    	
    	return tabela2;
	}	
	
	
	private void aplicarEstiloTabelas(){
                
        /*Bloco de código responsável por centralizar as células */
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        
        gui.getTblRescisao().getColumnModel().getColumn(1).setCellRenderer(centralizado);
        gui.getTblRescisao().getColumnModel().getColumn(2).setCellRenderer(centralizado);
        gui.getTblFGTS().getColumnModel().getColumn(1).setCellRenderer(centralizado);
        /*Fim do bloco*/
		
	}
	
	
	private void carregarVlrsTabelas(DefaultTableModel tabela1, DefaultTableModel tabela2){
        
//      Agora repassamos essas informações para a tabela correspondente.
        tabela1.addRow(new Object[]{"  Saldo Salário", this.rst.getTotDiasTrabUltMes(), this.rst.getUltSalario() });
        tabela1.addRow(new Object[]{"  13º Proporcional", this.rst.getTotMesesTrabUltAno(), this.rst.getVlrDecimo() });
        tabela1.addRow(new Object[]{"  Férias Proporcional", this.rst.getTotMesesAqFerias(), this.rst.getVlrFerias() });
        tabela1.addRow(new Object[]{"  1/3 Férias Proporcional", "-", this.rst.getVlrTercoFerias() });
        tabela1.addRow(new Object[]{"  Férias Vencidas", this.rst.getTotFeriasVenc(), this.rst.getVlrFeriasVenc() });
        tabela1.addRow(new Object[]{"  1/3 Férias Vencidas", "-", this.rst.getVlrTerFeriasV() });
        tabela1.addRow(new Object[]{"  Aviso Prévio", this.rst.getTotDiasAviso(), this.rst.getVlrAvisoP() });
        tabela1.addRow(new Object[]{   null, null, null });
        tabela1.addRow(new Object[]{"  Valor total", "-", this.rst.getVlrTotVenc() });
        /*Fim do bloco*/  
        
        
//      Agora repassamos essas informações para a tabela correspondente.
        tabela2.addRow(new Object[]{"  Valores do FGTS estarão disponíveis para saque?", this.rst.getReceberFgts()});
        tabela2.addRow(new Object[]{"  Saldo FGTS", this.rst.getSaldoFgts()});
        tabela2.addRow(new Object[]{"  Multa de 40%", this.rst.getVlrMulta()});
        tabela2.addRow(new Object[]{null, null});
        tabela2.addRow(new Object[]{"  Valor Total", this.rst.getVlrTotFgts()});
        /*Fim do bloco*/     
		
	}

	
	private void exibirResultadoNaTela(){
		mostrarTelaResultado();
		carregarResultados();
		DefaultTableModel tabela1 = CriarTabela1(); 
		DefaultTableModel tabela2 = CriarTabela2();
		aplicarEstiloTabelas();
		carregarVlrsTabelas(tabela1, tabela2);
	};
	
//	------------------------------------------------------------------------ //	
	
	
    private void exportarPlanilha(){
    	PlanilhaXLS plan = new PlanilhaXLS(rst);
    	JFileChooser fileChooser = new JFileChooser(System.getProperty("user.dir"));
    	fileChooser.setSelectedFile(new File("ArquivoExportado.xls"));
    	fileChooser.setFileFilter(new FileNameExtensionFilter("Planilha Excel (*.xls)", "xls"));
    	fileChooser.setAcceptAllFileFilterUsed(false);
    	
    	int returnVal = fileChooser.showSaveDialog(null);
    	
    	File xlsFile = fileChooser.getSelectedFile();
    	

    	if (xlsFile.exists()) {
    		final ImageIcon questionIcon = new ImageIcon(getClass().getResource("/br/edu/tglima/resource/imgs/question-48.png"));
    	    int response = JOptionPane.showConfirmDialog(null, //
    	            "Já existe um arquivo com esse nome, deseja sobrescrevê-lo?", //
    	            "Sobrescrever", JOptionPane.YES_NO_OPTION, //
    	            JOptionPane.QUESTION_MESSAGE, //
    	            questionIcon);
    	    if (response != JOptionPane.YES_OPTION) {
    	        return;
    	    } 
    	}
    	
    	
        if (returnVal==1){
        	
        	System.err.println("Usuário cancelou a ação de salvar!");
        	exibirErro("Dados não exportados, ação cancelada pelo usuário!");
        }
        
        else {
        	
        	try {    		
				
        		if (plan.gerarPlanilha(xlsFile)) {
        			
        	        System.out.println("Arquivo XLS exportado com sucesso!");
        	        exibirAlerta("Arquivo XLS exportado com sucesso!");
        			
				}    		
				
			} catch (Exception e) {
				
				String msgErro = ("Não foi possível gerar seu arquivo!"
						+"\n" + e.getMessage());
				
	    		System.err.println(msgErro);
	    		exibirErro(msgErro);
				
			}
		}
    }	
}
