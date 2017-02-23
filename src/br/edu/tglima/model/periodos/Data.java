package br.edu.tglima.model.periodos;

import java.time.LocalDate;

public class Data implements IConvert {
	
//	Atributos
	private LocalDate data;
	
//	Método construtor da classe.
	public  Data(){
		this.data = null;
	}
	

//	Métodos Getter e Setter
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public LocalDate convertToDate(String s) {
		
		
		/*
		 * Com a ajuda do replace, removemos qualquer espaço em branco
		 * que o usuário tenha informado no campo de data. 
		 */
		
		s = s.replace(" ", "");
		
		/*
		 * Se o campo estiver correto, ele deve possuir exatos 10 caracteres,
		 * qualquer coisa diferente disto, significa que a data informada é 
		 * inválida.
		 * 
		 */
		
		if (s.length() == 10) {
			
			/*
			 * Com a ajuda de um vetor, quebramos a String em 3 partes.
			 * Depois remontamos ela no formato correto (AAAA-MM-DD),
			 * para em seguida ser convertida no formato LocalDate
			 */
			String[] dataVetor = s.split("/");
			String strData = dataVetor[2] + "-" + dataVetor[1] + "-"+ dataVetor[0];			
			
			try {
				this.data = LocalDate.parse(strData);
			} catch (Exception e) {
				// Implementação de erro
			}
				
			
		} else {
			
//			Implemente erro referente ao tamanho da string

		}
		
		return this.data;
	}
	
	
	
	

}
