package lista04;

import java.util.Scanner;

public class exercicio14 {


	public static void main(String[] args) {
	Scanner sc =  new Scanner (System.in);
	
	System.out.println("Qual � a quantidade atual do estoque?");
	int estoqueAt = sc.nextInt();
	System.out.println("Qual � a quantidade m�nima de estoque?");
	int estoqueMin = sc.nextInt();
	System.out.println("Qual � a quantidade m�xima do estoque?");
	int estoqueMax = sc.nextInt();
	
	float quantMedia = (estoqueMin + estoqueMax) /2;
	
	if (quantMedia <= estoqueAt) {
		System.out.println("N�o efetuar a compra");
	} else {
		System.out.println("Efetuar a compra");
	}
	}


}
