package br.com.teste;
import br.com.cadastrodeanimais.*;
import br.com.Adotante.*;
public class teste {
	public static void main(String[] args) {
		CadastroEndereco sdr = new CadastroEndereco();
		sdr.CadastroUsuario();
		System.out.println();
		sdr.Impedimento();
		sdr.Login();
		sdr.CadastroEndereço();
	}
}
