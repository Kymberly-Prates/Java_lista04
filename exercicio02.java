package lista04;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		int valor = sc.nextInt();
		
		if (valor>10) {
			System.out.println("� MAIOR QUE 10!");
		} else {
			System.out.println("� MENOR QUE 10!");
		}
	}


}
