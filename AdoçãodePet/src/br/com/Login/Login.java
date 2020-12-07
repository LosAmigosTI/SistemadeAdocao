package br.com.Login;

import javax.swing.JOptionPane;

public class Login {
	
	String id;
	String senha;
	
	public void CadastrarLogin() {
		this.id = JOptionPane.showInputDialog("Qual id você quer utilizar?");
		this.senha = JOptionPane.showInputDialog("Digite a sua senha para cadastro?");
	}
	
	public void FazerLogin() {
		String id = JOptionPane.showInputDialog("Digite o ID cadastrado?");
		String senha = JOptionPane.showInputDialog("Digite a sua senha?");
		if(this.id.equals(id)) {
			if(this.senha.equals(senha)) {
				System.out.println("Login Efetuado com sucesso");
			}
		}else {
			System.out.println("Login não realizado");
		}
	}
}
