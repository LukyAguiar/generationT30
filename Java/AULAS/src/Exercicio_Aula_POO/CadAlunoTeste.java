package Exercicio_Aula_POO;

public class CadAlunoTeste {
	

	//variaveis 
	//entradas
	//processamentos
	//saidas

	public static void main(String[] args) {
		
		String nome[] = {"Ana Beatriz Yujra Espejo","Ana Carolina Gonzalez de Souza","Ana Paula Souza Dias","Anderson Coelho da Costa","Andrei Felipe Corr�a de Souza","Ariel de Barros Pirangy Soares","Beatriz dos Santos Teixeira","Beatriz Gomes de Abreu","Caio Saldanha Motta","C�ssia de Arruda Nicolau Santos","Emerson da Silva Santana","Enzo Fulaneto","Ester Gomes Neves Nascimento","F�bio Campaner Suzuki","Felipe Matos de Lima","Felipe Souza da Silva","Fl�vio Augusto da Costa","Giovanna Siqueira Paiva dos Penedos","Gustavo Mesquita Ferreira","Henrique Uriel Lopes","Jo�o Pedro Cruz Gomes","Jos� Paulo de Matos Ferreira Neto","Let�cia Porto Martins","Lucas Silva Nunes de Aguiar","Maicon Gomes Cerqueira","Marcos Vinicius Coutinho Rego","Matheus de Araujo Farina","Matheus de Brito Milani","Nat�lia Regina dos Santos Rocha","Pamela Paulino","Renata dos Santos Ferreira","Rodrigo Roseo Lopes da Costa","Sabrina Alves de Paiva","Sergio de Jesus Severo","Stefani Fernanda Pereira Tosi","Talita gleice maria da gloria da Silva Lima","Thiago da Silva Machado","Vin�cios Lisboa da Silva","Vinicius Cardoso Siqueira Francisco"};
		String matricula[] = new String[39];
		int nota[] = new int[39];
		boolean ativo[] = new boolean[39];
		
		System.out.printf("MAT\tSTATUS\tNOTA\tNOME\n");
		
		for (int x=0; x < 39; x++) {
				nota[x] = 0;
				ativo[x] = true;
				matricula[x] = "MAT-0"+(x+1);
				System.out.println(matricula[x]+"\t" + "ATIVO  \t " + nota[x] + "\t" + nome[x]+"");
		}
	}
	
	
}
