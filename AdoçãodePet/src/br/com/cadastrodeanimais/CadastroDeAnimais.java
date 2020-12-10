package br.com.cadastrodeanimais;





import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class CadastroDeAnimais extends Animal{
	
	public void CadastrarAnimal() {
		try {
			Scanner Cad = new Scanner(System.in);
			int QtdAnimais = Integer.parseInt(JOptionPane.showInputDialog("Quantos animais você deseja cadastrar?"));
			for(int i = 0; i < QtdAnimais; i++) {
				System.out.println("Digite o Animal que você deseja Cadastrar");
				Animal.add(Cad.nextLine());
				System.out.println("Digite agora a raça");
				raça.add(Cad.nextLine());
				System.out.println("Digite se é Macho ou Fêmea");
				Genero.add(Cad.nextLine());
				System.out.println("Digite o Porte do Cachorro");
				Porte.add(Cad.nextLine());
				System.out.println("Digite agora o Temperamento 1-Dificil, 2- Timido, 3- Ousado, 4- Carente");
				int Temperamento = Cad.nextInt();
				switch(Temperamento) {
				case 1:
					Temperamental.add("Dificil");
					break;
				case 2:
					Temperamental.add("Timido");
					break;
				case 3:
					Temperamental.add("Ousado");
					break;
				case 4:
					Temperamental.add("Dificil");
					break;
				default:
					System.out.println("Valor digitado invalido");
				}
				Cad.close();
			}
		}catch(InputMismatchException e) {
			System.out.println("Formato digitado invalido, Por favor digite 1- Dificil, 2- Timido, 3- Ousado, 4- Carente");
		}
	}
	public void AnimaisDisponiveis() {
		for(int i = 0; i < Animal.size(); i++) {
			System.out.println("Animal :" + Animal.get(i)+ "\nRaça:"+ raça.get(i) + "\nTemperamento" + Temperamental.get(i));
		}
	}
}	
