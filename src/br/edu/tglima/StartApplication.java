package br.edu.tglima;

import br.edu.tglima.controller.*;
import br.edu.tglima.view.FramePrincipal;

/**
 * @author tglima Thiago Lima de Sousa
 * @version 0.9.0
 * @build 20170328-1900
 */

public class StartApplication {

	public static void main(String[] args) {
				
		FramePrincipal gui = new FramePrincipal();
        new ControllerPrincipal(gui);
        gui.setVisible(true);			
			
	}

}
