package lista04;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seu ano de nascimento");
		int anoNas = sc.nextInt();
		System.out.println("Ano Atual");
		int anoAt = sc.nextInt();
		
		int idade = anoAt - anoNas;
		
		if (idade>16) {
			System.out.println("Você pode votar");
		} else {
			System.out.println("Você não pode votar");
		}
		
		

	}


}
