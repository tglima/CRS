package br.edu.tglima.view;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
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
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

// Last edition. 2017-03-28

@SuppressWarnings("serial")
public class FramePrincipal extends JFrame {


	
	public FramePrincipal() {
		iniciarComponentes();
	}

	// Getter e Setters da Classe
	
	public JTable getTblRescisao() {
		return tblRescisao;
	}

	public JTable getTblFGTS() {
		return tblFGTS;
	}
	
	public JButton getBtnCalcular() {
		return btnCalcular;
	}

	public JButton getBtnVoltar1() {
		return btnVoltar1;
	}

	public JButton getBtnVoltar2() {
		return btnVoltar2;
	}

	public JButton getBtnVoltar3() {
		return btnVoltar3;
	}

	public JButton getBtnExportar() {
		return btnExportar;
	}
	
	public JComboBox<String> getComboMotivoSaida() {
		return comboMotivoSaida;
	}

	public JComboBox<String> getComboAvisoPrevio() {
		return comboAvisoPrevio;
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

	public JLabel getjLabel4() {
		return jLabel4;
	}

	public JLabel getjLabel6() {
		return jLabel6;
	}

	public JLabel getjLabel8() {
		return jLabel8;
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

	public JPanel getCard01Principal() {
		return card01Principal;
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

        
        btGroupFerias 	= 	new ButtonGroup();
        btGroupFGTS 	= 	new ButtonGroup();
        jRadioButton1 		= 	new JRadioButton();
        jRadioButton2 		= 	new JRadioButton();
        jRadioButton3 		= 	new JRadioButton();
        jRadioButton4 		= 	new JRadioButton();
        
        
        jLabel5 	= 	new JLabel();
        jLabel6 	= 	new JLabel();
        jLabel7 	= 	new JLabel();
        jLabel8 	= 	new JLabel();
        jLabel9 	= 	new JLabel();
        
        
        comboMotivoSaida 	= 	new JComboBox<>();
        comboAvisoPrevio 	= 	new JComboBox<>();
        btnCalcular 	= 	new JButton();
        
        
        card02Resultado 	= 	new JPanel();
        jScrollPane1 		= 	new JScrollPane();
        tblRescisao 			= 	new JTable();
        jLabel10 			= 	new JLabel();
        jScrollPane2 		= 	new JScrollPane();
        tblFGTS 			= 	new JTable();
        btnVoltar1 			= 	new JButton();
        btnExportar 			= 	new JButton();
        
        
        Card03Termos 	= 	new JPanel();
        jScrollPane3 	= 	new JScrollPane();
        jTextPane1	 	= 	new JTextPane();
        jLabel11		= 	new JLabel();
        btnVoltar3 		= 	new JButton();
        
        Card04Limitacoes 	= 	new JPanel();
        jLabel12 			= 	new JLabel();
        jScrollPane4 		= 	new JScrollPane();
        jTextPane2 			= 	new JTextPane();
        btnVoltar2 			= 	new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cálculos Rescisórios");
        setName("FramePrincipal"); 
        setPreferredSize(new java.awt.Dimension(525, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(525, 600));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource
        		("/br/edu/tglima/view/calc-icon.png")));

        jPanel1.setPreferredSize(new Dimension(525, 600));
        jPanel1.setLayout(new CardLayout());

        card01Principal.setPreferredSize(new Dimension(525, 600));

        jLabel1.setText("Data de Entrada:");

        try {
            jFormattedTextField1.setFormatterFactory(new DefaultFormatterFactory
            		(new MaskFormatter("##/##/####")));
            
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        
        jFormattedTextField1.setHorizontalAlignment(SwingConstants.CENTER);
        jFormattedTextField1.setPreferredSize(new Dimension(100, 19));

        jLabel2.setText("Data de Saída:");

        try {
            jFormattedTextField2.setFormatterFactory(new DefaultFormatterFactory
            		(new MaskFormatter("##/##/####")));
            
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        
        jFormattedTextField2.setHorizontalAlignment(SwingConstants.CENTER);
        jFormattedTextField2.setPreferredSize(new Dimension(100, 19));

        jLabel3.setText("Salário Bruto:");

        jFormattedTextField3.setHorizontalAlignment(SwingConstants.CENTER);

        jLabel4.setText("Possuí Férias Vencidas?");
        jLabel4.setEnabled(false);
        
        btGroupFerias.add(jRadioButton1);
        jRadioButton1.setText("Sim");
        jRadioButton1.setEnabled(false);
        

        btGroupFerias.add(jRadioButton2);
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Não");
        jRadioButton2.setEnabled(false);
        
        
        

        jLabel5.setText("Informe o Motivo da Saída:");

        comboMotivoSaida.setModel(new DefaultComboBoxModel<>(new String[] 
        		{ "Pedido de demissão", "Fim do Contrato de Trabalho", 
        				"Demissão sem justa causa", "Demissão por Justa Causa",
        				"Falecimento" }));

        jLabel6.setText("Tipo de Aviso Prévio:");

        comboAvisoPrevio.setModel(new DefaultComboBoxModel<>(new String[] 
        		{ "Trabalhado", "Indenizado pela empresa", 
        				"Descontado do funcionário" }));

        jLabel7.setText("Conhece o saldo do FGTS?");

        btGroupFGTS.add(jRadioButton3);
        jRadioButton3.setText("Sim");

        btGroupFGTS.add(jRadioButton4);
        jRadioButton4.setSelected(true);
        jRadioButton4.setText("Não");

        jLabel8.setText("Informe o saldo:");
        jLabel8.setEnabled(false);

        jFormattedTextField4.setHorizontalAlignment(SwingConstants.CENTER);
        jFormattedTextField4.setEnabled(false);

        btnCalcular.setText("Calcular");
        btnCalcular.setMnemonic(KeyEvent.VK_C);

        
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
                                    .addComponent(comboAvisoPrevio, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(GroupLayout.Alignment.LEADING, card01PrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(card01PrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(card01PrincipalLayout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(comboMotivoSaida, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addComponent(btnCalcular, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(comboMotivoSaida, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(card01PrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboAvisoPrevio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
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
                .addComponent(btnCalcular, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(card01Principal, "card1");

        card02Resultado.setPreferredSize(new Dimension(525, 600));

        jLabel9.setFont(new Font("Dialog", 1, 36)); 
        jLabel9.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel9.setText("Rescisão");
        
        tblRescisao.setAutoResizeMode( JTable.AUTO_RESIZE_OFF);
        tblRescisao.setAutoscrolls(false);
        tblRescisao.setRowHeight(20);
        tblRescisao.setRowSelectionAllowed(false);
        tblRescisao.getTableHeader().setResizingAllowed(false);
        tblRescisao.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblRescisao);
        

        jLabel10.setFont(new Font("Dialog", 1, 36)); 
        jLabel10.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel10.setText("FGTS");
        
        tblFGTS.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblFGTS.setRowHeight(20);
        tblFGTS.setRowSelectionAllowed(false);
        tblFGTS.setTableHeader(null);
        tblFGTS.setUpdateSelectionOnSort(false);
        tblFGTS.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(tblFGTS);
        
     
        btnVoltar1.setText("Voltar");
        btnVoltar1.setMnemonic(KeyEvent.VK_V);
        btnExportar.setText("Exportar");
        btnExportar.setMnemonic(KeyEvent.VK_E);

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
                        .addComponent(btnVoltar1)
                        .addGap(61, 61, 61)
                        .addComponent(btnExportar))
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
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(card02ResultadoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar1)
                    .addComponent(btnExportar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(card02Resultado, "card2");
        Card03Termos.setPreferredSize(new java.awt.Dimension(525, 600));

        
        
    	StyleSheet css = new StyleSheet();
    	css.addRule("h2 { margin: 0px, 0px, 0px, 0px; margin-top: 25px; padding: 0px; font-size: 1.40em;}");
    	css.addRule("body {font-family: sans serif; font-size: 1em; line-height: 1.5em;}");
    	css.addRule("strong {font-weight: bold;}");
    	css.addRule("ul {list-style-type: circle; padding: 25px;}");
    	css.addRule("li {list-style-type: circle; padding-bottom: 10px;}");
    	css.addRule("a { color:#0000FF; text-decoration: underline;}");
    	
    	HTMLEditorKit htmlEditorKit = new HTMLEditorKit();
    	htmlEditorKit.setStyleSheet(css);
        

        jTextPane1.setEditable(false);
        jTextPane1.setFont(Font.decode("UTF-8") );
        jTextPane1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 11));
        jTextPane1.setContentType("text/html; charset=UTF-8");
    	jTextPane1.setEditorKit(htmlEditorKit);
        
        try {

        	jTextPane1.setPage(FramePrincipal.class.getResource
        			("/br/edu/tglima/view/Termos.html"));
			
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
        
        
        
        jScrollPane3.setViewportView(jTextPane1);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 36));
        jLabel11.setText("Termos de uso");

        btnVoltar3.setText("Voltar");
        btnVoltar3.setMnemonic(KeyEvent.VK_V);

        GroupLayout Card03TermosLayout = new GroupLayout(Card03Termos);
        Card03Termos.setLayout(Card03TermosLayout);

        Card03TermosLayout.setHorizontalGroup(Card03TermosLayout
        		.createParallelGroup(GroupLayout.Alignment.LEADING)
        		.addGroup(Card03TermosLayout.createSequentialGroup().addGroup(Card03TermosLayout
        				.createParallelGroup(GroupLayout.Alignment.LEADING)
        				.addGroup(
        						Card03TermosLayout.createSequentialGroup().addGap(222, 222, 222).addComponent(btnVoltar3))
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
        				.addGap(18, 18, 18).addComponent(btnVoltar3).addGap(30, 30, 30))

        		);

        jPanel1.add(Card03Termos, "card3");


        jTextPane2.setEditable(false);
        jTextPane2.setFont(Font.decode("UTF-8") );
        jTextPane2.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,11));
        jTextPane2.setContentType("text/html; charset=UTF-8");
    	jTextPane2.setEditorKit(htmlEditorKit);

        
    	
    	
    	
        try {
        	jTextPane2.setPage(FramePrincipal.class.getResource
        			("/br/edu/tglima/view/Limitacoes.html"));
        	

		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());

		}
        
        jScrollPane4.setViewportView(jTextPane2);

        btnVoltar2.setText("Voltar");
        btnVoltar2.setMnemonic(KeyEvent.VK_V);

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
            .addComponent(btnVoltar2))
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
                .addComponent(btnVoltar2)
                .addGap(30, 30, 30))
        );

        jPanel1.add(Card04Limitacoes, "card4");

        jMenu1.setText("Ajuda");
        jMenu1.setMnemonic(KeyEvent.VK_A);

        jMenuItem1.setText("Limitações");
        jMenuItem1.setMnemonic(KeyEvent.VK_L);

        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Termos de uso");
        jMenuItem2.setMnemonic(KeyEvent.VK_T);
        
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuItem3.setText("Sobre");
        jMenuItem3.setMnemonic(KeyEvent.VK_S);

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
	
	private JPanel jPanel1, card01Principal, card02Resultado;
	private JPanel Card03Termos, Card04Limitacoes;

	private ButtonGroup btGroupFGTS, btGroupFerias;
	
	private JButton btnCalcular, btnVoltar1, btnExportar, btnVoltar2, btnVoltar3;                                       
	private JComboBox<String> comboMotivoSaida, comboAvisoPrevio;
	
	private JFormattedTextField jFormattedTextField1, jFormattedTextField2;
	private JFormattedTextField jFormattedTextField3, jFormattedTextField4;
	
	private JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6;
	private JLabel jLabel7, jLabel8, jLabel9, jLabel10, jLabel11, jLabel12;
	
	private JMenu jMenu1;
	private JMenuBar jMenuBar1;
	private JPopupMenu.Separator jSeparator1;
	private JMenuItem jMenuItem1, jMenuItem2, jMenuItem3;
	
	private JRadioButton jRadioButton1, jRadioButton2, jRadioButton3, jRadioButton4;
	private JScrollPane jScrollPane1, jScrollPane2, jScrollPane3, jScrollPane4;

	private JTable tblRescisao, tblFGTS;
	private JTextPane jTextPane1, jTextPane2;
	
}
