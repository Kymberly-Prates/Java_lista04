package lista04;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("N�mero de sua conta:");
		float conta = sc.nextInt();
		System.out.println("Seu saldo:");
		float saldo = sc.nextInt();
		System.out.println("Seu d�bito:");
		float debito = sc.nextInt();
		System.out.println("Credito:");
		float credito = sc.nextInt();
		
		float Total = saldo - debito + credito;
		
		if (Total>=0) {
			System.out.println("O saldo total � de " + Total);
		} else {
			System.out.println("Aviso: Saldo negativo");
			System.out.println("O saldo total � de: " + Total);
		}
		
	}

}
