package br.com.cadastrodeanimais;



import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class CadastroDeAnimais extends Animal{
	
	public void CadastrarAnimal() {
		try {
			Scanner Cad = new Scanner(System.in);
			int QtdAnimais = Integer.parseInt(JOptionPane.showInputDialog("Quantos animais você deseja cadastrar? Limitado ao maximo de 9"));
			for(int i = 0; i < QtdAnimais; i++) {
				System.out.println("Digite o Animal que você deseja Cadastrar");
				Animal.add(Cad.nextLine());
				System.out.println("Digite agora a raça");
				raça.add(Cad.nextLine());
				System.out.println("Digite se é Macho ou Fêmea");
				Genero.add(Cad.nextLine());
				System.out.println("Digite a Data de Nascimento do Animal dd/MM/yyyy");
				DatadeNascimento.add(Cad.nextInt(), null);
				System.out.println("Digite agora o Temperamento 1-Dificil, 2- Timido, 3- Ousado, 4- Carente");
				Temperamento.add(Cad.nextInt());
				System.out.println("Digite se é Macho ou Fêmea");
				Porte.add(Cad.nextLine());
				Cad.close();
			}
		}catch(InputMismatchException e) {
			System.out.println("Formato digitado invalido, Por favor digite 1- Dificil, 2- Timido, 3- Ousado, 4- Carente");
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Formato de data digitado invalido por favor coloque no formato dd/MM/yyyy");
		}
	}
	public void AnimaisDisponiveis() {
		for(int i = 0; i <Animal.size(); i++) {
			
		}	
	}
	public void LifeAnimal() {
		
	}
}	
