package Programas;

import Classes.Pessoa;

public class ListaBalada {

	public static void main(String[] args) {
		
		Pessoa primeiroFila = new Pessoa("Lucas");
	
		primeiroFila.nome = "Lucas";
		primeiroFila.anoNascimento = 2001; 
		
		System.out.println("Quem � fulano? fulano � " + primeiroFila.nome);
		System.out.println("Qual � a idade do "+ primeiroFila.nome + ",ele tem ");
		System.out.printf(primeiroFila.nome + " Sua idade � ", primeiroFila.calcIdade(2021,primeiroFila.anoNascimento));
	}
}
