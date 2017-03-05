package br.edu.tglima.view.frames;

import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class FramePrincipal extends javax.swing.JFrame {

	public FramePrincipal() {
		iniciarComponents();
	}
	
	//Getters e Setters da Classe
	public javax.swing.ButtonGroup getButtonGroupFGTS() {
		return ButtonGroupFGTS;
	}

	public javax.swing.ButtonGroup getButtonGroupFerias() {
		return ButtonGroupFerias;
	}

	public javax.swing.JPanel getCard1Principal() {
		return card1Principal;
	}

	public javax.swing.JPanel getCard2Resultado() {
		return card2Resultado;
	}

	public javax.swing.JPanel getCard3Erro() {
		return card3Erro;
	}

	public javax.swing.JPanel getCard4Termos() {
		return card4Termos;
	}

	public javax.swing.JPanel getCard5Licenca() {
		return card5Licenca;
	}

	public javax.swing.JPanel getCard6Versao() {
		return card6Versao;
	}

	public javax.swing.JPanel getCard7Ajuda() {
		return card7Ajuda;
	}

	public javax.swing.JButton getjButton1() {
		return jButton1;
	}

	public javax.swing.JButton getjButton2() {
		return jButton2;
	}

	public javax.swing.JButton getjButton3() {
		return jButton3;
	}

	public javax.swing.JButton getjButton4() {
		return jButton4;
	}

	public javax.swing.JButton getjButton5() {
		return jButton5;
	}

	public javax.swing.JComboBox<String> getjComboBox1() {
		return jComboBox1;
	}

	public javax.swing.JComboBox<String> getjComboBox2() {
		return jComboBox2;
	}

	public javax.swing.JFormattedTextField getjFormattedTextField1() {
		return jFormattedTextField1;
	}

	public javax.swing.JFormattedTextField getjFormattedTextField2() {
		return jFormattedTextField2;
	}

	public javax.swing.JFormattedTextField getjFormattedTextField3() {
		return jFormattedTextField3;
	}

	public javax.swing.JFormattedTextField getjFormattedTextField4() {
		return jFormattedTextField4;
	}

	public javax.swing.JLabel getjLabel1() {
		return jLabel1;
	}

	public javax.swing.JLabel getjLabel2() {
		return jLabel2;
	}

	public javax.swing.JLabel getjLabel3() {
		return jLabel3;
	}

	public javax.swing.JLabel getjLabel4() {
		return jLabel4;
	}

	public javax.swing.JLabel getjLabel5() {
		return jLabel5;
	}

	public javax.swing.JLabel getjLabel6() {
		return jLabel6;
	}

	public javax.swing.JLabel getjLabel7() {
		return jLabel7;
	}

	public javax.swing.JLabel getjLabel8() {
		return jLabel8;
	}

	public javax.swing.JLabel getjLabel9() {
		return jLabel9;
	}

	public javax.swing.JMenu getjMenu1() {
		return jMenu1;
	}

	public javax.swing.JMenu getjMenu2() {
		return jMenu2;
	}

	public javax.swing.JMenuBar getjMenuBar1() {
		return jMenuBar1;
	}

	public javax.swing.JMenuItem getjMenuItem1() {
		return jMenuItem1;
	}

	public javax.swing.JMenuItem getjMenuItem2() {
		return jMenuItem2;
	}

	public javax.swing.JMenuItem getjMenuItem3() {
		return jMenuItem3;
	}

	public javax.swing.JPanel getjPanel1() {
		return jPanel1;
	}

	public javax.swing.JRadioButton getjRadioButton1() {
		return jRadioButton1;
	}

	public javax.swing.JRadioButton getjRadioButton2() {
		return jRadioButton2;
	}

	public javax.swing.JRadioButton getjRadioButton3() {
		return jRadioButton3;
	}

	public javax.swing.JRadioButton getjRadioButton4() {
		return jRadioButton4;
	}

	public javax.swing.JSpinner getjSpinner1() {
		return jSpinner1;
	}

	private void iniciarComponents() {
		
		jPanel1 = new javax.swing.JPanel();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenu2 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenuItem3 = new javax.swing.JMenuItem();
		card1Principal = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jFormattedTextField1 = new javax.swing.JFormattedTextField();
		jLabel2 = new javax.swing.JLabel();
		jFormattedTextField2 = new javax.swing.JFormattedTextField();
		jLabel3 = new javax.swing.JLabel();
		jFormattedTextField3 = new javax.swing.JFormattedTextField();
		jLabel4 = new javax.swing.JLabel();
		jFormattedTextField4 = new javax.swing.JFormattedTextField();
		
		ButtonGroupFerias = new javax.swing.ButtonGroup();
		ButtonGroupFGTS = new javax.swing.ButtonGroup();
		jRadioButton1 = new javax.swing.JRadioButton();
		jRadioButton2 = new javax.swing.JRadioButton();
		jRadioButton3 = new javax.swing.JRadioButton();
		jRadioButton4 = new javax.swing.JRadioButton();
		
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		
		jComboBox1 = new javax.swing.JComboBox<>();
		jComboBox2 = new javax.swing.JComboBox<>();
		jSpinner1 = new javax.swing.JSpinner();

		jButton1 = new javax.swing.JButton();
        
		card2Resultado = new javax.swing.JPanel();
		jButton2 = new javax.swing.JButton();
        
		card3Erro = new javax.swing.JPanel();
		jButton3 = new javax.swing.JButton();
        
		card4Termos = new javax.swing.JPanel();
		jButton4 = new javax.swing.JButton();

		
		card5Licenca = new javax.swing.JPanel();
		jButton5 = new javax.swing.JButton();
		
        card6Versao = new javax.swing.JPanel();
        card7Ajuda = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
		

        jPanel1.setLayout(new java.awt.CardLayout());

        jLabel1.setText("Data de admissão:");

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setHorizontalAlignment(SwingConstants.CENTER);
        jFormattedTextField1.setPreferredSize(new java.awt.Dimension(100, 19));

        jLabel2.setText("Data de saída:");

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField2.setHorizontalAlignment(SwingConstants.CENTER);
        jFormattedTextField2.setPreferredSize(new java.awt.Dimension(100, 19));

        jLabel3.setText("Salário bruto:");

        jFormattedTextField3.setHorizontalAlignment(SwingConstants.CENTER);

        jLabel4.setText("Possui férias vencidas?");

        ButtonGroupFerias.add(jRadioButton1);
        jRadioButton1.setText("Sim");


        ButtonGroupFerias.add(jRadioButton2);
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Não");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 3, 1));
        jSpinner1.setEnabled(false);

        jLabel5.setText("Quantas?");
        jLabel5.setEnabled(false);

        jLabel6.setText("Informe o motivo da saída:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pedido de demissão", "Fim do Contrato de Trabalho", "Demissão sem justa causa", "Demissão por Justa Causa", "Falecimento" }));

        jLabel7.setText("Como foi o aviso prévio?");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trabalhado", "Indenizado pela empresa", "Descontado do funcionário" }));

        jLabel8.setText("Conhece o saldo do seu FGTS?");

        ButtonGroupFGTS.add(jRadioButton3);
        jRadioButton3.setText("Sim");

        ButtonGroupFGTS.add(jRadioButton4);
        jRadioButton4.setSelected(true);
        jRadioButton4.setText("Não");

        jLabel9.setText("Informe seu saldo:");
        jLabel9.setEnabled(false);

        jFormattedTextField4.setHorizontalAlignment(SwingConstants.CENTER);
        jFormattedTextField4.setEnabled(false);

        jButton1.setText("Calcular");

        
        javax.swing.GroupLayout card1PrincipalLayout = new javax.swing.GroupLayout(card1Principal);
        card1Principal.setLayout(card1PrincipalLayout);
        card1PrincipalLayout.setHorizontalGroup(
            card1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card1PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(card1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(card1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(card1PrincipalLayout.createSequentialGroup()
                            .addGroup(card1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(card1PrincipalLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRadioButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jRadioButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel5))
                                .addGroup(card1PrincipalLayout.createSequentialGroup()
                                    .addGroup(card1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(card1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                        .addComponent(jFormattedTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel2)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(card1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(card1PrincipalLayout.createSequentialGroup()
                            .addGroup(card1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(card1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(card1PrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton4))
                    .addGroup(card1PrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        card1PrincipalLayout.setVerticalGroup(
            card1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card1PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(card1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(card1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(card1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel5)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(card1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(card1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(card1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(18, 18, 18)
                .addGroup(card1PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
        );

        jPanel1.add(card1Principal, "card1");

        javax.swing.GroupLayout card2ResultadoLayout = new javax.swing.GroupLayout(card2Resultado);
        card2Resultado.setLayout(card2ResultadoLayout);
        card2ResultadoLayout.setHorizontalGroup(
            card2ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );
        card2ResultadoLayout.setVerticalGroup(
            card2ResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );

        jPanel1.add(card2Resultado, "card2");

        javax.swing.GroupLayout card3ErroLayout = new javax.swing.GroupLayout(card3Erro);
        card3Erro.setLayout(card3ErroLayout);
        card3ErroLayout.setHorizontalGroup(
            card3ErroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
        );
        card3ErroLayout.setVerticalGroup(
            card3ErroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );

        jPanel1.add(card3Erro, "card3");

        jButton2.setText("Voltar ao inicio");

        javax.swing.GroupLayout card4TermosLayout = new javax.swing.GroupLayout(card4Termos);
        card4Termos.setLayout(card4TermosLayout);
        card4TermosLayout.setHorizontalGroup(
            card4TermosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card4TermosLayout.createSequentialGroup()
                .addContainerGap(198, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(198, 198, 198))
        );
        card4TermosLayout.setVerticalGroup(
            card4TermosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card4TermosLayout.createSequentialGroup()
                .addContainerGap(342, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        jPanel1.add(card4Termos, "card4");

        jButton3.setText("Voltar ao inicio");

        javax.swing.GroupLayout card5LicencaLayout = new javax.swing.GroupLayout(card5Licenca);
        card5Licenca.setLayout(card5LicencaLayout);
        card5LicencaLayout.setHorizontalGroup(
            card5LicencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card5LicencaLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jButton3)
                .addContainerGap(182, Short.MAX_VALUE))
        );
        card5LicencaLayout.setVerticalGroup(
            card5LicencaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card5LicencaLayout.createSequentialGroup()
                .addContainerGap(342, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jPanel1.add(card5Licenca, "card5");

        jButton4.setText("Voltar ao inicio");

        javax.swing.GroupLayout card6VersaoLayout = new javax.swing.GroupLayout(card6Versao);
        card6Versao.setLayout(card6VersaoLayout);
        card6VersaoLayout.setHorizontalGroup(
            card6VersaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card6VersaoLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jButton4)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        card6VersaoLayout.setVerticalGroup(
            card6VersaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card6VersaoLayout.createSequentialGroup()
                .addContainerGap(342, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        jPanel1.add(card6Versao, "card6");

        jButton5.setText("Voltar ao inicio");

        javax.swing.GroupLayout card7AjudaLayout = new javax.swing.GroupLayout(card7Ajuda);
        card7Ajuda.setLayout(card7AjudaLayout);
        card7AjudaLayout.setHorizontalGroup(
            card7AjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(card7AjudaLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jButton5)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        card7AjudaLayout.setVerticalGroup(
            card7AjudaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, card7AjudaLayout.createSequentialGroup()
                .addContainerGap(342, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        jPanel1.add(card7Ajuda, "card7");

        jMenu1.setText("Visualizar");

        jMenuItem1.setText("Termos de uso");

        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Licença");

        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Versão");

        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ajuda");
       
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }
                                                                      
//	
		
    	private javax.swing.ButtonGroup ButtonGroupFGTS;
	    private javax.swing.ButtonGroup ButtonGroupFerias;
	    private javax.swing.JPanel card1Principal;
	    private javax.swing.JPanel card2Resultado;
	    private javax.swing.JPanel card3Erro;
	    private javax.swing.JPanel card4Termos;
	    private javax.swing.JPanel card5Licenca;
	    private javax.swing.JPanel card6Versao;
	    private javax.swing.JPanel card7Ajuda;
	    private javax.swing.JButton jButton1;
	    private javax.swing.JButton jButton2;
	    private javax.swing.JButton jButton3;
	    private javax.swing.JButton jButton4;
	    private javax.swing.JButton jButton5;
	    private javax.swing.JComboBox<String> jComboBox1;
	    private javax.swing.JComboBox<String> jComboBox2;
	    private javax.swing.JFormattedTextField jFormattedTextField1;
	    private javax.swing.JFormattedTextField jFormattedTextField2;
	    private javax.swing.JFormattedTextField jFormattedTextField3;
	    private javax.swing.JFormattedTextField jFormattedTextField4;
	    private javax.swing.JLabel jLabel1;
	    private javax.swing.JLabel jLabel2;
	    private javax.swing.JLabel jLabel3;
	    private javax.swing.JLabel jLabel4;
	    private javax.swing.JLabel jLabel5;
	    private javax.swing.JLabel jLabel6;
	    private javax.swing.JLabel jLabel7;
	    private javax.swing.JLabel jLabel8;
	    private javax.swing.JLabel jLabel9;
	    private javax.swing.JMenu jMenu1;
	    private javax.swing.JMenu jMenu2;
	    private javax.swing.JMenuBar jMenuBar1;
	    private javax.swing.JMenuItem jMenuItem1;
	    private javax.swing.JMenuItem jMenuItem2;
	    private javax.swing.JMenuItem jMenuItem3;
	    private javax.swing.JPanel jPanel1;
	    private javax.swing.JRadioButton jRadioButton1;
	    private javax.swing.JRadioButton jRadioButton2;
	    private javax.swing.JRadioButton jRadioButton3;
	    private javax.swing.JRadioButton jRadioButton4;
	    private javax.swing.JSpinner jSpinner1;
	    // End of variables declaration           	
	

}
