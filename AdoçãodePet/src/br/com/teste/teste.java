package br.com.teste;
import br.com.cadastrodeanimais.*;
import br.com.Adotante.*;
public class teste {
	public static void main(String[] args) {
		CadastroAdotante sdr = new CadastroAdotante();
		sdr.CadastroUsuario();
		System.out.println();
		sdr.Login();
	}
}
