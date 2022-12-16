package lista04;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Que horas a partida iniciou?");
		int inicio = sc.nextInt();
		System.out.println("Que horas a partida acabou?");
		int fim = sc.nextInt();
		
		int duracao = fim - inicio;
		
		if (duracao<=0) {
			duracao += 24;
			System.out.println("A duração da partida foi de " + duracao + " horas");
		} else {
			System.out.println("A duração da partida foi de " + duracao + " horas");
		}
	}


}
