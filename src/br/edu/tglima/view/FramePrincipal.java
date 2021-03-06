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

/**
 * @author Thiago Lima de Sousa
 * @see Classe responsável por todos os elementos visuais da janela principal
 * do programa.
 * 
 */
@SuppressWarnings("serial")
public class FramePrincipal extends JFrame {

/*	Lista de atributos 														*/	
	
	private JPanel jPanel1;
	
	private JButton btnCalcular, btnVoltar1, btnExportar, btnVoltar2, btnVoltar3;                                       
	private JComboBox<String> comboMotivoSaida, comboAvisoPrevio;
	
	private JFormattedTextField dataEntradaFmt, dataSaidaFmt;
	private JFormattedTextField salarioFmt, saldoFgtsFmt;
	
	private JLabel lblFeriasVencidas;
	private JLabel lblAvisoPrevio, lblInformeFgts; 
	
	private JMenuItem jMenuItem1, jMenuItem2, jMenuItem3;
	
	private JRadioButton jRadioButton1, jRadioButton2, jRadioButton3, jRadioButton4;

	private JTable tblRescisao, tblFGTS;
	private JTextPane jTextPane1, jTextPane2;
	
//	------------------------------------------------------------------------ //

	
/*	Getters e Setters da Classe												*/	
	
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

	public JFormattedTextField getDataEntradaFmt() {
		return dataEntradaFmt;
	}

	public JFormattedTextField getDataSaidaFmt() {
		return dataSaidaFmt;
	}

	public JFormattedTextField getSalarioFmt() {
		return salarioFmt;
	}

	public JFormattedTextField getSaldoFgtsFmt() {
		return saldoFgtsFmt;
	}

	public JLabel getLblFeriasVencidas() {
		return lblFeriasVencidas;
	}

	public JLabel getLblAvisoPrevio() {
		return lblAvisoPrevio;
	}

	public JLabel getLblInformeFgts() {
		return lblInformeFgts;
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

	public JTextPane getjTextPane1() {
		return jTextPane1;
	}

	public JTextPane getjTextPane2() {
		return jTextPane2;
	}

//	------------------------------------------------------------------------ //
	
	
/*	Método construtor da classe												*/
	
	public FramePrincipal() {
		iniciarComponentes();
	}
	
//	------------------------------------------------------------------------ //
	

/*	Método responsável por iniciar os componentes e posicioná-los			*/	
	
 	private void iniciarComponentes() {
		
        jPanel1										= 	new JPanel();
        JMenuBar jMenuBar1 							= 	new JMenuBar();
        JMenu jMenu1 								= 	new JMenu();
        jMenuItem1 									= 	new JMenuItem();
        jMenuItem2	 								= 	new JMenuItem();
        JPopupMenu.Separator jSeparator1 			= 	new JPopupMenu.Separator();
        jMenuItem3 									= 	new JMenuItem();

        
        JPanel card01Principal 						= 	new JPanel();
        JLabel lblDataEntrada 						= 	new JLabel();
        dataEntradaFmt 								= 	new JFormattedTextField();
        JLabel lblDataSaida 						= 	new JLabel();
        dataSaidaFmt 								= 	new JFormattedTextField();
        JLabel lblSalario 							= 	new JLabel();
        salarioFmt			 						= 	new JFormattedTextField();
        JLabel lblFeriasVencidas 					= 	new JLabel();
        saldoFgtsFmt 								= 	new JFormattedTextField();

        
        ButtonGroup btGroupFerias 					= 	new ButtonGroup();
        ButtonGroup btGroupFGTS 					= 	new ButtonGroup();
        jRadioButton1 								= 	new JRadioButton();
        jRadioButton2 								= 	new JRadioButton();
        jRadioButton3 								= 	new JRadioButton();
        jRadioButton4 								= 	new JRadioButton();
        
        
        JLabel lblMotivoSaida 						= 	new JLabel();
        JLabel lblAvisoPrevio 						= 	new JLabel();
        JLabel lblSaldoFgts 						= 	new JLabel();
        JLabel lblInformeFgts 						= 	new JLabel();
        JLabel lblRescisao 							= 	new JLabel();
        
        
        comboMotivoSaida 							= 	new JComboBox<>();
        comboAvisoPrevio 							= 	new JComboBox<>();
        btnCalcular 								= 	new JButton();
        
        
        JPanel card02Resultado 						= 	new JPanel();
        JScrollPane jScrollPane1 					= 	new JScrollPane();
        tblRescisao 								= 	new JTable();
        JLabel lblFgts 								= 	new JLabel();
        JScrollPane jScrollPane2 					= 	new JScrollPane();
        tblFGTS 									= 	new JTable();
        btnVoltar1 									= 	new JButton();
        btnExportar 								= 	new JButton();
        
        
        JPanel Card03Termos			 				= 	new JPanel();
        JScrollPane jScrollPane3 					= 	new JScrollPane();
        jTextPane1	 								= 	new JTextPane();
        JLabel lblTermosDeUso						= 	new JLabel();
        btnVoltar3 									= 	new JButton();
        	
        JPanel Card04Limitacoes 					= 	new JPanel();
        JLabel lblLimitacoes 						= 	new JLabel();
        JScrollPane jScrollPane4 					= 	new JScrollPane();
        jTextPane2 									= 	new JTextPane();
        btnVoltar2 									= 	new JButton();




        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cálculos Rescisórios Simples");
        setName("FramePrincipal"); 
        setPreferredSize(new Dimension(525, 600));
        setResizable(false);
        setSize(new Dimension(525, 600));
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource
        		("/br/edu/tglima/resource/imgs/calc-500.png")));

        jPanel1.setPreferredSize(new Dimension(525, 600));
        jPanel1.setLayout(new CardLayout());

        card01Principal.setPreferredSize(new Dimension(525, 600));

        lblDataEntrada.setText("Data de Entrada:");

        try {
            dataEntradaFmt.setFormatterFactory(new DefaultFormatterFactory
            		(new MaskFormatter("##/##/####")));
            
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        
        dataEntradaFmt.setHorizontalAlignment(SwingConstants.CENTER);
        dataEntradaFmt.setPreferredSize(new Dimension(100, 19));

        lblDataSaida.setText("Data de Saída:");

        try {
            dataSaidaFmt.setFormatterFactory(new DefaultFormatterFactory
            		(new MaskFormatter("##/##/####")));
            
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        
        dataSaidaFmt.setHorizontalAlignment(SwingConstants.CENTER);
        dataSaidaFmt.setPreferredSize(new Dimension(100, 19));

        lblSalario.setText("Salário Bruto:");

        salarioFmt.setHorizontalAlignment(SwingConstants.CENTER);

        lblFeriasVencidas.setText("Possuí Férias Vencidas?");
        lblFeriasVencidas.setEnabled(false);
        
        btGroupFerias.add(jRadioButton1);
        jRadioButton1.setText("Sim");
        jRadioButton1.setEnabled(false);
        

        btGroupFerias.add(jRadioButton2);
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Não");
        jRadioButton2.setEnabled(false);
        
        
        

        lblMotivoSaida.setText("Informe o Motivo da Saída:");

        comboMotivoSaida.setModel(new DefaultComboBoxModel<>(new String[] 
        		{ "Pedido de demissão", "Fim do Contrato de Trabalho", 
        				"Demissão sem justa causa", "Demissão por Justa Causa",
        				"Falecimento" }));

        lblAvisoPrevio.setText("Tipo de Aviso Prévio:");

        comboAvisoPrevio.setModel(new DefaultComboBoxModel<>(new String[] 
        		{ "Trabalhado", "Indenizado pela empresa", 
        				"Descontado do funcionário" }));

        lblSaldoFgts.setText("Conhece o saldo do FGTS?");

        btGroupFGTS.add(jRadioButton3);
        jRadioButton3.setText("Sim");

        btGroupFGTS.add(jRadioButton4);
        jRadioButton4.setSelected(true);
        jRadioButton4.setText("Não");

        lblInformeFgts.setText("Informe o saldo:");
        lblInformeFgts.setEnabled(false);

        saldoFgtsFmt.setHorizontalAlignment(SwingConstants.CENTER);
        saldoFgtsFmt.setEnabled(false);

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
                                        .addComponent(lblSalario)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(salarioFmt, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(card01PrincipalLayout.createSequentialGroup()
                                        .addComponent(lblDataEntrada)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dataEntradaFmt, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblDataSaida)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dataSaidaFmt, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
                            .addGroup(card01PrincipalLayout.createSequentialGroup()
                                .addGroup(card01PrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAvisoPrevio)
                                    .addComponent(lblSaldoFgts))
                                .addGap(23, 23, 23)
                                .addGroup(card01PrincipalLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                    .addGroup(card01PrincipalLayout.createSequentialGroup()
                                        .addComponent(jRadioButton3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton4))
                                    .addComponent(comboAvisoPrevio, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(GroupLayout.Alignment.LEADING, card01PrincipalLayout.createSequentialGroup()
                                .addComponent(lblMotivoSaida)
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
                                .addComponent(saldoFgtsFmt, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
                                .addGap(218, 218, 218)))
                        .addGap(64, 64, 64))
                    .addGroup(card01PrincipalLayout.createSequentialGroup()
                        .addComponent(lblFeriasVencidas)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(card01PrincipalLayout.createSequentialGroup()
                        .addComponent(lblInformeFgts)
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
                    .addComponent(lblDataEntrada)
                    .addComponent(dataEntradaFmt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDataSaida)
                    .addComponent(dataSaidaFmt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(card01PrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalario)
                    .addComponent(salarioFmt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(card01PrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFeriasVencidas)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(39, 39, 39)
                .addGroup(card01PrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMotivoSaida)
                    .addComponent(comboMotivoSaida, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(card01PrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvisoPrevio)
                    .addComponent(comboAvisoPrevio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(card01PrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSaldoFgts)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(39, 39, 39)
                .addGroup(card01PrincipalLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInformeFgts)
                    .addComponent(saldoFgtsFmt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(btnCalcular, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(card01Principal, "card1");

        card02Resultado.setPreferredSize(new Dimension(525, 600));

        lblRescisao.setFont(new Font("Dialog", 1, 36)); 
        lblRescisao.setHorizontalAlignment(SwingConstants.CENTER);
        lblRescisao.setText("Rescisão");
        
        tblRescisao.setAutoResizeMode( JTable.AUTO_RESIZE_OFF);
        tblRescisao.setAutoscrolls(false);
        tblRescisao.setRowHeight(20);
        tblRescisao.setRowSelectionAllowed(false);
        tblRescisao.getTableHeader().setResizingAllowed(false);
        tblRescisao.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblRescisao);
        

        lblFgts.setFont(new Font("Dialog", 1, 36)); 
        lblFgts.setHorizontalAlignment(SwingConstants.CENTER);
        lblFgts.setText("FGTS");
        
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
                        .addComponent(lblRescisao)))
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
                        .addComponent(lblFgts)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        card02ResultadoLayout.setVerticalGroup(
            card02ResultadoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(card02ResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRescisao, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 222, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFgts, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(card02ResultadoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar1)
                    .addComponent(btnExportar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(card02Resultado, "card2");
        Card03Termos.setPreferredSize(new Dimension(525, 600));
        
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
        			("/br/edu/tglima/resource/html/Termos.html"));
			
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
        
        
        
        jScrollPane3.setViewportView(jTextPane1);

        lblTermosDeUso.setFont(new Font("Dialog", 1, 36));
        lblTermosDeUso.setText("Termos de uso");

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
        						.addComponent(lblTermosDeUso)))
        				.addContainerGap(93, Short.MAX_VALUE)));

        Card03TermosLayout
        .setVerticalGroup(Card03TermosLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
        		.addGroup(Card03TermosLayout.createSequentialGroup().addContainerGap().addComponent(lblTermosDeUso)
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
        			("/br/edu/tglima/resource/html/Limitacoes.html"));
        	

		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());

		}
        
        jScrollPane4.setViewportView(jTextPane2);

        btnVoltar2.setText("Voltar");
        btnVoltar2.setMnemonic(KeyEvent.VK_V);

        lblLimitacoes.setFont(new Font("Dialog", 1, 36));
        lblLimitacoes.setText("Limitações");

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
            .addComponent(lblLimitacoes)))
        	.addContainerGap(93, Short.MAX_VALUE))
        	);
                    
                    
                    
                    
        Card04LimitacoesLayout.setVerticalGroup(
            Card04LimitacoesLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(Card04LimitacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLimitacoes)
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
	
	
	
//	------------------------------------------------------------------------ //	
	
	
	
	
}
