package lista04;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um valor");
		int valor = sc.nextInt();
		
		if (valor>0) {
			System.out.println(valor + " � um n�mero positivo");
		} else if (valor<0){
			System.out.println(valor +  " � um n�mero negativo");
		} else {
			System.out.println("O n�mero � 0");
		}
		

	}

}
