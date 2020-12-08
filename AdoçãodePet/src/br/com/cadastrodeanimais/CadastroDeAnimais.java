package br.com.cadastrodeanimais;

import java.lang.reflect.Array;

import javax.swing.JOptionPane;

public class CadastroDeAnimais extends Animal{
	
	Array[] Animal = new Array[10];
	public void CadastrarAnimal() {
		
	}
	public void AnimaisDisponiveis() {
		System.out.println(this.NomeAnimal + " " + this.Raça + " " + this.Genero);
	}
}	
