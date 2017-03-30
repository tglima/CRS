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

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;

/*Last edition: 2017-03-29	*/

@SuppressWarnings("serial")
public class DialogSobre extends JDialog {

/*	Lista de atributos 														*/	
	
	private final JPanel contentPanel = new JPanel();
	private final JPanel buttonPane = new JPanel();
	private final JLabel lblImage = new JLabel("");
	private final JButton btnFechar = new JButton("Fechar");
	private final JTextPane jTextPane3 = new JTextPane();
	private final GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
	private final GroupLayout gl_buttonPane = new GroupLayout(buttonPane);
	private final HTMLEditorKit htmlEditorKit = new HTMLEditorKit();
	private final StyleSheet css = new StyleSheet();
	
//	------------------------------------------------------------------------ //

	
/*	Getters e Setters da Classe												*/	
	
	public JButton getBtnFechar() {
		return btnFechar;
	}
	
	public JTextPane getjTextPane3(){
		return jTextPane3;
	}

//	------------------------------------------------------------------------ //	
	
	
/*	Método construtor da classe												*/
	
	public DialogSobre() {
		setTitle("Sobre");
		setResizable(false);
		setBackground(UIManager.getColor("Panel.background"));
		setBounds(100, 100, 450, 350);
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource
        		("/br/edu/tglima/resource/imgs/calc-500.png")));

		lblImage.setIcon(new ImageIcon(DialogSobre.class.getResource("/br/edu/tglima/resource/imgs/calc-64.png")));
		lblImage.setVerticalAlignment(SwingConstants.TOP);
		btnFechar.setMnemonic(KeyEvent.VK_F); 

    	css.addRule("h2 { margin: 0px, 0px, 0px, 0px; margin-top: 25px; padding: 0px; font-size: 1.40em;}");
    	css.addRule("body {font-family: sans serif; font-size: 1em; line-height: 1.5em;}");
    	css.addRule("strong {font-weight: bold;}");
    	css.addRule("ul {list-style-type: circle; padding: 25px;}");
    	css.addRule("li {list-style-type: circle; padding-bottom: 10px;}");
    	css.addRule("a { color:#0000FF; text-decoration: underline;}");
    	
    	htmlEditorKit.setStyleSheet(css);
    	
		jTextPane3.setBackground(UIManager.getColor("Button.background"));
		jTextPane3.setEditable(false);
		jTextPane3.setBackground(UIManager.getColor("Panel.background"));
        jTextPane3.setFont(Font.decode("UTF-8") );
        jTextPane3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 11));
        jTextPane3.setContentType("text/html; charset=UTF-8");
    	jTextPane3.setEditorKit(htmlEditorKit);
    	
        try {

        	jTextPane3.setPage(DialogSobre.class.getResource
        			("/br/edu/tglima/resource/html/About.html"));
			
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
    	
    	
		buttonPane.setLayout(gl_buttonPane);
    	
    	
		
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addComponent(lblImage)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(jTextPane3, GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblImage)
						.addComponent(jTextPane3, GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
					.addContainerGap())
		);
		contentPanel.setLayout(gl_contentPanel);
		{

			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{

				getRootPane().setDefaultButton(btnFechar);
			}

			gl_buttonPane.setHorizontalGroup(
				gl_buttonPane.createParallelGroup(Alignment.LEADING)
					.addGroup(Alignment.TRAILING, gl_buttonPane.createSequentialGroup()
						.addContainerGap(356, Short.MAX_VALUE)
						.addComponent(btnFechar)
						.addContainerGap())
			);
			gl_buttonPane.setVerticalGroup(
				gl_buttonPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_buttonPane.createSequentialGroup()
						.addComponent(btnFechar)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
			);

		}
	}

//	------------------------------------------------------------------------ //
}
