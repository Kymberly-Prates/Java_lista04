package lista04;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int valor = sc.nextInt();
		
		if (valor>0) {
			System.out.println("Este valor é positivo");
		} else {
			System.out.println("Este valor é negativo");
		}
		
	}

}
