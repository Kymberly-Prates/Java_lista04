package lista04;

import java.util.Scanner;

public class exercicio30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o tamanho do primeiro lado do tri�ngulo");
		float lado1 = sc.nextFloat();		
		System.out.println("Digite o tamanho do segundo lado do tri�ngulo");
		float lado2 = sc.nextFloat();		
		System.out.println("Digite o tamanho do terceiro lado do tri�ngulo");
		float lado3 = sc.nextFloat();	
		
		if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado2 + lado1) {
			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("Tri�ngulo equil�tero");
			} else {
				if(lado1 == lado2 || lado2 == 3 || lado3 == lado1) {
					System.out.println("Tri�ngulo is�sceles");
				} else {
					System.out.println("Tri�ngulo escaleno");
				}
			}
		} else {
			System.out.println("Isso n�o � um tri�ngulo");
		}
		
	}


}
