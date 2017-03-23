package br.edu.tglima.controller;

import java.awt.CardLayout;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.math.BigDecimal;
import java.net.URI;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import br.edu.tglima.model.periodos.*;
import br.edu.tglima.model.persistencia.PlanilhaXLS;
import br.edu.tglima.model.proventos.*;
import br.edu.tglima.view.DialogSobre;
import br.edu.tglima.view.FramePrincipal;




/**
 * @author tglima Thiago Lima de Sousa
 * @version 0.8.0
 * @build 20170323-1600
 *
 */

public class ControllerPrincipal  {
	
/*	Classes																*/

	private FramePrincipal gui;
	private DialogSobre dialog = new DialogSobre();
	private Locale ptBr = new Locale("pt", "BR");
    private NumberFormat df = NumberFormat.getCurrencyInstance(ptBr); 
    private NumberFormat nf = new DecimalFormat("#,##0.00");
	private Salario slr = new Salario();
	private Data dt = new Data();
	private Dia dia = new Dia();
	private Mes mes = new Mes();
	private Fgts fgts = new Fgts();
	private Ferias fr = new Ferias();
	private AvisoPrevio ap = new AvisoPrevio();
	private PlanilhaXLS plan = new PlanilhaXLS();
	

//	------------------------------------------------------------------------ //

	
/*	Lista de atributos 														*/	
	
//	Atributos fornecidos pelo usuário
	private LocalDate dataEntrada, dataSaida;
	private BigDecimal salarioInformado, saldoFgts;
	
	
// Atributos relativos a valores.
	private BigDecimal salarioFinal, valorDecimo, valorFerias, valorTercoFerias;
	private BigDecimal valorFeriasVenc, valorTercoFeriasVenc;
	private BigDecimal valorAviso, multaFGTS, totVencimentos, totSomaFGTS;
	
//	Atributos relativos a datas e periodos.
	private int qtdDiasTrabUltMes, qtdDiasAviso, mesesDecimo,	mesesAqFerias, qtdFeriasVenc;
	
//	Outros atributos
	private String msgErro;
	private String motivoSaida;
	private String opAviso;
	private String receberFgts;
	
	private String strQtdDiasTrabUltMes, strSalarioFinal, strMesesDecimo, strValorDecimo,
    strMesesAqFerias, strValorFerias, strValorTercoFerias,strQtdFeriasVenc, 
    strValorFeriasVenc, strValorTercoFeriasVenc, strQtdDiasAviso, 
    strValorAviso, strTotVencimento, stSaldoFgts, stMultaFgts, stTotSomaFgts;
	
	
	
//	------------------------------------------------------------------------ //	
	
/*	Método construtor da classe												*/
	
	public ControllerPrincipal(FramePrincipal gui) {
		this.gui = gui;
		
        //Definindo os listeners para os botoes da view.
		
        this.gui.getjMenuItem1().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                jMenuItem1ActionPerformed(e);
            }
        });
		
        this.gui.getjMenuItem2().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                jMenuItem2ActionPerformed(e);
            }
        });
		
        this.gui.getjMenuItem3().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                jMenuItem3ActionPerformed(e);
            }
        });
						
		this.gui.getjButton1().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
            	jButton1ActionPerformed(e);
            }
        });
		this.gui.getjButton2().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                voltarInicio(e);
            }
        });
		this.gui.getjButton3().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
            	exportarPlanilha();
            }
        });
		this.gui.getjButton4().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                voltarInicio(e);
            }
        });
		this.gui.getjButton5().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                voltarInicio(e);
            }
        });
		
		this.dialog.getFecharButton().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				fecharButtonActionPerfomed(e);				
			}
		});
		
		this.dialog.getLblLink().addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					URI link = new URI("http://www.oracle.com/technetwork/java/index.html");
					Desktop.getDesktop().browse(link);
					
				} catch (Exception error) {
					System.out.println("Não foi possível lançar o navegador!");
				}
				
			}
			
		});
		
        this.gui.getjRadioButton3().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RadioButton3ActionPerformed(e);
			}
		});
        
        this.gui.getjRadioButton4().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RadioButton4ActionPerformed(e);
			}
		});
                
        this.gui.getjComboBox1().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jComboBox1ActionPerformed(e);
			}
		});
        
        this.gui.getjFormattedTextField2().addFocusListener(new FocusAdapter() {
        	
			@Override
			public void focusLost(FocusEvent e) {
				jFormattedTextField2FocusLost(e);
				
			}
		});

//    	-------------------------------------------------------------------- //    

        
        this.gui.getjFormattedTextField3().addFocusListener(new FocusAdapter() {
            @Override
			public void focusLost(FocusEvent e) {
                jFormattedTextField3FocusLost(e);
            }

        });
        
        this.gui.getjFormattedTextField4().addFocusListener(new FocusAdapter() {
            @Override
			public void focusLost(FocusEvent e) {
                jFormattedTextField4FocusLost(e);
            }

        });
        
        
        //Fim do contrutor da classe
	}
	
//	------------------------------------------------------------------------ //    

	
/*	Métodos responsáveis por navegar entre as telas do programa	   			*/
	
    private void jMenuItem1ActionPerformed(ActionEvent e) {                                           
        /*
        Carrega a tela de Limitações
         */
        CardLayout cl = (CardLayout) gui.getjPanel1().getLayout();
        cl.show(gui.getjPanel1(), "card4");

    }                                          

    private void jMenuItem2ActionPerformed(ActionEvent e) {                                           
        /*
        Carrega a tela Termos
         */
        CardLayout cl = (CardLayout) gui.getjPanel1().getLayout();
        cl.show(gui.getjPanel1(), "card3");
    }                                         

    private void jMenuItem3ActionPerformed(ActionEvent e) {    
    	//Carrega o jDialog com as informações sobre o aplicativo.
    	mostrarSobre();
    }   
	
    private void voltarInicio(ActionEvent e) {                                         
        //Volta para a tela inicial do programa
        CardLayout cl = (CardLayout) gui.getjPanel1().getLayout();
        cl.show(gui.getjPanel1(), "card1");
    } 

    private void fecharButtonActionPerfomed(ActionEvent e){
    	dialog.setVisible(false);
    }

//	------------------------------------------------------------------------ //    
    
    
/*	Métodos responsáveis pelas escolhas feitas com os radio buttons */    
    
    private void RadioButton3ActionPerformed(ActionEvent e) {                                              

        if (true) {
            gui.getjFormattedTextField4().setEnabled(true);
            gui.getjLabel8().setEnabled(true);
        }
    }   
	
    private void RadioButton4ActionPerformed(ActionEvent e) {                                              
        if (true) {
            gui.getjFormattedTextField4().setEnabled(false);
            gui.getjLabel8().setEnabled(false);
        }
    }    
	
//	------------------------------------------------------------------------ //    
        
    
	private void jComboBox1ActionPerformed(ActionEvent e) {
		if (gui.getjComboBox1().getSelectedItem() == "Falecimento"
				|| gui.getjComboBox1().getSelectedItem() == "Fim do Contrato de Trabalho") {
			gui.getjLabel6().setEnabled(false);
			gui.getjComboBox2().setEnabled(false);
		} else {
			gui.getjLabel6().setEnabled(true);
			gui.getjComboBox2().setEnabled(true);
		}

	}

//	------------------------------------------------------------------------ //    

	
/*	Método responsável por controlar os campos de férias vencidas */
	
	private void jFormattedTextField2FocusLost(FocusEvent e){
		obterDatas();
		
		
		try {

			int difEntreDatas = dia.calcDiferDias(this.dataEntrada, this.dataSaida);
			if (difEntreDatas > 365) {

				gui.getjLabel4().setEnabled(true);
				gui.getjRadioButton1().setEnabled(true);
				gui.getjRadioButton2().setEnabled(true);

			} else {

				gui.getjLabel4().setEnabled(false);
				gui.getjRadioButton1().setEnabled(false);
				gui.getjRadioButton2().setEnabled(false);
				gui.getjRadioButton2().setSelected(true);

			}

		} catch (Exception e2) {/* Nada aqui*/}

	}
	
//	------------------------------------------------------------------------ //    

	
	
/* 	Métodos resposáveis por capturar e tratar os valores informados  */
	
	private void jFormattedTextField3FocusLost(FocusEvent e) {
        String value = gui.getjFormattedTextField3().getText();
        value = value.replace(" ", "").replace(".", "").replace(",", ".");
        
        try {
            BigDecimal valor = new BigDecimal(value);
            String valorFormatado = df.format(valor);
            gui.getjFormattedTextField3().setText(valorFormatado);
			
			}	catch (Exception e2) {
//			
				}
	}
	
    private void jFormattedTextField4FocusLost(FocusEvent e) {                                               
        String valorObtido = gui.getjFormattedTextField4().getText();
        valorObtido = valorObtido.replace(" ", "").replace(".", "").replace(",", ".");
        
        try {
            BigDecimal valor = new BigDecimal(valorObtido);
            String valorFormatado = df.format(valor);
            gui.getjFormattedTextField4().setText(valorFormatado);
			}	catch (Exception e2) {
//			
				}

    }
    
    private String formatarValores(BigDecimal valor){
    	String valorFormatado = null;
    	
    	try {		
            valorFormatado = df.format(valor);
			
		} catch (Exception e) {/*Nada aqui*/}
    	
    	return valorFormatado;
    }

//	------------------------------------------------------------------------ //    
    
    
/*	Método executado ao pressionar o botão calcular					*/    

    private void jButton1ActionPerformed(ActionEvent e) {                                         
    	System.out.println("Botão calcular foi pressionado");
    	
    	/*
    	 * Primeiro vamos obter os dados obrigátorios, começaremos
    	 * com as datas e o salário.
    	 */
    	
    	obterDatas();
    	
    	this.salarioInformado = slr.capturarValor(gui.getjFormattedTextField3().getText());
    	
    	/*
    	 * O Fgts é opcional, caso ele não seja informado, o sistema realizará o cálculo
    	 * do saldo automáticamente.
    	 */
    	if (gui.getjRadioButton3().isSelected()) {
			this.saldoFgts = fgts.capturarValor(gui.getjFormattedTextField4().getText());
		} else {
	    	this.saldoFgts = fgts.calcSaldoFgts(this.salarioInformado, dia.calcTotDiasTrab(dataEntrada, dataSaida));
		}
    	
    	/*
    	 * Agora válidamos os dados fornecidos
    	 * 
    	 */
    	
    	if (validarDataEntrada(dataEntrada) == false) {
			System.err.println("Data de admissão inválida!");
		}
    	
    	else if (validarDataSaida(dataSaida) == false) {
			System.err.println("Data de saída inválida!");
		}
    	
    	else if (verificarDiferDatas(dataEntrada, dataSaida) == false) {
			System.err.println("A data de saída é inferior a data de entrada!");
			this.msgErro = "A data de saída é inferior a data de entrada!";
			exibirErro(this.msgErro);
			
		}
    	
    	else if (validarSalario(this.salarioInformado) == false){
    		System.out.println("O valor informado como salário é inválido!");
    		
			this.msgErro = "O valor informado como salário é inválido!\n"
							+ "São aceitos apenas valores apartir de R$ 1,00.";
			exibirErro(this.msgErro);
    		
    	} 
    	
    	else if (validarFgts(this.saldoFgts) == false) {
			System.out.println("O saldo informado como fgts é inválido!");
			
			this.msgErro = "O saldo informado como fgts é inválido!";
			exibirErro(this.msgErro);
			
		} else {
			
			this.motivoSaida = (String) this.gui.getjComboBox1().getSelectedItem();
			
/*			 Bloco referente ao último sálario.						*/
			this.qtdDiasTrabUltMes = dia.calcDiasTrabUltimoMes(dataSaida);
	    	this.salarioFinal =	this.slr.calcUltSal(this.qtdDiasTrabUltMes, this.salarioInformado);
	    	
/*	    	Bloco referente ao Décimo terceiro salário				*/
	    	this.mesesDecimo = mes.calcMesesTrabUltimoAno(dataEntrada, dataSaida);
	    	this.valorDecimo = this.slr.calcDecimo(this.mesesDecimo, this.salarioInformado);
	    	
/*	    	Bloco referente as Férias								*/
	    	this.mesesAqFerias = mes.calcMesesAqFerias(dataEntrada, dataSaida);
	    	this.valorFerias = fr.calcValorFerias(salarioInformado, mesesAqFerias);
			this.valorTercoFerias = fr.calcTercoFerias(valorFerias);
						
			if (gui.getjRadioButton1().isSelected()) {
				this.valorFeriasVenc = salarioInformado;
				this.valorTercoFeriasVenc = fr.calcTercoFerias(valorFeriasVenc);
				this.qtdFeriasVenc = 1;
			} else {
				this.valorFeriasVenc = new BigDecimal("0");
				this.valorTercoFeriasVenc = new BigDecimal("0");
				this.qtdFeriasVenc = 0;
			}
			
/*			Bloco referente aos cálculos do aviso prévio.									*/
			this.qtdDiasAviso = dia.calcDiasAviso(dataEntrada, dataSaida);
			this.opAviso = (String) gui.getjComboBox2().getSelectedItem();
			
			switch (opAviso) {
			case "Trabalhado":
				this.valorAviso = new BigDecimal("0");
				break;
				
			case "Indenizado pela empresa":
				this.valorAviso = ap.calcAvisoPrevio(salarioInformado, qtdDiasAviso);
				break;

			case "Descontado do funcionário":
				this.valorAviso = new BigDecimal("-1").multiply(ap.calcAvisoPrevio(salarioInformado, qtdDiasAviso));
				break;
				
			default:
				this.valorAviso = new BigDecimal("0");
				this.qtdDiasAviso = 0;
				break;
			}
			
			
/*			Bloco referente ao motivo da saída			*/
			switch (this.motivoSaida) {
			case "Pedido de demissão":
				opDemissao();
				break;
				
			case "Fim do Contrato de Trabalho":
				opFimContrato();
				break;

			case "Demissão sem justa causa":
				opSemJustaCau();
				break;

				
			case "Demissão por Justa Causa": 
				opPorJustaCau();
				break;
				
			case "Falecimento":
				opFalecimento();
				break;
				
			}
    		
/*			Soma de todos os vencimentos referentes há rescisão.										*/			
	    	this.totVencimentos = salarioFinal.add(valorDecimo).add(valorFerias).add(valorTercoFerias)
	    			.add(valorFeriasVenc).add(valorTercoFeriasVenc).add(valorAviso);
	    	
/*			Soma do saldo FGTS + o valor referente  há multa*/
	    	
	    	this.totSomaFGTS = saldoFgts.add(multaFGTS);
			
			mostrarResultado();
		}
    	
    } 
    
//	--------------------------------------------------------------- //  
    
    private void obterDatas(){
    	this.dataEntrada = dt.capData((gui.getjFormattedTextField1().getText()));
    	this.dataSaida = dt.capData(gui.getjFormattedTextField2().getText());
    	
    }
    	
	private boolean verificarDiferDatas(LocalDate dateInicio, LocalDate dateFim){
		int difEntreDatas = dia.calcDiferDias(dateInicio, dateFim);
		
		if (difEntreDatas <= 0) {
			return false;
			
		} else {

			return true;
		}		
	}
	
	private boolean validarDataEntrada(LocalDate date){
		LocalDate inicioClt = dt.capData("10/11/1943");
		
		if (dt.validarData(date) == false) {
			
			this.msgErro = "Data de admissão inválida!"
					+ "\nInforme a data no seguinte formato: dd/mm/aaaa";
			
			exibirErro(this.msgErro);
			return false;
			
		} else if (verificarDiferDatas(inicioClt, date) == false) {
			
			this.msgErro = "Data de admissão inválida!"
					+ "\nInforme datas superiores há 10/11/1943";
			
			exibirErro(this.msgErro);
			return false;
			
		} else {
			
			return true;
		}

	}
	
	private boolean validarDataSaida(LocalDate date){
		LocalDate dataLimite = dt.capData("01/01/2060");
		
		if (dt.validarData(date) == false) {
			
			this.msgErro = "Data de saída é inválida!"
					+ "\nInforme a data no seguinte formato: dd/mm/aaaa";
			
			exibirErro(this.msgErro);
			return false;
			
		} else if (verificarDiferDatas(date, dataLimite) == false) {
			
			this.msgErro = "Data de saída inválida!"
					+ "\nInforme datas inferiores há 01/01/2060";
			
			exibirErro(this.msgErro);
			return false;
			
		} else {
			
			return true;
			
		}

	}
	
	private boolean validarSalario(BigDecimal valor){
		if ( valor.compareTo(new BigDecimal("1") ) < 0){
			
			this.msgErro = "O valor informado como salário é inválido!\n"
					+ "Use valores apartir de R$ 1,00.";
			
			exibirErro(this.msgErro);
			
			return false;
			
		}else if ( valor.compareTo(new BigDecimal("59999") ) > 0 ) {

			this.msgErro = "O valor informado como salário é inválido!\n"
					+ "Use valores inferiores há R$ 60.000,00.";
			
			exibirErro(this.msgErro);
			
			return false;
			
		} else {
			
			return true;

		}
		
	}
    
	private boolean validarFgts(BigDecimal valor){
		
		if ( valor.compareTo(new BigDecimal("0") ) < 0){
			
			return false;
			
		} else {
			
			return true;

		}
		
	}
    	  
	private void exibirErro(String msgErro){
		JOptionPane.showMessageDialog(null, msgErro, "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
	}

	private void exibirAlerta(String msgAlerta){ 
		JOptionPane.showMessageDialog(null, msgAlerta, "Informação", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
    private void opDemissao(){
    	
    	this.qtdDiasAviso = 30;
    	this.receberFgts = "Não";
    	this.multaFGTS = new BigDecimal("0");
    	
    	
    }
    
    private void opFimContrato(){
    	this.qtdDiasAviso = 0;
    	this.receberFgts ="Sim";
    	this.multaFGTS = new BigDecimal("0");
    	
    }

    private void opSemJustaCau(){
    	
    	this.receberFgts = "Sim";
    	this.multaFGTS = fgts.calcMulta(saldoFgts);
    	
    }

    private void opPorJustaCau(){
    	
    	this.receberFgts = "Não";
    	    	
    	this.valorDecimo = new BigDecimal("0");

    	this.valorFerias = new BigDecimal("0");
    	
    	this.valorTercoFerias = new BigDecimal("0");
    	
    	this.multaFGTS = new BigDecimal("0");
    	
    }

    private void opFalecimento(){
    	opFimContrato();
    }
    
    private void mostrarResultado(){
    	
    	/*Bloco responsável por direcionar o usuário para a tela de resultados.*/
        CardLayout cl = (CardLayout) gui.getjPanel1().getLayout();
        cl.show(gui.getjPanel1(), "card2");
        /*Fim do bloco*/
 
        
        /*Bloco responsável por definições de Modelo das tabelas */
    	// Modelo padrão para definição da Jtable1
    	DefaultTableModel tabela1 = new DefaultTableModel() {
			private static final long serialVersionUID = -4898544871403933182L;

			// Método resṕonsável por bloquear a edição das células
    		@Override
			public boolean isCellEditable(int linha, int coluna) {
    			return false;
    		}

    	};

    	DefaultTableModel tabela2 = new DefaultTableModel() {
			private static final long serialVersionUID = 3583475816933228919L;

			// Modelo padrão para definição da Jtable2
    		@Override
			public boolean isCellEditable(int linha, int coluna) {
    			return false;
    		}
    	};
        /*Fim do bloco*/
    	
        
        /*Bloco com definições e valores específicos da tabela de rescisão*/
    	gui.getjTable1().setModel(tabela1);
        tabela1.addColumn("Item");
        tabela1.addColumn("Referência");
        tabela1.addColumn("Valor");
               
        gui.getjTable1().getColumnModel().getColumn(0).setResizable(false);
        gui.getjTable1().getColumnModel().getColumn(0).setPreferredWidth(250);
        
        gui.getjTable1().getColumnModel().getColumn(1).setResizable(false);        
        gui.getjTable1().getColumnModel().getColumn(1).setPreferredWidth(100);
                
        gui.getjTable1().getColumnModel().getColumn(2).setResizable(false);
        gui.getjTable1().getColumnModel().getColumn(2).setPreferredWidth(135);
        /*Fim do bloco*/
        
        
        /*Bloco referente as informações exibidas na tabela rescisão*/
        
//		Convertemos e formatamos todos os valores e informações para o formato String.        
        
        this.strQtdDiasTrabUltMes = String.valueOf(this.qtdDiasTrabUltMes) + " dias.";
        this.strSalarioFinal = formatarValores(this.salarioFinal);
        
        this.strMesesDecimo = String.valueOf(this.mesesDecimo) + "/12";
        this.strValorDecimo = formatarValores(this.valorDecimo);
        
        this.strMesesAqFerias = String.valueOf(this.mesesAqFerias) + "/12";
        
        this.strValorFerias =   formatarValores(this.valorFerias);
        strValorTercoFerias = formatarValores(this.valorTercoFerias);
        
        this.strQtdFeriasVenc =  String.valueOf(this.qtdFeriasVenc);
        this.strValorFeriasVenc = formatarValores(this.valorFeriasVenc);
        this.strValorTercoFeriasVenc = formatarValores(this.valorTercoFeriasVenc);
        
        this.strQtdDiasAviso = String.valueOf(this.qtdDiasAviso) + " dias.";       
        this.strValorAviso = "R$ " + nf.format(this.valorAviso);
        
        this.strTotVencimento = "R$ " + nf.format(this.totVencimentos);
        
        
        
//      Agora repassamos essas informações para a tabela correspondente.
        tabela1.addRow(new Object[]{"  Saldo salário", this.strQtdDiasTrabUltMes, this.strSalarioFinal });
        tabela1.addRow(new Object[]{"  13º Proporcional", this.strMesesDecimo, this.strValorDecimo });
        tabela1.addRow(new Object[]{"  Férias proporcional", this.strMesesAqFerias, this.strValorFerias });
        tabela1.addRow(new Object[]{"  1/3 Férias proporcional", "-", this.strValorTercoFerias });
        tabela1.addRow(new Object[]{"  Férias vencidas", this.strQtdFeriasVenc, this.strValorFeriasVenc });
        tabela1.addRow(new Object[]{"  1/3 Férias vencidas", "-", this.strValorTercoFeriasVenc });
        tabela1.addRow(new Object[]{"  Aviso prévio", this.strQtdDiasAviso, this.strValorAviso });
        tabela1.addRow(new Object[]{   null, null, null });
        tabela1.addRow(new Object[]{"  Valor total", "-", this.strTotVencimento });
    	/*Fim do bloco*/
        
        
        /*Bloco com definições e valores específicos da tabela do FGTS*/
        gui.getjTable2().setModel(tabela2);
        tabela2.addColumn(null);
        tabela2.addColumn(null);
        
        gui.getjTable2().getColumnModel().getColumn(0).setResizable(false);
        gui.getjTable2().getColumnModel().getColumn(0).setPreferredWidth(350);
        
        gui.getjTable2().getColumnModel().getColumn(1).setResizable(false);
        gui.getjTable2().getColumnModel().getColumn(1).setPreferredWidth(135);
        /*Fim do bloco */
        
//		Convertemos e formatamos todos os valores e informações para o formato String.
        this.stSaldoFgts = formatarValores(this.saldoFgts);
        this.stMultaFgts = formatarValores(this.multaFGTS);
        this.stTotSomaFgts = formatarValores(this.totSomaFGTS);
        
//      Agora repassamos essas informações para a tabela correspondente.
        tabela2.addRow(new Object[]{"  Valores do FGTS estarão disponíveis para saque?", this.receberFgts});
        tabela2.addRow(new Object[]{"  Saldo FGTS", this.stSaldoFgts});
        tabela2.addRow(new Object[]{"  Multa de 40%", this.stMultaFgts});
        tabela2.addRow(new Object[]{null, null});
        tabela2.addRow(new Object[]{"  Valor total", this.stTotSomaFgts});
        /*Fim do bloco*/
        
        /*Bloco de código responsável por centralizar as células */
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        
        gui.getjTable1().getColumnModel().getColumn(1).setCellRenderer(centralizado);
        gui.getjTable1().getColumnModel().getColumn(2).setCellRenderer(centralizado);
        gui.getjTable2().getColumnModel().getColumn(1).setCellRenderer(centralizado);
        /*Fim do bloco*/
        
    }

    private void exportarPlanilha(){
    	JFileChooser fileChooser = new JFileChooser(System.getProperty("user.dir"));
    	fileChooser.setSelectedFile(new File("ArquivoExportado.xls"));
    	fileChooser.setFileFilter(new FileNameExtensionFilter("Planilha Excel (*.xls)", "xls"));
    	fileChooser.setAcceptAllFileFilterUsed(false);
    	
    	int returnVal = fileChooser.showSaveDialog(null);
    	
        if (returnVal==1){
        	
        	System.out.println("Usuário cancelou a ação de salvar!");
        	exibirAlerta("Dados não exportados, ação cancelada pelo usuário!");
//        	Colocar um JoptionPane aqui mostrando a mensagem.
        }
        
        else {
        	
        	try {
        		
        		File arquivo = fileChooser.getSelectedFile();
        		
/*				Carregar os resultado para a planilha		*/
        		
        		
        		plan.setQtdDiasTrabUltMes(this.strQtdDiasTrabUltMes);
        		plan.setSalarioFinal(this.strSalarioFinal);
        		plan.setMesesDecimo(this.strMesesDecimo);
        		plan.setValorDecimo(this.strValorDecimo);
        		plan.setMesesAqFerias(this.strMesesAqFerias);
        		plan.setValorFerias(this.strValorFerias);
        		plan.setValorTercoFerias(this.strValorTercoFerias);
        		plan.setQtdFeriasVenc(this.strQtdFeriasVenc);
        		plan.setValorFeriasVenc(this.strValorFeriasVenc);
        		plan.setQtdDiasAviso(this.strQtdDiasAviso);
        		plan.setValorAviso(this.strValorAviso);
        		plan.setTotVencimento(this.strTotVencimento);
        		plan.setReceberFgts(this.receberFgts);
        		plan.setSaldoFgts(this.stSaldoFgts);
        		plan.setMultaFgts(this.stMultaFgts);
        		plan.setTotSomaFgts(this.stTotSomaFgts);
        		
				
        		if (plan.gerarPlanilha(arquivo)) {
        			
        	        System.out.println("Arquivo XLS exportado com sucesso!");
        	        exibirAlerta("Arquivo XLS exportado com sucesso!");
        			
				}    		
				
			} catch (Exception e) {
				
	    		System.err.println("Não foi possível gerar seu arquivo!"
	    				+ " \n" + e.getMessage());
//	        	Colocar um JoptionPane aqui mostrando a mensagem.
	    		
	    		this.msgErro = e.getLocalizedMessage();
	    		exibirErro(this.msgErro);
				
			}
			
		}
        
        
    }

    private void mostrarSobre(){
    	
		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		dialog.setVisible(true);
		dialog.setLocationRelativeTo(null);


    }
    

}
