package Exercicio_Aula_POO;

public class Aluno {
	
		//Declarando Atributos
		public String nome;
		public String matricula;
		public boolean status;
		public int nota;
		public int anoNascimento;
		
		//Metodo
		public void mostraIdade() {
			System.out.println(""+(2021-anoNascimento));
		}
		
		public void mostraIdade(int anoAtual) {
			System.out.println("a idade � "+(anoAtual-anoNascimento));
		}
		
		public void mostraIdade(int anoAtual, int anoNascimento) {
			System.out.printf("a idade � "+(anoAtual-this.anoNascimento));
		}
		
}




//Atributos
//sobrecarga - mais do mesmo
//construtores -- 
//encapsulamento - seguran�a - getter and setters
//metodos
//

//polimorfismo
	//heran�a
	//abstra��o
	//delega��o
	//override - annotation