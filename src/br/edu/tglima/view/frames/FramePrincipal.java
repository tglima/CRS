package br.edu.tglima.view.frames;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.text.ParseException;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

@SuppressWarnings("serial")
// Jframe Create in 2017-03-07 Version 0.5
public class FramePrincipal extends JFrame {

	public FramePrincipal() {
		iniciarComponentes();
	}

	// Getter e Setters da Classe
	
	public JTable getjTable1() {
		return jTable1;
	}

	public void setjTable1(JTable jTable1) {
		this.jTable1 = jTable1;
	}

	public JTable getjTable2() {
		return jTable2;
	}

	public void setjTable2(JTable jTable2) {
		this.jTable2 = jTable2;
	}
	
	public ButtonGroup getButtonGroupFGTS() {
		return ButtonGroupFGTS;
	}

	public ButtonGroup getButtonGroupFerias() {
		return ButtonGroupFerias;
	}

	public JPanel getCard01Principal() {
		return card01Principal;
	}

	public JPanel getCard02Resultado() {
		return card02Resultado;
	}

	public JPanel getCard03Termos() {
		return Card03Termos;
	}

	public JPanel getCard04Limitacoes() {
		return Card04Limitacoes;
	}

	public JButton getjButton1() {
		return jButton1;
	}

	public JButton getjButton2() {
		return jButton2;
	}

	public JButton getjButton3() {
		return jButton3;
	}

	public JButton getjButton4() {
		return jButton4;
	}

	public JButton getjButton5() {
		return jButton5;
	}

	public JComboBox<String> getjComboBox1() {
		return jComboBox1;
	}

	public JComboBox<String> getjComboBox2() {
		return jComboBox2;
	}

	public JFormattedTextField getjFormattedTextField1() {
		return jFormattedTextField1;
	}

	public JFormattedTextField getjFormattedTextField2() {
		return jFormattedTextField2;
	}

	public JFormattedTextField getjFormattedTextField3() {
		return jFormattedTextField3;
	}

	public JFormattedTextField getjFormattedTextField4() {
		return jFormattedTextField4;
	}

	public JLabel getjLabel1() {
		return jLabel1;
	}

	public JLabel getjLabel2() {
		return jLabel2;
	}

	public JLabel getjLabel3() {
		return jLabel3;
	}

	public JLabel getjLabel4() {
		return jLabel4;
	}

	public JLabel getjLabel5() {
		return jLabel5;
	}

	public JLabel getjLabel6() {
		return jLabel6;
	}

	public JLabel getjLabel7() {
		return jLabel7;
	}

	public JLabel getjLabel8() {
		return jLabel8;
	}

	public JLabel getjLabel9() {
		return jLabel9;
	}

	public JLabel getjLabel10() {
		return jLabel10;
	}

	public JLabel getjLabel11() {
		return jLabel11;
	}

	public JLabel getjLabel12() {
		return jLabel12;
	}

	public JMenu getjMenu1() {
		return jMenu1;
	}

	public JMenuBar getjMenuBar1() {
		return jMenuBar1;
	}

	public JMenuItem getjMenuItem1() {
		return jMenuItem1;
	}

	public JMenuItem getjMenuItem2() {
		return jMenuItem2;
	}

	public JMenuItem getjMenuItem3() {
		return jMenuItem3;
	}

	public JPanel getjPanel1() {
		return jPanel1;
	}

	public JRadioButton getjRadioButton1() {
		return jRadioButton1;
	}

	public JRadioButton getjRadioButton2() {
		return jRadioButton2;
	}

	public JRadioButton getjRadioButton3() {
		return jRadioButton3;
	}

	public JRadioButton getjRadioButton4() {
		return jRadioButton4;
	}

	public JScrollPane getjScrollPane1() {
		return jScrollPane1;
	}

	public JScrollPane getjScrollPane2() {
		return jScrollPane2;
	}

	public JScrollPane getjScrollPane3() {
		return jScrollPane3;
	}

	public JScrollPane getjScrollPane4() {
		return jScrollPane4;
	}

	public JPopupMenu.Separator getjSeparator1() {
		return jSeparator1;
	}

	public JTextPane getjTextPane1() {
		return jTextPane1;
	}

	public JTextPane getjTextPane2() {
		return jTextPane2;
	}

	private void iniciarComponentes() {

        jPanel1		= 	new JPanel();
        jMenuBar1 	= 	new JMenuBar();
        jMenu1 		= 	new JMenu();
        jMenuItem1 	= 	new JMenuItem();
        jMenuItem2 	= 	new JMenuItem();
        jSeparator1 = 	new JPopupMenu.Separator();
        jMenuItem3 	= 	new JMenuItem();

        
        card01Principal 		= 	new JPanel();
        jLabel1 				= 	new JLabel();
        jFormattedTextField1 	= 	new JFormattedTextField();
        jLabel2 				= 	new JLabel();
        jFormattedTextField2 	= 	new JFormattedTextField();
        jLabel3 				= 	new JLabel();
        jFormattedTextField3 	= 	new JFormattedTextField();
        jLabel4 				= 	new JLabel();
        jFormattedTextField4 	= 	new JFormattedTextField();

        
        ButtonGroupFerias 	= 	new ButtonGroup();
        ButtonGroupFGTS 	= 	new ButtonGroup();
        jRadioButton1 		= 	new JRadioButton();
        jRadioButton2 		= 	new JRadioButton();
        jRadioButton3 		= 	new JRadioButton();
        jRadioButton4 		= 	new JRadioButton();
        
        
        jLabel5 	= 	new JLabel();
        jLabel6 	= 	new JLabel();
        jLabel7 	= 	new JLabel();
        jLabel8 	= 	new JLabel();
        jLabel9 	= 	new JLabel();
        
        
        jComboBox1 	= 	new JComboBox<>();
        jComboBox2 	= 	new JComboBox<>();
        jButton1 	= 	new JButton();
        
        
        card02Resultado 	= 	new JPanel();
        jScrollPane1 		= 	new JScrollPane();
        jTable1 			= 	new JTable();
        jLabel10 			= 	new JLabel();
        jScrollPane2 		= 	new JScrollPane();
        jTable2 			= 	new JTable();
        jButton2 			= 	new JButton();
        jButton3 			= 	new JButton();
        
        
        Card03Termos 	= 	new JPanel();
        jScrollPane3 	= 	new JScrollPane();
        jTextPane1	 	= 	new JTextPane();
        jLabel11		= 	new JLabel();
        jButton5 		= 	new JButton();
        
        Card04Limitacoes 	= 	new JPanel();
        jLabel12 			= 	new JLabel();
        jScrollPane4 		= 	new JScrollPane();
        jTextPane2 			= 	new JTextPane();
        jButton4 			= 	new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cálculos Rescisórios");
        setName("FramePrincipal"); 
        setPreferredSize(new java.awt.Dimension(525, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(525, 600));

        jPanel1.setPreferredSize(new Dimension(525, 600));
        jPanel1.setLayout(new CardLayout());

        card01Principal.setPreferredSize(new Dimension(525, 600));

        jLabel1.setText("Data de admissão:");

        try {
            jFormattedTextField1.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##/##/####")));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        
        jFormattedTextField1.setHorizontalAlignment(SwingConstants.CENTER);
        jFormattedTextField1.setPreferredSize(new Dimension(100, 19));

        jLabel2.setText("Data de saída:");

        try {
            jFormattedTextField2.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        
        jFormattedTextField2.setHorizontalAlignment(SwingConstants.CENTER);
        jFormattedTextField2.setPreferredSize(new Dimension(100, 19));

        jLabel3.setText("Salário Bruto:");

        jFormattedTextField3.setHorizontalAlignment(SwingConstants.CENTER);

        jLabel4.setText("Possui férias vencidas?");

        ButtonGroupFerias.add(jRadioButton1);
        jRadioButton1.setText("Sim");

        ButtonGroupFerias.add(jRadioButton2);
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Não");

        jLabel5.setText("Informe o motivo da saída:");

        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "Pedido de demissão", "Fim do Contrato de Trabalho", "Demissão sem justa causa", "Demissão por Justa Causa", "Falecimento" }));

        jLabel6.setText("Como foi o aviso prévio?");

        jComboBox2.setModel(new DefaultComboBoxModel<>(new String[] { "Trabalhado", "Indenizado pela empresa", "Descontado do funcionário" }));

        jLabel7.setText("Conhece o saldo do FGTS?");

        ButtonGroupFGTS.add(jRadioButton3);
        jRadioButton3.setText("Sim");

        ButtonGroupFGTS.add(jRadioButton4);
        jRadioButton4.setSelected(true);
        jRadioButton4.setText("Não");

        jLabel8.setText("Informe o saldo:");

        jFormattedTextField4.setHorizontalAlignment(SwingConstants.CENTER);
        jFormattedTextField4.setEnabled(false);

        jButton1.setText("Calcular");

        
        GroupLayout card01PrincipalLayout = new GroupLayout(card01Principal);
        card01Principal.setLayout(card01PrincipalLayout);
        card01PrincipalLayout.setHorizontalGroup(
            card01PrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(card01PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(card01PrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, card01PrincipalLayout.createSequentialGroup()
                        .addGroup(card01PrincipalLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(GroupLayout.Alignment.LEADING, card01PrincipalLayout.createSequentialGroup()
                                .addGroup(card01PrincipalLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(card01PrincipalLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jFormattedTextField3, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(card01PrincipalLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jFormattedTextField1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFormattedTextField2, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                            .addGroup(card01PrincipalLayout.createSequentialGroup()
                                .addGroup(card01PrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(23, 23, 23)
                                .addGroup(card01PrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(card01PrincipalLayout.createSequentialGroup()
                                        .addComponent(jRadioButton3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton4))
                                    .addComponent(jComboBox2, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(GroupLayout.Alignment.LEADING, card01PrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(card01PrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(card01PrincipalLayout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jComboBox1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(card01PrincipalLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jFormattedTextField4, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                .addGap(218, 218, 218)))
                        .addGap(64, 64, 64))
                    .addGroup(card01PrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(card01PrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(GroupLayout.Alignment.TRAILING, card01PrincipalLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        card01PrincipalLayout.setVerticalGroup(
            card01PrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(card01PrincipalLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(card01PrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jFormattedTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jFormattedTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(card01PrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(card01PrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(39, 39, 39)
                .addGroup(card01PrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(card01PrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(card01PrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(39, 39, 39)
                .addGroup(card01PrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jFormattedTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(card01Principal, "card1");

        card02Resultado.setPreferredSize(new Dimension(525, 600));

        jLabel9.setFont(new Font("Dialog", 1, 36)); 
        jLabel9.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel9.setText("Rescisão");
        
        jTable1.setAutoResizeMode( JTable.AUTO_RESIZE_OFF);
        jTable1.setAutoscrolls(false);
        jTable1.setRowHeight(20);
        jTable1.setRowSelectionAllowed(false);
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        

        jLabel10.setFont(new Font("Dialog", 1, 36)); 
        jLabel10.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel10.setText("FGTS");
        
        jTable2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable2.setRowHeight(20);
        jTable2.setRowSelectionAllowed(false);
        jTable2.setTableHeader(null);
        jTable2.setUpdateSelectionOnSort(false);
        jTable2.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(jTable2);
        
     
        jButton2.setText("Voltar");
        jButton3.setText("Salvar");

        GroupLayout card02ResultadoLayout = new GroupLayout(card02Resultado);
        card02Resultado.setLayout(card02ResultadoLayout);
        card02ResultadoLayout.setHorizontalGroup(
            card02ResultadoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(card02ResultadoLayout.createSequentialGroup()
                .addGroup(card02ResultadoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(card02ResultadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(card02ResultadoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 488, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(card02ResultadoLayout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel9)))
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(card02ResultadoLayout.createSequentialGroup()
                .addGroup(card02ResultadoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(card02ResultadoLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jButton2)
                        .addGap(61, 61, 61)
                        .addComponent(jButton3))
                    .addGroup(card02ResultadoLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel10)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        card02ResultadoLayout.setVerticalGroup(
            card02ResultadoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(card02ResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(card02ResultadoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(card02Resultado, "card2");

        Card03Termos.setPreferredSize(new java.awt.Dimension(525, 600));
        jTextPane1.setEditable(false);
        jScrollPane3.setViewportView(jTextPane1);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel11.setText("Termos de uso");

        jButton5.setText("Voltar");

        GroupLayout Card03TermosLayout = new GroupLayout(Card03Termos);
        Card03Termos.setLayout(Card03TermosLayout);

        Card03TermosLayout.setHorizontalGroup(Card03TermosLayout
        		.createParallelGroup(GroupLayout.Alignment.LEADING)
        		.addGroup(Card03TermosLayout.createSequentialGroup().addGroup(Card03TermosLayout
        				.createParallelGroup(GroupLayout.Alignment.LEADING)
        				.addGroup(
        						Card03TermosLayout.createSequentialGroup().addGap(222, 222, 222).addComponent(jButton5))
        				.addGroup(Card03TermosLayout.createSequentialGroup().addContainerGap().addComponent(
        						jScrollPane3, GroupLayout.PREFERRED_SIZE, 495,
        						GroupLayout.PREFERRED_SIZE))
        				.addGroup(Card03TermosLayout.createSequentialGroup().addGap(120, 120, 120)
        						.addComponent(jLabel11)))
        				.addContainerGap(93, Short.MAX_VALUE)));

        Card03TermosLayout
        .setVerticalGroup(Card03TermosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
        		.addGroup(Card03TermosLayout.createSequentialGroup().addContainerGap().addComponent(jLabel11)
        				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
        						GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 420,
        						GroupLayout.PREFERRED_SIZE)
        				.addGap(18, 18, 18).addComponent(jButton5).addGap(30, 30, 30))

        		);

        jPanel1.add(Card03Termos, "card3");

        jTextPane2.setEditable(false);
        jScrollPane4.setViewportView(jTextPane2);

        jButton4.setText("Voltar");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 36));
        jLabel12.setText("Limitações");

        GroupLayout Card04LimitacoesLayout = new GroupLayout(Card04Limitacoes);
        Card04Limitacoes.setLayout(Card04LimitacoesLayout);
        
        Card04LimitacoesLayout.setHorizontalGroup(
        	Card04LimitacoesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
        	.addGroup(Card04LimitacoesLayout.createSequentialGroup()            		
        	.addGroup(Card04LimitacoesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(Card04LimitacoesLayout.createSequentialGroup()
            .addGap(222, 222, 222)
            .addComponent(jButton4))
            .addGroup(Card04LimitacoesLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 495, GroupLayout.PREFERRED_SIZE))
            .addGroup(Card04LimitacoesLayout.createSequentialGroup()
            .addGap(144, 144, 144)
            .addComponent(jLabel12)))
        	.addContainerGap(93, Short.MAX_VALUE))
        	);
                    
                    
                    
                    
        Card04LimitacoesLayout.setVerticalGroup(
            Card04LimitacoesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(Card04LimitacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, GroupLayout.PREFERRED_SIZE, 420, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(30, 30, 30))
        );

        jPanel1.add(Card04Limitacoes, "card4");

        jMenu1.setText("Ajuda");

        jMenuItem1.setText("Limitações");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Termos de uso");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem3.setText("Sobre");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            @Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
//                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 525, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
        setLocationRelativeTo(null);
    }
	
	
	
	
//	Start of variables declaration 


	private ButtonGroup ButtonGroupFGTS;
	private ButtonGroup ButtonGroupFerias;
	private JPanel card01Principal;
	private JPanel card02Resultado;
	private JPanel Card03Termos;
	private JPanel Card04Limitacoes;
	private JButton jButton1;
	private JButton jButton2;
	private JButton jButton3;
	private JButton jButton4;
	private JButton jButton5;
	private JComboBox<String> jComboBox1;
	private JComboBox<String> jComboBox2;
	private JFormattedTextField jFormattedTextField1;
	private JFormattedTextField jFormattedTextField2;
	private JFormattedTextField jFormattedTextField3;
	private JFormattedTextField jFormattedTextField4;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jLabel6;
	private JLabel jLabel7;
	private JLabel jLabel8;
	private JLabel jLabel9;
	private JLabel jLabel10;
	private JLabel jLabel11;
	private JLabel jLabel12;
	private JMenu jMenu1;
	private JMenuBar jMenuBar1;
	private JMenuItem jMenuItem1;
	private JMenuItem jMenuItem2;
	private JMenuItem jMenuItem3;
	private JPanel jPanel1;
	private JRadioButton jRadioButton1;
	private JRadioButton jRadioButton2;
	private JRadioButton jRadioButton3;
	private JRadioButton jRadioButton4;
	private JScrollPane jScrollPane1;
	private JScrollPane jScrollPane2;
	private JScrollPane jScrollPane3;
	private JScrollPane jScrollPane4;
	private JPopupMenu.Separator jSeparator1;
	private JTable jTable1;
	private JTable jTable2;
	private JTextPane jTextPane1;
	private JTextPane jTextPane2;
	// End of variables declaration
}
