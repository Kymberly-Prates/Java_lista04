package lista04;

import java.util.Scanner;

public class exercicio26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o seu c�digo de acesso: ");
		int codigo = sc.nextInt();
		System.out.println("Digite a sua senha: ");
		int senha = sc.nextInt();
		
		if (codigo != 1234) {
			System.out.println("USU�RIO INV�LIDO");
		} else {
			if (senha != 9999) {
				System.out.println("SENHA INCORRETA");
			} else {
				System.out.println("ACESSO PERMITIDO");
			}
		}

	}

}
