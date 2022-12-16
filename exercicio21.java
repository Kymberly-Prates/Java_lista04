package lista04;

import java.util.Scanner;

public class exercicio21 {


	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número");
		int numero1 = sc.nextInt();
		System.out.println("Digite um número");
		int numero2 = sc.nextInt();
		
		if (numero1 == numero2) {
			System.out.println("Os números são iguais");
		} else if (numero1 > numero2) {
			System.out.println("O primeiro número é maior");
		} else {
			System.out.println("O segundo número é maior");
		}
		
	}


}
