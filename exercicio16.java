package lista04;

import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int maior = 0;
		
		System.out.println("Digite um valor");
		int valor1 = sc.nextInt();
		System.out.println("Digite um valor");
		int valor2 = sc.nextInt();
		System.out.println("Digite um valor");
		int valor3 = sc.nextInt();
		
		if (valor1 > valor2) {
			maior = valor1;
		} else {
			maior = valor2;
		}
		if (valor3>maior) {
			System.out.println("O maior valor �: " + valor3);
		} else {
			System.out.println("O maior valor �: " + maior);
		}
	}


}
