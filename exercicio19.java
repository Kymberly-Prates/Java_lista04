package lista04;

import java.util.Scanner;

public class exercicio19 {

	public static void main(String [] arg) {
	Scanner sc =  new Scanner (System.in);
	
	System.out.println("Digite um lado do tri�ngulo");
	float lado1 = sc.nextFloat();
	System.out.println("Digite o segundo lado");
	float lado2 = sc.nextFloat();
	System.out.println("Digite o �ltimo lado");
	float lado3 = sc.nextFloat();
	
	if(lado1> (lado2 + lado3)) {
		System.out.println("N�o � tri�ngulo");
		} else {
			if(lado2 > (lado1 + lado3)) {
				System.out.println("N�o � tri�ngulo");
				} else {
					if(lado3 > (lado2 + lado1)) {
						System.out.println("N�o � tri�ngulo");}
					else {
						System.out.println("Temos um tri�ngulo");
					}
				}
		}
	}

}
