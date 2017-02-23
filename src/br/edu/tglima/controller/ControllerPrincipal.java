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
 * 
 * @author tglima Thiago Lima de Sousa
 *
 */

public class ControllerPrincipal  {
	
//	Classes
	private FramePrincipal view;
	private Data data = new Data();
	private Dia dia = new Dia();
	private Mes mes = new Mes();
	private Salario salario = new Salario();
	private Ferias ferias = new Ferias();
	private AvisoPrevio aviso = new AvisoPrevio();
	private Fgts fgts = new Fgts();

	
//	Atributos		
	private LocalDate dataEntrada;
	private LocalDate dataSaida;
	private int totDiasTrab;
//	private BigDecimal salario;
//	private BigDecimal valorAviso;
	
	public int getTotDiasTrab() {
		return totDiasTrab;
	}


	public void setTotDiasTrab(int totDiasTrab) {
		this.totDiasTrab = totDiasTrab;
	}


	/* Métodos Getters e Setters desta classe.*/
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


	
 	public ControllerPrincipal(FramePrincipal framePrincipal) {
		this.view = framePrincipal;
		
        //Definindo os listeners para os botoes dessa view.
		
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
                voltarParaTelaInicial(e);
            }
        });
		this.view.getjButton3().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                voltarParaTelaInicial(e);
            }
        });
		this.view.getjButton4().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                voltarParaTelaInicial(e);
            }
        });
		this.view.getjButton5().addActionListener(new ActionListener() {
            @Override
			public void actionPerformed(ActionEvent e) {
                voltarParaTelaInicial(e);
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
	
	private void jFormattedTextField3FocusLost(FocusEvent e) {
        String value = view.getjFormattedTextField3().getText();
        value = value.replace(" ", "").replace(".", "").replace(",", ".");
        Locale ptBr = new Locale("pt", "BR");
        
        try {
        	
            NumberFormat nf = NumberFormat.getCurrencyInstance(ptBr);
            BigDecimal valor = new BigDecimal(value);
            String valorFormatado = nf.format(valor);
//            System.out.println(valorFormatado);
            view.getjFormattedTextField3().setText(valorFormatado);
			
		} catch (Exception e2) {
//			
		}
        
        
        

	}
	
    private void jFormattedTextField4FocusLost(FocusEvent e) {                                               
        String value = view.getjFormattedTextField4().getText();
        value = value.replace(" ", "").replace(".", "").replace(",", ".");
        Locale ptBr = new Locale("pt", "BR");
        NumberFormat nf = NumberFormat.getCurrencyInstance(ptBr);
        BigDecimal valor = new BigDecimal(value);
        String valorFormatado = nf.format(valor);
        System.out.println(valorFormatado);

        view.getjFormattedTextField4().setText(valorFormatado);
    } 
	
    private void voltarParaTelaInicial(ActionEvent e) {                                         
        //Volta para a tela inicial do programa
        CardLayout cl = (CardLayout) view.getjPanel1().getLayout();
        cl.show(view.getjPanel1(), "card1");
    } 

    private void jButton1ActionPerformed(ActionEvent e) {                                         
//    Aqui vem a implementação do botão calcular
    	System.out.println("Botão calcular foi pressionado");
    	
    	/*
    	 * Primeiro vamos obter os dados obrigátorios, começaremos
    	 * com as datas e o salário.
    	 */
    	this.setDataEntrada(capturarData(view.getjFormattedTextField1().getText()));
    	this.setDataSaida(capturarData(view.getjFormattedTextField2().getText()));
    	this.setTotDiasTrab(dia.calcTotDiasTrab(this.getDataEntrada(), this.getDataSaida() ) );
    	this.salario.setValor(convertToBD(view.getjFormattedTextField3().getText()));
    	
    	
    	if (validarDatas(this.getDataEntrada(), this.getDataSaida()) && validarValor(this.salario.getValor()) ) {
        	System.out.println("Total de dias trabalhados = " + this.getTotDiasTrab());
        	System.out.println("O sálario informado foi: " + this.salario.getValor());
        	
        	
        	
		} else {
			System.out.println("Algo deu errado, usuário deve corrigir o problema.");
			
			if (validarValor(this.salario.getValor()) == false) {
				System.out.println("O valor informado como sálario foi inválido. \n" + this.salario.getValor());
			}
		}
    	
    	

    	

    	
//    	calcOpFimContrato();
    	calcOpPedidoDemissao();
    	
    }  

    
    
    
    
    private LocalDate capturarData(String s){
    	return this.data.convertToDate(s);
    }
    
    private boolean validarDatas(LocalDate dateInicio, LocalDate dateFim){
    	if (dateInicio == null || dateFim == null) {
			return false;
		}
    	
    	else if (this.getTotDiasTrab() <= 0) {
    		return false;
		}
    	
    	else {
    		
        	return true;
    	}
 
    }
	
	private BigDecimal convertToBD(String s){
		return this.salario.capturarValor(s);
	}
	
	private boolean validarValor(BigDecimal valor){
		
		if ( valor.compareTo(new BigDecimal("449") ) < 0){
			System.out.println(valor);
			return false;
			
		}else {
			
			return true;

		}
		
	}
	
	private void calcOpFimContrato(){
		
		/*Calcula e define o valor do último sálario que o funcionário vai receber. */
		this.salario.setSalPropocional(this.salario.calcSalPropor(this.dia.calcDiasTrabUltimoMes(this.getDataSaida())));

		/* Calcula e define o valor do decimo terceiro*/
		this.salario.setDecimo(this.salario.calcDecimo(this.mes.calcMesesTrabUltimoAno(this.getDataEntrada(), this.getDataSaida())));

		/*Calcula e define o valor referente as férias */
		this.ferias.setValor(this.ferias.calcValorFerias(this.salario.getValor(), 
				this.mes.calcMesesAqFerias(this.getDataEntrada(), this.getDataSaida())));
		
		/*Cálcula e define o valor referente ao terço das férias */
		this.ferias.setTercoFerias(this.ferias.calcTercoFerias(this.ferias.getValor()));
		
		/*Calcula e define o valor referente ao FGTS */
		this.fgts.setValor(this.fgts.calcSaldoFgts(this.salario.getValor(), this.getTotDiasTrab()));

		/*Define o valor da multa de 40% do FGTS */
		this.fgts.setMulta(new BigDecimal("0"));
		
		
	}
	
	private void calcOpDemissaoJustaCausa(){
		
		/*Calcula e define o valor do último sálario que o funcionário vai receber. */
		this.salario.setSalPropocional(this.salario.calcSalPropor(this.dia.calcDiasTrabUltimoMes(this.getDataSaida())));
		
		/* Define o valor do decimo terceiro*/
		this.salario.setDecimo(new BigDecimal("0"));
		
		/*Calcula e define o valor referente as férias */
		this.ferias.setValor(new BigDecimal("0"));
		
		/*Cálcula e define o valor referente ao terço das férias */
		this.ferias.setTercoFerias(new BigDecimal("0"));
				
		/*Define o valor referente ao FGTS */
		this.fgts.setValor(new BigDecimal("0"));
		
		/*Define o valor da multa de 40% do FGTS */
		this.fgts.setMulta(new BigDecimal("0"));
		
	}

	private void calcOpPedidoDemissao(){
		
		/*Calcula e define o valor do último sálario que o funcionário vai receber. */
		this.salario.setSalPropocional(this.salario.calcSalPropor(this.dia.calcDiasTrabUltimoMes(this.getDataSaida())));

		/* Calcula e define o valor do decimo terceiro*/
		this.salario.setDecimo(this.salario.calcDecimo(this.mes.calcMesesTrabUltimoAno(this.getDataEntrada(), this.getDataSaida())));

		/*Calcula e define o valor referente as férias */
		this.ferias.setValor(this.ferias.calcValorFerias(this.salario.getValor(), 
				this.mes.calcMesesAqFerias(this.getDataEntrada(), this.getDataSaida())));
		
		/*Cálcula e define o valor referente ao terço das férias */
		this.ferias.setTercoFerias(this.ferias.calcTercoFerias(this.ferias.getValor()));
		
		/*Calcula e define o valor referente ao FGTS */
		this.fgts.setValor(this.fgts.calcSaldoFgts(this.salario.getValor(), this.getTotDiasTrab()));

		/*Define o valor da multa de 40% do FGTS */
		this.fgts.setMulta(new BigDecimal("0"));
		
		/*Calcula o valor do aviso prévio e carrego ele em uma variável local*/
		BigDecimal valorAviso =	this.aviso.calcAvisoPrevio(this.salario.getValor(), 30);
		
		
		String opAviso = (String) this.view.getjComboBox2().getSelectedItem();
		
		System.out.println("O funcionário cumprirá seu aviso prévio:" +opAviso);
		

		if (opAviso.equals("Trabalhado")) {
			this.aviso.setValor(new BigDecimal("0"));
		}
		else if (opAviso.equals("Indenizado pela empresa")) {	
			this.aviso.setValor(valorAviso);

		}else {
			this.aviso.setValor(valorAviso.multiply(new BigDecimal("-1")));
		}
		
		
		
		/* Exemplo de saída de dados */
		System.out.println("Ultimo sálario do funcionário: " + this.salario.getSalPropocional());
		System.out.println("Décimo terceiro do funcionário: " + this.salario.getDecimo());
		System.out.println("Valor correspondente as férias: " + this.ferias.getValor());
		System.out.println("Valor correspondente ao terço das férias: " + this.ferias.getTercoFerias());
		System.out.println("Valor correspondente ao aviso prévio: " +  this.aviso.getValor());
		System.out.println("Valor correspondente ao FGTS: " + this.fgts.getValor()); 
		System.out.println("Valor correspondente há multa de 40% do FGTS: " + this.fgts.getMulta());
		
		
		
		
		
		
		
	}
	


}
