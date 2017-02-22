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
import java.util.Locale;


import br.edu.tglima.view.FramePrincipal;


/**
 * 
 * @author tglima Thiago Lima de Sousa
 *
 */

public class ControllerPrincipal  {
	
	private FramePrincipal view;
	
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
        NumberFormat nf = NumberFormat.getCurrencyInstance(ptBr);
        BigDecimal valor = new BigDecimal(value);
        String valorFormatado = nf.format(valor);
        System.out.println(valorFormatado);
        view.getjFormattedTextField3().setText(valorFormatado);
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
    }  
    
    

	
	
	


}
