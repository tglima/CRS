package br.edu.tglima.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import java.awt.Font;
import java.awt.event.KeyEvent;

import javax.swing.UIManager;

//Last edition. 2017-03-24


@SuppressWarnings("serial")
public class DialogSobre extends JDialog {
	

	private final JPanel contentPanel = new JPanel();
	private JLabel lblLink;
	private JButton btnFechar = new JButton("Fechar");
	
	private final String msgSobre = "CRT - CÁLCULOS DE RESCISÃO DE TRABALHO\n\n"
			+ "Versão 0.8.1 - Build 20170324-1900\n"
			+ "Copyright (c) 2017 Thiago Lima de Sousa\n\n"
			+ "Biblioteca Apache POI. Copyright 2003-2016\n"
			+ "The Apache Software Foundation\n"
			+ "(Licenciada sob APACHE LICENSE, VERSION 2.0\n\n"
			+ "Imagens de Sebastian Rubio. (Licenciadas sob\n"
			+ "GPLv3).\n\n"
			+ "Este programa é um Software Livre: você pode\n"
			+ "redistribuí-lo e/ou modificá-lo sob os termos da\n"
			+ "Licença Pública Geral GNU publicada pela Free\n"
			+ "Software Foundation (GPLv3).\n\n"
			+ "Código fonte disponível no link abaixo:";
	
	
	public JButton getBtnFechar() {
		return btnFechar;
	}
	
	public JLabel getLblLink(){
		return lblLink;
	}

	public DialogSobre() {
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Sobre");
		setResizable(false);
		setBounds(100, 100, 400, 400);
		
		btnFechar.setMnemonic(KeyEvent.VK_F);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			lblLink = new JLabel("<html> <u>http://www.github.com/tglima/crtproject</u>");
			lblLink.setFont(new Font("Dialog", Font.PLAIN, 11));
			lblLink.setForeground(Color.blue);
			lblLink.setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		
		JLabel lblImage = new JLabel("");
		lblImage.setIcon(new ImageIcon(DialogSobre.class.getResource("/br/edu/tglima/view/calc-icon-64-64.png")));
		
		JEditorPane dtrpnCrtClculos = new JEditorPane();
		dtrpnCrtClculos.setText(msgSobre);
		dtrpnCrtClculos.setBackground(UIManager.getColor("ComboBox.background"));
		dtrpnCrtClculos.setFont(new Font("Dialog", Font.PLAIN, 11));
		dtrpnCrtClculos.setEditable(false);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblImage)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblLink)
						.addComponent(dtrpnCrtClculos))
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblImage)
						.addComponent(dtrpnCrtClculos, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblLink)
					.addGap(30))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				buttonPane.add(btnFechar);
				getRootPane().setDefaultButton(btnFechar);
			}
		}
	}
}
