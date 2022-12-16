package lista04;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota:");
		int nota1 = sc.nextInt();
		System.out.println("Digite a segunda nota:");
		int nota2 = sc.nextInt();
		
		float media = (nota1 + nota2) / 2;
		
		if (media>6) {
			System.out.println("Sua média:" + media);
			System.out.println("você foi aprovado(a)");
		} else {
			System.out.println("Sua média:" + media);
			System.out.println("você foi reprovado(a)");
		}
		
	}


}
