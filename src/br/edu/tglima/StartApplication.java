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
package br.edu.tglima;

import br.edu.tglima.controller.*;
import br.edu.tglima.view.DialogSobre;
import br.edu.tglima.view.FramePrincipal;

/**
 * @author Thiago Lima de Sousa
 */

public class StartApplication {

	public static void main(String[] args) {
				
		FramePrincipal gui = new FramePrincipal();
		DialogSobre dialog = new DialogSobre();
		
		new ControllerPrincipal(gui, dialog);
        gui.setVisible(true);
        
			
	}

}
