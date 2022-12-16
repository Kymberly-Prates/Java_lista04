package lista04;

import java.util.Scanner;

public class exercicio29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Código de identificação");
		int cod = sc.nextInt();
		System.out.println("Seu ano de nascimento");
		int anoNas = sc.nextInt();
		System.out.println("Anos trabalhados");
		int anosTrab = sc.nextInt();
		
		int idade = 2022 - anoNas;
		
		if(idade>=65 || anosTrab>=30 || idade>=60 && anosTrab>=25) {
			System.out.println("Requer aposentadoria");
		} else {
			System.out.println("Não requer aposentadoria");
		}
		
	}


}
