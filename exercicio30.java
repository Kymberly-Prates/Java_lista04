package lista04;

import java.util.Scanner;

public class exercicio30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o tamanho do primeiro lado do triângulo");
		float lado1 = sc.nextFloat();		
		System.out.println("Digite o tamanho do segundo lado do triângulo");
		float lado2 = sc.nextFloat();		
		System.out.println("Digite o tamanho do terceiro lado do triângulo");
		float lado3 = sc.nextFloat();	
		
		if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado2 + lado1) {
			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("Triângulo equilátero");
			} else {
				if(lado1 == lado2 || lado2 == 3 || lado3 == lado1) {
					System.out.println("Triângulo isósceles");
				} else {
					System.out.println("Triângulo escaleno");
				}
			}
		} else {
			System.out.println("Isso não é um triângulo");
		}
		
	}


}
