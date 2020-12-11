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
		Impedimentos.add(false);
		Cad.close();
	}
	public void Login() {
		String usuario = JOptionPane.showInputDialog("Digite o usuario");
		String senha = JOptionPane.showInputDialog("Digite a senha");
		for(int i = 0; i < Usuario.size(); i++) {
			if(usuario.equals(Usuario.get(i))) {
				if(senha.equals(senhaUsuario.get(i))) {
					if(false ==Impedimentos.get(i)) {
					System.out.println("Login realizado com sucesso");	
					}
				}else {
					System.out.println("Login não realizado(Senha ou Usuario Invalidos/Usuario Bloqueado)");
				}
			}
		}
	}
	public void Impedimento() {
		String imp = JOptionPane.showInputDialog("Digite o usuario que vai ficar impedido");
		for(int i = 0; i< Usuario.size(); i++) {
			if(imp.equals(Usuario.get(i))) {
				Impedimentos.set(i, true);
				MotivodoImpedimento.set(i,JOptionPane.showInputDialog("Motivo do Impedimento"));
				System.out.println("Usuario foi impedido de entrar no sistema");
			}
		}
	}
}
