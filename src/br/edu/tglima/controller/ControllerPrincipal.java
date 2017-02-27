package br.edu.tglima.controller;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

import br.edu.tglima.model.periodos.*;
import br.edu.tglima.model.proventos.*;
import br.edu.tglima.view.FramePrincipal;


/**
 * @author tglima Thiago Lima de Sousa
 * @version 0.4.1
 * @build 20170227-1840
 *
 */

public class ControllerPrincipal  {
	
//	Classes
	private FramePrincipal view;
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
	private BigDecimal salarioFinal, decimoTerceiro, valorFerias, valorTercoFerias;
	private BigDecimal valorFeriasVencidas, valorTercoFeriasVencidas;
	private BigDecimal valorAviso, multaFGTS, totVencimentos, totSomaFGTS;
	
//	Atributos relativos a datas e periodos.
	private int diastrabUltMes, diasAviso, mesesDecimo,	mesesAqFerias, qtdFeriasVencidas;
	
//	Outros atributos
	private String motivoSaida;
	private String opAviso;
	private String recebereiFgts;
	
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
		
		
		
		this.view.getjMenu2().addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e){
				jMenu2MousePressed(e);
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
		
		this.view.getjRadioButton1().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                RadioButton1ActionPerformed(e);
            }
        });
		
        this.view.getjRadioButton2().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
            	RadioButton2ActionPerformed(e);
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
        Carrega a tela Termos de Uso
         */
        CardLayout cl = (CardLayout) view.getjPanel1().getLayout();
        cl.show(view.getjPanel1(), "card4");

    }                                          

    private void jMenuItem2ActionPerformed(ActionEvent e) {                                           
        /*
        Carrega a tela Licença
         */
        CardLayout cl = (CardLayout) view.getjPanel1().getLayout();
        cl.show(view.getjPanel1(), "card5");
    }                                         

    private void jMenuItem3ActionPerformed(ActionEvent e) {                                           
        /*
        Carrega a tela Versão
         */
        CardLayout cl = (CardLayout) view.getjPanel1().getLayout();
        cl.show(view.getjPanel1(), "card6");
    }   
	
    private void jMenu2MousePressed(MouseEvent e) {                                    
        //Carrega a tela de Ajuda
        CardLayout cl = (CardLayout) view.getjPanel1().getLayout();
        cl.show(view.getjPanel1(), "card7");
    }  

    private void voltarInicio(ActionEvent e) {                                         
        //Volta para a tela inicial do programa
        CardLayout cl = (CardLayout) view.getjPanel1().getLayout();
        cl.show(view.getjPanel1(), "card1");
    } 
    
//	--------------------------------------------------------------- //    
    
    
/*	Métodos responsáveis pelas escolhas feitas com os radio buttons */    
    
	private void RadioButton1ActionPerformed(ActionEvent e){
        if (true) {
            view.getjLabel5().setEnabled(true);
            view.getjSpinner1().setEnabled(true);
        }
	}
	
	private void RadioButton2ActionPerformed(ActionEvent e){
        if (true) {
            view.getjLabel5().setEnabled(false);
            view.getjSpinner1().setEnabled(false);
        }
		
	}

    private void RadioButton3ActionPerformed(ActionEvent e) {                                              

        if (true) {
            view.getjFormattedTextField4().setEnabled(true);
            view.getjLabel9().setEnabled(true);
        }
    }   
	
    private void RadioButton4ActionPerformed(ActionEvent e) {                                              
        if (true) {
            view.getjFormattedTextField4().setEnabled(false);
            view.getjLabel9().setEnabled(false);
        }
    }    
	
//	--------------------------------------------------------------- //        
    
	private void jComboBox1ActionPerformed(ActionEvent e) {
		if (view.getjComboBox1().getSelectedItem() == "Falecimento"
				|| view.getjComboBox1().getSelectedItem() == "Fim do Contrato de Trabalho") {
			view.getjLabel7().setEnabled(false);
			view.getjComboBox2().setEnabled(false);
		} else {
			view.getjLabel7().setEnabled(true);
			view.getjComboBox2().setEnabled(true);
		}

	}

//	--------------------------------------------------------------- //    
	
/* 	Métodos resposáveis por capturar e tratar os valores informados  */
	
	private void jFormattedTextField3FocusLost(FocusEvent e) {
        String value = view.getjFormattedTextField3().getText();
        value = value.replace(" ", "").replace(".", "").replace(",", ".");
        Locale ptBr = new Locale("pt", "BR");
        
        try {
        	
            NumberFormat nf = NumberFormat.getCurrencyInstance(ptBr);
            BigDecimal valor = new BigDecimal(value);
            String valorFormatado = nf.format(valor);
            view.getjFormattedTextField3().setText(valorFormatado);
			
		} catch (Exception e2) {
//			
		}
        
        
        

	}
	
    private void jFormattedTextField4FocusLost(FocusEvent e) {                                               
        String value = view.getjFormattedTextField4().getText();
        value = value.replace(" ", "").replace(".", "").replace(",", ".");
        Locale ptBr = new Locale("pt", "BR");
        try {
            NumberFormat nf = NumberFormat.getCurrencyInstance(ptBr);
            BigDecimal valor = new BigDecimal(value);
            String valorFormatado = nf.format(valor);
            System.out.println(valorFormatado);
            view.getjFormattedTextField4().setText(valorFormatado);
		} catch (Exception e2) {
//			
		}

    } 

//	--------------------------------------------------------------- //    
    
    
/*	Método executado ao pressionar o botão calcular					*/    

    private void jButton1ActionPerformed(ActionEvent e) {                                         
    	System.out.println("Botão calcular foi pressionado");
    	
    	/*
    	 * Primeiro vamos obter os dados obrigátorios, começaremos
    	 * com as datas e o salário.
    	 */
    	
    	this.dataEntrada = dt.capData((view.getjFormattedTextField1().getText()));
    	this.dataSaida = dt.capData(view.getjFormattedTextField2().getText());
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
		}
    	
    	else if (validarData(dataSaida) == false){
    		System.out.println("A data de saída é inválida!");
    	} 
    	
    	else if (verificarDiferDatas(dataEntrada, dataSaida) == false) {
    		System.out.println(dataSaida);
			System.out.println("A data de saída é inferior a data de entrada!");
			
		}
    	
    	else if (validarSalario(this.salarioInformado) == false){
    		System.out.println("O valor informado como salário é inválido!");
    		
    	} 
    	
    	else if (validarFgts(this.saldoFgts) == false) {
			System.out.println("O saldo informado como fgts é inválido!");
			
		} else {
			
//			System.out.println("Os dados fornecidos até o aqui estão corretos");

//			Programa continuará sua execução			    
			
			
			this.motivoSaida = (String) this.view.getjComboBox1().getSelectedItem();
			
/*			 Bloco referente ao último sálario.*/
			this.diastrabUltMes = dia.calcDiasTrabUltimoMes(dataSaida);
	    	this.salarioFinal =	this.slr.calcUltSal(this.diastrabUltMes, this.salarioInformado);
	    	
/*	    	Bloco referente ao Décimo terceiro salário*/
	    	this.mesesDecimo = mes.calcMesesTrabUltimoAno(dataEntrada, dataSaida);
	    	this.decimoTerceiro = this.slr.calcDecimo(this.mesesDecimo, this.salarioInformado);
	    	
/*	    	Bloco referente as Férias								*/
	    	this.mesesAqFerias = mes.calcMesesAqFerias(dataEntrada, dataSaida);
	    	this.valorFerias = fr.calcValorFerias(salarioInformado, mesesAqFerias);
			this.valorTercoFerias = fr.calcTercoFerias(valorFerias);
						
			if (view.getjRadioButton1().isSelected()) {
				this.valorFeriasVencidas = salarioInformado;
				this.valorTercoFeriasVencidas = fr.calcTercoFerias(valorFeriasVencidas);
				this.qtdFeriasVencidas = 1;
			} else {
				this.valorFeriasVencidas = new BigDecimal("0");
				this.valorTercoFeriasVencidas = new BigDecimal("0");
				this.qtdFeriasVencidas = 0;
			}
			
/*			Bloco referente aos cálculos do aviso prévio.									*/
			this.diasAviso = dia.calcDiasAviso(dataEntrada, dataSaida);
			this.opAviso = (String) view.getjComboBox2().getSelectedItem();
			
			switch (opAviso) {
			case "Trabalhado":
				this.valorAviso = new BigDecimal("0");
				break;
				
			case "Indenizado pela empresa":
				this.valorAviso = ap.calcAvisoPrevio(salarioInformado, diasAviso);
				break;

			case "Descontado do funcionário":
				this.valorAviso = new BigDecimal("-1").multiply(ap.calcAvisoPrevio(salarioInformado, diasAviso));
				break;
				
			default:
				this.valorAviso = new BigDecimal("0");
				this.diasAviso = 0;
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
	    	this.totVencimentos = salarioFinal.add(decimoTerceiro).add(valorFerias).add(valorTercoFerias)
	    			.add(valorFeriasVencidas).add(valorTercoFeriasVencidas).add(valorAviso);
	    	
/*			Soma do saldo FGTS + o valor referente  há multa*/
	    	
	    	this.totSomaFGTS = saldoFgts.add(multaFGTS);
			
			mostrarResultado();
		}
    	
    } 
    
//	--------------------------------------------------------------- //  
    	
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
		if ( valor.compareTo(new BigDecimal("449") ) < 0){
			
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
    	  
    private void opDemissao(){
    	
    	this.diasAviso = 30;
    	this.recebereiFgts = "Não";
    	this.multaFGTS = new BigDecimal("0");
    	
    	
    }
    
    private void opFimContrato(){
    	this.diasAviso = 0;
    	this.recebereiFgts ="Sim";
    	this.multaFGTS = new BigDecimal("0");
    	
    }

    private void opSemJustaCau(){
    	
    	this.recebereiFgts = "Sim";
    	this.multaFGTS = fgts.calcMulta(saldoFgts);
    	
    }

    private void opPorJustaCau(){
    	
    	this.recebereiFgts = "Não";
    	
    	int totDiasTrab = dia.calcTotDiasTrab(dataEntrada, dataSaida);
    	    	
    	if (totDiasTrab < 365) {
        	this.decimoTerceiro = new BigDecimal("0");
        	this.valorFerias = new BigDecimal("0");
        	this.valorTercoFerias = new BigDecimal("0");
		} 
    	
    	this.multaFGTS = new BigDecimal("0");
    	
    }

    private void opFalecimento(){
    	opFimContrato();
    }
    
    private void mostrarResultado(){
    	
    	System.out.println();
    	System.out.println("\t\t********************************** RESCISÃO **********************************"); //Cabeçario
    	System.out.println();
    	
    	System.out.println("Item \t\t\t\t\t\t\tReferência\t\t\t\t\t Valor");
    	System.out.println();
    	System.out.println("Saldo salário:\t\t\t\t\t\t " + this.diastrabUltMes + "/30\t\t\t\t\t\t R$ " + this.salarioFinal);
    	System.out.println("13º Proporcional:\t\t\t\t\t " + this.mesesDecimo + "/12\t\t\t\t\t\t R$ " + this.decimoTerceiro);
    	System.out.println("Férias Proporcional:\t\t\t\t\t " + this.mesesAqFerias + "/12\t\t\t\t\t\t R$ " + this.valorFerias);
    	System.out.println("1/3 Férias Proporcional:\t\t\t\t  " + " - " + "\t\t\t\t\t\t R$ " + this.valorTercoFerias);
    	System.out.println("Férias vencidas:\t\t\t\t\t   " + this.qtdFeriasVencidas + "\t\t\t\t\t\t R$ " + this.valorFeriasVencidas);
    	System.out.println("1/3 Férias vencidas:\t\t\t\t\t  " + " - " + "\t\t\t\t\t\t R$ " + this.valorTercoFeriasVencidas);
    	System.out.println("Aviso prévio:\t\t\t\t\t\t   " + this.diasAviso + "\t\t\t\t\t\t R$ " + this.valorAviso);
    	System.out.println("Valor total:\t\t\t\t\t\t\t\t\t\t\t\t R$ " + this.totVencimentos);
    			
    	System.out.println("\n");
    	System.out.println("\t\t:::::::::::::::::::::::::::::::::::: FGTS ::::::::::::::::::::::::::::::::::::"); //Cabeçario
    	System.out.println();
    	
    	System.out.println("Valores referentes ao FGTS estarão disponíveis para saque?\t\t\t\t\t\t " + this.recebereiFgts);
    	System.out.println("Saldo do FGTS:\t\t\t\t\t\t\t\t\t\t\t\t R$ " + this.saldoFgts);
    	System.out.println("Multa de 40%:\t\t\t\t\t\t\t\t\t\t\t\t R$ " + this.multaFGTS);
    	System.out.println("Valor total:\t\t\t\t\t\t\t\t\t\t\t\t R$ " + this.totSomaFGTS);
    }

}
