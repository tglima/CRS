package br.edu.tglima;

import br.edu.tglima.view.FramePrincipal;
import br.edu.tglima.controller.*;

/**
 * @author tglima Thiago Lima de Sousa
 */

public class StartApplication {

	public static void main(String[] args) {
				
        FramePrincipal framePrincipal = new FramePrincipal();
        new ControllerPrincipal(framePrincipal);
        framePrincipal.setVisible(true);			
			
	}

}
