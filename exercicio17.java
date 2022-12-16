package lista04;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int primeiro = 0;
	int segundo = 0;
	int terceiro = 0;
	
	System.out.println("Digite um valor:");
	int Valor1 = sc.nextInt();
	System.out.println("Digite um valor:");
	int Valor2 = sc.nextInt();
	System.out.println("Digite um valor:");
	int Valor3 = sc.nextInt();
	
	if(Valor1<Valor2) {
		primeiro = Valor1;
		segundo = Valor2;
	} else {
		primeiro = Valor2;
		segundo = Valor1;
	} if (Valor3<primeiro) {
		terceiro = segundo;
		segundo = primeiro;
		primeiro = Valor3;
	} else {
		if(Valor3>segundo) {
			terceiro = Valor3;
		} else {
			terceiro = segundo;
			segundo = Valor3;
		}
	}
	System.out.println("A oredem dos valores é " + primeiro + "," + segundo + " e " + terceiro );

	}


}
