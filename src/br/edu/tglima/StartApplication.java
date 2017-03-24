package br.edu.tglima;

import br.edu.tglima.controller.*;
import br.edu.tglima.view.FramePrincipal;

/**
 * @author tglima Thiago Lima de Sousa
 * @version 0.8.1
 * @build 20170324-1900
 */

public class StartApplication {

	public static void main(String[] args) {
				
		FramePrincipal gui = new FramePrincipal();
        new ControllerPrincipal(gui);
        gui.setVisible(true);			
			
	}

}
