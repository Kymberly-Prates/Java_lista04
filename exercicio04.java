package lista04;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float preco = 0;
		
		System.out.println("Quantas maças foram compradas?");
		int macas = sc.nextInt();
		 if (macas>=12) {
			preco = macas;
		} else {
			preco = (float) (macas * 1.30);
		}
		 	System.out.println("O valor da compra é de: " + preco );
	}


}
