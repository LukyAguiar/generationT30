package Lista_III;

import java.util.Scanner;

public class T5_TotalDeNumeros {
		
	public static void main(String[] args) {

	    int numero, soma=0;
	    Scanner leia = new Scanner(System.in);

	    do{
	      System.out.printf("Digite um n�mero: ");
	      numero = leia.nextInt();

	      soma = soma + numero;
	    }while(numero!=0);

	    System.out.printf("\nO total dos n�meros digitados foi: %d", soma);
	  }
}
