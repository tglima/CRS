package br.edu.tglima.controller;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import br.edu.tglima.model.periodos.*;
import br.edu.tglima.model.proventos.*;
import br.edu.tglima.view.frames.DialogSobre;
import br.edu.tglima.view.frames.FramePrincipal;


/**
 * @author tglima Thiago Lima de Sousa
 * @version 0.5.4
 * @build 20170313-2000
 *
 */

public class ControllerPrincipal  {
	
//	Classes
	private FramePrincipal view;
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
	

//	--------------------------------------------------------------- //
	
/*	Lista de atributos */	
	
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
	
	
	
//	--------------------------------------------------------------- //	
	
/*	Método construtor da classe										*/
	
	public ControllerPrincipal(FramePrincipal framePrincipal) {
		this.view = framePrincipal;
		
        //Definindo os listeners para os botoes da view.
		
        this.view.getjMenuItem1().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                jMenuItem1ActionPerformed(e);
            }
        });
		
        this.view.getjMenuItem2().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                jMenuItem2ActionPerformed(e);
            }
        });
		
        this.view.getjMenuItem3().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                jMenuItem3ActionPerformed(e);
            }
        });
		
						
		this.view.getjButton1().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
            	jButton1ActionPerformed(e);
            }
        });
		this.view.getjButton2().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                voltarInicio(e);
            }
        });
		this.view.getjButton3().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                voltarInicio(e);
            }
        });
		this.view.getjButton4().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                voltarInicio(e);
            }
        });
		this.view.getjButton5().addActionListener(new ActionListener() {
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
				// TODO Auto-generated method stub
				System.out.println("Mouse foi clicado, fique calmo.!");
				
			}
			
		});
		
        this.view.getjRadioButton3().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RadioButton3ActionPerformed(e);
			}
		});
        
        this.view.getjRadioButton4().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RadioButton4ActionPerformed(e);
			}
		});
                
        this.view.getjComboBox1().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jComboBox1ActionPerformed(e);
			}
		});
        
        this.view.getjFormattedTextField2().addFocusListener(new FocusAdapter() {
        	
			@Override
			public void focusLost(FocusEvent e) {
				jFormattedTextField2FocusLost(e);
				
			}
		});


        
//    	--------------------------------------------------------------- //        
        
        
        this.view.getjFormattedTextField3().addFocusListener(new FocusAdapter() {
            @Override
			public void focusLost(FocusEvent e) {
                jFormattedTextField3FocusLost(e);
            }

        });
        
        this.view.getjFormattedTextField4().addFocusListener(new FocusAdapter() {
            @Override
			public void focusLost(FocusEvent e) {
                jFormattedTextField4FocusLost(e);
            }

        });
        
        
        //Fim do contrutor da classe
	}
	
//	--------------------------------------------------------------- //
	
	
/*	Métodos responsáveis por navegar entre as telas do programa	   */
	
    private void jMenuItem1ActionPerformed(ActionEvent e) {                                           
        /*
        Carrega a tela de Limitações
         */
        CardLayout cl = (CardLayout) view.getjPanel1().getLayout();
        cl.show(view.getjPanel1(), "card4");

    }                                          

    private void jMenuItem2ActionPerformed(ActionEvent e) {                                           
        /*
        Carrega a tela Termos
         */
        CardLayout cl = (CardLayout) view.getjPanel1().getLayout();
        cl.show(view.getjPanel1(), "card3");
    }                                         

    private void jMenuItem3ActionPerformed(ActionEvent e) {                                           
        /*
        Carrega a tela Versão
        Por enquanto ela está redirecionando de volta para a tela inicial.
        Ela abrirá um menu popup exibindo as informações referentes
         */
/*        CardLayout cl = (CardLayout) view.getjPanel1().getLayout();
        cl.show(view.getjPanel1(), "card2");*/

    mostrarSobre();
    }   
	
    private void voltarInicio(ActionEvent e) {                                         
        //Volta para a tela inicial do programa
        CardLayout cl = (CardLayout) view.getjPanel1().getLayout();
        cl.show(view.getjPanel1(), "card1");
    } 

    private void fecharButtonActionPerfomed(ActionEvent e){
    	dialog.setVisible(false);
    }
    
    
//	--------------------------------------------------------------- //    
    
/*	Métodos responsáveis pelas escolhas feitas com os radio buttons */    
    
    private void RadioButton3ActionPerformed(ActionEvent e) {                                              

        if (true) {
            view.getjFormattedTextField4().setEnabled(true);
            view.getjLabel8().setEnabled(true);
        }
    }   
	
    private void RadioButton4ActionPerformed(ActionEvent e) {                                              
        if (true) {
            view.getjFormattedTextField4().setEnabled(false);
            view.getjLabel8().setEnabled(false);
        }
    }    
	
//	--------------------------------------------------------------- //        
    
	private void jComboBox1ActionPerformed(ActionEvent e) {
		if (view.getjComboBox1().getSelectedItem() == "Falecimento"
				|| view.getjComboBox1().getSelectedItem() == "Fim do Contrato de Trabalho") {
			view.getjLabel6().setEnabled(false);
			view.getjComboBox2().setEnabled(false);
		} else {
			view.getjLabel6().setEnabled(true);
			view.getjComboBox2().setEnabled(true);
		}

	}

//	--------------------------------------------------------------- //    

/*	Método responsável por controlar os campos de férias vencidas */
	
	private void jFormattedTextField2FocusLost(FocusEvent e){
		obterDatas();
		
		
		try {

			int difEntreDatas = dia.calcDiferDias(this.dataEntrada, this.dataSaida);
			if (difEntreDatas > 365) {

				view.getjLabel4().setEnabled(true);
				view.getjRadioButton1().setEnabled(true);
				view.getjRadioButton2().setEnabled(true);

			} else {

				view.getjLabel4().setEnabled(false);
				view.getjRadioButton1().setEnabled(false);
				view.getjRadioButton2().setEnabled(false);
				view.getjRadioButton2().setSelected(true);

			}

		} catch (Exception e2) {/* Nada aqui*/}

	}
	
//	--------------------------------------------------------------- //    	
	
/* 	Métodos resposáveis por capturar e tratar os valores informados  */
	
	private void jFormattedTextField3FocusLost(FocusEvent e) {
        String value = view.getjFormattedTextField3().getText();
        value = value.replace(" ", "").replace(".", "").replace(",", ".");
        
        try {
            BigDecimal valor = new BigDecimal(value);
            String valorFormatado = df.format(valor);
            view.getjFormattedTextField3().setText(valorFormatado);
			
			}	catch (Exception e2) {
//			
				}
	}
	
    private void jFormattedTextField4FocusLost(FocusEvent e) {                                               
        String valorObtido = view.getjFormattedTextField4().getText();
        valorObtido = valorObtido.replace(" ", "").replace(".", "").replace(",", ".");
        
        try {
            BigDecimal valor = new BigDecimal(valorObtido);
            String valorFormatado = df.format(valor);
            view.getjFormattedTextField4().setText(valorFormatado);
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

//	--------------------------------------------------------------- //    
    
    
/*	Método executado ao pressionar o botão calcular					*/    

    private void jButton1ActionPerformed(ActionEvent e) {                                         
    	System.out.println("Botão calcular foi pressionado");
    	
    	/*
    	 * Primeiro vamos obter os dados obrigátorios, começaremos
    	 * com as datas e o salário.
    	 */
    	
    	obterDatas();
    	
    	
//    	this.dataEntrada = dt.capData((view.getjFormattedTextField1().getText()));
//    	this.dataSaida = dt.capData(view.getjFormattedTextField2().getText());
    	this.salarioInformado = slr.capturarValor(view.getjFormattedTextField3().getText());
    	
    	/*
    	 * O Fgts é opcional, caso ele não seja informado, o sistema realizará o cálculo
    	 * do saldo automáticamente.
    	 */
    	if (view.getjRadioButton3().isSelected()) {
			this.saldoFgts = fgts.capturarValor(view.getjFormattedTextField4().getText());
		} else {
	    	this.saldoFgts = fgts.calcSaldoFgts(this.salarioInformado, dia.calcTotDiasTrab(dataEntrada, dataSaida));
		}
    	
    	/*
    	 * Agora válidamos os dados fornecidos
    	 * 
    	 */
    	
    	if (validarData(dataEntrada) == false) {
			System.out.println("A data de entrada é inválida!");
			this.msgErro = "Data de admissão inválida!\n"
							+ "Apenas são aceitas datas apartir de 01/05/1943";
			exibirErro();
		}
    	
    	else if (validarData(dataSaida) == false){
    		System.out.println("Data de saída inválida");
			this.msgErro = "Data de saída inválida!";
			exibirErro();
    	} 
    	
    	else if (verificarDiferDatas(dataEntrada, dataSaida) == false) {
			System.out.println("A data de saída é inferior a data de entrada!");
			this.msgErro = "A data de saída é inferior a data de entrada!";
			exibirErro();
			
		}
    	
    	else if (validarSalario(this.salarioInformado) == false){
    		System.out.println("O valor informado como salário é inválido!");
			this.msgErro = "O valor informado como salário é inválido!\n"
							+ "São aceitos apenas valores apartir de R$ 1,00.";
			exibirErro();
    		
    	} 
    	
    	else if (validarFgts(this.saldoFgts) == false) {
			System.out.println("O saldo informado como fgts é inválido!");
			this.msgErro = "O saldo informado como fgts é inválido!";
			exibirErro();
			
		} else {
			
//			System.out.println("Os dados fornecidos até o aqui estão corretos");

//			Programa continuará sua execução			    
			
			
			this.motivoSaida = (String) this.view.getjComboBox1().getSelectedItem();
			
/*			 Bloco referente ao último sálario.*/
			this.qtdDiasTrabUltMes = dia.calcDiasTrabUltimoMes(dataSaida);
	    	this.salarioFinal =	this.slr.calcUltSal(this.qtdDiasTrabUltMes, this.salarioInformado);
	    	
/*	    	Bloco referente ao Décimo terceiro salário*/
	    	this.mesesDecimo = mes.calcMesesTrabUltimoAno(dataEntrada, dataSaida);
	    	this.valorDecimo = this.slr.calcDecimo(this.mesesDecimo, this.salarioInformado);
	    	
/*	    	Bloco referente as Férias								*/
	    	this.mesesAqFerias = mes.calcMesesAqFerias(dataEntrada, dataSaida);
	    	this.valorFerias = fr.calcValorFerias(salarioInformado, mesesAqFerias);
			this.valorTercoFerias = fr.calcTercoFerias(valorFerias);
						
			if (view.getjRadioButton1().isSelected()) {
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
			this.opAviso = (String) view.getjComboBox2().getSelectedItem();
			
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
			
			
/*			Bloco referente ao motivo da saída*/
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
    	this.dataEntrada = dt.capData((view.getjFormattedTextField1().getText()));
    	this.dataSaida = dt.capData(view.getjFormattedTextField2().getText());
    	
    }
    	
	private boolean verificarDiferDatas(LocalDate dateInicio, LocalDate dateFim){
		int difEntreDatas = dia.calcDiferDias(dateInicio, dateFim);
		
		if (difEntreDatas <= 0) {
			return false;
			
		} else {

			return true;
		}		
	}

	private boolean validarData(LocalDate date){
		LocalDate inicioClt = dt.capData("30/04/1943");		
		if (dt.validarData(date) && verificarDiferDatas(inicioClt, date) ) {
			return true;
		} else
		return false ;
	}
	
	private boolean validarSalario(BigDecimal valor){
		if ( valor.compareTo(new BigDecimal("1") ) < 0){
			
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
    	  
	private void exibirErro(){
		JOptionPane.showMessageDialog(null, this.msgErro, "Ocorreu um erro", JOptionPane.ERROR_MESSAGE);
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
    	
    	int totDiasTrab = dia.calcTotDiasTrab(dataEntrada, dataSaida);
    	    	
    	if (totDiasTrab < 365) {
        	this.valorDecimo = new BigDecimal("0");
        	this.valorFerias = new BigDecimal("0");
        	this.valorTercoFerias = new BigDecimal("0");
		} 
    	
    	this.multaFGTS = new BigDecimal("0");
    	
    }

    private void opFalecimento(){
    	opFimContrato();
    }
    
    private void mostrarResultado(){
    	
    	/*Bloco responsável por direcionar o usuário para a tela de resultados.*/
        CardLayout cl = (CardLayout) view.getjPanel1().getLayout();
        cl.show(view.getjPanel1(), "card2");
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
    	view.getjTable1().setModel(tabela1);
        tabela1.addColumn("Item");
        tabela1.addColumn("Referência");
        tabela1.addColumn("Valor");
               
        view.getjTable1().getColumnModel().getColumn(0).setResizable(false);
        view.getjTable1().getColumnModel().getColumn(0).setPreferredWidth(250);
        
        view.getjTable1().getColumnModel().getColumn(1).setResizable(false);        
        view.getjTable1().getColumnModel().getColumn(1).setPreferredWidth(100);
                
        view.getjTable1().getColumnModel().getColumn(2).setResizable(false);
        view.getjTable1().getColumnModel().getColumn(2).setPreferredWidth(135);
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
        view.getjTable2().setModel(tabela2);
        tabela2.addColumn(null);
        tabela2.addColumn(null);
        
        view.getjTable2().getColumnModel().getColumn(0).setResizable(false);
        view.getjTable2().getColumnModel().getColumn(0).setPreferredWidth(350);
        
        view.getjTable2().getColumnModel().getColumn(1).setResizable(false);
        view.getjTable2().getColumnModel().getColumn(1).setPreferredWidth(135);
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
        
        view.getjTable1().getColumnModel().getColumn(1).setCellRenderer(centralizado);
        view.getjTable1().getColumnModel().getColumn(2).setCellRenderer(centralizado);
        view.getjTable2().getColumnModel().getColumn(1).setCellRenderer(centralizado);
        /*Fim do bloco*/
        
    }

    
    
    private void mostrarSobre(){
    	
		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		dialog.setVisible(true);
		dialog.setLocationRelativeTo(null);


    }
    
}
