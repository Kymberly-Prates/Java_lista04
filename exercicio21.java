package lista04;

import java.util.Scanner;

public class exercicio21 {


	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um n�mero");
		int numero1 = sc.nextInt();
		System.out.println("Digite um n�mero");
		int numero2 = sc.nextInt();
		
		if (numero1 == numero2) {
			System.out.println("Os n�meros s�o iguais");
		} else if (numero1 > numero2) {
			System.out.println("O primeiro n�mero � maior");
		} else {
			System.out.println("O segundo n�mero � maior");
		}
		
	}


}
