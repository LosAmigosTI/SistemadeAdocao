package br.com.Adotante;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CadastroAdotante extends Adotante{
	public void CadastroUsuario() {
		Scanner Cad = new Scanner(System.in);
		System.out.println("Digite o seu nome de usuario");
		Usuario.add(Cad.nextLine());
		System.out.println("Digite a sua senha");
		senhaUsuario.add(Cad.nextLine());
		System.out.println("Digite o seu email");
		email.add(Cad.next());
		Cad.close();
	}
	public void Login() {
		String usuario = JOptionPane.showInputDialog("Digite o usuario");
		String senha = JOptionPane.showInputDialog("Digite a senha");
		for(int i = 0; i< Usuario.size(); i++) {
			if(usuario.equals(Usuario.get(i))) {
				if(senha.equals(senhaUsuario.get(i))) {
					if(Impedimentos.get(i) == false);
					System.out.println("Login realizado com sucesso");
				}
			}else {
				System.out.println("Login não efetivado");
			}
		}
	}
	public void Impedimento() {
		String imp = JOptionPane.showInputDialog("Digite o usuario que vai ficar impedido");
		for(int i = 0; i< Usuario.size(); i++) {
			if(imp.equals(Usuario.get(i))) {
				Impedimentos.add(true);
			}else {
				Impedimentos.add(false);
			}
		}
	}
}
