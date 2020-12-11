package br.com.Adotante;

import javax.swing.JOptionPane;

public class CadastroEndereco extends CadastroAdotante {
	
	public void CadastroEndereço() {
		if(this.loguei == true) {
			Rua.set(this.logado,JOptionPane.showInputDialog(Rua));
			Numero.set(this.logado,JOptionPane.showInputDialog(Numero));
			Cidade.set(this.logado,JOptionPane.showInputDialog(Cidade));
			Cep.set(this.logado,JOptionPane.showInputDialog(Cep));
		}
	}
}
