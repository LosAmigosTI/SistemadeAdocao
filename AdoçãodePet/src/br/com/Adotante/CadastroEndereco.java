package br.com.Adotante;

import javax.swing.JOptionPane;

public class CadastroEndereco extends CadastroAdotante {
	
	public void CadastroEndere�o() {
		if(this.loguei == true) {
			try {
			Rua.add(this.logado,JOptionPane.showInputDialog("Qual o nome da sua Rua?"));
			Numero.add(this.logado,JOptionPane.showInputDialog("Qual o nome da sua Numero?"));
			Cidade.add(this.logado,JOptionPane.showInputDialog("Qual o nome da sua Cidade?"));
			Cep.add(this.logado,JOptionPane.showInputDialog("Qual o nome da sua Cep?"));
			}catch(IndexOutOfBoundsException e) {
				System.out.println("N�o realizado digite novamente");
			}
		System.out.println(
				 "Rua: " +Rua.get(logado)
				+ "\nNumero: " +Numero.get(logado)
				+ "\nCidade: " +Cidade.get(logado)
				+ "\nCEP" +Cep.get(logado));
	
		}
	}
}
