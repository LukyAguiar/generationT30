package Lista_II;

import java.util.Scanner;

public class T1_ComparaMaior {

	public static void main(String[] args){
		
		Scanner gravar = new Scanner(System.in);
		int n1,n2,n3;
		
		System.out.print("Digite um valor para N1: ");
		n1 = gravar.nextInt();
		System.out.print("Digite um valor para N2: ");
		n2 = gravar.nextInt();
		System.out.print("Digite um valor para N3: ");
		n3 = gravar.nextInt();
		
		
		if( n1 > n2 && n1 > n3) {
			System.out.printf("O maior n�mero entre eles � N1 - Sendo os n�meros: |N1:%d|N2:%d|N3:%d|",n1,n2,n3);
		}
		else if(n2 > n1 && n2 > n3) {
			System.out.printf("O maior n�mero entre eles � N2 - Sendo os n�meros: |N1:%d|N2:%d|N3:%d|",n1,n2,n3);
		}
		else if(n3 > n1 && n3 > n2){
			System.out.printf("O maior n�mero entre eles � N3 - Sendo os n�meros: |N1:%d|N2:%d|N3:%d|",n1,n2,n3);
		}
		else if(n1 < 0 && n2 < 0 && n3 < 0){
			System.out.printf("Todos os n�meros s�o NEGATIVOS - Sendo os n�meros: N1:%d|N2:%d|N3:%d|",n1,n2,n3);
		}
		else {
			System.out.printf("O Numeros s�o iguais - Sendo os n�meros: |N1:%d|N2:%d|N3:%d|",n1,n2,n3);
		}
	}
}
