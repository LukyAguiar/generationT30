package Lista_II;

import java.util.Scanner;

public class T2_Par_Impar {

	public static void main(String[] args) {
		
		Scanner gravar = new Scanner(System.in);
		int num;
		int resto;
		
		System.out.print("Digite um n�mero: ");
		num = gravar.nextInt();
		
		//Fazendo divis�o para saber se � Par ou Impar
		resto = (num % 2);
		
		
		if(num < 0) {
			System.out.println("N�meros negativos n�o Passar�o!! - (Negativo)");
		}
		if(num == 0){
			System.out.println("O N�mero informado � neutro - (Neutro)");
		}
		else if(resto == 0){
			System.out.println("O N�mero informado � par. (Positivo)");
		}
		else {
			System.out.println("O N�mero informado � �mpar. (Positivo)");
		}
		
		
		
		
	}
	
	
}
