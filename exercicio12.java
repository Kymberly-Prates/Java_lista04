package lista04;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		float acrescimo = 0;
		
		System.out.println("Digite o seu salário fixo");
		float SalarioFixo = sc.nextFloat();
		System.out.println("Digite o valor das vendas efetuadas:");
		float Valor_Vendas= sc.nextFloat();
		
		if (Valor_Vendas<=1500) {
			acrescimo = (Valor_Vendas * 3 / 100);
		} else {
			acrescimo = (Valor_Vendas * 3 / 100) + (5 * (Valor_Vendas - 1500)) / 100;
		}
		float SalarioTotal = SalarioFixo + acrescimo;
		
		System.out.println("O salário total é de " + SalarioTotal + "R$");

	}


}
